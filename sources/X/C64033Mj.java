package X;

/* renamed from: X.3Mj  reason: invalid class name and case insensitive filesystem */
public abstract class C64033Mj {
    public static AnonymousClass166 A00 = new AnonymousClass166(16);

    public static C145166tS A00(String str) {
        C145166tS r0;
        AnonymousClass166 r1 = A00;
        synchronized (r1) {
            if (str == null) {
                r0 = null;
            } else {
                r0 = (C145166tS) r1.get(str);
            }
        }
        return r0;
    }
}
