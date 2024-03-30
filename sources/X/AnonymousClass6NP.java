package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6NP  reason: invalid class name */
public final class AnonymousClass6NP {
    public final AnonymousClass1EP A00;
    public final AnonymousClass1KV A01;
    public final C28941Us A02;
    public final AnonymousClass6PZ A03;
    public final C26461Kg A04;
    public final C20810yC A05;
    public final C21010yW A06;
    public final AnonymousClass1KU A07;
    public final C19770wU A08;

    public AnonymousClass6NP(AnonymousClass1EP r2, AnonymousClass1KV r3, C28941Us r4, AnonymousClass6PZ r5, C26461Kg r6, C20810yC r7, C21010yW r8, AnonymousClass1KU r9, C19770wU r10) {
        AnonymousClass00C.A0D(r10, 1);
        C36321k7.A17(r8, r5, r2, 2);
        C36361kB.A1J(r4, 7, r7);
        AnonymousClass00C.A0D(r3, 9);
        this.A08 = r10;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6BP r15, X.AnonymousClass6NP r16, com.whatsapp.jid.Jid r17, X.AnonymousClass3T1 r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, org.json.JSONObject r23, int r24) {
        /*
            r4 = 0
            r5 = r16
            r0 = r18
            if (r18 == 0) goto L_0x00d9
            X.1EP r2 = r5.A00
            long r0 = r0.A1N
            X.6A5 r1 = r2.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.String r7 = "is_template"
            r6 = r23
            r6.put(r7, r0)
            if (r1 == 0) goto L_0x001e
            java.lang.String r4 = r1.A00
        L_0x001e:
            java.lang.String r3 = "hsm_tag"
            r6.put(r3, r4)
            r0 = 1
            r9 = r24
            if (r9 == r0) goto L_0x00ce
            r0 = 2
            if (r9 == r0) goto L_0x00ce
            r0 = 3
            if (r9 == r0) goto L_0x00ce
        L_0x002e:
            r8 = 0
            r11 = r15
            if (r15 == 0) goto L_0x0049
            java.lang.Integer r2 = r15.A01
            if (r2 == 0) goto L_0x0049
            X.0yC r1 = r5.A05
            r0 = 6551(0x1997, float:9.18E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0049
            int r1 = r2.intValue()
            java.lang.String r0 = "click_sequence_number"
            r6.put(r0, r1)
        L_0x0049:
            X.58a r4 = new X.58a
            r4.<init>()
            java.lang.Integer r0 = X.C36371kC.A0o()
            r4.A03 = r0
            java.lang.Integer r0 = X.C36361kB.A0i()
            r4.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A04 = r0
            java.lang.String r0 = r6.toString()
            r4.A0A = r0
            if (r19 == 0) goto L_0x0072
            int r0 = r19.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
        L_0x0072:
            r12 = r17
            if (r17 == 0) goto L_0x007e
            X.1KU r0 = r5.A07
            java.lang.String r0 = r0.A00(r12)
            r4.A07 = r0
        L_0x007e:
            X.0yC r10 = r5.A05
            r0 = 6381(0x18ed, float:8.942E-42)
            boolean r0 = r10.A0E(r0)
            r2 = r21
            r1 = r22
            if (r0 == 0) goto L_0x0094
            r4.A09 = r2
            r4.A08 = r1
            r0 = r20
            r4.A01 = r0
        L_0x0094:
            r0 = 6551(0x1997, float:9.18E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x00ac
            if (r15 == 0) goto L_0x00cc
            java.lang.String r0 = r15.A02
        L_0x00a0:
            r4.A06 = r0
            if (r15 == 0) goto L_0x00aa
            int r0 = r15.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x00aa:
            r4.A02 = r8
        L_0x00ac:
            X.0yW r0 = r5.A06
            r0.Blv(r4)
            r8 = 0
            r4 = 1
            if (r24 == 0) goto L_0x00ec
            r0 = 2
            if (r9 == r0) goto L_0x00e4
            r0 = 3
            if (r9 == r0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot initialize screen progress reporter. Interaction type unknown ("
            r1.append(r0)
            java.lang.String r0 = X.C36321k7.A0G(r1, r9)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00cc:
            r0 = r8
            goto L_0x00a0
        L_0x00ce:
            X.6PZ r0 = r5.A03
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "last_screen_id"
            r6.put(r0, r1)
            goto L_0x002e
        L_0x00d9:
            r1 = r4
            goto L_0x0012
        L_0x00dc:
            X.6PZ r1 = r5.A03
            java.lang.String r0 = "flow_error"
            r1.A03(r0, r8)
            return
        L_0x00e4:
            X.6PZ r1 = r5.A03
            java.lang.String r0 = "flow_success"
            r1.A03(r0, r4)
            return
        L_0x00ec:
            if (r19 == 0) goto L_0x015f
            if (r17 == 0) goto L_0x015f
            java.lang.String r0 = "flow_id"
            java.lang.String r13 = r6.optString(r0)     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r0 = "session_id"
            java.lang.String r15 = r6.optString(r0)     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r0 = "extensions_message_id"
            java.lang.String r14 = X.C36411kG.A10(r0, r6)     // Catch:{ JSONException -> 0x0158 }
            int r7 = r6.optInt(r7)     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r17 = X.C36411kG.A10(r3, r6)     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r0 = "extension_restored_from_cache"
            int r3 = r6.optInt(r0, r8)     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r0 = "categories"
            org.json.JSONArray r0 = r6.optJSONArray(r0)     // Catch:{ JSONException -> 0x0158 }
            if (r0 == 0) goto L_0x0125
            java.lang.String r16 = r0.toString()     // Catch:{ JSONException -> 0x0158 }
        L_0x011c:
            java.lang.String r0 = "extension_status"
            java.lang.String r18 = r6.optString(r0)     // Catch:{ JSONException -> 0x0158 }
            X.6PZ r0 = r5.A03     // Catch:{ JSONException -> 0x0158 }
            goto L_0x0128
        L_0x0125:
            r16 = 0
            goto L_0x011c
        L_0x0128:
            boolean r22 = X.AnonymousClass000.A1P(r7)
            boolean r23 = X.AnonymousClass000.A1S(r3, r4)
            int r21 = r19.intValue()     // Catch:{ JSONException -> 0x0158 }
            X.AnonymousClass00C.A0B(r13)     // Catch:{ JSONException -> 0x0158 }
            X.AnonymousClass00C.A0B(r15)     // Catch:{ JSONException -> 0x0158 }
            r3 = 2
            X.C36331k8.A1G(r13, r3, r15)     // Catch:{ JSONException -> 0x0158 }
            X.6EA r3 = r0.A01     // Catch:{ JSONException -> 0x0158 }
            if (r3 == 0) goto L_0x0147
            java.lang.String r3 = "Initializing new flows session but previous metadata has not been reset. Most likely `reportFlowExit()` has not been called."
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ JSONException -> 0x0158 }
        L_0x0147:
            r3 = 0
            r0.A05 = r3     // Catch:{ JSONException -> 0x0158 }
            r0.A03 = r3     // Catch:{ JSONException -> 0x0158 }
            X.6EA r10 = new X.6EA     // Catch:{ JSONException -> 0x0158 }
            r19 = r2
            r20 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0158 }
            r0.A01 = r10     // Catch:{ JSONException -> 0x0158 }
            return
        L_0x0158:
            r1 = move-exception
            java.lang.String r0 = "Failed to initialize screen progress reporter"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x015f:
            java.lang.String r0 = "Cannot log flows screen progress without metadata."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NP.A00(X.6BP, X.6NP, com.whatsapp.jid.Jid, X.3T1, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, org.json.JSONObject, int):void");
    }

    public final void A01(Jid jid, AnonymousClass3T1 r13, Integer num, String str, String str2, String str3, String str4, int i) {
        String str5 = str4;
        AnonymousClass00C.A0D(str5, 7);
        this.A08.Boy(new AnonymousClass74A(this, jid, r13, num, str, str5, str2, str3, i));
    }
}
