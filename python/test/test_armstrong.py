import unittest, os, sys
sys.path.append(os.path.abspath('..'))
from armstrong.armstrong import ArmstrongNumbers


class FixturesTest(unittest.TestCase):

    def setUp(self):
        self.armstrongnumbers = ArmstrongNumbers()

    def tearDown(self):
        del self.armstrongnumbers

    def test_generate_armstrong_numbers(self):
        self.assertEqual([], self.armstrongnumbers.generate_armstrong_numbers(100, 1000))

if __name__ == '__main__':
    unittest.main()