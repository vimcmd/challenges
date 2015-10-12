def checkio(data):
    p_len = False
    p_didg = False
    p_alpha_upper = False
    p_alpha_lower = False
    if len(data) >= 10: p_len = True
    for ch in data:
        if ch.isdigit(): p_didg = True
        elif ch.isupper(): p_alpha_upper = True
        elif ch.islower(): p_alpha_lower = True
    if p_len and p_didg and p_alpha_upper and p_alpha_lower: return True
    else: return False
