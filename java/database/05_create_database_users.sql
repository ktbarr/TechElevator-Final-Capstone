-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER restaurant_tinder_owner
WITH PASSWORD 'finalcapstone';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO restaurant_tinder_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO restaurant_tinder_owner;

CREATE USER restaurant_tinder_appuser
WITH PASSWORD 'finalcapstone';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO restaurant_tinder_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO restaurant_tinder_appuser;
