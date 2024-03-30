package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass12P;
import X.AnonymousClass163;
import X.AnonymousClass17X;
import X.AnonymousClass1A1;
import X.AnonymousClass1EH;
import X.AnonymousClass1FD;
import X.AnonymousClass1M0;
import X.AnonymousClass2bU;
import X.AnonymousClass34T;
import X.AnonymousClass3B8;
import X.AnonymousClass3DA;
import X.C07700Yy;
import X.C128076At;
import X.C1495671s;
import X.C17880sD;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C19550w8;
import X.C19700wN;
import X.C20310xM;
import X.C220412q;
import X.C224014d;
import X.C224114e;
import X.C224214g;
import X.C24381Cf;
import X.C25271Fq;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C56892xB;
import X.C64413Nw;
import X.C65073Qp;
import X.C65503Si;
import X.C71923hY;
import X.C71933hZ;
import X.C99424tL;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConversationDeleteWorker extends Worker {
    public static final ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static final AtomicInteger A0C = new AtomicInteger();
    public static final AtomicInteger A0D = new AtomicInteger();
    public static final AtomicInteger A0E = new AtomicInteger();
    public static final AtomicLong A0F = new AtomicLong();
    public final Context A00;
    public final C19700wN A01;
    public final AnonymousClass1FD A02;
    public final C25271Fq A03;
    public final C18820ts A04;
    public final AnonymousClass163 A05;
    public final C220412q A06;
    public final C24381Cf A07;
    public final C20310xM A08;
    public final AnonymousClass17X A09;
    public final C65503Si A0A;

    public static void A00(ConversationDeleteWorker conversationDeleteWorker) {
        AtomicInteger atomicInteger = A0C;
        if (atomicInteger.get() <= 0) {
            A0E.set(0);
            A0D.set(0);
            A0F.set(0);
            atomicInteger.set(0);
            A0B.clear();
            conversationDeleteWorker.A03.A03(13, "ConversationDeleteWorker");
        }
    }

    private boolean A01(AnonymousClass3B8 r36) {
        Cursor A092;
        AnonymousClass1M0 A052;
        C1495671s B1k;
        AnonymousClass1M0 A053;
        Cursor A093;
        AnonymousClass3B8 r7 = r36;
        AnonymousClass11F r6 = r7.A07;
        try {
            C71923hY r9 = new C71923hY(this, r7);
            C65073Qp A0Z = C36351kA.A0Z(this.A06, r6);
            if (A0Z == null || A0Z.A0D <= 1 || TextUtils.isEmpty(A0Z.A0g)) {
                return this.A08.A0x(r7, r9, false);
            }
            C65503Si r10 = this.A0A;
            String rawString = r6.getRawString();
            AnonymousClass005 r3 = r10.A01.A00;
            if (rawString.equals(C36371kC.A0t(C36391kE.A0H(r3), "storage_usage_deletion_jid"))) {
                int i = C36391kE.A0H(r3).getInt("storage_usage_deletion_all_msg_cnt", 0);
                int i2 = C36391kE.A0H(r3).getInt("storage_usage_deletion_current_msg_cnt", 0);
                C64413Nw r2 = r10.A04;
                AnonymousClass3DA r0 = new AnonymousClass3DA(r9, r10);
                r0.A00(r6, i2, i);
                C20310xM r1 = r2.A01;
                r1.A0a(r6);
                return r1.A0x(r7, new C71933hZ(r7, r0, r2, i2, i), false);
            }
            C64413Nw r8 = r10.A04;
            AnonymousClass3DA r4 = new AnonymousClass3DA(r9, r10);
            C224214g r32 = new C224214g("storageUsageMsgStore/deleteMessagesForJid");
            r8.A03.A0A(r6);
            C20310xM r22 = r8.A01;
            String[] A1R = C36441kJ.A1R();
            C36341k9.A1W(A1R, r22.A0H.A08(r6));
            C224214g r92 = new C224214g("CoreMessageStore/getMessageCountForJid");
            try {
                AnonymousClass1M0 A042 = r22.A0c.get();
                try {
                    A093 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8')", "GET_CHAT_MESSAGES_COUNT_EXCLUDE_DELETED_SQL", A1R);
                    if (A093.moveToFirst()) {
                        long A072 = C36351kA.A07(A093, "count");
                        A093.close();
                        A042.close();
                        r92.A01();
                        if (A072 != 0) {
                            long j = r7.A06;
                            long j2 = r7.A01;
                            int i3 = r7.A00;
                            long j3 = r7.A04;
                            long j4 = r7.A05;
                            boolean z = r7.A0C;
                            boolean z2 = r7.A0B;
                            AnonymousClass11F r16 = r6;
                            r7 = new AnonymousClass3B8(r16, r7.A08, r7.A09, i3, j, j2, j3, j4, r7.A02, r7.A03, z, z2, r7.A0A);
                            AnonymousClass1FD r02 = r8.A02;
                            AnonymousClass11F r102 = r7.A07;
                            int A022 = r02.A02(r102);
                            r4.A00(r102, 0, A022);
                            r22.A0a(r102);
                            boolean A0x = r22.A0x(r7, new C71933hZ(r7, r4, r8, 0, A022), false);
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("storageUsageMsgStore/deleteMessagesForJid ");
                            A0u.append(r102);
                            C36321k7.A0t(r32, " success:true time spent:", A0u);
                            return A0x;
                        }
                    } else {
                        A093.close();
                        A042.close();
                        r92.A01();
                    }
                    r22.A0z(r6, (Long) null);
                    AnonymousClass1FD r022 = r8.A02;
                    AnonymousClass11F r1022 = r7.A07;
                    int A0222 = r022.A02(r1022);
                    r4.A00(r1022, 0, A0222);
                    r22.A0a(r1022);
                    boolean A0x2 = r22.A0x(r7, new C71933hZ(r7, r4, r8, 0, A0222), false);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("storageUsageMsgStore/deleteMessagesForJid ");
                    A0u2.append(r1022);
                    C36321k7.A0t(r32, " success:true time spent:", A0u2);
                    return A0x2;
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (Throwable th2) {
                r92.A01();
                throw th2;
            }
            throw th;
            throw th;
            throw th;
        } catch (IllegalStateException e) {
            Log.e("Error while deleting messages in batches, switching to old way of deleting...", e);
            int A023 = this.A02.A02(r6);
            C20310xM r72 = this.A08;
            C18740tg.A00();
            C224214g r82 = new C224214g("msgstore/deletemsgs/fallback");
            C224214g r93 = new C224214g("msgstore/deletemedia");
            HashSet A16 = C36441kJ.A16();
            try {
                AnonymousClass12P r42 = r72.A0c;
                AnonymousClass1M0 A043 = r42.get();
                try {
                    C224114e r12 = A043.A02;
                    String str = C56892xB.A03;
                    AnonymousClass163 r13 = r72.A0H;
                    A092 = r12.A09(str, "GET_MEDIA_FILE_MESSAGES_FOR_DELETE_SQL", new String[]{String.valueOf(r13.A08(r6))});
                    int columnIndexOrThrow = A092.getColumnIndexOrThrow("remove_files");
                    while (A092.moveToNext()) {
                        AnonymousClass1A1 r03 = r72.A1B;
                        AnonymousClass00C.A0D(r6, 1);
                        AnonymousClass2bU r11 = (AnonymousClass2bU) r03.A01.A02(A092, r6, true);
                        C18740tg.A06(r11);
                        boolean A032 = C224014d.A03(A092, columnIndexOrThrow);
                        String str2 = r11.A04;
                        if (str2 != null) {
                            A16.add(str2);
                        }
                        r72.A0V.A03(r11, A032, false);
                    }
                    A092.close();
                    A043.close();
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("CoreMessageStore/deletemedia ");
                    A0u3.append(r6);
                    C36321k7.A0t(r93, " timeSpent:", A0u3);
                    A052 = r42.A05();
                    B1k = A052.B1k();
                    r72.A0W.A0A(r6);
                    C224114e r122 = A052.A02;
                    String[] strArr = new String[1];
                    C36331k8.A19(r13, r6, strArr, 0);
                    C36321k7.A1T("CoreMessageStore/deletemsgs/count:", AnonymousClass000.A0u(), r122.A03("message", "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id= ?)", "deleteAllMessagesForJidInBackground/DELETE_MESSAGE", strArr));
                    AnonymousClass1EH r94 = r72.A0s;
                    try {
                        A053 = r94.A02.A05();
                        C224114e r14 = A053.A02;
                        String[] strArr2 = new String[1];
                        C36331k8.A19(r94.A00, r6, strArr2, 0);
                        int A033 = r14.A03("message_thumbnail", "message_row_id IN (SELECT _id FROM message_view WHERE chat_row_id = ?)", "deleteMessageThumbnailsFor/DELETE_MESSAGE_THUMBNAILS", strArr2);
                        StringBuilder A0u4 = AnonymousClass000.A0u();
                        A0u4.append("msgstore/deleteAllMessageThumbnailsFor-jid/");
                        A0u4.append(r6);
                        C36321k7.A1T("/", A0u4, A033);
                        A053.close();
                    } catch (SQLiteDatabaseCorruptException e2) {
                        Log.e("msgstore/deleteAllMessageThumbnailsFor-jid", e2);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    r94.A04(A16);
                    r72.A0Q.A05(r6);
                    r72.A0L.A00();
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    StringBuilder A0u5 = AnonymousClass000.A0u();
                    A0u5.append("CoreMessageStore/deletemsgs/fallback ");
                    A0u5.append(r6);
                    C36321k7.A0t(r82, " timeSpent:", A0u5);
                    A0A(r6, A023);
                    return true;
                } catch (Throwable th4) {
                    A053.close();
                    throw th4;
                }
            } catch (SQLiteDiskIOException e3) {
                r72.A0a.A00(1);
                throw e3;
            } catch (Throwable th5) {
                th.addSuppressed(th5);
            }
        } catch (Throwable th6) {
            Log.e("conversation-delete-worker/delete/exception", th6);
            throw th6;
        }
    }

    public C17880sD A05() {
        Context context = this.A00;
        String string = context.getString(R.string.f12nameremoved);
        C07700Yy A0F2 = C36421kH.A0F(context);
        A0F2.A09 = -1;
        C36361kB.A1A(A0F2);
        A0F2.A0L = "progress";
        A0F2.A0A = -1;
        A0F2.A07(100, 0, true);
        C36361kB.A1B(A0F2, string, "", false);
        Notification A052 = A0F2.A05();
        C99424tL r3 = new C99424tL();
        r3.A04(new C128076At(13, A052, C19550w8.A06() ? 1 : 0));
        return r3;
    }

    public void A07() {
        A0C.addAndGet(-1);
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        X.C36321k7.A1P("conversation-delete-worker/handle-intent invalid action=", r5, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013e, code lost:
        if (r4.A00 <= 5) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0140, code lost:
        r14.A01.A0E("ConversationDeleteWorker/Deletion failed", (java.lang.String) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014d, code lost:
        return new X.C97334ow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0153, code lost:
        return new X.C97324ov();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109385Xj A09() {
        /*
            r14 = this;
            androidx.work.WorkerParameters r4 = r14.A01
            X.6X2 r9 = r4.A01
            java.lang.String r1 = "job_id"
            java.util.Map r0 = r9.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x001d
            long r0 = X.C36431kI.A09(r1)
        L_0x0014:
            X.1FD r2 = r14.A02
            X.12P r3 = r2.A02
            X.1M0 r7 = r3.get()
            goto L_0x0020
        L_0x001d:
            r0 = -1
            goto L_0x0014
        L_0x0020:
            X.14e r8 = r7.A02     // Catch:{ all -> 0x016c }
            java.lang.String r6 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE _id= ?"
            java.lang.String[] r5 = X.C36441kJ.A1R()     // Catch:{ all -> 0x016c }
            r3 = 0
            X.C36351kA.A1V(r5, r3, r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "GET_DELETED_CHAT_JOB_BY_ID_SQL"
            android.database.Cursor r5 = r8.A09(r6, r0, r5)     // Catch:{ all -> 0x016c }
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x0154
            X.3B8 r1 = X.AnonymousClass1FD.A00(r5, r2)     // Catch:{ all -> 0x0160 }
            r5.close()     // Catch:{ all -> 0x016c }
            r7.close()
            if (r1 == 0) goto L_0x015a
            X.11F r6 = r1.A07
            java.lang.String r5 = r9.A03()
            int r0 = r5.hashCode()
            switch(r0) {
                case 893674186: goto L_0x00ba;
                case 1096596436: goto L_0x0091;
                case 1835767556: goto L_0x005c;
                default: goto L_0x0051;
            }
        L_0x0051:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation-delete-worker/handle-intent invalid action="
            X.C36321k7.A1P(r0, r5, r1)
            goto L_0x015a
        L_0x005c:
            java.lang.String r0 = "action_clear"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r14.A01(r1)
            if (r0 == 0) goto L_0x013b
            r2.A05(r1)
            X.0xM r0 = r14.A08
            r0.A10(r6, r3)
            r0.A0g(r6, r3)
            r0.A0f(r6, r3)
            X.1Cf r0 = r14.A07
            X.C18740tg.A06(r6)
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r1.next()
            X.1Ct r0 = (X.C24521Ct) r0
            r0.BUi(r6)
            goto L_0x0081
        L_0x0091:
            java.lang.String r0 = "action_delete"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r14.A01(r1)
            if (r0 == 0) goto L_0x013b
            X.12q r0 = r14.A06
            boolean r0 = r0.A0R(r6)
            if (r0 == 0) goto L_0x015a
            r2.A05(r1)
            boolean r0 = r6 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x0130
            X.17X r10 = r14.A09
            r8 = r6
            X.144 r8 = (X.AnonymousClass144) r8
            X.12P r0 = r10.A06
            X.1M0 r13 = r0.A05()
            goto L_0x00cd
        L_0x00ba:
            java.lang.String r0 = "action_singular_delete"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r14.A01(r1)
            if (r0 == 0) goto L_0x013b
            r2.A05(r1)
            goto L_0x015a
        L_0x00cd:
            X.71s r12 = r13.B1k()     // Catch:{ all -> 0x0128 }
            X.17r r11 = r10.A07     // Catch:{ all -> 0x011e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "participant-user-store/updateGroupParticipants/deleteParticipants/"
            X.C36321k7.A1K(r8, r0, r1)     // Catch:{ all -> 0x011e }
            X.12P r0 = r11.A06     // Catch:{ all -> 0x011e }
            X.1M0 r9 = r0.A05()     // Catch:{ all -> 0x011e }
            X.14e r7 = r9.A02     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = "group_participant_user"
            java.lang.String r4 = "group_jid_row_id = ?"
            java.lang.String[] r3 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0114 }
            r2 = 0
            X.12j r0 = r11.A05     // Catch:{ all -> 0x0114 }
            long r0 = r0.A07(r8)     // Catch:{ all -> 0x0114 }
            X.C36351kA.A1V(r3, r2, r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "deleteParticipants/DELETE_GROUP_PARTICIPANT_USER"
            r7.A03(r5, r4, r0, r3)     // Catch:{ all -> 0x0114 }
            r9.close()     // Catch:{ all -> 0x011e }
            X.17y r2 = r10.A08     // Catch:{ all -> 0x011e }
            X.0yC r1 = r2.A02     // Catch:{ all -> 0x011e }
            r0 = 1613(0x64d, float:2.26E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x010d
            r2.A02(r8)     // Catch:{ all -> 0x011e }
        L_0x010d:
            r12.A00()     // Catch:{ all -> 0x011e }
            r12.close()     // Catch:{ all -> 0x0128 }
            goto L_0x012d
        L_0x0114:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0119 }
            goto L_0x011d
        L_0x0119:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x011e }
        L_0x011d:
            throw r1     // Catch:{ all -> 0x011e }
        L_0x011e:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0123 }
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0128 }
        L_0x0127:
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0171 }
            throw r1
        L_0x012d:
            r13.close()
        L_0x0130:
            X.163 r0 = r14.A05
            r0.A0I(r6)
            X.1Cf r0 = r14.A07
            r0.A03(r6)
            goto L_0x015a
        L_0x013b:
            int r1 = r4.A00
            r0 = 5
            if (r1 <= r0) goto L_0x014e
            X.0wN r2 = r14.A01
            r1 = 0
            java.lang.String r0 = "ConversationDeleteWorker/Deletion failed"
            r2.A0E(r0, r1, r3)
            X.4ow r0 = new X.4ow
            r0.<init>()
            return r0
        L_0x014e:
            X.4ov r0 = new X.4ov
            r0.<init>()
            return r0
        L_0x0154:
            r5.close()     // Catch:{ all -> 0x016c }
            r7.close()
        L_0x015a:
            X.4ox r0 = new X.4ox
            r0.<init>()
            return r0
        L_0x0160:
            r1 = move-exception
            if (r5 == 0) goto L_0x016b
            r5.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016c }
        L_0x016b:
            throw r1     // Catch:{ all -> 0x016c }
        L_0x016c:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0171 }
            throw r1
        L_0x0171:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.ConversationDeleteWorker.A09():X.5Xj");
    }

    public void A0A(AnonymousClass11F r11, int i) {
        int A022;
        AnonymousClass34T r2 = (AnonymousClass34T) A0B.get(r11);
        synchronized (r2) {
            int i2 = r2.A00;
            A022 = AnonymousClass001.A02(i, i2, 0);
            r2.A00 = i2 + A022;
            r2.A01 -= A022;
        }
        AtomicInteger atomicInteger = A0E;
        atomicInteger.addAndGet(A022);
        AtomicInteger atomicInteger2 = A0D;
        if (atomicInteger2.get() == 0 || atomicInteger.get() > atomicInteger2.get()) {
            Log.w("conversation-delete-worker/delete-progress/totalMessagesAllJids not updated.");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = A0F;
        if (uptimeMillis - atomicLong.get() >= 250) {
            atomicLong.set(uptimeMillis);
            int i3 = (atomicInteger.get() * 100) / atomicInteger2.get();
            Context context = this.A00;
            String string = context.getString(R.string.f12nameremoved);
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, atomicInteger.get(), 0);
            AnonymousClass000.A1L(A1Q, atomicInteger2.get(), 1);
            C36371kC.A1M(this.A04, A1Q, i3, 2);
            String string2 = context.getString(R.string.f12nameremoved, A1Q);
            C07700Yy A0F2 = C36421kH.A0F(context);
            A0F2.A09 = -1;
            C36361kB.A1A(A0F2);
            A0F2.A0L = "progress";
            A0F2.A0A = -1;
            A0F2.A07(100, i3, false);
            C36361kB.A1B(A0F2, string, string2, false);
            this.A03.A02(13, A0F2.A05());
        }
    }

    public ConversationDeleteWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = context;
        this.A05 = (AnonymousClass163) A0P.A1k.get();
        this.A01 = A0P.B3m();
        this.A06 = C36351kA.A0a(A0P);
        this.A04 = A0P.BxU();
        this.A08 = C36371kC.A0Z(A0P);
        this.A02 = (AnonymousClass1FD) A0P.A2h.get();
        this.A0A = (C65503Si) A0P.AfI.A00.A44.get();
        this.A07 = C36371kC.A0Y(A0P);
        this.A03 = C36391kE.A0d(A0P);
        this.A09 = C36351kA.A0b(A0P);
    }
}
