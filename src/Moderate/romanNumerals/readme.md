# Roman numerals decoder

> Source: [CodeWars](http://www.codewars.com/kata/roman-numerals-decoder)

## Description:

Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer.
You _don't need to validate the form_ of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately,
starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC)
and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in
descending order.

Example:

`C# RomanDecode.Solution("XXI") -- should return 21`

- - -

# Roman numerals encoder

> Source: [CodeWars](http://www.codewars.com/kata/roman-numerals-encoder)

## Description:

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral
representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

## Example:

`conversion.solution(1000); //should return "M"`

## Help:

```
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
```

Remember that there **can't be more than 3 identical symbols in a row**.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals