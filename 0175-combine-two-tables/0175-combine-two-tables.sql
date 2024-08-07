# Write your MySQL query statement below
select Person.firstname,Person.lastname,Address.city,Address.state
from person 
left join address
on
Person.personID=Address.personID;