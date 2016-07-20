## Circularly Sorted Array

> Source: [CodeWars](https://www.codewars.com/kata/544975fc18f47481ba00107b)

Write a method, `isCircleSorted(int[] A)` (Java, JavaScript),
or `Array#circularly_sorted?` (Ruby) that determines if A is circularly sorted.
An Array is circularly sorted if the elements are sorted in ascending order,
but displaced, or rotated, by any number of steps.

### For Example:

```
// True:
isCircleSorted([2,3,4,5,0,1]);
isCircleSorted([4,5,6,9,1]);
isCircleSorted([10,11,6,7,9]);
isCircleSorted([1,2,3,4,5]);
isCircleSorted([5,7,43,987,-9,0]);


// False:
isCircleSorted([4,1,2,5]);
isCircleSorted([8,7,6,5,4,3]);
isCircleSorted([6,7,4,8]);
isCircleSorted([7,6,5,4,3,2,1]);
```