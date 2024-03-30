package com.whatsapp.registration.passkeys;

import X.AnonymousClass3L9;

public final class PasskeyAndroidApiImpl {
    public final AnonymousClass3L9 A00;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.AnonymousClass01L r13, java.lang.String r14, X.C023509x r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C21926Ad0
            r2 = r12
            if (r0 == 0) goto L_0x0023
            r6 = r15
            X.Ad0 r6 = (X.C21926Ad0) r6
            int r3 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0023
            int r3 = r3 - r1
            r6.label = r3
        L_0x0013:
            java.lang.Object r1 = r6.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r4) goto L_0x0029
            java.lang.Object r2 = r6.L$0
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r2 = (com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl) r2
            goto L_0x0088
        L_0x0023:
            X.Ad0 r6 = new X.Ad0
            r6.<init>(r12, r15)
            goto L_0x0013
        L_0x0029:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002e:
            X.AnonymousClass0AN.A00(r1)
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 0
            r7 = r13
            X.AnonymousClass00C.A0D(r13, r5)
            X.9BW r1 = new X.9BW
            r1.<init>(r13)
            X.7wz r8 = new X.7wz
            r8.<init>(r14)
            r6.L$0 = r12     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r6.label = r4     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.0AR r4 = X.C36371kC.A12(r6)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            android.os.CancellationSignal r9 = new android.os.CancellationSignal     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r9.<init>()     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.AkO r0 = new X.AkO     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r0.<init>(r9)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r4.BL1(r0)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.B9k r11 = new X.B9k     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r11.<init>(r4, r5)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.AYs r10 = X.AYs.A00     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r0 = 3
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            android.content.Context r1 = r1.A00     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.9dY r0 = new X.9dY     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r0.<init>(r1)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.B24 r6 = r0.A01()     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            if (r6 != 0) goto L_0x0081
            java.lang.String r1 = "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"
            X.7xF r0 = new X.7xF     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r0.<init>(r1)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r11.BWn(r0)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
        L_0x007c:
            java.lang.Object r1 = r4.A0G()     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            goto L_0x0085
        L_0x0081:
            r6.onCreateCredential(r7, r8, r9, r10, r11)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            goto L_0x007c
        L_0x0085:
            if (r1 != r3) goto L_0x008b
            return r3
        L_0x0088:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
        L_0x008b:
            X.9BU r1 = (X.AnonymousClass9BU) r1     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.7x1 r1 = (X.C166917x1) r1     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            java.lang.String r1 = r1.A00     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            X.8oc r0 = new X.8oc     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            r0.<init>(r1)     // Catch:{ 7xC -> 0x0170, 7xA -> 0x016c, 7xD -> 0x0168, 7xE -> 0x015c, 7xF -> 0x0149, 7xG -> 0x0145, 7xH -> 0x0141, 7xt -> 0x00a6, 7xB -> 0x00a1, 91l -> 0x0179 }
            return r0
        L_0x00a1:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: public key exception"
            goto L_0x017c
        L_0x00a6:
            r1 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: public key dom exception ("
            r3.append(r0)
            X.9BZ r0 = r1.domError
            java.lang.String r0 = X.AnonymousClass000.A0m(r0, r3)
            com.whatsapp.util.Log.i(r0, r1)
            X.9BZ r3 = r1.domError
            boolean r0 = r3 instanceof X.C167167xQ
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: AbortError"
        L_0x00c1:
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            X.8zD r0 = X.C188208zD.NO_REMEDY_AVAILABLE
        L_0x00c8:
            X.9WL r2 = new X.9WL
            r2.<init>(r3, r0, r1)
            goto L_0x0188
        L_0x00cf:
            boolean r0 = r3 instanceof X.C167177xR
            if (r0 == 0) goto L_0x00e5
            X.3L9 r0 = r2.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0134
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device not secured)"
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.INELIGIBLE
            X.8zD r0 = X.C188208zD.SECURE_DEVICE
            goto L_0x00c8
        L_0x00e5:
            boolean r0 = r3 instanceof X.C167267xa
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: InvalidStateError"
            goto L_0x00c1
        L_0x00ec:
            boolean r0 = r3 instanceof X.C167307xe
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotAllowedError"
        L_0x00f2:
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.CANCELED
            X.8zD r0 = X.C188208zD.NO_REMEDY_REQUIRED
            goto L_0x00c8
        L_0x00fa:
            boolean r0 = r3 instanceof X.C167337xh
            if (r0 == 0) goto L_0x0110
            X.3L9 r0 = r2.A00
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotSupportedError (gms too old)"
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.INELIGIBLE
            X.8zD r0 = X.C188208zD.UPDATE_PLAY_SERVICES
            goto L_0x00c8
        L_0x0110:
            boolean r0 = r3 instanceof X.C167387xm
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: SecurityError"
        L_0x0116:
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            X.8zD r0 = X.C188208zD.CHECK_NETWORK
            goto L_0x00c8
        L_0x011e:
            boolean r0 = r3 instanceof X.C167407xo
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: TimeoutError"
            goto L_0x00f2
        L_0x0125:
            boolean r0 = r3 instanceof X.C167287xc
            if (r0 == 0) goto L_0x013e
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Network Error"
            goto L_0x0116
        L_0x012c:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotSupportedError (gms new enough)"
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.ERROR_BEFORE_USER_INTERACTION
            goto L_0x013b
        L_0x0134:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device secured)"
            com.whatsapp.util.Log.i(r0, r1)
            X.8z6 r3 = X.C188138z6.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x013b:
            X.8zD r0 = X.C188208zD.NO_REMEDY_AVAILABLE
            goto L_0x00c8
        L_0x013e:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Other Error"
            goto L_0x00c1
        L_0x0141:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: unsupported"
            goto L_0x0162
        L_0x0145:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: unknown exception"
            goto L_0x017c
        L_0x0149:
            r3 = move-exception
            X.3L9 r0 = r2.A00
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0160
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: ineligible. play services not available"
            com.whatsapp.util.Log.i(r0, r3)
            X.8z6 r1 = X.C188138z6.INELIGIBLE
            X.8zD r0 = X.C188208zD.INSTALL_PLAY_SERVICES
            goto L_0x0183
        L_0x015c:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: no create option"
            goto L_0x0162
        L_0x0160:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: credential provider configuration exception"
        L_0x0162:
            com.whatsapp.util.Log.i(r0, r3)
            X.8z6 r1 = X.C188138z6.ERROR_BEFORE_USER_INTERACTION
            goto L_0x0181
        L_0x0168:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: interrupted"
            goto L_0x017c
        L_0x016c:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: custom exception"
            goto L_0x017c
        L_0x0170:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: cancelled"
            com.whatsapp.util.Log.i(r0, r3)
            X.8z6 r1 = X.C188138z6.CANCELED
            goto L_0x0181
        L_0x0179:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: exception"
        L_0x017c:
            com.whatsapp.util.Log.i(r0, r3)
            X.8z6 r1 = X.C188138z6.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x0181:
            X.8zD r0 = X.C188208zD.NO_REMEDY_AVAILABLE
        L_0x0183:
            X.9WL r2 = new X.9WL
            r2.<init>(r1, r0, r3)
        L_0x0188:
            X.8ob r0 = new X.8ob
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl.A00(X.01L, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: exception";
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: public key exception";
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: no credentials", r1);
        r2 = X.C188188zB.A06;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: unsupported", r1);
        r2 = X.C188188zB.A03;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: unknown exception";
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r1 = move-exception;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e6, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: interrupted";
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        r0 = "PasskeyAndroidApi: Logging in with passkey: custom exception";
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ee, code lost:
        com.whatsapp.util.Log.i("PasskeyAndroidApi: Logging in with passkey: cancelled", r1);
        r2 = X.C188188zB.A02;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f6, code lost:
        r1 = move-exception;
        r1 = r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x004a, B:22:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[ExcHandler: 91m (r1v13 'e' X.91m A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac A[ExcHandler: 7xJ (r1v12 'e' X.7xJ A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[ExcHandler: 7xP (r1v11 'e' X.7xP A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc A[ExcHandler: 7xO (r1v10 'e' X.7xO A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5 A[ExcHandler: 7xN (r1v9 'e' X.7xN A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5 A[ExcHandler: 7xL (r1v7 'e' X.7xL A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9 A[ExcHandler: 7xI (r1v6 'e' X.7xI A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed A[ExcHandler: 7xK (r1v5 'e' X.7xK A[CUSTOM_DECLARE]), Splitter:B:13:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.AnonymousClass01L r11, java.lang.String r12, X.C023509x r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C21927Ad1
            if (r0 == 0) goto L_0x0022
            r2 = r13
            X.Ad1 r2 = (X.C21927Ad1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0022
            int r3 = r3 - r1
            r2.label = r3
        L_0x0012:
            java.lang.Object r1 = r2.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r2.label
            r4 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r4) goto L_0x0028
            java.lang.Object r3 = r2.L$0
            com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl r3 = (com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl) r3
            goto L_0x008d
        L_0x0022:
            X.Ad1 r2 = new X.Ad1
            r2.<init>(r10, r13)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002d:
            X.AnonymousClass0AN.A00(r1)
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r5 = r11
            X.AnonymousClass00C.A0D(r11, r0)
            X.02c r1 = X.C004702c.A00
            X.7x7 r0 = new X.7x7
            r0.<init>(r12, r1)
            java.util.List r0 = X.C36371kC.A11(r0)
            X.9BX r6 = new X.9BX
            r6.<init>(r0)
            r2.L$0 = r10     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r2.label = r4     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.0AR r2 = X.C36371kC.A12(r2)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            android.os.CancellationSignal r7 = new android.os.CancellationSignal     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r7.<init>()     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.AkP r0 = new X.AkP     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r0.<init>(r7)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r2.BL1(r0)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.B9k r9 = new X.B9k     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r9.<init>(r2, r4)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.AYs r8 = X.AYs.A00     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r0 = 3
            X.AnonymousClass00C.A0D(r8, r0)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.9dY r0 = new X.9dY     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r0.<init>(r11)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.B24 r4 = r0.A01()     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            if (r4 != 0) goto L_0x0084
            java.lang.String r1 = "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"
            X.7xM r0 = new X.7xM     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r0.<init>(r1)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r9.BWn(r0)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
        L_0x007f:
            java.lang.Object r1 = r2.A0G()     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            goto L_0x0088
        L_0x0084:
            r4.onGetCredential(r5, r6, r7, r8, r9)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00c9, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00b0, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            goto L_0x007f
        L_0x0088:
            if (r1 != r3) goto L_0x008b
            return r3
        L_0x008b:
            r3 = r10
            goto L_0x0090
        L_0x008d:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
        L_0x0090:
            X.9BY r1 = (X.AnonymousClass9BY) r1     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.9BV r1 = r1.A00     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.PublicKeyCredential"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.7x5 r1 = (X.C166957x5) r1     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            java.lang.String r0 = r1.A00     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            X.8oc r1 = new X.8oc     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            r1.<init>(r0)     // Catch:{ 7xK -> 0x00ed, 7xI -> 0x00e9, 7xL -> 0x00e5, 7xM -> 0x00cc, 7xN -> 0x00c5, 7xO -> 0x00bc, 7xP -> 0x00b3, 7xu -> 0x00f6, 7xJ -> 0x00ac, 91m -> 0x00a8 }
            return r1
        L_0x00a8:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: exception"
            goto L_0x0111
        L_0x00ac:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: public key exception"
            goto L_0x0111
        L_0x00b0:
            r1 = move-exception
            r3 = r10
            goto L_0x00f7
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: no credentials"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.NO_PASSKEY_AVAILABLE
            goto L_0x0116
        L_0x00bc:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: unsupported"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.ERROR_BEFORE_USER_INTERACTION
            goto L_0x0116
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: unknown exception"
            goto L_0x0111
        L_0x00c9:
            r1 = move-exception
            r3 = r10
            goto L_0x00cd
        L_0x00cc:
            r1 = move-exception
        L_0x00cd:
            X.3L9 r0 = r3.A00
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: ineligible. play services not available"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.INELIGIBLE
            goto L_0x0116
        L_0x00dd:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: credential provider configuration exception"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.ERROR_BEFORE_USER_INTERACTION
            goto L_0x0116
        L_0x00e5:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: interrupted"
            goto L_0x0111
        L_0x00e9:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: custom exception"
            goto L_0x0111
        L_0x00ed:
            r1 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: cancelled"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.CANCELED
            goto L_0x0116
        L_0x00f6:
            r1 = move-exception
        L_0x00f7:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: public key dom exception ("
            r2.append(r0)
            X.9BZ r0 = r1.domError
            java.lang.String r0 = X.AnonymousClass000.A0m(r0, r2)
            com.whatsapp.util.Log.i(r0, r1)
            X.9BZ r2 = r1.domError
            boolean r0 = r2 instanceof X.C167167xQ
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: AbortError"
        L_0x0111:
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
        L_0x0116:
            X.3Ig r0 = new X.3Ig
            r0.<init>(r2, r1)
            X.8ob r1 = new X.8ob
            r1.<init>(r0)
            return r1
        L_0x0121:
            boolean r0 = r2 instanceof X.C167177xR
            if (r0 == 0) goto L_0x0135
            X.3L9 r0 = r3.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x015e
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device not secured)"
        L_0x012f:
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.INELIGIBLE
            goto L_0x0116
        L_0x0135:
            boolean r0 = r2 instanceof X.C167307xe
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotAllowedError"
        L_0x013b:
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.CANCELED
            goto L_0x0116
        L_0x0141:
            boolean r0 = r2 instanceof X.C167337xh
            if (r0 == 0) goto L_0x0150
            X.3L9 r0 = r3.A00
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0166
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms too old)"
            goto L_0x012f
        L_0x0150:
            boolean r0 = r2 instanceof X.C167387xm
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: SecurityError"
            goto L_0x0111
        L_0x0157:
            boolean r0 = r2 instanceof X.C167407xo
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: TimeoutError"
            goto L_0x013b
        L_0x015e:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device secured)"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.ERROR_UNKNOWN_IF_BEFORE_OR_AFTER_USER_INTERACTION
            goto L_0x0116
        L_0x0166:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms new enough)"
            com.whatsapp.util.Log.i(r0, r1)
            X.8zB r2 = X.C188188zB.ERROR_BEFORE_USER_INTERACTION
            goto L_0x0116
        L_0x016e:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Other Error"
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl.A01(X.01L, java.lang.String, X.09x):java.lang.Object");
    }

    public PasskeyAndroidApiImpl(AnonymousClass3L9 r1) {
        this.A00 = r1;
    }
}
