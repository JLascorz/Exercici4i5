

package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

public class Square {

//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        public double  side;
//</editor-fold>
        
//<editor-fold defaultstate="collapsed" desc="Metodes">

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
            public double getSide(){
                return side;
            }
            public void setSide(double side) {
                if(side <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", side));
                }
                this.side = side;
            }

    //</editor-fold>
            
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Square(double side){
                this.setSide(side);
            }
            
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea(){
            return Math.pow(getSide(), 2);
        }
        public double getPerimeter(){
            return getSide() * 4;
        }
    //</editor-fold>
        
//</editor-fold>

}