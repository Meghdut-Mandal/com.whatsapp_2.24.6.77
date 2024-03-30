package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1TA  reason: invalid class name */
public class AnonymousClass1TA {
    public final AnonymousClass1DD A00;

    public String A00(String str) {
        Cursor A09;
        String str2;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT file_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", "SharedMediaIdsStore/getSharedFileByUUID", new String[]{str, String.valueOf(System.currentTimeMillis())});
            if (!A09.moveToNext()) {
                str2 = null;
            } else {
                str2 = A09.getString(A09.getColumnIndexOrThrow("file_name"));
            }
            A09.close();
            A03.close();
            return str2;
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

    public void A01(String str, String str2, String str3, String str4) {
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("item_uuid", str);
            contentValues.put("file_name", str2);
            contentValues.put("mime_type", str3);
            AnonymousClass3SW.A01(contentValues, "display_name", str4);
            contentValues.put("expiration_timestamp", String.valueOf(System.currentTimeMillis() + 3600000));
            A04.A02.A04("shared_media_ids", "INSERT_SHARED_MEDIA", contentValues);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1TA(AnonymousClass1DD r1) {
        this.A00 = r1;
    }
}
