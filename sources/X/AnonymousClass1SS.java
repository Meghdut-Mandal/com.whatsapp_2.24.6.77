package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1SS  reason: invalid class name */
public class AnonymousClass1SS {
    public final C19700wN A00;
    public final C219712j A01;
    public final AnonymousClass12P A02;

    public void A00(AnonymousClass2bO r8) {
        Long l;
        UserJid userJid;
        boolean z = false;
        boolean z2 = false;
        if (r8.A1N > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RevokedMessageStore/insertOrUpdateRevokedMessage/message must have row_id set; key=");
        C64933Qa r3 = r8.A1J;
        sb.append(r3);
        C18740tg.A0E(z2, sb.toString());
        boolean z3 = false;
        if (r8.A0H() == 1) {
            z3 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RevokedMessageStore/insertOrUpdateRevokedMessage/message in main storage; key=");
        sb2.append(r3);
        C18740tg.A0E(z3, sb2.toString());
        AnonymousClass1M0 A05 = this.A02.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r8.A1N));
            AnonymousClass3SW.A01(contentValues, "revoked_key_id", r8.A01);
            if (!(r8 instanceof AnonymousClass2c8) || (userJid = ((AnonymousClass2c8) r8).A00) == null) {
                l = null;
            } else {
                l = Long.valueOf(this.A01.A07(userJid));
            }
            AnonymousClass3SW.A00(contentValues, l, "admin_jid_row_id");
            contentValues.put("revoke_timestamp", Long.valueOf(r8.A00));
            if (A05.A02.A08("message_revoked", "INSERT_MESSAGE_REVOKED_SQL", contentValues, 5) == r8.A1N) {
                z = true;
            }
            C18740tg.A0F(z, "RevokedMessageStore/insertOrUpdateRevokedMessage/inserted row should have same row_id");
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1SS(C19700wN r1, C219712j r2, AnonymousClass12P r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
