package X;

/* renamed from: X.8zk  reason: invalid class name and case insensitive filesystem */
public enum C188538zk {
    A04("NONE", r13),
    A05("REQUESTER_ACCOUNT_DELETED", r3),
    A08("REQUESTER_NOT_AUTHORIZED", r4),
    A07("REQUESTER_FORBIDDEN", r4),
    A0A("REQUEST_DELETED", r3),
    A06("REQUESTER_ALREADY_IN_GROUP", C188428zZ.APPROVED.value),
    A09("REQUEST_APPROVED_BUT_COMMUNITY_IS_FULL", r13),
    A03("GROUP_LIMIT_REACHED", r13),
    A02("DEFAULT", r13);
    
    public final int statusMapping;
    public final int value;

    /* access modifiers changed from: public */
    static {
        C188538zk[] r1;
        A00 = C000900k.A00(r1);
    }

    /* access modifiers changed from: public */
    C188538zk(String str, int i) {
        this.value = r2;
        this.statusMapping = i;
    }
}
