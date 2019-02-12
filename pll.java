class Node{
	
	Node next;
	int data;
	Node(int data){
		this.data=data;
	}
}
 class linklist{
 	Node head;
public void insertbeg(int data){
	Node node=new Node(data);
	if(head==null){
		head=node;
	}else{
		node.next=head;
		head=node;
	}
}
public void insertany(int data,int pos){
		
		Node node = new Node(data);
		 Node current=head;
		for(int i=1;i<pos-1;i++){
			
			if(current==null)
				return ;
			current=current.next;
		}

		node.next=current.next;
		current.next=node;
	}

public void deleteEnd(){
		if(head==null){
			System.out.println("list is empty");

		}else{
			Node current;
			Node per;
			per=head;
			current=head;
			while(current.next!=null){
				per=current;
				current=current.next;
			}
			if (per==current) {
				head=null;
				
			}
			per.next=null;
		}
	}
public void traverse(){
	if(head==null){
		System.out.println("list is empty");
	}else {
		Node current;
		current=head;
		System.out.println("the elements are:");
		while(current.next!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
}
}
public class pll{
	public static void main(String[] x){
		linklist list=new linklist();
		list.insertbeg(10);
		list.insertbeg(20);
		list.insertbeg(30);
		list.insertbeg(40);
		list.insertbeg(50);
		list.insertbeg(60);
		list.insertbeg(70);
        list.insertany(12,3);
        list.traverse();	
	}
}