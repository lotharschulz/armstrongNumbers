fn main() {
    let _r = three_digit_armstrong_numbers();
    println!("three digits armstrong numbers: ");
    for x in &_r {
        println!("{x}");
    }
    let _r2 = three_digit_armstrong_numbers_alt();
    println!("three digits armstrong numbers (alt): ");
    for x in &_r2 {
        println!("{x}");
    }
}

pub fn three_digit_armstrong_numbers() -> Vec<u32> {
    let mut v: Vec<u32> = Vec::new();
    for n in 100..1001 {
        if is_armstrong_number(n) {
            v.push(n);
        }
    }
    v
}

pub fn three_digit_armstrong_numbers_alt() -> Vec<u32> {
    let mut v: Vec<u32> = Vec::new();
    for n in 100..1001 {
        if is_armstrong_number_alt(n) {
            v.push(n);
        }
    }
    v
}

pub fn is_armstrong_number(num: u32) -> bool {
    let num_str = num.to_string();
    let exponent = num_str.len() as u32;

    let sum: u64 = num_str
        .chars()
        .map(|x| x.to_digit(10).unwrap() as u64)
        .map(|x| x.pow(exponent))
        .sum();

    sum == num as u64
}

pub fn is_armstrong_number_alt(input: u32) -> bool {
    let exponent = get_digits(input);
    let r = get_digits(input).iter().map(|x: &u64| x.pow(exponent)).sum();
    return r == input;
}

pub fn get_digits(input: u32) -> Vec<u32> {
    let mut result: Vec<u32> = Vec::new();
    let mut nmbr = input;
    if nmbr > 0 {
        while nmbr > 0 {
            result.push(nmbr % 10);
            nmbr = nmbr / 10;
        }
        result.reverse();
    } else if input == 0 {
        result.push(0);
    }
    result
}

pub fn get_number_of_digits_log(input: u32) -> u32 {
    if input == 0 {
        return 1;
    } 
    return input.checked_ilog10().unwrap_or(0) + 1;
}

#[test]
fn check_three_digit_armstrong_numbers_vector_len() {
    let v: Vec<u32> = three_digit_armstrong_numbers();
    assert!(v.len() == 4);
}

#[test]
fn zero_is_armstrong_number() {
    assert!(is_armstrong_number(0))
}

#[test]
fn check_three_digit_armstrong_numbers() {
    assert!(is_armstrong_number(153));
    assert!(!is_armstrong_number(152));
    assert!(is_armstrong_number(370));
    assert!(is_armstrong_number(371));
    assert!(!is_armstrong_number(372));
    assert!(is_armstrong_number(407));
    assert!(!is_armstrong_number(408));
}

#[test]
fn check_three_digit_armstrong_numbers_vector() {
    let v: Vec<u32> = three_digit_armstrong_numbers();
    let expected = vec![153, 370, 371, 407];
    let matching = v.iter().zip(&expected).filter(|&(a, b)| a == b).count();
    assert!(4 == matching)
}

#[test]
fn check_get_digits(){
    let r1 = get_digits(100).len();
    assert!(3 == r1);
    let r2 = get_digits(10).len();
    assert!(2 == r2);
    let r3 = get_digits(1).len();
    assert!(1 == r3);
}
