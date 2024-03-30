package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.1Ez  reason: invalid class name and case insensitive filesystem */
public class C25101Ez {
    public final AnonymousClass12P A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;

    public static void A01(C25101Ez r7, C46852bm r8, String str, String str2) {
        boolean z = false;
        if (r8.A1N > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ProductMessageStore/fillProductDataIfAvailable/message must have row_id set; key=");
        sb.append(r8.A1J);
        C18740tg.A0E(z, sb.toString());
        String[] strArr = {String.valueOf(r8.A1N)};
        AnonymousClass1M0 A04 = r7.A00.get();
        try {
            Cursor A09 = A04.A02.A09(str, str2, strArr);
            if (A09 != null) {
                try {
                    if (A09.moveToLast()) {
                        r8.A01 = (UserJid) r7.A02.A0C(UserJid.class, A09.getLong(A09.getColumnIndexOrThrow("business_owner_jid")));
                        r8.A06 = A09.getString(A09.getColumnIndexOrThrow("product_id"));
                        r8.A09 = A09.getString(A09.getColumnIndexOrThrow("title"));
                        r8.A02 = A09.getString(A09.getColumnIndexOrThrow("body"));
                        r8.A05 = A09.getString(A09.getColumnIndexOrThrow("footer"));
                        r8.A04 = A09.getString(A09.getColumnIndexOrThrow("description"));
                        String string = A09.getString(A09.getColumnIndexOrThrow("currency_code"));
                        r8.A03 = string;
                        if (!TextUtils.isEmpty(string)) {
                            r8.A0A = C129676Ia.A00(new C132386Tk(r8.A03), A09.getLong(A09.getColumnIndexOrThrow("amount_1000")));
                            r8.A0B = C129676Ia.A00(new C132386Tk(r8.A03), A09.getLong(A09.getColumnIndexOrThrow("sale_amount_1000")));
                        }
                        r8.A08 = A09.getString(A09.getColumnIndexOrThrow("retailer_id"));
                        r8.A07 = A09.getString(A09.getColumnIndexOrThrow("url"));
                        r8.A00 = A09.getInt(A09.getColumnIndexOrThrow("product_image_count"));
                    }
                } catch (IllegalArgumentException unused) {
                    r8.A03 = null;
                } catch (Throwable th) {
                    A09.close();
                    throw th;
                }
                A09.close();
            }
            A04.close();
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A02(C46852bm r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A1N > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ProductMessageStore/insertProductMessage/message must have row_id set; key=");
        C64933Qa r3 = r8.A1J;
        sb.append(r3);
        C18740tg.A0E(z2, sb.toString());
        boolean z3 = false;
        if (r8.A0H() == 1) {
            z3 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ProductMessageStore/insertProductMessage/message in main storage; key=");
        sb2.append(r3);
        C18740tg.A0E(z3, sb2.toString());
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            ContentValues contentValues = new ContentValues();
            A00(contentValues, this, r8, r8.A1N);
            if (A05.A02.A05("message_product", "INSERT_MESSAGE_PRODUCT_SQL", contentValues) == r8.A1N) {
                z = true;
            }
            C18740tg.A0F(z, "ProductMessageStore/insertProductMessage/inserted row should have same row_id");
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C25101Ez(AnonymousClass163 r1, C219712j r2, AnonymousClass12P r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }

    public static void A00(ContentValues contentValues, C25101Ez r4, C46852bm r5, long j) {
        contentValues.put("message_row_id", Long.valueOf(j));
        UserJid userJid = r5.A01;
        if (userJid != null) {
            contentValues.put("business_owner_jid", Long.valueOf(r4.A02.A07(userJid)));
        }
        AnonymousClass3SW.A01(contentValues, "product_id", r5.A06);
        AnonymousClass3SW.A01(contentValues, "title", r5.A09);
        AnonymousClass3SW.A01(contentValues, "description", r5.A04);
        String str = r5.A03;
        if (!(str == null || r5.A0A == null)) {
            contentValues.put("currency_code", str);
            BigDecimal bigDecimal = r5.A0A;
            BigDecimal bigDecimal2 = C129676Ia.A00;
            contentValues.put("amount_1000", Long.valueOf(bigDecimal.multiply(bigDecimal2).longValue()));
            BigDecimal bigDecimal3 = r5.A0B;
            if (bigDecimal3 != null) {
                contentValues.put("sale_amount_1000", Long.valueOf(bigDecimal3.multiply(bigDecimal2).longValue()));
            }
        }
        AnonymousClass3SW.A01(contentValues, "retailer_id", r5.A08);
        AnonymousClass3SW.A01(contentValues, "url", r5.A07);
        contentValues.put("product_image_count", Integer.valueOf(r5.A00));
        AnonymousClass3SW.A01(contentValues, "body", r5.A02);
        AnonymousClass3SW.A01(contentValues, "footer", r5.A05);
    }
}
