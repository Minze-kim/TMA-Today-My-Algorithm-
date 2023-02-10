T = int(input())
for tc in range(1, T+1):
    n = int(input())
    s = set()
    cnt = 1
    while True:
        for k in list(str(n)):
            s.add(k)
        if len(s) == 10:
            break
        n //= cnt
        cnt += 1
        n *= cnt

    print("#{} {}".format(tc, n))