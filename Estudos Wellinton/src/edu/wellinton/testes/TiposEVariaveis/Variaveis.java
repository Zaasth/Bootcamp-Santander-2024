package edu.wellinton.testes.TiposEVariaveis;

public class Variaveis {
    public static void main(String[] args) {
        byte tetseByte = 10; //valor min: -128 | Valor max: 127 | Uso de memória: 1byte
        short tetseShort = 10; //valor min: -32.768 | Valor max: 32.767 | Uso de memória: 2 bytes
        int tetseInt = 10; //valor min: -2.147.483.648 | Valor max: 2.147.483.647 | Uso de memória: 4 bytes
        long tetseLong = 10; //valor min: -9.223.372.036.854.775.808 | Valor max: 9.223.372.036.854.775.807 | Uso de memória: 8 bytes
        float tetseFloat = 10f; //valor min: -3,4028E + 38 | Valor max: 3,4028E + 38 | Uso de memória: 4 bytes | Precisão: 6 – 7 dígitos
        double tetseDouble = 10; //valor min: -1,7976E + 308 | Valor max: 1,7976E + 308 | Uso de memória: 8 bytes | Precisão: 15 dígitos
        /*
        Apesar de o tipo float, ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação
        que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.
         */
        System.out.println("Número: " + tetseByte);
    }
}
