sum = 0
def isMultiple(x):
    for k in range(1001):
        if k%3==0 or k%5==0:
            x += k
    return x
print(isMultiple(sum))
