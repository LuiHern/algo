def sortedSquaredArray(array):
    squared = [0 for _ in array]
    for elem in range(len(array)):
        value = array[elem]
        squared[elem] = value * value
    squared.sort()
    return squared
