
package guia5extras2;

public class Guia5Extras2 {

    public static void main(String[] args) {
        
        Dato uno = new Dato("Arias","Pedro", (int) (Math.random() * (99-10+1) + 10),"enero","Merlo");
        Dato dos = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"febrero","Merlo");
        Dato tres = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"marzo","Merlo");
        Dato cuatro = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"abril","Merlo");
        Dato cinco = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"mayo","Merlo");
        Dato seis = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"junio","Merlo");
        Dato siete = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"julio","Merlo");
        Dato ocho = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"agosto","Merlo");
        Dato nueve = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"septiembre","Merlo");
        Dato diez = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"octubre","Merlo");
        Dato once = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"noviembre","Merlo");
        Dato doce = new Dato("Arias","Pedro",(int) (Math.random()*(99-10+1)+10),"diciembre","Merlo");
        Dato trece = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"enero","San Luis");
        Dato catorce = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"febrero","San Luis");
        Dato quince = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"marzo","San Luis");
        Dato dieciseis = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"abril","San Luis");
        Dato diecisiete = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"mayo","San Luis");
        Dato dieciocho = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"junio","San Luis");
        Dato diecinueve = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"julio","San Luis");
        Dato veinte = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"agosto","San Luis");
        Dato veintiuno = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"septiembre","San Luis");
        Dato veintidos = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"octubre","San Luis");
        Dato veintitres = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"noviembre","San Luis");
        Dato veinticuatro = new Dato("Benítez","Cecilia",(int) (Math.random()*(99-10+1)+10),"diciembre","San Luis");
        Dato veinticinco = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"enero","Villa Mercedes");
        Dato veintiseis = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"febrero","Villa Mercedes");
        Dato veintisiete = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"marzo","Villa Mercedes");
        Dato veintiocho = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"abril","Villa Mercedes");
        Dato veintinueve = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"mayo","Villa Mercedes");
        Dato treinta = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"junio","Villa Mercedes");
        Dato treintayuno = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"julio","Villa Mercedes");
        Dato treintaydos = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"agosto","Villa Mercedes");
        Dato treintaytres = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"septiembre","Villa Mercedes");
        Dato treintaycuatro = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"octubre","Villa Mercedes");
        Dato treintaycinco = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"noviembre","Villa Mercedes");
        Dato treintayseis = new Dato("Correa","Ana",(int) (Math.random()*(99-10+1)+10),"diciembre","Villa Mercedes");
        
        Registro unico = new Registro();
        
        unico.cargarCiudades("San Luis");
        unico.cargarCiudades("Merlo");
        unico.cargarCiudades("Villa Mercedes");
              
        unico.llenarRegistro(uno);
        unico.llenarRegistro(dos);
        unico.llenarRegistro(tres);
        unico.llenarRegistro(cuatro);
        unico.llenarRegistro(cinco);
        unico.llenarRegistro(seis);
        unico.llenarRegistro(siete);
        unico.llenarRegistro(ocho);
        unico.llenarRegistro(nueve);
        unico.llenarRegistro(diez);
        unico.llenarRegistro(once);
        unico.llenarRegistro(doce);
        unico.llenarRegistro(trece);
        unico.llenarRegistro(catorce);
        unico.llenarRegistro(quince);
        unico.llenarRegistro(dieciseis);
        unico.llenarRegistro(diecisiete);
        unico.llenarRegistro(dieciocho);
        unico.llenarRegistro(diecinueve);
        unico.llenarRegistro(veinte);
        unico.llenarRegistro(veintiuno);
        unico.llenarRegistro(veintidos);
        unico.llenarRegistro(veintitres);
        unico.llenarRegistro(veinticuatro);
        unico.llenarRegistro(veinticinco);
        unico.llenarRegistro(veintiseis);
        unico.llenarRegistro(veintisiete);
        unico.llenarRegistro(veintiocho);
        unico.llenarRegistro(veintinueve);
        unico.llenarRegistro(treinta);
        unico.llenarRegistro(treintayuno);
        unico.llenarRegistro(treintaydos);
        unico.llenarRegistro(treintaytres);
        unico.llenarRegistro(treintaycuatro);
        unico.llenarRegistro(treintaycinco);
        unico.llenarRegistro(treintayseis);
        
        unico.imprimeMatriz();
        
        
    
    }
    
}
