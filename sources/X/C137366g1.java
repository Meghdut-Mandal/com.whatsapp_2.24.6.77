package X;

/* renamed from: X.6g1  reason: invalid class name and case insensitive filesystem */
public final class C137366g1 implements C158817iH {
    public static Boolean A00;
    public static final C137366g1 A01 = new C137366g1();

    public boolean B9M() {
        Boolean bool = A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AnonymousClass001.A09("canFocus is read before it is written");
    }

    public void BqP(boolean z) {
        A00 = Boolean.valueOf(z);
    }
}
