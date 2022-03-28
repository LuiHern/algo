# def sortedSquaredArray(array):
#     squared = [0 for _ in array]
#     for elem in range(len(array)):
#         value = array[elem]
#         squared[elem] = value * value
#     squared.sort()
#     return squared


def sortedSquaredArray(array):
    squared = [0 for _ in array]
    left_pointer = 0
    right_pointer = len(array) - 1

    for idx in reversed(range(len(array))):
        left_value = array[left_pointer]
        right_value = array[right_pointer]
        if(abs(left_value) > abs(right_value)):
            squared[idx] = left_value * left_value
            left_pointer += 1
        else:
            squared[idx] = right_value * right_value
            right_pointer -= 1

    return squared
