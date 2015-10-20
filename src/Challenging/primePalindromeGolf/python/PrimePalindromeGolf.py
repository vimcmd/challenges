def golf(n):
    j=n+1
    while not all(j%i for i in range(2,j)) or str(j)!=str(j)[::-1]:j+=1
    else:return j