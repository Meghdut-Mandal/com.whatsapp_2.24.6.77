package X;

/* renamed from: X.62F  reason: invalid class name */
public class AnonymousClass62F {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public boolean A00() {
        AnonymousClass005 r6 = this.A01;
        int i = C36341k9.A0E((C19420v0) r6.get()).getInt("shops_privacy_notice", -1);
        AnonymousClass005 r2 = this.A00;
        C21100yf r0 = ((C118075nI) r2.get()).A00;
        C21120yh r1 = C21100yf.A1u;
        if (i >= r0.A04(r1)) {
            return true;
        }
        C36341k9.A0E((C19420v0) r6.get()).getInt("shops_privacy_notice", -1);
        ((C118075nI) r2.get()).A00.A04(r1);
        return false;
    }

    public AnonymousClass62F(AnonymousClass005 r1, AnonymousClass005 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
