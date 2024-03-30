package X;

/* renamed from: X.3fw  reason: invalid class name and case insensitive filesystem */
public class C70923fw implements AnonymousClass4Q7 {
    public final C220412q A00;

    public boolean B7L(AnonymousClass11F r4) {
        boolean z;
        Boolean valueOf;
        Boolean bool = Boolean.TRUE;
        C65073Qp A0Z = C36351kA.A0Z(this.A00, r4);
        if (A0Z == null) {
            valueOf = null;
        } else {
            synchronized (A0Z) {
                z = A0Z.A0l;
            }
            valueOf = Boolean.valueOf(z);
        }
        return bool.equals(valueOf);
    }

    public C70923fw(C220412q r1) {
        this.A00 = r1;
    }
}
