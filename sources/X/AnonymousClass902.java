package X;

/* renamed from: X.902  reason: invalid class name */
public enum AnonymousClass902 {
    ;
    
    public final String value;

    public static AnonymousClass902 A01(String str, int i) {
        return new AnonymousClass902(str, i, str);
    }

    /* access modifiers changed from: public */
    AnonymousClass902(String str) {
        this.value = str;
    }

    public static AnonymousClass902 A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            AnonymousClass6YR.A0D("VideoErrorDomain", "Cannot convert errorDomain %s", e, AnonymousClass000.A1b(str));
            return A0E;
        }
    }
}
