package X;

import java.security.PublicKey;
import org.json.JSONObject;

/* renamed from: X.6Bd  reason: invalid class name */
public final class AnonymousClass6Bd {
    public final C19970wo A00;
    public final AnonymousClass19A A01;
    public final C130936Na A02;

    public final String A00(String str, PublicKey publicKey, int i) {
        AnonymousClass00C.A0D(str, 0);
        String A012 = C130936Na.A01(Integer.valueOf(i), str, (String) null, publicKey);
        AnonymousClass00C.A08(A012);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("#PWD_WA:11:");
        A0u.append(C36371kC.A09(this.A00));
        return C90464aC.A0f(A012, A0u, ':');
    }

    public final JSONObject A01(String str, String str2) {
        AnonymousClass00C.A0D(str2, 1);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("version", 1);
        A1B.put("timestamp", C36371kC.A09(this.A00));
        A1B.put("password", str2);
        C90494aF.A1I(str, A1B);
        return A1B;
    }

    public final void A02(C160057kO r4, C203399nx r5, String str, C006302t r7, C006302t r8) {
        C90474aD.A13(this.A01, new C165337tG(r8, r4, r7, 5), r5, str);
    }

    public AnonymousClass6Bd(C19970wo r1, C130936Na r2, AnonymousClass19A r3) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }
}
