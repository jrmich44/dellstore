-- Revert dellstore:schema from pg

BEGIN;

-- XXX Add DDLs here.
DROP SCHEMA tutorial;
COMMIT;
