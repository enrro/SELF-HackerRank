SELECT customerNumber
FROM Orders NATURAL JOIN
	(select customerNumber FROM
		(select customerNumber, COUNT(orderNumber) as orderQuantity
		FROM Orders GROUP BY customerNumber ORDER BY orderQuantity DESC) WHERE ROWNUM = 1)
        group by customerNumber;