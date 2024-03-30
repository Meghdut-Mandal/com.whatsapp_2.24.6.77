package X;

import java.lang.ref.Reference;

/* renamed from: X.6Wf  reason: invalid class name and case insensitive filesystem */
public class C133006Wf implements C16680pu {
    public Object A00;
    public Object A01;
    public final int A02;

    public C133006Wf(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object get() {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            C140456lc r1 = (C140456lc) obj;
            C1271967i r0 = (C1271967i) this.A01;
            if (r1 != null) {
                return Integer.valueOf(AnonymousClass5Z8.A00(r0, r1));
            }
            return null;
        }
        C1271967i r12 = (C1271967i) ((Reference) obj).get();
        C140456lc r02 = (C140456lc) ((Reference) this.A01).get();
        if (r12 == null || r02 == null) {
            return null;
        }
        return new C119125pH(r12, r02);
    }
}
