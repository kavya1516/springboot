-- liquibase formatted sql
-- changeset  kavya:3
-- Alter the customer table, add a new column 'email'
ALTER TABLE customer ADD COLUMN email VARCHAR(100);

