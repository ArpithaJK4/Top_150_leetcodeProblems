# cook your dish here
def find_max_height():
    T = int(input())  # Number of test cases
    for _ in range(T):
        N = int(input())  # Number of mountains
        heights = list(map(int, input().split()))  # Heights of mountains
        print(max(heights))  # Output the tallest mountain height

# Sample Input:
# 1
# 5
# 4 7 6 3 1
#
# Expected Output:
# 7

find_max_height()
