def primenumbers():
    j = 2
    chk = 1
    f = open("primes.txt", "w")
    primes = []
    notprimes = []
    ask = input("how many primes? ")
    while len(primes) < int(ask):
        k = 2
        while not(k==j) and not(j%k==0):
            k = k + 1
        if k == j:
            primes.append(j)
            f.write(str(j)+"\n")
        else:
            notprimes.append(j)
        if len(primes) >= 1000*chk:
            chk = chk + 1
            print("There have been " + str(len(primes)) + " primes counted so far")
        j = j + 1
    print("Primes written to file 'primes.txt', " + str(len(primes)) + " written")
    f.close
    return(" ")
