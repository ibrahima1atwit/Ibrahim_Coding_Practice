class Queue {
  var queueArray = [String]()

  //Enqueue
  func enqueue(item:String) {
    self.queueArray.append(item)
  }

  //Dequeue
  func dequeue()->String? {
      if self.queueArray.first != nil {
        let firstString = self.queueArray.first
        self.queueArray.removeFirst()
        return firstString!
      } else {
          return nil
      }
  }
  //Peek
  func peek() -> String? {
      if self.queueArray.first != nil {
          return self.queueArray.first  // Here we are accessing the front of the data structure to see its contents
      } else {
          return nil
      }
   }
}

var myQueue = Queue()
myQueue.enqueue(item: "Abdullahi Ibrahim")
myQueue.enqueue(item: "Joseph Gbedema")
myQueue.enqueue(item: "Benjamin Douchette")

print(myQueue.peek()!)
print(myQueue.peek()!)
var firstToLeave = myQueue.dequeue()
print(myQueue.peek()!)


