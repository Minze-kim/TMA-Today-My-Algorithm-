T = int(input())

for tc in range(1, T+1):
    N, M = map(int, input().split())
    li = [list(map(int, input().split())) for _ in range(2)]
    max_value = float("-inf")
    # 짧은 배열, 긴 배열
    # (긴 배열 원소 수)-(짧은 배열 원소 수) +1
    # 만큼 이동하면서 최대값 나오면 갱신
    if N > M:
        short, long = li[1], li[0]
    else:
        short, long = li[0], li[1]
    for i in range(len(long) - len(short) + 1):
        tmp = 0
        for j in range(len(short)):
            tmp += short[j] * long[j + i]
        if tmp > max_value:
            max_value = tmp
    print("#{} {}".format(tc, max_value))