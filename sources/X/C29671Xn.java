package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.1Xn  reason: invalid class name and case insensitive filesystem */
public class C29671Xn {
    public final AnonymousClass12P A00;
    public final C20810yC A01;
    public final C19970wo A02;

    public void A00(AnonymousClass3L1 r7, long j) {
        AnonymousClass1M0 A05;
        try {
            A05 = this.A00.A05();
            ContentValues contentValues = new ContentValues(10);
            contentValues.put("message_row_id", Long.valueOf(j));
            AnonymousClass3SW.A01(contentValues, "direct_path", r7.A04);
            AnonymousClass3SW.A03(contentValues, "media_key", r7.A0A);
            contentValues.put("media_key_timestamp", Long.valueOf(r7.A02));
            AnonymousClass3SW.A01(contentValues, "enc_thumb_hash", r7.A05);
            AnonymousClass3SW.A01(contentValues, "thumb_hash", r7.A08);
            contentValues.put("thumb_width", Integer.valueOf(r7.A01));
            contentValues.put("thumb_height", Integer.valueOf(r7.A00));
            AnonymousClass3SW.A02(contentValues, "transferred", r7.A09);
            AnonymousClass3SW.A03(contentValues, "micro_thumbnail", r7.A0B);
            contentValues.put("insert_timestamp", Long.valueOf(C19970wo.A00(this.A02)));
            contentValues.put("handle", r7.A06);
            A05.A02.A08("mms_thumbnail_metadata", "INSERT_MMS_THUMBNAIL_METADATA_SQL", contentValues, 5);
            A05.close();
            return;
        } catch (SQLiteConstraintException e) {
            Log.e("MmsThumbnailMetadataMessageStore/insertMmsThumbnailMetadata/", e);
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C29671Xn(C19970wo r1, AnonymousClass12P r2, C20810yC r3) {
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }
}
