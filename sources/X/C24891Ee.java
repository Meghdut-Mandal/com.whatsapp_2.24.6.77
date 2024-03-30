package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1Ee  reason: invalid class name and case insensitive filesystem */
public class C24891Ee {
    public final AnonymousClass12P A00;
    public final C20810yC A01;

    private C135106c9 A00(Cursor cursor, String str) {
        Cursor cursor2 = cursor;
        String str2 = str;
        if (str == null) {
            str2 = cursor2.getString(cursor2.getColumnIndexOrThrow("background_id"));
        }
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("file_size"));
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("width"));
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("height"));
        C135106c9 r10 = new C135106c9(str2, cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type")), cursor2.getString(cursor2.getColumnIndexOrThrow("fullsize_url")), cursor2.getString(cursor2.getColumnIndexOrThrow("description")), cursor2.getString(cursor2.getColumnIndexOrThrow("lg")), i, i2, cursor2.getInt(cursor2.getColumnIndexOrThrow("placeholder_color")), cursor2.getInt(cursor2.getColumnIndexOrThrow("text_color")), cursor2.getInt(cursor2.getColumnIndexOrThrow("subtext_color")), j);
        C20810yC r9 = this.A01;
        C21000yV r7 = C21000yV.A02;
        if (C20800yB.A01(r7, r9, 1084)) {
            byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("media_key"));
            long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("media_key_timestamp"));
            String string = cursor2.getString(cursor2.getColumnIndexOrThrow("file_sha256"));
            String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("file_enc_sha256"));
            String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("direct_path"));
            boolean A012 = C20800yB.A01(r7, r9, 1084);
            r10.A08 = blob;
            r10.A00 = j2;
            r10.A04 = string;
            r10.A03 = string2;
            r10.A02 = string3;
            r10.A07 = A012;
        }
        return r10;
    }

    public static ArrayList A01(C24891Ee r5, String str, String str2) {
        Cursor A09;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A04 = r5.A00.get();
        try {
            A09 = A04.A02.A09(str, str2, (String[]) null);
            while (A09.moveToNext()) {
                arrayList.add(r5.A00(A09, (String) null));
            }
            A09.close();
            A04.close();
            return arrayList;
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

    public static void A02(C26911Lz r8, C135106c9 r9, C24891Ee r10, String str) {
        byte[] bArr;
        long j;
        String str2;
        String str3;
        int i;
        String str4 = r9.A05;
        boolean z = !TextUtils.isEmpty(str4);
        boolean A012 = C20800yB.A01(C21000yV.A02, r10.A01, 1084);
        ContentValues contentValues = new ContentValues(15);
        String str5 = r9.A0F;
        contentValues.put("background_id", str5);
        contentValues.put("file_size", Long.valueOf(r9.A0E));
        contentValues.put("width", Integer.valueOf(r9.A0D));
        contentValues.put("height", Integer.valueOf(r9.A09));
        contentValues.put("mime_type", r9.A0G);
        contentValues.put("placeholder_color", Integer.valueOf(r9.A0A));
        contentValues.put("text_color", Integer.valueOf(r9.A0C));
        contentValues.put("subtext_color", Integer.valueOf(r9.A0B));
        String str6 = null;
        if (A012) {
            bArr = r9.A08;
        } else {
            bArr = null;
        }
        AnonymousClass3SW.A03(contentValues, "media_key", bArr);
        if (A012) {
            j = r9.A00;
        } else {
            j = 0;
        }
        contentValues.put("media_key_timestamp", Long.valueOf(j));
        if (A012) {
            str2 = r9.A04;
        } else {
            str2 = null;
        }
        AnonymousClass3SW.A01(contentValues, "file_sha256", str2);
        if (A012) {
            str3 = r9.A03;
        } else {
            str3 = null;
        }
        AnonymousClass3SW.A01(contentValues, "file_enc_sha256", str3);
        if (A012) {
            str6 = r9.A02;
        }
        AnonymousClass3SW.A01(contentValues, "direct_path", str6);
        if (z) {
            contentValues.put("fullsize_url", str4);
            AnonymousClass3SW.A01(contentValues, "description", r9.A01);
            AnonymousClass3SW.A01(contentValues, "lg", r9.A06);
            i = 5;
        } else {
            i = 4;
        }
        if (((AnonymousClass1M0) r8).A02.A08("payment_background", str, contentValues, i) == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/shouldReplace: ");
            sb.append(z);
            sb.append(", failed for id: ");
            sb.append(str5);
            Log.e(sb.toString());
        }
    }

    public C135106c9 A03(String str) {
        Cursor A09;
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentBackgroundStore/getPaymentBackgroundById/id=");
        sb.append(str);
        Log.i(sb.toString());
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background WHERE background_id =?", "payments/QUERY_PAYMENT_BACKGROUND_BY_ID", new String[]{str});
            if (A09.moveToNext()) {
                C135106c9 A002 = A00(A09, str);
                A09.close();
                A04.close();
                return A002;
            }
            A09.close();
            A04.close();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: PaymentBackgroundStore/getPaymentBackgroundById/no background found for id=");
            sb2.append(str);
            Log.i(sb2.toString());
            return null;
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

    public void A04(C135106c9 r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/id=");
        sb.append(r4.A0F);
        Log.i(sb.toString());
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            A02(A05, r4, this, "payments/INSERT_PAYMENT_BACKGROUND");
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C24891Ee(AnonymousClass12P r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
