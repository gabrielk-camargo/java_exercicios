public class ArraysInteracoes {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        int[] arrayIntNum = new int[arrayInt.length]; // Crie um novo array com o mesmo tamanho

        for (int i = 0; i < arrayInt.length; i++) {
            arrayIntNum[i] = arrayInt[i]; // Copie os elementos um por um
        }

        for (int Number: arrayIntNum) {
            System.out.print(Number);
        }

        // Agora você tem os elementos de arrayInt em arrayIntNum
    }
}