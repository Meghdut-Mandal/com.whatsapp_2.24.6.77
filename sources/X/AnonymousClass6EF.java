package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6EF  reason: invalid class name */
public abstract class AnonymousClass6EF {
    public static void A00(C35011i0 r1, AnonymousClass1UZ r2) {
        r2.A02(Boolean.valueOf(((AnonymousClass1UM) r1.A0C.get()).A06(C35011i0.A0K)), "is_account_linked");
    }

    public void A01(Integer num, Integer num2, String str, boolean z) {
        AnonymousClass1UZ r2;
        Integer num3 = num;
        Integer num4 = num2;
        String str2 = str;
        if (this instanceof C107595Qc) {
            C107595Qc r0 = (C107595Qc) this;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("XFamilyCrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ");
            C90464aC.A1R(A0u, str2);
            C64583Oo r22 = (C64583Oo) r0.A00.A04.get();
            List list = r0.A03;
            boolean z2 = r0.A04;
            int i = 10;
            if (z2) {
                i = 9;
            }
            r22.A01(r0.A01, Integer.valueOf(i), num3, num4, str2, list, 4, z2);
            return;
        }
        if (this instanceof C107615Qe) {
            C107615Qe r02 = (C107615Qe) this;
            AnonymousClass00C.A0D("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/delivery failure", 0);
            C35011i0 r23 = r02.A02;
            List list2 = r02.A05;
            ((C64583Oo) C36411kG.A0v(r23.A09)).A01((Boolean) null, r02.A03, num3, num4, str2, list2, 4, true);
            AnonymousClass005 r4 = r23.A0G;
            A00(r23, (AnonymousClass1UZ) r4.get());
            C122805vS r5 = r02.A01;
            if (z) {
                C35141iD r42 = new C35141iD(r23, r5, list2, 5);
                C162627ot r3 = new C162627ot(r23, 1);
                C132686Uv r24 = (C132686Uv) r23.A0A.get();
                r24.A01.Bp3(new C1502774q(r42, r3, r5, r24));
                return;
            }
            C132686Uv.A01((C33541fX) null, (C132686Uv) C36411kG.A0v(r23.A0A), "status_fragment", R.string.f12nameremoved, 0, false);
            r2 = (AnonymousClass1UZ) r4.get();
        } else {
            C107605Qd r03 = (C107605Qd) this;
            C35011i0 r1 = r03.A01;
            C132686Uv.A01((C33541fX) null, (C132686Uv) C36411kG.A0v(r1.A0A), r03.A04, R.string.f12nameremoved, 0, false);
            ((C64583Oo) C36411kG.A0v(r1.A09)).A01((Boolean) null, r03.A02, num3, num4, str2, r03.A05, 4, false);
            r2 = (AnonymousClass1UZ) r1.A0G.get();
            A00(r1, r2);
        }
        r2.A05("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
    }

    public void A02(Integer num, String str, int i, boolean z) {
        Integer num2 = num;
        String str2 = str;
        int i2 = i;
        if (this instanceof C107595Qc) {
            C107595Qc r0 = (C107595Qc) this;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("XFamilyCrosspostRequestSessionManager/[Retry]Error encountered for session: ");
            A0u.append(str2);
            A0u.append(" with errorCode: ");
            A0u.append(i2);
            AnonymousClass00C.A0D(AnonymousClass000.A0l(num2, " and errorSubCode: ", A0u), 0);
            C64583Oo r3 = (C64583Oo) r0.A00.A04.get();
            List list = r0.A03;
            boolean z2 = r0.A04;
            int i3 = 10;
            if (z2) {
                i3 = 9;
            }
            r3.A01(r0.A01, Integer.valueOf(i3), Integer.valueOf(i2), num2, str2, list, 3, z2);
        } else if (this instanceof C107615Qe) {
            C107615Qe r02 = (C107615Qe) this;
            AnonymousClass00C.A0D(AnonymousClass000.A0r("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/error Failed eligibility check. Errorcode: ", AnonymousClass000.A0u(), i2), 0);
            C35011i0 r2 = r02.A02;
            List list2 = r02.A05;
            ((C64583Oo) C36411kG.A0v(r2.A09)).A01((Boolean) null, r02.A03, Integer.valueOf(i2), num2, str2, list2, 3, true);
            AnonymousClass005 r4 = r2.A0G;
            A00(r2, (AnonymousClass1UZ) r4.get());
            Context context = r02.A00;
            C122805vS r5 = r02.A01;
            if (z) {
                C35141iD r42 = new C35141iD(r2, r5, list2, 5);
                C99314t4 r32 = new C99314t4(context, r2, num2, i2);
                C132686Uv r22 = (C132686Uv) r2.A0A.get();
                r22.A01.Bp3(new C1502774q(r42, r32, r5, r22));
                return;
            }
            C35011i0.A00(context, r2, num2, "status_fragment", i2);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Error code: ");
            A0u2.append(i2);
            ((AnonymousClass1UZ) r4.get()).A05("SEE_CROSSPOST_ERROR", AnonymousClass000.A0l(num2, ", error subcode: ", A0u2));
        } else {
            C107605Qd r03 = (C107605Qd) this;
            C35011i0 r43 = r03.A01;
            C35011i0.A00(r03.A00, r43, num2, r03.A04, i2);
            ((C64583Oo) C36411kG.A0v(r43.A09)).A01((Boolean) null, r03.A02, Integer.valueOf(i2), num2, str2, r03.A05, 3, false);
            AnonymousClass1UZ r33 = (AnonymousClass1UZ) r43.A0G.get();
            A00(r43, r33);
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("Error code: ");
            A0u3.append(i2);
            r33.A05("SEE_CROSSPOST_ERROR", AnonymousClass000.A0l(num2, ", error subcode: ", A0u3));
        }
    }
}
