package X;

/* renamed from: X.4lx  reason: invalid class name and case insensitive filesystem */
public final class C95644lx extends C02830Cb {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C110735b9 r3 = (C110735b9) obj;
        C110735b9 r4 = (C110735b9) obj2;
        C36321k7.A0w(r3, r4);
        if (!(r3 instanceof AnonymousClass56V) || !(r4 instanceof AnonymousClass56V)) {
            return r3.equals(r4);
        }
        AnonymousClass56V r32 = (AnonymousClass56V) r3;
        AnonymousClass56V r42 = (AnonymousClass56V) r4;
        if (!AnonymousClass00C.A0J(r32.A03, r42.A03) || !AnonymousClass00C.A0J(r32.A01, r42.A01) || r32.A04 != r42.A04 || r32.A00 != r42.A00) {
            return false;
        }
        C135066c4 r1 = r32.A02;
        C135066c4 r0 = r42.A02;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
            return true;
        } else if (r0 == null || !AnonymousClass00C.A0J(r1.A0E, r0.A0E)) {
            return false;
        } else {
            return true;
        }
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C110735b9 r6 = (C110735b9) obj;
        C110735b9 r7 = (C110735b9) obj2;
        C36321k7.A0w(r6, r7);
        if ((r6 instanceof AnonymousClass56U) && (r7 instanceof AnonymousClass56U)) {
            AnonymousClass56U r62 = (AnonymousClass56U) r6;
            AnonymousClass56U r72 = (AnonymousClass56U) r7;
            if (!AnonymousClass00C.A0J(r62.A01, r72.A01) || r62.A00 != r72.A00) {
                return false;
            }
            return true;
        } else if ((r6 instanceof AnonymousClass56W) && (r7 instanceof AnonymousClass56W)) {
            return true;
        } else {
            if (!(r6 instanceof AnonymousClass56V) || !(r7 instanceof AnonymousClass56V)) {
                return false;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C134936bq r1 = ((AnonymousClass56V) r6).A01;
            A0u.append(r1.A06);
            A0u.append('/');
            A0u.append(r1.A04);
            A0u.append('/');
            String A0q = AnonymousClass000.A0q(r1.A05, A0u);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C134936bq r12 = ((AnonymousClass56V) r7).A01;
            A0u2.append(r12.A06);
            A0u2.append('/');
            A0u2.append(r12.A04);
            A0u2.append('/');
            return AnonymousClass00C.A0J(A0q, AnonymousClass000.A0q(r12.A05, A0u2));
        }
    }
}
