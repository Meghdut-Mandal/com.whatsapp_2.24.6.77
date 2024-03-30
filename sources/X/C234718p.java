package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.18p  reason: invalid class name and case insensitive filesystem */
public class C234718p {
    public final C19970wo A00;
    public final AnonymousClass18M A01;

    public void A00(int i, byte[] bArr) {
        AnonymousClass1M0 A04 = this.A01.A04();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("prekey_id", Integer.valueOf(i));
            contentValues.put("timestamp", Long.valueOf(C19970wo.A00(this.A00) / 1000));
            contentValues.put("record", bArr);
            A04.A02.A07("signed_prekeys", "SignalSignedPreKeyStore/saveSignedPreKey", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl stored signed pre key with id ");
            sb.append(i);
            Log.i(sb.toString());
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public byte[] A01() {
        Cursor A09;
        AnonymousClass1M0 A03 = this.A01.get();
        try {
            C224114e r9 = A03.A02;
            A09 = r9.A09("SELECT prekey_id, record FROM signed_prekeys ORDER BY prekey_id DESC LIMIT 1", "SignalSignedPreKeyStore/getActiveSignedPreKey", (String[]) null);
            if (!A09.moveToNext()) {
                Log.e("no signed prekey record found");
                A09.close();
                A03.close();
                return null;
            }
            int i = A09.getInt(A09.getColumnIndexOrThrow("prekey_id"));
            byte[] blob = A09.getBlob(A09.getColumnIndexOrThrow("record"));
            A09.close();
            if (i == 16777215) {
                A09 = r9.A09("SELECT prekey_id, record FROM signed_prekeys WHERE prekey_id < ? ORDER BY prekey_id DESC LIMIT 1", "SignalSignedPreKeyStore/getActiveSignedPreKeyMax", new String[]{String.valueOf(8388607)});
                if (A09.moveToNext()) {
                    i = A09.getInt(A09.getColumnIndexOrThrow("prekey_id"));
                    blob = A09.getBlob(A09.getColumnIndexOrThrow("record"));
                }
                A09.close();
            }
            A03.close();
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl retrieved latest signed prekey record successfully; id=");
            sb.append(i);
            Log.i(sb.toString());
            return blob;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public byte[] A02(int i) {
        Cursor A0A;
        AnonymousClass1M0 A03 = this.A01.get();
        try {
            A0A = A03.A02.A0A("signed_prekeys", new String[]{"record"}, "prekey_id = ?", new String[]{String.valueOf(i)}, (String) null, (String) null, (String) null, "SignalSignedPreKeyStore/getSignedPreKey");
            if (A0A != null) {
                if (A0A.moveToNext()) {
                    byte[] blob = A0A.getBlob(A0A.getColumnIndexOrThrow("record"));
                    A0A.close();
                    A03.close();
                    return blob;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("no signed prekey available with id ");
            sb.append(i);
            Log.e(sb.toString());
            if (A0A != null) {
                A0A.close();
            }
            A03.close();
            return null;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C234718p(C19970wo r1, AnonymousClass18M r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
