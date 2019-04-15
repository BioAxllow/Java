<!doctype html>
<html lang="en" class="no-js">
<head>
    <title>Parduotuvė</title>

    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
    <%--<link rel="stylesheet" type="text/css" href="reset.css">--%>
    <link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>

<div class="shop-wrapper">
    <button type="button" class="btn btn-cart" data-toggle="modal" data-target="#myModal">Open Cart: &nbsp <span class="float-right" id="count-total-products">0</span></button>
</div>

<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <%--<button type="button" class="close" data-dismiss="modal">&times;</button>--%>
                <h4 class="modal-title">Cart</h4>
                <h4 id="count-sum">0</h4>
            </div>
            <div class="modal-body">


                <table class="table" id="table-cart">

                    <tbody id="productsToCart">
                        <%--<tr>--%>
                            <%--<td></td>--%>
                            <%--<td></td>--%>
                            <%--<td></td>--%>
                            <%--<td></td>--%>
                            <%--<td></td>--%>
                        <%--</tr>--%>
                    </tbody>

                </table>


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="submit" class="btn btn-default" data-dismiss="modal">Checkout</button>
            </div>
        </div>

    </div>
</div>

<%--//=================================================--%>

<div class="container ">
    <%--<nav class="nav">--%>
    <%--<a class="nav-link active" href="#">Active</a>--%>
    <%--<a class="nav-link" href="#">Link</a>--%>
    <%--<a class="nav-link" href="#">Link</a>--%>
    <%--<a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>--%>
    <%--</nav>--%>

    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item" id="prev">
                <a class="page-link" href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <li class="page-item" id="next">
                <a class="page-link" href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>

    <table class="table">
        <thead>
        <tr>
            <th></th>
            <th>Pavadinimas</th>
            <th>Aprašymas</th>
            <th class="text-right">Kaina</th>
            <th class="add-button-th"></th>
        </tr>
        </thead>

        <tbody id="products">
        </tbody>

    </table>
</div>


<%--//=================================================--%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script src="main.js"></script>
</body>
</html>