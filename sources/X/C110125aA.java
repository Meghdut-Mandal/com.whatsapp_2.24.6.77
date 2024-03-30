package X;

/* renamed from: X.5aA  reason: invalid class name and case insensitive filesystem */
public class C110125aA implements AnonymousClass7fF {
    public Object A00;
    public Object A01;
    public final int A02;

    public C110125aA(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean BxM(C140456lc r7) {
        Object A05;
        Object obj;
        if (this.A02 != 0) {
            C129986Jg r5 = (C129986Jg) this.A01;
            AnonymousClass5oS r4 = r5.A00;
            if (!(r4 == null || (obj = r4.A01.get(r7)) == null)) {
                r5.A01.A01.put(r7, obj);
            }
            long j = (long) r7.A03;
            if (r4 == null || (A05 = r4.A00.A05(j)) == null) {
                return false;
            }
            r5.A01.A00.A0A(j, A05);
            return false;
        }
        C121085sZ r42 = (C121085sZ) this.A01;
        AnonymousClass00C.A0B(r7);
        C121085sZ r3 = (C121085sZ) this.A00;
        int i = r7.A03;
        Object obj2 = r42.A02.get(i);
        if (obj2 != null) {
            r3.A02.put(i, obj2);
        }
        Object obj3 = r42.A00.get(i);
        if (obj3 != null) {
            r3.A00.put(i, obj3);
        }
        Object obj4 = r42.A01.get(i);
        if (obj4 == null) {
            return false;
        }
        r3.A01.put(i, obj4);
        return false;
    }
}
