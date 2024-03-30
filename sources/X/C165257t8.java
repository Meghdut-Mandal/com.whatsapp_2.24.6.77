package X;

/* renamed from: X.7t8  reason: invalid class name and case insensitive filesystem */
public class C165257t8 implements C159237j2 {
    public Object A00;
    public final int A01;

    public C165257t8(C132566Uh r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BXp(AnonymousClass9HF r4, int i) {
        if (this.A01 != 0) {
            C132566Uh r2 = (C132566Uh) this.A00;
            C1497072l.A00(r2.A0B, r2, 47);
            return;
        }
        C36321k7.A1S("Failed to load promotions with errorCode=", AnonymousClass000.A0u(), i);
        C132566Uh r22 = (C132566Uh) this.A00;
        r22.A0C.set(false);
        C36341k9.A19(r22.A01, false);
    }
}
