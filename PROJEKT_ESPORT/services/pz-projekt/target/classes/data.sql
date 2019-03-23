INSERT INTO `place` (`ID`,`NAME`,`ADDRESS`) VALUES (1,'testowe','Testowa 1, Warszawa');


INSERT INTO `event_type_dict` (`ID`,`EVENT_NAME`) VALUES (1,'Kill');
INSERT INTO `event_type_dict` (`ID`,`EVENT_NAME`) VALUES (2,'Head shot');
INSERT INTO `event_type_dict` (`ID`,`EVENT_NAME`) VALUES (3,'Death');

INSERT INTO  `league` (`ID`, `LEAGUE_NAME`) VALUES (1, 'CSGO');


INSERT INTO `match` (`ID`,`MATCH_DATE`,`TEAM_HOME_ID`,`TEAM_AWAY_ID`,`PLACE_ID`,`IS_FINISHED`, `LEAGUE_ID`, `ROUND_NUMBER`) VALUES (1,'2019-01-04',1,2,1,1,1,1);
INSERT INTO `match` (`ID`,`MATCH_DATE`,`TEAM_HOME_ID`,`TEAM_AWAY_ID`,`PLACE_ID`,`IS_FINISHED`, `LEAGUE_ID`, `ROUND_NUMBER`) VALUES (2,'2019-01-04',1,2,1,0,1,1);
INSERT INTO `match` (`ID`,`MATCH_DATE`,`TEAM_HOME_ID`,`TEAM_AWAY_ID`,`PLACE_ID`,`IS_FINISHED`, `LEAGUE_ID`, `ROUND_NUMBER`) VALUES (3,'2019-01-04',2,1,1,0,1,1);
INSERT INTO `match` (`ID`,`MATCH_DATE`,`TEAM_HOME_ID`,`TEAM_AWAY_ID`,`PLACE_ID`,`IS_FINISHED`, `LEAGUE_ID`, `ROUND_NUMBER`) VALUES (4,'2019-01-04',2,1,1,0,1,1);

INSERT INTO `team` (`ID`,`NAME`,`FAUNDATION_DATE`,`CAPITAIN_ID`, LEAGUE_ID) VALUES (1,'Virtus.pro','2010-11-12',NULL, 1);
INSERT INTO `team` (`ID`,`NAME`,`FAUNDATION_DATE`,`CAPITAIN_ID`, LEAGUE_ID) VALUES (2,'Team Kinguin','2010-01-01',NULL, 1);
INSERT INTO `team` (`ID`,`NAME`,`FAUNDATION_DATE`,`CAPITAIN_ID`, LEAGUE_ID) VALUES (3,'SK Gaming','2010-11-12',NULL, 2);
INSERT INTO `team` (`ID`,`NAME`,`FAUNDATION_DATE`,`CAPITAIN_ID`, LEAGUE_ID) VALUES (4,'FIFA Pro Gaming','2010-01-01',NULL, 2);


INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (1,'MICHU',1,'POL','1985-07-28');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (2,'snatchie',1,'POL','1989-09-26');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (3,'byali',1,'POL','1984-09-29');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (4,'Snax',1,'POL','1990-11-26');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (5,'TOAO',1,'POL','1985-09-10');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (6,'pasha',1,'POL','1988-12-19');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (7,'NEO',1,'POL','1990-12-22');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (10,'mouz',2,'POL','1988-10-15');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (11,'rallen',2,'POL','1986-09-30');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (12,'TaZ',2,'POL','1988-08-31');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (13,'MINISE',2,'POL','1989-03-16');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (14,'Dycha',2,'POL','1993-08-15');

INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (15,'Spank',3,'FRA','1988-12-19');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (16,'hero',3,'GER','1990-12-22');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (17,'styla',3,'GER','1988-10-15');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (18,'Era',3,'GER','1986-09-30');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (19,'Zerecero',4,'ITA','1988-08-31');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (20,'deto',4,'GER','1989-03-16');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (21,'Pio',4,'POL','1993-08-15');
INSERT INTO `player` (`ID`,`NAME`,`TEAM_ID`,`NATIONALITY`,`DATE_OF_BIRTH`) VALUES (22,'Quinzas',4,'POR','1993-08-15');


INSERT INTO  `news` (`id`, `title`, `body`, `date`) VALUES ('1', 'Zwycięstwo Virtus.pro ', 'informacje...', '2019-03-23 00:00:00');
INSERT INTO  `news` (`id`, `title`, `body`, `date`) VALUES ('2', 'Porażka Team Kinguin w meczu na szczycie ', 'więcej informacji..', '2019-03-22 00:00:00');
INSERT INTO  `news` (`id`, `title`, `body`, `date`) VALUES ('3', 'Swietny mecz SK Gaming ', 'więcej informacji..', '2019-03-22 00:00:00');
INSERT INTO  `news` (`id`, `title`, `body`, `date`) VALUES ('4', 'Mistrzostwa świata FIFA WAT', 'więcej informacji..', '2019-03-22 00:00:00');
