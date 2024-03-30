package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.1GF  reason: invalid class name */
public class AnonymousClass1GF {
    public final C19970wo A00;
    public final AnonymousClass1DG A01;
    public final AnonymousClass177 A02;
    public final AnonymousClass12P A03;
    public final AnonymousClass1A1 A04;

    public C120155r3 A00(C64933Qa r11) {
        AnonymousClass3T1 A032;
        Cursor A09;
        int[] iArr;
        int length;
        if (r11 == null || (A032 = this.A04.A03(r11)) == null) {
            return null;
        }
        long j = A032.A1N;
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            A09 = A042.A02.A09("SELECT sidecar, chunk_lengths FROM message_streaming_sidecar WHERE message_row_id = ?", "GET_MESSAGE_STREAMING_SIDECAR_SQL", new String[]{Long.toString(j)});
            if (A09.moveToLast()) {
                byte[] blob = A09.getBlob(A09.getColumnIndexOrThrow("sidecar"));
                byte[] blob2 = A09.getBlob(A09.getColumnIndexOrThrow("chunk_lengths"));
                if (blob2 == null || (length = blob2.length) <= 0 || length % 4 != 0) {
                    iArr = null;
                } else {
                    int i = length / 4;
                    iArr = new int[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        int i3 = i2 * 4;
                        iArr[i2] = (blob2[i3 + 3] & 255) | ((blob2[i3] & 255) << 24) | ((blob2[i3 + 1] & 255) << 16) | ((blob2[i3 + 2] & 255) << 8);
                    }
                }
                C120155r3 r0 = new C120155r3(blob, iArr);
                A09.close();
                A042.close();
                return r0;
            }
            A09.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(AnonymousClass6Q6 r12, long j) {
        boolean z;
        AnonymousClass1M0 A05;
        byte[] bArr;
        if (r12 != null) {
            synchronized (r12) {
                z = r12.A01;
            }
            if (z) {
                byte[] A052 = r12.A05();
                int[] A06 = r12.A06();
                try {
                    A05 = this.A03.A05();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(j));
                    contentValues.put("sidecar", A052);
                    if (A06 == null) {
                        bArr = null;
                    } else {
                        int length = A06.length;
                        bArr = new byte[(length * 4)];
                        for (int i = 0; i < length; i++) {
                            int i2 = i * 4;
                            int i3 = A06[i];
                            bArr[i2 + 3] = (byte) i3;
                            bArr[i2 + 2] = (byte) (i3 >> 8);
                            bArr[i2 + 1] = (byte) (i3 >> 16);
                            bArr[i2] = (byte) (i3 >> 24);
                        }
                    }
                    contentValues.put("chunk_lengths", bArr);
                    contentValues.put("timestamp", Long.valueOf(C19970wo.A00(this.A00)));
                    A05.A02.A08("message_streaming_sidecar", "INSERT_MESSAGE_STREAMING_SIDECAR_SQL", contentValues, 5);
                    A05.close();
                    synchronized (r12) {
                        r12.A01 = false;
                    }
                    return;
                } catch (SQLiteConstraintException e) {
                    Log.e("SidecarMessageStore/insertStreamingSidecar/", e);
                    throw e;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public AnonymousClass1GF(C19970wo r2, AnonymousClass1DG r3, AnonymousClass176 r4, AnonymousClass12P r5, AnonymousClass1A1 r6) {
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4.A01;
    }
}
