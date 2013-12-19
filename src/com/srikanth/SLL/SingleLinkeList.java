package com.srikanth.SLL;

public class SingleLinkeList {

	public Node buildList(Node element,int dat)
	{
		if(element == null)
		{
			//tree is empty
			Node temp = new Node(dat);
			return temp;
		}
		else
		{
			Node root = element;
			Node temp_notNull = new Node(dat);
			while(element.next != null)
			{
				element = element.next;
			}
			element.next = temp_notNull;
			return root;
		}
	}
	
	public void displayList(Node root)
	{
		Node element = root;
		if(root == null)
		{
			System.out.println("No elements in the list");
		}
		else
		{
			System.out.print(element.data);
			while(element.next != null)
			{
				element = element.next;
				System.out.print("--->"+element.data);
				
			}
			
		}
	}
	public int countList(Node root)
	{
		Node element = root;
		int count =1;
		while(element.next != null)
		{
			++count;
			element = element.next;
			
		}
		return count;
	}
	//Merging two Lists alternatively
	public Node mergeListsAlternatively(Node ListA,Node ListB)
	{
		Node return_node = ListA;
		Node tempA = null;
		Node tempB = null;
		int countA = countList(ListA);
		int countB = countList(ListB);
		if(ListA == null && ListB == null)
			return null;
		else if(ListA == null && ListB != null)
			return ListB;
		else if (ListA != null && ListB == null)
			return ListA;
		else if(countA >= countB)
		{
			
			do{
				tempA = ListA.next;
				tempB = ListB.next;
				ListA.next = ListB;
				ListB.next = tempA;
				ListB = tempB;
				ListA = tempA;				
			}while(ListB.next != null);
			
			tempA = ListA.next;
			ListA.next = tempB;
			ListB.next = tempA;
			
		}
		else if(countA < countB)
		{
			while(ListA.next != null)
			{
				tempA = ListA.next;
				tempB = ListB.next;
				ListA.next = ListB;
				ListB.next = tempA;
				ListB = tempB;
				ListA = tempA;				
			}
			
				tempA = ListB.next;
				ListA.next = tempA;
				
		}
		return return_node;
	}
	//Delete N nodes after M nodes of a linked list
	public Node DeleteNAfterMNodes(Node root,int N,int M)
	{
		System.out.println("\n Delete "+ N +" NodesAfter "+ M +" Nodes in the given List");
		Node returnNode = root;
		if(root ==null)
			return null;
		int countNodes = countList(root);
		if(M+N <= countNodes)
		{
			for(int i=1;i<M;i++)
			{
				root = root.next;
			}
			Node tempNode = root;
			for(int j=0;j<N;j++)
			{
				tempNode = tempNode.next;
			}
			tempNode = tempNode.next;
			root.next = tempNode;
		}
		else
			return null;
		return returnNode;
	}
	//Swap kth node from beginning with kth node from end. Swapping of data is not allowed
	@SuppressWarnings("unused")
	public Node SwapKNodeStartAndEnd(Node root,int k)
	{
		Node startNodePrev = null, startNode =null, startNodeNext = null;
		Node endNodePrev = null , endNode=null , endNodeNext = null;
		int count = countList(root);
		Node tempStart = root;
		if(k > count )
		{
			System.out.println("Invalid Value...");
			return root;
		}
		else
		{
			
			
		    for(int i=1;i<k-1;i++)
		    {
		    	tempStart = tempStart.next;
		    }
				startNodePrev = tempStart;
				startNode = tempStart.next;
				if(startNode.next == null)
				{
					startNodeNext = null;
				}
				else
				{
					startNodeNext = startNode.next;
				}
				System.out.println("\n"+startNodePrev.data+"___"+startNode.data+"___"+startNodeNext.data);
				tempStart = root;
			int fromEnd = count-k;
			for(int j=1;j<fromEnd;j++)
			{
				tempStart = tempStart.next;
			}
				endNodePrev = tempStart;
				endNode = tempStart.next;
				if(endNode.next == null)
				{
					endNodeNext = null;
				}
				else
				{
					endNodeNext = endNode.next;
				}
				System.out.println("\n"+endNodePrev.data+"___"+endNode.data+"___"+endNodeNext.data);
				startNodePrev.next = endNode;
				endNode.next = startNodeNext;
				endNodePrev.next = startNode;
				if(endNodeNext == null)
				{
					startNode.next = null;
				}
				else
				{
					startNode.next = endNodeNext;
				}
				tempStart = root;
				
		}
		
		return tempStart;
	}
	//Flatten a multilevel linked list
	//Implement LRU Cache
	//Union and Intersection of two Linked Lists
	//Reversing a LinkedList
	//Reversing block of nodes in a list
	//Building a List by odd numbers fisrt and even numbers last by preserving the order
	public Node evenOddList(Node root)
	{
			Node oddStart = null,oddEnd =null;
			Node evenStart = null,evenEnd = null;
			Node temp = root;
			int count = countList(root);
			oddStart = oddEnd;
			evenStart = evenEnd;
			if(temp.data%2 == 0)
			{
				evenStart = evenEnd = temp;
			}
			else
			for(int i=1;i<count;i++)
			{
				
			}
			
			return root;
	}
}
