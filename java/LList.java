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
    
    list.print_list();
  }

}
