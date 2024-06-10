class table extends Thread{ 

                     int n; 
                           
                        table(int n){ 
                                                                                                                                                                                                                             
                                   this.n=n;                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                  
                                    }



   	                 public void  tables( ){ 
                                     
				      int sp=1,tbs;
                                      
// while (t1.isalive)   { try{ wait();} catch(Exception e){ } }

        
                                      for (int i =0;i<=10;++i){ 
                         
			 	      //        for (int j =1;j<=n;j++){ System.out.print("      ");} 			
			 	              
			 		      System.out.println(n+" X "+i+" = "+n*i+"\n");
                         
		                                 try{Thread.sleep(1000);}catch(Exception e){ }
                          
                                                         }
                                               }   
                                                           
                                                                            
                           public void run ( ) { 
                                                 
                                           tables();
                                                          
   		                           try { Thread.sleep(1000);  }catch (Exception e){ }            }  
                                                                                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                                           }



public class Tables  { 
   
        public static void main (String [ ] args){ 
                 
                 table t1=new table (1);
                 table t2=new table (2);                 
                 table t3=new table (3);
                 

                 t1.setPriority(Thread.MAX_PRIORITY);
                 t2.setPriority(Thread.NORM_PRIORITY);               
                 t3.setPriority(Thread.MIN_PRIORITY);

       t1.start();


       t2.start();                  
while(t1.isAlive ){   try { t2.wait (); }  catch(Exception e){ } }
  t2.notify( );

       t3.start();
while ( t2.isAlive || t1.isAlive ){ try {t3.wait (); }catch(Exception e){ } }
  t3.notify( );

                 while (t1.isAlive()){ 
                                                            
                                         System.out.print(" t1 alive ");                   
                                                   try{ Thread.sleep(1000); }catch(Exception e){ }         
                                                            
				    	        }
                                
                                        }
 
                             }
