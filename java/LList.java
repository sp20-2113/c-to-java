public class LList {

  public LNode head;
  
  public LList() {
    // fill in
  }
  
  public void print_list(){
    LNode node = head;
    int i = 0;
    while (node != null) {
      i++;
      System.out.println(i + ": " + node.data);
      node = node.next;
    }
  }
    
  public static void main (String[] argv)
  {
    LList list = new LList();
    // fill in
    
    LNode a = new LNode(85);
    LNode b = new LNode(77);
    LNode c = new LNode(69);
    
    list.head = a;
    a.next = b;
    b.next = c;
    
    list.print_list();
  }

}
