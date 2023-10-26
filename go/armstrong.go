package main

import (
	"container/list"
	"fmt"
	"math"
	"strconv"
	// "reflect"
)

func GenerateThreeDigitArmstrongNumbers() *list.List {
	expectedArmstrongNumberList := list.New()

	for i := 100; i < 1000; i++ {
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
	total := 0

	// digits := GetDigits(n)
	// numberOfDigits := GetNumberOfDigits(digits)
	// for _, v := range digits {
	// 	total = total + int(math.Pow(float64(v), float64(numberOfDigits)))
	// }

	// alternative implementation via string conversion
	digitsAsRuneArray := GetDigitsViaStringConversation(n)
	numberOfDigits := GetNumberOfDigitsFromeRuneArray(digitsAsRuneArray)
	fmt.Println(digitsAsRuneArray)
	// fmt.Println(numberOfDigits)
	for _, v := range digitsAsRuneArray {
		s := string(v)
		// fmt.Print("converted to string: ")
		// fmt.Println(s, reflect.TypeOf(s))

		f, err := strconv.ParseFloat(s, 64)
		if err != nil {
			panic("Conversion to float failed")
		}		   
		// fmt.Print("converted to float: ")
		// fmt.Println(f, err, reflect.TypeOf(f))

		total = total + int(math.Pow(f, float64(numberOfDigits)))
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
	fmt.Println("str: " + str)
	strRune := []rune(str)
	for i := 0; i < len(strRune); i++ {
        char := string(strRune[i])
        fmt.Println(char, i)
    }
	fmt.Print("strRune: ")
	fmt.Println(strRune)
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
	// for i := 0; i < len(digits); i++ {
    //     char := string(digits[i])
    //     fmt.Println(char, i)
    // }
	// fmt.Println(len(digits))
	return len(digits)
}

// main function
func main() {
	fmt.Println("Armstrong numbers (last item in curly brackets)")
	armstrongNumbers := GenerateThreeDigitArmstrongNumbers()
	for e := armstrongNumbers.Front(); e != nil; e = e.Next() {
		fmt.Println(e)
	}
}
