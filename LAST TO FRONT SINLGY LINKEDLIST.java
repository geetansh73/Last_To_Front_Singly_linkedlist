import java.util.*;
public class linkedlist
{
    Node head=null;
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    }
    }
    void add(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (head==null)
    {
    head=o;
    return;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    }
    void move_last_to_front()
    {
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
last.next=head;
head=last;
Node v=head;
while(v!=null)
{
if (v.next==last)
{
v.next=null;
}
v=v.next;
}
}
    
    void print()
    {
    Node c=head;
    while(c!=null)
    {
    System.out.print(c.data+" ");
    c=c.next;
    }
    }
    
    
public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
    linkedlist obj=new linkedlist();
    System.out.println("enter no. of elements ");
   int n=sc.nextInt();
   int a;
   for(int i=0;i<n;i++)
   {
a=sc.nextInt();
      obj.add(a);
   }
     obj.move_last_to_front();
       obj.print();
}
}