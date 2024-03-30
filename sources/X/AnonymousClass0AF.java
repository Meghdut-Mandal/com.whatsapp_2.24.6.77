package X;

/* renamed from: X.0AF  reason: invalid class name */
public abstract class AnonymousClass0AF {
    public static final C009003v A00 = AnonymousClass0AG.A00;
    public static final AnonymousClass035 A01 = new AnonymousClass035("NO_THREAD_ELEMENTS");
    public static final C009003v A02 = AnonymousClass0AH.A00;
    public static final C009003v A03 = AnonymousClass0AI.A00;

    public static final Object A00(Object obj, C005102h r2) {
        if (obj == null) {
            obj = r2.fold(0, A00);
            AnonymousClass00C.A0B(obj);
        }
        if (obj == 0) {
            return A01;
        }
        if (obj instanceof Integer) {
            return r2.fold(new C06130Sk(r2, ((Number) obj).intValue()), A03);
        }
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw new NullPointerException("updateThreadContext");
    }

    public static final void A01(Object obj, C005102h r2) {
        if (obj == A01) {
            return;
        }
        if (obj instanceof C06130Sk) {
            C17890sE[] r1 = ((C06130Sk) obj).A01;
            int length = r1.length - 1;
            if (length >= 0) {
                AnonymousClass00C.A0B(r1[length]);
                throw new NullPointerException("restoreThreadContext");
            }
            return;
        }
        AnonymousClass00C.A0E(r2.fold((Object) null, A02), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw new NullPointerException("restoreThreadContext");
    }
}
