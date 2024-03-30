package com.whatsapp.reporttoadmin.db;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass147;
import X.AnonymousClass39U;
import X.C009003v;
import X.C023509x;
import X.C02680Bk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2", f = "RtaMessagesDbRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtaMessagesDbRepo$getMessages$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C02680Bk $cancellationSignal;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public int label;
    public final /* synthetic */ AnonymousClass39U this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtaMessagesDbRepo$getMessages$2(C02680Bk r2, AnonymousClass147 r3, AnonymousClass39U r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r4;
        this.$groupJid = r3;
        this.$cancellationSignal = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        AnonymousClass39U r3 = this.this$0;
        return new RtaMessagesDbRepo$getMessages$2(this.$cancellationSignal, this.$groupJid, r3, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0182, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0183, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0186, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r8 = r18
            int r0 = r8.label
            if (r0 != 0) goto L_0x0187
            X.AnonymousClass0AN.A00(r19)
            X.39U r0 = r8.this$0
            java.util.List r0 = r0.A04
            java.util.ArrayList r7 = X.C36321k7.A0J(r0)
            java.util.Iterator r5 = r0.iterator()
            r6 = 0
            r4 = 0
        L_0x0017:
            boolean r0 = r5.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r5.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L_0x002b
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x002b:
            java.lang.String[] r1 = X.C36441kJ.A1S()
            r1[r6] = r0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.util.List r0 = X.C36341k9.A0m(r0, r1, r3)
            r7.add(r0)
            r4 = r2
            goto L_0x0017
        L_0x003e:
            java.util.List[] r0 = new java.util.List[r6]
            java.lang.Object[] r2 = r7.toArray(r0)
            r0 = 487(0x1e7, float:6.82E-43)
            X.72Z r1 = new X.72Z
            r1.<init>(r2, r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.39U r0 = r8.this$0
            long r16 = android.os.SystemClock.uptimeMillis()
            X.12P r0 = r0.A03
            X.1M0 r7 = r0.get()
            X.39U r9 = r8.this$0
            X.147 r4 = r8.$groupJid
            X.0Bk r3 = r8.$cancellationSignal
            java.util.Iterator r15 = r1.iterator()     // Catch:{ all -> 0x0180 }
        L_0x0065:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0159
            java.lang.Object r11 = r15.next()     // Catch:{ all -> 0x0180 }
            java.util.List[] r11 = (java.util.List[]) r11     // Catch:{ all -> 0x0180 }
            X.AnonymousClass00C.A0B(r11)     // Catch:{ all -> 0x0180 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0180 }
            int r1 = r11.length     // Catch:{ all -> 0x0180 }
            r2 = 0
        L_0x007a:
            if (r2 >= r1) goto L_0x0087
            r0 = r11[r2]     // Catch:{ all -> 0x0180 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x0180 }
            X.AnonymousClass03Y.A0B(r0, r10)     // Catch:{ all -> 0x0180 }
            int r2 = r2 + 1
            goto L_0x007a
        L_0x0087:
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0180 }
            java.lang.Object[] r10 = r10.toArray(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0180 }
            X.163 r0 = r9.A01     // Catch:{ all -> 0x0180 }
            X.C36331k8.A19(r0, r4, r2, r6)     // Catch:{ all -> 0x0180 }
            java.lang.Object[] r10 = X.AnonymousClass02Q.A06(r10, r2)     // Catch:{ all -> 0x0180 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = X.AnonymousClass2xD.A0N     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "( values  (\""
            r13.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "MESSAGE_KEY_ID"
            r13.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "\", \""
            r13.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "MESSAGE_INDEX"
            r13.append(r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "\"),"
            r13.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "(?,?)"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x0180 }
            r13.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r11 = ")"
            java.lang.String r13 = X.AnonymousClass000.A0q(r11, r13)     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "SELECT DISTINCT "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = X.C56842wy.A01     // Catch:{ all -> 0x0180 }
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r13)     // Catch:{ all -> 0x0180 }
            java.lang.String r13 = " LEFT JOIN "
            r1.append(r13)     // Catch:{ all -> 0x0180 }
            java.lang.String r14 = "message_edit_info"
            r1.append(r14)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " ON "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " = "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r14)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "original_key_id"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r13)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "available_message_view"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " ON ("
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "available_message_view.key_id = "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " OR "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "available_message_view._id = message_row_id"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            X.C36381kD.A1O(r1, r11)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "chat_row_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "message_type NOT IN ('8', '10', '7', '15', '19', '64')"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " ASC"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0180 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0180 }
            X.14e r1 = r7.A02     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "GET_ALL_REPORTED_TO_ADMIN_MESSAGES_FOR_JID_START_SQL"
            X.1lC r0 = r1.A0B(r3, r2, r0, r10)     // Catch:{ all -> 0x0180 }
            r5.add(r0)     // Catch:{ all -> 0x0180 }
            goto L_0x0065
        L_0x0159:
            r4 = 0
            r7.close()
            X.39U r0 = r8.this$0
            X.12g r3 = r0.A02
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r16
            java.lang.String r0 = "ReportToAdminStore/getReportedMessagesForJid"
            r3.A01(r0, r1)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x017f
            android.database.Cursor[] r0 = new android.database.Cursor[r6]
            java.lang.Object[] r0 = r5.toArray(r0)
            android.database.Cursor[] r0 = (android.database.Cursor[]) r0
            android.database.MergeCursor r4 = new android.database.MergeCursor
            r4.<init>(r0)
        L_0x017f:
            return r4
        L_0x0180:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        L_0x0187:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtaMessagesDbRepo$getMessages$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
