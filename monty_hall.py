import random

def swap():
    n = random.random()*100
    if n > 100/3: return True
    else: return False

def main():
    num_tests = int(input("Enter the # of tests you want to run: "))
    print()
    win_no_swap = 0
    win_swap = 0
    for i in range(num_tests):
        if not swap(): win_no_swap += 1
        else: win_swap += 1
        
    print("Average win rate for not swapping doors: " + str((win_no_swap/num_tests)*100) + "%")
    print("Average win rate for swapping doors: " + str((win_swap/num_tests)*100) + "%")
    print("\n")

    
if __name__ == "__main__":
 
    test1 = main()
 