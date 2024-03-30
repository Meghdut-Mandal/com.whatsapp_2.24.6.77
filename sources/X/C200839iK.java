package X;

/* renamed from: X.9iK  reason: invalid class name and case insensitive filesystem */
public final class C200839iK {
    public static final C200839iK A00 = new C200839iK(false);
    public volatile C200839iK next;
    public volatile Thread thread;

    public C200839iK(boolean z) {
    }

    public C200839iK() {
        AnonymousClass9Y4 r2 = A6T.A01;
        Thread currentThread = Thread.currentThread();
        if (r2 instanceof C1684180n) {
            this.thread = currentThread;
        } else {
            ((C1684280o) r2).A03.lazySet(this, currentThread);
        }
    }
}
