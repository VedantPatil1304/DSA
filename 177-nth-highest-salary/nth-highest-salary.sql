-- CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
-- BEGIN
--   RETURN (
--       # Write your MySQL query statement below.
--       SELECT DISTINCT salary FROM Employee 
--       ORDER BY salary DESC LIMIT 1 OFFSET N-1
        
--   );
-- END

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE res INT;
  DECLARE off INT;

  -- guard for invalid N
  IF N <= 0 THEN
    RETURN NULL;
  END IF;

  SET off = N - 1;

  SELECT DISTINCT salary
  INTO res
  FROM Employee
  ORDER BY salary DESC
  LIMIT off, 1;    -- use variable 'off' as the offset

  RETURN res;
END
