public class Exercise {
    public static void main(String[] args) {
        String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "}; // length = 7
        int l = a.length;
        String word;

        for (int i = 0; i < l; i++) {
            System.out.println(a[i]);
        }

        for (int z = 0; z < l; z++) {
            word = a[l - 1 - z];
            a[z] = word;
            a[z] = a[l - 1 - z];
        }

        for (int y = 0; y < l; y++) {
            System.out.println(a[y]);
        }
    }
}