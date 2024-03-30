package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6u4  reason: invalid class name */
public final class AnonymousClass6u4 implements B33 {
    public final C123155w2 A00;
    public final C130386Kw A01;
    public final C130936Na A02;
    public final AnonymousClass57L A03;
    public final C122265uZ A04;
    public final AnonymousClass1UW A05;

    public AnonymousClass6u4(AnonymousClass57L r2, C123155w2 r3, C122265uZ r4, C130386Kw r5, C130936Na r6, AnonymousClass1UW r7) {
        AnonymousClass00C.A0D(r6, 1);
        this.A02 = r6;
        this.A04 = r4;
        this.A00 = r3;
        this.A03 = r2;
        this.A05 = r7;
        this.A01 = r5;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C160057kO r8, X.C128936Ee r9, java.lang.Integer r10, java.security.PublicKey r11, java.security.cert.X509Certificate r12) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 3
            X.C36331k8.A1G(r8, r0, r9)
            java.security.KeyPair r4 = X.AnonymousClass6UE.A04()     // Catch:{ NoSuchAlgorithmException -> 0x000d }
            goto L_0x0012
        L_0x000d:
            r0 = move-exception
            r8.BWk(r0)
            r4 = 0
        L_0x0012:
            java.lang.String r3 = X.AnonymousClass6UE.A00()
            X.AnonymousClass00C.A08(r3)
            r2 = 0
            if (r4 == 0) goto L_0x0052
            java.security.PublicKey r0 = r4.getPublic()
            java.lang.String r6 = X.AnonymousClass6UE.A02(r0)
            if (r6 == 0) goto L_0x0052
            X.6Kw r5 = r7.A01     // Catch:{ JSONException -> 0x004e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = "CREATE_"
            r1.append(r0)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = "shops"
            r1.append(r0)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = "_USER"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = r0.toUpperCase()     // Catch:{ JSONException -> 0x004e }
            X.AnonymousClass00C.A08(r0)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = X.C130386Kw.A00(r5, r2, r6, r3, r0)     // Catch:{ JSONException -> 0x004e }
            X.6Na r0 = r7.A02     // Catch:{  }
            X.5uy r2 = r0.A03(r1, r12)     // Catch:{  }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r8.BWk(r0)
        L_0x0052:
            X.5uZ r1 = r7.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.fbusers.EncryptedData"
            X.AnonymousClass00C.A0E(r2, r0)
            X.7V7 r5 = new X.7V7
            r5.<init>(r7, r8, r3, r4)
            X.7VX r6 = new X.7VX
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.57L r3 = r1.A00
            X.7qn r1 = new X.7qn
            r1.<init>(r8, r5, r6, r0)
            r0 = 20
            r3.A01(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6u4.A00(X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* synthetic */ void BlU(C160057kO r1, C128936Ee r2, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A00(r1, r2, num, publicKey, x509Certificate);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlX(X.AnonymousClass6OQ r6, X.C160057kO r7, X.C128936Ee r8, java.lang.Integer r9, java.lang.String r10, java.security.PublicKey r11, java.security.cert.X509Certificate r12) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            if (r6 != 0) goto L_0x0010
            java.lang.String r0 = "User is null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            r7.BWk(r0)
        L_0x000f:
            return
        L_0x0010:
            java.security.KeyPair r0 = X.AnonymousClass6UE.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0015 }
            goto L_0x001a
        L_0x0015:
            r0 = move-exception
            r7.BWk(r0)
            r0 = 0
        L_0x001a:
            java.lang.String r4 = X.AnonymousClass6OQ.A00(r6)
            if (r0 == 0) goto L_0x000f
            java.security.PublicKey r0 = r0.getPublic()
            java.lang.String r3 = X.AnonymousClass6UE.A02(r0)
            if (r3 == 0) goto L_0x000f
            X.6Kw r2 = r5.A01     // Catch:{ JSONException -> 0x004e }
            X.6c7 r1 = r6.A04     // Catch:{ JSONException -> 0x004e }
            X.AnonymousClass00C.A08(r1)     // Catch:{ JSONException -> 0x004e }
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = X.C130386Kw.A00(r2, r1, r3, r4, r0)     // Catch:{ JSONException -> 0x004e }
            X.6Na r0 = r5.A02     // Catch:{  }
            X.5uy r3 = r0.A03(r1, r12)     // Catch:{  }
            X.57L r2 = r5.A03
            r1 = 19
            X.4xP r0 = new X.4xP
            r0.<init>(r7)
            r2.A01(r0, r3, r1)
            return
        L_0x004e:
            r0 = move-exception
            r7.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6u4.BlX(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlZ(X.AnonymousClass6OQ r7, X.C160057kO r8, X.C128936Ee r9, java.lang.Integer r10, java.security.PublicKey r11, java.security.cert.X509Certificate r12) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.String r5 = X.AnonymousClass6OQ.A00(r7)
            java.security.KeyPair r4 = X.AnonymousClass6UE.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0042 }
            if (r4 == 0) goto L_0x0041
            java.security.PublicKey r0 = r4.getPublic()
            java.lang.String r3 = X.AnonymousClass6UE.A02(r0)
            if (r3 == 0) goto L_0x0034
            X.6Kw r2 = r6.A01     // Catch:{ JSONException -> 0x0030 }
            X.6c7 r1 = r7.A04     // Catch:{ JSONException -> 0x0030 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ JSONException -> 0x0030 }
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            java.lang.String r1 = X.C130386Kw.A00(r2, r1, r3, r5, r0)     // Catch:{ JSONException -> 0x0030 }
            X.6Na r0 = r6.A02     // Catch:{  }
            X.5uy r3 = r0.A03(r1, r12)     // Catch:{  }
            goto L_0x0035
        L_0x0030:
            r0 = move-exception
            r8.BWk(r0)
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.57L r2 = r6.A03
            r1 = 19
            X.4xQ r0 = new X.4xQ
            r0.<init>(r6, r7, r8, r4)
            r2.A01(r0, r3, r1)
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            r8.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6u4.BlZ(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* bridge */ /* synthetic */ void BlV(C160057kO r2, C128936Ee r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }

    public void BlY(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }
}
