CREATE TABLE `teacher` (
	`tid` SERIAL,
	`id` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`password` VARCHAR(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
	`teacher_name` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
	`school_cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;