package X;

import java.util.Enumeration;

/* renamed from: X.Ard  reason: case insensitive filesystem */
public class C22611Ard extends AnonymousClass120 {
    public C22586ArE A00;
    public C22632Ary A01;

    public static C22611Ard A00(Object obj) {
        if (obj instanceof C22611Ard) {
            return (C22611Ard) obj;
        }
        if (obj != null) {
            return new C22611Ard(C22656AsM.A04(obj));
        }
        return null;
    }

    public C22611Ard(C22656AsM asM) {
        if (asM.A0H() == 2) {
            Enumeration A0I = asM.A0I();
            this.A01 = C22632Ary.A00(A0I.nextElement());
            this.A00 = C22586ArE.A01(A0I.nextElement());
            return;
        }
        throw C22656AsM.A01(asM);
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A01);
        return C202169lB.A01(this.A00, A002);
    }
}
