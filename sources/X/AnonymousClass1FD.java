package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1FD  reason: invalid class name */
public class AnonymousClass1FD {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass17U A03;

    public int A02(AnonymousClass11F r7) {
        Cursor A09;
        int i = 0;
        String[] strArr = {String.valueOf(this.A00.A08(r7))};
        AnonymousClass1M0 A04 = this.A02.get();
        try {
            A09 = A04.A02.A09("SELECT COUNT(*) as count  FROM deleted_messages_ids_view WHERE chat_row_id = ? AND message_type != 8", "GET_MESSAGE_COUNT_JID_TO_DELETE_SQL", strArr);
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/countmessagestodelete/count: ");
                sb.append(i);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("msgstore/countmessagestodelete/db no message for ");
                sb2.append(r7);
                Log.i(sb2.toString());
            }
            A09.close();
            A04.close();
            return i;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static AnonymousClass3B8 A00(Cursor cursor, AnonymousClass1FD r22) {
        ArrayList arrayList;
        Cursor cursor2 = cursor;
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("chat_row_id"));
        AnonymousClass11F A0A = r22.A00.A0A(j);
        if (A0A == null) {
            return null;
        }
        long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_message_row_id"));
        if (j2 == 0) {
            j2 = Long.MIN_VALUE;
        }
        long j3 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_starred_message_row_id"));
        if (j3 == 0) {
            j3 = Long.MIN_VALUE;
        }
        long j4 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_categories_message_row_id"));
        if (j4 == 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_categories_starred_message_row_id"));
        if (j5 == 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("block_size"));
        boolean z = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("deleted_messages_remove_files")) != 0) {
            z = true;
        }
        boolean z2 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("delete_files_singular_delete")) != 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("deleted_categories_remove_files")) != 0) {
            z3 = true;
        }
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("deleted_message_categories"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("singular_message_delete_rows_id"));
        if (string2 == null || string2.isEmpty()) {
            arrayList = null;
        } else {
            String[] split = string2.replace("\"", "").split(",");
            arrayList = new ArrayList();
            for (String valueOf : split) {
                arrayList.add(Long.valueOf(valueOf));
            }
        }
        return new AnonymousClass3B8(A0A, string, arrayList, i, j6, j, j2, j3, j4, j5, z, z2, z3);
    }

    public static AnonymousClass3B8 A01(AnonymousClass1FD r6, long j) {
        Cursor A09;
        AnonymousClass1M0 A04 = r6.A02.get();
        try {
            A09 = A04.A02.A09("SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE chat_row_id = ? ORDER BY _id DESC LIMIT 1", "GET_DELETED_CHAT_JOBS_LATEST_SQL", new String[]{Long.toString(j)});
            if (A09.moveToFirst()) {
                AnonymousClass3B8 A002 = A00(A09, r6);
                A09.close();
                A04.close();
                return A002;
            }
            A09.close();
            A04.close();
            return null;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass3B8 A03(AnonymousClass11F r47, Long l, List list, boolean z, boolean z2, boolean z3) {
        long j;
        long max;
        boolean z4;
        long j2;
        long j3;
        long j4;
        C1495671s B1k;
        String str;
        boolean z5 = z2;
        AnonymousClass3B8 r26 = null;
        AnonymousClass12P r7 = this.A02;
        AnonymousClass1M0 A05 = r7.A05();
        try {
            C1495671s B1k2 = A05.B1k();
            try {
                AnonymousClass163 r6 = this.A00;
                AnonymousClass11F r5 = r47;
                long A08 = r6.A08(r5);
                if (l != null) {
                    max = l.longValue();
                } else {
                    C65073Qp A09 = this.A01.A09(r5, false);
                    long A06 = this.A03.A06(r5);
                    if (A09 != null) {
                        j = A09.A0O;
                    } else {
                        j = Long.MIN_VALUE;
                    }
                    max = Math.max(A06, j);
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    if (z) {
                        j4 = max;
                    } else {
                        j4 = Long.MIN_VALUE;
                    }
                    j3 = Long.MIN_VALUE;
                    j2 = Long.MIN_VALUE;
                    z4 = false;
                } else {
                    if (z) {
                        j2 = max;
                    } else {
                        j2 = Long.MIN_VALUE;
                    }
                    z4 = z5;
                    j3 = max;
                    z5 = false;
                    max = Long.MIN_VALUE;
                    j4 = Long.MIN_VALUE;
                }
                AnonymousClass3B8 r24 = new AnonymousClass3B8(r5, (String) null, list, 100, -1, A08, max, j4, j3, j2, z5, z3, z4);
                AnonymousClass1M0 A052 = r7.A05();
                try {
                    B1k = A052.B1k();
                    long j5 = r24.A01;
                    AnonymousClass11F A0A = r6.A0A(j5);
                    if (A0A != null) {
                        C65073Qp A092 = this.A01.A09(A0A, false);
                        AnonymousClass3B8 A012 = A01(this, j5);
                        if (A012 == null || TextUtils.isEmpty((CharSequence) null) || TextUtils.isEmpty(A012.A08)) {
                            long j6 = r24.A04;
                            long j7 = r24.A05;
                            boolean z6 = r24.A0C;
                            long j8 = r24.A02;
                            long j9 = r24.A03;
                            boolean z7 = r24.A0A;
                            String str2 = null;
                            List list2 = r24.A09;
                            List list3 = list2;
                            if (list2 == null) {
                                str = null;
                            } else {
                                String[] strArr = new String[list3.size()];
                                for (int i = 0; i < list3.size(); i++) {
                                    strArr[i] = ((Long) list3.get(i)).toString();
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("\"");
                                sb.append(AnonymousClass14B.A08("\",\"", strArr));
                                sb.append("\"");
                                str = sb.toString();
                            }
                            boolean z8 = r24.A0B;
                            if (A012 != null) {
                                if (TextUtils.isEmpty((CharSequence) null) || TextUtils.isEmpty(A012.A08)) {
                                    str2 = A012.A08;
                                    if (!TextUtils.isEmpty(str2)) {
                                        z7 = A012.A0A;
                                    } else {
                                        str2 = null;
                                    }
                                    j6 = Math.max(j6, A012.A04);
                                    j7 = Math.max(j7, A012.A05);
                                    j8 = Math.max(j8, A012.A02);
                                    j9 = Math.max(j9, A012.A03);
                                } else {
                                    B1k.close();
                                    A052.close();
                                    B1k2.close();
                                    A05.close();
                                    return r26;
                                }
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("chat_row_id", Long.valueOf(j5));
                            contentValues.put("block_size", 100);
                            contentValues.put("deleted_message_row_id", Long.valueOf(j6));
                            contentValues.put("deleted_starred_message_row_id", Long.valueOf(j7));
                            contentValues.put("deleted_messages_remove_files", Boolean.valueOf(z6));
                            contentValues.put("deleted_categories_message_row_id", Long.valueOf(j8));
                            contentValues.put("deleted_categories_starred_message_row_id", Long.valueOf(j9));
                            contentValues.put("deleted_message_categories", str2);
                            contentValues.put("deleted_categories_remove_files", Boolean.valueOf(z7));
                            contentValues.put("delete_files_singular_delete", Boolean.valueOf(z8));
                            AnonymousClass3SW.A01(contentValues, "singular_message_delete_rows_id", str);
                            C224114e r12 = A052.A02;
                            long A04 = r12.A04("deleted_chat_job", "markChatForDeletion/INSERT_DELETED_CHAT_JOB", contentValues);
                            if (A012 != null) {
                                r12.A03("deleted_chat_job", "_id = ?", "markChatForDeletion/DELETE_DELETED_CHAT_JOB", new String[]{Long.toString(A012.A06)});
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgstore/deletemsgs/mark jid:");
                            sb2.append(A0A);
                            sb2.append(" lastDeletedMessageSortId:");
                            sb2.append(j6);
                            sb2.append(" lastDeletedStarredMessageSortId:");
                            sb2.append(j7);
                            Log.i(sb2.toString());
                            if (A04 > 0 && A092 != null) {
                                A092.A0G(str2, j6, j7, j8, j9);
                            }
                            B1k.A00();
                            r26 = new AnonymousClass3B8(A0A, str2, list3, 100, A04, j5, j6, j7, j8, j9, z6, z8, z7);
                            B1k.close();
                            A052.close();
                            B1k2.A00();
                            B1k2.close();
                            A05.close();
                            return r26;
                        }
                    }
                    B1k.close();
                    A052.close();
                    B1k2.close();
                    A05.close();
                    return r26;
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A05.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public HashSet A04() {
        Cursor A09;
        HashSet hashSet = new HashSet();
        AnonymousClass1M0 A04 = this.A02.get();
        try {
            A09 = A04.A02.A09("SELECT DISTINCT chat_row_id FROM deleted_chat_job", "GET_DELETED_CHATS_SQL", (String[]) null);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("chat_row_id");
            while (A09.moveToNext()) {
                AnonymousClass11F A0A = this.A00.A0A(A09.getLong(columnIndexOrThrow));
                if (A0A != null) {
                    hashSet.add(A0A);
                }
            }
            A09.close();
            A04.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(AnonymousClass3B8 r22) {
        C220412q r0 = this.A01;
        AnonymousClass3B8 r10 = r22;
        AnonymousClass11F r3 = r10.A07;
        C65073Qp A09 = r0.A09(r3, false);
        AnonymousClass1M0 A05 = this.A02.A05();
        try {
            A05.A02.A03("deleted_chat_job", "_id = ?", "unmarkJidForDeletionInChats/DELETE_DELETED_CHAT_JOB", new String[]{String.valueOf(r10.A06)});
            if (A09 != null && A01(this, r10.A01) == null) {
                A09.A0G((String) null, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/deletemsgs/unmark jid:");
            sb.append(r3);
            Log.i(sb.toString());
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1FD(AnonymousClass163 r1, C220412q r2, AnonymousClass12P r3, AnonymousClass17U r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
