package X;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: X.6Lp  reason: invalid class name and case insensitive filesystem */
public class C130576Lp {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;
    public final byte[] A0A;

    public static C130576Lp A00(Cursor cursor) {
        String str;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("local_path");
        byte[] bArr = null;
        if (!cursor.isNull(columnIndexOrThrow)) {
            str = cursor.getString(columnIndexOrThrow);
        } else {
            str = null;
        }
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("media_key"));
        if (blob.length == 0) {
            blob = null;
        }
        String A0f = C36341k9.A0f(cursor, "media_hash");
        if (TextUtils.isEmpty(A0f)) {
            A0f = null;
        }
        String A0f2 = C36341k9.A0f(cursor, "direct_path");
        if (TextUtils.isEmpty(A0f2)) {
            A0f2 = null;
        }
        String A0f3 = C36341k9.A0f(cursor, "media_enc_hash");
        if (TextUtils.isEmpty(A0f3)) {
            A0f3 = null;
        }
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("inline_payload");
        if (!cursor.isNull(columnIndexOrThrow2)) {
            bArr = cursor.getBlob(columnIndexOrThrow2);
        }
        return new C130576Lp(str, A0f, A0f2, A0f3, C36341k9.A0f(cursor, "message_id"), blob, bArr, C36351kA.A03(cursor, "sync_type"), C36351kA.A03(cursor, "chunk_order"), C36351kA.A07(cursor, "file_size"), C36351kA.A07(cursor, "start_time"));
    }

    public C130576Lp(String str, String str2, String str3, String str4, String str5, byte[] bArr, byte[] bArr2, int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = i2;
        this.A0A = bArr;
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A09 = bArr2;
        this.A08 = str5;
        this.A03 = j2;
    }
}
