class twentyOne{
    public static void main(String []args){
        //21-Muestra los números primos entre 1 y 100.
        System.out.println("Un número primo es un número natural mayor que 1 que tiene únicamente dos divisores positivos distintos: él mismo y el 1.");

        System.out.println("Para allar un número primo basta con dividirlo hasta el número menor a su raiz cuadrada.");
        //Como lo dice el encabezado los números primos son naturales mayor que 1 por ello empezaremos desde 2.

        var cont = 2;

        // Mientras cont sea menor o igual a 100 nuestro while se ejecutara.
        while(cont <= 100 ){
            
            //Almacenamos el residuo o modulo en las variables.
            //Como la raíz cuadrada de 100 es 10 basta con que comprobemos hasta 7 que es el primer número primo menor a 10.
            int modulo = cont % 2;
            int modulo2 = cont % 3;
            int modulo3 = cont % 5;
            int modulo4 = cont % 7;
            
            byte permisos = 0;
            
            //Si el conteo es diferente a n y el modulo diferente a 0 damos 1 permiso.
            //Si el modulo entre el conteo y n es 0 significa que n es divisor de cont.
        
            if(cont != 2 && modulo != 0 ){
                permisos++;
            }
            if(cont != 3 && modulo2 != 0){
                permisos ++;
            }
            if(cont != 5 && modulo3 != 0){
                permisos ++;
            }
            if(cont != 7 && modulo4 != 0){
                permisos ++;
            }

            //Si el conteo es igual a n entonces daremos un permiso más, ya que es el mismo número y como la descripción lo dice un número primo es divicible por si mismo.
            if (cont == 2 || cont == 3 || cont == 5 || cont == 7){
                permisos ++;
            }

            //Si se optienen los 4 permisos imprimiremos cont, ya que es un número primo.
            if(permisos == 4){
                System.out.println(cont);
            }

            //aumentamos conteo en 1.
            cont ++;
        }
    }
}