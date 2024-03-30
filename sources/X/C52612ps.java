package X;

/* renamed from: X.2ps  reason: invalid class name and case insensitive filesystem */
public enum C52612ps {
    TWENTY_FOUR_HOURS(24, 2, false),
    SEVEN_DAYS(7, 3, false),
    THIRTY_DAYS(30, 3, false),
    FIVE_SECONDS(5, 0, true),
    FIFTEEN_SECONDS(15, 0, true);
    
    public final boolean debugMenuOnlyField;
    public final int displayUnit;
    public final int durationInDisplayUnit;

    /* access modifiers changed from: public */
    static {
        C52612ps[] r0;
        A00 = C000900k.A00(r0);
    }

    public final int A00() {
        int i = this.durationInDisplayUnit;
        int i2 = this.displayUnit;
        int i3 = 1;
        if (i2 != 0) {
            i3 = 60;
            if (i2 != 1) {
                i3 = 3600;
                if (i2 != 2) {
                    if (i2 == 3) {
                        i3 = 86400;
                    } else {
                        throw AnonymousClass001.A09("TimeUnit not allowed in PinInChat expiration dialog");
                    }
                }
            }
        }
        return i * i3;
    }

    /* access modifiers changed from: public */
    C52612ps(int i, int i2, boolean z) {
        this.durationInDisplayUnit = i;
        this.displayUnit = i2;
        this.debugMenuOnlyField = z;
    }
}
