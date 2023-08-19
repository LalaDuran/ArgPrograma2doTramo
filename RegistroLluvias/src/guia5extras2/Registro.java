package guia5extras2;

import java.text.DecimalFormat;

public class Registro {

    private Dato[][] matrizRegistro;
    private String[] meses;
    private String[] ciudades;

    public Registro() {
        this.meses = new String[12];
        this.ciudades = new String[3];
        this.matrizRegistro = new Dato[meses.length][ciudades.length];

    }

    public void cargarCiudades(String ciudad) {
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i] == null) {
                ciudades[i] = ciudad;
                break; // Si no ponía break completaba todo con San Luis, la 1ra. cargada
            }
        }
    }

    public final void cargarMeses() {
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";

    }

    public void llenarRegistro(Dato datoGenerico) {
        cargarMeses();  // para que me cargue los meses!!!!
        for (int m = 0; m < meses.length; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                if (datoGenerico.getMes().equals(meses[m]) && datoGenerico.getLocalidad().equals(ciudades[c])) {
                    
                    matrizRegistro[m][c] = datoGenerico;

                }
            }
        }

    }

    public void imprimeMatriz() {  
        //encabezado
        System.out.print("          |  ");
        for(int c=0;c<ciudades.length;c++){
            System.out.print(ciudades[c]+"   ");
        }
        System.out.print("Promedio mensual  ");
        System.out.println("");
        // variables necesarias para el dato final
        double mayor = matrizRegistro[0][0].getMilimetros();
        String mesMayor = null;
        String ciudadMayor = null;
        String nombreMayor = null;
        String apellidoMayor = null;
        for (int m = 0; m < meses.length; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                mayor = Math.max(mayor, matrizRegistro[m][c].getMilimetros());
            }
        }  
        for (int m = 0; m < meses.length; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                if(mayor == matrizRegistro[m][c].getMilimetros()){
                mesMayor = meses[m];
                ciudadMayor = ciudades[c];
                nombreMayor = matrizRegistro[m][c].getNombre();
                apellidoMayor = matrizRegistro[m][c].getApellido();
                }
            }
        }
        //enero
        System.out.print(meses[0]+"     | ");
        int suma = 0;
        for (int m = 0; m < 1; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        DecimalFormat df = new DecimalFormat ("#.0");
        System.out.print("            "+df.format((double) suma / 3));
        System.out.println("");
        //febrero
        System.out.print(meses[1]+"   | ");
        suma = 0;
        for (int m = 1; m < 2; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));        
        System.out.println("");
        //marzo
        System.out.print(meses[2]+"     | ");
        suma = 0;
        for (int m = 2; m < 3; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //abril
        System.out.print(meses[3]+"     | ");
        suma = 0;
        for (int m = 3; m < 4; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //mayo
        System.out.print(meses[4]+"      | ");
        suma = 0;
        for (int m = 4; m < 5; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //junio
        System.out.print(meses[5]+"     | ");
        suma = 0;
        for (int m = 5; m < 6; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //julio
        System.out.print(meses[6]+"     | ");
        suma = 0;
        for (int m = 6; m < 7; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //agosto
        System.out.print(meses[7]+"    | ");
        suma = 0;
        for (int m = 7; m < 8; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //septiembre
        System.out.print(meses[8]+"| ");
        suma = 0;
        for (int m = 8; m < 9; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //octubre
        System.out.print(meses[9]+"   | ");
        suma = 0;
        for (int m = 9; m < 10; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //noviembre
        System.out.print(meses[10]+" | ");
        suma = 0;
        for (int m = 10; m < 11; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //diciembre
        System.out.print(meses[11]+" | ");
        suma = 0;
        for (int m = 11; m < 12; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("    " + matrizRegistro[m][c].getMilimetros()+"    ");
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("            "+df.format((double) suma/3));
        System.out.println("");
        //pie
        System.out.println("_____________________________________________________________________");
        System.out.print("PROMEDIO X "+'\n'+"  CIUDAD");
        //San Luis
        suma = 0;
        for (int m = 0; m < meses.length; m++) {
            for (int c = 0; c < 1; c++) {
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("       "+df.format((double) suma/12));
        //Merlo
        suma = 0;
        for (int m = 0; m < meses.length; m++) {
            for (int c = 1; c < 2; c++) {
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("       "+df.format((double) suma/12));
        //Villa Mercedes
        suma = 0;
        for (int m = 0; m < meses.length; m++) {
            for (int c = 2; c < 3; c++) {
                suma += matrizRegistro[m][c].getMilimetros();
            }
        }
        System.out.print("       "+df.format((double) suma/12));
        System.out.println("");
        System.out.println("_____________________________________________________________________");
        
        //viene de la línea 65
        System.out.println("");
        System.out.println("El mes más lluvioso fue "+mesMayor+" en la ciudad de "+ciudadMayor+" con "+mayor+" mm."+'\n'+"El dato fue relevado por "+nombreMayor+" "+apellidoMayor+".");
        System.out.println("");
        
    }
    
// ME PASÓ AGUSTÍN: Arrays.asList(nombres).contains("cadena a buscar");
}    
