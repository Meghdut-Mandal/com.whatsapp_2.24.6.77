package X;

/* renamed from: X.7om  reason: invalid class name and case insensitive filesystem */
public class C162557om extends C09980dT {
    public Object A00;
    public final int A01;

    public C162557om(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bjc(AnonymousClass054 r2) {
        if (this.A01 != 0) {
            super.Bjc(r2);
        } else {
            Bjd(r2);
        }
    }

    public void Bjd(AnonymousClass054 r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C146646vw r1 = (C146646vw) obj;
            r1.A0D = true;
            float f = r1.A01;
            r1.A00 = f;
            r1.A02 = f;
            return;
        }
        AnonymousClass6X3 r12 = (AnonymousClass6X3) obj;
        r12.A00 = r12.A0D.getTop();
    }
}
