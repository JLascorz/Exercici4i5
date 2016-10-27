

package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

import java.util.Random;

public class Color {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private int red;
    private int green;
    private int blue;
    
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter=0;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Mètodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
        //RED
        public int getRed(){
            return red;
        }
        public void setRed(int red){
            if(red < 0 || red > 255){
                throw new IllegalArgumentException(String.format("Valor %d no valid.", red));
            }
            this.red = red;
        }
        
        //GREEN
        public int getGreen(){
            return green;
        }
        public void setGreen(int green){
            if(green < 0 || green > 255){
                throw new IllegalArgumentException(String.format("Valor %d no valid.", green));
            }
            this.green = green;
        }
        
        //BLUE
        public int getBlue(){
            return blue;
        }
        public void setBlue(int blue){
            if(blue < 0 || blue > 255){
                throw new IllegalArgumentException(String.format("Valor %d no valid.", blue));
            }
            this.blue = blue;
        }
        

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Color(int red, int green, int blue){
            counter++;
            this.setRed(red);
            this.setGreen(green);
            this.setBlue(blue);
        }
        public Color(){
            this(MIN_VALUE, MIN_VALUE, MIN_VALUE);
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes D'objectes">
        public String toRGBString(boolean upper){
            return String.format(upper ? "RGB(R-> %d, G-> %d, B-> %d)" : "rgb(r-> %d, g-> %d, b-> %d", getRed(), getGreen(), getBlue());
        }
        
        public String toRGBString(){
            return toRGBString(true);
        }
        public String toHexString(boolean upper){
            return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x",
                        getRed(), getGreen(), getBlue());
        }
        public String toHexString(){
            return toHexString(true);
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        public static int getCounter(){
            return counter;
        }
        
        //HEXADECIMAL
        
        public static Color fromHexString(String color){
            if (color == null){
                throw new NullPointerException("Es obligatori indicar una" + "cadena de text");
            }
            if (!color.matches("^#[0-9A-F-a-f]{6}$")){
                throw new IllegalArgumentException(
                        String.format("El text %s no te format hexadecimal", color));
            }
            return new Color(Integer.parseInt(color.substring(1, 3), 16),
                            Integer.parseInt(color.substring(3, 5), 16),
                            Integer.parseInt(color.substring(5, 7), 16));
        }
        
        //RANDOM
        
        public static Color getRandom(){
            Random aleatori = new Random();

            return new Color(aleatori.nextInt(256), aleatori.nextInt(256), aleatori.nextInt(256));
        }
    //</editor-fold>
//</editor-fold>
}

