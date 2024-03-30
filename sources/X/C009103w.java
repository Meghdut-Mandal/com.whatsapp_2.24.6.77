package X;

/* renamed from: X.03w  reason: invalid class name and case insensitive filesystem */
public final class C009103w extends AnonymousClass00R implements C009003v {
    public static final C009103w A00 = new C009103w();

    public C009103w() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C005102h r6 = (C005102h) obj;
        C005202i r7 = (C005202i) obj2;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass00C.A0D(r7, 1);
        C005102h minusKey = r6.minusKey(r7.getKey());
        C008903u r3 = C008903u.A00;
        if (minusKey == r3) {
            return r7;
        }
        C006202s r0 = C005402k.A00;
        C005202i r2 = minusKey.get(r0);
        if (r2 == null) {
            return new C009303y(r7, minusKey);
        }
        C005102h minusKey2 = minusKey.minusKey(r0);
        if (minusKey2 == r3) {
            return new C009303y(r2, r7);
        }
        return new C009303y(r2, new C009303y(r7, minusKey2));
    }
}
