package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Wt  reason: invalid class name and case insensitive filesystem */
public final class C195909Wt {
    public AnonymousClass9ST A00;
    public final C197489bn A01;
    public final AnonymousClass6OG A02;
    public final HashMap A03 = AnonymousClass001.A0J();
    public final C201589jv A04;

    public boolean A00() {
        C197489bn r2 = this.A01;
        AnonymousClass94R r0 = C197489bn.A0B;
        Object A0j = C36381kD.A0j();
        Object obj = A0j;
        Map map = r2.A00;
        Object obj2 = map.get(r0);
        if (obj2 != null) {
            A0j = obj2;
        }
        if (!AnonymousClass000.A1X(A0j)) {
            return false;
        }
        Object obj3 = map.get(C197489bn.A0D);
        if (obj3 != null) {
            obj = obj3;
        }
        if (AnonymousClass000.A1X(obj)) {
            return true;
        }
        return false;
    }

    public C195909Wt(C197489bn r5, C201589jv r6) {
        AnonymousClass6OG r3;
        this.A04 = r6;
        this.A01 = r5;
        C197489bn r0 = this.A01;
        AnonymousClass94R r2 = C197489bn.A0C;
        Object A0j = C36381kD.A0j();
        Object obj = r0.A00.get(r2);
        if (AnonymousClass000.A1X(obj != null ? obj : A0j)) {
            C197489bn r02 = this.A01;
            r3 = new AnonymousClass6OG(r02);
            AnonymousClass94R r22 = C197489bn.A07;
            Object A0j2 = C36381kD.A0j();
            Object obj2 = r02.A00.get(r22);
            r3.A01 = AnonymousClass000.A1X(obj2 != null ? obj2 : A0j2);
        } else {
            r3 = null;
        }
        this.A02 = r3;
    }
}
