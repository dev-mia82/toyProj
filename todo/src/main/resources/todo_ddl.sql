CREATE TABLE `TODO` (
	`todo_seq`	VARCHAR(255)	NOT NULL,
	`todo_day_seq`	VARCHAR(255)	NOT NULL,
	`content`	VARCHAR(255)	NULL,
	`completed_yn`	VARCHAR(255)	NULL	DEFAULT 'N',
	`del_yn`	VARCHAR(255)	NULL	DEFAULT 'N',
	`created_at`	TIMESTAMP	NULL,
	`created_by`	VARCHAR(100)	NULL,
	`updated_at`	TIMESTAMP	NULL,
	`updated_by`	VARCHAR(100)	NULL
);

CREATE TABLE `TODO_DAY` (
	`todo_day_seq`	VARCHAR(255)	NOT NULL,
	`user_seq`	VARCHAR(255)	NOT NULL,
	`todo_date`	VARCHAR(255)	NULL,
	`created_at`	TIMESTAMP	NULL,
	`created_by`	VARCHAR(100)	NULL,
	`updated_at`	TIMESTAMP	NULL,
	`updated_by`	VARCHAR(100)	NULL
);

CREATE TABLE `USER` (
	`user_seq`	VARCHAR(255)	NOT NULL,
	`id`	VARCHAR(50)	NOT NULL,
	`password`	VARCHAR(255)	NOT NULL,
	`name`	VARCHAR(100)	NOT NULL,
	`email`	VARCHAR(100)	NULL,
	`status`	CHAR	NULL	DEFAULT ACTIVE Y, N,
	`created_at`	TIMESTAMP	NULL,
	`created_by`	VARCHAR(100)	NULL,
	`updated_at`	TIMESTAMP	NULL,
	`updated_by`	VARCHAR(100)	NULL
);

ALTER TABLE `TODO` ADD CONSTRAINT `PK_TODO` PRIMARY KEY (
	`todo_seq`
);

ALTER TABLE `TODO_DAY` ADD CONSTRAINT `PK_TODO_DAY` PRIMARY KEY (
	`todo_day_seq`
);

ALTER TABLE `USER` ADD CONSTRAINT `PK_USER` PRIMARY KEY (
	`user_seq`
);

