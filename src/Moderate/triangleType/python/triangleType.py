# http://www.codewars.com/kata/53907ac3cd51b69f790006c5/solutions/python

# Should return triangle type:
#  0 : if triangle cannot be made with given sides
#  1 : acute triangle
#  2 : right triangle
#  3 : obtuse triangle


def check_angle(a, b, c):
    return pow(a, 2) + pow(b, 2) - pow(c, 2)


def triangle_type(a, b, c):
    if a + b > c and a + c > b and c + b > a:
        if check_angle(a, b, c) > 0 and check_angle(c, a, b) > 0 and check_angle(b, c, a) > 0:
            return 1
        elif check_angle(a, b, c) == 0 or check_angle(c, a, b) == 0 or check_angle(b, c, a) == 0:
            return 2
        else:
            return 3
    else:
        return 0


print(triangle_type(7, 3, 2))  # Not triangle
print(triangle_type(2, 4, 6))  # Not triangle
print(triangle_type(8, 5, 7))  # Acute
print(triangle_type(3, 4, 5))  # Right
print(triangle_type(7, 12, 8))  # Obtuse
