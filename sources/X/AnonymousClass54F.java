package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines;

/* renamed from: X.54F  reason: invalid class name */
public final class AnonymousClass54F extends AnonymousClass54G {
    public final C133316Xv A00;
    public final PhoenixFlowsManagerWithCoroutines A01;
    public final AnonymousClass6PZ A02;
    public final C26461Kg A03;
    public final AnonymousClass1KT A04;
    public final C26451Kf A05;
    public final C20810yC A06;
    public final C25791Hr A07;
    public final C1255460h A08;
    public final AnonymousClass185 A09;
    public final C21060yb A0A;
    public final AnonymousClass1KW A0B;
    public final C19420v0 A0C;
    public final C18820ts A0D;
    public final C25851Hx A0E;
    public final C28941Us A0F;
    public final C122525uz A0G;
    public final AnonymousClass190 A0H;
    public final AnonymousClass1A1 A0I;
    public final C131376Ou A0J;
    public final AnonymousClass1L4 A0K;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: X.6Di} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        if ((!X.C132586Uj.A01(r15, r1)) == false) goto L_0x0127;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.app.Activity r27, com.whatsapp.jid.Jid r28, X.C206969uL r29, java.lang.String r30, java.lang.String r31, long r32) {
        /*
            r26 = this;
            r13 = 0
            java.lang.String r11 = "flow_action_payload"
            java.lang.String r12 = "flow_action"
            java.lang.String r2 = "business_jid"
            r1 = 0
            r25 = r27
            r9 = r31
            r0 = r25
            X.C36341k9.A1E(r0, r1, r9)
            r10 = r26
            r0 = r29
            r19 = r30
            r23 = r32
            r15 = r10
            r16 = r25
            r17 = r13
            r18 = r0
            r20 = r9
            r21 = r23
            super.A0G(r16, r17, r18, r19, r20, r21)
            android.app.Activity r8 = X.C18860tw.A00(r25)
            java.lang.String r14 = r0.A01
            java.util.HashMap r7 = X.C131866Qy.A01(r14)
            if (r8 == 0) goto L_0x0092
            java.lang.String r3 = "flow_id"
            boolean r0 = r7.containsKey(r3)
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "flow_token"
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "flow_cta"
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r7.get(r3)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "\\d+"
            X.0fN r0 = new X.0fN
            r0.<init>((java.lang.String) r1)
            boolean r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x0092
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            X.1A1 r4 = r10.A07
            long r0 = r0.longValue()
            X.3T1 r5 = X.C36421kH.A0R(r4, r0)
            if (r5 == 0) goto L_0x007c
            com.whatsapp.jid.UserJid r4 = r5.A0L()
            if (r4 == 0) goto L_0x007c
            X.1Hr r1 = r10.A00
            r0 = 6
            r1.A01(r4, r5, r0)
        L_0x007c:
            X.1L4 r0 = r10.A0K
            java.lang.String r1 = "galaxy_message"
            X.00T r0 = r0.A01
            java.util.Map r0 = X.C90514aH.A16(r0)
            java.lang.Object r0 = r0.get(r1)
            X.5us r0 = (X.C122455us) r0
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0093
        L_0x0092:
            return
        L_0x0093:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            boolean r0 = r8 instanceof X.AnonymousClass4V7
            if (r0 == 0) goto L_0x00d9
            r0 = r8
            X.4Uf r0 = (X.C88834Uf) r0
            java.lang.String r0 = X.C90494aF.A0a(r0)
        L_0x00a0:
            com.whatsapp.jid.UserJid r6 = r1.A02(r0)
            java.lang.String r5 = X.AnonymousClass6H1.A00(r7)
            java.lang.String r4 = X.C90504aG.A0l(r3, r7)
            java.lang.String r3 = X.C90464aC.A0V()
            X.1Us r0 = r10.A0F
            java.lang.String r15 = "Required value was null."
            if (r6 == 0) goto L_0x0206
            java.util.HashMap r1 = r0.A01
            java.lang.Object r0 = r1.get(r6)
            X.6Oo r0 = (X.C131316Oo) r0
            if (r0 != 0) goto L_0x00c5
            X.6Oo r0 = new X.6Oo
            r0.<init>(r13)
        L_0x00c5:
            r0.A00 = r13
            r1.put(r6, r0)
            if (r5 == 0) goto L_0x0201
            if (r4 == 0) goto L_0x01fc
            X.0yC r1 = r10.A06
            r0 = 5936(0x1730, float:8.318E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0127
            goto L_0x00db
        L_0x00d9:
            r0 = 0
            goto L_0x00a0
        L_0x00db:
            long r17 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0119 }
            r15 = 3
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0127
            X.1Kg r0 = r10.A03
            r15 = 0
            X.5tN r0 = r0.A05(r6, r15, r4)
            if (r0 == 0) goto L_0x0141
            java.util.List r0 = r0.A02
            java.util.Iterator r17 = r0.iterator()
        L_0x00f4:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r16 = r17.next()
            r0 = r16
            X.6Di r0 = (X.C128716Di) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 == 0) goto L_0x00f4
            r15 = r16
        L_0x010c:
            X.6Di r15 = (X.C128716Di) r15
            if (r15 == 0) goto L_0x0141
            boolean r0 = X.C132586Uj.A01(r15, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0127
            goto L_0x0141
        L_0x0119:
            r11 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsV2Action/openWebPoweredFlow/Error - "
            java.lang.String r0 = X.C36331k8.A0i(r0, r2, r11)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0127:
            r0 = 3080(0xc08, float:4.316E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0092
            r21 = r3
            r22 = r7
            r14 = r8
            r15 = r10
            r16 = r6
            r17 = r4
            r18 = r5
            r13 = r25
            A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0141:
            java.lang.String r0 = "mode"
            java.lang.Object r1 = r7.get(r0)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r0 = "draft"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ JSONException -> 0x01cc }
            if (r14 != 0) goto L_0x0151
            java.lang.String r14 = ""
        L_0x0151:
            org.json.JSONObject r14 = X.C36441kJ.A1C(r14)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r1 = r6.user     // Catch:{ JSONException -> 0x01cc }
            r14.put(r2, r1)     // Catch:{ JSONException -> 0x01cc }
            android.content.Intent r1 = X.C36431kI.A0D()     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r15 = r8.getPackageName()     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r14 = "com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity"
            r1.setClassName(r15, r14)     // Catch:{ JSONException -> 0x01cc }
            r15 = r10
            r16 = r8
            r17 = r1
            r18 = r13
            r20 = r7
            r15.A0H(r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x01cc }
            X.1KT r13 = r10.A04     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r21 = "message_cta"
            java.lang.String r22 = "web"
            r16 = r13
            r17 = r6
            r18 = r4
            r20 = r9
            r16.A0D(r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r13 = "flow_message_version"
            r1.putExtra(r13, r5)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r13 = "session_id"
            r1.putExtra(r13, r9)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r13 = "is_draft"
            r1.putExtra(r13, r0)     // Catch:{ JSONException -> 0x01cc }
            java.lang.Object r13 = r7.get(r12)     // Catch:{ JSONException -> 0x01cc }
            boolean r0 = r13 instanceof java.lang.String     // Catch:{ JSONException -> 0x01cc }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x01cc }
        L_0x019d:
            r1.putExtra(r12, r13)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r0 = r6.user     // Catch:{ JSONException -> 0x01cc }
            r1.putExtra(r2, r0)     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r0 = "observer_id"
            r1.putExtra(r0, r3)     // Catch:{ JSONException -> 0x01cc }
            java.lang.Object r2 = r7.get(r11)     // Catch:{ JSONException -> 0x01cc }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ JSONException -> 0x01cc }
            if (r0 == 0) goto L_0x01ba
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ JSONException -> 0x01cc }
            goto L_0x01b7
        L_0x01b5:
            r13 = 0
            goto L_0x019d
        L_0x01b7:
            if (r2 == 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r0 = 0
            goto L_0x01c0
        L_0x01bc:
            java.lang.String r0 = X.C90504aG.A0n(r2)     // Catch:{ JSONException -> 0x01cc }
        L_0x01c0:
            r1.putExtra(r11, r0)     // Catch:{ JSONException -> 0x01cc }
            r1.getExtras()     // Catch:{ JSONException -> 0x01cc }
            r0 = r25
            r0.startActivity(r1)     // Catch:{ JSONException -> 0x01cc }
            goto L_0x01da
        L_0x01cc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsV2Action/execute() - Error during json payload parsing: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x01da:
            X.6Ou r0 = r10.A0J
            X.6EW r2 = r0.A02(r3)
            java.lang.Class<X.6zm> r1 = X.C149006zm.class
            X.6zl r0 = new X.6zl
            r20 = r9
            r21 = r3
            r22 = r7
            r14 = r8
            r15 = r10
            r16 = r6
            r17 = r4
            r18 = r5
            r12 = r0
            r13 = r25
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.A01(r0, r1, r10)
            return
        L_0x01fc:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r15)
            throw r0
        L_0x0201:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r15)
            throw r0
        L_0x0206:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54F.A0G(android.app.Activity, com.whatsapp.jid.Jid, X.9uL, java.lang.String, java.lang.String, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass54F(X.C25791Hr r30, X.C1255460h r31, X.AnonymousClass185 r32, X.C133316Xv r33, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r34, X.C21060yb r35, X.AnonymousClass1KW r36, X.C19420v0 r37, X.C18820ts r38, X.C25851Hx r39, X.C28941Us r40, X.AnonymousClass6PZ r41, X.C26461Kg r42, X.AnonymousClass1KT r43, X.C26451Kf r44, X.C20810yC r45, X.C122525uz r46, X.AnonymousClass190 r47, X.AnonymousClass1A1 r48, X.C131376Ou r49, X.AnonymousClass1L4 r50) {
        /*
            r29 = this;
            r10 = r38
            r13 = r35
            r0 = r49
            r5 = r46
            r6 = r45
            X.C36321k7.A1B(r10, r6, r5, r13, r0)
            r11 = r37
            r15 = r32
            X.C36321k7.A10(r15, r11)
            r1 = 9
            r2 = r50
            X.AnonymousClass00C.A0D(r2, r1)
            r1 = 12
            r7 = r41
            X.AnonymousClass00C.A0D(r7, r1)
            r1 = 16
            r9 = r39
            X.AnonymousClass00C.A0D(r9, r1)
            r8 = r40
            r12 = r36
            r3 = r48
            r4 = r47
            r14 = r30
            X.C36321k7.A1E(r8, r14, r3, r4, r12)
            r1 = r29
            r18 = r31
            r28 = r3
            r27 = r5
            r26 = r6
            r25 = r8
            r24 = r9
            r23 = r10
            r22 = r11
            r21 = r12
            r20 = r13
            r19 = r15
            r17 = r14
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A0D = r10
            r1.A06 = r6
            r1.A0G = r5
            r1.A0A = r13
            r1.A0J = r0
            r1.A09 = r15
            r1.A0C = r11
            r0 = r18
            r1.A08 = r0
            r1.A0K = r2
            r0 = r33
            r1.A00 = r0
            r0 = r34
            r1.A01 = r0
            r1.A02 = r7
            r0 = r43
            r1.A04 = r0
            r0 = r42
            r1.A03 = r0
            r0 = r44
            r1.A05 = r0
            r1.A0E = r9
            r1.A0F = r8
            r1.A07 = r14
            r1.A0I = r3
            r1.A0H = r4
            r1.A0B = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54F.<init>(X.1Hr, X.60h, X.185, X.6Xv, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines, X.0yb, X.1KW, X.0v0, X.0ts, X.1Hx, X.1Us, X.6PZ, X.1Kg, X.1KT, X.1Kf, X.0yC, X.5uz, X.190, X.1A1, X.6Ou, X.1L4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00c4, code lost:
        if (r7.A00() == null) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r31, android.app.Activity r32, X.AnonymousClass54F r33, com.whatsapp.jid.UserJid r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.Map r40, long r41) {
        /*
            android.content.Intent r1 = X.C36431kI.A0D()
            r4 = r31
            java.lang.String r2 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity"
            r1.setClassName(r2, r0)
            java.lang.String r0 = "fds_observer_id"
            r2 = r39
            r1.putExtra(r0, r2)
            r11 = r34
            java.lang.String r3 = r11.getRawString()
            java.lang.String r0 = "extra_business_jid"
            r1.putExtra(r0, r3)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r1.setFlags(r0)
            r23 = r32
            r3 = r33
            r15 = r37
            r5 = r40
            r20 = r41
            r22 = r3
            r24 = r1
            r25 = r11
            r26 = r15
            r27 = r5
            r28 = r20
            r22.A0H(r23, r24, r25, r26, r27, r28)
            X.1KT r0 = r3.A04
            java.lang.String r27 = "message_cta"
            r28 = 0
            r13 = r35
            r16 = r38
            r22 = r0
            r23 = r11
            r24 = r13
            r25 = r15
            r26 = r16
            r22.A0D(r23, r24, r25, r26, r27, r28)
            r4.startActivity(r1)
            X.6Ou r9 = r3.A0J
            X.6EW r6 = r9.A02(r2)
            java.lang.String r0 = "mode"
            java.lang.Object r7 = r5.get(r0)
            java.lang.String r0 = "draft"
            boolean r23 = X.AnonymousClass00C.A0J(r7, r0)
            X.6EW r10 = r9.A02(r2)
            java.lang.Class<X.70D> r8 = X.AnonymousClass70D.class
            r0 = 0
            X.7pq r7 = new X.7pq
            r35 = 0
            r29 = r7
            r30 = r3
            r31 = r11
            r32 = r13
            r33 = r15
            r34 = r16
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r10.A01(r7, r8, r3)
            X.6EW r10 = r9.A02(r2)
            java.lang.Class<X.707> r8 = X.AnonymousClass707.class
            r35 = 1
            X.7pq r7 = new X.7pq
            r29 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r10.A01(r7, r8, r3)
            X.6EW r9 = r9.A00()
            java.lang.Class<X.70C> r8 = X.AnonymousClass70C.class
            X.6zi r7 = new X.6zi
            r7.<init>(r3, r13)
            r9.A01(r7, r8, r3)
            java.lang.String r7 = "flow_token"
            java.lang.String r14 = X.C90464aC.A0a(r7, r5)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r8 = r3.A01
            X.691 r7 = X.C110485ak.A00(r15, r13)
            X.65x r8 = r8.A0L
            java.lang.String r7 = r7.A00
            X.9XM r7 = r8.A00(r7)
            if (r7 == 0) goto L_0x00c6
            java.lang.String r7 = r7.A00()
            r22 = 1
            if (r7 != 0) goto L_0x00c8
        L_0x00c6:
            r22 = 0
        L_0x00c8:
            java.lang.String r7 = "flow_action"
            java.lang.String r18 = X.C90464aC.A0Z(r7, r5)
            java.lang.String r7 = "flow_action_payload"
            java.lang.Object r7 = r5.get(r7)
            boolean r5 = r7 instanceof java.util.Map
            if (r5 == 0) goto L_0x00fa
            java.util.Map r7 = (java.util.Map) r7
        L_0x00da:
            X.6E7 r10 = new X.6E7
            r12 = r36
            r17 = r2
            r19 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23)
            X.6Vk r2 = new X.6Vk
            r2.<init>(r4, r1, r3, r0)
            X.7OY r5 = new X.7OY
            r5.<init>(r2, r3, r10)
            java.lang.Class<X.6zt> r2 = X.C149076zt.class
            X.7pr r1 = new X.7pr
            r1.<init>(r5, r0)
            r6.A01(r1, r2, r4)
            return
        L_0x00fa:
            r7 = r28
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54F.A00(android.app.Activity, android.app.Activity, X.54F, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long):void");
    }
}
