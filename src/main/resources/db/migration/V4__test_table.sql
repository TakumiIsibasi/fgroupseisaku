CREATE TABLE `test` (
	`id` SERIAL NOT NULL,
	`student_cd` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`subject_cd` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`school_cd` CHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`no` INTEGER(10) NOT NULL,
	`point` INTEGER(10) DEFAULT NULL,
	`class_num` VARCHAR(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	PRIMARY KEY (`id`,`student_cd`,`subject_cd`,`school_cd`,`no`)
) ENGINE=InnoDB;