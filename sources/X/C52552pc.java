package X;

/* renamed from: X.2pc  reason: invalid class name and case insensitive filesystem */
public enum C52552pc {
    A02("BAD_REQUEST", false),
    A04("GROUP_NOT_FOUND", false),
    A05("GROUP_SUSPENDED", false),
    A07("RATE_LIMITED", true),
    A06("INTERNAL_SERVER_ERROR", true),
    A03("DEFAULT", false);
    
    public final int code;
    public final boolean isRecoverable;

    /* access modifiers changed from: public */
    static {
        C52552pc[] r1;
        A00 = C000900k.A00(r1);
    }

    /* access modifiers changed from: public */
    C52552pc(String str, boolean z) {
        this.code = r2;
        this.isRecoverable = z;
    }
}
