-- ======================================
-- LeetCode Problem: duplicate emails
-- Language: SQL (generic)
-- Link: https://leetcode.com/problems/duplicate-emails/
-- Synced by: LinkCode
-- Date: 10/5/2026, 1:09:37 AM
-- ======================================


# Write your MySQL query statement below
select email from Person
group by email
having COUNT(email) > 1;