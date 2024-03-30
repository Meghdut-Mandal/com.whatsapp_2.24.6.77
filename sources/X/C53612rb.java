package X;

/* renamed from: X.2rb  reason: invalid class name and case insensitive filesystem */
public class C53612rb implements AnonymousClass4TU {
    public Object A00;
    public Object A01;
    public final int A02;

    public C53612rb(AnonymousClass39Q r1, AnonymousClass4TU r2, int i) {
        this.A02 = i;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onFailure(Exception exc) {
        int i;
        int i2 = this.A02;
        AnonymousClass00C.A0D(exc, 0);
        AnonymousClass17Y r2 = ((AnonymousClass39Q) this.A01).A00;
        Object obj = this.A00;
        if (i2 != 0) {
            i = 2;
        } else {
            i = 1;
        }
        r2.A0H(C80313vC.A00(obj, exc, i));
    }

    public void onSuccess() {
        AnonymousClass17Y r3;
        Runnable r2;
        if (this.A02 != 0) {
            AnonymousClass39Q r4 = (AnonymousClass39Q) this.A01;
            r3 = r4.A00;
            r2 = new C1502374m(r4, (AnonymousClass4TU) this.A00, 13);
        } else {
            r3 = ((AnonymousClass39Q) this.A01).A00;
            r2 = new C81133wW(this.A00, 1);
        }
        r3.A0H(r2);
    }
}
