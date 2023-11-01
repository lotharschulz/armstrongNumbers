fn main() {
    let _r = three_digit_armstrong_numbers();
}

pub fn three_digit_armstrong_numbers() -> Vec<u32> {
    let mut v: Vec<u32> = Vec::new();
    for n in 100..1001 {
        if is_armstrong_number(n) {
            v.push(n);
        }
    }
    return v;
}

pub fn is_armstrong_number(num: u32) -> bool {
    let num_str = num.to_string();
    let exponent = num_str.len() as u32;

    let sum: u64 = num_str.chars()
        .map(|x| x.to_digit(10).unwrap() as u64)
        .map(|x| x.pow(exponent))
        .sum();

    sum == num as u64
}

#[test]
fn it_works() {
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