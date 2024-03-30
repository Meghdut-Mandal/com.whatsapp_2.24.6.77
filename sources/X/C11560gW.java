package X;

/* renamed from: X.0gW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11560gW implements Runnable {
    public final /* synthetic */ C16800q7 A00;
    public final /* synthetic */ C06200Sr A01;

    public /* synthetic */ C11560gW(C16800q7 r1, C06200Sr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C06200Sr r0 = this.A01;
        C16800q7 r1 = this.A00;
        Object obj = r0.A02;
        if (obj != null) {
            try {
                r1.BQO(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }
}
