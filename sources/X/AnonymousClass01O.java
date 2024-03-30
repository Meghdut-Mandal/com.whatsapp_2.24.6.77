package X;

import java.util.HashMap;

/* renamed from: X.01O  reason: invalid class name */
public class AnonymousClass01O extends C001800t {
    public HashMap A00 = new HashMap();

    public C003201h A00(Object obj) {
        return (C003201h) this.A00.get(obj);
    }

    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }

    public Object A02(Object obj, Object obj2) {
        C003201h A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        HashMap hashMap = this.A00;
        C003201h r1 = new C003201h(obj, obj2);
        this.A00++;
        C003201h r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        hashMap.put(obj, r1);
        return null;
    }
}
