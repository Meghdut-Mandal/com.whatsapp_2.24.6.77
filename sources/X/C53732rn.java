package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2rn  reason: invalid class name and case insensitive filesystem */
public abstract class C53732rn {
    public static AnonymousClass3L0 A00(Cursor cursor) {
        UserJid A0l = C36431kI.A0l(cursor.getString(1));
        if (A0l == null) {
            return null;
        }
        boolean A00 = C197029b1.A00(A0l);
        long j = cursor.getLong(2);
        String string = cursor.getString(3);
        String string2 = cursor.getString(5);
        int i = cursor.getInt(9);
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 0;
                }
            }
        }
        return new AnonymousClass3L0(A0l, new C80113ur(AnonymousClass3MC.A01(cursor.getString(12)), cursor.getLong(14), AnonymousClass3MC.A00(cursor.getString(13))), string, string2, i2, cursor.getInt(11), j, A00);
    }
}
