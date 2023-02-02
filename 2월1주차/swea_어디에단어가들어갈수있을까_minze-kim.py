T = int(input())

for tc in range(1,T+1):
    N, K = map(int,input().split())
    arr = []
    for i in range(N):
        arr.append(list(map(int, input().split())))
    result = 0
    cnt = 0
    # 가로 기준
    for x in range(N):
        for y in range(N):
            if arr[x][y] == 1:
                cnt += 1
            if arr[x][y] == 0 or y == N-1:
                if cnt == K:
                    result += 1
                cnt = 0
    # 세로 기준
    for y in range(N):
        for x in range(N):
            if arr[x][y] == 1:
                cnt += 1
            if arr[x][y] == 0 or x == N-1 :
                if cnt == K:
                    result += 1
                cnt = 0

    print('#{} {}'.format(tc, result))