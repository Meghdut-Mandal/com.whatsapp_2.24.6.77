package X;

/* renamed from: X.3d7  reason: invalid class name and case insensitive filesystem */
public class C69183d7 implements AnonymousClass4PB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3S1 A01;
    public final /* synthetic */ Long A02;

    public C69183d7(AnonymousClass3S1 r1, Long l, int i) {
        this.A01 = r1;
        this.A02 = l;
        this.A00 = i;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0054=Splitter:B:20:0x0054, B:8:0x002a=Splitter:B:8:0x002a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            X.3S1 r0 = r11.A01
            X.1DF r4 = r0.A02
            java.util.HashSet r10 = r0.A03()
            java.lang.Long r8 = r11.A02
            int r0 = r11.A00
            long r1 = (long) r0
            X.12P r0 = r4.A08
            X.1M0 r3 = r0.get()
            X.0yC r4 = r4.A0A     // Catch:{ all -> 0x00fc }
            r0 = 6261(0x1875, float:8.774E-42)
            boolean r0 = r4.A0E(r0)     // Catch:{ all -> 0x00fc }
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0049
            int r4 = r10.size()     // Catch:{ all -> 0x00fc }
            boolean r7 = X.AnonymousClass000.A1V(r12)
            if (r8 != 0) goto L_0x002a
            r9 = 0
        L_0x002a:
            X.3ku r0 = X.C74003ku.$redex_init_class     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "SELECT file_path, message_row_id FROM message_media as msg_media JOIN available_message_view AS message JOIN chat_view AS chat WHERE message._id = msg_media.message_row_id AND message.chat_row_id = chat._id AND "
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "message_type IN "
            X.C36351kA.A1O(r0, r5, r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x0044
            java.lang.String r0 = " AND message_row_id < ? "
        L_0x0040:
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x0046
        L_0x0044:
            r0 = r4
            goto L_0x0040
        L_0x0046:
            if (r9 == 0) goto L_0x008f
            goto L_0x008d
        L_0x0049:
            int r4 = r10.size()     // Catch:{ all -> 0x00fc }
            boolean r7 = X.AnonymousClass000.A1V(r12)
            if (r8 != 0) goto L_0x0054
            r9 = 0
        L_0x0054:
            X.3ku r0 = X.C74003ku.$redex_init_class     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "SELECT file_path, message_row_id FROM message_media as msg_media JOIN available_message_view AS message ON message._id = msg_media.message_row_id JOIN chat_view AS chat ON message.chat_row_id = chat._id WHERE "
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "message_type IN "
            X.C36351kA.A1O(r0, r5, r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x006e
            java.lang.String r0 = " AND message_row_id < ? "
        L_0x006a:
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x0070
        L_0x006e:
            r0 = r4
            goto L_0x006a
        L_0x0070:
            if (r9 == 0) goto L_0x0074
            java.lang.String r4 = " AND message_row_id > ? "
        L_0x0074:
            r5.append(r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = " AND (message.from_me = 1 OR chat.group_type != 4)"
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = " ORDER BY "
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "message_row_id"
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = " DESC LIMIT ?"
            java.lang.String r4 = X.AnonymousClass000.A0q(r0, r5)     // Catch:{ all -> 0x00fc }
            goto L_0x00a7
        L_0x008d:
            java.lang.String r4 = " AND message_row_id > ? "
        L_0x008f:
            r5.append(r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = " AND (message.from_me = 1 OR chat.group_type != 4)"
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = " ORDER BY "
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "message_row_id"
            r5.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = " DESC LIMIT ?"
            java.lang.String r4 = X.AnonymousClass000.A0q(r0, r5)     // Catch:{ all -> 0x00fc }
        L_0x00a7:
            java.util.ArrayList r5 = X.C36401kF.A0v(r10)     // Catch:{ all -> 0x00fc }
            java.util.Iterator r7 = r10.iterator()     // Catch:{ all -> 0x00fc }
        L_0x00af:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00fc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00fc }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00fc }
            r5.add(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x00af
        L_0x00c7:
            if (r12 == 0) goto L_0x00d0
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00fc }
            r5.add(r0)     // Catch:{ all -> 0x00fc }
        L_0x00d0:
            if (r8 == 0) goto L_0x00d9
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00fc }
            r5.add(r0)     // Catch:{ all -> 0x00fc }
        L_0x00d9:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fc }
            r5.add(r0)     // Catch:{ all -> 0x00fc }
            X.14e r2 = r3.A02     // Catch:{ all -> 0x00fc }
            java.lang.String[] r1 = X.C36371kC.A1b(r5, r6)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "GET_REFERENCED_MEDIA_PATHS"
            android.database.Cursor r0 = r2.A09(r4, r0, r1)     // Catch:{ all -> 0x00fc }
            r3.close()
            X.1lB r2 = new X.1lB
            r2.<init>(r0)
            X.3l2 r1 = X.C74083l2.A00
            X.3xe r0 = new X.3xe
            r0.<init>(r2, r1)
            return r0
        L_0x00fc:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0101 }
            throw r1
        L_0x0101:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69183d7.apply(java.lang.Object):java.lang.Object");
    }
}
