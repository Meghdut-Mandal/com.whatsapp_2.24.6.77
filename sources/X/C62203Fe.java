package X;

/* renamed from: X.3Fe  reason: invalid class name and case insensitive filesystem */
public class C62203Fe {
    public final C21010yW A00;

    public void A00(Boolean bool, Integer num, Long l, String str, int i, int i2) {
        AnonymousClass2RJ r3 = new AnonymousClass2RJ();
        r3.A00 = bool;
        r3.A02 = Integer.valueOf(i);
        r3.A03 = num;
        r3.A01 = Integer.valueOf(i2);
        r3.A05 = str;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue < 0 || longValue >= 100) {
                r3.A04 = -1L;
            } else {
                r3.A04 = l;
            }
        }
        this.A00.Bly(r3);
    }

    public void A01(String str, boolean z, boolean z2) {
        AnonymousClass2PU r1 = new AnonymousClass2PU();
        r1.A01 = Boolean.valueOf(z);
        r1.A00 = Boolean.valueOf(z2);
        r1.A02 = str;
        this.A00.Blw(r1);
    }

    public C62203Fe(C21010yW r1) {
        this.A00 = r1;
    }
}
