// [문제 링크]: https://www.acmicpc.net/problem/1057

R, N, M = list(map(int, input().split()))
N -= 1
M -= 1
result = 0
while (N != M) :
    N //= 2
    M //= 2
    result += 1
​
print(result)