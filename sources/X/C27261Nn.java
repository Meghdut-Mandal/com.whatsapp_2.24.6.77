package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.1Nn  reason: invalid class name and case insensitive filesystem */
public class C27261Nn {
    public final C27271No A00;

    public synchronized void A01(C64283Nj r7) {
        AnonymousClass1M0 A04;
        C27271No r2 = this.A00;
        Jid jid = r7.A01;
        if (jid == null) {
            C18740tg.A0D(false, "setOrUpdateLastEntryPoint/jid is null");
        } else {
            C224214g r3 = new C224214g(true);
            r3.A03();
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("jid", jid.getRawString());
            contentValues.put("entry_point_type", r7.A03);
            contentValues.put("entry_point_id", r7.A02);
            contentValues.put("entry_point_time", Long.valueOf(r7.A00));
            try {
                A04 = r2.A00.A04();
                C229416o.A05(contentValues, A04, "wa_last_entry_point");
                A04.close();
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("setOrUpdateLastEntryPoint/unable to update entry point for jid ");
                sb.append(jid);
                C18740tg.A08(sb.toString(), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            r3.A00();
        }
        return;
        throw th;
    }

    public C64283Nj A00(AnonymousClass11F r14) {
        Cursor A03;
        C64283Nj r7;
        C27271No r1 = this.A00;
        C224214g r6 = new C224214g(true);
        r6.A03();
        AnonymousClass1M0 A032 = r1.A00.get();
        try {
            A03 = C229416o.A03(A032, "SELECT jid, entry_point_type, entry_point_id, entry_point_time FROM wa_last_entry_point WHERE jid = ?", "CONTACT_ENTRY_POINT", new String[]{r14.getRawString()});
            if (A03.moveToNext()) {
                int columnIndexOrThrow = A03.getColumnIndexOrThrow("jid");
                int columnIndexOrThrow2 = A03.getColumnIndexOrThrow("entry_point_type");
                int columnIndexOrThrow3 = A03.getColumnIndexOrThrow("entry_point_id");
                int columnIndexOrThrow4 = A03.getColumnIndexOrThrow("entry_point_time");
                r7 = new C64283Nj(Jid.Companion.A02(A03.getString(columnIndexOrThrow)), A03.getString(columnIndexOrThrow2), A03.getString(columnIndexOrThrow3), A03.getLong(columnIndexOrThrow4));
            } else {
                r7 = null;
            }
            A03.close();
            A032.close();
            r6.A00();
            return r7;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C27261Nn(C229716r r2) {
        this.A00 = new C27271No(r2);
    }
}
