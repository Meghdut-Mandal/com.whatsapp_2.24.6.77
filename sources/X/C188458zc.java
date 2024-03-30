package X;

/* renamed from: X.8zc  reason: invalid class name and case insensitive filesystem */
public enum C188458zc {
    USER_NOT_ADMIN(401),
    GROUP_NOT_FOUND(404),
    GROUP_SUSPENDED(423),
    RATE_OVER_LIMIT(429),
    INTERNAL_SERVER_ERROR(500),
    DEFAULT(1);
    
    public final int code;

    /* access modifiers changed from: public */
    static {
        C188458zc[] r1;
        A00 = C000900k.A00(r1);
    }

    /* access modifiers changed from: public */
    C188458zc(int i) {
        this.code = i;
    }
}
