class Bank { 

    public static  int  balance=5000;     

    public synchronized void draw(int draw){ 
				while (draw>balance){ 
                             System.out.println ("\n withdraw usuccesfull ");
		                            notifyAll( );
                                                 try{ wait();}catch(Exception e){ }
			 												}                          	
				
          					balance-=draw;
						System.out.println("\n with draw sucessful");
							
					}

    public synchronized void deposit ( int dep){
				                                 balance+=dep;
				                                 System.out.println("\n Deposited succesfully "+dep );						                                                      
                                                                  notifyAll( );                                 
                                                                                             }

   }


   public  class son extends Thread { 

           Bank  b ;
           int draw=0;

           son (Bank b,int withdraw)                 
                           { 
                             this.draw=withdraw;
                             this.b=b;                                                                                                     
                           }

                
            public  void run ( ){ 
                                            
	        	b.draw(draw);
 

                                                  }                                                                           		
    		
                 } 
             
     
         public  class Dad extends Thread{ 
         
                    int  deposit ;

		    Bank b;

                  Dad ( Bank b,int deposit){                        
       			   	  
                             this.deposit = deposit; 
                             
                             this.b=b;                 
                                                  }                              
                                                                          
                    public  void run(){  
			        try{  wait(); }catch(Exception e){ }
                              b.deposit(deposit);		              
                                                   }              
     		                                    
          }   
        
                                                                                                                                                                                 
             
        




public class test {



public static void main ( String args [ ]){ 
                        

                      Bank b= new Bank(); 

                      son s1 =new son ( b,10000);

                     Dad d1 = new Dad(b,15000);                      
                                                                                                                                                                                              
                                s1.start();                                                                                                                                       
                                                                                                                                                                                              
                                d1.start();   
                                                       
                      }
              }

 //  C:\Users\new\Desktop\txts an java files\test.java




