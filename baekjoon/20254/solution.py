// [문제 링크]: https://www.acmicpc.net/problem/20254

import sys
input = sys.stdin.readline
​
num = list(map(int, input().split()))
​
print((56 * num[0]) + (24 * num[1]) + (14 * num[2]) + (6 * num[3]))