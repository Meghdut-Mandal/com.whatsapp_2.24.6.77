package X;

import android.os.ConditionVariable;

/* renamed from: X.6BB  reason: invalid class name */
public final class AnonymousClass6BB {
    public final AnonymousClass00T A00 = C36431kI.A1I(AnonymousClass7Q6.A00);
    public final AnonymousClass00T A01 = C36431kI.A1I(AnonymousClass7Q7.A00);
    public final AnonymousClass6JM A02;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6E1 A00(com.whatsapp.jid.UserJid r22) {
        /*
            r21 = this;
            r0 = 0
            r9 = r22
            X.AnonymousClass00C.A0D(r9, r0)
            r3 = r21
            X.00T r1 = r3.A01
            java.lang.Object r0 = r1.getValue()
            X.00v r0 = (X.C002000v) r0
            java.lang.Object r0 = r0.A04(r9)
            r7 = 0
            if (r0 != 0) goto L_0x00b3
            X.00T r0 = r3.A00
            java.lang.Object r2 = r0.getValue()
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.Object r2 = r2.get(r9)
            X.6E1 r2 = (X.AnonymousClass6E1) r2
            if (r2 == 0) goto L_0x0028
            return r2
        L_0x0028:
            X.6JM r2 = r3.A02
            X.16r r2 = r2.A00
            X.1M0 r2 = r2.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = "\n            SELECT\n              tag,\n              name,\n              is_default,\n              attributes,\n              category,\n              prompts,\n              behavior_graph,\n              persona_id,\n              commands_description,\n              commands,\n              avatar_url\n            FROM\n              wa_bot_profiles\n            WHERE\n              jid = ?\n        "
            java.lang.String[] r4 = X.C90504aG.A1b(r9)     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "GET_BOT_PROFILE_BY_JID"
            android.database.Cursor r8 = r6.A09(r5, r3, r4)     // Catch:{ all -> 0x00ac }
            boolean r4 = r8.moveToNext()     // Catch:{ all -> 0x00a5 }
            r3 = 0
            if (r4 == 0) goto L_0x008b
            java.lang.String r3 = "tag"
            int r10 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "name"
            int r11 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "is_default"
            int r12 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "attributes"
            int r13 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "category"
            int r14 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "prompts"
            int r15 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "behavior_graph"
            int r16 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "persona_id"
            int r17 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "commands_description"
            int r18 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "commands"
            int r19 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "avatar_url"
            int r20 = r8.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00a5 }
            X.6E1 r3 = X.AnonymousClass6JM.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00a5 }
        L_0x008b:
            r8.close()     // Catch:{ all -> 0x00ac }
            r2.close()
            if (r3 == 0) goto L_0x0097
            X.C90494aF.A1G(r9, r3, r0)
            return r3
        L_0x0097:
            java.lang.Object r1 = r1.getValue()
            X.00v r1 = (X.C002000v) r1
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A08(r9, r0)
            return r7
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x00b3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BB.A00(com.whatsapp.jid.UserJid):X.6E1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0098, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass6E1 r8) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            X.6JM r0 = r7.A02
            X.16r r0 = r0.A00
            X.1M0 r5 = r0.A04()
            r0 = 10
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0095 }
            r6.<init>(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r4 = r8.A01     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "tag"
            int r0 = r8.A00     // Catch:{ all -> 0x0095 }
            X.C36341k9.A0o(r6, r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r8.A07     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "is_default"
            boolean r0 = r8.A0B     // Catch:{ all -> 0x0095 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "attributes"
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "category"
            java.lang.String r0 = r8.A05     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "prompts"
            java.util.List r0 = r8.A0A     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = X.C129326Gl.A00(r0)     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "behavior_graph"
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "persona_id"
            java.lang.String r0 = r8.A08     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "commands_description"
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "commands"
            java.util.List r0 = r8.A09     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = X.AnonymousClass3LO.A00(r0)     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "avatar_url"
            java.lang.String r0 = r8.A03     // Catch:{ all -> 0x0095 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0095 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "wa_bot_profiles"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_BOT_PROFILE"
            r3.A08(r2, r0, r6, r1)     // Catch:{ all -> 0x0095 }
            r5.close()
            X.00T r0 = r7.A00
            X.C90494aF.A1G(r4, r8, r0)
            X.00T r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            X.00v r0 = (X.C002000v) r0
            r0.A05(r4)
            return
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BB.A02(X.6E1):void");
    }

    public AnonymousClass6BB(AnonymousClass6JM r2) {
        this.A02 = r2;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fa, code lost:
        X.C05600Qi.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fd, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A01(java.util.Collection r28) {
        /*
            r27 = this;
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            r3 = r27
            X.00T r9 = r3.A00
            java.lang.Object r0 = r9.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Set r0 = r0.keySet()
            X.AnonymousClass00C.A08(r0)
            r10 = r28
            java.util.Set r8 = X.C007103b.A0h(r10, r0)
            boolean r0 = r8.isEmpty()
            r13 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x012c
            X.6JM r7 = r3.A02
            r6 = 0
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0101
            java.util.ArrayList r5 = X.C36321k7.A0J(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x0039:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0043
            X.C90464aC.A1U(r5, r4)
            goto L_0x0039
        L_0x0043:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r5 = r5.toArray(r0)
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r4 = new X.72Z
            r4.<init>(r5, r0)
            X.16r r0 = r7.A00
            X.1M0 r0 = r0.get()
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x00f7 }
        L_0x005a:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x00f7 }
            if (r4 == 0) goto L_0x00fe
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x00f7 }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ all -> 0x00f7 }
            X.14e r7 = r0.A02     // Catch:{ all -> 0x00f7 }
            int r6 = r11.length     // Catch:{ all -> 0x00f7 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "\n            SELECT\n              jid,\n              tag,\n              name,\n              is_default,\n              attributes,\n              category,\n              prompts,\n              behavior_graph,\n              persona_id,\n              commands_description,\n              commands,\n              avatar_url\n            FROM\n              wa_bot_profiles\n            WHERE\n              jid\n            IN\n              "
            X.C36351kA.A1O(r4, r5, r6)     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "\n        "
            java.lang.String r5 = X.AnonymousClass000.A0q(r4, r5)     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "GET_BOT_PROFILES_BY_JIDS"
            android.database.Cursor r14 = r7.A09(r5, r4, r11)     // Catch:{ all -> 0x00f7 }
            X.AnonymousClass00C.A0B(r14)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "jid"
            int r7 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "tag"
            int r16 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "name"
            int r17 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "is_default"
            int r18 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "attributes"
            int r19 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "category"
            int r20 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "prompts"
            int r21 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "behavior_graph"
            int r22 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "persona_id"
            int r23 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "commands_description"
            int r24 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "commands"
            int r25 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "avatar_url"
            int r26 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00f0 }
        L_0x00c9:
            boolean r4 = r14.moveToNext()     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x00eb
            java.lang.String r6 = X.C90494aF.A0Z(r14, r7)     // Catch:{ all -> 0x00f0 }
            com.whatsapp.jid.UserJid r15 = X.C36431kI.A0l(r6)     // Catch:{ all -> 0x00f0 }
            if (r15 != 0) goto L_0x00e3
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "BotProfileStore/readBotProfilesFromCursor invalid jid="
            X.C36321k7.A1P(r4, r6, r5)     // Catch:{ all -> 0x00f0 }
            goto L_0x00c9
        L_0x00e3:
            X.6E1 r4 = X.AnonymousClass6JM.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x00f0 }
            r1.put(r15, r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x00c9
        L_0x00eb:
            r14.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x005a
        L_0x00f0:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r1 = move-exception
            X.C05600Qi.A00(r14, r2)     // Catch:{ all -> 0x00f7 }
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r1 = move-exception
            X.C05600Qi.A00(r0, r2)
            throw r1
        L_0x00fe:
            r0.close()
        L_0x0101:
            java.util.Iterator r6 = r8.iterator()
        L_0x0105:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r5 = r6.next()
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x011c
            X.C90494aF.A1G(r5, r0, r9)
            r2.put(r5, r0)
            goto L_0x0105
        L_0x011c:
            X.00T r0 = r3.A01
            java.lang.Object r4 = r0.getValue()
            X.00v r4 = (X.C002000v) r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r4.A08(r5, r0)
            goto L_0x0105
        L_0x012c:
            java.util.Iterator r3 = r10.iterator()
        L_0x0130:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r1 = r3.next()
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x0130
            java.lang.Object r0 = r9.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0130
            r2.put(r1, r0)
            goto L_0x0130
        L_0x0150:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BB.A01(java.util.Collection):java.util.HashMap");
    }
}
