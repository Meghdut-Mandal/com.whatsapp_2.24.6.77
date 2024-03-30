package X;

/* renamed from: X.03i  reason: invalid class name and case insensitive filesystem */
public abstract class C007803i {
    public static final AnonymousClass035 A00 = new AnonymousClass035("COMPLETING_WAITING_CHILDREN");
    public static final C008003k A01 = new C008003k(true);
    public static final C008003k A02 = new C008003k(false);
    public static final AnonymousClass035 A03 = new AnonymousClass035("COMPLETING_ALREADY");
    public static final AnonymousClass035 A04 = new AnonymousClass035("COMPLETING_RETRY");
    public static final AnonymousClass035 A05 = new AnonymousClass035("SEALED");
    public static final AnonymousClass035 A06 = new AnonymousClass035("TOO_LATE_TO_CANCEL");

    public static final Object A00(Object obj) {
        if (obj instanceof C007903j) {
            return new AnonymousClass0ST((C007903j) obj);
        }
        return obj;
    }

    public static final Object A01(Object obj) {
        AnonymousClass0ST r0;
        C007903j r02;
        if (!(obj instanceof AnonymousClass0ST) || (r0 = (AnonymousClass0ST) obj) == null || (r02 = r0.A00) == null) {
            return obj;
        }
        return r02;
    }
}
