package Week3.Acara11_12;

public class ArraySatuDimensi {

    public static void main(String[] args) {
        String[] nama = {"Muhammad", "Zaky", "Abdurrahman"};
        
        System.out.println("Nama lengkap: " + kesatuanNama(nama));
    }
    
    private static String kesatuanNama(String[] nama) {
        StringBuilder namaLengkap = new StringBuilder();
        for (String kata : nama) {
            namaLengkap.append(kata).append(" ");
        }
        return namaLengkap.toString().trim();
    }
}
