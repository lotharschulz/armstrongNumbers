package armstrong

import (
	"container/list"
	"math"
)

func GenerateArmstrongNumbers() *list.List {
	expectedList := list.New()

    for i := 99; i < 1001; i++ {
        if IsArmstrongNumber(i) {
            expectedList.PushBack(i)
        }
    }

	return expectedList
}

// determines if a given number is an Armstrong number
func IsArmstrongNumber(n int) bool {
	if n < 0 {
        return false
    }
	digits := getDigits(n)
    numberOfDigits := getNumberOfDigits(digits)
    total := 0
	for _, v := range digits{
        total = total + int(math.Pow(float64(v),float64(numberOfDigits)))
    }
    if total == n{
        return true
    }
    return false

}

// returns the digits with a given integer
func getDigits(n int) []int{
    digits := []int{}
    for n !=0 {
        digits = append(digits, n % 10)
        n /= 10
    }
    reverseInt(digits)
    return digits
}

// reverses a given int array
func reverseInt(s []int) {
    for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
            s[i], s[j] = s[j], s[i]
    }
}

// returns the number of digits/integers of an int array
func getNumberOfDigits(digits []int) int{
	return len(digits)
}
