package X;

/* renamed from: X.2jd  reason: invalid class name and case insensitive filesystem */
public final class C49752jd extends C132446Tt {
    public final C19420v0 A00;
    public final AnonymousClass3UV A01;
    public final C199929gH A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06 = true;
    public final boolean A07;

    public C49752jd(C19420v0 r3, AnonymousClass3UV r4, C199929gH r5, String str, String str2, String str3, boolean z) {
        C36331k8.A1H(str, str2);
        C36361kB.A1J(r5, 7, r3);
        AnonymousClass00C.A0D(r4, 9);
        this.A07 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/preload/feo2/soft_error", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0160, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/preload/feo2/soft_error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r7.A04.A0A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0174, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0175, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireVerifier", r1);
        r9.A01.A0E("AutoconfManager/acquireVerifier/error", r1.getMessage(), true);
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175 A[ExcHandler: 91W | RemoteException | IllegalArgumentException | SecurityException (r1v15 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:46:0x0126] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r25) {
        /*
            r24 = this;
            java.lang.String r11 = "/failureReason="
            r10 = 0
            r3 = r24
            X.3UV r12 = r3.A01     // Catch:{ Exception -> 0x0256 }
            boolean r6 = r3.A06     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = r3.A04     // Catch:{ Exception -> 0x0256 }
            r19 = r0
            java.lang.String r15 = r3.A05     // Catch:{ Exception -> 0x0256 }
            java.lang.String r4 = r3.A03     // Catch:{ Exception -> 0x0256 }
            X.9gH r9 = r3.A02     // Catch:{ Exception -> 0x0256 }
            byte[] r23 = r9.A01()     // Catch:{ Exception -> 0x0256 }
            r2 = 2
            X.AnonymousClass00C.A0D(r0, r2)     // Catch:{ Exception -> 0x0256 }
            r0 = 3
            X.C36331k8.A1G(r15, r0, r4)     // Catch:{ Exception -> 0x0256 }
            r1 = 0
            if (r23 != 0) goto L_0x0028
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfRequest/null clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0073
        L_0x0028:
            boolean r0 = r12.A0I()     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x0073
            r5 = 1
            r12.A0H(r5)     // Catch:{ Exception -> 0x0256 }
            X.011[] r2 = new X.AnonymousClass011[r2]     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0256 }
            java.nio.charset.Charset r7 = X.AnonymousClass0S4.A05     // Catch:{ Exception -> 0x0256 }
            byte[] r1 = X.C36371kC.A1Z(r0, r7)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "consent_shown"
            X.C36341k9.A1J(r0, r1, r2, r10)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0256 }
            byte[] r1 = X.C36371kC.A1Z(r0, r7)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "create_verifier"
            X.C36341k9.A1J(r0, r1, r2, r5)     // Catch:{ Exception -> 0x0256 }
            java.util.LinkedHashMap r2 = X.C000400e.A08(r2)     // Catch:{ Exception -> 0x0256 }
            X.AnonymousClass3UV.A05(r12, r2)     // Catch:{ Exception -> 0x0256 }
            X.AnonymousClass3UV.A03(r12, r2)     // Catch:{ Exception -> 0x0256 }
            X.3Sd r1 = r12.A09     // Catch:{ Exception -> 0x0256 }
            X.33T r0 = r12.A08     // Catch:{ Exception -> 0x0256 }
            X.2ks r16 = new X.2ks     // Catch:{ Exception -> 0x0256 }
            r18 = r1
            r20 = r15
            r21 = r4
            r22 = r2
            r17 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0256 }
            java.lang.Object r1 = X.AnonymousClass3PM.A00(r16)     // Catch:{ Exception -> 0x0256 }
            X.39S r1 = (X.AnonymousClass39S) r1     // Catch:{ Exception -> 0x0256 }
        L_0x0073:
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0256 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x0256 }
            return r0
        L_0x007f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "AutoconfTask/autoconf entrypoint response/status="
            r2.append(r0)     // Catch:{ Exception -> 0x0256 }
            int r0 = r1.A04     // Catch:{ Exception -> 0x0256 }
            r2.append(r0)     // Catch:{ Exception -> 0x0256 }
            r2.append(r11)     // Catch:{ Exception -> 0x0256 }
            int r0 = r1.A00     // Catch:{ Exception -> 0x0256 }
            r2.append(r0)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "/non-null registerStartMessage="
            r2.append(r0)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = r1.A03     // Catch:{ Exception -> 0x0256 }
            r13 = 1
            boolean r0 = X.AnonymousClass000.A1V(r0)
            X.C36331k8.A1S(r2, r0)     // Catch:{ Exception -> 0x0256 }
            boolean r2 = r3.A07     // Catch:{ Exception -> 0x0256 }
            int r14 = X.C36371kC.A00(r2)
            X.0v0 r0 = r3.A00     // Catch:{ Exception -> 0x0256 }
            android.content.SharedPreferences r3 = X.C36341k9.A0E(r0)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "registration_code_request_method"
            java.lang.String r3 = X.C36371kC.A0t(r3, r0)     // Catch:{ Exception -> 0x0256 }
            r8 = 0
            if (r3 == 0) goto L_0x00f3
            int r0 = r3.hashCode()     // Catch:{ Exception -> 0x0256 }
            r8 = 5
            switch(r0) {
                case -795576526: goto L_0x00c2;
                case 97513456: goto L_0x00ca;
                case 112386354: goto L_0x00d4;
                case 1439178067: goto L_0x00de;
                case 2120743944: goto L_0x00e8;
                default: goto L_0x00c1;
            }     // Catch:{ Exception -> 0x0256 }
        L_0x00c1:
            goto L_0x00f0
        L_0x00c2:
            boolean r0 = X.C36441kJ.A1M(r3)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x00f0
            r8 = 2
            goto L_0x00f3
        L_0x00ca:
            java.lang.String r0 = "flash"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x00f0
            r8 = 4
            goto L_0x00f3
        L_0x00d4:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x00f0
            r8 = 7
            goto L_0x00f3
        L_0x00de:
            java.lang.String r0 = "autoconf"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x00f0
            r8 = 1
            goto L_0x00f3
        L_0x00e8:
            boolean r0 = X.C36441kJ.A1N(r3)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x00f0
            r8 = 3
            goto L_0x00f3
        L_0x00f0:
            if (r2 != 0) goto L_0x00f3
            r8 = 6
        L_0x00f3:
            java.lang.String r1 = r1.A03     // Catch:{ Exception -> 0x0256 }
            r20 = 0
            if (r1 != 0) goto L_0x0100
            java.lang.String r0 = "AutoconfManager/acquireVerifier/null registerStartMessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0256 }
            goto L_0x019f
        L_0x0100:
            X.39g r0 = r9.A00     // Catch:{ Exception -> 0x0256 }
            if (r0 != 0) goto L_0x0107
            X.C199929gH.A00(r9)     // Catch:{ Exception -> 0x0256 }
        L_0x0107:
            r0 = 8
            byte[] r3 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x0256 }
            X.3Be r2 = new X.3Be     // Catch:{ Exception -> 0x0256 }
            r2.<init>()     // Catch:{ Exception -> 0x0256 }
            android.os.Bundle r1 = r2.A00     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "requestMessage"
            r1.putByteArray(r0, r3)     // Catch:{ Exception -> 0x0256 }
            r2.A00()     // Catch:{ Exception -> 0x0256 }
            X.2xN r0 = new X.2xN     // Catch:{ Exception -> 0x0256 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0256 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x0256 }
            r1.<init>()     // Catch:{ Exception -> 0x0256 }
            X.39g r7 = r9.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            X.C18740tg.A06(r7)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            r6 = 0
            X.9Yf r5 = r7.A04     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            r5.A04(r0)     // Catch:{ Exception -> 0x0132, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            goto L_0x0138
        L_0x0132:
            r2 = move-exception
            java.lang.String r1 = "AutoconfManager/preload/feo2/soft_error"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
        L_0x0138:
            android.net.Uri r4 = r7.A01     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            X.62X r3 = r7.A02     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            android.content.ContentResolver r2 = r7.A00     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            java.lang.String r1 = "register"
            android.os.Bundle r0 = r0.A00     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            android.os.Bundle r0 = X.C201719kE.A00(r0)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            android.os.Bundle r2 = X.AnonymousClass9Yy.A00(r2, r4, r0, r3, r1)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            X.3Mp r0 = X.C64093Mp.A01     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            X.9PH r0 = r7.A03     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            X.AnonymousClass9Yy.A01(r2, r0, r1)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            if (r2 == 0) goto L_0x015c
            android.os.Bundle r0 = X.C201719kE.A00(r2)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            X.2xO r6 = new X.2xO     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
        L_0x015c:
            r5.A05(r6)     // Catch:{ Exception -> 0x0160, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            goto L_0x0188
        L_0x0160:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/preload/feo2/soft_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0167, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            goto L_0x0188
        L_0x0167:
            r2 = move-exception
            X.9Yf r0 = r7.A04     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            r0.A0A(r2)     // Catch:{ Exception -> 0x016e, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
            goto L_0x0174
        L_0x016e:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/preload/feo2/soft_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
        L_0x0174:
            throw r2     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0175 }
        L_0x0175:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/acquireVerifier"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0256 }
            X.0wN r2 = r9.A01     // Catch:{ Exception -> 0x0256 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "AutoconfManager/acquireVerifier/error"
            r2.A0E(r0, r1, r13)     // Catch:{ Exception -> 0x0256 }
            r6 = r20
        L_0x0188:
            if (r6 == 0) goto L_0x019f
            android.os.Bundle r2 = r6.A00     // Catch:{ Exception -> 0x0256 }
            java.lang.String r1 = "verifier"
            boolean r0 = r2.containsKey(r1)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x0199
            byte[] r20 = r2.getByteArray(r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x019f
        L_0x0199:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0256 }
            r0.<init>()     // Catch:{ Exception -> 0x0256 }
            throw r0     // Catch:{ Exception -> 0x0256 }
        L_0x019f:
            r3 = 0
            if (r20 != 0) goto L_0x01a9
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/null verifier"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0256 }
            goto L_0x022c
        L_0x01a9:
            boolean r0 = r12.A0I()     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x022c
            r12.A0H(r13)     // Catch:{ Exception -> 0x0256 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/codeEntryMethod="
            r1.append(r0)     // Catch:{ Exception -> 0x0256 }
            r1.append(r14)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "/registrationMethod="
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ Exception -> 0x0256 }
            java.util.LinkedHashMap r2 = X.C36431kI.A1G()     // Catch:{ Exception -> 0x0256 }
            X.0v0 r0 = r12.A06     // Catch:{ Exception -> 0x0256 }
            X.005 r4 = r0.A00     // Catch:{ Exception -> 0x0256 }
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r4)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "registration_code"
            java.lang.String r3 = X.C36371kC.A0t(r1, r0)     // Catch:{ Exception -> 0x0256 }
            if (r3 == 0) goto L_0x01f2
            int r0 = r3.length()     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x01f2
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r4)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "pref_autoconf_secure_verifier"
            boolean r0 = r1.getBoolean(r0, r10)     // Catch:{ Exception -> 0x0256 }
            if (r0 == 0) goto L_0x01f2
            byte[] r1 = X.C36351kA.A1b(r3)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "code"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0256 }
        L_0x01f2:
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0256 }
            java.nio.charset.Charset r3 = X.AnonymousClass0S4.A05     // Catch:{ Exception -> 0x0256 }
            byte[] r1 = X.C36371kC.A1Z(r0, r3)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "entered"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0256 }
            byte[] r1 = X.C36371kC.A1Z(r0, r3)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "registration_method"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0256 }
            X.AnonymousClass3UV.A05(r12, r2)     // Catch:{ Exception -> 0x0256 }
            X.AnonymousClass3UV.A03(r12, r2)     // Catch:{ Exception -> 0x0256 }
            X.3Sd r1 = r12.A09     // Catch:{ Exception -> 0x0256 }
            X.33T r0 = r12.A08     // Catch:{ Exception -> 0x0256 }
            X.2kr r14 = new X.2kr     // Catch:{ Exception -> 0x0256 }
            r16 = r1
            r17 = r19
            r18 = r15
            r19 = r2
            r15 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0256 }
            java.lang.Object r3 = X.AnonymousClass3PM.A00(r14)     // Catch:{ Exception -> 0x0256 }
            X.3Jl r3 = (X.C63283Jl) r3     // Catch:{ Exception -> 0x0256 }
        L_0x022c:
            if (r3 != 0) goto L_0x0238
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfVerifierResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0256 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x0256 }
            return r0
        L_0x0238:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "AutoconfTask/autoconf_verifier entrypoint response/status="
            r2.append(r0)     // Catch:{ Exception -> 0x0256 }
            int r1 = r3.A03     // Catch:{ Exception -> 0x0256 }
            r2.append(r1)     // Catch:{ Exception -> 0x0256 }
            r2.append(r11)     // Catch:{ Exception -> 0x0256 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x0256 }
            X.C36321k7.A1Y(r2, r0)     // Catch:{ Exception -> 0x0256 }
            if (r1 == r13) goto L_0x0251
            r13 = 0
        L_0x0251:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x0256 }
            return r0
        L_0x0256:
            r1 = move-exception
            java.lang.String r0 = "AutoconfTask/entrypoint call error: "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49752jd.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        String str2;
        boolean A1X = AnonymousClass000.A1X(obj);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AutoconfTask/onPostExecute/autoconf verifier creation ");
        if (A1X) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        C36321k7.A1a(A0u, str);
        C19420v0 r1 = this.A00;
        if (A1X) {
            str2 = "autoconf_verifier_creation_successful";
        } else {
            str2 = "autoconf_verifier_creation_failed";
        }
        r1.A1O(str2);
    }
}
