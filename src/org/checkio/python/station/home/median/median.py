def checkio(data):
    data = sorted(data)
    if len(data) % 2 == 0:
        return (data[int((len(data) / 2) - 1)] + data[int((len(data) / 2))]) / 2.0
    else: return data[int((len(data) / 2))]