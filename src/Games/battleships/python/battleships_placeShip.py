from random import randint

board = []

# fill board
for x in range(5):
    board.append(["O"] * 5)
# print board to console
def print_board(board):
    for row in board:
        print " ".join(row)

# print "Let's play Battleship!"


# generate random place
def random_row(board):
    return randint(0, len(board) - 1)

def random_col(board):
    return randint(0, len(board[0]) - 1)

ship_h = 1
ship_w = 1

def random_size():
    global ship_h
    global ship_w
    # 0 - horis, 1 - vert
    if randint(0,1) == 0:
        ship_h = 1
        ship_w = randint(1,len(board)-1)
    else:
        ship_h = randint(1,len(board)-1)
        ship_w = 1
    return ship_h
    return ship_w
# generate ship positions
ship_row = random_row(board)
ship_col = random_col(board)

# generate ship
random_size()

print "start row ", ship_row
print "start col", ship_col
print "Width ", ship_w
print "Height ", ship_h

def ship_place(ship_row, ship_col, ship_w, ship_h):
    global board
    # define row and col:
    # if ship places out of board range,
    # shift rows and cols
    if ship_row + ship_h > len(board):
        start_row = ship_row - ((ship_row + ship_h) - len(board))
    else:
        start_row = ship_row

    if ship_col + ship_w > len(board):
        start_col = ship_col - ((ship_col + ship_w) - len(board))
    else:
        start_col = ship_col
    # place ship in board
    for row in range(start_row, start_row + ship_h):
        for col in range(start_col, start_col + ship_w):
            board[row][col] = "%"
    return board

ship_place(ship_row, ship_col, ship_w, ship_h)
print_board(board)
