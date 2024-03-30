package X;

/* renamed from: X.4HK  reason: invalid class name */
public final class AnonymousClass4HK extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3T1 $fMessage;
    public final /* synthetic */ AnonymousClass17R this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HK(AnonymousClass3T1 r2, AnonymousClass17R r3) {
        super(0);
        this.this$0 = r3;
        this.$fMessage = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b9 A[Catch:{ SQLException -> 0x01f2, all -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r25 = this;
            r1 = r25
            X.17R r0 = r1.this$0
            X.178 r4 = r0.A01
            X.3T1 r7 = r1.$fMessage
            r11 = 1
            r7.A0o(r11)
            X.12P r10 = r4.A03
            X.1M0 r18 = r10.A05()
            X.71s r17 = r18.B1k()     // Catch:{ all -> 0x0243 }
            X.12j r9 = r4.A02     // Catch:{ all -> 0x0239 }
            X.3Qa r6 = r7.A1J     // Catch:{ all -> 0x0239 }
            X.11F r2 = r6.A00     // Catch:{ all -> 0x0239 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0239 }
            r9.A07(r2)     // Catch:{ all -> 0x0239 }
            X.163 r3 = r4.A01     // Catch:{ all -> 0x0239 }
            long r0 = r3.A09(r7)     // Catch:{ all -> 0x0239 }
            r14 = 0
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x002f
            r11 = 0
        L_0x002f:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0239 }
            java.lang.String r5 = "MainMessageStore/insertMainMessage/Chat row not inserted; chatRowId="
            r8.append(r5)     // Catch:{ all -> 0x0239 }
            r8.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = " key="
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r8)     // Catch:{ all -> 0x0239 }
            X.C18740tg.A0D(r11, r0)     // Catch:{ all -> 0x0239 }
            X.1M0 r11 = r10.A05()     // Catch:{ SQLException -> 0x022e }
            X.71s r16 = r11.B1k()     // Catch:{ all -> 0x0224 }
            android.content.ContentValues r5 = X.C36441kJ.A0E()     // Catch:{ all -> 0x021a }
            long r0 = r7.A1O     // Catch:{ all -> 0x021a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r8 = "sort_id"
            r5.put(r8, r0)     // Catch:{ all -> 0x021a }
            long r0 = r3.A09(r7)     // Catch:{ all -> 0x021a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "chat_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            X.AnonymousClass178.A03(r5, r7)     // Catch:{ all -> 0x021a }
            boolean r1 = r6.A02     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "from_me"
            X.AnonymousClass3SW.A02(r5, r0, r1)     // Catch:{ all -> 0x021a }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "key_id"
            r5.put(r0, r3)     // Catch:{ all -> 0x021a }
            X.11F r0 = r7.A0J()     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x0082
            r0 = 0
            goto L_0x0086
        L_0x0082:
            long r0 = r9.A07(r0)     // Catch:{ all -> 0x021a }
        L_0x0086:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "sender_jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            int r0 = r7.A0D     // Catch:{ all -> 0x021a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "status"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            boolean r1 = r7.A10     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "broadcast"
            X.AnonymousClass3SW.A02(r5, r0, r1)     // Catch:{ all -> 0x021a }
            int r0 = r7.A0B     // Catch:{ all -> 0x021a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "recipient_count"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = r7.A0s     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "participant_hash"
            X.AnonymousClass3SW.A01(r5, r0, r1)     // Catch:{ all -> 0x021a }
            int r0 = r7.A0F()     // Catch:{ all -> 0x021a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "origination_flags"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            int r0 = r7.A09     // Catch:{ all -> 0x021a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "origin"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            long r0 = r7.A0I     // Catch:{ all -> 0x021a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            long r0 = r7.A0G     // Catch:{ all -> 0x021a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "received_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            long r0 = r7.A0H     // Catch:{ all -> 0x021a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "receipt_server_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            int r9 = r7.A1I     // Catch:{ all -> 0x021a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "message_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = r7.A0d()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "text_data"
            X.AnonymousClass3SW.A01(r5, r0, r1)     // Catch:{ all -> 0x021a }
            boolean r1 = r7.A15     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "starred"
            X.AnonymousClass3SW.A02(r5, r0, r1)     // Catch:{ all -> 0x021a }
            long r0 = r7.A0I()     // Catch:{ all -> 0x021a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "lookup_tables"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            int r0 = r7.A08     // Catch:{ all -> 0x021a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "message_add_on_flags"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            int r10 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0130
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x021a }
        L_0x0130:
            X.11F r1 = r7.A0J()     // Catch:{ all -> 0x021a }
            if (r1 == 0) goto L_0x0174
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x0174
            boolean r0 = r1 instanceof X.C177618e5     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x0174
            if (r2 == 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r10 = -1
            goto L_0x0147
        L_0x0143:
            int r10 = r2.getType()     // Catch:{ all -> 0x021a }
        L_0x0147:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "MainMessageStore/bindMessage/senderJid not a UserJid; key.id="
            r1.append(r0)     // Catch:{ all -> 0x021a }
            r1.append(r3)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "; key.ChatJidType="
            r1.append(r0)     // Catch:{ all -> 0x021a }
            r1.append(r10)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "; msg_type="
            X.C36321k7.A1S(r0, r1, r9)     // Catch:{ all -> 0x021a }
            X.0yC r1 = r4.A04     // Catch:{ all -> 0x021a }
            r0 = 6711(0x1a37, float:9.404E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0174
            X.0wN r4 = r4.A00     // Catch:{ all -> 0x021a }
            r3 = 1
            java.lang.String r1 = "FMessage/SenderJid"
            java.lang.String r0 = "SenderJid is not a UserJid"
            r4.A0E(r1, r0, r3)     // Catch:{ all -> 0x021a }
        L_0x0174:
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a7
            java.lang.String r3 = "_id"
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            X.C36341k9.A0p(r5, r3, r0)     // Catch:{ all -> 0x021a }
            long r0 = r7.A1O     // Catch:{ all -> 0x021a }
            r9 = -1
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x018d
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            r7.A1O = r0     // Catch:{ all -> 0x021a }
        L_0x018d:
            long r0 = r7.A1O     // Catch:{ all -> 0x021a }
            X.C36341k9.A0p(r5, r8, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r12 = "INSERT_MESSAGE_MAIN_WITH_ROW_ID_SQL"
        L_0x0194:
            long r0 = r7.A1O     // Catch:{ all -> 0x021a }
            r4 = 1
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x01aa
            boolean r0 = r7.A1J()     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r2 instanceof X.C28981Uw     // Catch:{ all -> 0x021a }
            r13 = 0
            if (r0 == 0) goto L_0x01ab
            goto L_0x01aa
        L_0x01a7:
            java.lang.String r12 = "INSERT_MESSAGE_MAIN_SQL"
            goto L_0x0194
        L_0x01aa:
            r13 = 1
        L_0x01ab:
            X.14e r10 = r11.A02     // Catch:{ all -> 0x021a }
            java.lang.String r9 = "message"
            long r2 = r10.A05(r9, r12, r5)     // Catch:{ all -> 0x021a }
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x01c2
            long r0 = r7.A1N     // Catch:{ all -> 0x021a }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r5)
            goto L_0x01fd
        L_0x01c2:
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, row_id for inserted message not set."
            X.C18740tg.A0D(r1, r0)     // Catch:{ all -> 0x021a }
            r7.A1N = r2     // Catch:{ all -> 0x021a }
            if (r13 != 0) goto L_0x0202
            r7.A1O = r2     // Catch:{ all -> 0x021a }
            r5.clear()     // Catch:{ SQLException -> 0x01f2 }
            long r0 = r7.A1O     // Catch:{ SQLException -> 0x01f2 }
            X.C36341k9.A0p(r5, r8, r0)     // Catch:{ SQLException -> 0x01f2 }
            java.lang.String r22 = "_id = ?"
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ SQLException -> 0x01f2 }
            long r0 = r7.A1N     // Catch:{ SQLException -> 0x01f2 }
            X.C36341k9.A1W(r2, r0)     // Catch:{ SQLException -> 0x01f2 }
            java.lang.String r23 = "UPDATE_MESSAGE_MAIN_SORT_ID_SQL"
            r19 = r10
            r20 = r5
            r21 = r9
            r24 = r2
            r19.A01(r20, r21, r22, r23, r24)     // Catch:{ SQLException -> 0x01f2 }
            goto L_0x0202
        L_0x01f2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, failed to update sortId key="
            X.C36321k7.A1M(r6, r0, r1, r2)     // Catch:{ all -> 0x021a }
            throw r2     // Catch:{ all -> 0x021a }
        L_0x01fd:
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2/RowId for inserted message doesn't match."
            X.C18740tg.A0D(r1, r0)     // Catch:{ all -> 0x021a }
        L_0x0202:
            r7.A0o(r4)     // Catch:{ all -> 0x021a }
            r16.A00()     // Catch:{ all -> 0x021a }
            r16.close()     // Catch:{ all -> 0x0224 }
            r11.close()     // Catch:{ SQLException -> 0x022e }
            r17.A00()     // Catch:{ all -> 0x0239 }
            r17.close()     // Catch:{ all -> 0x0243 }
            r18.close()
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x021a:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x021f }
            goto L_0x0223
        L_0x021f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0224 }
        L_0x0223:
            throw r1     // Catch:{ all -> 0x0224 }
        L_0x0224:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0229 }
            goto L_0x022d
        L_0x0229:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x022e }
        L_0x022d:
            throw r1     // Catch:{ SQLException -> 0x022e }
        L_0x022e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, unknown error key="
            X.C36321k7.A1M(r6, r0, r1, r2)     // Catch:{ all -> 0x0239 }
            throw r2     // Catch:{ all -> 0x0239 }
        L_0x0239:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x023e }
            goto L_0x0242
        L_0x023e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0243 }
        L_0x0242:
            throw r1     // Catch:{ all -> 0x0243 }
        L_0x0243:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0248 }
            throw r1
        L_0x0248:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4HK.invoke():java.lang.Object");
    }
}
