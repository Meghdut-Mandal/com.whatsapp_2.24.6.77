package X;

/* renamed from: X.5bZ  reason: invalid class name and case insensitive filesystem */
public abstract class C110995bZ {
    public static final String A00(String str) {
        int i;
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length > 4) {
            i = length - 4;
            str = C90494aF.A0d(str, i);
        } else {
            i = 0;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < i; i2++) {
            A0u.append('*');
        }
        String A0q = AnonymousClass000.A0q(str, A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }

    public static void A01(AnonymousClass68C r0) {
        A00(r0.A0H);
    }
}
