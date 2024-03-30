package X;

import java.io.IOException;

/* renamed from: X.As0  reason: case insensitive filesystem */
public class C22634As0 extends AnonymousClass120 {
    public static final AnonymousClass122 A03 = C165567td.A0i("1.3.6.1.5.5.7.1.4");
    public static final AnonymousClass122 A04 = C165567td.A0i("1.3.6.1.5.5.7.1.1");
    public static final AnonymousClass122 A05 = C165567td.A0i("2.5.29.35");
    public static final AnonymousClass122 A06 = C165567td.A0i("2.5.29.19");
    public static final AnonymousClass122 A07 = C165567td.A0i("1.3.6.1.5.5.7.1.2");
    public static final AnonymousClass122 A08 = C165567td.A0i("2.5.29.31");
    public static final AnonymousClass122 A09 = C165567td.A0i("2.5.29.20");
    public static final AnonymousClass122 A0A = C165567td.A0i("2.5.29.29");
    public static final AnonymousClass122 A0B = C165567td.A0i("2.5.29.32");
    public static final AnonymousClass122 A0C = C165567td.A0i("2.5.29.27");
    public static final AnonymousClass122 A0D = C165567td.A0i("2.5.29.60");
    public static final AnonymousClass122 A0E = C165567td.A0i("2.5.29.37");
    public static final AnonymousClass122 A0F = C165567td.A0i("2.5.29.46");
    public static final AnonymousClass122 A0G = C165567td.A0i("2.5.29.54");
    public static final AnonymousClass122 A0H = C165567td.A0i("2.5.29.23");
    public static final AnonymousClass122 A0I = C165567td.A0i("2.5.29.24");
    public static final AnonymousClass122 A0J = C165567td.A0i("2.5.29.18");
    public static final AnonymousClass122 A0K = C165567td.A0i("2.5.29.28");
    public static final AnonymousClass122 A0L = C165567td.A0i("2.5.29.15");
    public static final AnonymousClass122 A0M = C165567td.A0i("1.3.6.1.5.5.7.1.12");
    public static final AnonymousClass122 A0N = C165567td.A0i("2.5.29.30");
    public static final AnonymousClass122 A0O = C165567td.A0i("2.5.29.56");
    public static final AnonymousClass122 A0P = C165567td.A0i("2.5.29.36");
    public static final AnonymousClass122 A0Q = C165567td.A0i("2.5.29.33");
    public static final AnonymousClass122 A0R = C165567td.A0i("2.5.29.16");
    public static final AnonymousClass122 A0S = C165567td.A0i("1.3.6.1.5.5.7.1.3");
    public static final AnonymousClass122 A0T = C165567td.A0i("2.5.29.21");
    public static final AnonymousClass122 A0U = C165567td.A0i("2.5.29.17");
    public static final AnonymousClass122 A0V = C165567td.A0i("2.5.29.9");
    public static final AnonymousClass122 A0W = C165567td.A0i("1.3.6.1.5.5.7.1.11");
    public static final AnonymousClass122 A0X = C165567td.A0i("2.5.29.14");
    public static final AnonymousClass122 A0Y = C165567td.A0i("2.5.29.55");
    public AnonymousClass122 A00;
    public C22659AsP A01;
    public boolean A02;

    public AnonymousClass121 Bve() {
        C202169lB r1 = new C202169lB(3);
        r1.A06(this.A00);
        if (this.A02) {
            r1.A06(C22653AsJ.A02);
        }
        return C202169lB.A01(this.A01, r1);
    }

    public C22634As0(AnonymousClass122 r2, byte[] bArr, boolean z) {
        C22644AsA asA = new C22644AsA(bArr);
        this.A00 = r2;
        this.A02 = z;
        this.A01 = asA;
    }

    public static AnonymousClass121 A00(C22634As0 as0) {
        try {
            return AnonymousClass121.A00(as0.A01.A00);
        } catch (IOException e) {
            throw C90464aC.A0P(e, "can't convert extension: ", AnonymousClass000.A0u());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22634As0)) {
            return false;
        }
        C22634As0 as0 = (C22634As0) obj;
        if (!as0.A00.A0G(this.A00) || !as0.A01.A0G(this.A01) || as0.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A02;
        int hashCode = this.A01.hashCode() ^ this.A00.hashCode();
        if (!z) {
            return ~hashCode;
        }
        return hashCode;
    }

    public C22634As0(C22656AsM asM) {
        C219411z A0J2;
        if (asM.A0H() == 2) {
            this.A00 = AnonymousClass122.A01(asM.A0J(0));
            this.A02 = false;
            A0J2 = asM.A0J(1);
        } else if (asM.A0H() == 3) {
            this.A00 = AnonymousClass122.A01(asM.A0J(0));
            this.A02 = AnonymousClass000.A1P(C22653AsJ.A01(asM.A0J(1)).A00);
            A0J2 = asM.A0J(2);
        } else {
            throw C22656AsM.A01(asM);
        }
        this.A01 = C22659AsP.A01(A0J2);
    }
}
