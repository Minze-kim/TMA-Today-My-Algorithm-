T = int(input())

for tc in range(1,T+1):
    N = int(input())
    arr = list(map(int, input().split()))
    total_profit = 0
    top_price = arr[N-1] #마지막날의 가격으로 최고가를 초기화
    #뒤에서부터 탐색
    for day in range(N-1,-1,-1):
        if arr[day]  < top_price :
            total_profit += top_price - arr[day]
        else:
            top_price = arr[day]

    print('#{} {}'.format(tc,total_profit))
