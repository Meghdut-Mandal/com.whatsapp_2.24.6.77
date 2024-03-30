package X;

import java.lang.ref.WeakReference;

/* renamed from: X.713  reason: invalid class name */
public final class AnonymousClass713 implements C158697hv {
    public final /* synthetic */ WeakReference A00;

    public AnonymousClass713(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    public void BU1(C111855cx r4) {
        C225314u r2;
        AnonymousClass01L r22 = (AnonymousClass01L) this.A00.get();
        if (r22 == null || r22.isDestroyed() || r22.isFinishing()) {
            r22 = null;
        }
        if ((r22 instanceof C225314u) && (r2 = (C225314u) r22) != null) {
            r2.Bnv();
        }
    }
}
