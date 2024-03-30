package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;

/* renamed from: X.1Xh  reason: invalid class name and case insensitive filesystem */
public class C29611Xh {
    public final AnonymousClass12P A00;

    public static void A00(AnonymousClass3T1 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A1N > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FutureMessageStore/validateMessage/message must have row_id set; key=");
        C64933Qa r2 = r8.A1J;
        sb.append(r2);
        C18740tg.A0E(z2, sb.toString());
        if (r8.A0H() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FutureMessageStore/validateMessage/message in main storage; key=");
        sb2.append(r2);
        C18740tg.A0E(z, sb2.toString());
    }

    public void A01(AnonymousClass2bK r17) {
        AnonymousClass2bK r1 = r17;
        A00(r1);
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r1.A1N));
            contentValues.put("version", Integer.valueOf(r1.A01));
            AnonymousClass3SW.A03(contentValues, "data", r1.A1V());
            contentValues.put("future_message_type", Integer.valueOf(r1.A00));
            byte[] bArr = r1.A02;
            if (bArr != null) {
                contentValues.put("future_proof_stanza", bArr);
            }
            contentValues.put("edit_version", Integer.valueOf(r1.A01));
            C224114e r10 = A05.A02;
            long A04 = r10.A04("message_future", "INSERT_MESSAGE_FUTURE_SQL", contentValues);
            boolean z = false;
            if (A04 != -1) {
                if (A04 == r1.A1N) {
                    z = true;
                }
                C18740tg.A0F(z, "FutureMessageStore/insertOrUpdateFutureMessage/inserted row should have same row_id");
            } else {
                contentValues.remove("message_row_id");
                if (r10.A01(contentValues, "message_future", "message_row_id = ?", "UPDATE_MESSAGE_FUTURE_SQL", new String[]{String.valueOf(r1.A1N)}) != 1) {
                    throw new SQLiteException("Failed to insert / update futureproof message");
                }
            }
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C29611Xh(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
