# ISBN Validation

> Source: [Programmr](http://programmr.com/)

An ISBN number is legal if it consists of 10 digits `d` and

`d_1 + 2*d_2 + 3*d_3 + ... + 10 * d_10` is a multiple of `11`.

The ISBN number 0-201-31452-5 is valid.

`1*5 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 = 88`

and `88` is a multiple of `11`.

Write a program which validates whether an ISBN number.

##### Example:

1) if user inputs `8535902775` then it should print `"Valid"`

2) if user inputs `1843369283` then it should print `"Not Valid"`

##### Additional links:
- https://en.wikipedia.org/wiki/International_Standard_Book_Number#ISBN-10_check_digits