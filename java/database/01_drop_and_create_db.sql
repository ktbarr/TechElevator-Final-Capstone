-- **************************************************************
-- This script destroys the database and associated users
-- **************************************************************

-- The following line terminates any active connections to the database so that it can be destroyed
SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'restaurant_tinder';

DROP DATABASE restaurant_tinder;

DROP USER restaurant_tinder_owner;
DROP USER restaurant_tinder_appuser;

-- Re-Create the database
CREATE DATABASE restaurant_tinder;