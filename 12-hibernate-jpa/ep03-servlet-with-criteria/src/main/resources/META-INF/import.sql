insert into account_tbl(loginId,password,role)values('admin','admin',1);
insert into account_tbl(loginId,password,role)values('member','member',2);
insert into account_tbl(loginId,password,role)values('andrew','ad123',2);

insert into address_tbl(address,township,city) values('No.D-36,Between 27×28th Sts,Between 84×85th Sts','Chan Aye Thar Zan','Mandalay');
insert into address_tbl(address,township,city) values('No.3, 56th Street Quarter (7)','Hlaing','Yangon');
insert into address_tbl(address,township,city) values('19st,Between 80x81 sts','Aungmyaytharzan','Mandalay');
insert into address_tbl(address,township,city) values('Between 35x36 sts,Between 84x85 sts','Maharaungmyay','Mandalay');
insert into address_tbl(address,township,city) values('41st,Between 75x76 sts ','Maharaungmyay','Mandalay');

insert into customer_tbl (name,address_id,phone,email) values ('mahar swe',1,'02-57494','maharswe@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('Andrew',2,'02-522494','andrewnyar@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('Sophia',2,'02-7694','sophia@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('William',2,'01-234343','William@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('John',2,'01-993423333','John@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('Arnel',2,'02-3453453','Arnel@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('Upul Sampah',3,'02-645323','UpuSampahanlin@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('banyar',4,'02-828342','banyar@gmail.com');
insert into customer_tbl (name,address_id,phone,email) values ('san lin',5,'02-22333345','sanlinanlin@gmail.com');

insert into category_tbl(name)values('T-Shirt');
insert into category_tbl(name)values('Trouser');
insert into category_tbl(name)values('Wallet');

insert into product_tbl(name,price,category_id)values('Hugo',55000.00,1);
insert into product_tbl(name,price,category_id)values('Boss',45000.00,1);
insert into product_tbl(name,price,category_id)values('Polo',80000.00,1);
insert into product_tbl(name,price,category_id)values('Boss',30000.00,3);
insert into product_tbl(name,price,category_id)values('Arrows',45000.00,1);
insert into product_tbl(name,price,category_id)values('Adidas',40000.00,1);
insert into product_tbl(name,price,category_id)values('Adidas',40000.00,2);
insert into product_tbl(name,price,category_id)values('Tommy',65000.00,2);
insert into product_tbl(name,price,category_id)values('Wanglar',85000.00,2);
insert into product_tbl(name,price,category_id)values('Arrows',20000.00,3);

insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,1,105000,105000,'240910','10:30:20');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,2,115000,115000,'240910','11:20:11');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,3,40000,40000,'240919','09:11:11');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,1,40000,40000,'241001','03:10:20');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,4,65000,65000,'241002','12:23:00');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,5,85000,85000,'241003','02:11:22');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,3,100000,100000,'241004','09:20:20');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,6,80000,80000,'241010','10:24:22');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,7,115000,115000,'241017','09:03:00');
insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,8,55000,55000,'241017','11:30:20');
insert into voucher_tbl(account_id,customer_id,sub_total,total)values(2,9,45000,45000);


insert into voucher_detail_tbl(product_id,voucher_id)values(9,1);
insert into voucher_detail_tbl(product_id,voucher_id)values(10,1);
insert into voucher_detail_tbl(product_id,voucher_id)values(5,2);
insert into voucher_detail_tbl(product_id,voucher_id)values(7,2);
insert into voucher_detail_tbl(product_id,voucher_id)values(4,2);
insert into voucher_detail_tbl(product_id,voucher_id)values(7,3);
insert into voucher_detail_tbl(product_id,voucher_id)values(6,4);
insert into voucher_detail_tbl(product_id,voucher_id)values(8,5);
insert into voucher_detail_tbl(product_id,voucher_id)values(9,6);
insert into voucher_detail_tbl(product_id,voucher_id)values(2,7);
insert into voucher_detail_tbl(product_id,voucher_id)values(3,7);
insert into voucher_detail_tbl(product_id,voucher_id)values(6,8);
insert into voucher_detail_tbl(product_id,voucher_id)values(4,9);
insert into voucher_detail_tbl(product_id,voucher_id,qty)values(9,9,2);
insert into voucher_detail_tbl(product_id,voucher_id,qty)values(1,10,3);
insert into voucher_detail_tbl(product_id,voucher_id,qty)values(2,11,4);
