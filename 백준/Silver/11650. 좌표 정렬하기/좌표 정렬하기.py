import sys

N = int(sys.stdin.readline())

num = []

for i in range(N):
   num.append(list(map(int, sys.stdin.readline().split())))
num.sort(key=lambda x:(x[0],x[1]))

for i in range(N) :
    print(*num[i])