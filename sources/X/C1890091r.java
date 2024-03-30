package X;

/* renamed from: X.91r  reason: invalid class name and case insensitive filesystem */
public final class C1890091r extends Exception {
    public final int errorCode;
    public final C207099uY format;
    public final boolean isRecoverable;

    public C1890091r(C207099uY r3, int i, boolean z) {
        super(AnonymousClass000.A0r("AudioTrack write failed: ", AnonymousClass000.A0u(), i));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = r3;
    }
}
