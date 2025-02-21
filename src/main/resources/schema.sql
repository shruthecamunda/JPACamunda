drop table leave_request;
drop table leave_type;

select * from leave_request;
select * from leave_type;


INSERT INTO leave_type (is_active, type) VALUES
(true, 'Sick Leave'),
(true, 'Casual Leave'),
(true, 'Paid Leave'),
(true, 'Maternity Leave'),
(true, 'Paternity Leave');

INSERT INTO leave_request (employee_name, start_date, end_date, reason, leave_type_id) VALUES
('John Doe', '2024-02-01', '2024-02-02', 'Fever and Cold', 1),
('Alice Smith', '2024-02-10', '2024-02-12', 'Family Function', 2),
('Michael Johnson', '2024-03-05', '2024-03-08', 'Personal Work', 3),
('Sarah Brown', '2024-04-15', '2024-04-30', 'Maternity Leave', 4),
('David Wilson', '2024-05-20', '2024-05-25', 'Vacation', 3),
('Emma Davis', '2024-06-10', '2024-06-15', 'Health Issues', 1),
('Robert Lee', '2024-07-01', '2024-07-03', 'Casual Leave', 2),
('Sophia Martin', '2024-08-05', '2024-08-20', 'Childbirth', 4),
('James Anderson', '2024-09-10', '2024-09-12', 'Attending Marriage', 2),
('Olivia Taylor', '2024-10-01', '2024-10-10', 'Family Vacation', 3);

