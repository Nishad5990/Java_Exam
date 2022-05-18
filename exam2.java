import java.util.*;

class item {
	int item_ID;
	String item_name;
	
	item(int item_ID, String item_name){
		this.item_name = item_name;
		this.item_ID = item_ID;
	}
	
	item(){
		
	}
	void setitem_ID (int item_ID){
		this.item_ID = item_ID;
	}
	void setitem_name (String item_ID){
		this.item_name = item_name;
	}
	public String toString(){
		return this.item_ID + " " + this.item_name;
	}
}
class namesort implements comparator < item > {
	public int compare (item i1,item i2){
		return i1.item_name.comparetorTo (i2.team_name); 
	}
}

class idsort implements comparator < item > {
	public int compare (item i1,item i2){
		return i1.item_ID-(i2.item_ID);
	}
}

class inventory {
		static item i = new item();
		static Arraylist <item> list = new Arraylist<> ();
		
		public static void main (String [] args){
			Scanner sc = new Scanner (System.in);
			
			int choice ;
			
			item i1 = new item (1,"A");
			item i2 = new item (3,"R");
			item i3 = new item (2,"Z");
			item i4 = new item (4,"H");
			item i5 = new item (10,"N");
			
			list.add (1);
			list.add (2);
			list.add (3);
			list.add (4);
			list.add (5);
			
			
			
			
		}
}


























