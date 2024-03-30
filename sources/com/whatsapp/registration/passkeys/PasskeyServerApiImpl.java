package com.whatsapp.registration.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass19A;
import X.AnonymousClass921;
import X.AnonymousClass97X;
import X.C006302t;
import X.C177768eL;
import X.C177778eM;
import X.C177788eN;
import X.C182138ob;
import X.C1889191h;
import X.C1889291i;
import X.C1889891p;
import X.C1900196o;
import X.C203399nx;
import X.C36321k7;
import X.C36391kE;
import X.C36441kJ;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

public final class PasskeyServerApiImpl {
    public final AnonymousClass19A A00;

    public PasskeyServerApiImpl(AnonymousClass19A r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    private final AnonymousClass97X A00(C1900196o r5, C006302t r6) {
        Object obj;
        Object obj2;
        if (r5 instanceof C177778eM) {
            C203399nx r1 = ((C177778eM) r5).A00;
            String A0x = C36391kE.A0x(r1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if (!AnonymousClass00C.A0J(A0x, "result")) {
                C36321k7.A1P("PasskeyServer/parseResponse/success response has bad type attribute: ", A0x, AnonymousClass000.A0u());
                obj = new C1889291i(AnonymousClass000.A0p("bad type attribute: ", A0x, AnonymousClass000.A0u()));
            } else {
                obj2 = r6.invoke(r1);
                return (AnonymousClass97X) obj2;
            }
        } else if (r5 instanceof C177768eL) {
            C203399nx A0c = ((C177768eL) r5).A00.A0c("error");
            if (A0c != null) {
                int A0S = A0c.A0S("code", -1);
                String A0i = A0c.A0i("text", "unknown");
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("PasskeyServer/passkeyExists/response/error: ");
                A0u.append(A0S);
                A0u.append(' ');
                C36321k7.A1Z(A0u, A0i);
                obj = new C1889891p(A0S, A0i);
            } else {
                Log.e("PasskeyServer/passkeyExists/response/error: malformed error response, no error node");
                obj = new C1889191h();
            }
        } else if (r5 instanceof C177788eN) {
            Log.e("PasskeyServer/parseResponse/deliveryFailure");
            obj = AnonymousClass921.A00;
        } else {
            throw C36441kJ.A18();
        }
        obj2 = new C182138ob(obj);
        return (AnonymousClass97X) obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.registration.passkeys.PasskeyServerApiImpl r10, java.lang.String r11, X.C023509x r12, X.C006302t r13, int r14, long r15) {
        /*
            boolean r0 = r12 instanceof X.C21938AdH
            if (r0 == 0) goto L_0x0060
            r9 = r12
            X.AdH r9 = (X.C21938AdH) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r9.label = r2
        L_0x0012:
            java.lang.Object r1 = r9.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r4 = 1
            if (r0 == 0) goto L_0x0021
            if (r0 != r4) goto L_0x0066
            X.AnonymousClass0AN.A00(r1)
        L_0x0020:
            return r1
        L_0x0021:
            X.AnonymousClass0AN.A00(r1)
            X.19A r6 = r10.A00
            java.lang.String r8 = r6.A09()
            X.6QB r5 = X.C36421kH.A0T()
            java.lang.String r0 = "id"
            X.C36331k8.A1D(r5, r0, r8)
            java.lang.String r0 = "type"
            X.C36331k8.A1D(r5, r0, r11)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "passkey"
            X.C36331k8.A1D(r5, r1, r0)
            java.lang.String r2 = "smax_id"
            r0 = r15
            X.C36411kG.A1K(r5, r2, r0)
            X.C36341k9.A1C(r5)
            r13.invoke(r5)
            X.9nx r7 = r5.A03()
            r9.L$0 = r8
            r10 = r14
            r9.I$0 = r14
            r9.label = r4
            r11 = 32000(0x7d00, double:1.581E-319)
            r13 = 0
            java.lang.Object r1 = r6.A08(r7, r8, r9, r10, r11, r13)
            if (r1 != r3) goto L_0x0020
            return r3
        L_0x0060:
            X.AdH r9 = new X.AdH
            r9.<init>(r10, r12)
            goto L_0x0012
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A01(com.whatsapp.registration.passkeys.PasskeyServerApiImpl, java.lang.String, X.09x, X.02t, int, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.String r12, X.C023509x r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C21929Ad3
            r4 = r11
            if (r0 == 0) goto L_0x0055
            r6 = r13
            X.Ad3 r6 = (X.C21929Ad3) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x005b
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.AnonymousClass0AN.A00(r3)
        L_0x0025:
            X.96o r3 = (X.C1900196o) r3
            X.AoI r0 = X.C22536AoI.A00
            X.97X r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PasskeyServer/finishRegister: "
            X.C36321k7.A1K(r2, r0, r1)
            return r2
        L_0x0037:
            X.AnonymousClass0AN.A00(r3)
            java.lang.String r0 = "PasskeyServer/finishRegister/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.Amk r7 = new X.Amk
            r7.<init>(r12)
            r6.L$0 = r11
            r6.label = r1
            java.lang.String r5 = "set"
            r9 = 126(0x7e, double:6.23E-322)
            r8 = 418(0x1a2, float:5.86E-43)
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0055:
            X.Ad3 r6 = new X.Ad3
            r6.<init>(r11, r13)
            goto L_0x0013
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A02(java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.C023509x r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C21930Ad4
            r4 = r11
            if (r0 == 0) goto L_0x0052
            r6 = r12
            X.Ad4 r6 = (X.C21930Ad4) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x0058
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.AnonymousClass0AN.A00(r3)
        L_0x0025:
            X.96o r3 = (X.C1900196o) r3
            X.AoM r0 = X.C22540AoM.A00
            X.97X r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PasskeyServer/passkeyDelete: "
            X.C36321k7.A1K(r2, r0, r1)
            return r2
        L_0x0037:
            X.AnonymousClass0AN.A00(r3)
            java.lang.String r0 = "PasskeyServer/passkeyDelete/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AoL r7 = X.C22539AoL.A00
            r6.L$0 = r11
            r6.label = r1
            java.lang.String r5 = "set"
            r9 = 129(0x81, double:6.37E-322)
            r8 = 420(0x1a4, float:5.89E-43)
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0052:
            X.Ad4 r6 = new X.Ad4
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A03(X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C023509x r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C21931Ad5
            r4 = r11
            if (r0 == 0) goto L_0x0052
            r6 = r12
            X.Ad5 r6 = (X.C21931Ad5) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x0058
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.AnonymousClass0AN.A00(r3)
        L_0x0025:
            X.96o r3 = (X.C1900196o) r3
            X.AoJ r0 = X.C22537AoJ.A00
            X.97X r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PasskeyServer/passkeyExists: "
            X.C36321k7.A1K(r2, r0, r1)
            return r2
        L_0x0037:
            X.AnonymousClass0AN.A00(r3)
            java.lang.String r0 = "PasskeyServer/passkeyExists/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AoN r7 = X.C22541AoN.A00
            r6.L$0 = r11
            r6.label = r1
            java.lang.String r5 = "get"
            r9 = 127(0x7f, double:6.27E-322)
            r8 = 411(0x19b, float:5.76E-43)
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0052:
            X.Ad5 r6 = new X.Ad5
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A04(X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(X.C023509x r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.Ad6
            r4 = r11
            if (r0 == 0) goto L_0x004e
            r6 = r12
            X.Ad6 r6 = (X.Ad6) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x0054
            java.lang.Object r4 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.registration.passkeys.PasskeyServerApiImpl) r4
            X.AnonymousClass0AN.A00(r3)
        L_0x0025:
            X.96o r3 = (X.C1900196o) r3
            X.AoK r0 = X.C22538AoK.A00
            X.97X r1 = r4.A00(r3, r0)
            java.lang.String r0 = "PasskeyServer/startRegister result"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r1
        L_0x0033:
            X.AnonymousClass0AN.A00(r3)
            java.lang.String r0 = "PasskeyServer/startRegister/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AoO r7 = X.C22542AoO.A00
            r6.L$0 = r11
            r6.label = r1
            java.lang.String r5 = "get"
            r9 = 125(0x7d, double:6.2E-322)
            r8 = 412(0x19c, float:5.77E-43)
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x004e:
            X.Ad6 r6 = new X.Ad6
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyServerApiImpl.A05(X.09x):java.lang.Object");
    }
}
