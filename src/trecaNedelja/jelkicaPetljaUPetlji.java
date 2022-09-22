package trecaNedelja;

public class jelkicaPetljaUPetlji {
    public static void main(String[] args) {
        String z="*";
        int visina = 5;
        for (int i = 0; i<visina ; i++) {
            for (int j=0; j<visina-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(z);
            z=z+ "**";
        }
    }
}
