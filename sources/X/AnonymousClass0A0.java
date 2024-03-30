package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0A0  reason: invalid class name */
public abstract class AnonymousClass0A0 extends AnonymousClass09z {
    public final C005102h _context;
    public transient C023509x intercepted;

    public C005102h getContext() {
        C005102h r0 = this._context;
        AnonymousClass00C.A0B(r0);
        return r0;
    }

    public final C023509x intercepted() {
        C023509x r1 = this.intercepted;
        if (r1 == null) {
            C005402k r0 = (C005402k) getContext().get(C005402k.A00);
            if (r0 != null) {
                r1 = new AnonymousClass0AD(this, (C005502l) r0);
            } else {
                r1 = this;
            }
            this.intercepted = r1;
        }
        return r1;
    }

    public void releaseIntercepted() {
        AnonymousClass0AR r1;
        C023509x r3 = this.intercepted;
        if (!(r3 == null || r3 == this)) {
            AnonymousClass00C.A0B(getContext().get(C005402k.A00));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass0AD.A04;
            do {
            } while (atomicReferenceFieldUpdater.get(r3) == AnonymousClass0AE.A00);
            Object obj = atomicReferenceFieldUpdater.get(r3);
            if ((obj instanceof AnonymousClass0AR) && (r1 = (AnonymousClass0AR) obj) != null) {
                r1.A0K();
            }
        }
        this.intercepted = AnonymousClass0AS.A00;
    }

    public AnonymousClass0A0(C023509x r1, C005102h r2) {
        super(r1);
        this._context = r2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0A0(X.C023509x r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            X.02h r0 = r2.getContext()
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A0.<init>(X.09x):void");
    }
}
