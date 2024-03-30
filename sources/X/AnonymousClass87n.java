package X;

/* renamed from: X.87n  reason: invalid class name */
public class AnonymousClass87n extends AnonymousClass87o {
    public void finalize() {
        boolean A1W;
        synchronized (this) {
            A1W = AnonymousClass000.A1W(this.A00);
        }
        if (!A1W) {
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = C90484aE.A0k(this);
            AnonymousClass000.A1L(A0M, System.identityHashCode(this), 1);
            C132886Vq.A03("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", A0M);
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public AnonymousClass87n(AU0 au0, C199209eu r2) {
        super(au0, r2);
    }
}
