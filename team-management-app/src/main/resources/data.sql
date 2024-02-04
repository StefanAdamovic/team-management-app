-- user_role
INSERT INTO `user_role` (`description`, `name`)
VALUES ('Administrator role', 'ADMIN'),
       ('Manager role', 'MANAGER'),
       ('Team Lead role', 'TEAM_LEAD'),
       ('Normal User role', 'NORMAL_USER');

-- user
INSERT INTO `user` (`role_id`, `email`, `first_name`, `last_name`, `password`)
VALUES (1, 'admin@example.com', 'Admin', 'User', 'adminpassword'),
       (3, 'teamlead@example.com', 'Team', 'Lead', 'teamleadpassword'),
       (4, 'user@example.com', 'Normal', 'User', 'userpassword');

-- team
INSERT INTO `team` (`team_lead_id`, `name`, `description`)
VALUES (2, 'Development Team', 'Responsible for software development');

-- team_team_members
INSERT INTO `team_team_members` (`team_impl_id`, `team_members_id`)
VALUES (1, 3);

-- project
INSERT INTO `project` (`completed_at`, `created_at`, `name`, `description`, `project_status`)
VALUES ('2024-02-04 23:34:26', '2024-02-04 23:34:26', 'Sample Project', 'This is a sample project', 'IN_PROGRESS');


-- project_teams
INSERT INTO `project_teams` (`project_impl_id`, `teams_id`)
VALUES (1, 1);

-- task
INSERT INTO `task` (`is_late`, `completed_at`, `created_at`, `due_date`, `project_id`, `name`, `description`,
                    `task_priority`, `task_status`)
VALUES (0, '2024-02-04 23:34:26', '2024-02-04 23:34:26', '2024-02-28 23:59:59', 1, 'Sample Task',
        'This is a sample task', 'HIGH', 'IN_PROGRESS');


-- comment
INSERT INTO `comment` (`created_at`, `user_id`, `content`)
VALUES ('2024-02-04 23:34:26', 3, 'This is a sample comment');


-- task_comments
INSERT INTO `task_comments` (`comments_id`, `task_impl_id`)
VALUES (1, 1);

-- document
INSERT INTO `document` (`uploaded_at`, `user_id`, `file_type`, `file_content`)
VALUES ('2024-02-04 23:34:26', 3, 'PDF', NULL);

-- task_documents
INSERT INTO `task_documents` (`documents_id`, `task_impl_id`)
VALUES (1, 1);

-- notification
INSERT INTO `notification` (`created_at`, `user_id`, `content`, `notification_status`)
VALUES ('2024-02-04 23:34:26', 3, 'You have a notification', 'NOT_READ');

-- preference
INSERT INTO `preference` (`app_notification`, `email_notification`, `user_id`, `language`, `theme`)
VALUES (1, 1, 3, 'ENGLISH', 'DARK');

-- project_comments
INSERT INTO `project_comments` (`comments_id`, `project_impl_id`)
VALUES (1, 1);

-- project_documents
INSERT INTO `project_documents` (`documents_id`, `project_impl_id`)
VALUES (1, 1);

-- project_tasks
INSERT INTO `project_tasks` (`project_impl_id`, `tasks_id`)
VALUES (1, 1);

-- project_teams
INSERT INTO `project_teams` (`project_impl_id`, `teams_id`)
VALUES (1, 1);
