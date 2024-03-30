package X;

import java.lang.ref.SoftReference;

/* renamed from: X.1k3  reason: invalid class name and case insensitive filesystem */
public class C36281k3 implements C28281Sa {
    public Object A00;
    public final int A01;

    public C36281k3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWW(boolean z, Object obj, Object obj2, Object obj3) {
        Object obj4;
        if (this.A01 != 0) {
            AnonymousClass1SV r0 = (AnonymousClass1SV) this.A00;
            if (z) {
                r0.A04.put(obj, new SoftReference(obj2));
                return;
            }
            return;
        }
        C28281Sa r2 = (C28281Sa) this.A00;
        C594533z r7 = (C594533z) obj3;
        Object obj5 = ((C594533z) obj2).A01;
        if (r7 == null) {
            obj4 = null;
        } else {
            obj4 = r7.A01;
        }
        r2.BWW(z, obj, obj5, obj4);
    }
}
