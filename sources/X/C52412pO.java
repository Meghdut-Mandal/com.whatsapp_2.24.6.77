package X;

/* renamed from: X.2pO  reason: invalid class name and case insensitive filesystem */
public enum C52412pO {
    USER_NOT_FOUND(400),
    PARTICIPANT_NOT_AUTHORIZED(401),
    PARTICIPANT_REQUEST_NOT_FOUND(404),
    DEFAULT(1);
    
    public final int code;

    /* access modifiers changed from: public */
    static {
        C52412pO[] r1;
        A00 = C000900k.A00(r1);
    }

    /* access modifiers changed from: public */
    C52412pO(int i) {
        this.code = i;
    }
}
