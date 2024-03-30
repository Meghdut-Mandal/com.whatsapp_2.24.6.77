package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2br  reason: invalid class name and case insensitive filesystem */
public class C46902br extends AnonymousClass2bL implements AnonymousClass4RU {
    public int A00;
    public long A01;
    public C63593Kq A02;
    public String A03;

    public C46902br(C64933Qa r10, C46902br r11, long j) {
        super(r10, r11, r11.A1I, j, true);
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A03 = r11.A03;
        this.A02 = r11.A02;
    }

    public AnonymousClass3T1 B32(C64933Qa r4) {
        return new C46902br(r4, this, this.A0I);
    }

    public void A1Y(Cursor cursor, C19730wQ r11) {
        UserJid A0L;
        super.A1Y(cursor, r11);
        this.A00 = C36351kA.A03(cursor, "live_location_share_duration");
        this.A01 = C36351kA.A07(cursor, "live_location_sequence_number");
        double A002 = C36431kI.A00(cursor, "live_location_final_latitude");
        double A003 = C36431kI.A00(cursor, "live_location_final_longitude");
        long A07 = C36351kA.A07(cursor, "live_location_final_timestamp");
        if (A002 != 0.0d || A003 != 0.0d || A07 != 0) {
            if (this.A1J.A02) {
                A0L = r11.A08();
            } else {
                A0L = A0L();
            }
            C18740tg.A06(A0L);
            C63593Kq r0 = new C63593Kq(A0L);
            r0.A00 = A002;
            r0.A01 = A003;
            r0.A05 = A07;
            this.A02 = r0;
        }
    }

    public int A1Z() {
        return this.A00;
    }

    public C46902br(C64933Qa r2, long j) {
        super(r2, 16, j);
    }
}
