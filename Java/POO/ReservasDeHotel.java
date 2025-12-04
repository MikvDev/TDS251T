/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.POO;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class ReservasDeHotel {
   
        String nomeDoCliente;
        int numeroDeNoite;
        String TipoDeQuarto;
        
        
        public ReservasDeHotel(){
            System.out.println("não tem nada na reserva");
            
        }
        public ReservasDeHotel(String nomeDoCliente){
            this.nomeDoCliente = nomeDoCliente;
        }
        public ReservasDeHotel( String nomeDoCliente, int numeroDeNoite){
            this.nomeDoCliente = nomeDoCliente;
            this.numeroDeNoite = numeroDeNoite;
            
        }
        public ReservasDeHotel(String nomeDoCliente, int numeroDeNoite, String tipoDeQuarto){
            this.nomeDoCliente = nomeDoCliente;
            this.numeroDeNoite = numeroDeNoite;
            this.TipoDeQuarto = tipoDeQuarto;
        }
        
        public void exibirInfo(){
            System.out.println("-----------A reserva-----------");
            System.out.println("nome cliente: " + nomeDoCliente);
            System.out.println("Tipo de quarto: " + TipoDeQuarto);
            System.out.println("numero de noites: " + numeroDeNoite);
            System.out.println("-------------------------------\n");
        }
        public static void main(String[] args) {
        ReservasDeHotel r1 = new ReservasDeHotel("Sidi",10,"Economica");
        ReservasDeHotel r2 = new  ReservasDeHotel("Gabriela", 2, "Premium +");
        ReservasDeHotel r3 = new ReservasDeHotel("Miguel", 40,"Premium +++");
        r1.exibirInfo();
        r2.exibirInfo();
        r3.exibirInfo();
        
    }
}
