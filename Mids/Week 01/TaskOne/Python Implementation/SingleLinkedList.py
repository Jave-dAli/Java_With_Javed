class Node:
    def __init__(self, data):
        self.data=data
        self.next=None
    
class LinkedList:
    def __init__(self):
        self.head=None
        self.size=0
        
    def isEmpty(self):
        if self.size==0:
            return True
        return False
    
    def get_size(self):
        return self.size
        
    def append(self, data):
        node = Node(data)
        if self.head==None:
            self.head=node
        else:
            curr = self.head
            while(curr.next):
                curr=curr.next
            curr.next=node
        self.size += 1
        
        
    def prepend(self, data):
        node=Node(data)
        node.next=self.head;
        self.head=node
        self.size += 1
        
    def duplicate(self):
        newList = LinkedList()
        newList.head=self.head
        return newList
        
            
    def display(self):
        curr=self.head
        while(curr.next):
            print(curr.data, end="->")
            curr=curr.next
        print(curr.data)
        
        
            
    def delete(self, data):
        curr=self.head
        while(curr.next.data != data):
            curr=curr.next
        curr.next=curr.next.next;
        self.size -= 1
        
            
if __name__ == "__main__":
    list=LinkedList()
    
    
    list.append(1)
    list.append(2)
    list.append(3)
    list.display()
    
    duplicateList = list.duplicate();
    duplicateList.display()
    
    
    