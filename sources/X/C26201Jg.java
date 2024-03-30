package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1Jg  reason: invalid class name and case insensitive filesystem */
public class C26201Jg {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;

    public Cursor A00(C64933Qa r9) {
        String str;
        AnonymousClass11F r7 = r9.A00;
        if (r7 == null) {
            return null;
        }
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            C224114e r6 = A04.A02;
            String str2 = C56312w5.A00;
            String[] strArr = new String[3];
            strArr[0] = r9.A01;
            strArr[1] = String.valueOf(this.A00.A08(r7));
            if (r9.A02) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[2] = str;
            Cursor A09 = r6.A09(str2, "SELECT_LAST_EDIT_MESSAGE_BY_MESSAGE_KEY", strArr);
            A04.close();
            return A09;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A01(AnonymousClass3T1 r11) {
        Cursor A09;
        if (r11.A1T(C132986Wc.A0F)) {
            AnonymousClass1M0 A04 = this.A01.get();
            try {
                A09 = A04.A02.A09("SELECT original_key_id,edited_timestamp,sender_timestamp FROM message_edit_info WHERE message_row_id = ?", "GET_MESSAGE_EDIT_INFO_FOR_ROW_ID_SQL", new String[]{Long.toString(r11.A1N)});
                if (A09.moveToNext()) {
                    String string = A09.getString(A09.getColumnIndexOrThrow("original_key_id"));
                    long j = A09.getLong(A09.getColumnIndexOrThrow("edited_timestamp"));
                    long j2 = A09.getLong(A09.getColumnIndexOrThrow("sender_timestamp"));
                    C64933Qa r0 = r11.A1J;
                    r11.A11(new AnonymousClass37F(new C64933Qa(r0.A00, string, r0.A02), j, j2));
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
        } else {
            return;
        }
        throw th;
    }

    public void A02(AnonymousClass3T1 r7) {
        if (r7.A1T(C132986Wc.A0F)) {
            AnonymousClass37F A0X = r7.A0X();
            if (A0X != null) {
                AnonymousClass1M0 A05 = this.A01.A05();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(r7.A1N));
                    contentValues.put("original_key_id", A0X.A02.A01);
                    contentValues.put("edited_timestamp", Long.valueOf(A0X.A00));
                    contentValues.put("sender_timestamp", Long.valueOf(A0X.A01));
                    A05.A02.A08("message_edit_info", "INSERT_MESSAGE_EDIT_INFO", contentValues, 5);
                    A05.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                throw new IllegalStateException("MessageEditInfoStore/insertEditInfo/missing information in the FMessage");
            }
        }
    }

    public C26201Jg(AnonymousClass163 r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
