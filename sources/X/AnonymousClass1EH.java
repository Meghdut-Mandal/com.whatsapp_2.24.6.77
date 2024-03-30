package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1EH  reason: invalid class name */
public class AnonymousClass1EH {
    public final AnonymousClass163 A00;
    public final AnonymousClass1DG A01;
    public final AnonymousClass12P A02;

    public byte[] A05(AnonymousClass3T1 r9) {
        Cursor A09;
        StringBuilder sb;
        String str;
        if (r9 == null) {
            return null;
        }
        if (r9 instanceof C46962bx) {
            return A01(((AnonymousClass2bU) r9).A04);
        }
        if (r9.A1N <= 0) {
            sb = new StringBuilder();
            str = "ThumbnailMessageStore/getMessageThumbnail/message must have row_id set; key=";
        } else if (r9.A0H() != 1) {
            sb = new StringBuilder();
            str = "ThumbnailMessageStore/getMessageThumbnail/message must be in main storage; key=";
        } else {
            boolean z = false;
            if (r9.A1N > 0) {
                z = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ThumbnailMessageStore/getThumbnailV2/message must have row_id set; key=");
            sb2.append(r9.A1J);
            C18740tg.A0E(z, sb2.toString());
            try {
                AnonymousClass1M0 A04 = this.A02.get();
                try {
                    A09 = A04.A02.A09("SELECT thumbnail FROM message_thumbnail WHERE message_row_id = ?", "GET_THUMBNAIL_BY_ROW_ID_SQL", new String[]{Long.toString(r9.A1N)});
                    if (A09.moveToNext()) {
                        byte[] blob = A09.getBlob(A09.getColumnIndexOrThrow("thumbnail"));
                        A09.close();
                        A04.close();
                        return blob;
                    }
                    A09.close();
                    A04.close();
                    return null;
                } catch (Throwable th) {
                    A04.close();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ThumbnailMessageStore/getThumbnailV2/failed to read thumbnail", e);
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        sb.append(str);
        sb.append(r9.A1J);
        Log.w(sb.toString());
        return null;
        throw th;
    }

    public static void A00(AnonymousClass3T1 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A1N > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ThumbnailMessageStore/isThumbnailV2Ready/message must have row_id set; key=");
        C64933Qa r2 = r8.A1J;
        sb.append(r2);
        C18740tg.A0E(z2, sb.toString());
        if (r8.A0H() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ThumbnailMessageStore/isThumbnailV2Ready/message must be in main storage; key=");
        sb2.append(r2);
        C18740tg.A0E(z, sb2.toString());
    }

    public void A02(AnonymousClass3T1 r10) {
        Cursor A09;
        AnonymousClass1M0 A05;
        if (r10 instanceof C46962bx) {
            AnonymousClass2bU r102 = (AnonymousClass2bU) r10;
            String str = r102.A04;
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass1M0 A04 = this.A01.A03.get();
                try {
                    boolean z = false;
                    A09 = A04.A02.A09("SELECT COUNT(1) as count FROM message_media WHERE file_hash = ? AND message_row_id != ?", "SELECT_REFERENCED_FILE_HASH_WITH_MESSAGE_ROW_ID_SQL", new String[]{r102.A04, String.valueOf(r102.A1N)});
                    if (A09.moveToNext()) {
                        if (A09.getLong(A09.getColumnIndexOrThrow("count")) == 0) {
                            z = true;
                        }
                        A09.close();
                        A04.close();
                        if (!z) {
                            return;
                        }
                    } else {
                        A09.close();
                        A04.close();
                    }
                    A05 = this.A02.A05();
                } catch (Throwable th) {
                    th = th;
                    A04.close();
                    throw th;
                }
                try {
                    A05.A02.A03("media_hash_thumbnail", "media_hash = ?", "DELETE_MEDIA_HASH_THUMBNAIL_SQL", new String[]{str});
                    A05.close();
                    return;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            } else {
                return;
            }
        } else {
            A00(r10);
            long j = r10.A1N;
            AnonymousClass1M0 A052 = this.A02.A05();
            try {
                A052.A02.A03("message_thumbnail", "message_row_id = ?", "DELETE_MESSAGE_THUMBNAIL_SQL", new String[]{String.valueOf(j)});
                return;
            } finally {
                th = th;
                A052.close();
            }
        }
        throw th;
    }

    public void A03(AnonymousClass3T1 r9, byte[] bArr) {
        if (r9 instanceof C46962bx) {
            String str = ((AnonymousClass2bU) r9).A04;
            if (!TextUtils.isEmpty(str) && A01(str) == null) {
                AnonymousClass1M0 A05 = this.A02.A05();
                try {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("media_hash", str);
                    contentValues.put("thumbnail", bArr);
                    A05.A02.A04("media_hash_thumbnail", "INSERT_MEDIA_HASH_THUMBNAIL_SQL", contentValues);
                    A05.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        } else {
            A00(r9);
            if (bArr != null) {
                long j = r9.A1N;
                AnonymousClass1M0 A052 = this.A02.A05();
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("message_row_id", Long.valueOf(j));
                    contentValues2.put("thumbnail", bArr);
                    boolean z = false;
                    if (A052.A02.A08("message_thumbnail", "INSERT_MESSAGE_THUMBNAIL_SQL", contentValues2, 5) == j) {
                        z = true;
                    }
                    C18740tg.A0F(z, "ThumbnailMessageStore/insertOrUpdateThumbnailV2/inserted row should has same row_id");
                    A052.close();
                } catch (Throwable th2) {
                    th = th2;
                    A052.close();
                    throw th;
                }
            }
        }
    }

    public void A04(Collection collection) {
        Cursor A09;
        AnonymousClass1M0 A05 = this.A02.A05();
        try {
            C1495671s B1k = A05.B1k();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    boolean z = true;
                    String[] strArr = {str};
                    AnonymousClass1M0 A04 = this.A01.A03.get();
                    try {
                        A09 = A04.A02.A09("SELECT COUNT(1) as count FROM message_media WHERE file_hash=?", "SELECT_REFERENCED_FILE_HASH_SQL", strArr);
                        if (A09.moveToNext() && A09.getLong(A09.getColumnIndexOrThrow("count")) != 0) {
                            z = false;
                        }
                        A09.close();
                        A04.close();
                        if (!z) {
                            A05.A02.A03("media_hash_thumbnail", "media_hash = ?", "DELETE_MEDIA_HASH_THUMBNAIL_SQL", new String[]{str});
                        }
                    } catch (Throwable th) {
                        A04.close();
                        throw th;
                    }
                }
                B1k.A00();
                B1k.close();
                A05.close();
                return;
                throw th;
            } catch (Throwable th2) {
                B1k.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A05.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public AnonymousClass1EH(AnonymousClass163 r1, AnonymousClass1DG r2, AnonymousClass12P r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    private byte[] A01(String str) {
        Cursor A09;
        byte[] bArr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr = {str};
        AnonymousClass1M0 A04 = this.A02.get();
        try {
            A09 = A04.A02.A09("SELECT thumbnail FROM media_hash_thumbnail WHERE media_hash = ?", "GET_THUMBNAIL_BY_MEDIA_HASH_SQL", strArr);
            if (A09.moveToNext()) {
                bArr = A09.getBlob(A09.getColumnIndexOrThrow("thumbnail"));
            }
            A09.close();
            A04.close();
            return bArr;
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
}
