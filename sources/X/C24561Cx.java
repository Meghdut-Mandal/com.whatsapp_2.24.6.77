package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Cx  reason: invalid class name and case insensitive filesystem */
public class C24561Cx {
    public final AnonymousClass12P A00;
    public final AnonymousClass1A1 A01;
    public final AnonymousClass005 A02;

    public int A00(AnonymousClass3T1 r7) {
        Cursor A09;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("\n          SELECT COUNT(*) as reply_count\n          FROM message_comment\n          WHERE parent_message_row_id = ?\n        ", "SELECT_COMMENT_COUNT_FOR_PARENT_MESSAGE_QUERY_ID", new String[]{String.valueOf(r7.A1N)});
            if (A09.moveToNext()) {
                int i = A09.getInt(A09.getColumnIndexOrThrow("reply_count"));
                A09.close();
                A04.close();
                return i;
            }
            A09.close();
            A04.close();
            return 0;
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

    public ArrayList A01(List list, int i) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r1 = (AnonymousClass3T1) it.next();
            if (r1.A1R(16)) {
                long j = r1.A1N;
                AnonymousClass1M0 A04 = this.A00.get();
                try {
                    Cursor A09 = A04.A02.A09(C56792wt.A01, "SELECT_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID", new String[]{String.valueOf(j), String.valueOf(i)});
                    A04.close();
                    while (A09.moveToNext()) {
                        try {
                            arrayList.add(this.A01.A00(A09));
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    A09.close();
                } catch (Throwable th3) {
                    th = th3;
                    A04.close();
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public void A02(C26901Ly r5, AnonymousClass3T1 r6, int i, boolean z) {
        Cursor A09 = ((AnonymousClass1M0) r5).A02.A09(C56792wt.A00, "SELECT_ALL_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID", new String[]{String.valueOf(r6.A1N)});
        while (A09.moveToNext()) {
            try {
                AnonymousClass3T1 A002 = this.A01.A00(A09);
                if (A002 != null) {
                    ((C20310xM) this.A02.get()).A0o(A002, i, z);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        A09.close();
    }

    public C24561Cx(AnonymousClass12P r1, AnonymousClass1A1 r2, AnonymousClass005 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A03(AnonymousClass3T1 r8) {
        C1495671s B1k;
        C63663Kx A0P = r8.A0P();
        if (A0P != null) {
            Long A04 = A0P.A04();
            if (A04.longValue() != -1) {
                AnonymousClass1M0 A05 = this.A00.A05();
                try {
                    B1k = A05.B1k();
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("message_row_id", Long.valueOf(r8.A1N));
                    contentValues.put("parent_message_row_id", A04);
                    A05.A02.A08("message_comment", "insertIntoCommentsTable/INSERT_COMMENT_MESSAGES", contentValues, 4);
                    B1k.A00();
                    B1k.close();
                    A05.close();
                    return;
                } catch (Throwable th) {
                    try {
                        A05.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
