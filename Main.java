public class Main {

    public static void main(String[] args) {
        //Usuarios
     Usuario usuario1 = new Usuario("Jorge", "Gómez", 16, 2009);
     Usuario usuario2 = new Usuario("Paula", "Mansilla", 16, 2008);

     //Métodos del objeto
     usuario1.setNombre("Nelson");
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        System.out.println(usuario1.getEdad());
        
        if (usuario1.getEdad() >= 18) {
            System.out.println("Mayor de edad");
        }
    }
}