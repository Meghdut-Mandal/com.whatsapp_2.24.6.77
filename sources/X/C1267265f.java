package X;

/* renamed from: X.65f  reason: invalid class name and case insensitive filesystem */
public abstract class C1267265f {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C159767jt r25, java.util.Map r26) {
        /*
            r24 = this;
            r5 = r25
            r3 = r24
            boolean r0 = r3 instanceof X.AnonymousClass5OK
            r4 = r26
            if (r0 == 0) goto L_0x0117
            X.5OK r3 = (X.AnonymousClass5OK) r3
            javax.crypto.SecretKey r7 = X.C90494aF.A0l()     // Catch:{ Exception -> 0x0112 }
            r0 = 16
            byte[] r6 = new byte[r0]     // Catch:{ Exception -> 0x0112 }
            X.C90504aG.A1Q(r6)     // Catch:{ Exception -> 0x0112 }
            X.AnonymousClass00C.A0B(r7)     // Catch:{ Exception -> 0x0112 }
            r13 = 1
            X.AnonymousClass00C.A0D(r7, r13)     // Catch:{ Exception -> 0x0112 }
            r15 = 2
            java.lang.String r0 = "action_payload"
            java.lang.Object r1 = r4.get(r0)     // Catch:{ Exception -> 0x0112 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00f7
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x0112 }
            if (r1 == 0) goto L_0x00f7
            java.lang.String r0 = "business_payload"
            java.lang.Object r12 = r1.get(r0)     // Catch:{ Exception -> 0x0112 }
        L_0x0033:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r12, r0)     // Catch:{ Exception -> 0x0112 }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ Exception -> 0x0112 }
            java.lang.String r11 = "data"
            java.lang.Object r1 = r12.get(r11)     // Catch:{ Exception -> 0x0112 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x0048
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x0112 }
            if (r1 != 0) goto L_0x004c
        L_0x0048:
            X.00f r1 = X.C000400e.A0D()     // Catch:{ Exception -> 0x0112 }
        L_0x004c:
            java.lang.String r10 = "error"
            java.lang.Object r14 = r1.get(r10)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.String"
            X.AnonymousClass00C.A0E(r14, r8)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0112 }
            java.lang.String r9 = "error_message"
            java.lang.Object r2 = X.C90514aH.A0n(r9, r8, r1)     // Catch:{ Exception -> 0x0112 }
            X.011[] r1 = new X.AnonymousClass011[r15]     // Catch:{ Exception -> 0x0112 }
            r0 = 0
            X.C36341k9.A1J(r10, r14, r1, r0)     // Catch:{ Exception -> 0x0112 }
            X.C36341k9.A1J(r9, r2, r1, r13)     // Catch:{ Exception -> 0x0112 }
            java.util.LinkedHashMap r0 = X.C000400e.A07(r1)     // Catch:{ Exception -> 0x0112 }
            java.util.LinkedHashMap r13 = X.C36431kI.A1G()     // Catch:{ Exception -> 0x0112 }
            r13.putAll(r12)     // Catch:{ Exception -> 0x0112 }
            r13.put(r11, r0)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = "flow_message_version"
            java.lang.String r2 = X.C90484aE.A0m(r0, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = "extension_id"
            java.lang.String r1 = X.C90484aE.A0m(r0, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = "business_jid"
            java.lang.String r16 = X.C90484aE.A0m(r0, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r12 = "user_locale"
            java.lang.Object r11 = X.C90514aH.A0n(r12, r8, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r10 = "flow_token"
            java.lang.Object r8 = X.C90514aH.A0n(r10, r8, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = "version"
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0112 }
            boolean r9 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x0112 }
            if (r9 == 0) goto L_0x00f5
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0112 }
        L_0x00a0:
            X.60Y r15 = r3.A00     // Catch:{ Exception -> 0x0112 }
            X.6un r9 = new X.6un     // Catch:{ Exception -> 0x0112 }
            r9.<init>(r3, r14)     // Catch:{ Exception -> 0x0112 }
            X.7UQ r14 = new X.7UQ     // Catch:{ Exception -> 0x0112 }
            r14.<init>(r5, r3)     // Catch:{ Exception -> 0x0112 }
            X.6tk r14 = r15.A00(r9, r2, r1, r14)     // Catch:{ Exception -> 0x0112 }
            X.13r r5 = com.whatsapp.jid.UserJid.Companion     // Catch:{ Exception -> 0x0112 }
            com.whatsapp.jid.UserJid r15 = X.C222813r.A01(r16)     // Catch:{ Exception -> 0x0112 }
            java.util.LinkedHashMap r9 = X.C36431kI.A1G()     // Catch:{ Exception -> 0x0112 }
            r9.putAll(r13)     // Catch:{ Exception -> 0x0112 }
            X.0yC r13 = r3.A01     // Catch:{ Exception -> 0x0112 }
            r5 = 5374(0x14fe, float:7.53E-42)
            boolean r5 = r13.A0E(r5)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r13 = "100"
            if (r5 == 0) goto L_0x00cf
            boolean r5 = r13.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0112 }
            if (r5 == 0) goto L_0x00d2
        L_0x00cf:
            r9.put(r12, r11)     // Catch:{ Exception -> 0x0112 }
        L_0x00d2:
            r9.put(r10, r8)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r5 = X.C110835bJ.A00(r4)     // Catch:{ Exception -> 0x0112 }
            r9.put(r0, r5)     // Catch:{ Exception -> 0x0112 }
            boolean r0 = r13.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0112 }
            if (r0 != 0) goto L_0x00fa
            r0 = 16
            r8 = 16
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0112 }
            r4 = 0
        L_0x00e9:
            byte r0 = r6[r4]     // Catch:{ Exception -> 0x0112 }
            int r0 = ~r0     // Catch:{ Exception -> 0x0112 }
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0112 }
            r5[r4] = r0     // Catch:{ Exception -> 0x0112 }
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x00e9
            r6 = r5
            goto L_0x00fa
        L_0x00f5:
            r4 = 0
            goto L_0x00a0
        L_0x00f7:
            r12 = 0
            goto L_0x0033
        L_0x00fa:
            X.67S r13 = r3.A03     // Catch:{ Exception -> 0x0112 }
            r21 = 0
            java.lang.String r16 = X.C90474aD.A0k(r9)     // Catch:{ Exception -> 0x0112 }
            r22 = 1
            r23 = 0
            r20 = r6
            r19 = r7
            r18 = r1
            r17 = r2
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0112 }
            return
        L_0x0112:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        L_0x0117:
            boolean r0 = r3 instanceof X.AnonymousClass5OI
            if (r0 == 0) goto L_0x0127
            X.718 r5 = (X.AnonymousClass718) r5
            X.5G3 r0 = r5.A02
            X.17Y r1 = r0.A05
            r0 = 27
            X.C1498172w.A00(r1, r5, r4, r0)
            return
        L_0x0127:
            X.5OJ r3 = (X.AnonymousClass5OJ) r3
            java.lang.String r0 = "extension_id"
            java.lang.Object r9 = r4.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.AnonymousClass00C.A0E(r9, r0)
            java.lang.String r9 = (java.lang.String) r9
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "business_jid"
            java.lang.String r0 = X.C90484aE.A0m(r0, r4)
            com.whatsapp.jid.UserJid r8 = X.C222813r.A01(r0)
            java.lang.String r0 = "message_id"
            java.lang.Object r10 = r4.get(r0)
            boolean r0 = r10 instanceof java.lang.String
            r2 = 0
            if (r0 == 0) goto L_0x018a
            java.lang.String r10 = (java.lang.String) r10
        L_0x014f:
            java.lang.String r0 = "session_id"
            java.lang.String r11 = X.C90464aC.A0Z(r0, r4)
            java.lang.String r0 = "current_screen"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0162
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0162:
            X.1KT r7 = r3.A02
            int r6 = r9.hashCode()
            r1 = r2
            if (r2 != 0) goto L_0x016d
            java.lang.String r1 = "UNKNOWN"
        L_0x016d:
            java.lang.String r0 = "source_screen_id"
            r7.A03(r6, r0, r1)
            java.lang.String r1 = "SUCCESS"
            java.lang.String r0 = "destination_screen_id"
            r7.A03(r6, r0, r1)
            r1 = 0
            java.lang.String r0 = "data_channel_navigation"
            r7.A04(r6, r0, r1)
            X.1Kg r7 = r3.A01
            X.7Yn r12 = new X.7Yn
            r12.<init>(r5, r3, r2, r4)
            r7.A09(r8, r9, r10, r11, r12)
            return
        L_0x018a:
            r10 = r2
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1267265f.A00(X.7jt, java.util.Map):void");
    }
}
