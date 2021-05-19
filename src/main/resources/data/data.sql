INSERT INTO user (id, account_name, user_name) VALUES
(1, 'agramar', '아그라마'),
(2, 'user1', '유저1'),
(3, 'user2', '유저2');

INSERT INTO movie (id, title, plot, release_date, reg_user_id, reg_date, mod_user_id, mod_date) VALUES
(1, '어벤져스: 엔드게임', '인피니티 워 이후 절반만 살아남은 지구 마지막 희망이 된 어벤져스 먼저 떠난 그들을 위해 모든 것을 걸었다! 위대한 어벤져스 운명을 바꿀 최후의 전쟁이 펼쳐진다!', '2019-04-19', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(2, '쇼생크 탈출', '두려움은 너를 죄수로 가두고 희망은 너를 자유롭게 하리라', '1995-01-28', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(3, '매트릭스', '서기 2199년, 인공지능 AI에 의해 인류가 재배되고 있다!', '1999-05-15', 2, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(4, '타이타닉', '단 하나의 운명, 단 한 번의 사랑, 영원으로 기억될 세기의 러브 스토리', '1998-02-20', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(5, '레옹', '나도 행복해 지고 싶어. 잠도 자고, 뿌리도 내릴 꺼야.', '1995-02-18', 1, CURRENT_TIMESTAMP(), 3, CURRENT_TIMESTAMP()),
(6, '대부', '절대 거절못할 제안을 하지', '1977-05-25', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(7, '매드맥스: 분노의 도로', '세상이 멸망하면서 누가 미친 건지 알 수 없어졌다. 나인지 이 세상인지..', '2015-05-14', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(8, '다크 나이트', '어둠의 기사 배트맨 VS 절대 악 조커 운명을 건 최후의 결전이 시작된다!', '2008-08-06', 2, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(9, '원스 어폰 어 타임 인 아메리카', '1921년, 좀도둑질을 일삼던 누들스는 맥스를 비롯한 친구들과 함께 밀수품 운반 일을 하며 돈을 벌어 들인다. 누들스 무리에 위협을 느낀 벅시는 누들스의 친구를 죽이고, 이에 분노한 누들스는 벅시를 살해한 후 감옥에 들어가게 된다. 1932년, 출소한 누들스는 어린 시절 첫사랑 데보라와 밀주 사업으로 크게 성공한 맥스를 다시 만나지만, 금주법 철폐로 그들의 밀주 사업도 위기를 맞는다. 맥스는 누들스에게 연방준비은행을 털 것을 제안하지만 누들스는 거절한다. 1968년, 베일리 재단 파티에 초대 받은 누들스는 재단 창립 기념 사진 속에서 데보라를 발견하고 그녀를 찾아가 자신을 초대한 베일리 장관에 대해 묻지만 그를 찾지 말라며 경고한다. 그녀의 만류에도 누들스는 마침내 의문의 베일리 장관과 마주하게 되는데...', '1984-12-01', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(10, '아바타', '지구 에너지 고갈 문제를 해결하기 위해 판도라 행성으로 향한 인류는 원주민 ‘나비족’과 대립하게 된다. 이 과정에서, 전직 해병대원 제이크 설리(샘 워싱턴)가 ‘아바타’ 프로그램을 통해 ‘나비족’의 중심부에 투입되는데…', '2009-12-17', 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP());

INSERT INTO review (id, title, content, movie_id, reg_user_id, reg_date, mod_user_id, mod_date) VALUES
(1, 'GOOD MOVIE😊', 'GOOD MOVIE!!!', 1, 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(2, 'GOOD MOVIE😊', 'GOOD MOVIE!!!', 3, 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(3, 'GOOD MOVIE😊', 'GOOD MOVIE!!!', 2, 1, CURRENT_TIMESTAMP(), 1, CURRENT_TIMESTAMP()),
(4, 'GOOD MOVIE😊', 'GOOD MOVIE!!!', 5, 3, CURRENT_TIMESTAMP(), 3, CURRENT_TIMESTAMP()),
(5, 'GOOD MOVIE😊', 'GOOD MOVIE!!!', 9, 2, CURRENT_TIMESTAMP(), 2, CURRENT_TIMESTAMP());