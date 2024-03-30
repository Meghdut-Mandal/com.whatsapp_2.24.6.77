package X;

import java.util.Map;

/* renamed from: X.9aO  reason: invalid class name and case insensitive filesystem */
public final class C196699aO {
    public static final Map A00;

    static {
        AnonymousClass011[] r2 = new AnonymousClass011[3];
        C90464aC.A1E("pincode", "^\\d{6}$", r2);
        C90464aC.A1F("cep", "^\\d{8}$", r2);
        C90474aD.A1F("postal_code", "^\\d{5}$", r2);
        A00 = C000400e.A07(r2);
    }
}
