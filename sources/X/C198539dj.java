package X;

/* renamed from: X.9dj  reason: invalid class name and case insensitive filesystem */
public class C198539dj {
    public AnonymousClass8QT A00;

    public C120595rl A00() {
        try {
            AnonymousClass8QT r1 = this.A00;
            return new C120595rl(new C118185nT(r1.privateKey_.A06()), C200529hY.A00(r1.publicKey_));
        } catch (AnonymousClass18E e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C198539dj(C120595rl r5, int i) {
        AnonymousClass8NN A01 = C170918Hz.A01(AnonymousClass8QT.DEFAULT_INSTANCE);
        AnonymousClass8QT r1 = (AnonymousClass8QT) A01.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        AnonymousClass8I5 A0O = C90474aD.A0O(A01, r5.A01.A00());
        AnonymousClass8QT r12 = (AnonymousClass8QT) A01.A00;
        r12.bitField0_ |= 2;
        r12.publicKey_ = A0O;
        AnonymousClass8I5 A0O2 = C90474aD.A0O(A01, r5.A00.A00);
        AnonymousClass8QT r13 = (AnonymousClass8QT) A01.A00;
        r13.bitField0_ |= 4;
        r13.privateKey_ = A0O2;
        this.A00 = (AnonymousClass8QT) A01.A0R();
    }

    public C198539dj(byte[] bArr) {
        this.A00 = (AnonymousClass8QT) C170918Hz.A08(AnonymousClass8QT.DEFAULT_INSTANCE, bArr);
    }
}
