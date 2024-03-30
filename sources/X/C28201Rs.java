package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Rs  reason: invalid class name and case insensitive filesystem */
public class C28201Rs extends C001700s {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public void A08(AnonymousClass012 r3, AnonymousClass04S r4) {
        if (this.A00 > 0) {
            throw new IllegalStateException("Can not register multiple observers for a *Single*LiveEvent");
        }
        super.A08(r3, new C36211jw(r4, this, 3));
    }

    public void A0D(Object obj) {
        this.A00.set(true);
        super.A0D(obj);
    }

    public C28201Rs(Object obj) {
        super(obj);
    }

    public C28201Rs() {
    }
}
