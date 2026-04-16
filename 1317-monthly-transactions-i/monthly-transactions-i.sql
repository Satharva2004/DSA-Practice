SELECT 
    DATE_FORMAT(trans_date, '%Y-%m') AS month,
    country,
    COUNT(amount) AS trans_count,
    (SELECT COUNT(t2.state)
     FROM Transactions t2
     WHERE t2.state = 'approved'
       AND (t2.country = t1.country OR (t2.country IS NULL AND t1.country IS NULL))
       AND DATE_FORMAT(t2.trans_date, '%Y-%m') = DATE_FORMAT(t1.trans_date, '%Y-%m')
    ) AS approved_count,
    SUM(amount) AS trans_total_amount,
    (SELECT coalesce(SUM(t2.amount),0)
     FROM Transactions t2
     WHERE t2.state = 'approved'
       AND (t2.country = t1.country OR (t2.country IS NULL AND t1.country IS NULL))
       AND DATE_FORMAT(t2.trans_date, '%Y-%m') = DATE_FORMAT(t1.trans_date, '%Y-%m')
    ) AS approved_total_amount
FROM Transactions t1
GROUP BY month, country;
