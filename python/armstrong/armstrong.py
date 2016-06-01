import numbers

class ArmstrongNumbers:

    def __init__(self):
        self.armstrongNumbers = []

    def generate_armstrong_numbers(self, begin=0, end=1):
        if not isinstance(begin, numbers.Number):
            raise ValueError('limit has to be a number')
        elif not isinstance(end, numbers.Number):
            raise ValueError('end has to be a number')
        else:
            self.armstrongNumbers = []
            return [i for i in range(begin, end+1) if self.is_armstrong_number(i)]

    def generate_armstrong_numbers_alt(self, begin, end):
        if not isinstance(begin, numbers.Number):
            raise ValueError('limit has to be a number')
        elif not isinstance(end, numbers.Number):
            raise ValueError('end has to be a number')
        else:
            generator = self.generate_armstrong_numbers_gen(begin, end)
            return [x for x in generator if self.is_armstrong_number(x)]

    def generate_armstrong_numbers_gen(self, begin, end):
        for i in range(begin, end+1):
            yield i

    def is_armstrong_number(self, number):
        return False

if __name__ == '__main__':
    a = ArmstrongNumbers()
    print(a.generate_armstrong_numbers(100, 1000))
