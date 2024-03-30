package X;

/* renamed from: X.9e0  reason: invalid class name and case insensitive filesystem */
public class C198669e0 {
    public final String A00;
    public final String A01;

    public boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }

    public C198669e0(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C198669e0(C198669e0... r8) {
        String str = "";
        String str2 = str;
        int i = 0;
        do {
            C198669e0 r2 = r8[i];
            str = AnonymousClass000.A0q(r2.A01, AnonymousClass000.A0v(str));
            str2 = AnonymousClass000.A0q(r2.A00, AnonymousClass000.A0v(str2));
            i++;
        } while (i < 2);
        this.A01 = str;
        this.A00 = str2;
    }
}
