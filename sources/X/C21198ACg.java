package X;

/* renamed from: X.ACg  reason: case insensitive filesystem */
public abstract class C21198ACg implements B6C, B15 {
    public void B22(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        AnonymousClass2bO r72;
        C36331k8.A1I(r7, r6);
        if (!(r7 instanceof AnonymousClass2bO) || (r72 = (AnonymousClass2bO) r7) == null) {
            throw C165567td.A0K(0);
        }
        AnonymousClass11F A0J = r72.A0J();
        if (A0J != null) {
            r6.A0Z(A0J.getRawString());
        } else {
            r6.A0U();
        }
        long A0B = C36391kE.A0B(r72.A00);
        AnonymousClass8SU A0J2 = AnonymousClass8NN.A0J(r6);
        A0J2.bitField1_ |= 32;
        A0J2.revokeMessageTimestamp_ = A0B;
    }

    public final C188108z3 BCR() {
        return C188108z3.STUB_MESSAGE;
    }
}
