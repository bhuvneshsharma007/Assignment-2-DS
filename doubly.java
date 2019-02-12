class Node{

	Node pre;
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.pre=null;
		this.next=null;
	}
}
class DoublyList{
	Node head;
	Node tail;
	public void traverse(){
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			Node current=head;
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
		}

	}
	public void traverseReverse(){
		if(tail==null){
			System.out.println("List is empty");
		}
		else{
			Node current=tail;
			while(current!=null){
				System.out.println(current.data);
				current=current.pre;
			}


		}

	}
	public void Insertbeg(int data){
		Node node =new Node(data);
		if(head==null){
			head=node;
			tail=node;
		}
		else{
			head.pre=node;
			node.next=head;
			head=node;
		}

	}
	public void InsertEnd(int data){
		Node node =new Node(data);
		if(head==null){
			head=node;
			tail=node;
		}
		else{
			tail.next=node;
			node.pre=tail;
			tail=node;
		}
	}
	public void deleteBeg(){
		if(head==null){
			System.out.println("list is empty");
		}else{
			head=head.next;
			head.pre=null;
		}
	}

	public void deleteEnd(){
		if(head==null){
			System.out.println("list is empty");
		}else{
			tail= tail.pre;
			tail.next=null;
		}
	}
	

}
public class doubly{

	public static void main(String[] x){
		DoublyList list =new DoublyList();
		list.Insertbeg(10);
		list.Insertbeg(20);
		list.Insertbeg(30);
		list.Insertbeg(40);
		list.Insertbeg(50);
		list.Insertbeg(60);
		list.InsertEnd(100);
		//list.deleteBeg();
		list.deleteEnd();
		list.deleteBeg();
		list.traverse();


	}
}