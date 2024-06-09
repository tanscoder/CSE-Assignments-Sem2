public class hello {           
 //"C:\Users\new\Desktop\hello.java"
 public static class thrd extends Thread{ 

  private String task;
  private  int time,r;

  thrd ( String task ,int time){ 

   this.task=task;
   this.time=time;
   this.r=38;

   
}
thrd (String task,int time,int r){ 
     this.task=task;
      this.time=time;
      this.r=r;
}


public void run( ){ 

try{
Thread.sleep(time*100);
System.out.println("\t"+task+" is begun\n");
}

catch(Exception e){ }

for (int i=0; i<=r;i++){ 

 System.out.println(task+"\t"+i+"s");

try { 
Thread.sleep(100);
      
}catch(Exception e){ }   } 

  } 

}

public static void main (String[] args){ 

//System.out.print("Hello there , succesfullyy executed");
    thrd chat=new thrd ("chat",0);
 thrd voicecl= new thrd(" call",25,10);
 thrd videocl=new thrd("video call",5,9);
 thrd payment=new thrd("payment",28,4);
	
	chat.start();
	voicecl.start();
	videocl.start();
	payment.start();
}


}