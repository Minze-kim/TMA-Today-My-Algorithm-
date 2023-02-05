T = int(input())

for tc in range(1, T+1):
    N = input()
    for i in range(1, 10+1):
        if N[:i] == N[i:i*2]:
            print('#{} {}'.format(tc,i))
            break