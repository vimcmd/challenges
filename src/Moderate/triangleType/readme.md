# Triangle Type
> Source: [CodeWars](http://www.codewars.com/)

##### Description:

You should calculate type of triangle with three given sides `a`, `b` and `c` (given in any order).
1. If all angles are less than `90°`, this triangle is `acute` and function should return `1`.
2. If one angle is strictly `90°`, this triangle is `right` and function should return `2`.
3. If one angle more than `90°`, this triangle is `obtuse` and function should return `3`.
4. If three sides cannot form triangle, or one angle is `180°` (which turns triangle into
segment) - function should return `0`.

Input parameters are `sides` of given triangle. All input values are non-negative floating point or integer numbers (or both).

##### Examples:
If you stuck, this can help you: http://en.wikipedia.org/wiki/Law_of_cosines.
But you can solve this kata even without angle calculation.