class Node:
    def __init__(self, data):
        self.data=data
        self.next=None
        self.previous=None
        
class LinkedList:
    def __init__(self):
        self.head=None
        self.tail=None
        self.size=0
        
    def append(self, data):
        node=Node(data)
        if self.head is None:
            self.head=node
            self.tail=node
        else:
            self.tail.next=node
            node.previous = self.tail
            self.tail=node
        self.size+=1
        
    def prepend(self, data):
        node=Node(data)
        node.next=self.head;
        self.head.previous = node
        self.head=node
        self.size += 1
        
    def display(self):
        curr=self.head
        while curr.next is not None:
            print(curr.data, end=" => ")
            curr=curr.next
        print(curr.data)
        
    def reverseDisplay(self):
        curr = self.tail
        while curr.previous is not None:
            print(curr.data, end=" => ")
            curr = curr.previous
        print(curr.data)

if __name__ == "__main__":
    list=LinkedList()
    list.append(1)
    list.append(5)
    list.append(2)
    list.append(6)
    
    list.display()
    list.reverseDisplay()        