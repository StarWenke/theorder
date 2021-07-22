BEGIN;
ALTER TABLE `order` ADD `c_id` INT(11);
ALTER TABLE `order` ADD `u_id` INT(11);
COMMIT; 