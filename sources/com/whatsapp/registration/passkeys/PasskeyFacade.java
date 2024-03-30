package com.whatsapp.registration.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C1888691b;
import X.C19420v0;
import X.C36321k7;
import X.C52012ok;
import X.C61943Ec;
import X.C63293Jm;

public final class PasskeyFacade {
    public final C19420v0 A00;
    public final PasskeyAndroidApiImpl A01;
    public final C63293Jm A02;
    public final C61943Ec A03;
    public final PasskeyServerApiImpl A04;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Enum A00(X.AnonymousClass01L r13, X.C023509x r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C21937AdG
            if (r0 == 0) goto L_0x017e
            r6 = r14
            X.AdG r6 = (X.C21937AdG) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x017e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r8 = r6.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 4
            r11 = 3
            r9 = 2
            r4 = 1
            r10 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0055
            if (r0 == r4) goto L_0x0049
            if (r0 == r9) goto L_0x00d9
            if (r0 == r11) goto L_0x0127
            if (r0 != r5) goto L_0x01a3
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r8)
        L_0x002f:
            X.97X r8 = (X.AnonymousClass97X) r8
            boolean r0 = r8 instanceof X.C182148oc
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server finishRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r1 = r3.A03
            r0 = 10
            r1.A00(r0, r2)
            X.0v0 r0 = r3.A00
            r0.A1y(r4)
            X.5Sx r0 = X.C108285Sx.PASSKEY_CREATED
            return r0
        L_0x0049:
            java.lang.Object r13 = r6.L$1
            X.01L r13 = (X.AnonymousClass01L) r13
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r8)
            goto L_0x008c
        L_0x0055:
            X.AnonymousClass0AN.A00(r8)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/passkeyEligibility check"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r12.A03()
            if (r0 != 0) goto L_0x0066
            X.5Sx r0 = X.C108285Sx.INELIGIBLE
            return r0
        L_0x0066:
            X.3Jm r0 = r12.A02
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "reg_abprop_passkey_create"
            X.C36331k8.A0w(r1, r0, r10)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r0 = r12.A03
            r0.A00(r4, r2)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r12.A04
            r6.L$0 = r12
            r6.L$1 = r13
            r6.label = r4
            java.lang.Object r8 = r0.A04(r6)
            if (r8 == r7) goto L_0x01e6
            r3 = r12
        L_0x008c:
            X.97X r8 = (X.AnonymousClass97X) r8
            boolean r0 = r8 instanceof X.C182138ob
            if (r0 == 0) goto L_0x00a5
            X.8ob r8 = (X.C182138ob) r8
            java.lang.Object r1 = r8.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists error"
            com.whatsapp.util.Log.e(r0, r1)
            X.3Ec r0 = r3.A03
            r0.A00(r11, r1)
            X.5Sx r0 = X.C108285Sx.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x00a5:
            boolean r0 = r8 instanceof X.C182148oc
            if (r0 == 0) goto L_0x01e1
            X.8oc r8 = (X.C182148oc) r8
            java.lang.Object r0 = r8.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists already_exists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r0 = r3.A03
            r0.A00(r9, r2)
            X.5Sx r0 = X.C108285Sx.ALREADY_HAS_PASSKEY
            return r0
        L_0x00c0:
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server passkeyExists doesnt_exist_yet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r0 = r3.A03
            r0.A00(r5, r2)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r3.A04
            r6.L$0 = r3
            r6.L$1 = r13
            r6.label = r9
            java.lang.Object r8 = r0.A05(r6)
            if (r8 != r7) goto L_0x00e4
            return r7
        L_0x00d9:
            java.lang.Object r13 = r6.L$1
            X.01L r13 = (X.AnonymousClass01L) r13
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r8)
        L_0x00e4:
            X.97X r8 = (X.AnonymousClass97X) r8
            boolean r0 = r8 instanceof X.C182138ob
            if (r0 == 0) goto L_0x00fe
            X.8ob r8 = (X.C182138ob) r8
            java.lang.Object r2 = r8.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server startRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 6
            r1.A00(r0, r2)
            X.5Sx r0 = X.C108285Sx.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x00fe:
            boolean r0 = r8 instanceof X.C182148oc
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server startRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r1 = r3.A03
            r0 = 5
            r1.A00(r0, r2)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r1 = r3.A01
            X.8oc r8 = (X.C182148oc) r8
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            r6.L$0 = r3
            r6.L$1 = r2
            r6.label = r11
            java.lang.Object r8 = r1.A00(r13, r0, r6)
            if (r8 != r7) goto L_0x012e
            return r7
        L_0x0127:
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r8)
        L_0x012e:
            X.97X r8 = (X.AnonymousClass97X) r8
            boolean r0 = r8 instanceof X.C182138ob
            if (r0 == 0) goto L_0x0157
            X.8ob r8 = (X.C182138ob) r8
            java.lang.Object r1 = r8.A00
            X.9WL r1 = (X.AnonymousClass9WL) r1
            X.8z6 r0 = r1.A00
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x01c6
            if (r0 == r4) goto L_0x01b5
            r2 = 9
            java.lang.Throwable r1 = r1.A02
            if (r0 == r9) goto L_0x01a8
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client error"
            com.whatsapp.util.Log.e(r0, r1)
            X.3Ec r0 = r3.A03
            r0.A00(r2, r1)
            X.5Sx r0 = X.C108285Sx.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            return r0
        L_0x0157:
            boolean r0 = r8 instanceof X.C182148oc
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r1 = r3.A03
            r0 = 7
            r1.A00(r0, r2)
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server finishRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r1 = r3.A04
            X.8oc r8 = (X.C182148oc) r8
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            r6.L$0 = r3
            r6.label = r5
            java.lang.Object r8 = r1.A02(r0, r6)
            if (r8 != r7) goto L_0x002f
            return r7
        L_0x017e:
            X.AdG r6 = new X.AdG
            r6.<init>(r12, r14)
            goto L_0x0012
        L_0x0185:
            boolean r0 = r8 instanceof X.C182138ob
            if (r0 == 0) goto L_0x019e
            X.8ob r8 = (X.C182138ob) r8
            java.lang.Object r2 = r8.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/server finishRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 11
            r1.A00(r0, r2)
            X.5Sx r0 = X.C108285Sx.ERROR_AFTER_USER_INTERACTION
            return r0
        L_0x019e:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x01a8:
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client error before user interaction"
            com.whatsapp.util.Log.e(r0, r1)
            X.3Ec r0 = r3.A03
            r0.A00(r2, r1)
            X.5Sx r0 = X.C108285Sx.ERROR_BEFORE_USER_INTERACTION
            return r0
        L_0x01b5:
            java.lang.Throwable r2 = r1.A02
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client canceled"
            com.whatsapp.util.Log.i(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 8
            r1.A00(r0, r2)
            X.5Sx r0 = X.C108285Sx.USER_CANCELED
            return r0
        L_0x01c6:
            java.lang.Throwable r2 = r1.A02
            java.lang.String r0 = "PasskeyFacade/maybeCreatePasskeyWithoutEducationScreen/client ineligible (even though eligibilty check passed)"
            com.whatsapp.util.Log.e(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 19
            r1.A00(r0, r2)
            X.5Sx r0 = X.C108285Sx.INELIGIBLE
            return r0
        L_0x01d7:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01dc:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01e1:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01e6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyFacade.A00(X.01L, X.09x):java.lang.Enum");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Enum A01(X.C023509x r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21928Ad2
            if (r0 == 0) goto L_0x0056
            r5 = r7
            X.Ad2 r5 = (X.C21928Ad2) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            if (r0 != r1) goto L_0x0080
            java.lang.Object r1 = r5.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r1 = (com.whatsapp.registration.passkeys.PasskeyFacade) r1
            X.AnonymousClass0AN.A00(r4)
        L_0x0025:
            X.97X r4 = (X.AnonymousClass97X) r4
            boolean r0 = r4 instanceof X.C182138ob
            if (r0 == 0) goto L_0x005c
            X.8ob r4 = (X.C182138ob) r4
            java.lang.Object r2 = r4.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/checkPasskeyExists/server passkeyExists error"
            com.whatsapp.util.Log.e(r0, r2)
            X.3Ec r1 = r1.A03
            r0 = 3
            r1.A00(r0, r2)
            X.8yv r0 = X.C188028yv.EXISTS_CHECK_ERROR
            return r0
        L_0x003f:
            X.AnonymousClass0AN.A00(r4)
            X.3Ec r0 = r6.A03
            r0.A00(r1, r2)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r6.A04
            r5.L$0 = r6
            r5.label = r1
            java.lang.Object r4 = r0.A04(r5)
            if (r4 != r3) goto L_0x0054
            return r3
        L_0x0054:
            r1 = r6
            goto L_0x0025
        L_0x0056:
            X.Ad2 r5 = new X.Ad2
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x005c:
            boolean r0 = r4 instanceof X.C182148oc
            if (r0 == 0) goto L_0x007b
            X.8oc r4 = (X.C182148oc) r4
            java.lang.Object r0 = r4.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "PasskeyFacade/checkPasskeyExists/server passkeyExists already_exists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r1 = r1.A03
            r0 = 2
            r1.A00(r0, r2)
            X.8yv r0 = X.C188028yv.ALREADY_HAS_PASSKEY
            return r0
        L_0x0078:
            X.8yv r0 = X.C188028yv.DOES_NOT_HAVE_PASSKEY
            return r0
        L_0x007b:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyFacade.A01(X.09x):java.lang.Enum");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass01L r12, X.C023509x r13, X.AnonymousClass00S r14) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C21942AdL
            if (r0 == 0) goto L_0x014b
            r6 = r13
            X.AdL r6 = (X.C21942AdL) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x014b
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r9 = r6.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 3
            r8 = 2
            r5 = 1
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x005b
            if (r0 == r5) goto L_0x004b
            if (r0 == r8) goto L_0x00c3
            if (r0 != r4) goto L_0x0152
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x002c:
            X.97X r9 = (X.AnonymousClass97X) r9
            boolean r0 = r9 instanceof X.C182148oc
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r1 = r3.A03
            r0 = 10
            r1.A00(r0, r2)
            X.0v0 r0 = r3.A00
            r0.A1y(r5)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            X.8oc r1 = new X.8oc
            r1.<init>(r0)
            return r1
        L_0x004b:
            java.lang.Object r14 = r6.L$2
            X.00S r14 = (X.AnonymousClass00S) r14
            java.lang.Object r12 = r6.L$1
            X.01L r12 = (X.AnonymousClass01L) r12
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r9)
            goto L_0x007a
        L_0x005b:
            X.AnonymousClass0AN.A00(r9)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r3 = r11.A03
            r0 = 4
            r3.A00(r0, r2)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r11.A04
            r6.L$0 = r11
            r6.L$1 = r12
            r6.L$2 = r14
            r6.label = r5
            java.lang.Object r9 = r0.A05(r6)
            if (r9 == r7) goto L_0x018b
            r3 = r11
        L_0x007a:
            X.97X r9 = (X.AnonymousClass97X) r9
            r14.invoke()
            boolean r0 = r9 instanceof X.C182138ob
            if (r0 == 0) goto L_0x0098
            X.8ob r9 = (X.C182138ob) r9
            java.lang.Object r2 = r9.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister error"
            com.whatsapp.util.Log.i(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 6
            r1.A00(r0, r2)
            X.8zC r2 = X.C188198zC.ERROR_BEFORE_USER_INTERACTION
            goto L_0x016f
        L_0x0098:
            boolean r0 = r9 instanceof X.C182148oc
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server startRegister success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r10 = r3.A03
            r0 = 5
            r10.A00(r0, r2)
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r10 = r3.A01
            X.8oc r9 = (X.C182148oc) r9
            java.lang.Object r0 = r9.A00
            java.lang.String r0 = (java.lang.String) r0
            r6.L$0 = r3
            r6.L$1 = r2
            r6.L$2 = r2
            r6.label = r8
            java.lang.Object r9 = r10.A00(r12, r0, r6)
            if (r9 != r7) goto L_0x00ca
            return r7
        L_0x00c3:
            java.lang.Object r3 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyFacade r3 = (com.whatsapp.registration.passkeys.PasskeyFacade) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x00ca:
            X.97X r9 = (X.AnonymousClass97X) r9
            boolean r0 = r9 instanceof X.C182138ob
            if (r0 == 0) goto L_0x0124
            X.8ob r9 = (X.C182138ob) r9
            java.lang.Object r4 = r9.A00
            X.9WL r4 = (X.AnonymousClass9WL) r4
            X.8z6 r0 = r4.A00
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0113
            if (r0 == r5) goto L_0x0102
            r2 = 9
            java.lang.Throwable r1 = r4.A02
            if (r0 == r8) goto L_0x00f5
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client error"
            com.whatsapp.util.Log.e(r0, r1)
            X.3Ec r0 = r3.A03
            r0.A00(r2, r1)
            X.8zC r2 = X.C188198zC.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION_BUT_BEFORE_SENDING_PASSKEY_TO_SERVER
        L_0x00f2:
            X.8zD r1 = r4.A01
            goto L_0x0171
        L_0x00f5:
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client error before user interaction"
            com.whatsapp.util.Log.e(r0, r1)
            X.3Ec r0 = r3.A03
            r0.A00(r2, r1)
            X.8zC r2 = X.C188198zC.ERROR_BEFORE_USER_INTERACTION
            goto L_0x00f2
        L_0x0102:
            java.lang.Throwable r2 = r4.A02
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client canceled"
            com.whatsapp.util.Log.i(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 8
            r1.A00(r0, r2)
            X.8zC r2 = X.C188198zC.USER_CANCELED
            goto L_0x00f2
        L_0x0113:
            java.lang.Throwable r2 = r4.A02
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client ineligible"
            com.whatsapp.util.Log.i(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 19
            r1.A00(r0, r2)
            X.8zC r2 = X.C188198zC.INELIGIBLE
            goto L_0x00f2
        L_0x0124:
            boolean r0 = r9 instanceof X.C182148oc
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/client success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ec r1 = r3.A03
            r0 = 7
            r1.A00(r0, r2)
            X.8oc r9 = (X.C182148oc) r9
            java.lang.Object r1 = r9.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r3.A04
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r9 = r0.A02(r1, r6)
            if (r9 != r7) goto L_0x002c
            return r7
        L_0x014b:
            X.AdL r6 = new X.AdL
            r6.<init>(r11, r13)
            goto L_0x0012
        L_0x0152:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0157:
            boolean r0 = r9 instanceof X.C182138ob
            if (r0 == 0) goto L_0x017c
            X.8ob r9 = (X.C182138ob) r9
            java.lang.Object r2 = r9.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "PasskeyFacade/passkeyCreate/server finishRegister error"
            com.whatsapp.util.Log.e(r0, r2)
            X.3Ec r1 = r3.A03
            r0 = 11
            r1.A00(r0, r2)
            X.8zC r2 = X.C188198zC.ERROR_AFTER_USER_INTERACTION_AFTER_SENDING_PASSKEY_TO_SERVER
        L_0x016f:
            X.8zD r1 = X.C188208zD.CHECK_NETWORK
        L_0x0171:
            X.9Vu r0 = new X.9Vu
            r0.<init>(r1, r2)
            X.8ob r1 = new X.8ob
            r1.<init>(r0)
            return r1
        L_0x017c:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0181:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0186:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x018b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyFacade.A02(X.01L, X.09x, X.00S):java.lang.Object");
    }

    public final boolean A03() {
        C61943Ec r4 = this.A03;
        r4.A00(17, (Throwable) null);
        C52012ok A002 = this.A02.A00();
        C36321k7.A1K(A002, "PasskeyFacade/checkAndLogEligibilityForCreationDuringRegFlow/passkeyEligibility ", AnonymousClass000.A0u());
        switch (A002.ordinal()) {
            case 0:
                return true;
            case 1:
                r4.A00(18, new C1888691b("not_rolled_out"));
                return false;
            case 2:
                r4.A00(18, new C1888691b("android_too_old"));
                return false;
            case 3:
                r4.A00(18, new C1888691b("device_not_secured"));
                return false;
            case 4:
                r4.A00(18, new C1888691b("play_services_disabled"));
                return false;
            case 5:
                r4.A00(18, new C1888691b("missing_credential_manager"));
                return false;
            default:
                r4.A00(18, new C1888691b("gms_too_old"));
                return false;
        }
    }

    public PasskeyFacade(C19420v0 r2, PasskeyAndroidApiImpl passkeyAndroidApiImpl, C63293Jm r4, C61943Ec r5, PasskeyServerApiImpl passkeyServerApiImpl) {
        C36321k7.A0x(passkeyServerApiImpl, passkeyAndroidApiImpl);
        AnonymousClass00C.A0D(r2, 4);
        this.A04 = passkeyServerApiImpl;
        this.A01 = passkeyAndroidApiImpl;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
    }
}
