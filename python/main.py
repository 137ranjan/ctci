def is_permutation(first, second) -> bool:
    if len(first) != len(second):
        return False
    
    char_count = {}
    for char in first:
        char_count[char] = char_count.get(char, 0) + 1
    for char in second:
        if char not in char_count or char_count[char] == 0:
            return False
        char_count[char] -= 1
    return True

if __name__ == "__main__":
    print("Starting main ...")
    print(is_permutation("abcde", "edcba"))  # True
    print(is_permutation("abcde", "abcdf"))  # False
    print(is_permutation("aabbcc", "abcabc"))  # True