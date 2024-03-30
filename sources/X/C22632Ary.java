package X;

/* renamed from: X.Ary  reason: case insensitive filesystem */
public class C22632Ary extends AnonymousClass120 {
    public C219411z A00;
    public AnonymousClass122 A01;

    public C22632Ary(C219411z r1, AnonymousClass122 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public C22632Ary(AnonymousClass122 r1) {
        this.A01 = r1;
    }

    public static C22632Ary A00(Object obj) {
        if (obj instanceof C22632Ary) {
            return (C22632Ary) obj;
        }
        if (obj != null) {
            return new C22632Ary(C22656AsM.A04(obj));
        }
        return null;
    }

    public C22632Ary(C22656AsM asM) {
        C219411z r0;
        if (asM.A0H() < 1 || asM.A0H() > 2) {
            throw C22656AsM.A01(asM);
        }
        this.A01 = AnonymousClass122.A01(C22656AsM.A02(asM));
        if (asM.A0H() == 2) {
            r0 = asM.A0J(1);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A01);
        C219411z r0 = this.A00;
        if (r0 != null) {
            A002.A06(r0);
        }
        return new C22675Asf(A002);
    }
}
