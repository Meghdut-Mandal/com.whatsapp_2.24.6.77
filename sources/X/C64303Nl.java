package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Nl  reason: invalid class name and case insensitive filesystem */
public final class C64303Nl {
    public final long A00;
    public final AnonymousClass11F A01;
    public final UserJid A02;
    public final C64933Qa A03;

    public C64303Nl(Cursor cursor, AnonymousClass11F r5, UserJid userJid) {
        this.A01 = r5;
        this.A02 = userJid;
        this.A00 = cursor.getLong(3);
        this.A03 = new C64933Qa(r5, cursor.getString(4), cursor.getInt(1) != 1 ? false : true);
    }

    public C64303Nl(AnonymousClass11F r1, UserJid userJid, C64933Qa r3, long j) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = j;
        this.A03 = r3;
    }
}
