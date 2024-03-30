package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.3rr  reason: invalid class name and case insensitive filesystem */
public final class C78283rr implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78283rr(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r8) {
        Cursor A09;
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass2bJ r82 = (AnonymousClass2bJ) r8;
        AnonymousClass1M0 A04 = ((C588131d) this.A00.get()).A00.get();
        try {
            C224114e r5 = A04.A02;
            String[] A1R = C36441kJ.A1R();
            C36401kF.A1T(A1R, 0, r82.A1N);
            A09 = r5.A09("SELECT scheduled_timestamp_ms, call_type, title FROM message_scheduled_call WHERE message_row_id = ?", "GET_MESSAGE_SCHEDULED_CALL", A1R);
            if (A09.moveToLast()) {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("scheduled_timestamp_ms");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("call_type");
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("title");
                r82.A01 = A09.getLong(columnIndexOrThrow);
                r82.A00 = A09.getInt(columnIndexOrThrow2);
                r82.A02 = A09.getString(columnIndexOrThrow3);
            }
            A09.close();
            A04.close();
            return;
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

    public void BKi(AnonymousClass3T1 r7) {
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass2bJ r72 = (AnonymousClass2bJ) r7;
        AnonymousClass1M0 A05 = ((C588131d) this.A00.get()).A00.A05();
        try {
            ContentValues contentValues = new ContentValues(4);
            C36341k9.A0p(contentValues, "message_row_id", r72.A1N);
            C36341k9.A0p(contentValues, "scheduled_timestamp_ms", r72.A01);
            C36341k9.A0o(contentValues, "call_type", r72.A00);
            contentValues.put("title", r72.A02);
            if (A05.A02.A08("message_scheduled_call", "ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall", contentValues, 5) < 0) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall/insert error, rowId=");
                Log.e(C36411kG.A11(A0u, r72.A1N));
            }
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void BwV(AnonymousClass3T1 r1) {
    }
}
