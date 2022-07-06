Practice5
===

문제 설명
---

영토에 대한 지도 정보가 row x col grid 맵 형태로 다음과 같이 주어졌다.

이 때, grid[i][j] 가 1이 면 땅 영역을 의미하고  
grid[i][j] 가 0 이면 물 영역을 의미한다.

![img.png](../imgs/img1.png)


이와 같이 영토에 대한 지도 정보가 주어졌을 때 땅의 둘레를 구하는 프로그램을 작성하세요.

- grid 한 cell 의 변의 길이는 1 이다.
- 지도에는 하나의 독립된 영토만 있다. (분리된 땅 없음)
- 땅 내부에 물이 존재하지 않는다.


입출력 예시
---

|입력|출력|
|---|---|
|{{1}}|4|
|{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}|16|
