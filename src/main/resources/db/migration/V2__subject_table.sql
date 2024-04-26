CREATE TABLE `subject` (
	`id` SERIAL,
	`school_cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`subject_name` VARCHAR(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	PRIMARY KEY (`id`,`school_cd`,`cd`)
) ENGINE=InnoDB;