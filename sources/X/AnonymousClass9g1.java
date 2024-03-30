package X;

/* renamed from: X.9g1  reason: invalid class name */
public abstract class AnonymousClass9g1 {
    public int A00;
    public byte[] A01;
    public byte[] A02;

    public AZr A01(int i) {
        if ((this instanceof C22701At5) || (this instanceof C22699At3) || !(this instanceof C22700At4)) {
            return A02(i);
        }
        int i2 = i / 8;
        return new AZr(C22700At4.A00((C22700At4) this, 3, i2), 0, i2);
    }

    public AZr A02(int i) {
        int i2;
        byte[] A002;
        if (this instanceof C22701At5) {
            i2 = i / 8;
            A002 = C22701At5.A00((C22701At5) this, i2);
        } else if (this instanceof C22699At3) {
            C22699At3 at3 = (C22699At3) this;
            i2 = i / 8;
            if (i2 <= at3.A00.BB8()) {
                A002 = C22699At3.A00(at3);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Can't generate a derived key ");
                A0u.append(i2);
                throw AnonymousClass000.A0c(" bytes long.", A0u);
            }
        } else if (this instanceof C22700At4) {
            i2 = i / 8;
            A002 = C22700At4.A00((C22700At4) this, 1, i2);
        } else {
            i2 = i / 8;
            A002 = C22698At2.A00((C22698At2) this, i2);
        }
        return new AZr(A002, 0, i2);
    }

    public C21760AZs A03(int i, int i2) {
        int i3;
        int i4;
        byte[] A002;
        if (this instanceof C22701At5) {
            i3 = i / 8;
            i4 = i2 / 8;
            A002 = C22701At5.A00((C22701At5) this, i3 + i4);
        } else if (this instanceof C22699At3) {
            C22699At3 at3 = (C22699At3) this;
            i3 = i / 8;
            i4 = i2 / 8;
            int i5 = i3 + i4;
            if (i5 <= at3.A00.BB8()) {
                A002 = C22699At3.A00(at3);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Can't generate a derived key ");
                A0u.append(i5);
                throw AnonymousClass000.A0c(" bytes long.", A0u);
            }
        } else if (this instanceof C22700At4) {
            C22700At4 at4 = (C22700At4) this;
            int i6 = i / 8;
            int i7 = i2 / 8;
            byte[] A003 = C22700At4.A00(at4, 1, i6);
            return new C21760AZs(new AZr(A003, 0, i6), C22700At4.A00(at4, 2, i7), 0, i7);
        } else {
            i3 = i / 8;
            i4 = i2 / 8;
            A002 = C22698At2.A00((C22698At2) this, i3 + i4);
        }
        return new C21760AZs(new AZr(A002, 0, i3), A002, i3, i4);
    }
}
