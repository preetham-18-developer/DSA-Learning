select 
round(

    count(distinct a.player_id) / 
    (select COUNT(distinct player_id) from Activity)

, 2) as fraction

from Activity a
join Activity b

on a.player_id = b.player_id

where DATEDIFF(a.event_date , b.event_date) = 1

and (b.player_id , b.event_date) in (

    select 
    player_id ,
    min(event_date)

    from Activity
    group by player_id
);