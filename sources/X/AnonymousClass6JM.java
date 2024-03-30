package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6JM  reason: invalid class name */
public final class AnonymousClass6JM {
    public final C229716r A00;

    public AnonymousClass6JM(C229716r r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass6E1 A00(Cursor cursor, UserJid userJid, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i12 = cursor.getInt(i);
        String A0Z = C90494aF.A0Z(cursor, i2);
        boolean A002 = C54282sh.A00(cursor, i3);
        String A0Z2 = C90494aF.A0Z(cursor, i4);
        String A0Z3 = C90494aF.A0Z(cursor, i5);
        int i13 = i6;
        String str = null;
        if (cursor.isNull(i13)) {
            string = null;
        } else {
            string = cursor.getString(i13);
        }
        int i14 = i7;
        if (cursor.isNull(i14)) {
            string2 = null;
        } else {
            string2 = cursor.getString(i14);
        }
        int i15 = i8;
        if (cursor.isNull(i15)) {
            string3 = null;
        } else {
            string3 = cursor.getString(i15);
        }
        int i16 = i9;
        if (cursor.isNull(i16)) {
            string4 = null;
        } else {
            string4 = cursor.getString(i16);
        }
        int i17 = i10;
        if (cursor.isNull(i17)) {
            string5 = null;
        } else {
            string5 = cursor.getString(i17);
        }
        int i18 = i11;
        if (!cursor.isNull(i18)) {
            str = cursor.getString(i18);
        }
        return new AnonymousClass6E1(userJid, A0Z, A0Z2, A0Z3, str, string2, string3, string4, C129326Gl.A01(string), AnonymousClass3LO.A01(string5), i12, A002);
    }
}
