package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.1IT  reason: invalid class name */
public class AnonymousClass1IT {
    public final AnonymousClass18P A00;

    public void A04(String str, long j) {
        C1495671s B1k;
        long j2 = j;
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        C18740tg.A0C(z);
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            String str2 = str;
            A00(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dirty_version", Long.valueOf(j2));
            if (((long) A04.A02.A01(contentValues, "collection_versions", "collection_name = ? ", "CollectionVersionsTable.UPDATE_COLLECTION_DIRTY_VERSION", new String[]{str})) <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncDbStore/updateCollectionDirtyVersion failed for collection: ");
                sb.append(str2);
                sb.append(", dirtyVersion: ");
                sb.append(j2);
                Log.e(sb.toString());
            }
            B1k.A00();
            B1k.close();
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

    private void A00(String str) {
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("collection_name", str);
            contentValues.put("version", 0);
            contentValues.putNull("lt_hash");
            contentValues.put("dirty_version", -1);
            A04.A02.A04("collection_versions", "CollectionVersionsTable.INSERT_OR_IGNORE", contentValues);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Long A01(String str) {
        Cursor A09;
        Long l;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", new String[]{str});
            if (A09.moveToFirst()) {
                l = Long.valueOf(A09.getLong(A09.getColumnIndexOrThrow("version")));
            } else {
                l = null;
            }
            A09.close();
            A03.close();
            return l;
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

    public HashMap A02() {
        Cursor A09;
        HashMap hashMap = new HashMap();
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT collection_name, version FROM collection_versions", "CollectionVersionsTable.GET_ALL_COLLECTION_VERSIONS", (String[]) null);
            while (A09.moveToNext()) {
                hashMap.put(A09.getString(A09.getColumnIndexOrThrow("collection_name")), Long.valueOf(A09.getLong(A09.getColumnIndexOrThrow("version"))));
            }
            A09.close();
            A03.close();
            return hashMap;
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

    public void A03(String str) {
        C1495671s B1k;
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            A04.A02.A0E("UPDATE collection_versions SET dirty_version = -1 WHERE collection_name = ? AND dirty_version = 0", "CollectionVersionsTable.MARK_COLLECTION_AS_UPDATED", new String[]{str});
            B1k.A00();
            B1k.close();
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

    public void A05(String str, byte[] bArr, long j) {
        C1495671s B1k;
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            String str2 = str;
            A00(str2);
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("version", Long.valueOf(j2));
            byte[] bArr2 = bArr;
            if (bArr != null) {
                contentValues.put("lt_hash", bArr2);
            } else {
                contentValues.putNull("lt_hash");
            }
            if (((long) A04.A02.A01(contentValues, "collection_versions", "collection_name = ? ", "CollectionVersionsTable.UPDATE_COLLECTION_VERSION", new String[]{str})) <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncDbStore/updateCollectionVersion failed for collection: ");
                sb.append(str2);
                sb.append(", version: ");
                sb.append(j2);
                sb.append(", ltHash: ");
                sb.append(Arrays.toString(bArr2));
                Log.e(sb.toString());
            }
            B1k.A00();
            B1k.close();
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

    public boolean A06(String str) {
        Cursor A09;
        long j;
        long j2;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", new String[]{str});
            if (A09.moveToFirst()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("version"));
                j2 = A09.getLong(A09.getColumnIndexOrThrow("dirty_version"));
            } else {
                j = 0;
                j2 = 0;
            }
            A09.close();
            A03.close();
            if (j2 == 0 || j < j2) {
                return false;
            }
            return true;
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

    public byte[] A07(String str) {
        Cursor A09;
        byte[] bArr;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT * FROM collection_versions WHERE collection_name = ?", "CollectionVersionsTable.GET_COLLECTION", new String[]{str});
            if (A09.moveToFirst()) {
                bArr = A09.getBlob(A09.getColumnIndexOrThrow("lt_hash"));
            } else {
                bArr = null;
            }
            A09.close();
            A03.close();
            if (bArr == null) {
                return new byte[128];
            }
            return bArr;
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

    public AnonymousClass1IT(AnonymousClass18P r1) {
        this.A00 = r1;
    }
}
