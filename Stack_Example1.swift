class Stack (
  var stackArray = [String]()
  //Push
  func push(item:String) {
    self.stackArray.append(item)
  }
  //Pop
  func pop()->String? {
    if self.stackArray.last != nil {
      let lastString = self.stackArray.last
      self.stackArray.removeLast()
      return lastString!
    } else {
      return nil
    }
  }
  //Peek
  func peek() -> String? {
    if self.stackArray.last != nil {
      return self.stackArray.last
    } else {
      return nil
    }
  }
}

var deck:Stack = Stack()

deck.push(item: "Heart : Queen")
deck.push(item: "Clubs : King")
deck.push(item: "Spade : Jack")
deck.push(item: "Diamond : Ace")
print(deck.peek()!)
print(deck.peek()!)

var firstItemPopped = deck.pop()  //Item popped is the Ace of Diamond
var secondItemPopped = deck.pop() //Item popped was the Jack of Spades
print(firstItemPopped!)   // Prints the first item popped out the stack
print(secondItemPopped   // Prints the second item popped from the stack
