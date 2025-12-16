package main

import (
	"fmt"
)

func main() {
	fmt.Println("Starting main...")
	first := "abcd"
	second := "dcba"
	result := isPermutation(first, second)
	fmt.Printf("Are \"%s\" and \"%s\" permutations of each other? %v\n", first, second, result)
}

func isPermutation(first, second string) bool {
	if len(first) != len(second) {
		return false
	}
	freqArr := make([]int, 256)
	for i := 0; i < len(first); i++ {
		freqArr[first[i]]++
	}
	for i := 0; i < len(second); i++ {
		freqArr[second[i]]--
	}
	for i := range freqArr {
		if freqArr[i] != 0 {
			return false
		}
	}
	return true
}
