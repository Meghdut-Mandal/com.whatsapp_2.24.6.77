package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ex  reason: invalid class name and case insensitive filesystem */
public class C25081Ex {
    public final AnonymousClass12P A00;
    public final C219712j A01;

    public static void A01(C25081Ex r7, C46842bl r8, String str, String str2) {
        Cursor A09;
        boolean z = false;
        if (r8.A1N > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CatalogMessageStore/fillCatalogDataIfAvailable/message must have row_id set; key=");
        sb.append(r8.A1J);
        C18740tg.A0E(z, sb.toString());
        String[] strArr = {String.valueOf(r8.A1N)};
        AnonymousClass1M0 A04 = r7.A00.get();
        try {
            A09 = A04.A02.A09(str, str2, strArr);
            if (A09.moveToLast()) {
                r8.A00 = (UserJid) r7.A01.A0C(UserJid.class, A09.getLong(A09.getColumnIndexOrThrow("business_owner_jid")));
                r8.A02 = A09.getString(A09.getColumnIndexOrThrow("title"));
                r8.A01 = A09.getString(A09.getColumnIndexOrThrow("description"));
            }
            A09.close();
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

    public C25081Ex(C219712j r1, AnonymousClass12P r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static void A00(ContentValues contentValues, C25081Ex r3, C46842bl r4, long j) {
        contentValues.put("message_row_id", Long.valueOf(j));
        UserJid userJid = r4.A00;
        if (userJid != null) {
            contentValues.put("business_owner_jid", Long.valueOf(r3.A01.A07(userJid)));
        }
        AnonymousClass3SW.A01(contentValues, "title", r4.A02);
        AnonymousClass3SW.A01(contentValues, "description", r4.A01);
    }
}
