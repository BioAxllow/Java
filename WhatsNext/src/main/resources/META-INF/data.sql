INSERT INTO clients (name, city, discount, post) VALUES('Google', 'Los Angeles', 25, 22);
INSERT INTO clients (name, city, discount, post) VALUES('Microsoft', 'Washington', 10, 44);
INSERT INTO clients (name, city, discount, post) VALUES('Uber', 'Los Angeles', 5, 44);
INSERT INTO clients (name, city, discount, post) VALUES('NetFlix', 'Los Angeles', 9, 0);

INSERT INTO products(name, price, description, image) VALUES('Win 1.0', 999.99, 'MS Windows 1.0', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/9a62633f-3757.windows-1_0-logo.png');
INSERT INTO products(name, price, description, image) VALUES('Win 2.0', 199.99, 'MS Windows 2.0', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/9a62633f-3757.windows-1_0-logo.png');
INSERT INTO products(name, price, description, image) VALUES('Win 3.0', 99.99, 'MS Windows 3.0', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/015bb007-windows_3.0.png');
INSERT INTO products(name, price, description, image) VALUES('Win 3.11', 99.99, 'MS Windows 3.11', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/e83a4107-windows_3.0__3.1x_logo.png');
INSERT INTO products(name, price, description, image) VALUES('Win 95', 95.99, 'MS Windows 95', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/9aa75ae0-windows_95_logo_with_shadow.png');
INSERT INTO products(name, price, description, image) VALUES('Win 98', 98.99, 'MS Windows 98', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/9ec7e15c-windows_98_logo.png');
INSERT INTO products(name, price, description, image) VALUES('Win NT', 299.99, 'MS Windows NT', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/39d3b7d3-microsoft_windows_logo_from_1992_to_2000.png');
INSERT INTO products(name, price, description, image) VALUES('Win 2K', 98.99, 'MS Windows 2000', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/4bc5ae44-windows_2000_stacked.png');
INSERT INTO products(name, price, description, image) VALUES('Win ME', 39.99, 'MS Windows ME', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/83ba1bca-windows_me_stacked.jpg');
INSERT INTO products(name, price, description, image) VALUES('Win XP', 29.99, 'MS Windows XP', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/c1e704c3-windows_xp_print.png');
INSERT INTO products(name, price, description, image) VALUES('Win Vista', 1.99, 'MS Windows Vista', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/360fcaeb-windows_vista_stacked.jpg');
INSERT INTO products(name, price, description, image) VALUES('Win 7', 25.99, 'MS Windows 7', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/6c4cb1d1-windows_7_stacked.jpg');
INSERT INTO products(name, price, description, image) VALUES('Win 8', 0.99, 'MS Windows 8', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/50023f95-windows_8_logo.png');
INSERT INTO products(name, price, description, image) VALUES('Win 10', 9.99, 'MS Windows 10', 'https://storage.googleapis.com/webdesignledger.pub.network/WDL/1d007a97-windows_10_logo.png');

-- --
-- -- INSERT INTO products(name, price, description, image) VALUES('Windows 3.11', 10.99, 'bla ab ab bing', 'https://c1.staticflickr.com/3/2365/2185918681_38197eedd8_z.jpg?zz=1');
-- -- INSERT INTO products(name, price, description, image) VALUES('Windows XP', 20.99, 'cha cha smile', 'https://i.kym-cdn.com/photos/images/original/001/364/889/794.png');
-- -- INSERT INTO products(name, price, description, image) VALUES('Windows 10', 30.99, 'ogohoho', 'https://images.idgesg.net/images/article/2017/10/windows-10-logo-100739284-large.jpg');
-- -- INSERT INTO products(name, price, description, image) VALUES('Windows 8.1', 50, 'pure awesomness', 'https://www.hdwallpaper.nu/wp-content/uploads/2015/01/Windows-8.1-Wallpapers-5.jpg');
-- -- INSERT INTO products(name, price, description, image) VALUES('Windows Vista', 1, 'Lay me some eggs', 'http://46c4ts1tskv22sdav81j9c69-wpengine.netdna-ssl.com/wp-content/uploads/sites/2/2012/02/6874.5_5F00_01C91EBC.png' );
-- -- INSERT INTO products(name, price, description, image) VALUES('Windows 7.0', 48, 'fk it, it was good while it lasted', 'https://cdn1.itpro.co.uk/sites/itpro/files/styles/article_main_wide_image/public/images/dir_155/it_photo_77552.jpg?itok=EKDFYHXt');
--
INSERT INTO invoices(date, number, sum, client_id) VALUES('2018-09-10', 'INV 01', 1111, 1);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 1, 1111, 1000);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 4, 1144, 1001);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 2, 1122, 1002);
--
INSERT INTO invoices(date, number, sum, client_id) VALUES('2000-01-01', 'INV 02', 2222, 1);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 2, 2222, 2000);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 5, 2255, 2001);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 3, 2233, 2002);
--
INSERT INTO invoices(date, number, sum, client_id) VALUES('2018-09-26', 'INV 03', 3333, 2);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 3, 3333, 3000);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 6, 3366, 3001);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 4, 3344, 3002);
--
INSERT INTO invoices(date, number, sum, client_id) VALUES('2018-09-26', 'INV 04', 4444, 2);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 3, 4433, 4000);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 1, 4411, 4001);
INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 5, 4455, 4002);

-- INSERT INTO clients(name, city, post, discount) VALUES('Microsoft', 'Washington', 'WS 123', 10);
-- INSERT INTO clients(name, city, post, discount) VALUES('Google', 'Los Angeles', 'LA 200', 25);
-- INSERT INTO clients(name, city, post, discount) VALUES('Uber', 'Washington', 'LA 230', 0);
-- INSERT INTO clients(name, city, post, discount) VALUES('Netflix', 'Los Angeles', 'LA 220', 0);
--

--
-- INSERT INTO invoices(date, number, sum, client_id) VALUES('2018-01-15', 'INV 02', 1990, 1);
-- INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(2, 3, 4433, 4000);
-- INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 1, 99.99, 10);
-- INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 2, 9.99, 100);
-- --
-- INSERT INTO invoices(date, number, sum, client_id) VALUES('2018-01-16', 'INV 000128', 1990, 1);
--  INSERT INTO invoices(date, number, sum, client_id) VALUES('2018-09-26', 'INV 03', 3333, 2);
-- INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 1, 99.99, 10);
-- INSERT INTO inv_lines(invoice_id, product_id, price, quantity) VALUES(1, 2, 9.99, 100);
-- INSERT INTO users(username, secret, role) VALUES ('vardas@firma.lt', '$2y$12$DWh1PyJsP6JzFzP0VDrPcOzOFHiI260u.2Zx5ksbFpQ/KW4t1xDKK', 'Admin');

-- insert into carts (sum) values (1);
--
-- insert into cart_lines (cart_id, product_id, qty) values (1, 1, 1);
-- insert into cart_lines (cart_id, product_id, qty) values (1, 2, 1);