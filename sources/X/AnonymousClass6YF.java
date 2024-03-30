package X;

/* renamed from: X.6YF  reason: invalid class name */
public class AnonymousClass6YF implements C158577hj {
    public Object A00;
    public final int A01;

    public AnonymousClass6YF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bho() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass6YP r1 = (AnonymousClass6YP) obj;
            AnonymousClass3DQ r0 = r1.A0F;
            if (r0 != null) {
                r0.A00();
                r1.A0F = null;
                return;
            }
            return;
        }
        C148826zU r12 = (C148826zU) obj;
        int i2 = C148826zU.A12;
        AnonymousClass3DQ r02 = r12.A0K;
        if (r02 != null) {
            r02.A00();
            r12.A0K = null;
        }
    }
}
