class table extends Thread{ 

                     int n; 
                         
			  void  tables( ){ 
                                     
				      int sp=1,tbs;

                                      for (int i =0;i<=10;++i){ 
                         
				             for (int j =1;j<=n;j++){ System.out.print("      ");} 			
				              System.out.print(n+" X "+i+" = "+n*i+"\n");

                                                         }
                                               }   
                           
                          table(int n){ 
                                                                                                                                                                                                                             
                                   this.n=n;                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                  
                                    }                                  
                                                                            
                           public void run ( ) { 
                                                 
                                           tables();
                                                          
   		                           try { Thread.sleep(100);  }catch (Exception e){ }            }  
                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                                           }

public class Test1 { 
   
        public static void main (String [ ] args){ 
                 
                 table t1=new table (1);
                 table t2=new table (2);                 
                 table t3=new table (3);
                 

                 t1.setPriority(Thread.MAX_PRIORITY);
                 t2.setPriority(Thread.NORM_PRIORITY);               
                 t3.setPriority(Thread.MIN_PRIORITY);

       t1.start();
       t2.start();                  
       t3.start();

                 
                 
                 

                                                }
     
 }
