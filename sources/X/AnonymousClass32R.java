package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.32R  reason: invalid class name */
public final class AnonymousClass32R {
    public final C63593Kq A00;

    public AnonymousClass32R(Cursor cursor, UserJid userJid) {
        C18740tg.A06(userJid);
        C63593Kq r2 = new C63593Kq(userJid);
        this.A00 = r2;
        r2.A00 = cursor.getDouble(1);
        r2.A01 = cursor.getDouble(2);
        r2.A03 = cursor.getInt(3);
        r2.A02 = cursor.getFloat(4);
        r2.A04 = cursor.getInt(5);
        r2.A05 = cursor.getLong(6);
    }
}
