package exams2015ba;

public class Exams2015BA_1 {
    public static int takis(ArrayStack first, ArrayStack second){
        int flag=0;
        
        for (int i = 0 ; i<first.size()+1  ; i++){
            if (first.pop()==second.pop()  ){
                flag=1;
            }
            else {
                flag=-1;break;
            }
        }
        
        return flag;
    }
    public static void main(String[] args) {
       
        ArrayStack Y1 = new ArrayStack(3);
        
        Y1.push(2);
        Y1.push(3);
        Y1.push(6);

        ArrayStack Y2 = new ArrayStack(3);
        
        Y2.push(2);
        Y2.push(5);
        Y2.push(6);
        
        System.out.println ( takis(Y1,Y2) ); 
    }
    
}
