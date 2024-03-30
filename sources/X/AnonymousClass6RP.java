package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6RP  reason: invalid class name */
public class AnonymousClass6RP implements AnonymousClass7hU {
    public Object A00;
    public final int A01;

    public AnonymousClass6RP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BbY(C124815yq r15) {
        AnonymousClass65F r2;
        AtomicBoolean atomicBoolean;
        if (this.A01 != 0) {
            C101314xL r6 = (C101314xL) this.A00;
            if (r6.A01 != null) {
                String str = r6.A0V.A02.A06.A02;
                List list = r15.A0A;
                AnonymousClass65F A002 = C148396yn.A00("fallback", str, (String) null, list, true);
                AnonymousClass65F A003 = C148396yn.A00("primary", str, (String) null, list, true);
                if (A003 == null) {
                    A003 = A002;
                }
                C1265864p BAg = r6.A01.A00.BAg();
                AnonymousClass6VO r5 = (AnonymousClass6VO) r6.A04.get();
                if (BAg != null && A003 != null && !BAg.A06.equals(A003.A04) && r5 != null && r6.A0V.A02.A03 - r6.A0i > 52428800) {
                    atomicBoolean = r5.A0G;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C101334xN r52 = (C101334xN) this.A00;
            if (r52.A00 != null) {
                C20810yC r12 = r52.A0U;
                C19970wo r13 = r52.A0O;
                C19700wN r11 = r52.A0A;
                AnonymousClass68C r22 = r52.A0f;
                String str2 = r22.A0A.A02;
                String str3 = r22.A0G;
                String str4 = r22.A0F;
                boolean A1S = AnonymousClass000.A1S(2, r22.A03);
                List list2 = r15.A0A;
                AnonymousClass65F A004 = C148396yn.A00("fallback", str2, (String) null, list2, false);
                String A03 = C148396yn.A03(r13, r12, str4, str2, A1S);
                if (((A03 == null && (str3 == null || (A03 = C148396yn.A02(r11, r12, r15, str3)) == null)) || (r2 = C148396yn.A00("primary", str2, A03, list2, false)) == null) && (r2 = C148396yn.A00("primary", str2, "0", list2, false)) == null && (r2 = C148396yn.A00("primary", str2, (String) null, list2, false)) == null) {
                    r2 = A004;
                }
                C1265864p BAg2 = r52.A00.A00.BAg();
                if (BAg2 != null && r2 != null && !BAg2.A06.equals(r2.A04)) {
                    atomicBoolean = r52.A10;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        atomicBoolean.set(true);
    }
}
