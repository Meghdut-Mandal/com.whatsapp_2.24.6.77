package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.6u5  reason: invalid class name */
public abstract class AnonymousClass6u5 implements B33 {
    public final C130936Na A00;
    public final AnonymousClass6P0 A01;
    public final AnonymousClass57N A02;
    public final String A03;
    public final C19970wo A04;
    public final AnonymousClass1UW A05;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BlX(X.AnonymousClass6OQ r5, X.C160057kO r6, X.C128936Ee r7, java.lang.Integer r8, java.lang.String r9, java.security.PublicKey r10, java.security.cert.X509Certificate r11) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000c
            java.lang.String r0 = "User is null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            r6.BWk(r0)
            return
        L_0x000c:
            X.6c7 r0 = r5.A05
            java.lang.Object r3 = r0.A00
            X.C18740tg.A06(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.security.KeyPair r0 = X.AnonymousClass6UE.A04()     // Catch:{ NoSuchAlgorithmException -> 0x003c }
            java.security.PublicKey r0 = r0.getPublic()
            java.lang.String r2 = X.AnonymousClass6UE.A02(r0)
            X.6c7 r1 = r5.A04     // Catch:{  }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.6Na r0 = r4.A00     // Catch:{  }
            X.5uy r3 = r0.A03(r1, r11)     // Catch:{  }
            X.57N r2 = r4.A02
            r1 = 19
            X.57W r0 = new X.57W
            r0.<init>(r4, r6, r6)
            r2.A01(r0, r3, r1)
            return
        L_0x003c:
            r0 = move-exception
            r6.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6u5.BlX(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BlZ(X.AnonymousClass6OQ r5, X.C160057kO r6, X.C128936Ee r7, java.lang.Integer r8, java.security.PublicKey r9, java.security.cert.X509Certificate r10) {
        /*
            r4 = this;
            X.6c7 r0 = r5.A05
            java.lang.Object r3 = r0.A00
            X.C18740tg.A06(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.security.KeyPair r8 = X.AnonymousClass6UE.A04()     // Catch:{ NoSuchAlgorithmException -> 0x0031 }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.AnonymousClass6UE.A02(r0)
            X.6c7 r1 = r5.A04     // Catch:{  }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.6Na r0 = r4.A00     // Catch:{  }
            X.5uy r2 = r0.A03(r1, r10)     // Catch:{  }
            X.57N r1 = r4.A02
            r0 = 19
            X.57Y r3 = new X.57Y
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A01(r3, r2, r0)
            return
        L_0x0031:
            r0 = move-exception
            r6.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6u5.BlZ(X.6OQ, X.7kO, X.6Ee, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public AnonymousClass6u5(C19970wo r1, C130936Na r2, AnonymousClass1UW r3, AnonymousClass6P0 r4, AnonymousClass57N r5, String str) {
        this.A04 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = str;
    }

    private String A00(C135086c7 r5, String str, String str2, String str3) {
        JSONObject A0w = C90484aE.A0w();
        A0w.put("operation", str2);
        A0w.put("timestamp", C36371kC.A09(this.A04));
        C90494aF.A1I(str, A0w);
        A0w.put("password", str3);
        if (r5 != null) {
            A0w.put("fbid", C135086c7.A01(r5));
        }
        return A0w.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BlU(X.C160057kO r5, X.C128936Ee r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.security.PublicKey r12, java.security.cert.X509Certificate r13) {
        /*
            r4 = this;
            java.security.KeyPair r8 = X.AnonymousClass6UE.A04()     // Catch:{ NoSuchAlgorithmException -> 0x002b }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.AnonymousClass6UE.A02(r0)
            java.lang.String r7 = X.AnonymousClass6UE.A00()
            java.lang.String r1 = r4.A03     // Catch:{  }
            r0 = 0
            java.lang.String r1 = r4.A00(r0, r2, r1, r7)     // Catch:{  }
            X.6Na r0 = r4.A00     // Catch:{  }
            X.5uy r2 = r0.A03(r1, r13)     // Catch:{  }
            X.57N r1 = r4.A02
            r0 = 20
            X.57X r3 = new X.57X
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A01(r3, r2, r0)
            return
        L_0x002b:
            r0 = move-exception
            r5.BWk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6u5.BlU(X.7kO, X.6Ee, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public /* bridge */ /* synthetic */ void BlV(C160057kO r2, C128936Ee r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }

    public final void BlY(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw AnonymousClass001.A0D();
    }
}
