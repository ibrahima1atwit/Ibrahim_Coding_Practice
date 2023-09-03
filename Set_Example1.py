primaryColors = frozenset(["red", "blue", "yellow"]) // finite set of elements or frozen since you cannot add to it

color = "green" // we are checking to see if green is a part of the primary colors

if color.lower() in primaryColors:
    print(color + " is a primary color")
else:
    print(color + "is not a primary color")

letters = set(['a', 'b'])
letters.add('c')
print(letters)
