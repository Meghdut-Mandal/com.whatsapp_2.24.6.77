package X;

import android.os.Handler;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.71h  reason: invalid class name and case insensitive filesystem */
public final class C1494571h implements C160237kg {
    public final /* synthetic */ AnonymousClass6EF A00;
    public final /* synthetic */ String A01;

    public C1494571h(AnonymousClass6EF r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void BVK() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility delivery failure for session: ");
        String str = this.A01;
        C90464aC.A1R(A0u, str);
        this.A00.A01((Integer) null, (Integer) null, str, true);
    }

    public void BWZ(int i, Integer num) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility failed for session: ");
        String str = this.A01;
        A0u.append(str);
        A0u.append(" with errorCode: ");
        A0u.append(i);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(num, " and errorSubCode: ", A0u), 0);
        this.A00.A02(num, str, i, true);
    }

    public void BiB(C128256Bn r14, C128746Dl r15) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility success for session: ");
        C90464aC.A1R(A0u, this.A01);
        AnonymousClass6EF r11 = this.A00;
        C128256Bn r9 = r14;
        C128746Dl r10 = r15;
        if (r11 instanceof C107615Qe) {
            C107615Qe r112 = (C107615Qe) r11;
            AnonymousClass00C.A0D("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/success Eligibility check successful", 0);
            C35011i0 r2 = r112.A02;
            AnonymousClass73N r7 = new AnonymousClass73N(r2.A0E.get(), r9, r10, r112, 21);
            ((AnonymousClass1UZ) r2.A0G.get()).A04("SEE_CROSSPOST_SUCCESS");
            C132686Uv r4 = (C132686Uv) r2.A0A.get();
            List list = r112.A05;
            String str = r14.A01;
            Integer num = r112.A03;
            C122805vS r3 = r112.A01;
            Handler A0H = C36341k9.A0H();
            C132686Uv.A01(new C106815Ll(A0H, r3, r4, num, r7, str, list), r4, "status_fragment", R.string.f12nameremoved, R.string.f12nameremoved, false);
            A0H.postDelayed(r7, 4000);
        } else if (r11 instanceof C107605Qd) {
            C107605Qd r113 = (C107605Qd) r11;
            C35011i0 r22 = r113.A01;
            AnonymousClass73N r72 = new AnonymousClass73N(r22.A0E.get(), r9, r10, r113, 21);
            ((AnonymousClass1UZ) r22.A0G.get()).A04("SEE_CROSSPOST_SUCCESS");
            C132686Uv r32 = (C132686Uv) r22.A0A.get();
            List list2 = r113.A05;
            String str2 = r14.A01;
            Integer num2 = r113.A02;
            String str3 = r113.A04;
            Handler A0H2 = C36341k9.A0H();
            C132686Uv.A01(new C106825Lm(A0H2, r32, num2, r72, str3, str2, list2), r32, str3, R.string.f12nameremoved, R.string.f12nameremoved, false);
            A0H2.postDelayed(r72, 4000);
        } else {
            throw null;
        }
    }
}
