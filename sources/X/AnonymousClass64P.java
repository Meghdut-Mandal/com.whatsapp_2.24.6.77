package X;

import java.security.cert.X509Certificate;

/* renamed from: X.64P  reason: invalid class name */
public final class AnonymousClass64P {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C160227kf A01;
    public final /* synthetic */ AnonymousClass6PT A02;
    public final /* synthetic */ AnonymousClass57O A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ X509Certificate A05;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass6OQ r23, X.C128936Ee r24) {
        /*
            r22 = this;
            r9 = 1
            r15 = r23
            X.AnonymousClass00C.A0D(r15, r9)
            r5 = r22
            X.6PT r7 = r5.A02     // Catch:{ JSONException -> 0x0124 }
            X.57O r6 = r5.A03     // Catch:{ JSONException -> 0x0124 }
            int r4 = r5.A00     // Catch:{ JSONException -> 0x0124 }
            java.security.cert.X509Certificate r2 = r5.A05     // Catch:{ JSONException -> 0x0124 }
            java.lang.Object r10 = r5.A04     // Catch:{ JSONException -> 0x0124 }
            X.7kf r3 = r5.A01     // Catch:{ JSONException -> 0x0124 }
            r8 = 0
            java.security.KeyPair r14 = X.AnonymousClass6UE.A03()     // Catch:{ NoSuchAlgorithmException -> 0x011f }
            java.lang.String r11 = X.AnonymousClass6UE.A01(r14)     // Catch:{ JSONException -> 0x0124 }
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "version"
            org.json.JSONObject r13 = r1.put(r0, r9)     // Catch:{ JSONException -> 0x0124 }
            X.0wo r9 = r7.A00     // Catch:{ JSONException -> 0x0124 }
            long r0 = X.C36371kC.A09(r9)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r12 = "timestamp"
            org.json.JSONObject r12 = r13.put(r12, r0)     // Catch:{ JSONException -> 0x0124 }
            X.6c7 r0 = r15.A02     // Catch:{ JSONException -> 0x0124 }
            java.lang.Object r1 = r0.A00     // Catch:{ JSONException -> 0x0124 }
            X.C18740tg.A06(r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "access_token"
            org.json.JSONObject r1 = r12.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "client_pub_key"
            org.json.JSONObject r11 = r1.put(r0, r11)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = "client_pub_key_type"
            java.lang.String r0 = "RSA 2048"
            org.json.JSONObject r11 = r11.put(r1, r0)     // Catch:{ JSONException -> 0x0124 }
            X.AnonymousClass00C.A08(r11)     // Catch:{ JSONException -> 0x0124 }
            boolean r0 = r7 instanceof X.AnonymousClass5PF     // Catch:{ JSONException -> 0x0124 }
            if (r0 == 0) goto L_0x0068
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "encrypted_payload"
            org.json.JSONObject r11 = r11.put(r0, r10)     // Catch:{ JSONException -> 0x0124 }
            X.AnonymousClass00C.A08(r11)     // Catch:{ JSONException -> 0x0124 }
        L_0x0062:
            java.lang.String r1 = X.C36381kD.A0y(r11)     // Catch:{ JSONException -> 0x0124 }
            goto L_0x00f0
        L_0x0068:
            boolean r0 = r7 instanceof X.AnonymousClass5PD     // Catch:{ JSONException -> 0x0124 }
            if (r0 == 0) goto L_0x0096
            r12 = r7
            X.5PD r12 = (X.AnonymousClass5PD) r12     // Catch:{ JSONException -> 0x0124 }
            X.00I r10 = (X.AnonymousClass00I) r10     // Catch:{ JSONException -> 0x0124 }
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = "bloks_versioning_id"
            java.lang.String r0 = "b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c"
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x0124 }
            java.lang.Object r1 = r10.A00     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "app_id"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.Object r1 = r10.A01     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "params"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            X.0wt r0 = r12.A01     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = r0.A02()     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "user_agent"
        L_0x0092:
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            goto L_0x0062
        L_0x0096:
            boolean r0 = r7 instanceof X.AnonymousClass5PE     // Catch:{ JSONException -> 0x0124 }
            if (r0 == 0) goto L_0x00b3
            X.5tz r10 = (X.C121955tz) r10     // Catch:{ JSONException -> 0x0124 }
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ JSONException -> 0x0124 }
            int r1 = r10.A00     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "target_account_type"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = r10.A02     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "target_account_obid"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = r10.A01     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "entry_point"
            goto L_0x0092
        L_0x00b3:
            X.5wd r10 = (X.C123515wd) r10     // Catch:{ JSONException -> 0x0124 }
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ JSONException -> 0x0124 }
            int r1 = r10.A00     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "target_account_type"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            org.json.JSONArray r12 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x0124 }
            java.util.List r0 = r10.A04     // Catch:{ JSONException -> 0x0124 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0124 }
        L_0x00ca:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0124 }
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0124 }
            r12.put(r0)     // Catch:{ JSONException -> 0x0124 }
            goto L_0x00ca
        L_0x00d8:
            java.lang.String r0 = "opaque_target_accounts_to_be_linked_strings"
            r11.put(r0, r12)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = r10.A01     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "linking_entry_point"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = r10.A02     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "family_device_id"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r1 = r10.A03     // Catch:{ JSONException -> 0x0124 }
            java.lang.String r0 = "selected_age_account"
            goto L_0x0092
        L_0x00f0:
            X.6Na r0 = r7.A01     // Catch:{  }
            X.5uy r2 = r0.A03(r1, r2)     // Catch:{  }
            X.C19970wo.A00(r9)     // Catch:{  }
            X.6c7 r0 = r15.A04     // Catch:{  }
            X.5PG r1 = new X.5PG     // Catch:{  }
            r1.<init>(r2, r0)     // Catch:{  }
            java.security.PrivateKey r21 = r14.getPrivate()     // Catch:{ JSONException -> 0x0124 }
            X.AnonymousClass00C.A08(r21)     // Catch:{ JSONException -> 0x0124 }
            X.5rV r0 = new X.5rV     // Catch:{ JSONException -> 0x0124 }
            r0.<init>(r3, r7)     // Catch:{ JSONException -> 0x0124 }
            X.6tt r14 = new X.6tt     // Catch:{ JSONException -> 0x0124 }
            r16 = r24
            r19 = r5
            r20 = r7
            r17 = r3
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0124 }
            r6.A01(r14, r1, r4)     // Catch:{ JSONException -> 0x0124 }
            return
        L_0x011f:
            r0 = move-exception
            r3.BWl(r0, r8)     // Catch:{ JSONException -> 0x0124 }
            return
        L_0x0124:
            r2 = move-exception
            X.7kf r1 = r5.A01
            r0 = 0
            r1.BWl(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64P.A00(X.6OQ, X.6Ee):void");
    }

    public AnonymousClass64P(C160227kf r1, AnonymousClass6PT r2, AnonymousClass57O r3, Object obj, X509Certificate x509Certificate, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A05 = x509Certificate;
        this.A04 = obj;
        this.A01 = r1;
    }
}
