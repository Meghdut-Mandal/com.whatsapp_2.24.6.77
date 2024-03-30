package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.AsP  reason: case insensitive filesystem */
public abstract class C22659AsP extends AnonymousClass121 implements C23128B6j {
    public byte[] A00;

    public C22659AsP(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.A00 = bArr;
    }

    public AnonymousClass121 A0B() {
        return new C22644AsA(this.A00);
    }

    public AnonymousClass121 BDb() {
        return this;
    }

    public static C22659AsP A01(Object obj) {
        if (obj == null || (obj instanceof C22659AsP)) {
            return (C22659AsP) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A01(AnonymousClass121.A00((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A08(C36331k8.A0i("failed to construct OCTET STRING from byte[]: ", AnonymousClass000.A0u(), e));
            }
        } else {
            if (obj instanceof C219411z) {
                AnonymousClass121 Bve = ((C219411z) obj).Bve();
                if (Bve instanceof C22659AsP) {
                    return (C22659AsP) Bve;
                }
            }
            throw C165567td.A0N(obj, "illegal object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public static C22659AsP A02(C22658AsO asO, boolean z) {
        C22659AsP asP;
        boolean z2;
        if (!z) {
            AnonymousClass121 A01 = C22658AsO.A01(asO);
            if (asO.A02) {
                boolean z3 = asO instanceof C22679Asj;
                C22659AsP[] asPArr = {A01(A01)};
                if (z3) {
                    return asP;
                }
                asP = new C22645AsB(asPArr);
            } else {
                if (A01 instanceof C22659AsP) {
                    asP = (C22659AsP) A01;
                    z2 = asO instanceof C22679Asj;
                } else if (A01 instanceof C22656AsM) {
                    C22656AsM asM = (C22656AsM) A01;
                    z2 = asO instanceof C22679Asj;
                    int A0H = asM.A0H();
                    C22659AsP[] asPArr2 = new C22659AsP[A0H];
                    for (int i = 0; i < A0H; i++) {
                        asPArr2[i] = A01(asM.A0J(i));
                    }
                    asP = new C22645AsB(asPArr2);
                } else {
                    throw C165567td.A0N(asO, "unknown object in getInstance: ", AnonymousClass000.A0u());
                }
                if (z2) {
                    return asP;
                }
            }
            return (C22659AsP) asP.A0C();
        } else if (asO.A02) {
            return A01(C22658AsO.A01(asO));
        } else {
            throw AnonymousClass001.A08("object implicit - explicit expected.");
        }
    }

    public AnonymousClass121 A0C() {
        if (this instanceof C22644AsA) {
            return this;
        }
        return new C22644AsA(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22659AsP)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22659AsP) r3).A00);
    }

    public InputStream BEb() {
        return C90524aI.A0P(this.A00);
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public static byte[] A03(Object obj) {
        return A01(obj).A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("#");
        byte[] bArr = this.A00;
        return AnonymousClass000.A0q(C202439lp.A00(bArr, bArr.length), A0u);
    }
}
