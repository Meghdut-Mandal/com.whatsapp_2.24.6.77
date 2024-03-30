package X;

import java.util.List;

/* renamed from: X.A1x  reason: case insensitive filesystem */
public class C20983A1x implements C23064B2n {
    public C201589jv A00;
    public C20981A1v A01;
    public final C198549dl A02;
    public final AnonymousClass9VB A03 = new AnonymousClass9VB();

    static {
        new Object();
    }

    public void A01(AnonymousClass9NT r7) {
        AnonymousClass9ST A022 = this.A00.A02();
        if (this.A01 == null) {
            C20981A1v a1v = new C20981A1v(this.A02);
            this.A01 = a1v;
            a1v.B1T(A022);
        }
        C20981A1v a1v2 = this.A01;
        List list = this.A03.A00;
        int size = list.size();
        if (size == 0) {
            a1v2.A03.A00(C188278zK.A0C);
            return;
        }
        for (int i = 0; i < size; i++) {
            a1v2.A00(A022, r7, (C23071B3a) list.get(i));
        }
    }

    public void A02(Object obj) {
        AnonymousClass9VB r5 = this.A03;
        List list = r5.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C23071B3a b3a = (C23071B3a) list.get(i);
            if (b3a.contains(obj) || b3a.equals(obj)) {
                r5.A02(b3a);
                if (b3a instanceof C23064B2n) {
                    C23064B2n b2n = (C23064B2n) b3a;
                    this.A00.A04(b2n);
                    b2n.release();
                    return;
                }
                return;
            }
        }
    }

    public void B1T(AnonymousClass9ST r2) {
        C20981A1v a1v = this.A01;
        if (a1v != null) {
            a1v.B1T(r2);
        }
    }

    public void B5N() {
        C20981A1v a1v = this.A01;
        if (a1v != null) {
            a1v.B5N();
        }
    }

    public void release() {
        AnonymousClass9VB r0 = this.A03;
        List list = r0.A00;
        r0.A00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C23071B3a b3a = (C23071B3a) list.get(i);
            if (b3a instanceof C23064B2n) {
                ((C23064B2n) b3a).release();
            }
        }
    }

    public C20983A1x(C198549dl r2) {
        this.A02 = r2;
    }

    public void A00(C201589jv r8, C23071B3a b3a) {
        Object BDd = b3a.BDd();
        AnonymousClass9VB r5 = this.A03;
        List list = r5.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C23071B3a b3a2 = (C23071B3a) list.get(i);
            if (!b3a2.contains(BDd) && !b3a2.equals(BDd)) {
                i++;
            } else {
                return;
            }
        }
        r5.A01(b3a);
        if (b3a instanceof C23064B2n) {
            r8.A03((C23064B2n) b3a);
        }
    }

    public void BKM(C201589jv r1) {
        this.A00 = r1;
    }
}
