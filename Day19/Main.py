def cycle_sort(arr):
    n = len(arr)

    for cycle_start in range(0, n - 1):
        item = arr[cycle_start]

        pos = cycle_start
        for i in range(cycle_start + 1, n):
            if arr[i] < item:
                pos += 1

        if pos == cycle_start:
            continue

        while item == arr[pos]:
            pos += 1

        arr[pos], item = item, arr[pos]

        while pos != cycle_start:
            pos = cycle_start
            for i in range(cycle_start + 1, n):
                if arr[i] < item:
                    pos += 1

            while item == arr[pos]:
                pos += 1

            arr[pos], item = item, arr[pos]

    return arr

# Example usage:
arr = [5, 2, 7, 1, 8, 3]
sorted_arr = cycle_sort(arr.copy())
print(f"Original Array: {arr}")
print(f"Sorted Array: {sorted_arr}")