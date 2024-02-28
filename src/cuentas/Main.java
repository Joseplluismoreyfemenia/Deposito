package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300);
        operativa_cuenta(cuenta1, 695);
    }

        public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        	try {
                cuenta.retirar(cantidad);
                System.out.println("Retirada de " + cantidad + " realizada.");
                cuenta.ingresar(cantidad);
                System.out.println("Ingreso de " + cantidad + " realizado.");
            } catch (Exception e) {
                System.out.println("Error al ingresar.");
            }
        }
}