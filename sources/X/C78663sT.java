package X;

/* renamed from: X.3sT  reason: invalid class name and case insensitive filesystem */
public final class C78663sT implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78663sT(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:284:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r34, X.C52942qQ r35) {
        /*
            r33 = this;
            r0 = 0
            r8 = r34
            X.AnonymousClass00C.A0D(r8, r0)
            long r1 = r8.A0F
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
            long r3 = r8.A1R
            r1 = 2
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x052e
        L_0x0017:
            r0 = r33
            X.005 r0 = r0.A00
            java.lang.Object r7 = r0.get()
            X.0xP r7 = (X.C20340xP) r7
            X.12P r9 = r7.A0B     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0515 }
            X.1M0 r22 = r9.get()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0515 }
            long r2 = r8.A1N     // Catch:{ all -> 0x050b }
            X.1M0 r5 = r9.get()     // Catch:{ all -> 0x050b }
            X.14e r6 = r5.A02     // Catch:{ all -> 0x0501 }
            java.lang.String r4 = "SELECT chat_row_id, from_me, sender_jid_row_id, key_id, timestamp, message_type, origin, text_data, payment_transaction_id, lookup_tables FROM message_quoted WHERE message_row_id = ?"
            r12 = 1
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x0501 }
            X.C36341k9.A1W(r1, r2)     // Catch:{ all -> 0x0501 }
            java.lang.String r0 = "GET_QUOTED_CORE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r4 = r6.A09(r4, r0, r1)     // Catch:{ all -> 0x0501 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x04de
            X.163 r6 = r7.A03     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "chat_row_id"
            long r0 = X.C36351kA.A07(r4, r0)     // Catch:{ all -> 0x04f5 }
            X.11F r14 = r6.A0A(r0)     // Catch:{ all -> 0x04f5 }
            if (r14 == 0) goto L_0x04eb
            java.lang.String r0 = "from_me"
            int r0 = X.C36351kA.A03(r4, r0)     // Catch:{ all -> 0x04f5 }
            if (r0 > 0) goto L_0x005a
            r12 = 0
        L_0x005a:
            java.lang.String r0 = "key_id"
            java.lang.String r13 = X.C36341k9.A0f(r4, r0)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "timestamp"
            long r0 = X.C36351kA.A07(r4, r0)     // Catch:{ all -> 0x04f5 }
            java.lang.String r6 = "message_type"
            int r6 = X.C36351kA.A03(r4, r6)     // Catch:{ all -> 0x04f5 }
            byte r11 = (byte) r6     // Catch:{ all -> 0x04f5 }
            X.17E r10 = r7.A0K     // Catch:{ all -> 0x04f5 }
            X.3Qa r6 = new X.3Qa     // Catch:{ all -> 0x04f5 }
            r6.<init>(r14, r13, r12)     // Catch:{ all -> 0x04f5 }
            X.3T1 r6 = r10.A00(r6, r11, r0)     // Catch:{ all -> 0x04f5 }
            X.12j r10 = r7.A06     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "sender_jid_row_id"
            long r0 = X.C36351kA.A07(r4, r0)     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.Jid r0 = r10.A09(r0)     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)     // Catch:{ all -> 0x04f5 }
            r6.A0q(r0)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "origin"
            int r0 = X.C36351kA.A03(r4, r0)     // Catch:{ all -> 0x04f5 }
            r6.A09 = r0     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "text_data"
            java.lang.String r0 = X.C36341k9.A0f(r4, r0)     // Catch:{ all -> 0x04f5 }
            r6.A17(r0)     // Catch:{ all -> 0x04f5 }
            r6.A1N = r2     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "payment_transaction_id"
            java.lang.String r0 = X.C36341k9.A0f(r4, r0)     // Catch:{ all -> 0x04f5 }
            r6.A0t = r0     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "lookup_tables"
            long r0 = X.C36351kA.A07(r4, r0)     // Catch:{ all -> 0x04f5 }
            r6.A1R = r0     // Catch:{ all -> 0x04f5 }
            r4.close()     // Catch:{ all -> 0x0501 }
            r5.close()     // Catch:{ all -> 0x050b }
            X.3Qa r1 = r6.A1J     // Catch:{ all -> 0x050b }
            r0 = 2
            r6.A0o(r0)     // Catch:{ all -> 0x050b }
            r8.A0x(r6)     // Catch:{ all -> 0x050b }
            java.lang.String r0 = r6.A0t     // Catch:{ all -> 0x050b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x050b }
            if (r0 != 0) goto L_0x00d3
            X.1Ed r4 = r7.A0E     // Catch:{ all -> 0x050b }
            java.lang.String r3 = r1.A01     // Catch:{ all -> 0x050b }
            java.lang.String r2 = r6.A0t     // Catch:{ all -> 0x050b }
            r0 = -1
            X.9lY r0 = r4.A0L(r3, r2, r0)     // Catch:{ all -> 0x050b }
            r6.A0M = r0     // Catch:{ all -> 0x050b }
        L_0x00d3:
            long r0 = r8.A1N     // Catch:{ all -> 0x050b }
            X.1M0 r23 = r9.get()     // Catch:{ all -> 0x050b }
            boolean r2 = r6 instanceof X.C88854Uh     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x014f
            X.1F1 r10 = r7.A0G     // Catch:{ all -> 0x04d9 }
            r3 = r6
            X.4Uh r3 = (X.C88854Uh) r3     // Catch:{ all -> 0x04d9 }
            r5 = 1
            r2 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1R(r4)
            java.lang.String r4 = "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set"
            X.C18740tg.A0E(r9, r4)     // Catch:{ all -> 0x04d9 }
            X.12P r4 = r10.A00     // Catch:{ all -> 0x04d9 }
            X.1M0 r4 = r4.get()     // Catch:{ all -> 0x04d9 }
            X.14e r10 = r4.A02     // Catch:{ all -> 0x043b }
            java.lang.String r9 = "SELECT content_text_data, footer_text_data FROM message_template_quoted WHERE message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x043b }
            X.C36351kA.A1V(r5, r2, r0)     // Catch:{ all -> 0x043b }
            java.lang.String r2 = "GET_TEMPLATE_MESSAGE_QUOTED_SQL"
            android.database.Cursor r2 = r10.A09(r9, r2, r5)     // Catch:{ all -> 0x043b }
            boolean r5 = r2.moveToFirst()     // Catch:{ all -> 0x0133 }
            if (r5 == 0) goto L_0x0122
            java.lang.String r5 = "content_text_data"
            java.lang.String r26 = X.C36341k9.A0f(r2, r5)     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = "footer_text_data"
            java.lang.String r27 = X.C36341k9.A0f(r2, r5)     // Catch:{ all -> 0x0133 }
            r2.close()     // Catch:{ all -> 0x043b }
            r4.close()     // Catch:{ all -> 0x04d9 }
            X.C18740tg.A06(r26)     // Catch:{ all -> 0x04d9 }
            r25 = 0
            goto L_0x013b
        L_0x0122:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0133 }
            java.lang.String r3 = "TemplateMessageStore/fillQuotedTemplateData/missing template info for quoted message; rowId="
            r5.append(r3)     // Catch:{ all -> 0x0133 }
            r5.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0b(r5)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            if (r2 == 0) goto L_0x043a
            r2.close()     // Catch:{ all -> 0x0436 }
            goto L_0x043a
        L_0x013b:
            X.3F4 r2 = new X.3F4     // Catch:{ all -> 0x04d9 }
            r29 = r25
            r30 = r25
            r31 = r25
            r32 = 0
            r28 = r25
            r24 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x04d9 }
            r3.BsS(r2)     // Catch:{ all -> 0x04d9 }
        L_0x014f:
            r2 = 8
            boolean r2 = r6.A1R(r2)     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x0160
            X.1F3 r5 = r7.A05     // Catch:{ all -> 0x04d9 }
            long r2 = r6.A1N     // Catch:{ all -> 0x04d9 }
            java.lang.String r4 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            X.AnonymousClass1F3.A05(r5, r6, r4, r2)     // Catch:{ all -> 0x04d9 }
        L_0x0160:
            long r2 = r6.A1R     // Catch:{ all -> 0x04d9 }
            r9 = 1
            long r2 = r2 & r9
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01ce
            X.1Ey r13 = r7.A09     // Catch:{ all -> 0x04d9 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x04d9 }
            X.12P r2 = r13.A03     // Catch:{ all -> 0x04d9 }
            X.1M0 r11 = r2.get()     // Catch:{ all -> 0x04d9 }
            X.14e r5 = r11.A02     // Catch:{ all -> 0x01c2 }
            java.lang.String r4 = "SELECT jid_row_id, display_name FROM message_quoted_mentions WHERE message_row_id = ?"
            java.lang.String[] r3 = X.C36371kC.A1a(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "GET_JIDS_FROM_MESSAGE_QUOTED_MENTIONS_TABLE_SQL"
            android.database.Cursor r10 = r5.A09(r4, r2, r3)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "jid_row_id"
            int r9 = r10.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "display_name"
            int r5 = r10.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x01b6 }
        L_0x018f:
            boolean r2 = r10.moveToNext()     // Catch:{ all -> 0x01b6 }
            if (r2 == 0) goto L_0x01b2
            long r2 = r10.getLong(r9)     // Catch:{ all -> 0x01b6 }
            java.lang.String r4 = r10.getString(r5)     // Catch:{ all -> 0x01b6 }
            X.12j r14 = r13.A02     // Catch:{ all -> 0x01b6 }
            com.whatsapp.jid.Jid r2 = r14.A09(r2)     // Catch:{ all -> 0x01b6 }
            X.11F r3 = X.C222713q.A00(r2)     // Catch:{ all -> 0x01b6 }
            if (r3 == 0) goto L_0x018f
            X.3ux r2 = new X.3ux     // Catch:{ all -> 0x01b6 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x01b6 }
            r12.add(r2)     // Catch:{ all -> 0x01b6 }
            goto L_0x018f
        L_0x01b2:
            r10.close()     // Catch:{ all -> 0x01c2 }
            goto L_0x01c8
        L_0x01b6:
            r1 = move-exception
            if (r10 == 0) goto L_0x01c1
            r10.close()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01c2 }
        L_0x01c1:
            throw r1     // Catch:{ all -> 0x01c2 }
        L_0x01c2:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x049b }
            goto L_0x049f
        L_0x01c8:
            r11.close()     // Catch:{ all -> 0x04d9 }
            r6.A18(r12)     // Catch:{ all -> 0x04d9 }
        L_0x01ce:
            boolean r2 = r6 instanceof X.C46852bm     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x01de
            X.1Ez r5 = r7.A0F     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2bm r4 = (X.C46852bm) r4     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM message_quoted_product WHERE message_row_id=?"
            java.lang.String r2 = "GET_QUOTED_PRODUCT_MESSAGE_SQL"
            X.C25101Ez.A01(r5, r4, r3, r2)     // Catch:{ all -> 0x04d9 }
        L_0x01de:
            boolean r2 = r6 instanceof X.C46842bl     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x01ee
            X.1Ex r5 = r7.A02     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2bl r4 = (X.C46842bl) r4     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "SELECT message_row_id, business_owner_jid, title, description FROM message_quoted_product WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_CATALOG_MESSAGE_SQL_DEPRECATED"
            X.C25081Ex.A01(r5, r4, r3, r2)     // Catch:{ all -> 0x04d9 }
        L_0x01ee:
            boolean r2 = r6 instanceof X.AnonymousClass2bQ     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x028d
            X.1F8 r11 = r7.A04     // Catch:{ all -> 0x04d9 }
            r12 = r6
            X.2bQ r12 = (X.AnonymousClass2bQ) r12     // Catch:{ all -> 0x04d9 }
            java.lang.String[] r4 = X.C36441kJ.A1R()     // Catch:{ all -> 0x04d9 }
            long r2 = r12.A1N     // Catch:{ all -> 0x04d9 }
            X.C36421kH.A1Q(r4, r2)     // Catch:{ all -> 0x04d9 }
            X.12P r2 = r11.A01     // Catch:{ all -> 0x04d9 }
            X.1M0 r21 = r2.get()     // Catch:{ all -> 0x04d9 }
            r2 = r21
            X.14e r5 = r2.A02     // Catch:{ all -> 0x0284 }
            java.lang.String r3 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, expired, group_type FROM message_quoted_group_invite WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r13 = r5.A09(r3, r2, r4)     // Catch:{ all -> 0x0284 }
            boolean r2 = r13.moveToNext()     // Catch:{ all -> 0x0278 }
            if (r2 == 0) goto L_0x0274
            java.lang.String r2 = "expiration"
            long r9 = X.C36351kA.A07(r13, r2)     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = "group_jid_row_id"
            long r4 = X.C36351kA.A07(r13, r2)     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = "admin_jid_row_id"
            long r2 = X.C36351kA.A07(r13, r2)     // Catch:{ all -> 0x0278 }
            java.lang.String r14 = "group_name"
            java.lang.String r20 = X.C36341k9.A0f(r13, r14)     // Catch:{ all -> 0x0278 }
            java.lang.String r14 = "invite_code"
            java.lang.String r19 = X.C36341k9.A0f(r13, r14)     // Catch:{ all -> 0x0278 }
            java.lang.String r14 = "expired"
            int r18 = X.C36351kA.A03(r13, r14)     // Catch:{ all -> 0x0278 }
            java.lang.String r14 = "group_type"
            int r15 = X.C36351kA.A03(r13, r14)     // Catch:{ all -> 0x0278 }
            X.12j r14 = r11.A00     // Catch:{ all -> 0x0278 }
            java.lang.Class<X.147> r11 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r4 = r14.A0C(r11, r4)     // Catch:{ all -> 0x0278 }
            X.147 r4 = (X.AnonymousClass147) r4     // Catch:{ all -> 0x0278 }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r14.A0C(r5, r2)     // Catch:{ all -> 0x0278 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x0278 }
            if (r4 == 0) goto L_0x026f
            if (r2 == 0) goto L_0x026f
            boolean r3 = X.AnonymousClass000.A1P(r18)
            r12.A02 = r4     // Catch:{ all -> 0x0278 }
            r12.A03 = r2     // Catch:{ all -> 0x0278 }
            r2 = r20
            r12.A05 = r2     // Catch:{ all -> 0x0278 }
            r2 = r19
            r12.A06 = r2     // Catch:{ all -> 0x0278 }
            r12.A01 = r9     // Catch:{ all -> 0x0278 }
            r12.A07 = r3     // Catch:{ all -> 0x0278 }
            r12.A00 = r15     // Catch:{ all -> 0x0278 }
            goto L_0x0274
        L_0x026f:
            java.lang.String r2 = "GroupInviteMessageStore/fillQuotedGroupInviteInfo/could not fill group invite data as groupJid and/or adminJid are null"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0278 }
        L_0x0274:
            r13.close()     // Catch:{ all -> 0x0284 }
            goto L_0x028a
        L_0x0278:
            r1 = move-exception
            if (r13 == 0) goto L_0x0283
            r13.close()     // Catch:{ all -> 0x027f }
            goto L_0x0283
        L_0x027f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0284 }
        L_0x0283:
            throw r1     // Catch:{ all -> 0x0284 }
        L_0x0284:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x049b }
            goto L_0x049f
        L_0x028a:
            r21.close()     // Catch:{ all -> 0x04d9 }
        L_0x028d:
            boolean r2 = r6 instanceof X.C46952bw     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x029e
            X.1Ev r9 = r7.A0C     // Catch:{ all -> 0x04d9 }
            r5 = r6
            X.2bw r5 = (X.C46952bw) r5     // Catch:{ all -> 0x04d9 }
            java.lang.String r4 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_quoted_order WHERE message_row_id=?"
            java.lang.String r3 = "GET_QUOTED_ORDER_MESSAGE_SQL"
            r2 = 1
            X.C25061Ev.A00(r9, r5, r4, r3, r2)     // Catch:{ all -> 0x04d9 }
        L_0x029e:
            boolean r2 = r6 instanceof X.C23043B1o     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x02ae
            X.1F3 r9 = r7.A05     // Catch:{ all -> 0x04d9 }
            r5 = r6
            X.B1o r5 = (X.C23043B1o) r5     // Catch:{ all -> 0x04d9 }
            long r2 = r6.A1N     // Catch:{ all -> 0x04d9 }
            java.lang.String r4 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            X.AnonymousClass1F3.A09(r9, r5, r4, r2)     // Catch:{ all -> 0x04d9 }
        L_0x02ae:
            boolean r2 = r6 instanceof X.AnonymousClass2cT     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x02be
            X.1F3 r5 = r7.A05     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2cT r4 = (X.AnonymousClass2cT) r4     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?"
            java.lang.String r2 = "GET_QUOTED_REPLY_MESSAGE_SQL"
            X.AnonymousClass1F3.A08(r5, r4, r3, r2)     // Catch:{ all -> 0x04d9 }
        L_0x02be:
            boolean r2 = r6 instanceof X.AnonymousClass2cU     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x02ce
            X.1F3 r5 = r7.A05     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2cU r4 = (X.AnonymousClass2cU) r4     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?"
            java.lang.String r2 = "GET_QUOTED_RESPONSE_BUTTONS_MESSAGE_SQL"
            X.AnonymousClass1F3.A07(r5, r4, r3, r2)     // Catch:{ all -> 0x04d9 }
        L_0x02ce:
            boolean r2 = r6 instanceof X.AnonymousClass2bL     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x030b
            X.1F0 r9 = r7.A07     // Catch:{ all -> 0x04d9 }
            r5 = r6
            X.2bL r5 = (X.AnonymousClass2bL) r5     // Catch:{ all -> 0x04d9 }
            long r2 = r5.A1N     // Catch:{ all -> 0x04d9 }
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04d9 }
            java.lang.String r2 = "LocationMessageStore/fillLocationInfoForQuotedMessage/message must have row_id set; key="
            r3.append(r2)     // Catch:{ all -> 0x04d9 }
            java.lang.String[] r10 = X.AnonymousClass3T1.A0C(r5, r3, r4)     // Catch:{ all -> 0x04d9 }
            X.12P r2 = r9.A01     // Catch:{ all -> 0x04d9 }
            X.1M0 r4 = r2.get()     // Catch:{ all -> 0x04d9 }
            X.14e r9 = r4.A02     // Catch:{ all -> 0x043b }
            java.lang.String r3 = "SELECT latitude, longitude, place_name, place_address, url, thumbnail FROM message_quoted_location WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_LOCATION_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r9.A09(r3, r2, r10)     // Catch:{ all -> 0x043b }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x042f }
            if (r2 == 0) goto L_0x0305
            r5.A1X(r3)     // Catch:{ all -> 0x042f }
        L_0x0305:
            r3.close()     // Catch:{ all -> 0x043b }
            r4.close()     // Catch:{ all -> 0x04d9 }
        L_0x030b:
            boolean r2 = r6 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x03b9
            X.1DG r10 = r7.A08     // Catch:{ all -> 0x04d9 }
            r9 = r6
            X.2bU r9 = (X.AnonymousClass2bU) r9     // Catch:{ all -> 0x04d9 }
            long r2 = r9.A1N     // Catch:{ all -> 0x04d9 }
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04d9 }
            java.lang.String r2 = "MediaCoreMessageStore/fillMediaInfoForQuotedMessage/message must have row_id set; key="
            r3.append(r2)     // Catch:{ all -> 0x04d9 }
            java.lang.String[] r11 = X.AnonymousClass3T1.A0C(r9, r3, r4)     // Catch:{ all -> 0x04d9 }
            X.12P r2 = r10.A03     // Catch:{ all -> 0x04d9 }
            X.1M0 r4 = r2.get()     // Catch:{ all -> 0x04d9 }
            X.14e r5 = r4.A02     // Catch:{ all -> 0x043b }
            java.lang.String r3 = "SELECT message_row_id, media_job_uuid, transferred, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, thumbnail, media_caption FROM message_quoted_media WHERE message_row_id= ?"
            java.lang.String r2 = "GET_QUOTED_MESSAGE_MEDIA_SQL"
            android.database.Cursor r11 = r5.A09(r3, r2, r11)     // Catch:{ all -> 0x043b }
            boolean r2 = r11.moveToNext()     // Catch:{ all -> 0x03ae }
            if (r2 == 0) goto L_0x03aa
            X.3Qj r5 = new X.3Qj     // Catch:{ all -> 0x03ae }
            r5.<init>()     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "media_job_uuid"
            java.lang.String r2 = X.C36341k9.A0f(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A0L = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "transferred"
            int r2 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x03ae }
            long r14 = r11.getLong(r2)     // Catch:{ all -> 0x03ae }
            r12 = 1
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r2 = 0
            if (r3 != 0) goto L_0x035e
            r2 = 1
        L_0x035e:
            r5.A0V = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "file_size"
            long r2 = X.C36351kA.A07(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A0C = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "media_key"
            byte[] r2 = X.C36391kE.A1b(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A0a = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "media_key_timestamp"
            long r2 = X.C36351kA.A07(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A0D = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "width"
            int r2 = X.C36351kA.A03(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A0A = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "height"
            int r2 = X.C36351kA.A03(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A06 = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "direct_path"
            java.lang.String r2 = X.C36341k9.A0f(r11, r2)     // Catch:{ all -> 0x03ae }
            r5.A0J = r2     // Catch:{ all -> 0x03ae }
            java.lang.String r2 = "file_path"
            java.lang.String r2 = X.C36341k9.A0f(r11, r2)     // Catch:{ all -> 0x03ae }
            if (r2 != 0) goto L_0x039a
            r3 = 0
            goto L_0x039f
        L_0x039a:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x03ae }
            r3.<init>(r2)     // Catch:{ all -> 0x03ae }
        L_0x039f:
            X.179 r2 = r10.A00     // Catch:{ all -> 0x03ae }
            java.io.File r2 = r2.A06(r3)     // Catch:{ all -> 0x03ae }
            r5.A0I = r2     // Catch:{ all -> 0x03ae }
            r9.A1d(r11, r5)     // Catch:{ all -> 0x03ae }
        L_0x03aa:
            r11.close()     // Catch:{ all -> 0x043b }
            goto L_0x03b6
        L_0x03ae:
            r1 = move-exception
            if (r11 == 0) goto L_0x043a
            r11.close()     // Catch:{ all -> 0x0436 }
            goto L_0x043a
        L_0x03b6:
            r4.close()     // Catch:{ all -> 0x04d9 }
        L_0x03b9:
            boolean r2 = r6 instanceof X.AnonymousClass2bX     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x03e1
            X.1Ew r3 = r7.A0I     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2bX r4 = (X.AnonymousClass2bX) r4     // Catch:{ all -> 0x04d9 }
            r2 = 1
            java.util.ArrayList r3 = X.C25071Ew.A00(r3, r0, r2)     // Catch:{ all -> 0x04d9 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x04d9 }
            if (r2 != 0) goto L_0x03d5
            r2 = 0
            java.lang.String r2 = X.C36421kH.A0e(r3, r2)     // Catch:{ all -> 0x04d9 }
            r4.A1Y(r2)     // Catch:{ all -> 0x04d9 }
        L_0x03d5:
            boolean r2 = r6 instanceof X.AnonymousClass2bV     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x0443
            X.1Eh r5 = r7.A0H     // Catch:{ all -> 0x04d9 }
            r9 = r6
            X.2bV r9 = (X.AnonymousClass2bV) r9     // Catch:{ all -> 0x04d9 }
            long r2 = r9.A1N     // Catch:{ all -> 0x04d9 }
            goto L_0x03f9
        L_0x03e1:
            boolean r2 = r6 instanceof X.AnonymousClass2bW     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x03d5
            X.1Ew r3 = r7.A0I     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2bW r4 = (X.AnonymousClass2bW) r4     // Catch:{ all -> 0x04d9 }
            r2 = 1
            java.util.ArrayList r3 = X.C25071Ew.A00(r3, r0, r2)     // Catch:{ all -> 0x04d9 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x04d9 }
            if (r2 != 0) goto L_0x03d5
            r4.A1Y(r3)     // Catch:{ all -> 0x04d9 }
            goto L_0x03d5
        L_0x03f9:
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04d9 }
            java.lang.String r2 = "TextMessageStore/fillTextInfoForQuotedMessage/message must have row_id set; key="
            r3.append(r2)     // Catch:{ all -> 0x04d9 }
            java.lang.String[] r10 = X.AnonymousClass3T1.A0C(r9, r3, r4)     // Catch:{ all -> 0x04d9 }
            X.12P r2 = r5.A00     // Catch:{ all -> 0x04d9 }
            X.1M0 r4 = r2.get()     // Catch:{ all -> 0x04d9 }
            X.14e r5 = r4.A02     // Catch:{ all -> 0x043b }
            java.lang.String r3 = "SELECT thumbnail FROM message_quoted_text WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_TEXT_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r5.A09(r3, r2, r10)     // Catch:{ all -> 0x043b }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x042f }
            if (r2 == 0) goto L_0x042b
            java.lang.String r2 = "thumbnail"
            byte[] r2 = X.C36391kE.A1b(r3, r2)     // Catch:{ all -> 0x042f }
            r9.A1b(r2)     // Catch:{ all -> 0x042f }
        L_0x042b:
            r3.close()     // Catch:{ all -> 0x043b }
            goto L_0x0440
        L_0x042f:
            r1 = move-exception
            if (r3 == 0) goto L_0x043a
            r3.close()     // Catch:{ all -> 0x0436 }
            goto L_0x043a
        L_0x0436:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x043b }
        L_0x043a:
            throw r1     // Catch:{ all -> 0x043b }
        L_0x043b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x049b }
            goto L_0x049f
        L_0x0440:
            r4.close()     // Catch:{ all -> 0x04d9 }
        L_0x0443:
            boolean r2 = r6 instanceof X.AnonymousClass2bR     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x0453
            X.1F9 r5 = r7.A0D     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2bR r4 = (X.AnonymousClass2bR) r4     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?"
            java.lang.String r2 = "GET_QUOTED_PAYMENT_INVITE"
            X.AnonymousClass1F9.A00(r5, r4, r3, r2)     // Catch:{ all -> 0x04d9 }
        L_0x0453:
            boolean r2 = r6 instanceof X.AnonymousClass2c5     // Catch:{ all -> 0x04d9 }
            if (r2 == 0) goto L_0x04a3
            X.1F2 r2 = r7.A0J     // Catch:{ all -> 0x04d9 }
            r4 = r6
            X.2c5 r4 = (X.AnonymousClass2c5) r4     // Catch:{ all -> 0x04d9 }
            X.12P r2 = r2.A00     // Catch:{ all -> 0x04d9 }
            X.1M0 r3 = r2.get()     // Catch:{ all -> 0x04d9 }
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0496 }
            java.lang.String r2 = "SELECT message_row_id, parent_group_jid, group_subject FROM message_quoted_blank_reply WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C36371kC.A1a(r0)     // Catch:{ all -> 0x0496 }
            java.lang.String r0 = "GET_QUOTED_BLANK_REPLY_MESSAGE"
            android.database.Cursor r2 = r5.A09(r2, r0, r1)     // Catch:{ all -> 0x0496 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0486
            java.lang.String r0 = "parent_group_jid"
            java.lang.String r0 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x048a }
            r4.A01 = r0     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "group_subject"
            java.lang.String r0 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x048a }
            r4.A00 = r0     // Catch:{ all -> 0x048a }
        L_0x0486:
            r2.close()     // Catch:{ all -> 0x0496 }
            goto L_0x04a0
        L_0x048a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0495
            r2.close()     // Catch:{ all -> 0x0491 }
            goto L_0x0495
        L_0x0491:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0496 }
        L_0x0495:
            throw r1     // Catch:{ all -> 0x0496 }
        L_0x0496:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x049b }
            goto L_0x049f
        L_0x049b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04d9 }
        L_0x049f:
            throw r1     // Catch:{ all -> 0x04d9 }
        L_0x04a0:
            r3.close()     // Catch:{ all -> 0x04d9 }
        L_0x04a3:
            boolean r0 = r6 instanceof X.C106265Iz     // Catch:{ all -> 0x04d9 }
            if (r0 == 0) goto L_0x04d5
            X.1FA r1 = r7.A01     // Catch:{ all -> 0x04d9 }
            X.5Iz r6 = (X.C106265Iz) r6     // Catch:{ all -> 0x04d9 }
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ all -> 0x04d9 }
            X.1FC r5 = r1.A01     // Catch:{ all -> 0x04d9 }
            X.1FB r4 = r1.A00     // Catch:{ all -> 0x04d9 }
            X.005 r0 = r1.A04     // Catch:{ all -> 0x04d9 }
            java.lang.Object r3 = X.C36411kG.A0v(r0)     // Catch:{ all -> 0x04d9 }
            X.1A1 r3 = (X.AnonymousClass1A1) r3     // Catch:{ all -> 0x04d9 }
            X.4F8 r2 = new X.4F8     // Catch:{ all -> 0x04d9 }
            r2.<init>(r1, r8)     // Catch:{ all -> 0x04d9 }
            r0 = 2
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x04d9 }
            X.0wU r1 = r5.A01     // Catch:{ all -> 0x04d9 }
            X.1ii r0 = new X.1ii     // Catch:{ all -> 0x04d9 }
            r9 = r0
            r10 = r6
            r11 = r4
            r12 = r5
            r13 = r8
            r14 = r3
            r15 = r2
            r9.<init>((X.C106265Iz) r10, (X.AnonymousClass1FB) r11, (X.AnonymousClass1FC) r12, (X.AnonymousClass3T1) r13, (X.AnonymousClass1A1) r14, (X.AnonymousClass00S) r15)     // Catch:{ all -> 0x04d9 }
            r1.Bp1(r0)     // Catch:{ all -> 0x04d9 }
        L_0x04d5:
            r23.close()     // Catch:{ all -> 0x050b }
            goto L_0x04f1
        L_0x04d9:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0506 }
            goto L_0x050a
        L_0x04de:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "QuotedMessageStore/readQuotedMessage/no quote; rowId="
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r2)     // Catch:{ all -> 0x04f5 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04f5 }
        L_0x04eb:
            r4.close()     // Catch:{ all -> 0x0501 }
            r5.close()     // Catch:{ all -> 0x050b }
        L_0x04f1:
            r22.close()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0515 }
            goto L_0x0525
        L_0x04f5:
            r1 = move-exception
            if (r4 == 0) goto L_0x0500
            r4.close()     // Catch:{ all -> 0x04fc }
            goto L_0x0500
        L_0x04fc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0501 }
        L_0x0500:
            throw r1     // Catch:{ all -> 0x0501 }
        L_0x0501:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0506 }
            goto L_0x050a
        L_0x0506:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x050b }
        L_0x050a:
            throw r1     // Catch:{ all -> 0x050b }
        L_0x050b:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0510 }
            goto L_0x0514
        L_0x0510:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0515 }
        L_0x0514:
            throw r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0515 }
        L_0x0515:
            r1 = move-exception
            r0 = 0
            r8.A0W = r0
            X.0wN r3 = r7.A00
            java.lang.String r2 = r1.toString()
            r1 = 1
            java.lang.String r0 = "QuotedMessageStore/fillQuotedMessage/failed to load quoted message"
            r3.A0E(r0, r2, r1)
        L_0x0525:
            if (r35 == 0) goto L_0x052e
            java.lang.Class<X.3sT> r0 = X.C78663sT.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x052e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78663sT.BmI(X.3T1, X.2qQ):void");
    }
}
