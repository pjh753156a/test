-- 흉부외과 또는 일반외과 의사 목록 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/132203

SELECT
    DR_NAME,
    DR_ID,
    MCDP_CD,
    LEFT(HIRE_YMD, 10) AS HIRE_YMD
FROM   
    DOCTOR
WHERE
    MCDP_CD = 'CS' OR MCDP_CD = 'GS'
    # MCDP_CD IN('CS', 'GS')
ORDER BY
    HIRE_YMD DESC, DR_NAME ASC;



-- 과일로 만든 아이스크림 고르기
-- https://school.programmers.co.kr/learn/courses/30/lessons/133025

SELECT FLAVOR
FROM FIRST_HALF
WHERE TOTAL_ORDER > 3000
AND FLAVOR IN (
            SELECT 
                FLAVOR
            FROM
                ICECREAM_INFO
            WHERE
                INGREDIENT_TYPE = 'fruit_based'
        )
ORDER BY TOTAL_ORDER DESC;



-- 조건에 맞는 회원수 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131535

SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE JOINED LIKE '2021%'
AND AGE BETWEEN 20 AND 29;



-- 최댓값 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59415

SELECT MAX(DATETIME) AS 시간 FROM ANIMAL_INS;



-- 강원도에 위치한 생산공장 목록 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131112
SELECT 
    FACTORY_ID,
    FACTORY_NAME,
    ADDRESS
FROM 
    FOOD_FACTORY
WHERE 
    ADDRESS LIKE '강원도%';



-- 조건에 맞는 도서 리스트 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/144853
SELECT BOOK_ID, LEFT(PUBLISHED_DATE, 10) AS PUBLISHED_DATE
FROM BOOK
WHERE PUBLISHED_DATE LIKE '2021%'
AND CATEGORY = '인문'
ORDER BY PUBLISHED_DATE ASC;
