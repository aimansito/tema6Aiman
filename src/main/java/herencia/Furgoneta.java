/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author aiman
 */
public class Furgoneta extends Vehiculo {
    //constructores sobrecargados
    //mismo metodo en la misma clase 
    private double cargaMax;

    public Furgoneta(double cargaMax, String matricula, String bastidor, String marca, Double tarifa) {
        super(matricula, bastidor, marca, tarifa);
        this.cargaMax = cargaMax;
    }

    public Furgoneta() {
    }
    
    public Furgoneta (double cargaMax,String matricula,String bastidor){
        super(matricula,bastidor,null,0.0);
        this.cargaMax = cargaMax;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furgoneta{");
        sb.append("cargaMax=").append(cargaMax);
        sb.append("Super: ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.cargaMax) ^ (Double.doubleToLongBits(this.cargaMax) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Furgoneta other = (Furgoneta) obj;
        return Double.doubleToLongBits(this.cargaMax) == Double.doubleToLongBits(other.cargaMax);
    }
    public void aumentarCarga(double cantidad){
        this.cargaMax+=cantidad;
    }
    @Override
    public void pasarItv(){
        System.out.println("Soy una furgoneta y estoy pasando la itv");
    }
}
