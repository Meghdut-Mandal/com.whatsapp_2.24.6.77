package X;

/* renamed from: X.62o  reason: invalid class name and case insensitive filesystem */
public class C1261062o {
    public final C122465ut A00;
    public final C122465ut A01;
    public final boolean A02;

    public String A00() {
        String str = this.A01.A00;
        String str2 = this.A00.A00;
        if (str.equals(str2)) {
            return str;
        }
        return AnonymousClass000.A0p(";", str2, AnonymousClass000.A0v(str));
    }

    public C1261062o(String str, boolean z) {
        this.A02 = z;
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            C122465ut r0 = new C122465ut(str, z);
            this.A00 = r0;
            this.A01 = r0;
            return;
        }
        this.A01 = new C122465ut(C90514aH.A0z(str, indexOf), z);
        this.A00 = new C122465ut(str.substring(indexOf + 1), z);
    }
}
