### 요구사항
정수 계산기, Calc.run("3 * 1") == 3 형태
+ 10  + 10 = 20
+ 10 - 10 = 0
+ 10 * 10 = 100
+ 10 / 10 = 1

### 고급 요구사항
Calc.run("3 * 1 + (1 - (4 * 1 - (1 - 1)))") == 0 형태
+ 테스트 케이스 : 괄호
+ 테스트 케이스 : + 와 * 같이 있는 경우
+ 테스트 케이스 : + 와 / 같이 있는 경우
+ 테스트 케이스 : 괄호가 여러겹 있는 경우