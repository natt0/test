public class calculadora{

    public static void main(String[] args){
        if(args.length == 3){
          try{
            int opt1 = Integer.parseInt(args[1]);
            int opt2 = Integer.parseInt(args[2]);
            if("+".equals(args[0])){
              System.out.println(opt1 + opt2);
            }else if("-".equals(args[0])){
                System.out.println(opt1 - opt2);
            }else{
              System.out.println(args[0] + ": operaciones desconocidas");
            }

          }catch(Exception ex){
            System.out.println("Parametros incorrectos");
          }
      }else{
        System.out.println("Uso: Calculadora operador operando2 operando3");
      }
    }
}
