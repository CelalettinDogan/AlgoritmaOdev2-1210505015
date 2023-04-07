import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HorspoolKelimeSayisi {

    public static void main(String[] args) throws IOException {
        String dosyaYolu = "src/alice_in_wonderland.txt";
        String[] kelimeler = {"upon", "sigh", "Dormouse", "jury-box", "swim"};
        int[] sayilar = kelimeSayisi(dosyaYolu, kelimeler);
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i] + " kelimesi " + sayilar[i] + " kez tekrar edildi.");
        }
    }

    public static int[] kelimeSayisi(String dosyaYolu, String[] kelimeler) throws IOException {
        int[] sayilar = new int[kelimeler.length];
        File file = new File(dosyaYolu);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String satir;
        while ((satir = reader.readLine()) != null) {
            for (int i = 0; i < kelimeler.length; i++) {
                int index = horspool(satir, kelimeler[i]);
                while (index >= 0) {
                    sayilar[i]++;
                    index = horspool(satir.substring(index + kelimeler[i].length()), kelimeler[i]);
                    if (index >= 0) {
                        index += satir.length() - (index + kelimeler[i].length());
                    }
                }
            }
        }
        reader.close();
        return sayilar;
    }

    public static int horspool(String metin, String aranan) {
        int m = aranan.length();
        int n = metin.length();
        int[] t = new int[256];
        for (int i = 0; i < t.length; i++) {
            t[i] = m;
        }
        for (int i = 0; i < m - 1; i++) {
            t[aranan.charAt(i)] = m - 1 - i;
        }
        int i = m - 1;
        while (i < n) {
            int k = 0;
            while (k < m && aranan.charAt(m - 1 - k) == metin.charAt(i - k)) {
                k++;
            }
            if (k == m) {
                return i - m + 1;
            } else {
                i += t[metin.charAt(i)];
            }
        }
        return -1;
    }
}
