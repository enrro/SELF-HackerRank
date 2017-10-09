#https://www.hackerrank.com/challenges/find-the-median/problem

import sys
import statistics

txt=input()
numbers=[int(x) for x in input().split()]
print(statistics.median(numbers))