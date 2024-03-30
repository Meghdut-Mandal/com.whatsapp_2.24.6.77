package X;

import java.io.OutputStream;

/* renamed from: X.AsH  reason: case insensitive filesystem */
public abstract class C22651AsH extends AnonymousClass121 {
    public int A00;
    public C22654AsK A01;
    public AnonymousClass122 A02;
    public AnonymousClass121 A03;
    public AnonymousClass121 A04;

    public AnonymousClass121 A0B() {
        AnonymousClass122 r2 = this.A02;
        return new C22588ArG(this.A01, r2, this.A03, this.A04, this.A00);
    }

    public boolean A0E() {
        return true;
    }

    public boolean A0F(AnonymousClass121 r4) {
        AnonymousClass121 r0;
        C22654AsK asK;
        AnonymousClass122 r02;
        if (r4 instanceof C22651AsH) {
            if (this == r4) {
                return true;
            }
            C22651AsH asH = (C22651AsH) r4;
            AnonymousClass122 r1 = this.A02;
            if (r1 != null && ((r02 = asH.A02) == null || !r02.A0G(r1))) {
                return false;
            }
            C22654AsK asK2 = this.A01;
            if (asK2 != null && ((asK = asH.A01) == null || !asK.A0G(asK2))) {
                return false;
            }
            AnonymousClass121 r12 = this.A03;
            if (r12 == null || ((r0 = asH.A03) != null && r0.A0G(r12))) {
                return this.A04.A0G(asH.A04);
            }
            return false;
        }
        return false;
    }

    public static AnonymousClass121 A01(C202169lB r1, int i) {
        if (r1.A00 > i) {
            return r1.A05(i).Bve();
        }
        throw AnonymousClass001.A08("too few objects in input vector");
    }

    public static void A02(OutputStream outputStream, String str, AnonymousClass120 r3) {
        if (r3 != null) {
            outputStream.write(r3.A09(str));
        }
    }

    public int hashCode() {
        int A0J = AnonymousClass000.A0J(this.A02);
        C22654AsK asK = this.A01;
        if (asK != null) {
            A0J ^= asK.hashCode();
        }
        AnonymousClass121 r0 = this.A03;
        if (r0 != null) {
            A0J ^= r0.hashCode();
        }
        return A0J ^ this.A04.hashCode();
    }

    public C22651AsH(C202169lB r5) {
        int i = 0;
        AnonymousClass121 A012 = A01(r5, 0);
        if (A012 instanceof AnonymousClass122) {
            this.A02 = (AnonymousClass122) A012;
            A012 = A01(r5, 1);
            i = 1;
        }
        if (A012 instanceof C22654AsK) {
            this.A01 = (C22654AsK) A012;
            i++;
            A012 = A01(r5, i);
        }
        if (!(A012 instanceof C22658AsO)) {
            this.A03 = A012;
            i++;
            A012 = A01(r5, i);
        }
        if (r5.A00 != i + 1) {
            throw AnonymousClass001.A08("input vector too large");
        } else if (A012 instanceof C22658AsO) {
            C22658AsO asO = (C22658AsO) A012;
            int i2 = asO.A00;
            if (i2 < 0 || i2 > 2) {
                throw AnonymousClass000.A0d("invalid encoding value: ", AnonymousClass000.A0u(), i2);
            }
            this.A00 = i2;
            this.A04 = C22658AsO.A01(asO);
        } else {
            throw AnonymousClass001.A08("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public C22651AsH(C22654AsK asK, AnonymousClass122 r3, AnonymousClass121 r4, AnonymousClass121 r5, int i) {
        this.A02 = r3;
        this.A01 = asK;
        this.A03 = r4;
        this.A00 = i;
        this.A04 = r5;
    }
}
