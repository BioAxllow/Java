$(function () {

    var skip = 0;
    var rowsPerPage = 5;

    $('#prev').click(function () {
        skip -= rowsPerPage;
        if (skip < 0) skip = 0;
        printRows(skip, rowsPerPage);
    });

    $('#next').click(function () {
        skip += rowsPerPage;
        printRows(skip, rowsPerPage);
    });

    printRows(skip, rowsPerPage);

});


function printRows(skip, rowsPerPage) {

    var token = window.localStorage.token;

    $.ajax('api/product/list', {
        method: 'GET',
        headers: {
            Authorization: "Bearer " + token
        },
        dataType: 'json',
        data: {
            size: rowsPerPage + 1,
            skip: skip
        }

    }).done(function (data) {

        if (skip === 0) $('#prev').addClass('disabled');
        else $('#prev').removeClass('disabled');

        if (data.length <= rowsPerPage) $('#next').addClass('disabled');
        else $('#next').removeClass('disabled');

        var html = '';
        for (i = 0; i < Math.min(data.length, rowsPerPage); i++) {
            html +=
                '<tr>' +
                '<td><img src="' + data[i].image + '" width="100"></td>' +
                '<td>' + data[i].name + '</td>' +
                '<td>' + data[i].description + '</td>' +
                '<td class="text-right price-' + data[i].id + '">' + data[i].price + '</td>' +
                '<td> <button onclick="+getProduct(' + data[i].id + ')" class="add-cart">Add</button> </td>' + <!-- onclick-->
                '</tr>'

        }
        $('#products').html(html);

    }).fail(function (jqXHR) {
        if (jqXHR.status === 401) {
            $('#login').click(function () {
                login($('#username').val(), $('#password').val(), skip, rowsPerPage);
            });
            $('#loginModal').modal('show')
        } else {
            alert("Other error");
        }

    });
}


function login(username, password, skip, rowsPerPage) {
    //$('#login').off();
    $.ajax('api/auth/login', {
        method: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify({
            username: username,
            password: password
        })
    }).done(function (data) {
        $('#loginModal').modal('hide');
        window.localStorage.token = data.token;
        printRows(skip, rowsPerPage);

    }).fail(function () {
        alert('Login fail')
    });
}

function getProduct(clickId) {

    var check = 0;

    $('#table-cart .id-class').each(function (index, value) {
        if (clickId === parseInt(value.innerText, 10)) {
            check++;
        }
    });

    if (check !== 0) {
        updateCart(clickId);
        updateCountTotalProductsPlus(clickId);
        updateTotalSumPlus(clickId);

    } else {
        addToCart(clickId);
        updateCountTotalProductsPlus(clickId);
        updateTotalSumPlus(clickId);
    }
}

function addToCart(id) {
    $.ajax('api/product/' + id, {
        method: 'GET',
        dataType: 'json',
        data: {
            id: id,
            quantity: null
        }
    }).done(function (data) {
        data.quantity = parseInt(1 + "", 10);

        var row = $("<tr class='rowForCount'>");

        row.append($('<td><img src="' + data.image + '" width="40" alt="product"></td>'))
            .append($('<td>' + data.name + '</td>'))
            .append($('<td>' + data.description + '</td>'))
            .append($('<td class=" price-' + data.id + '">' + data.price + '</td>'))
            .append($('<td class="quantity-' + data.id + '">' + data.quantity + '</td>'))
            .append($('<td><button onclick="deleteProduct(' + data.id + ')" class="delete-product">Remove</button></td>'))
            .append($('<td class="hide-id id-class ' + "id-class-" + data.id + '">' + data.id + '</td>'));

        $("#productsToCart").append(row);


    }).fail(function () {
        alert("didnt get the product")
    })
}

function updateCart(id) {
    var newQuantity = parseInt($(".quantity-" + id).html(), 10) + 1;
    $(".quantity-" + id).html(newQuantity);
}

function deleteProduct(id) {
    updateCountTotalProductsMinus(id);
    updateTotalSumMinus(id);
    $('.id-class-' + id).closest('tr').remove();
}

var count = $("#count-total-products");

function updateCountTotalProductsMinus(id) {
    var currentTotalCount = parseInt(count.text(), 10);
    var deletedCount = parseInt($(".quantity-" + id).text(), 10);
    var currentCountNew = currentTotalCount - deletedCount;
    count.text(currentCountNew);
}

function updateCountTotalProductsPlus() {
    var currentCountNew = parseInt(count.text(), 10) + 1;
    count.text(currentCountNew);
}

document.querySelector('#count-sum')

function updateTotalSumPlus(id) {

    var toAdd = parseInt($(".price-" + id).text(),10);
    var sum = parseInt($("#count-sum").text(), 10) + toAdd;
    $("#count-sum").text(sum);
}

function updateTotalSumMinus(id) {
    var toSubtract = parseInt($(".quantity-" + id).text(), 10) * parseInt($(".price-" + id).text(), 10);
    var sum = parseInt($("#count-sum").text(), 10) - toSubtract;
    $("#count-sum").text(sum);
}


