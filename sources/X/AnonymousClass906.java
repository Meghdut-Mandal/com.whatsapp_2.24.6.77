package X;

/* renamed from: X.906  reason: invalid class name */
public enum AnonymousClass906 {
    A0Q("UNKNOWN", false);
    
    public final int errorCode;
    public final AnonymousClass94f reliabilityLabel;
    public final boolean retryable;

    public static AnonymousClass906 A01(String str, int i, int i2, boolean z) {
        return new AnonymousClass906(i, i2, str, z);
    }

    /* access modifiers changed from: public */
    AnonymousClass906(String str, boolean z) {
        this.errorCode = r3;
        this.reliabilityLabel = new AnonymousClass94f();
        this.retryable = z;
    }

    public static AnonymousClass906 A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            AnonymousClass6YR.A0D("VideoErrorCode", "Cannot convert errorCode %s", e, AnonymousClass000.A1b(str));
            return A0Q;
        }
    }
}
