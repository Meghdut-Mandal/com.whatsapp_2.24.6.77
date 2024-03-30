package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0AA  reason: invalid class name */
public abstract class AnonymousClass0AA {
    public static final C023509x A00(Object obj, C023509x r3, C009003v r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (r4 instanceof AnonymousClass09z) {
            return ((AnonymousClass09z) r4).create(obj, r3);
        }
        C005102h context = r3.getContext();
        if (context == C008903u.A00) {
            return new C14060kt(obj, r3, r4);
        }
        return new C13710kK(obj, r3, context, r4);
    }

    public static final C023509x A01(C023509x r1) {
        AnonymousClass0A0 r0;
        AnonymousClass00C.A0D(r1, 0);
        if (!(r1 instanceof AnonymousClass0A0) || (r0 = (AnonymousClass0A0) r1) == null) {
            return r1;
        }
        return r0.intercepted();
    }

    public static AnonymousClass0AR A02(C023509x r2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r0 = new AnonymousClass0AR(1, A01(r2));
        r0.A0J();
        return r0;
    }
}
