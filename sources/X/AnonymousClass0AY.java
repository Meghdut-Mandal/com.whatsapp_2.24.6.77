package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0AY  reason: invalid class name */
public class AnonymousClass0AY extends C009904e {
    public final /* synthetic */ AnonymousClass04Z A00;
    public final /* synthetic */ AnonymousClass02E A01;
    public final /* synthetic */ AtomicReference A02;

    public AnonymousClass0AY(AnonymousClass04Z r1, AnonymousClass02E r2, AtomicReference atomicReference) {
        this.A01 = r2;
        this.A02 = atomicReference;
        this.A00 = r1;
    }

    public void A00() {
        C009904e r0 = (C009904e) this.A02.getAndSet((Object) null);
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A01(AnonymousClass0YW r3, Object obj) {
        C009904e r0 = (C009904e) this.A02.get();
        if (r0 != null) {
            r0.A01(r3, obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
