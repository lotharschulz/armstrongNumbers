class ArmstrongNumbers:

    def __init__(self):
        self.armstrongNumbers = []

    def generate_armstrong_numbers(self, begin, end):
        self.armstrongNumbers = []
        return self.armstrongNumbers

if __name__ == '__main__':
    a = ArmstrongNumbers()
    print(a.generate_armstrong_numbers(100, 1000))
