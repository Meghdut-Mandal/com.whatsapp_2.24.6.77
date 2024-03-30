package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.6u7  reason: invalid class name and case insensitive filesystem */
public final class C145546u7 implements B33 {
    public static final AnonymousClass6P0 A0B = C113435fX.A00;
    public final C19970wo A00;
    public final C130936Na A01;
    public final C20810yC A02;
    public final AnonymousClass1UB A03;
    public final AnonymousClass5PJ A04;
    public final AnonymousClass6OH A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass1UW A07;
    public final AnonymousClass19A A08;
    public final C120415rT A09;
    public final AnonymousClass005 A0A;

    public static final void A02(AnonymousClass6OQ r8, C160057kO r9, C128936Ee r10, AnonymousClass5V6 r11, C145546u7 r12, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        C145546u7 r4 = r12;
        ((AnonymousClass1UC) r12.A06.get()).A0A(C36371kC.A0m());
        C203399nx A0c = r11.node.A0c("error");
        C160057kO r5 = r9;
        if (!(A0c == null || r8 == null)) {
            Boolean valueOf = Boolean.valueOf(A0c.A0i("ndc", (String) null));
            Boolean valueOf2 = Boolean.valueOf(A0c.A0i("npr", (String) null));
            AnonymousClass00C.A0B(valueOf);
            if (!valueOf.booleanValue()) {
                AnonymousClass00C.A0B(valueOf2);
                if (!valueOf2.booleanValue()) {
                    r4.BlV(r5, r10, new C120425rU(1, r8), Integer.valueOf(i), publicKey, x509Certificate);
                    return;
                }
            }
        }
        r9.BWk(r11);
    }

    public static final boolean A08(C160057kO r2, Integer num, PublicKey publicKey) {
        if (publicKey == null) {
            r2.BWk(AnonymousClass001.A08("null password key"));
            return false;
        } else if (num != null) {
            return true;
        } else {
            r2.BWk(AnonymousClass001.A08("null password id"));
            return false;
        }
    }

