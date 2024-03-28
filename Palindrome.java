for(int i=1;i<=len(n)/2;i++){
            int l1=l-i+1;
   System.out.print(i);
            System.out.print("  d1: " +digit(n,i)+"  d2:"+digit(n,l)+" ");
            if (digit(n,i)==digit(n,l1)){

            }
            else if (digit(n,i)!=digit(n,l-i+1)){
                System.out.print("Elsif @!@");
                b=false;
                break;
            }
        }
