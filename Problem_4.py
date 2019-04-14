
# Largest palindrome product
#
# A palindromic number reads the same both ways.
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
# Find the largest palindrome made from the product of two 3-digit numbers.

largestPalindrome = 0

for x in range(999, 900, -1):
    for i in range(999, 900, -1):
        num = x * i
        if num == int(str(num)[::-1]) and num > largestPalindrome:
            largestPalindrome = num
            break
        else:
            i += 1
    x += 1

print (largestPalindrome)
