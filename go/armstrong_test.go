package main

import (
	"container/list"
	"fmt"
	"reflect"
	"testing"
)

func TestThreeDigitArmstrongNumbers(t *testing.T) {
	expectedList := list.New()
	expectedList.PushBack(153)
	expectedList.PushBack(370)
	expectedList.PushBack(371)
	expectedList.PushBack(407)

	if observed := GenerateThreeDigitArmstrongNumbers(); !reflect.DeepEqual(observed, expectedList) {
		fmt.Println("expected list and observed list are different, however should be equal")
		fmt.Println("\nexpected list: ")
		for e := expectedList.Front(); e != nil; e = e.Next() {
			fmt.Println(e)
		}
		fmt.Println("\nobserved list: ")
		for e := observed.Front(); e != nil; e = e.Next() {
			fmt.Println(e)
		}
		t.Fatalf("GenerateArmstrongNumbers() = %v, want %v", observed, expectedList)

	}
}

func TestThreeDigitArmstrongNumbersAlt(t *testing.T) {
	expectedList := list.New()
	expectedList.PushBack(153)
	expectedList.PushBack(370)
	expectedList.PushBack(371)
	expectedList.PushBack(407)

	if observed := GenerateThreeDigitArmstrongNumbersAlt(); !reflect.DeepEqual(observed, expectedList) {
		fmt.Println("expected list and observed list are different, however should be equal")
		fmt.Println("\nexpected list: ")
		for e := expectedList.Front(); e != nil; e = e.Next() {
			fmt.Println(e)
		}
		fmt.Println("\nobserved list: ")
		for e := observed.Front(); e != nil; e = e.Next() {
			fmt.Println(e)
		}
		t.Fatalf("GenerateArmstrongNumbers() = %v, want %v", observed, expectedList)

	}
}
