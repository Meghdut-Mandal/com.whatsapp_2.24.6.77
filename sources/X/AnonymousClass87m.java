package X;

/* renamed from: X.87m  reason: invalid class name */
public class AnonymousClass87m extends C20967A1a {
    public AnonymousClass9CG A00;

    public void close() {
        synchronized (this) {
            AnonymousClass9CG r1 = this.A00;
            if (r1 != null) {
                this.A00 = null;
                synchronized (r1) {
                }
            }
        }
    }

    public void finalize() {
        boolean A1W;
        synchronized (this) {
            A1W = AnonymousClass000.A1W(this.A00);
        }
        if (!A1W) {
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = C90484aE.A0k(this);
            AnonymousClass000.A1L(A0M, System.identityHashCode(this), 1);
            C132886Vq.A03("CloseableImage", "finalize: %s %x still open.", A0M);
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public synchronized int getSizeInBytes() {
        int i;
        AnonymousClass9CG r0 = this.A00;
        if (r0 == null) {
            i = 0;
        } else {
            i = r0.A00.getSizeInBytes();
        }
        return i;
    }

    public AnonymousClass87m(AnonymousClass9CG r1) {
        this.A00 = r1;
    }

    public AnonymousClass87m() {
    }
}
