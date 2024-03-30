package X;

/* renamed from: X.54i  reason: invalid class name and case insensitive filesystem */
public class C1031954i extends AnonymousClass5q2 {
    public String A00() {
        C175898bF r0;
        String str;
        C207249un r02 = this.A00;
        if (r02 == null || (r0 = r02.A08) == null) {
            r0 = null;
        }
        if (r0 == null || (str = ((C175888bE) r0).A07) == null) {
            return "NONE";
        }
        return str;
    }

    public String A01() {
        C175898bF r1;
        C175888bE r12;
        C207249un r0 = this.A00;
        if (r0 == null || (r1 = r0.A08) == null || !(r1 instanceof C175888bE) || (r12 = (C175888bE) r1) == null) {
            return null;
        }
        return r12.A06;
    }

    public String A02() {
        C135086c7 r0;
        Object obj;
        C207249un r02 = this.A00;
        if (r02 == null || (r0 = r02.A09) == null || (obj = r0.A00) == null) {
            return "";
        }
        return (String) obj;
    }

    public C1031954i(C175768b1 r1) {
        super(r1);
    }
}
