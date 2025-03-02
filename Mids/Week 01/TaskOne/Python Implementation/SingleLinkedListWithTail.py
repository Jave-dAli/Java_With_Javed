class Node:
    def __init__(self, data):
        self.data=data
        self.next=None
    
class LinkedList:
    def __init__(self):
        self.head=None
        self.tail=None
        
    def append(self, data):
        node = Node(data)
        if self.head is None:
            self.head=node
            self.tail=node
        else:
            self.tail.next = node
            self.tail=node
            
    def prepend(self, data):
        node=Node(data)
        node.next=self.head;
        self.head=node
        
        def delete(self, data):
            node=Node(data)
            curr=self.head
            while(curr.next.data != data):
                curr=curr.next
            curr.next=curr.next.next;
        
    def display(self):
        curr = self.head
        while curr.next is not None:
            print(curr.data, end=" -> ")
            curr = curr.next
        print(curr.data)

        
            
if __name__ == "__main__":
    list=LinkedList()
    
    list.append(1)
    list.append(3)
    list.prepend(0)
    list.append(5)
    list.append(7)
    list.append(9)
    list.display()