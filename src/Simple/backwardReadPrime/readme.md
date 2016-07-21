# Prime palindromes

> Source: [CodeWars](https://www.codewars.com/kata/backwards-read-primes)

### Description

Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime.
(This rules out primes which are palindromes.)

### Examples:

`13 17 31 37 71 73` are Backwards Read Primes.
`13` is such because it's prime and read from right to left writes `31` which is prime too. Same for the others.

### Task

Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one being greater
than the first one. The resulting array or the resulting string will be ordered following the natural order of
the prime numbers.

```
backwardsPrime(2, 100) =>; "13 17 31 37 71 73 79 97"
backwardsPrime(9900, 10000) =>; "9923 9931 9941 9967"
```