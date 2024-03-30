package X;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;

/* renamed from: X.3LK  reason: invalid class name */
public abstract class AnonymousClass3LK {
    public static final Object A00(AnonymousClass01P r2, AnonymousClass01M r3, C023509x r4, C009003v r5) {
        Object A00;
        if (r2 == AnonymousClass01P.INITIALIZED) {
            throw AnonymousClass001.A08("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (((AnonymousClass01N) r3).A02 == AnonymousClass01P.DESTROYED || (A00 = C009403z.A00(r4, new RepeatOnLifecycleKt$repeatOnLifecycle$3(r2, r3, (C023509x) null, r5))) != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        } else {
            return A00;
        }
    }

    public static final Object A01(AnonymousClass01P r1, AnonymousClass012 r2, C023509x r3, C009003v r4) {
        AnonymousClass01M lifecycle = r2.getLifecycle();
        AnonymousClass00C.A08(lifecycle);
        Object A00 = A00(r1, lifecycle, r3, r4);
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A00;
    }
}
