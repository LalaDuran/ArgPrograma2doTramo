package guia5ejercicio7;

public class MatrizCuadrada {

    private int M;
    private int[][] matriz;

    public MatrizCuadrada(int M) {
        this.M = M;
        this.matriz = new int[M][M];
    }

    public int[][] getMatriz() { //agregué el get para poder llamar la matriz como parámetro
        return matriz;
    }

    public void rellenarMatriz() {
        for (int f = 0; f < this.M; f++) {
            for (int c = 0; c < this.M; c++) {
                this.matriz[f][c] = (int) (Math.random() * (2 - 1 + 1) + 1);
            }
        }
    }

    public void imprimeMatriz() {
        System.out.println("- - Imprime para control - -");
        for (int f = 0; f < M; f++) {
            for (int c = 0; c < M; c++) {
                System.out.print("[" + this.matriz[f][c] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void incluyeMatrizMenor(int[][] matrizP) {

        int vF = 0, vC = 0;
        for (int f = 0; f < M; f++) {
            for (int c = 0; c < M; c++) {
                if (matrizP[0][0] == this.matriz[f][c]) {
                    vF = f;
                    vC = c;

                    if (vF < 8 && vC < 8) {
                        if (matrizP[0][1] == this.matriz[vF][vC + 1]) {
                            if (matrizP[0][2] == this.matriz[vF][vC + 2]) {
                                if (matrizP[1][0] == this.matriz[vF + 1][vC]) {
                                    if (matrizP[1][1] == this.matriz[vF + 1][vC + 1]) {
                                        if (matrizP[1][2] == this.matriz[vF + 1][vC + 2]) {
                                            if (matrizP[2][0] == this.matriz[vF + 2][vC]) {
                                                if (matrizP[2][1] == this.matriz[vF + 2][vC + 1]) {
                                                    if (matrizP[2][2] == this.matriz[vF + 2][vC + 2]) {
                                                        System.out.println("¡¡¡ALCOYANA-ALCOYANA!!!" + '\n' + "El vértice es [" + vF + "," + vC + "]");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
