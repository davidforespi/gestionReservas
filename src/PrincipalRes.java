import javax.swing.JOptionPane;

import Modelos.Cliente;
import Modelos.Tiquete;

public class PrincipalRes {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Tiquete reserva1 = new Tiquete();

        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU\n" +
                        "1. CAPTURAR DATOS DEL CLIENTE\n" +
                        "2. CAPTURAR DATOS RESERVA\n" +
                        "3. LIQUIDAR RESERVA\n" +
                        "4. MOSTRAR DATOS RESERVA\n" +
                        "5. SALIR\n" +
                        "DIGITE SU OPCION:"));
            } catch (NumberFormatException e) {
                opcion = 0;
            }
            switch (opcion) {
                case 1:
                    // Capturar datos del cliente
                    cliente1.setCedula(JOptionPane.showInputDialog("Ingrese la cédula del cliente:"));
                    cliente1.setNombres(JOptionPane.showInputDialog("Ingrese los nombres del cliente:"));
                    cliente1.setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del cliente:"));
                    cliente1.setTelefono(JOptionPane.showInputDialog("Ingrese el teléfono del cliente:"));
                    cliente1.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del cliente:"));
                    cliente1.setEmail(JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente:"));
                    cliente1.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad del cliente:"));
                    break;
                case 2:
                    // Capturar datos de la reserva
                    reserva1.setNRoTiquete(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del tiquete:")));
                    reserva1.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad de la reserva:"));
                    reserva1.setDiasHospedaje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días de hospedaje:")));
                    reserva1.setCostoPersona(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo por persona:")));
                    reserva1.setCostoComida(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo de comida:")));
                    break;
                case 3:
                    //Capturar cantidad de personas
                    int nroPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas:"));
                    String tipoPago = JOptionPane.showInputDialog("Ingrese el tipo de pago (efectivo, tarjeta crédito):");
                    if (tipoPago != null && !tipoPago.isEmpty()) {
                        reserva1.setPago(tipoPago);
                        reserva1.liquidar(reserva1.getCiudad(), reserva1.getDiasHospedaje(), nroPersonas, tipoPago);
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo de pago inválido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    // Mostrar datos de la reserva
                    JOptionPane.showMessageDialog(null, reserva1.toString(), "Datos de la Reserva", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    // Salir
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opcion != 5);
    }
}
