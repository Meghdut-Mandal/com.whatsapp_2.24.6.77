package X;

/* renamed from: X.3G0  reason: invalid class name */
public class AnonymousClass3G0 {
    public final AnonymousClass16D A00;
    public final C132696Uw A01;

    public AnonymousClass141 A00(C128946Ef r3, String str) {
        String A03 = this.A01.A03(r3, str);
        try {
            C222713q r0 = AnonymousClass11F.A00;
            AnonymousClass141 A08 = this.A00.A08(C222713q.A01(A03));
            if (A08 != null) {
                return A08;
            }
            throw new SecurityException("Invalid contact ID");
        } catch (C19740wR e) {
            throw new SecurityException(e);
        }
    }

    public String A01(AnonymousClass11F r3, C128946Ef r4) {
        return this.A01.A04(r4, r3.getRawString());
    }

    public AnonymousClass3G0(AnonymousClass16D r1, C132696Uw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
