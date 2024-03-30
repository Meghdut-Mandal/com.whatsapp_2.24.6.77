package X;

/* renamed from: X.5Wy  reason: invalid class name and case insensitive filesystem */
public abstract class C109275Wy {
    public static final C137856gq A00(AnonymousClass7bY r3, int i) {
        C137856gq r32 = ((C137856gq) r3).A03.A02;
        if (r32 != null && (r32.A00 & i) != 0) {
            do {
                int i2 = r32.A01;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & i) != 0) {
                    return r32;
                } else {
                    r32 = r32.A02;
                }
            } while (r32 != null);
        }
        return null;
    }
}
