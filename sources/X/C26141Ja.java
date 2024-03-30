package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ja  reason: invalid class name and case insensitive filesystem */
public final class C26141Ja {
    public final C26151Jb A00;
    public final AnonymousClass163 A01;
    public final C220412q A02;
    public final C219712j A03;
    public final AnonymousClass12P A04;
    public final C26161Jc A05;
    public final AnonymousClass1GQ A06;

    public C26141Ja(C26151Jb r2, AnonymousClass163 r3, C220412q r4, C219712j r5, AnonymousClass12P r6, C26161Jc r7, AnonymousClass1GQ r8) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r7, 7);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.ContentValues r10, X.C44072La r11, X.C26141Ja r12) {
        /*
            r3 = 0
            X.12P r0 = r12.A04     // Catch:{ all -> 0x0029 }
            X.1M0 r2 = r0.A05()     // Catch:{ all -> 0x0029 }
            X.14e r4 = r2.A02     // Catch:{ all -> 0x0022 }
            java.lang.String r6 = "newsletter"
            java.lang.String r7 = "chat_row_id = ?"
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0022 }
            long r0 = r11.A02     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0022 }
            r9[r3] = r0     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "NewsletterStore/UPDATE_MEMBERSHIP_NEWSLETTER_INFO"
            r5 = r10
            r4.A01(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0022 }
            r2.close()     // Catch:{ all -> 0x0029 }
            return
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ja.A01(android.content.ContentValues, X.2La, X.1Ja):void");
    }

    public final int A02(C65073Qp r5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Long.valueOf(r5.A0W));
        contentValues.put("last_read_message_sort_id", Long.valueOf(r5.A0Q));
        contentValues.put("display_message_sort_id", Long.valueOf(r5.A0V));
        contentValues.put("last_message_sort_id", Long.valueOf(r5.A0O));
        contentValues.put("last_read_receipt_sent_message_sort_id", Long.valueOf(r5.A0S));
        contentValues.put("last_read_message_row_id", Long.valueOf(r5.A0P));
        contentValues.put("display_message_row_id", Long.valueOf(r5.A0U));
        contentValues.put("last_message_row_id", Long.valueOf(r5.A0N));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(r5.A0R));
        contentValues.put("sort_timestamp", Long.valueOf(r5.A0X));
        contentValues.put("unseen_message_count", Integer.valueOf(r5.A08));
        try {
            return this.A01.A05(contentValues, r5);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C44072La A03(java.lang.String r8) {
        /*
            r7 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r8, r4)
            r6 = 0
            X.12P r0 = r7.A04     // Catch:{ all -> 0x0036 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0036 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "SELECT * FROM newsletter JOIN chat ON chat_row_id = _id WHERE invite_code = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x002f }
            r1[r4] = r8     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_BY_CODE"
            android.database.Cursor r3 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x002f }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x002f }
            java.util.List r2 = A00(r3, r7)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ all -> 0x002f }
            r5.close()     // Catch:{ all -> 0x0036 }
            goto L_0x003c
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            X.03N r2 = new X.03N
            r2.<init>(r0)
        L_0x003c:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0047:
            X.09w r1 = X.C023409w.A00
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x004e
            r2 = r1
        L_0x004e:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r2, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.12q r0 = r7.A02
            X.3Qp r1 = r0.A09(r1, r4)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 != 0) goto L_0x0076
            r1 = r6
        L_0x0076:
            r3.add(r1)
            goto L_0x005f
        L_0x007a:
            java.lang.Object r0 = X.C007103b.A0M(r3)
            X.2La r0 = (X.C44072La) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ja.A03(java.lang.String):X.2La");
    }

    public final synchronized AnonymousClass011 A06(C28981Uw r8, String str) {
        AnonymousClass011 r2;
        AnonymousClass00C.A0D(r8, 0);
        C220412q r6 = this.A02;
        C65073Qp A09 = r6.A09(r8, false);
        if (A09 != null) {
            long j = A09.A0W;
            if (j != -1) {
                r2 = new AnonymousClass011(A09, Long.valueOf(j));
            }
        }
        r6.A0J(r8);
        long A08 = this.A01.A08(r8);
        C65073Qp r1 = new C65073Qp((AnonymousClass11F) r8);
        r1.A0W = A08;
        r1.A0h = str;
        r1.A02 = 4;
        r2 = new AnonymousClass011(r1, Long.valueOf(A08));
        return r2;
    }

    public final void A08(C28981Uw r5, int i) {
        AnonymousClass00C.A0D(r5, 0);
        C44072La r3 = (C44072La) this.A02.A09(r5, false);
        if (r3 != null) {
            r3.A01 = i;
            ContentValues contentValues = new ContentValues();
            contentValues.put("show_enforced_update_banner", Integer.valueOf(r3.A01));
            A01(contentValues, r3, this);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NewsletterStore/failed to find newsletter in chatsCache for ");
        sb.append(r5);
        Log.e(sb.toString());
        this.A00.A00(C188648zz.A03, (String) null);
    }

    public final void A09(C28981Uw r5, boolean z) {
        AnonymousClass00C.A0D(r5, 0);
        C44072La r3 = (C44072La) this.A02.A09(r5, false);
        if (r3 != null) {
            r3.A0O = z;
            ContentValues contentValues = new ContentValues();
            contentValues.put("muted", Boolean.valueOf(r3.A0O));
            A01(contentValues, r3, this);
        }
    }

    public static final List A00(Cursor cursor, C26141Ja r6) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("chat_row_id");
        if (!cursor.moveToFirst()) {
            return C023409w.A00;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            AnonymousClass11F A0A = r6.A01.A0A(cursor.getLong(columnIndexOrThrow));
            if ((A0A instanceof C28981Uw) && A0A != null) {
                arrayList.add(A0A);
            }
        } while (cursor.moveToNext());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0267, code lost:
        r6 = r1.getInt(r24);
        r3 = X.C52182p1.values();
        r5 = r3.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0273, code lost:
        if (r0 >= r5) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0275, code lost:
        r13 = r3[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x027b, code lost:
        if (r13.value != r6) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x027d, code lost:
        r88 = X.C54282sh.A00(r1, r22);
        r71 = new java.util.ArrayList();
        r89 = X.C54282sh.A00(r1, r21);
        r6 = r1.getInt(r20);
        r3 = X.C52282pB.values();
        r5 = r3.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x029a, code lost:
        if (r0 >= r5) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x029c, code lost:
        r9 = r3[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02a2, code lost:
        if (r9.value != r6) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02a4, code lost:
        r90 = X.C54282sh.A00(r1, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02ae, code lost:
        if (r1.isNull(r15) != false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02b0, code lost:
        r0 = r1.getString(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02b4, code lost:
        if (r0 == null) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02b6, code lost:
        r55 = X.C23931Ak.copyOf((java.util.Collection) X.AnonymousClass099.A0L(r0, new java.lang.String[]{","}, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02c9, code lost:
        if (r1.isNull(r12) == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02cc, code lost:
        r55 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02cf, code lost:
        r64 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02d2, code lost:
        r64 = java.lang.Long.valueOf(r1.getLong(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02da, code lost:
        r56 = r2;
        r54 = new X.C44072La(r55, r56, r57, X.C52452pS.A03, r11, r10, r14, r9, r13, r64, r65, r66, r67, r68, r69, r70, r71, r1.getInt(r17), r73, r91, r76, r78, r80, r82, r84, r86, r88, r89, r90);
        X.AnonymousClass1GQ.A01(r8.A05.A01, 3877);
        r7.add(r54);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0305, code lost:
        r2 = new java.util.NoSuchElementException("Array contains no element matching the predicate.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x030d, code lost:
        r2 = new java.util.NoSuchElementException("Array contains no element matching the predicate.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0336, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.C05600Qi.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x033a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x033d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.C05600Qi.A00(r53, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0343, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01d5 A[Catch:{ all -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01d7 A[Catch:{ all -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01e9 A[Catch:{ all -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x025f A[Catch:{ all -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0315 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04() {
        /*
            r93 = this;
            r8 = r93
            X.1GQ r1 = r8.A06
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = X.AnonymousClass1GQ.A01(r1, r0)
            if (r0 == 0) goto L_0x0353
            X.12P r0 = r8.A04     // Catch:{ all -> 0x0344 }
            X.1M0 r53 = r0.get()     // Catch:{ all -> 0x0344 }
            r0 = r53
            X.14e r3 = r0.A02     // Catch:{ all -> 0x033b }
            java.lang.String r2 = "SELECT * FROM newsletter JOIN chat ON chat_row_id = _id"
            java.lang.String r1 = "NewsletterStore/GET_NEWSLETTER_SQL"
            r0 = 0
            android.database.Cursor r1 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x033b }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x033b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0334 }
            r7.<init>()     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "_id"
            int r52 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "jid_row_id"
            int r51 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "subject"
            int r50 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "last_read_message_sort_id"
            int r49 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "display_message_sort_id"
            int r48 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "last_message_sort_id"
            int r47 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            int r46 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "last_read_message_row_id"
            int r45 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "display_message_row_id"
            int r44 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "last_message_row_id"
            int r43 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            int r42 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "sort_timestamp"
            int r41 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "unseen_message_count"
            int r40 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "group_type"
            int r39 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "created_timestamp"
            int r38 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "name"
            int r37 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "name_id"
            int r36 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "description"
            int r35 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "description_id"
            int r34 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "picture_url"
            int r33 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "picture_id"
            int r32 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "preview_url"
            int r31 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "preview_id"
            int r30 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "invite_code"
            int r29 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "handle"
            int r28 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "subscribers_count"
            int r27 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "membership"
            int r26 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "privacy"
            int r25 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "verified"
            int r24 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "verification_source"
            int r23 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "muted"
            int r22 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "oldest_message_retrieved"
            int r21 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "suspended"
            int r20 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "deleted"
            int r19 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "reaction_setting"
            int r18 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "reaction_setting_blocklist"
            int r15 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "reaction_setting_update_ts"
            int r12 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "show_enforced_update_banner"
            int r17 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = "admin_count"
            int r16 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0334 }
        L_0x0111:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x032d
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x0334 }
            X.12j r4 = r8.A03     // Catch:{ all -> 0x0334 }
            r0 = r51
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            com.whatsapp.jid.Jid r0 = r4.A09(r2)     // Catch:{ all -> 0x0334 }
            X.11F r0 = X.C222713q.A00(r0)     // Catch:{ all -> 0x0334 }
            r5 = 1
            if (r0 == 0) goto L_0x031d
            X.3Qp r2 = new X.3Qp     // Catch:{ all -> 0x0334 }
            r2.<init>((X.AnonymousClass11F) r0)     // Catch:{ all -> 0x0334 }
            r0 = r52
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0W = r3     // Catch:{ all -> 0x0334 }
            r0 = r50
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r2.A0h = r0     // Catch:{ all -> 0x0334 }
            r0 = r49
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0Q = r3     // Catch:{ all -> 0x0334 }
            r0 = r48
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0V = r3     // Catch:{ all -> 0x0334 }
            r0 = r47
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0O = r3     // Catch:{ all -> 0x0334 }
            r0 = r46
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0S = r3     // Catch:{ all -> 0x0334 }
            r0 = r45
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0P = r3     // Catch:{ all -> 0x0334 }
            r0 = r44
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0U = r3     // Catch:{ all -> 0x0334 }
            r0 = r43
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0N = r3     // Catch:{ all -> 0x0334 }
            r0 = r42
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0R = r3     // Catch:{ all -> 0x0334 }
            r0 = r41
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r2.A0X = r3     // Catch:{ all -> 0x0334 }
            r0 = r40
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            r2.A08 = r0     // Catch:{ all -> 0x0334 }
            r0 = r39
            int r3 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            r2.A02 = r3     // Catch:{ all -> 0x0334 }
            r0 = 4
            if (r3 == r0) goto L_0x019d
            r5 = 0
        L_0x019d:
            X.C18740tg.A0C(r5)     // Catch:{ all -> 0x0334 }
            r0 = r37
            java.lang.String r65 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r0 = r18
            boolean r0 = r1.isNull(r0)     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x01cb
            r0 = r18
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x01cb
            X.2pM[] r5 = X.C52392pM.values()     // Catch:{ all -> 0x0334 }
            int r4 = r5.length     // Catch:{ all -> 0x0334 }
            r3 = 0
        L_0x01c0:
            if (r3 >= r4) goto L_0x0325
            r11 = r5[r3]     // Catch:{ all -> 0x0334 }
            int r0 = r11.value     // Catch:{ all -> 0x0334 }
            if (r0 == r6) goto L_0x01cd
            int r3 = r3 + 1
            goto L_0x01c0
        L_0x01cb:
            X.2pM r11 = X.C52392pM.DEFAULT     // Catch:{ all -> 0x0334 }
        L_0x01cd:
            r0 = r23
            boolean r0 = r1.isNull(r0)     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x01d7
            r9 = 0
            goto L_0x01e1
        L_0x01d7:
            r0 = r23
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0334 }
        L_0x01e1:
            X.2pA[] r6 = X.C52272pA.values()     // Catch:{ all -> 0x0334 }
            int r5 = r6.length     // Catch:{ all -> 0x0334 }
            r4 = 0
        L_0x01e7:
            if (r4 >= r5) goto L_0x01f9
            r10 = r6[r4]     // Catch:{ all -> 0x0334 }
            int r3 = r10.value     // Catch:{ all -> 0x0334 }
            if (r9 == 0) goto L_0x01f6
            int r0 = r9.intValue()     // Catch:{ all -> 0x0334 }
            if (r3 != r0) goto L_0x01f6
            goto L_0x01fb
        L_0x01f6:
            int r4 = r4 + 1
            goto L_0x01e7
        L_0x01f9:
            X.2pA r10 = X.C52272pA.UNKNOWN_VERIFICATION_SOURCE     // Catch:{ all -> 0x0334 }
        L_0x01fb:
            r0 = r16
            int r73 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            long r3 = r2.A0W     // Catch:{ all -> 0x0334 }
            r91 = r3
            r0 = r36
            long r76 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r0 = r35
            java.lang.String r66 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r0 = r34
            long r78 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r0 = r33
            java.lang.String r67 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r0 = r32
            long r80 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r0 = r31
            java.lang.String r68 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r0 = r30
            long r82 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r0 = r38
            long r84 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r0 = r28
            java.lang.String r69 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r0 = r29
            java.lang.String r70 = r1.getString(r0)     // Catch:{ all -> 0x0334 }
            r0 = r27
            long r86 = r1.getLong(r0)     // Catch:{ all -> 0x0334 }
            r0 = r26
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            X.2pL r57 = X.C54112sQ.A00(r0)     // Catch:{ all -> 0x0334 }
            r0 = r25
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            X.2oz[] r3 = X.C52162oz.values()     // Catch:{ all -> 0x0334 }
            int r5 = r3.length     // Catch:{ all -> 0x0334 }
            r0 = 0
        L_0x025d:
            if (r0 >= r5) goto L_0x0315
            r14 = r3[r0]     // Catch:{ all -> 0x0334 }
            int r4 = r14.value     // Catch:{ all -> 0x0334 }
            int r0 = r0 + 1
            if (r4 != r6) goto L_0x025d
            r0 = r24
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            X.2p1[] r3 = X.C52182p1.values()     // Catch:{ all -> 0x0334 }
            int r5 = r3.length     // Catch:{ all -> 0x0334 }
            r0 = 0
        L_0x0273:
            if (r0 >= r5) goto L_0x030d
            r13 = r3[r0]     // Catch:{ all -> 0x0334 }
            int r4 = r13.value     // Catch:{ all -> 0x0334 }
            int r0 = r0 + 1
            if (r4 != r6) goto L_0x0273
            r0 = r22
            boolean r88 = X.C54282sh.A00(r1, r0)     // Catch:{ all -> 0x0334 }
            java.util.ArrayList r71 = new java.util.ArrayList     // Catch:{ all -> 0x0334 }
            r71.<init>()     // Catch:{ all -> 0x0334 }
            r0 = r21
            boolean r89 = X.C54282sh.A00(r1, r0)     // Catch:{ all -> 0x0334 }
            r0 = r20
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            X.2pB[] r3 = X.C52282pB.values()     // Catch:{ all -> 0x0334 }
            int r5 = r3.length     // Catch:{ all -> 0x0334 }
            r0 = 0
        L_0x029a:
            if (r0 >= r5) goto L_0x0305
            r9 = r3[r0]     // Catch:{ all -> 0x0334 }
            int r4 = r9.value     // Catch:{ all -> 0x0334 }
            int r0 = r0 + 1
            if (r4 != r6) goto L_0x029a
            r0 = r19
            boolean r90 = X.C54282sh.A00(r1, r0)     // Catch:{ all -> 0x0334 }
            boolean r0 = r1.isNull(r15)     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x02cc
            java.lang.String r0 = r1.getString(r15)     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x02cc
            java.lang.String r3 = ","
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch:{ all -> 0x0334 }
            r3 = 0
            java.util.List r0 = X.AnonymousClass099.A0L(r0, r4, r3)     // Catch:{ all -> 0x0334 }
            X.1Ak r55 = X.C23931Ak.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x0334 }
        L_0x02c5:
            boolean r0 = r1.isNull(r12)     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x02d2
            goto L_0x02cf
        L_0x02cc:
            r55 = 0
            goto L_0x02c5
        L_0x02cf:
            r64 = 0
            goto L_0x02da
        L_0x02d2:
            long r3 = r1.getLong(r12)     // Catch:{ all -> 0x0334 }
            java.lang.Long r64 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0334 }
        L_0x02da:
            r0 = r17
            int r72 = r1.getInt(r0)     // Catch:{ all -> 0x0334 }
            X.2pS r58 = X.C52452pS.DEFAULT     // Catch:{ all -> 0x0334 }
            X.2La r0 = new X.2La     // Catch:{ all -> 0x0334 }
            r54 = r0
            r56 = r2
            r59 = r11
            r60 = r10
            r61 = r14
            r62 = r9
            r63 = r13
            r74 = r91
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r76, r78, r80, r82, r84, r86, r88, r89, r90)     // Catch:{ all -> 0x0334 }
            X.1Jc r2 = r8.A05     // Catch:{ all -> 0x0334 }
            X.1GQ r3 = r2.A01     // Catch:{ all -> 0x0334 }
            r2 = 3877(0xf25, float:5.433E-42)
            X.AnonymousClass1GQ.A01(r3, r2)     // Catch:{ all -> 0x0334 }
            r7.add(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x0111
        L_0x0305:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0334 }
            r2.<init>(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x032c
        L_0x030d:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0334 }
            r2.<init>(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x032c
        L_0x0315:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0334 }
            r2.<init>(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x032c
        L_0x031d:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0334 }
            r2.<init>(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x032c
        L_0x0325:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0334 }
            r2.<init>(r0)     // Catch:{ all -> 0x0334 }
        L_0x032c:
            throw r2     // Catch:{ all -> 0x0334 }
        L_0x032d:
            r1.close()     // Catch:{ all -> 0x033b }
            r53.close()     // Catch:{ all -> 0x0344 }
            return r7
        L_0x0334:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0336 }
        L_0x0336:
            r0 = move-exception
            X.C05600Qi.A00(r1, r2)     // Catch:{ all -> 0x033b }
            throw r0     // Catch:{ all -> 0x033b }
        L_0x033b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x033d }
        L_0x033d:
            r1 = move-exception
            r0 = r53
            X.C05600Qi.A00(r0, r2)     // Catch:{ all -> 0x0344 }
            throw r1     // Catch:{ all -> 0x0344 }
        L_0x0344:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r1 = r0.exception
            if (r1 == 0) goto L_0x0353
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0353:
            X.09w r7 = X.C023409w.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ja.A04():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05() {
        /*
            r6 = this;
            X.1GQ r1 = r6.A06
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = X.AnonymousClass1GQ.A01(r1, r0)
            if (r0 == 0) goto L_0x0060
            r5 = 2
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ all -> 0x0051 }
            r1 = 0
            X.2pL r0 = X.C52382pL.ADMIN     // Catch:{ all -> 0x0051 }
            int r0 = r0.value     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r4[r1] = r0     // Catch:{ all -> 0x0051 }
            r1 = 1
            X.2pL r0 = X.C52382pL.OWNER     // Catch:{ all -> 0x0051 }
            int r0 = r0.value     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r4[r1] = r0     // Catch:{ all -> 0x0051 }
            X.12P r0 = r6.A04     // Catch:{ all -> 0x0051 }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x0051 }
            X.14e r2 = r3.A02     // Catch:{ all -> 0x004a }
            java.lang.String r1 = X.C54142sT.A00(r5)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_JID_WITH_MEMBERSHIP_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x004a }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x004a }
            java.util.List r0 = A00(r2, r6)     // Catch:{ all -> 0x0043 }
            r2.close()     // Catch:{ all -> 0x004a }
            r3.close()     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r1 = r0.exception
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "NewsletterStore/failed to fetch admin newsletter jids"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0060:
            X.09w r0 = X.C023409w.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ja.A05():java.util.List");
    }

    public final void A07(C52382pL r5, C28981Uw r6) {
        C44072La r3 = (C44072La) this.A02.A09(r6, false);
        if (r3 != null) {
            r3.A09 = r5;
            ContentValues contentValues = new ContentValues();
            contentValues.put("membership", Integer.valueOf(r3.A09.value));
            A01(contentValues, r3, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ef, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        X.C05600Qi.A00(r18, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0247, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C05600Qi.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x024b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x028c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0290, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0293, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0297, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.List r23) {
        /*
            r22 = this;
            r7 = r22
            X.12P r0 = r7.A04     // Catch:{ all -> 0x02f6 }
            r21 = r0
            X.1M0 r18 = r21.A05()     // Catch:{ all -> 0x02f6 }
            X.71s r9 = r18.B1k()     // Catch:{ all -> 0x02ed }
            java.util.Iterator r17 = r23.iterator()     // Catch:{ all -> 0x02e6 }
        L_0x0012:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r6 = r17.next()     // Catch:{ all -> 0x02e6 }
            X.2La r6 = (X.C44072La) r6     // Catch:{ all -> 0x02e6 }
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ all -> 0x02e6 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x02e6 }
            r5.<init>()     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A02     // Catch:{ all -> 0x02e6 }
            r19 = r0
            java.lang.Long r4 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "_id"
            r5.put(r0, r4)     // Catch:{ all -> 0x02e6 }
            X.12j r1 = r7.A03     // Catch:{ all -> 0x02e6 }
            X.11F r0 = r6.A06()     // Catch:{ all -> 0x02e6 }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r8 = r6.A0K     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "subject"
            r5.put(r0, r8)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0Q     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "last_read_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0V     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "display_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0O     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "last_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0S     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0P     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "last_read_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0U     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "display_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0N     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "last_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0R     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0X     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "sort_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            int r0 = r6.A08     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "unseen_message_count"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            int r0 = r6.A02     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "group_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "hidden"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A0Q     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "created_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x02e6 }
            r3.<init>()     // Catch:{ all -> 0x02e6 }
            java.lang.String r2 = "chat_row_id"
            r3.put(r2, r4)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "name"
            r3.put(r0, r8)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A04     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "name_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = r6.A0H     // Catch:{ all -> 0x02e6 }
            if (r1 != 0) goto L_0x00fc
            java.lang.String r1 = ""
        L_0x00fc:
            java.lang.String r0 = "description"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A03     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "description_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = r6.A0M     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "picture_url"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A05     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "picture_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = r6.A0L     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "preview_url"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A06     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "preview_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = r6.A0J     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "invite_code"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r1 = r6.A0I     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "handle"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            long r0 = r6.A07     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "subscribers_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.2pL r0 = r6.A09     // Catch:{ all -> 0x02e6 }
            int r0 = r0.value     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "membership"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.2oz r0 = r6.A0D     // Catch:{ all -> 0x02e6 }
            int r0 = r0.value     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "privacy"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.2p1 r0 = r6.A0F     // Catch:{ all -> 0x02e6 }
            int r0 = r0.value     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "verified"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.2pA r0 = r6.A0C     // Catch:{ all -> 0x02e6 }
            int r0 = r0.value     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "verification_source"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.2pB r0 = r6.A0E     // Catch:{ all -> 0x02e6 }
            int r0 = r0.value     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "suspended"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            boolean r1 = r6.A0O     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "muted"
            X.C54272sg.A00(r3, r0, r1)     // Catch:{ all -> 0x02e6 }
            boolean r1 = r6.A0P     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "oldest_message_retrieved"
            X.C54272sg.A00(r3, r0, r1)     // Catch:{ all -> 0x02e6 }
            boolean r1 = r6.A0N     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "deleted"
            X.C54272sg.A00(r3, r0, r1)     // Catch:{ all -> 0x02e6 }
            int r0 = r6.A01     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "show_enforced_update_banner"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.2pM r0 = r6.A0B     // Catch:{ all -> 0x02e6 }
            int r0 = r0.value     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "reaction_setting"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.1Ak r10 = r6.A08     // Catch:{ all -> 0x02e6 }
            if (r10 != 0) goto L_0x01bd
            r1 = 0
            goto L_0x01c6
        L_0x01bd:
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r1 = X.C007103b.A0Q(r1, r0, r0, r10, r8)     // Catch:{ all -> 0x02e6 }
        L_0x01c6:
            java.lang.String r0 = "reaction_setting_blocklist"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.Long r1 = r6.A0G     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "reaction_setting_update_ts"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            int r0 = r6.A00     // Catch:{ all -> 0x02e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "admin_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.1M0 r8 = r21.A05()     // Catch:{ all -> 0x02c9 }
            X.71s r10 = r8.B1k()     // Catch:{ all -> 0x02c2 }
            X.14e r12 = r8.A02     // Catch:{ all -> 0x02bb }
            java.lang.String r11 = "newsletter"
            r1 = 5
            java.lang.String r0 = "NewsletterStore/INSERT_NEWSLETTER"
            long r14 = r12.A08(r11, r0, r3, r1)     // Catch:{ all -> 0x02bb }
            r12 = 0
            r11 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0202
            X.1Jb r1 = r7.A00     // Catch:{ all -> 0x02bb }
            X.8zz r0 = X.C188648zz.A0D     // Catch:{ all -> 0x02bb }
            r1.A00(r0, r11)     // Catch:{ all -> 0x02bb }
        L_0x01fe:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x02bb }
            goto L_0x02aa
        L_0x0202:
            X.163 r0 = r7.A01     // Catch:{ all -> 0x02bb }
            X.12P r0 = r0.A04     // Catch:{ all -> 0x02bb }
            X.1M0 r12 = r0.A05()     // Catch:{ all -> 0x02bb }
            X.14e r3 = r12.A02     // Catch:{ all -> 0x02b1 }
            java.lang.String r1 = "chat"
            java.lang.String r0 = "replaceIntoChatTable/REPLACE_CHAT"
            r3.A06(r1, r0, r5)     // Catch:{ all -> 0x02b1 }
            r12.close()     // Catch:{ all -> 0x02bb }
            X.1Jc r0 = r7.A05     // Catch:{ all -> 0x02bb }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x0298 }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x0298 }
            X.71s r5 = r3.B1k()     // Catch:{ all -> 0x0291 }
            X.1M0 r12 = r0.A05()     // Catch:{ all -> 0x024c }
            X.14e r15 = r12.A02     // Catch:{ all -> 0x0245 }
            java.lang.String r14 = "newsletter_linked_account"
            java.lang.String r13 = "chat_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0245 }
            r16 = 0
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x0245 }
            r1[r16] = r0     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "NewsletterLinkedAccountsStore/DELETE_NEWSLETTER_LINKED_ACCOUNTS"
            int r0 = r15.A03(r14, r13, r0, r1)     // Catch:{ all -> 0x0245 }
            r12.close()     // Catch:{ all -> 0x024c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x024c }
            goto L_0x0252
        L_0x0245:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0247 }
        L_0x0247:
            r0 = move-exception
            X.C05600Qi.A00(r12, r1)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ all -> 0x024c }
        L_0x024c:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x028a }
            r1.<init>(r0)     // Catch:{ all -> 0x028a }
        L_0x0252:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x025d
            java.lang.String r0 = "NewsletterLinkedAccountsStore/failed to store newsletter"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x028a }
        L_0x025d:
            java.util.List r0 = r6.A0S     // Catch:{ all -> 0x028a }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x028a }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0280
            r1.next()     // Catch:{ all -> 0x028a }
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ all -> 0x028a }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x028a }
            r0.<init>()     // Catch:{ all -> 0x028a }
            r0.put(r2, r4)     // Catch:{ all -> 0x028a }
            java.lang.String r1 = "getName"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x028a }
            r0.<init>(r1)     // Catch:{ all -> 0x028a }
            throw r0     // Catch:{ all -> 0x028a }
        L_0x0280:
            r5.A00()     // Catch:{ all -> 0x028a }
            r5.close()     // Catch:{ all -> 0x0291 }
            r3.close()     // Catch:{ all -> 0x0298 }
            goto L_0x029e
        L_0x028a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x028c }
        L_0x028c:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0291 }
            throw r0     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0293 }
        L_0x0293:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0298 }
            throw r0     // Catch:{ all -> 0x0298 }
        L_0x0298:
            r1 = move-exception
            X.03N r0 = new X.03N     // Catch:{ all -> 0x02bb }
            r0.<init>(r1)     // Catch:{ all -> 0x02bb }
        L_0x029e:
            X.12q r1 = r7.A02     // Catch:{ all -> 0x02bb }
            X.11F r0 = r6.A0q     // Catch:{ all -> 0x02bb }
            r1.A0I(r6, r0)     // Catch:{ all -> 0x02bb }
            r10.A00()     // Catch:{ all -> 0x02bb }
            goto L_0x01fe
        L_0x02aa:
            r10.close()     // Catch:{ all -> 0x02c2 }
            r8.close()     // Catch:{ all -> 0x02c9 }
            goto L_0x02cf
        L_0x02b1:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x02b6 }
            goto L_0x02ba
        L_0x02b6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02bb }
        L_0x02ba:
            throw r1     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02bd }
        L_0x02bd:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x02c2 }
            throw r0     // Catch:{ all -> 0x02c2 }
        L_0x02c2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02c4 }
        L_0x02c4:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x02c9:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x02e6 }
            r1.<init>(r0)     // Catch:{ all -> 0x02e6 }
        L_0x02cf:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x02e6 }
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "NewsletterStore/failed to store newsletter"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02e6 }
            goto L_0x0012
        L_0x02dc:
            r9.A00()     // Catch:{ all -> 0x02e6 }
            r9.close()     // Catch:{ all -> 0x02ed }
            r18.close()     // Catch:{ all -> 0x02f6 }
            return
        L_0x02e6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02e8 }
        L_0x02e8:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x02ed }
            throw r0     // Catch:{ all -> 0x02ed }
        L_0x02ed:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x02ef }
        L_0x02ef:
            r1 = move-exception
            r0 = r18
            X.C05600Qi.A00(r0, r2)     // Catch:{ all -> 0x02f6 }
            throw r1     // Catch:{ all -> 0x02f6 }
        L_0x02f6:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ja.A0A(java.util.List):void");
    }
}
