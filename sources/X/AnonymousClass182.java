package X;

import android.content.ContentValues;

/* renamed from: X.182  reason: invalid class name */
public class AnonymousClass182 {
    public final AnonymousClass181 A00;

    public void A00(AnonymousClass147 r19, long j) {
        C1495671s B1k;
        AnonymousClass181 r12 = this.A00;
        AnonymousClass1M0 A05 = r12.A01.A05();
        try {
            B1k = A05.B1k();
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("announcement_version", Long.valueOf(j2));
            AnonymousClass147 r13 = r19;
            if (A05.A02.A01(contentValues, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_ANNOUNCEMENT_VERSION", new String[]{String.valueOf(r12.A00.A07(r13))}) != 1) {
                AnonymousClass181.A01(r12, r13, 0, j2);
            }
            B1k.A00();
            A05.B5o(new C35701j7(r12, r13, 11));
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
        throw th;
    }

    public void A01(AnonymousClass147 r20, long j) {
        C1495671s B1k;
        AnonymousClass181 r13 = this.A00;
        AnonymousClass1M0 A05 = r13.A01.A05();
        try {
            B1k = A05.B1k();
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("subject_timestamp", Long.valueOf(j2));
            AnonymousClass147 r14 = r20;
            long A07 = r13.A00.A07(r14);
            if (A05.A02.A01(contentValues, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_SUBJECT_TIMESTAMP", new String[]{String.valueOf(A07)}) != 1) {
                AnonymousClass181.A01(r13, r14, j2, 0);
            }
            B1k.A00();
            A05.B5o(new C35701j7(r13, r14, 12));
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
        throw th;
    }

    public AnonymousClass182(AnonymousClass181 r1) {
        this.A00 = r1;
    }
}
