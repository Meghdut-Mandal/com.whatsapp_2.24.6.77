package X;

/* renamed from: X.5Wu  reason: invalid class name and case insensitive filesystem */
public abstract class C109235Wu {
    public static final int A00(AnonymousClass5h8 r7, C94744ii r8) {
        C94744ii A0N;
        long j;
        long j2;
        boolean z = r8 instanceof C94894iy;
        if (z) {
            A0N = ((C94894iy) r8).A05;
        } else {
            C94894iy r0 = ((C94924j1) r8).A04.A05;
            if (r0 != null) {
                A0N = r0.A0N();
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Child of ");
            A0u.append(r8);
            throw AnonymousClass000.A0g(" cannot be null when calculating alignment line", A0u);
        }
        if (A0N != null) {
            if (r8.A0H().B8T().containsKey(r7)) {
                Number A0b = C90524aI.A0b(r7, r8.A0H().B8T());
                if (A0b != null) {
                    return A0b.intValue();
                }
                return Integer.MIN_VALUE;
            }
            int A0G = A0N.A0G(r7);
            if (A0G == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            A0N.A01 = true;
            r8.A00 = true;
            if (z) {
                C94894iy r4 = (C94894iy) r8;
                long j3 = r4.A01;
                r4.A0E(r4.A09, r4.A00, j3);
            } else {
                C94924j1 r42 = (C94924j1) r8;
                r42.A0E((C006302t) null, 0.0f, r42.A00);
            }
            A0N.A01 = false;
            r8.A00 = false;
            boolean z2 = r7 instanceof C94694id;
            if (A0N instanceof C94894iy) {
                j = ((C94894iy) A0N).A01;
            } else {
                j = ((C94924j1) A0N).A00;
            }
            if (z2) {
                j2 = j & 4294967295L;
            } else {
                j2 = j >> 32;
            }
            return A0G + ((int) j2);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Child of ");
        A0u2.append(r8);
        throw AnonymousClass000.A0g(" cannot be null when calculating alignment line", A0u2);
    }
}
