-- select
-- ANSII
select * from Customers
select ContactName, CompanyName,City from Customers

select ContactName Adi, CompanyName SirketAdi,City Sehir from Customers

select * from customers where City = 'Berlin'

--case insensitive
sElEcT * from Products where categoryId=1
sElEcT * from Products where categoryId=1 or categoryId=3
sElEcT * from Products where categoryId=1 and UnitPrice>=10

select * from Products order by ProductName
select * from Products order by CategoryID
select * from Products order by CategoryID,ProductName
select * from Products order by UnitPrice
select * from Products order by UnitPrice asc --ascending
select * from Products order by UnitPrice desc --descending
select * from Products where categoryId = 1 order by UnitPrice desc

select count(*) from Products
select count(*) Adet from Products where CategoryID = 2
select categoryID from products group by CategoryID
select categoryID,count(*) from products group by CategoryID

select categoryID,count(*) from Products group by CategoryID having count(*)<10
select categoryID,count(*) from Products where UnitPrice > 20 group by CategoryID having count(*)<10

select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID
select Products.ProductID, Product.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10
--DTO Data Transformation Object

select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID

select * from Products p left join [Order Details] od 
on p.ProductID = od.ProductID

select * from Customers c inner join Orders o 
on c.CustomerID = o.CustomerID
select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null

select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID
