package test;

class customException extends Exception{

    @Override
    public String getMessage() {
        return "Strings not allowed in this function";
    }

}
class genericFunctionClass{


    public <T> void genericFunction(T... args){
       int itemsToPrint = (args.length * 2)/3;
       try{

           // Check the types of arguments passed in
           for(T i : args){
               if(i instanceof String){
                    throw new customException();
               }
           }

           // If the type checking test is passed, then print 2/3 of the values
           for(int i = 0; i <= itemsToPrint ; i ++){
               System.out.println(args[i]);
           }
       }catch(customException e){
           System.out.println(e.getMessage());
       }
    }
}

public class assignment1_8 {

    assignment1_8(){
        genericFunctionClass generic = new genericFunctionClass();

        //to test exception handling
        generic.genericFunction(1,2,3,"String");

        //to test printing
        generic.genericFunction(1,2,3,4,5,6,7,8,9,10);

    }

    public static void main(String[] args) {
        assignment1_8 test = new assignment1_8();
    }



}
