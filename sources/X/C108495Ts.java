package X;

/* renamed from: X.5Ts  reason: invalid class name and case insensitive filesystem */
public enum C108495Ts {
    UPTO_DATE(0, true, true),
    FETCH_ERROR(1, false, false),
    NETWORK_ERROR(2, false, false),
    LANGUAGE_UNAVAILABLE(3, false, true);
    
    public final boolean fetchSuccessful;
    public final String fieldStatString;
    public final boolean gotDictionary;

    /* access modifiers changed from: public */
    static {
        C108495Ts[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    C108495Ts(int i, boolean z, boolean z2) {
        this.gotDictionary = z;
        this.fetchSuccessful = z2;
        this.fieldStatString = r2;
    }
}
