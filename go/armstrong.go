package armstrong

import (
	"container/list"
	"math"
	"strconv"
)

func GenerateThreeDigitArmstrongNumbers() *list.List {
	expectedArmstrongNumberList := list.New()

	for i := 99; i < 1001; i++ {
		if IsArmstrongNumber(i) {
			expectedArmstrongNumberList.PushBack(i)
		}
	}

	return expectedArmstrongNumberList
}

// determines if a given number is an Armstrong number
func IsArmstrongNumber(n int) bool {
	if n < 0 {
		return false
	}
	digits := GetDigits(n)
	numberOfDigits := GetNumberOfDigits(digits)

	// alternative implementation via string conversion
	// digits := GetDigitsViaStringConversation(n)
	// numberOfDigits := GetNumberOfDigitsFromeRuneArray(digits)
	
	total := 0
	for _, v := range digits {
		total = total + int(math.Pow(float64(v), float64(numberOfDigits)))
	}
	if total == n {
		return true
	}
	return false

}

// returns the digits with a given integer without string conversation
func GetDigits(n int) []int {
	digits := []int{}
	for n != 0 {
		digits = append(digits, n%10)
		n /= 10
	}
	ReverseInt(digits)
	return digits
}

// returns the digits with a given integer using string conversation
func GetDigitsViaStringConversation(n int) []rune {
	str := strconv.Itoa(n)
    strRune := []rune(str)
	return strRune
}

// reverses a given int array
func ReverseInt(s []int) {
	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		s[i], s[j] = s[j], s[i]
	}
}

// returns the number of digits/integers of an int array
func GetNumberOfDigits(digits []int) int {
	return len(digits)
}

// returns the number of digits/integers of an rune array
func GetNumberOfDigitsFromeRuneArray(digits []rune) int {
	return len(digits)
}