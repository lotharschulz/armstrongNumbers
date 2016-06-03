import unittest
import os
import sys
sys.path.append(os.path.abspath('..'))
from armstrong.armstrong import ArmstrongNumbers


class FixturesTest(unittest.TestCase):

    def setUp(self):
        self.armstrongnumbers = ArmstrongNumbers()

    def tearDown(self):
        del self.armstrongnumbers

    def test_generate_armstrong_numbers(self):
        self.assertEqual([], self.armstrongnumbers.generate_armstrong_numbers(100, 1000))
        self.assertRaises(ValueError, self.armstrongnumbers.generate_armstrong_numbers, "a", "b")
        self.assertRaises(ValueError, self.armstrongnumbers.generate_armstrong_numbers, -1, 100)
        self.assertRaises(ValueError, self.armstrongnumbers.generate_armstrong_numbers, 100, -1)

    def test_generate_armstrong_numbers_alt(self):
        self.assertEqual([], self.armstrongnumbers.generate_armstrong_numbers_alt(100, 1000))
        self.assertRaises(ValueError, self.armstrongnumbers.generate_armstrong_numbers_alt, "a", "b")
        self.assertRaises(ValueError, self.armstrongnumbers.generate_armstrong_numbers, -1, 100)
        self.assertRaises(ValueError, self.armstrongnumbers.generate_armstrong_numbers, 100, -1)

    def test_generate_armstrong_numbers_gen(self):
        f = self.armstrongnumbers.generate_armstrong_numbers_gen(2,6)
        cntr = 0
        for a in f:
            self.assertTrue(cntr+2, a)
            cntr += 1

    def test_is_armstrong_number(self):
        self.assertFalse(self.armstrongnumbers.is_armstrong_number(11))
        self.assertFalse(self.armstrongnumbers.is_armstrong_number(0))
        self.assertRaises(ValueError, self.armstrongnumbers.is_armstrong_number, "a")
        self.assertRaises(ValueError, self.armstrongnumbers.is_armstrong_number, -1)

    def test_get_digits(self):
        self.assertEqual([1, 2, 3], self.armstrongnumbers.get_digits(123))
        self.assertEqual([], self.armstrongnumbers.get_digits(0))
        self.assertRaises(ValueError, self.armstrongnumbers.get_digits, "a")
        self.assertRaises(ValueError, self.armstrongnumbers.get_digits, -1)

    def test_get_number_of_digits(self):
        self.assertEquals(1, self.armstrongnumbers.get_number_of_digits(0))
        self.assertEquals(3, self.armstrongnumbers.get_number_of_digits(100))
        self.assertRaises(ValueError, self.armstrongnumbers.get_number_of_digits, "a")
        self.assertRaises(ValueError, self.armstrongnumbers.get_number_of_digits, -1)

if __name__ == '__main__':
    unittest.main()