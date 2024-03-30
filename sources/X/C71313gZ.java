package X;

/* renamed from: X.3gZ  reason: invalid class name and case insensitive filesystem */
public class C71313gZ implements C30631aW {
    public final C19970wo A00;
    public final C29571Xd A01;
    public final AnonymousClass1QH A02;
    public final AnonymousClass1FI A03;
    public final C29661Xm A04;
    public final AnonymousClass1TN A05;
    public final C233017y A06;
    public final AnonymousClass1GF A07;
    public final AnonymousClass1HT A08;
    public final C26171Jd A09;
    public final AnonymousClass1TA A0A;
    public final C600836k A0B;
    public final C71953hb A0C;
    public final C20810yC A0D;

    public void BV2() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bc, code lost:
        X.C05600Qi.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02bf, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04ee, code lost:
        X.C05600Qi.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04f1, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV3() {
        /*
            r20 = this;
            r5 = r20
            X.1FI r0 = r5.A03
            r0.A04()
            X.1HT r3 = r5.A08
            X.1C7 r2 = r3.A04
            r0 = 37
            X.1j6 r1 = new X.1j6
            r1.<init>(r3, r0)
            r0 = 40
            r2.A01(r1, r0)
            X.1TN r1 = r5.A05
            X.12P r0 = r1.A03
            X.1M0 r10 = r0.A05()
            X.0wo r0 = r1.A00     // Catch:{ all -> 0x04f2 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x04f2 }
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r2 = r2 - r0
            long r0 = X.C36391kE.A0B(r2)     // Catch:{ all -> 0x04f2 }
            X.14e r4 = r10.A02     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = "receipt_orphaned"
            java.lang.String r2 = "timestamp < ?"
            java.lang.String[] r1 = X.C36341k9.A1b(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "deleteOldOrphanedReceipts/DELETE_RECEIPT_ORPHANED"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x04f2 }
            r10.close()
            X.1GF r11 = r5.A07
            X.0wo r0 = r5.A00
            r19 = r0
            long r2 = X.C19970wo.A00(r19)
            long r0 = X.C56482wM.A00
            long r2 = r2 - r0
            r12 = 200(0xc8, float:2.8E-43)
            r10 = 1
            r18 = 500(0x1f4, float:7.0E-43)
        L_0x0053:
            r14 = 0
            X.12P r0 = r11.A03     // Catch:{ Exception -> 0x0104 }
            X.1M0 r4 = r0.A05()     // Catch:{ Exception -> 0x0104 }
            X.71s r17 = r4.B1k()     // Catch:{ all -> 0x00fa }
            X.14e r13 = r4.A02     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = "SELECT message_row_id FROM message_streaming_sidecar WHERE timestamp < ? LIMIT ?"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x00f0 }
            X.C36351kA.A1V(r1, r14, r2)     // Catch:{ all -> 0x00f0 }
            X.C36431kI.A1O(r1, r12, r10)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "GET_MESSAGE_STREAMING_SIDECAR_OLDER_THAN_SQL"
            android.database.Cursor r9 = r13.A09(r6, r0, r1)     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan num messages to update:"
            r1.append(r0)     // Catch:{ all -> 0x00e4 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x00e4 }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x00e4 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x00e4 }
            boolean r16 = X.C36371kC.A1T(r0, r12)
            r8 = 0
        L_0x008b:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "message_row_id"
            long r6 = X.C36351kA.A07(r9, r0)     // Catch:{ all -> 0x00e4 }
            X.1A1 r0 = r11.A04     // Catch:{ all -> 0x00e4 }
            X.3T1 r1 = X.C36421kH.A0R(r0, r6)     // Catch:{ all -> 0x00e4 }
            boolean r0 = r1 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00b6
            r0 = r1
            X.2bU r0 = (X.AnonymousClass2bU) r0     // Catch:{ all -> 0x00e4 }
            X.3Qj r0 = X.AnonymousClass2bU.A00(r0)     // Catch:{ all -> 0x00e4 }
            r0.A0R = r14     // Catch:{ all -> 0x00e4 }
            X.177 r15 = r11.A02     // Catch:{ all -> 0x00e4 }
            X.3Qa r0 = r1.A1J     // Catch:{ all -> 0x00e4 }
            r15.A01(r1, r0)     // Catch:{ all -> 0x00e4 }
            X.1DG r0 = r11.A01     // Catch:{ all -> 0x00e4 }
            r0.A02(r1)     // Catch:{ all -> 0x00e4 }
        L_0x00b6:
            java.lang.String r15 = "message_streaming_sidecar"
            java.lang.String r1 = "message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x00e4 }
            X.C36351kA.A1V(r0, r14, r6)     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = "deleteStreamingSidecarOlderThan/DELETE_MESSAGE_STREAMING_SIDECAR_BY_MESSAGE_ID"
            int r0 = r13.A03(r15, r1, r6, r0)     // Catch:{ all -> 0x00e4 }
            int r8 = r8 + r0
            goto L_0x008b
        L_0x00c7:
            r17.A00()     // Catch:{ all -> 0x00e4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan deleting rows:"
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ all -> 0x00e4 }
            r9.close()     // Catch:{ all -> 0x00f0 }
            r17.close()     // Catch:{ all -> 0x00fa }
            r4.close()     // Catch:{ Exception -> 0x0104 }
            int r18 = r18 + -1
            if (r16 == 0) goto L_0x010a
            if (r18 <= 0) goto L_0x010a
            goto L_0x0053
        L_0x00e4:
            r1 = move-exception
            if (r9 == 0) goto L_0x00ef
            r9.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00ef:
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00fa }
        L_0x00f9:
            throw r1     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0104 }
        L_0x0103:
            throw r1     // Catch:{ Exception -> 0x0104 }
        L_0x0104:
            r1 = move-exception
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x010a:
            X.1Xm r9 = r5.A04
            X.0wo r0 = r9.A00
            long r2 = X.C19970wo.A00(r0)
            r0 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r2 = r2 - r0
        L_0x0118:
            X.12P r0 = r9.A02     // Catch:{ Exception -> 0x01f1 }
            X.1M0 r7 = r0.A05()     // Catch:{ Exception -> 0x01f1 }
            X.71s r15 = r7.B1k()     // Catch:{ all -> 0x01e7 }
            r0 = 200(0xc8, float:2.8E-43)
            X.14e r10 = r7.A02     // Catch:{ all -> 0x01dd }
            java.lang.String[] r4 = X.C36441kJ.A1S()     // Catch:{ all -> 0x01dd }
            X.C36341k9.A1W(r4, r2)     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01dd }
            r0 = 1
            r4[r0] = r1     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE insert_timestamp < ? LIMIT ?"
            java.lang.String r0 = "GET_MMS_THUMBNAIL_METADATA_MESSAGE_ROW_ID_OLDER_THAN_SQL"
            android.database.Cursor r6 = r10.A09(r1, r0, r4)     // Catch:{ all -> 0x01dd }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "message_row_id"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d1 }
        L_0x0146:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x0150
            X.C36351kA.A17(r6, r4, r1)     // Catch:{ all -> 0x01d1 }
            goto L_0x0146
        L_0x0150:
            r6.close()     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan num messages to update:"
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            int r0 = r4.size()     // Catch:{ all -> 0x01dd }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ all -> 0x01dd }
            int r0 = r4.size()     // Catch:{ all -> 0x01dd }
            boolean r14 = X.AnonymousClass000.A1R(r0)
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x01dd }
            r8 = 0
        L_0x0170:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x01dd }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01dd }
            long r0 = r0.longValue()     // Catch:{ all -> 0x01dd }
            X.1A1 r11 = r9.A03     // Catch:{ all -> 0x01dd }
            X.3T1 r6 = X.C36421kH.A0R(r11, r0)     // Catch:{ all -> 0x01dd }
            if (r6 == 0) goto L_0x01a5
            X.1A4 r12 = r9.A01     // Catch:{ all -> 0x01dd }
            X.3Qa r4 = r6.A1J     // Catch:{ all -> 0x01dd }
            X.11F r4 = r4.A00     // Catch:{ all -> 0x01dd }
            java.util.Map r12 = r12.A02     // Catch:{ all -> 0x01dd }
            java.lang.Object r4 = r12.get(r4)     // Catch:{ all -> 0x01dd }
            if (r4 != 0) goto L_0x0170
            r4 = 0
            java.lang.Object r4 = r12.get(r4)     // Catch:{ all -> 0x01dd }
            if (r4 != 0) goto L_0x0170
            r4 = 0
            r6.A12(r4)     // Catch:{ all -> 0x01dd }
            r4 = -1
            r11.A05(r6, r4)     // Catch:{ all -> 0x01dd }
        L_0x01a5:
            java.lang.String[] r6 = X.C36441kJ.A1R()     // Catch:{ all -> 0x01dd }
            X.C36341k9.A1W(r6, r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r4 = "mms_thumbnail_metadata"
            java.lang.String r1 = "message_row_id = ?"
            java.lang.String r0 = "deleteMmsThumbnailMetadataOlderThan/DELETE_MMS_THUMBNAIL_METADATA_BY_MESSAGE_ID"
            int r0 = r10.A03(r4, r1, r0, r6)     // Catch:{ all -> 0x01dd }
            int r8 = r8 + r0
            goto L_0x0170
        L_0x01b8:
            r15.A00()     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan deleting rows:"
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ all -> 0x01dd }
            if (r8 != 0) goto L_0x01c7
            r14 = 0
        L_0x01c7:
            r15.close()     // Catch:{ all -> 0x01e7 }
            r7.close()     // Catch:{ Exception -> 0x01f1 }
            if (r14 == 0) goto L_0x01f7
            goto L_0x0118
        L_0x01d1:
            r1 = move-exception
            if (r6 == 0) goto L_0x01dc
            r6.close()     // Catch:{ all -> 0x01d8 }
            goto L_0x01dc
        L_0x01d8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01dd }
        L_0x01dc:
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e7 }
        L_0x01e6:
            throw r1     // Catch:{ all -> 0x01e7 }
        L_0x01e7:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01ec }
            goto L_0x01f0
        L_0x01ec:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x01f1 }
        L_0x01f0:
            throw r1     // Catch:{ Exception -> 0x01f1 }
        L_0x01f1:
            r1 = move-exception
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01f7:
            X.1Jd r9 = r5.A09
            java.lang.String r0 = "MessageAddOnManager/deleteOldOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wo r8 = r9.A04
            long r0 = X.C19970wo.A00(r8)
            int r2 = r9.A00
            long r6 = (long) r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 * r2
            long r0 = r0 - r6
            X.1Jj r2 = r9.A0E
            X.12P r2 = r2.A02
            X.1M0 r10 = r2.A05()
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x04f2 }
            r2 = 0
            X.C36351kA.A1V(r4, r2, r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = "message_add_on_orphan.timestamp < ?"
            X.14e r2 = r10.A02     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = "message_add_on_orphan"
            java.lang.String r0 = "MessageAddOnOrphanStore/deleteOrphanMessageAddOnsOlderThan"
            r2.A03(r1, r3, r0, r4)     // Catch:{ all -> 0x04f2 }
            r10.close()
            X.1Xd r4 = r5.A01
            java.lang.String r0 = "EditMessageManager/deleteOldOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wo r0 = r4.A04
            long r0 = X.C19970wo.A00(r0)
            int r2 = r4.A00
            long r6 = (long) r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 * r2
            long r0 = r0 - r6
            X.1SR r2 = r4.A0B
            X.12P r2 = r2.A0J
            X.1M0 r10 = r2.A05()
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x04f2 }
            r2 = 0
            X.C36351kA.A1V(r4, r2, r0)     // Catch:{ all -> 0x04f2 }
            X.14e r3 = r10.A02     // Catch:{ all -> 0x04f2 }
            java.lang.String r2 = "message_orphaned_edit"
            java.lang.String r1 = "message_orphaned_edit.timestamp < ?"
            java.lang.String r0 = "EditMessageStore/deleteOrphanEditMessageOlderThan"
            r3.A03(r2, r1, r0, r4)     // Catch:{ all -> 0x04f2 }
            r10.close()
            X.36k r4 = r5.A0B
            java.lang.String r0 = "MessageOrphanResolverManager/deleteOldOrphanedMessages"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r1 = r4.A02
            r0 = 987(0x3db, float:1.383E-42)
            int r0 = r1.A07(r0)
            X.0wo r10 = r4.A00
            long r11 = X.C19970wo.A00(r10)
            long r2 = (long) r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            long r11 = r11 - r2
            X.1Ft r0 = r4.A01
            X.12P r4 = r0.A01
            X.1M0 r7 = r4.A05()
            java.lang.String[] r3 = X.C36341k9.A1b(r11)     // Catch:{ all -> 0x04eb }
            java.lang.String r2 = "message_orphan.timestamp < ?"
            X.14e r1 = r7.A02     // Catch:{ all -> 0x04eb }
            java.lang.String r6 = "message_orphan"
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessagesOlderThan"
            r1.A03(r6, r2, r0, r3)     // Catch:{ all -> 0x04eb }
            r7.close()
            X.0yC r1 = r5.A0D
            r0 = 7935(0x1eff, float:1.112E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r0 = "MessageOrphanResolverManager/deleteOrphanMessagesWithNoMessageOrphanReason"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r2 = X.C19970wo.A00(r10)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            X.1M0 r4 = r4.A05()
            java.lang.String[] r3 = X.C36341k9.A1b(r2)     // Catch:{ all -> 0x02b9 }
            java.lang.String r2 = "message_orphan.orphan_message_reason = 1 AND message_orphan.timestamp < ?"
            X.14e r1 = r4.A02     // Catch:{ all -> 0x02b9 }
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessagesWithNoMessageOrphanReason"
            r1.A03(r6, r2, r0, r3)     // Catch:{ all -> 0x02b9 }
            goto L_0x02c0
        L_0x02b9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            r1 = move-exception
            X.C05600Qi.A00(r4, r0)
            throw r1
        L_0x02c0:
            r4.close()
        L_0x02c3:
            java.lang.String r0 = "MessageAddOnManager/messageAddOnCleanUp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = X.C19970wo.A00(r8)
            r2 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r0 = r0 - r2
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.1Jr r2 = r9.A0F
            X.12P r2 = r2.A02
            X.1M0 r4 = r2.get()
            r2 = 0
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x04e6 }
            X.14e r10 = r4.A02     // Catch:{ all -> 0x04e6 }
            java.lang.String r7 = "SELECT message_add_on_row_id FROM message_add_on_pin_in_chat WHERE pin_in_chat_state = 0"
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = "SELECT_PIN_IN_CHAT_ROW_IDS_FOR_UNPINS"
            android.database.Cursor r7 = r10.A09(r7, r2, r3)     // Catch:{ all -> 0x04e6 }
            java.lang.String r12 = "message_add_on_row_id"
            int r3 = r7.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x04df }
        L_0x02f5:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x04df }
            if (r2 == 0) goto L_0x02ff
            X.C36351kA.A17(r7, r11, r3)     // Catch:{ all -> 0x04df }
            goto L_0x02f5
        L_0x02ff:
            r7.close()     // Catch:{ all -> 0x04e6 }
            r4.close()
            r6.addAll(r11)
            X.1Jp r2 = r9.A0H
            X.1Jq r2 = r2.A02
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            X.12P r2 = r2.A00
            X.1M0 r10 = r2.get()
            X.14e r11 = r10.A02     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = "SELECT message_add_on_row_id FROM message_add_on_reaction WHERE reaction = ''"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x04f2 }
            java.lang.String r2 = "SELECT_REACTION_ROW_IDS_FOR_EMPTY_REACTIONS"
            android.database.Cursor r4 = r11.A09(r4, r2, r3)     // Catch:{ all -> 0x04f2 }
            int r3 = r4.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x04d3 }
        L_0x0327:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x04d3 }
            if (r2 == 0) goto L_0x0331
            X.C36351kA.A17(r4, r7, r3)     // Catch:{ all -> 0x04d3 }
            goto L_0x0327
        L_0x0331:
            r4.close()     // Catch:{ all -> 0x04f2 }
            r10.close()
            r6.addAll(r7)
            X.1Jw r2 = r9.A0D
            X.1LN r2 = r2.A08
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            X.12P r2 = r2.A00
            X.1M0 r10 = r2.get()
            X.14e r7 = r10.A02     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = "SELECT message_add_on_row_id FROM message_add_on_keep_in_chat WHERE keep_in_chat_state = 0"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x04f2 }
            java.lang.String r2 = "SELECT_KEEP_IN_CHAT_ROW_IDS_FOR_UNKEEPS"
            android.database.Cursor r4 = r7.A09(r4, r2, r3)     // Catch:{ all -> 0x04f2 }
            int r3 = r4.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x04d3 }
        L_0x0359:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x04d3 }
            if (r2 == 0) goto L_0x0363
            X.C36351kA.A17(r4, r11, r3)     // Catch:{ all -> 0x04d3 }
            goto L_0x0359
        L_0x0363:
            r4.close()     // Catch:{ all -> 0x04f2 }
            r10.close()
            r6.addAll(r11)
            X.0x8 r11 = r9.A0I
            long r2 = X.C19970wo.A00(r8)
            int r4 = r6.size()
            java.lang.String[] r10 = new java.lang.String[r4]
            java.util.Iterator r9 = r6.iterator()
            r8 = 0
        L_0x037d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x038e
            long r6 = X.C36391kE.A0D(r9)
            int r4 = r8 + 1
            X.C36351kA.A1V(r10, r8, r6)
            r8 = r4
            goto L_0x037d
        L_0x038e:
            r4 = 975(0x3cf, float:1.366E-42)
            X.72Z r7 = new X.72Z
            r7.<init>(r10, r4)
            X.12P r4 = r11.A03
            X.1M0 r4 = r4.A05()
            r6 = 1
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x04e6 }
            r8.<init>(r6)     // Catch:{ all -> 0x04e6 }
            java.lang.String r6 = "expiry_timestamp"
            X.C36341k9.A0p(r8, r6, r2)     // Catch:{ all -> 0x04e6 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x04e6 }
        L_0x03aa:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x04e6 }
            if (r2 == 0) goto L_0x03e1
            java.lang.Object r12 = r6.next()     // Catch:{ all -> 0x04e6 }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x04e6 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = "_id IN "
            r3.append(r2)     // Catch:{ all -> 0x04e6 }
            int r2 = r12.length     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = X.AnonymousClass1M2.A00(r2)     // Catch:{ all -> 0x04e6 }
            r3.append(r2)     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = " AND "
            r3.append(r2)     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = "timestamp"
            r3.append(r2)     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = " < "
            java.lang.String r10 = X.C36381kD.A0z(r2, r3, r0)     // Catch:{ all -> 0x04e6 }
            X.14e r7 = r4.A02     // Catch:{ all -> 0x04e6 }
            java.lang.String r9 = "message_add_on"
            java.lang.String r11 = "MessageAddOnStore/updateExpiryToNowForAddOnRowIds"
            r7.A01(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x04e6 }
            goto L_0x03aa
        L_0x03e1:
            r4.close()
            X.1QH r0 = r5.A02
            r0.A01()
            X.17y r4 = r5.A06
            long r2 = X.C19970wo.A00(r19)
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r2 = r2 - r0
            java.lang.String[] r6 = X.C36441kJ.A1R()
            X.C36341k9.A1W(r6, r2)
            X.12P r0 = r4.A01
            X.1M0 r4 = r0.A05()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = "group_past_participant_user"
            java.lang.String r1 = "timestamp < ? "
            java.lang.String r0 = "deletePastParticipantsBeforeTimestamp/DELETE_PAST_PARTICIPANT_USER"
            r3.A03(r2, r1, r0, r6)     // Catch:{ all -> 0x04e6 }
            r4.close()
            X.1TA r1 = r5.A0A
            java.lang.String r0 = "SharedMediaIdsStore/deleteOutdatedRecords"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DD r0 = r1.A00
            X.1M0 r8 = r0.A04()
            X.14e r7 = r8.A02     // Catch:{ all -> 0x04ce }
            java.lang.String r6 = "shared_media_ids"
            java.lang.String r4 = "expiration_timestamp <?"
            java.lang.String[] r3 = X.C36441kJ.A1R()     // Catch:{ all -> 0x04ce }
            r2 = 0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04ce }
            X.C36351kA.A1V(r3, r2, r0)     // Catch:{ all -> 0x04ce }
            java.lang.String r0 = "deleteOutdatedRecords/DELETE_OUTDATED_SHARED_MEDIA"
            r7.A03(r6, r4, r0, r3)     // Catch:{ all -> 0x04ce }
            r8.close()
            X.3hb r6 = r5.A0C
            X.19g r0 = r6.A01
            java.util.ArrayList r1 = r0.A0A()
            int r0 = r1.size()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x044c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x045e
            java.lang.Object r0 = r1.next()
            X.3SB r0 = (X.AnonymousClass3SB) r0
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            r8.add(r0)
            goto L_0x044c
        L_0x045e:
            X.1AI r7 = r6.A02
            X.C18740tg.A00()
            java.util.HashSet r5 = X.C36441kJ.A16()
            X.18P r0 = r7.A00
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x04e6 }
            java.lang.String r2 = "SELECT DISTINCT device_id FROM peer_messages"
            r1 = 0
            java.lang.String r0 = "PeerMessagesTable.SELECT_ALL_RECIPIENTS"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x04e6 }
        L_0x0478:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x04c2 }
            if (r0 == 0) goto L_0x048e
            java.lang.String r0 = "device_id"
            java.lang.String r0 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x04c2 }
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ all -> 0x04c2 }
            if (r0 == 0) goto L_0x0478
            r5.add(r0)     // Catch:{ all -> 0x04c2 }
            goto L_0x0478
        L_0x048e:
            r2.close()     // Catch:{ all -> 0x04e6 }
            r4.close()
            r5.removeAll(r8)
            java.util.Iterator r1 = r5.iterator()
        L_0x049b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04ab
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            r7.A06(r0)
            goto L_0x049b
        L_0x04ab:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x04c1
            X.0wN r3 = r6.A00
            int r0 = r5.size()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "orphan-peer-messages"
            r3.A0E(r0, r2, r1)
        L_0x04c1:
            return
        L_0x04c2:
            r1 = move-exception
            if (r2 == 0) goto L_0x04cd
            r2.close()     // Catch:{ all -> 0x04c9 }
            goto L_0x04cd
        L_0x04c9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04e6 }
        L_0x04cd:
            throw r1     // Catch:{ all -> 0x04e6 }
        L_0x04ce:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x04f7 }
            throw r1
        L_0x04d3:
            r1 = move-exception
            if (r4 == 0) goto L_0x04de
            r4.close()     // Catch:{ all -> 0x04da }
            goto L_0x04de
        L_0x04da:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04f2 }
        L_0x04de:
            throw r1     // Catch:{ all -> 0x04f2 }
        L_0x04df:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04e1 }
        L_0x04e1:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x04e6 }
            throw r0     // Catch:{ all -> 0x04e6 }
        L_0x04e6:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x04f7 }
            throw r1
        L_0x04eb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04ed }
        L_0x04ed:
            r1 = move-exception
            X.C05600Qi.A00(r7, r0)
            throw r1
        L_0x04f2:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x04f7 }
            throw r1
        L_0x04f7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71313gZ.BV3():void");
    }

    public C71313gZ(C19970wo r1, C29571Xd r2, AnonymousClass1QH r3, AnonymousClass1FI r4, C29661Xm r5, AnonymousClass1TN r6, C233017y r7, AnonymousClass1GF r8, AnonymousClass1HT r9, C26171Jd r10, AnonymousClass1TA r11, C600836k r12, C71953hb r13, C20810yC r14) {
        this.A00 = r1;
        this.A0D = r14;
        this.A0C = r13;
        this.A08 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A0B = r12;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
    }
}
