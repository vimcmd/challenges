def checkio(m):
    if check_rows(m) or check_rows(m_transp(m)) or check_rows(m_diags(m)) or check_rows(m_off_diags(m)):
        return True
    return False

def check_rows(matrix):
    seq_len = 4
    for row in matrix:
        for ind, elem in enumerate(row):
            part = row[ind:ind+seq_len]
            if len(part) >= seq_len and len(set(part)) == 1: return True
    return False

def m_transp(matrix):
    return map(list, zip(*matrix))

def m_diags(matrix):
    N = len(matrix)
    return [[matrix[y-x][x] for x in range(N) if 0<=y-x<N] for y in range(2*N-1)]

def m_off_diags(matrix):
    matrix_rev = [row[::-1] for row in matrix]
    N = len(matrix)
    return [[matrix_rev[y-x][x] for x in range(N) if 0<=y-x<N] for y in range(2*N-1)]
