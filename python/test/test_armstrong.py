import unittest, os, sys
sys.path.append(os.path.abspath('..'))
from armstrong.armstrong import ArmstrongNumbers


class FixturesTest(unittest.TestCase):

    def setUp(self):
        self.armstrongnumbers = ArmstrongNumbers()

    def tearDown(self):
        del self.armstrongnumbers

    # @TODO: test ValueErrors
    def test_generate_armstrong_numbers(self):
        self.assertEqual([], self.armstrongnumbers.generate_armstrong_numbers(100, 1000))

    # @TODO: test ValueErrors
    def test_generate_armstrong_numbers_alt(self):
        self.assertEqual([], self.armstrongnumbers.generate_armstrong_numbers_alt(100, 1000))

    def test_generate_armstrong_numbers_gen(self):
        f = self.armstrongnumbers.generate_armstrong_numbers_gen(2,6)
        cntr = 0
        for a in f:
            self.assertTrue(cntr+2, a)
            cntr += 1

    def test_is_armstrong_number(self):
        self.assertFalse(self.armstrongnumbers.is_armstrong_number(11))

if __name__ == '__main__':
    unittest.main()