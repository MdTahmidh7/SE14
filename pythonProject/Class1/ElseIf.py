num1 = 15
num2 = 14
num3 = 12
if num1 > num2:
    if num1 > num3:
        print(num1, "Is the largest Number")
    elif num3 > num1:
        print(num3, "Is the largest Number ")
elif num2 > num3:
    print(num2, "Is the largest Number ")
else:
    print(num3, "Is the Largest Number")