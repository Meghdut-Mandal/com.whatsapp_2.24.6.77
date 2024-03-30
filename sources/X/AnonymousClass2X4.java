package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.email.VerifyEmail;

/* renamed from: X.2X4  reason: invalid class name */
public class AnonymousClass2X4 implements B13 {
    public Object A00;
    public final int A01;

    public AnonymousClass2X4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXO(Integer num, Long l) {
        C19650wI r3;
        Runnable r2;
        int i = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            A0u.append("VerifyEmail/executeVerifyEmailOtpRequest/onFailure/code: ");
            A0u.append(num);
            C36321k7.A1J(l, "; waitTime: ", A0u);
            VerifyEmail verifyEmail = (VerifyEmail) this.A00;
            r3 = verifyEmail.A3j();
            r2 = new AnonymousClass737(verifyEmail, l, num, 1);
        } else {
            A0u.append("VerifyEmailActivity/executeVerifyEmailOtpRequest/onFailure/code: ");
            A0u.append(num);
            C36321k7.A1J(l, "; waitTime: ", A0u);
            VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
            r3 = verifyEmailActivity.A08;
            if (r3 != null) {
                r2 = new C80403vL(verifyEmailActivity, num, l, 36);
            } else {
                throw C36331k8.A0d("mainThreadHandler");
            }
        }
        r3.Bp3(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.email.VerifyEmailActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiQ(long r8, boolean r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r4 = r8
            r6 = r10
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "VerifyEmail/executeVerifyEmailOtpRequest/onSuccess/verified : "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", waitTime : "
            X.C36321k7.A1V(r0, r1, r8)
            java.lang.Object r2 = r7.A00
            com.whatsapp.registration.email.VerifyEmail r2 = (com.whatsapp.registration.email.VerifyEmail) r2
            X.0wI r0 = r2.A3j()
            r3 = 3
        L_0x0020:
            X.3we r1 = new X.3we
            r1.<init>(r2, r3, r4, r6)
            r0.Bp3(r1)
            return
        L_0x0029:
            java.lang.String r0 = "VerifyEmailActivity/executeVerifyEmailOtpRequest/onSuccess/verified : "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", waitTime : "
            X.C36321k7.A1V(r0, r1, r8)
            java.lang.Object r2 = r7.A00
            com.whatsapp.email.VerifyEmailActivity r2 = (com.whatsapp.email.VerifyEmailActivity) r2
            X.0wI r0 = r2.A08
            if (r0 == 0) goto L_0x0040
            r3 = 1
            goto L_0x0020
        L_0x0040:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2X4.BiQ(long, boolean):void");
    }
}
