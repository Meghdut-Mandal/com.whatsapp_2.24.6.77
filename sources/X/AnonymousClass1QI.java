package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.1QI  reason: invalid class name */
public class AnonymousClass1QI {
    public final AnonymousClass12P A00;
    public final C20810yC A01;
    public final AnonymousClass17Z A02;

    public void A01(AnonymousClass3T1 r10) {
        Cursor A09;
        int i;
        AnonymousClass4TX r6 = (AnonymousClass4TX) r10;
        long j = r10.A1N;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT state FROM message_view_once_media WHERE message_row_id = ?", "GET_VIEW_ONCE_STATE_BY_MESSAGE_ROW_ID_SQL", new String[]{Long.toString(j)});
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("state");
            if (A09.moveToNext()) {
                i = A09.getInt(columnIndexOrThrow);
                A09.close();
                A04.close();
            } else {
                A09.close();
                A04.close();
                i = 2;
            }
            r6.Bsk(i);
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

    public static void A00(AnonymousClass1QI r7, int i, long j) {
        AnonymousClass1M0 A05;
        try {
            A05 = r7.A00.A05();
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", Integer.valueOf(i));
            A05.A02.A01(contentValues, "message_view_once_media", "message_row_id = ?", "UPDATE_VIEW_ONCE_SQL", new String[]{String.valueOf(j)});
            A05.close();
            return;
        } catch (Exception e) {
            Log.e("ViewOnceMessageStore/updateInsert failed", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A03(AnonymousClass3T1 r4) {
        if (r4 instanceof AnonymousClass4TX) {
            int i = r4.A0D;
            if (i == 9 || i == 10 || i == 8) {
                AnonymousClass3T1 r42 = (AnonymousClass3T1) ((AnonymousClass4TX) r4);
                AnonymousClass4TX r0 = (AnonymousClass4TX) r42;
                r0.Bsk(1);
                A00(this, r0.BJ8(), r42.A1N);
            }
        }
    }

    public AnonymousClass1QI(AnonymousClass17Z r1, AnonymousClass12P r2, C20810yC r3) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r1;
    }

    public void A02(AnonymousClass3T1 r8) {
        AnonymousClass1M0 A05;
        C18740tg.A00();
        C18740tg.A0C(r8 instanceof AnonymousClass4TX);
        long j = r8.A1N;
        int BJ8 = ((AnonymousClass4TX) r8).BJ8();
        try {
            A05 = this.A00.A05();
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("state", Integer.valueOf(BJ8));
            A05.A02.A08("message_view_once_media", "INSERT_VIEW_ONCE_SQL", contentValues, 5);
            A05.close();
            return;
        } catch (Exception e) {
            Log.e("ViewOnceMessageStore/updateInsert failed", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