    /* renamed from: A0A */
    public void BlV(C160057kO r20, C128936Ee r21, C120425rU r22, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass00C.A0D(x509Certificate2, 1);
        C160057kO r7 = r20;
        AnonymousClass00C.A0D(r7, 4);
        C128936Ee r8 = r21;
        AnonymousClass00C.A0D(r8, 5);
        C120425rU r1 = r22;
        C18740tg.A06(r1);
        AnonymousClass00C.A0B(r1);
        PublicKey publicKey2 = publicKey;
        if (r1.A00 != 1) {
            Object obj = r1.A01;
            C18740tg.A06(obj);
            List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            C135086c7 r10 = (C135086c7) A0m.get(2);
            C135086c7 r11 = (C135086c7) A0m.get(3);
            C135086c7 r12 = (C135086c7) A0m.get(4);
            C135086c7 r13 = (C135086c7) A0m.get(5);
            AnonymousClass00C.A0B(publicKey2);
            A04(r7, r8, (C135086c7) C36391kE.A0t(A0m), r10, r11, r12, r13, this, (Integer) A0m.get(1), publicKey2, x509Certificate2, C36411kG.A07(num));
            return;
        }
        Object obj2 = r1.A01;
        C18740tg.A06(obj2);
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.fbusers.FBUserEntity");
        AnonymousClass00C.A0B(publicKey2);
        A03((AnonymousClass6OQ) obj2, r7, r8, this, publicKey2, x509Certificate2, C36411kG.A07(num));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C160057kO r22, X.C128936Ee r23, java.lang.Integer r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.security.PublicKey r28, java.security.cert.X509Certificate r29, int r30) {
        /*
            r21 = this;
            r0 = 0
            r11 = r29
            X.AnonymousClass00C.A0D(r11, r0)
            r5 = r22
            r8 = r24
            r10 = r28
            boolean r0 = A08(r5, r8, r10)
            if (r0 == 0) goto L_0x006b
            java.security.KeyPair r2 = X.AnonymousClass6UE.A03()     // Catch:{  }
            java.lang.String r1 = X.AnonymousClass6UE.A01(r2)
            java.lang.String r9 = X.AnonymousClass6UE.A00()
            X.AnonymousClass00C.A08(r9)
            X.AnonymousClass00C.A0B(r10)     // Catch:{ NoSuchAlgorithmException -> 0x0066 }
            int r0 = X.C36411kG.A07(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0066 }
            r7 = r21
            java.lang.String r0 = r7.A00(r9, r10, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0066 }
            org.json.JSONObject r0 = A01(r7, r1, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.AnonymousClass00C.A0B(r0)     // Catch:{  }
            X.5uy r14 = X.C130936Na.A00(r7, r0, r11)     // Catch:{  }
            r15 = 0
            X.5PH r13 = new X.5PH     // Catch:{  }
            r16 = r25
            r17 = r26
            r18 = r27
            r20 = r30
            r19 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{  }
            X.5PJ r3 = r7.A04
            java.security.PrivateKey r2 = r2.getPrivate()
            r12 = 0
            X.7s2 r4 = new X.7s2
            r6 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 37
            X.6ts r0 = new X.6ts
            r0.<init>(r5, r4, r7, r2)
            r3.A01(r0, r13, r1)
            return
        L_0x0066:
            r0 = move-exception
            r5.BWk(r0)
            return
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145546u7.A0B(X.7kO, X.6Ee, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public void BlX(AnonymousClass6OQ r14, C160057kO r15, C128936Ee r16, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass00C.A0D(x509Certificate2, 0);
        C120415rT r2 = this.A09;
        C145426ts r3 = new C145426ts(r15, new C164577s2(r15, r16, this, num, str, publicKey, x509Certificate2, 1), this, (PrivateKey) null);
        AnonymousClass19A r5 = r2.A01;
        String A092 = r5.A09();
        AnonymousClass6QB A0T = C36421kH.A0T();
        AnonymousClass6QB.A01(A0T, "smax_id", 59);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092);
        C36331k8.A1D(A0T, "xmlns", "waffle");
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36341k9.A1C(A0T);
        AnonymousClass6QB A0q = C36441kJ.A0q("timestamp");
        AnonymousClass6QB.A00(r2.A00, A0q);
        C36361kB.A1H(A0q, A0T);
        C90474aD.A13(r5, new C165427tP(r3, 3), A0T.A03(), A092);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlZ(X.AnonymousClass6OQ r21, X.C160057kO r22, X.C128936Ee r23, java.lang.Integer r24, java.security.PublicKey r25, java.security.cert.X509Certificate r26) {
        /*
            r20 = this;
            r0 = 0
            r6 = r22
            r8 = r23
            r1 = r26
            X.C36321k7.A17(r1, r6, r8, r0)
            r7 = r24
            r5 = r25
            boolean r0 = A08(r6, r7, r5)
            if (r0 == 0) goto L_0x0073
            java.security.KeyPair r10 = X.AnonymousClass6UE.A03()     // Catch:{  }
            java.lang.String r3 = X.AnonymousClass6UE.A01(r10)
            r9 = r21
            java.lang.String r2 = X.AnonymousClass6OQ.A00(r9)     // Catch:{ NoSuchAlgorithmException -> 0x006e }
            X.AnonymousClass00C.A0B(r5)     // Catch:{ NoSuchAlgorithmException -> 0x006e }
            int r0 = X.C36411kG.A07(r7)     // Catch:{ NoSuchAlgorithmException -> 0x006e }
            r4 = r20
            java.lang.String r0 = r4.A00(r2, r5, r0)     // Catch:{ NoSuchAlgorithmException -> 0x006e }
            org.json.JSONObject r0 = A01(r4, r3, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.AnonymousClass00C.A0B(r0)     // Catch:{  }
            X.5uy r12 = X.C130936Na.A00(r4, r0, r1)     // Catch:{  }
            X.6c7 r13 = r9.A04     // Catch:{  }
            r14 = 0
            r18 = -1
            X.5PH r11 = new X.5PH     // Catch:{  }
            r16 = r14
            r17 = r14
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{  }
            X.5PJ r3 = r4.A04
            java.security.PrivateKey r2 = r10.getPrivate()
            X.71W r12 = new X.71W
            r16 = r4
            r17 = r7
            r18 = r5
            r19 = r1
            r13 = r9
            r14 = r6
            r15 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1 = 46
            X.6ts r0 = new X.6ts
            r0.<init>(r6, r12, r4, r2)
            r3.A01(r0, r11, r1)
            return
        L_0x006e:
            r0 = move-exception
            r6.BWk(r0)
            return
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145546u7.BlZ(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass6OQ r16, X.C160057kO r17, X.C128936Ee r18, X.C145546u7 r19, java.security.PublicKey r20, java.security.cert.X509Certificate r21, int r22) {
        /*
            r1 = r22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7 = r20
            r5 = r17
            boolean r0 = A08(r5, r0, r7)
            if (r0 == 0) goto L_0x0065
            java.security.KeyPair r3 = X.AnonymousClass6UE.A03()     // Catch:{  }
            java.lang.String r2 = X.AnonymousClass6UE.A01(r3)
            r8 = r16
            java.lang.String r0 = X.AnonymousClass6OQ.A00(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0060 }
            r6 = r19
            java.lang.String r0 = r6.A00(r0, r7, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0060 }
            org.json.JSONObject r0 = A01(r6, r2, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.AnonymousClass00C.A0B(r0)     // Catch:{  }
            r9 = r21
            X.5uy r11 = X.C130936Na.A00(r6, r0, r9)     // Catch:{  }
            X.6c7 r12 = r8.A04     // Catch:{  }
            byte[] r16 = r6.A09(r12)     // Catch:{  }
            r13 = 0
            r17 = -1
            X.5PH r10 = new X.5PH     // Catch:{  }
            r15 = r13
            r14 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{  }
            X.5PJ r4 = r6.A04
            java.security.PrivateKey r3 = r3.getPrivate()
            X.71V r2 = new X.71V
            r17 = r5
            r15 = r2
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r1 = 63
            X.6ts r0 = new X.6ts
            r0.<init>(r5, r2, r6, r3)
            r4.A01(r0, r10, r1)
            return
        L_0x0060:
            r0 = move-exception
            r5.BWk(r0)
            return
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145546u7.A03(X.6OQ, X.7kO, X.6Ee, X.6u7, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C160057kO r31, X.C128936Ee r32, X.C135086c7 r33, X.C135086c7 r34, X.C135086c7 r35, X.C135086c7 r36, X.C135086c7 r37, X.C145546u7 r38, java.lang.Integer r39, java.security.PublicKey r40, java.security.cert.X509Certificate r41, int r42) {
        /*
            java.lang.String r5 = "account_type"
            r13 = r42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r15 = r31
            r3 = r40
            boolean r0 = A08(r15, r0, r3)
            if (r0 == 0) goto L_0x00e3
            java.security.KeyPair r14 = X.AnonymousClass6UE.A03()     // Catch:{  }
            java.lang.String r1 = X.AnonymousClass6UE.A01(r14)
            java.lang.String r2 = X.AnonymousClass6UE.A00()
            X.AnonymousClass00C.A08(r2)
            r4 = r38
            java.lang.String r0 = r4.A00(r2, r3, r13)     // Catch:{ NoSuchAlgorithmException -> 0x00de }
            org.json.JSONObject r10 = A01(r4, r1, r0)     // Catch:{  }
            org.json.JSONObject r12 = X.C36441kJ.A1B()     // Catch:{  }
            r23 = r39
            if (r39 == 0) goto L_0x003d
            int r0 = r23.intValue()     // Catch:{  }
            r10.put(r5, r0)     // Catch:{  }
            r12.put(r5, r0)     // Catch:{  }
        L_0x003d:
            r17 = r33
            r8 = r34
            r7 = r35
            r6 = r36
            r5 = r37
            if (r33 == 0) goto L_0x004c
            if (r34 == 0) goto L_0x004c
            goto L_0x007c
        L_0x004c:
            java.lang.String r11 = "reset_password_auth_blob"
            if (r35 == 0) goto L_0x005f
            java.lang.String r1 = "native_auth_blob"
            java.lang.Object r0 = r7.A00     // Catch:{  }
            X.C18740tg.A06(r0)     // Catch:{  }
            java.lang.String r0 = X.C90484aE.A0l(r0, r1, r12)     // Catch:{  }
            r10.put(r11, r0)     // Catch:{  }
            goto L_0x0094
        L_0x005f:
            if (r36 == 0) goto L_0x0094
            if (r37 == 0) goto L_0x0094
            java.lang.String r1 = "web_auth_token"
            java.lang.Object r0 = r6.A00     // Catch:{  }
            X.C18740tg.A06(r0)     // Catch:{  }
            org.json.JSONObject r9 = r12.put(r1, r0)     // Catch:{  }
            java.lang.String r1 = "web_auth_uri"
            java.lang.Object r0 = r5.A00     // Catch:{  }
            X.C18740tg.A06(r0)     // Catch:{  }
            r9.put(r1, r0)     // Catch:{  }
            X.C90504aG.A1J(r12, r11, r10)     // Catch:{  }
            goto L_0x0094
        L_0x007c:
            java.lang.String r9 = "fbid"
            java.lang.Object r0 = X.C135086c7.A00(r17)     // Catch:{  }
            long r0 = X.C36431kI.A09(r0)     // Catch:{  }
            org.json.JSONObject r9 = r10.put(r9, r0)     // Catch:{  }
            java.lang.String r1 = "native_auth_nonce"
            java.lang.Object r0 = r8.A00     // Catch:{  }
            X.C18740tg.A06(r0)     // Catch:{  }
            r9.put(r1, r0)     // Catch:{  }
        L_0x0094:
            java.lang.String r0 = r10.toString()     // Catch:{  }
            X.AnonymousClass00C.A0B(r0)     // Catch:{  }
            r1 = r41
            X.5uy r25 = X.C130936Na.A00(r4, r0, r1)     // Catch:{  }
            r26 = 0
            r31 = -1
            X.5PH r0 = new X.5PH     // Catch:{  }
            r28 = r26
            r29 = r26
            r30 = r26
            r24 = r0
            r27 = r26
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)     // Catch:{  }
            X.5PJ r10 = r4.A04
            java.security.PrivateKey r9 = r14.getPrivate()
            X.71Y r14 = new X.71Y
            r16 = r32
            r24 = r2
            r25 = r3
            r26 = r1
            r27 = r13
            r21 = r5
            r22 = r4
            r19 = r7
            r20 = r6
            r18 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 64
            X.6ts r1 = new X.6ts
            r1.<init>(r15, r14, r4, r9)
            r10.A01(r1, r0, r2)
            return
        L_0x00de:
            r0 = move-exception
            r15.BWk(r0)
            return
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145546u7.A04(X.7kO, X.6Ee, X.6c7, X.6c7, X.6c7, X.6c7, X.6c7, X.6u7, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C160057kO r20, X.C128936Ee r21, X.C135086c7 r22, X.C145546u7 r23, java.lang.String r24, java.security.PublicKey r25, java.security.cert.X509Certificate r26, int r27) {
        /*
            r5 = r20
            java.security.KeyPair r2 = X.AnonymousClass6UE.A03()     // Catch:{  }
            java.lang.String r1 = X.AnonymousClass6UE.A01(r2)
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r27
            java.lang.String r0 = r8.A00(r9, r10, r12)     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            r7 = r22
            byte[] r19 = r8.A09(r7)
            org.json.JSONObject r0 = A01(r8, r1, r0)     // Catch:{  }
            java.lang.String r0 = r0.toString()     // Catch:{  }
            X.AnonymousClass00C.A0B(r0)     // Catch:{  }
            r11 = r26
            X.5uy r14 = X.C130936Na.A00(r8, r0, r11)     // Catch:{  }
            r16 = 0
            r20 = -1
            X.5PH r13 = new X.5PH     // Catch:{  }
            r18 = r16
            r15 = r7
            r17 = r16
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{  }
            X.5PJ r3 = r8.A04
            java.security.PrivateKey r2 = r2.getPrivate()
            X.71X r4 = new X.71X
            r6 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 38
            X.6ts r0 = new X.6ts
            r0.<init>(r5, r4, r8, r2)
            r3.A01(r0, r13, r1)
            return
        L_0x0053:
            r0 = move-exception
            r5.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145546u7.A05(X.7kO, X.6Ee, X.6c7, X.6u7, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public static final boolean A07(C160057kO r2, C128936Ee r3, AnonymousClass5V6 r4, C145546u7 r5, Runnable runnable, int i) {
        if (!(i == 400 || i == 405)) {
            if (!(i == 408 || i == 429)) {
                if (i == 481) {
                    AnonymousClass00C.A0D(r3, 0);
                    if (r3.A04()) {
                        runnable.run();
                        return true;
                    }
                } else if (i != 500) {
                    if (i != 503) {
                        return false;
                    }
                }
            }
            AnonymousClass6OH r1 = r5.A05;
            AnonymousClass00C.A0D(r3, 0);
            Long A012 = r3.A01();
            if (A012 != null) {
                r1.A00.BpM(runnable, "WaffleIQErrorHelper/retry", A012.longValue());
                return true;
            }
        }
        r2.BWk(r4);
        return true;
    }

    private final byte[] A09(C135086c7 r5) {
        AnonymousClass34P A042 = ((AnonymousClass189) this.A0A.get()).A00.A04();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("1539");
        Object obj = r5.A00;
        C18740tg.A06(obj);
        return C133256Xm.A08(A042.A00, C36351kA.A1b(C36411kG.A11(A0u, C36431kI.A09(obj))));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlY(X.AnonymousClass6OQ r24, X.C160057kO r25, X.C128936Ee r26, java.lang.Integer r27, java.security.PublicKey r28, java.security.cert.X509Certificate r29) {
        /*
            r23 = this;
            r7 = r24
            r5 = r29
            X.C36321k7.A0w(r5, r7)
            r6 = r25
            r9 = r27
            r8 = r28
            boolean r0 = A08(r6, r9, r8)
            if (r0 == 0) goto L_0x0087
            X.6c7 r0 = r7.A02     // Catch:{ JSONException -> 0x0082 }
            java.lang.Object r12 = X.C135086c7.A00(r0)     // Catch:{ JSONException -> 0x0082 }
            org.json.JSONObject r11 = X.C90484aE.A0w()     // Catch:{ JSONException -> 0x0082 }
            r4 = r23
            X.0wo r10 = r4.A00     // Catch:{ JSONException -> 0x0082 }
            long r2 = X.C19970wo.A00(r10)     // Catch:{ JSONException -> 0x0082 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ JSONException -> 0x0082 }
            long r2 = r2 / r0
            java.lang.String r0 = "timestamp"
            r11.put(r0, r2)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r0 = "access_token"
            java.lang.String r1 = X.C90484aE.A0l(r12, r0, r11)     // Catch:{ JSONException -> 0x0082 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ JSONException -> 0x0082 }
            X.6Na r0 = r4.A01     // Catch:{  }
            X.5uy r12 = r0.A03(r1, r5)     // Catch:{  }
            X.C19970wo.A00(r10)     // Catch:{  }
            X.6c7 r13 = r7.A04     // Catch:{  }
            r14 = 0
            r18 = -1
            X.5PH r11 = new X.5PH     // Catch:{  }
            r16 = r14
            r17 = r14
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{  }
            X.19A r2 = r4.A08
            java.lang.String r1 = r2.A09()
            r20 = 264(0x108, float:3.7E-43)
            X.5PJ r10 = r4.A04
            r3 = 83
            r0 = 1
            X.6QB r0 = X.C111935d5.A00(r1, r3, r0)
            r10.A02(r0, r11)
            X.9nx r18 = r0.A03()
            X.6xk r10 = new X.6xk
            r13 = r26
            r15 = r9
            r16 = r8
            r17 = r5
            r12 = r6
            r14 = r4
            r11 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r21 = 32000(0x7d00, double:1.581E-319)
            r17 = r10
            r16 = r2
            r19 = r1
            r16.A0K(r17, r18, r19, r20, r21)
            return
        L_0x0082:
            r0 = move-exception
            r6.BWk(r0)
            return
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145546u7.BlY(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public C145546u7(C19970wo r2, C130936Na r3, AnonymousClass1UW r4, C20810yC r5, AnonymousClass19A r6, C120415rT r7, AnonymousClass1UB r8, AnonymousClass5PJ r9, AnonymousClass6OH r10, AnonymousClass005 r11, AnonymousClass005 r12) {
        C36321k7.A1B(r2, r5, r6, r3, r10);
        C36361kB.A1J(r11, 7, r12);
        AnonymousClass00C.A0D(r8, 11);
        this.A00 = r2;
        this.A02 = r5;
        this.A08 = r6;
        this.A01 = r3;
        this.A05 = r10;
        this.A07 = r4;
        this.A06 = r11;
        this.A0A = r12;
        this.A04 = r9;
        this.A09 = r7;
        this.A03 = r8;
    }

    private final String A00(String str, PublicKey publicKey, int i) {
        String A012 = C130936Na.A01(Integer.valueOf(i), str, (String) null, publicKey);
        AnonymousClass00C.A08(A012);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("#PWD_WA:11:");
        A0u.append(C19970wo.A00(this.A00) / ((long) 1000));
        return C90464aC.A0f(A012, A0u, ':');
    }

    public static final JSONObject A01(C145546u7 r5, String str, String str2) {
        JSONObject A0w = C90484aE.A0w();
        A0w.put("timestamp", C19970wo.A00(r5.A00) / ((long) 1000));
        A0w.put("password", str2);
        C90494aF.A1I(str, A0w);
        return A0w;
    }

    public static final boolean A06(C160057kO r2, C128936Ee r3, AnonymousClass5V6 r4, C145546u7 r5, Runnable runnable, int i) {
        if (!A07(r2, r3, r4, r5, runnable, i)) {
            if (i == 483) {
                ((C130716Md) r5.A05.A01.get()).A01();
                r2.BWk(r4);
            } else if (i != 485) {
                return false;
            } else {
                r5.A05.A00(r2, r4);
                return true;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BlU(C160057kO r11, C128936Ee r12, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A0B(r11, r12, num, str, str2, str3, publicKey, x509Certificate, num2.intValue());
    }
}
