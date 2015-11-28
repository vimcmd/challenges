# http://stackoverflow.com/questions/17605898/sudoku-checker-in-python

ok_list = [[1, 3, 2, 5, 7, 9, 4, 6, 8]
    , [4, 9, 8, 2, 6, 1, 3, 7, 5]
    , [7, 5, 6, 3, 8, 4, 2, 1, 9]
    , [6, 4, 3, 1, 5, 8, 7, 9, 2]
    , [5, 2, 1, 7, 9, 3, 8, 4, 6]
    , [9, 8, 7, 4, 2, 6, 5, 3, 1]
    , [2, 1, 4, 9, 3, 5, 6, 8, 7]
    , [3, 6, 5, 8, 1, 7, 9, 2, 4]
    , [8, 7, 9, 6, 4, 2, 1, 5, 3]]

bad_list = [[1, 3, 2, 5, 7, 9, 4, 6, 8]
    , [4, 9, 8, 2, 6, 1, 3, 7, 5]
    , [7, 5, 6, 3, 8, 4, 2, 1, 9]
    , [6, 4, 3, 1, 5, 8, 7, 9, 2]
    , [5, 2, 1, 7, 9, 3, 8, 4, 6]
    , [9, 8, 7, 4, 2, 6, 5, 3, 1]
    , [2, 1, 4, 9, 3, 5, 6, 8, 7]
    , [3, 6, 5, 8, 1, 7, 9, 2, 4]
    , [8, 7, 9, 6, 4, 2, 1, 3, 5]]

# TODO: task not finished! add check for 3x3 blocks
def done_or_not(board):  # board[i][j]
    # map(list, zip(*board)) equal to transposed matrix
    if [sum(row) for row in board] != [45] * 9 or [sum(col) for col in map(list, zip(*board))] != [45] * 9:
        return "Bad"
    return "Good"
