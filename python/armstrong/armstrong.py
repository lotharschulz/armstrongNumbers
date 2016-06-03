import numbers
import math

class ArmstrongNumbers:

    def __init__(self):
        self.armstrongNumbers = []

    def generate_armstrong_numbers(self, begin=0, end=1):
        self.check_number(begin)
        self.check_number(end)
        self.armstrongNumbers = []
        return [i for i in range(begin, end+1) if self.is_armstrong_number(i)]

    def generate_armstrong_numbers_alt(self, begin, end):
        self.check_number(begin)
        self.check_number(end)
        return [x for x in self.generate_armstrong_numbers_gen(begin, end) if self.is_armstrong_number(x)]

    def generate_armstrong_numbers_gen(self, begin, end):
        for i in range(begin, end+1):
            yield i

    def is_armstrong_number(self, number):
        self.check_number(number)
        sum = 0
        for nmbr in self.get_digits(number):
            sum += math.pow(nmbr, self.get_number_of_digits(number))
        if number == sum: return True
        return False

    def get_digits(self, number):
        self.check_number(number)
        digits = []
        if number == 0:
            return digits
        while number > 0:
            digits.append(number%10)
            number = int(number / 10)
        digits.reverse()
        return digits

    def get_number_of_digits(self, number):
        self.check_number(number)
        if number == 0: return 1
        return int(math.log(number, 10)) + 1

    def check_number(self, number):
        if not isinstance(number, numbers.Number):
            raise ValueError('limit has to be a number')
        elif number < 0:
            raise ValueError('number must be greater than -1')

if __name__ == '__main__':
    a = ArmstrongNumbers()
    print(a.generate_armstrong_numbers(100, 1000))
