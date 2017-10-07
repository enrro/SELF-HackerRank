#!/bin/python3
# https://www.hackerrank.com/challenges/strange-code/problem

import sys

t = int(input())
total = 0
n = 3
while total < t:
    total += n
    n *= 2
n /= 2
print (int(total - n + (n-t)+1))



'''
even cleaner solution
 rem = 3
while t > rem:
    t = t-rem
    rem *= 2

print(rem-t+1) '''