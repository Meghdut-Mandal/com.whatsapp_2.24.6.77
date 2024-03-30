package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6u3  reason: invalid class name and case insensitive filesystem */
public final class C145536u3 implements B33 {
    public final C130936Na A00;
    public final C133066Wn A01;
    public final AnonymousClass1UW A02;
    public final C130086Jq A03;

    public C145536u3(C130936Na r2, AnonymousClass1UW r3, C133066Wn r4, C130086Jq r5) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C160057kO r15, X.C128936Ee r16, java.lang.Integer r17, java.security.PublicKey r18, java.security.cert.X509Certificate r19) {
        /*
            r14 = this;
            r0 = 0
            r13 = r19
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 3
            r8 = r15
            r9 = r16
            X.C36331k8.A1G(r15, r0, r9)
            java.lang.String r0 = "SupportUser/Create User"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.security.KeyPair r7 = X.AnonymousClass6UE.A03()     // Catch:{ NoSuchAlgorithmException -> 0x0050 }
            java.lang.String r6 = X.AnonymousClass6UE.A00()
            X.AnonymousClass00C.A08(r6)
            r10 = r14
            X.6Jq r5 = r14.A03     // Catch:{  }
            java.lang.String r2 = X.AnonymousClass6UE.A01(r7)     // Catch:{  }
            java.lang.String r1 = "CREATE_SUPPORT_USER"
            r0 = 0
            java.lang.String r1 = X.C130086Jq.A00(r5, r0, r2, r6, r1)     // Catch:{  }
            X.6Na r0 = r14.A00     // Catch:{  }
            X.5uy r4 = r0.A03(r1, r13)     // Catch:{  }
            X.AnonymousClass00C.A0B(r4)
            X.7VD r3 = new X.7VD
            r3.<init>(r15, r14, r6, r7)
            X.7VY r7 = new X.7VY
            r11 = r17
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.57M r2 = r5.A00
            r0 = 2
            X.7qn r1 = new X.7qn
            r1.<init>(r15, r3, r7, r0)
            r0 = 20
            r2.A01(r1, r4, r0)
            return
        L_0x0050:
            r0 = move-exception
            r15.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145536u3.A00(X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* synthetic */ void BlU(C160057kO r1, C128936Ee r2, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A00(r1, r2, num, publicKey, x509Certificate);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlX(X.AnonymousClass6OQ r16, X.C160057kO r17, X.C128936Ee r18, java.lang.Integer r19, java.lang.String r20, java.security.PublicKey r21, java.security.cert.X509Certificate r22) {
        /*
            r15 = this;
            r0 = 0
            r8 = r17
            r14 = r22
            X.C36321k7.A0v(r14, r0, r8)
            r0 = 5
            r9 = r18
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.String r0 = "SupportUser/Delete User"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r16
            if (r16 != 0) goto L_0x0021
            java.lang.String r0 = "Support user is null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            r8.BWk(r0)
            return
        L_0x0021:
            java.lang.String r3 = X.AnonymousClass6OQ.A00(r7)
            java.security.KeyPair r0 = X.AnonymousClass6UE.A03()     // Catch:{ NoSuchAlgorithmException -> 0x0066 }
            r10 = r15
            X.6Jq r5 = r15.A03     // Catch:{  }
            java.lang.String r2 = X.AnonymousClass6UE.A01(r0)     // Catch:{  }
            X.6c7 r1 = r7.A04     // Catch:{  }
            X.AnonymousClass00C.A08(r1)     // Catch:{  }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{  }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = X.C130086Jq.A00(r5, r1, r2, r3, r0)     // Catch:{  }
            X.6Na r0 = r15.A00     // Catch:{  }
            X.5uy r4 = r0.A03(r1, r14)     // Catch:{  }
            X.AnonymousClass00C.A0B(r4)     // Catch:{  }
            X.7T6 r3 = new X.7T6
            r3.<init>(r8)
            X.7Vg r6 = new X.7Vg
            r11 = r19
            r12 = r20
            r13 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.57M r2 = r5.A00
            r0 = 1
            X.7qn r1 = new X.7qn
            r1.<init>(r8, r3, r6, r0)
            r0 = 19
            r2.A01(r1, r4, r0)
            return
        L_0x0066:
            r0 = move-exception
            r8.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145536u3.BlX(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlZ(X.AnonymousClass6OQ r15, X.C160057kO r16, X.C128936Ee r17, java.lang.Integer r18, java.security.PublicKey r19, java.security.cert.X509Certificate r20) {
        /*
            r14 = this;
            r0 = 0
            r13 = r20
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 1
            r7 = r15
            r8 = r16
            r9 = r17
            X.C36321k7.A17(r15, r8, r9, r0)
            java.lang.String r0 = "SupportUser/Refresh User Token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = X.AnonymousClass6OQ.A00(r15)
            java.security.KeyPair r6 = X.AnonymousClass6UE.A03()     // Catch:{ NoSuchAlgorithmException -> 0x0057 }
            r10 = r14
            X.6Jq r5 = r14.A03     // Catch:{  }
            java.lang.String r2 = X.AnonymousClass6UE.A01(r6)     // Catch:{  }
            X.6c7 r1 = r15.A04     // Catch:{  }
            X.AnonymousClass00C.A08(r1)     // Catch:{  }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{  }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            java.lang.String r1 = X.C130086Jq.A00(r5, r1, r2, r3, r0)     // Catch:{  }
            X.6Na r0 = r14.A00     // Catch:{  }
            X.5uy r4 = r0.A03(r1, r13)     // Catch:{  }
            X.AnonymousClass00C.A0B(r4)     // Catch:{  }
            X.7VE r3 = new X.7VE
            r3.<init>(r15, r8, r14, r6)
            X.7Vb r6 = new X.7Vb
            r11 = r18
            r12 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.57M r2 = r5.A00
            r0 = 1
            X.7qn r1 = new X.7qn
            r1.<init>(r8, r3, r6, r0)
            r0 = 19
            r2.A01(r1, r4, r0)
            return
        L_0x0057:
            r0 = move-exception
            r8.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145536u3.BlZ(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* bridge */ /* synthetic */ void BlV(C160057kO r2, C128936Ee r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }

    public void BlY(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }
}
