package X;

/* renamed from: X.3Qy  reason: invalid class name and case insensitive filesystem */
public class C65153Qy implements AnonymousClass4SJ {
    public Object A00;
    public final int A01;

    public C65153Qy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYI() {
        if (this.A01 != 0) {
            C64763Pi r3 = (C64763Pi) this.A00;
            Runnable runnable = r3.A02;
            if (runnable != null) {
                r3.A09.A0G(runnable);
            }
            Runnable runnable2 = r3.A01;
            if (runnable2 != null) {
                r3.A09.A0G(runnable2);
            }
            r3.A02 = null;
            r3.A01 = null;
            AnonymousClass38r r0 = r3.A00;
            if (r0 != null) {
                r0.hashCode();
                AnonymousClass38r r2 = r3.A00;
                r2.A03.A0R((AnonymousClass4SO) null);
                r2.A01 = null;
            }
            r3.A0B.setVisibility(0);
            C64763Pi.A00(r3.A04, r3, 0);
            return;
        }
        C50372ke.A00((C50372ke) this.A00);
    }
}
