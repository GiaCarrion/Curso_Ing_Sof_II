package Laboratorios.Laboratorio2.SingleResponsabilityPrinciple;

public class RegistroUsuariosV2 { 
 
    private String nombre; 
    private String contraseña; 
    
 
    public RegistroUsuariosV2(String nombre, String contraseña) { 
        this.nombre = nombre; 
        this.contraseña = contraseña; 
    } 
 
    public void registrarUsuario() { 
        EncriptacionContra encriptador = new EncriptacionContra();
        String e1 = encriptador.encriptarContraseña(contraseña);

        // Lógica para guardar el usuario en la base de datos 

        System.out.println("Usuario registrado: " + nombre);
        System.out.println("Contrasenia Encriptada: " + e1);
    } 

}
