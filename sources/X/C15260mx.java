package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0mx  reason: invalid class name and case insensitive filesystem */
public final class C15260mx extends C008603r {
    public final AnonymousClass0AR A00;

    public void A05(Throwable th) {
        AnonymousClass0AR r6 = this.A00;
        Throwable A0I = r6.A0I(A06());
        if (AnonymousClass0AR.A09(r6)) {
            C023509x r4 = r6.A00;
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass0AD.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                AnonymousClass035 r1 = AnonymousClass0AE.A00;
                if (AnonymousClass00C.A0J(obj, r1)) {
                    if (AnonymousClass0A8.A00(r4, r1, A0I, atomicReferenceFieldUpdater)) {
                        return;
                    }
                } else if (obj instanceof Throwable) {
                    return;
                } else {
                    if (AnonymousClass0A8.A00(r4, obj, (Object) null, atomicReferenceFieldUpdater)) {
                        break;
                    }
                }
            }
        }
        r6.B2T(A0I);
        if (!AnonymousClass0AR.A09(r6)) {
            r6.A0K();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }

    public C15260mx(AnonymousClass0AR r1) {
        this.A00 = r1;
    }
}
