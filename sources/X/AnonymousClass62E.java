package X;

import java.util.HashMap;

/* renamed from: X.62E  reason: invalid class name */
public final class AnonymousClass62E {
    public final HashMap A00 = AnonymousClass001.A0J();
    public final C134906bn A01;

    public AnonymousClass62E(C20810yC r6) {
        AnonymousClass00C.A0D(r6, 1);
        this.A01 = new C134906bn(C36371kC.A07(r6.A07(1269)), "PHOENIX", true);
    }

    public final synchronized C134906bn A00(String str) {
        C134906bn r0;
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(str)) {
            r0 = (C134906bn) hashMap.get(str);
        } else {
            r0 = this.A01;
        }
        return r0;
    }
}
