package Modelos;

public class Tiquete {

    private int nRoTiquete;
    private String ciudad;
    private int diasHospedaje;
    private float costoPersona;
    private float costoComida;
    private float descuentos;
    private float subtotal;
    private float totalPago;
    private String pago;

    public Tiquete(){
    
    }

    public Tiquete(int nRoTiquete, String ciudad, int diasHospedaje, float costoPersona, float costoComida, float descuentos, float subtotal, float totalPago, String pago) {
        this.nRoTiquete = nRoTiquete;
        this.ciudad = ciudad;
        this.diasHospedaje = diasHospedaje;
        this.costoPersona = costoPersona;
        this.costoComida = costoComida;
        this.descuentos = descuentos;
        this.subtotal = subtotal;
        this.totalPago = totalPago;
        this.pago = pago;
    }

    public int getNRoTiquete() {
        return this.nRoTiquete;
    }

    public void setNRoTiquete(int nRoTiquete) {
        this.nRoTiquete = nRoTiquete;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDiasHospedaje() {
        return this.diasHospedaje;
    }

    public void setDiasHospedaje(int diasHospedaje) {
        this.diasHospedaje = diasHospedaje;
    }

    public float getCostoPersona() {
        return this.costoPersona;
    }

    public void setCostoPersona(float costoPersona) {
        this.costoPersona = costoPersona;
    }

    public float getCostoComida() {
        return this.costoComida;
    }

    public void setCostoComida(float costoComida) {
        this.costoComida = costoComida;
    }

    public float getDescuentos() {
        return this.descuentos;
    }

    public void setDescuentos(float descuentos) {
        this.descuentos = descuentos;
    }

    public float getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotalPago() {
        return this.totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }

    public String getPago() {
        return this.pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void liquidar(String ciudad, int diasExcursion, int nroPersonas, String tipoPago) {
        // Calcular descuentos
        float descuentoGrupo = calcularDescuentoGrupo(nroPersonas);
        float descuentoCiudad = calcularDescuentoCiudad(ciudad);
        float descuentoTipoPago = calcularDescuentoTipoPago(tipoPago);

        // Calcular subtotal
        subtotal = (costoPersona + costoComida) * diasExcursion * nroPersonas;

        // Aplicar descuentos
        descuentos = subtotal * (descuentoGrupo + descuentoCiudad + descuentoTipoPago);

        // Calcular total a pagar
        totalPago = subtotal - descuentos;

        System.out.println("Liquidación exitosa de la reserva.");
    }

    // Método para calcular el descuento por grupo de personas
    private float calcularDescuentoGrupo(int nroPersonas) {
        if (nroPersonas > 10) {
            return 0.15f;  // 15% de descuento para grupos mayores de 10 personas
        } else if (nroPersonas > 5) {
            return 0.10f;  // 10% de descuento para grupos mayores de 5 personas
        } else {
            return 0;
        }
    }

    // Método para calcular el descuento por ciudad
    private float calcularDescuentoCiudad(String ciudad) {
        if (ciudad.equals("A") || ciudad.equals("B")) {
            return 0.02f;  // 2% de descuento para la ciudad A o B
        } else if (ciudad.equals("C") || ciudad.equals("D")) {
            return 0.05f;  // 5% de descuento para la ciudad C o D
        } else {
            return 0;
        }
    }

    private float calcularDescuentoTipoPago(String tipoPago) {
        float descuentoTipoPago = 0;

        if (tipoPago.equals("efectivo")) {
            descuentoTipoPago = 0.04f;  // 4% de descuento para pago en efectivo
        } else if (tipoPago.equals("tarjeta crédito")) {
            descuentoTipoPago = 0.015f;  // 1.5% de incremento para pago con tarjeta crédito
        }

        return descuentoTipoPago;
    }

    @Override
    public String toString() {
        return "Tiquete{" +
                "nRoTiquete=" + nRoTiquete +
                ", ciudad='" + ciudad + '\'' +
                ", diasHospedaje=" + diasHospedaje +
                ", costoPersona=" + costoPersona +
                ", costoComida=" + costoComida +
                ", descuentos=" + descuentos +
                ", subtotal=" + subtotal +
                ", totalPago=" + totalPago +
                '}';
    }

}