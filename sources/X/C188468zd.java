package X;

/* renamed from: X.8zd  reason: invalid class name and case insensitive filesystem */
public enum C188468zd {
    OTP_BANK(1),
    OTP_EMAIL(2),
    OTP_SMS(3),
    OTP_VACAT(4),
    BANK_APP(5),
    CALL_BANK(6),
    UNKNOWN(7);
    
    public final Integer priority;

    /* access modifiers changed from: public */
    C188468zd(int i) {
        this.priority = Integer.valueOf(i);
    }
}
