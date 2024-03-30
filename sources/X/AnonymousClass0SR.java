package X;

/* renamed from: X.0SR  reason: invalid class name */
public final class AnonymousClass0SR {
    public final String A00;

    public AnonymousClass0SR(String str, String str2) {
        boolean z = str.length() <= 23;
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = str;
        AnonymousClass000.A1L(A0M, 23, 1);
        if (!z) {
            throw AnonymousClass001.A08(String.format("tag \"%s\" is longer than the %d character maximum", A0M));
        } else if (str2 == null || str2.length() <= 0) {
            this.A00 = null;
        } else {
            this.A00 = str2;
        }
    }
}
