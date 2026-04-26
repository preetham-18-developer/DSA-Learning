select q.query_name , round(AVG(rating * 1.0 /position), 2) as quality ,
round(AVG( rating < 3) * 100 , 2) as poor_query_percentage from Queries q
group by q.query_name 
