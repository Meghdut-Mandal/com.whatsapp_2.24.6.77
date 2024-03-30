package X;

/* renamed from: X.6Mc  reason: invalid class name and case insensitive filesystem */
public class C130706Mc {
    public final int A00;
    public final String A01;

    public boolean A00(int i) {
        boolean z = this instanceof C106585Kl;
        int i2 = this.A00;
        if (!z) {
            return AnonymousClass000.A1S(i, i2);
        }
        if (i < i2 || i >= i2 + 4) {
            return false;
        }
        return true;
    }

    public C130706Mc(C147396x9 r2, int i) {
        this.A00 = i;
        this.A01 = r2.getId();
    }

    public C130706Mc(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
