from itertools import product
def solution(word):
    answer = []
    vowels = ['A', 'E', 'I', 'O', 'U']
    for i in range(1,6):
        for per in product(vowels,repeat = i):
            answer.append(''.join(per))
    answer.sort()
    return answer.index(word)+1