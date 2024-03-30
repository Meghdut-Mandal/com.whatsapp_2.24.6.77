package X;

/* renamed from: X.0nB  reason: invalid class name and case insensitive filesystem */
public final class C15340nB extends C15350nC implements AnonymousClass05K {
    public /* bridge */ /* synthetic */ Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(AnonymousClass000.A0I(A00(this)));
        }
        return valueOf;
    }

    public C15340nB(int i) {
        super(C023109s.A01, 1, Integer.MAX_VALUE);
        BwB(Integer.valueOf(i));
    }

    public static Object A00(C15350nC r7) {
        Object[] objArr = r7.A04;
        AnonymousClass00C.A0B(objArr);
        long j = r7.A03;
        return objArr[(objArr.length - 1) & ((int) ((j + ((long) ((int) ((Math.min(r7.A02, j) + ((long) r7.A00)) - j)))) - 1))];
    }
}
