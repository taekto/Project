drop database if exists ssafit_exercise;

create database ssafit_exercise;

use ssafit_exercise;

create table video (
	video_id int NOT NULL auto_increment primary key,
    youtubeid varchar(40) not null,
    title varchar(100) not null,
    part varchar(40) not null,
    channel_Name varchar(40) not null,
    url varchar(100) not null
)engine=InnoDB;

insert into video (youtubeid, title, part, channel_Name, url)
values
("gMaB-fG4u4g", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "전신", "ThankyouBUBU", "https://www.youtube.com/embed/gMaB-fG4u4g"),
("swRNeYw1JkY", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", "전신", "ThankyouBUBU", "https://www.youtube.com/embed/swRNeYw1JkY"),
("54tTYO-vU2E", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", "상체", "ThankyouBUBU", "https://www.youtube.com/embed/54tTYO-vU2E"),
("QqqZH3j_vH0", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]", "상체", "ThankyouBUBU", "https://www.youtube.com/embed/QqqZH3j_vH0"),
("tzN6ypk6Sps", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]", "하체", "김강민", "https://www.youtube.com/embed/tzN6ypk6Sps"),
("u5OgcZdNbMo", "저는 하체 식주의자 입니다", "하체", "GYM종국", "https://www.youtube.com/embed/u5OgcZdNbMo"),
("PjGcOP-TQPE", "11자복근 복부 최고의 운동 [복근 핵매운맛]", "복부", "ThankyouBUBU", "https://www.youtube.com/embed/PjGcOP-TQPE"),
("7TLk7pscICk", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "복부", "SomiFit", "https://www.youtube.com/embed/7TLk7pscICk");

CREATE TABLE users (
    user_id int NOT NULL auto_increment primary key,
    user_Name varchar(40) NOT NULL,
    user_Password varchar(40) NOT NULL
);

insert into users  values("0","ssafy","1234");

DROP TABLe if exists review;

CREATE TABLE review (
    review_id int NOT NULL auto_increment primary key,
    video_id int not null,
    writer VARCHAR(20) NOT NULL,
    title VARCHAR(50) NOT NULL,
    content TEXT,
    view_cnt INT DEFAULT 0,
    reg_date TIMESTAMP DEFAULT now()
);

insert into review
values (video_id, writer, title, content,view_cnt,reg_date)
("0", "gMaB-fG4u4g", "야호", "기두", "ce12", "0"),
("0", "gMaB-fG4u4g", "야호", "기두", "ce12", "0"),
("0", "gMaB-fG4u4g", "야호", "기두", "ce12", "0");

select * from review;
SELECT * FROM users;
SELECT * FROM video