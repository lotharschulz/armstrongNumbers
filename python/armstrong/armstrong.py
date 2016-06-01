class ArmstrongNumbers:

    def __init__(self):
        self.armstrongNumbers = []

    def generate_armstrong_numbers(self, begin, end):
        self.armstrongNumbers = []
        return [i for i in range(begin, end+1) if self.is_armstrong_number(i)]

    def is_armstrong_number(self, number):
        return False

if __name__ == '__main__':
    a = ArmstrongNumbers()
    print(a.generate_armstrong_numbers(100, 1000))
