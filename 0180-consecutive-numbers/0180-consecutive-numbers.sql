SELECT DISTINCT a.num AS ConsecutiveNums FROM Logs a, Logs b, Logs c
WHERE a.id + 1 = b.id AND b.id + 1 = c.id AND a.num = b.num AND b.num = c.num;