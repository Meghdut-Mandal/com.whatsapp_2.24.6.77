package X;

/* renamed from: X.96t  reason: invalid class name and case insensitive filesystem */
public abstract class C1900696t {
    public static final C21854Abe A00(C201259jD r4) {
        String obj = r4.toString();
        int B9n = r4.A00().B9n();
        if (B9n == 405) {
            return new C178238fP(obj, 405);
        }
        B2T A00 = r4.A00();
        if (A00 instanceof C177338dd) {
            return new C178238fP(obj, B9n);
        }
        if (A00 instanceof C177348de) {
            return new AnonymousClass8fQ(obj);
        }
        if (A00 instanceof C177328dc) {
            return new C178228fO();
        }
        return new C21854Abe(obj, B9n);
    }
}
