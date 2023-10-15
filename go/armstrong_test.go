package armstrong

import "testing"

func TestArmstrongNumbers(t *testing.T) {
	expected := 123
	if observed := GenerateArmstrongNumbers(); observed != expected {
		t.Fatalf("GenerateArmstrongNumbers() = %v, want %v", observed, expected)
	}
}