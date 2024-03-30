package X;

/* renamed from: X.ACk  reason: case insensitive filesystem */
public final class C21202ACk implements B14 {
    public /* synthetic */ void Bd4(C1275768v r1, AnonymousClass8SU r2, AnonymousClass3T1 r3) {
    }

    public void Bd3(AnonymousClass6CO r7, AnonymousClass8NK r8, AnonymousClass3T1 r9) {
        Long A0h;
        boolean A1a = C36331k8.A1a(r9, r8);
        if (C1899696h.A00(r8, r9)) {
            return;
        }
        if (r9.A1J.A02) {
            boolean A1R = AnonymousClass000.A1R(r9.A05);
            boolean A02 = AnonymousClass3TJ.A02(r9.A0D, 4);
            Long l = r9.A0g;
            if (l == null) {
                A0h = null;
            } else {
                A0h = C90504aG.A0h(l.longValue(), C36371kC.A07(r9.A05));
            }
            if (A1R && A02 && A0h != null) {
                long A0B = C36391kE.A0B(A0h.longValue());
                AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r8);
                A0J.bitField0_ |= 1048576;
                A0J.ephemeralStartTimestamp_ = A0B;
            }
        } else if (r9.A1T(512)) {
            AnonymousClass8SU A0J2 = AnonymousClass8NN.A0J(r8);
            A0J2.bitField0_ |= 8388608;
            A0J2.ephemeralOutOfSync_ = A1a;
        }
    }
}
