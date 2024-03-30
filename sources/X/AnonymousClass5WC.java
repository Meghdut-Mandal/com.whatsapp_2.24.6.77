package X;

/* renamed from: X.5WC  reason: invalid class name */
public abstract class AnonymousClass5WC {
    public static final Object A00(C023509x r2, C006302t r3) {
        C162267oJ r0 = (C162267oJ) r2.getContext().get(C162267oJ.A00);
        if (r0 != null) {
            return r0.BxV(r2, r3);
        }
        throw AnonymousClass001.A09("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
