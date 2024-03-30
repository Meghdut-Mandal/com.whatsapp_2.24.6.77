package X;

/* renamed from: X.0S6  reason: invalid class name */
public abstract class AnonymousClass0S6 {
    public static final int A00;
    public static final int A01;
    public static final AnonymousClass035 A02 = AnonymousClass035.A00("BROKEN");
    public static final AnonymousClass035 A03 = AnonymousClass035.A00("CANCELLED");
    public static final AnonymousClass035 A04 = AnonymousClass035.A00("PERMIT");
    public static final AnonymousClass035 A05 = AnonymousClass035.A00("TAKEN");

    static {
        long j = (long) 1;
        long j2 = (long) Integer.MAX_VALUE;
        A00 = (int) AnonymousClass030.A00("kotlinx.coroutines.semaphore.maxSpinCycles", (long) 100, j, j2);
        A01 = (int) AnonymousClass030.A00("kotlinx.coroutines.semaphore.segmentSize", (long) 16, j, j2);
    }
}
