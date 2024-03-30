package X;

import com.whatsapp.email.UpdateEmailActivity;
import com.whatsapp.registration.email.RegisterEmail;

/* renamed from: X.4Yv  reason: invalid class name and case insensitive filesystem */
public class C90034Yv implements B12 {
    public Object A00;
    public String A01;
    public final int A02;

    public C90034Yv(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public void BXN(Integer num) {
        int i = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            C36321k7.A1J(num, "RegisterEmail/executeSetEmailRequest/onFailure/error code: ", A0u);
            RegisterEmail registerEmail = (RegisterEmail) this.A00;
            C19650wI r1 = registerEmail.A09;
            if (r1 != null) {
                r1.Bp3(C80313vC.A00(registerEmail, num, 32));
                return;
            }
            throw C36331k8.A0d("mainThreadHandler");
        }
        C36321k7.A1J(num, "UpdateEmailActivity/executeSetEmailRequest/onFailure/error code: ", A0u);
        UpdateEmailActivity updateEmailActivity = (UpdateEmailActivity) this.A00;
        C19650wI r3 = updateEmailActivity.A06;
        if (r3 != null) {
            r3.Bp3(new C1502274l(updateEmailActivity, num, this.A01, 47));
            return;
        }
        throw C36331k8.A0d("mainThreadHandler");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.whatsapp.email.UpdateEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.whatsapp.registration.email.RegisterEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.whatsapp.email.UpdateEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.whatsapp.email.UpdateEmailActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiJ(boolean r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "RegisterEmail/executeSetEmailRequest/onSuccess/verifyEmail: "
            X.C36321k7.A1X(r0, r1, r6)
            java.lang.Object r4 = r5.A00
            com.whatsapp.registration.email.RegisterEmail r4 = (com.whatsapp.registration.email.RegisterEmail) r4
            X.0wI r3 = r4.A09
            if (r3 == 0) goto L_0x0032
            java.lang.String r2 = r5.A01
            r1 = 6
        L_0x0018:
            X.3vJ r0 = new X.3vJ
            r0.<init>(r4, r2, r1, r6)
            r3.Bp3(r0)
            return
        L_0x0021:
            java.lang.String r0 = "UpdateEmailActivity/executeSetEmailRequest/onSuccess/verifyEmail: "
            X.C36321k7.A1X(r0, r1, r6)
            java.lang.Object r4 = r5.A00
            com.whatsapp.email.UpdateEmailActivity r4 = (com.whatsapp.email.UpdateEmailActivity) r4
            X.0wI r3 = r4.A06
            if (r3 == 0) goto L_0x0039
            java.lang.String r2 = r5.A01
            r1 = 4
            goto L_0x0018
        L_0x0032:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0039:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90034Yv.BiJ(boolean):void");
    }
}
