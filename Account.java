public class Account{
   
   private int pass;
   private String uname;
   Account(int pass, String uname){
          this.pass=pass;
          this.uname=uname;
   }
   public int getPass(){
          return pass;
   }
   public String getUname(){
        return uname; 
  }
  public void setPass(int pass){
        this.pass=pass;
  }
   public static void main(String[] args){
            Account ob=new Account(1234,"Hii");
            
            System.out.println("Password is: "+ob.getPass()+"\nUsername is: "+ob.getUname());
            
            ob.setPass(234);
            
            System.out.println("Password is: "+ob.getPass());
            
    }
}
