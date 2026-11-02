    package modelo;
    import java.lang.Math;

    //Escreva uma classe chamada Ponto2D que pode ser usada para armazenar e manipular a localização de um ponto no plano (x e y). 
    // Você vai precisar implementar os seguintes métodos:

    public class Ponto2D {
        private double x;
        private double y;

        //a) um método set que fixe os dados privados depois que um objeto dessa classe é criado
        public void setPonto(double x, double y){
            this.x = x;
            this.y = y;
        }

        //b) um método que mova o ponto de uma certa quantidade ao longo das direções vertical e horizontal especificadas 
        // pelo primeiro e segundo argumentos
        public void moverPonto(double x, double y){
            this.x += x;
            this.y += y;
        }

        // c) um método para girar o ponto em 90 graus no sentido horário ao redor da origem
        public void girar90(){
            double antigoX = this.x;
            double antigoY = this.y;
            
            this.x = antigoX * Math.cos(-Math.PI / 2) - antigoY * Math.sin(-Math.PI / 2);
            this.y = antigoY * Math.cos(-Math.PI / 2) + antigoX * Math.sin(-Math.PI / 2);
        }
        
        //d) dois métodos get para recuperar as coordenadas atuais do ponto
        
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        //e) um método para mostrar as coordenadas atuais do ponto.
        public void imprimirPonto(){
            System.out.format("\nFazendo a impressão do ponto: (%.2f, %.2f)\n",x, y);
            System.out.format("Sendo x: %.2f\n", x);
            System.out.format("Sendo y: %.2f\n",y);
        } 
    }
