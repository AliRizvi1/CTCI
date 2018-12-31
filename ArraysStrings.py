# Question 1.1:
def unique(str):
    # retVal: bool
    # strVal: string

    if len(str) > 128:
        return False
    char_set = [128]
    for x in str:
        val = str[x]
        if char_set[val]:
            return False
        char_set[val] = True

    return True


if unique("abca"):
    print("Unique!")
else:
    print("Not unique!")