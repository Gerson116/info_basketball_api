CREATE USER basket IDENTIFIED BY Mkgchalona123__O;

GRANT CONNECT, RESOURCE TO basket;

ALTER USER basket QUOTA UNLIMITED ON users; -- O el tablespace que utilices