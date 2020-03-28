/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue
{
    Node front;
    Node rear;
    int size;

    public MyCircularQueue()
    {
        front=null;
        rear=null;
        size=0;
    }

    boolean isEmpty()
    {
        boolean response=false;
        if(size==0)
        {
            response=true;
        }
        return response;
    }

    public void enqueue(Student element)
    {
        Node node=new Node(element);
        size++;

        if(isEmpty())
        {
            front=node;
            rear=node;
            rear.setNext(front);
        }
        else
        {
            rear.setNext(node);
            rear=node;
            rear.setNext(front);
        }
    }

}
