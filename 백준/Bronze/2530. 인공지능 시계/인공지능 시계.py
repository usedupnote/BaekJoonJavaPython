# 현재 시각 [A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)]
A, B, C = input().split()

# 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위
D = int(input())

A = int(A)
B = int(B)
C = int(C)

C += D

B += C // 60
C = C % 60
A += B // 60
B = B % 60
A = A % 24

print(A, B, C)
      
"""
출력 첫째 줄에 종료되는 시각의 시, 분, 초을 공백을 사이에 두고 출력한다. 
(디지털 시계는 23시 59분 59초에서 1초가 지나면 0시 0분 0초가 된다.)
"""