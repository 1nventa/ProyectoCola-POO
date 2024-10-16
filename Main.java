public class Main {
    public static void main(String[] args) {
        
        Computadora comp = new Computadora("Dell", "XPS 13", "Intel i7");
        Usuario user = new Usuario("Juan", "juan@example.com", "password123");
        SistemaOperativo so = new SistemaOperativo("Windows", "10", "Microsoft");

        
        System.out.println(comp);
        System.out.println(user);
        System.out.println(so);
    }
}