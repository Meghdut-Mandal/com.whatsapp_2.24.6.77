package X;

/* renamed from: X.8zi  reason: invalid class name and case insensitive filesystem */
public enum C188518zi {
    AUTO_ADD_DISABLED_GROUP_IS_FULL(0, "full"),
    AUTO_ADD_DISABLED_BY_SERVER(1, "server");
    
    public final String reason;
    public final int versionId;

    /* access modifiers changed from: public */
    static {
        C188518zi[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    C188518zi(int i, String str) {
        this.versionId = i;
        this.reason = str;
    }
}
