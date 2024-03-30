package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.A9v  reason: case insensitive filesystem */
public final class C21135A9v implements C87734Py {
    public final AnonymousClass9XI A00;
    public final AnonymousClass9Y1 A01;
    public final C202279lS A02;
    public final C199439fJ A03;
    public final C25791Hr A04;
    public final AnonymousClass9UB A05;
    public final C20310xM A06;

    public void BlQ(Context context, AnonymousClass3T1 r10, C207219uk r11, int i) {
        AnonymousClass3T1 r5 = r10;
        UserJid A0L = r10.A0L();
        if (A0L != null) {
            this.A04.A01(A0L, r10, 5);
        }
        C207219uk r6 = r11;
        C206819u1 r7 = r11.A05;
        if (r7 != null) {
            int i2 = r11.A00;
            if (i2 == 2 || i2 == 6) {
                this.A00.A02(r7.A00).A0A(new ATI(context, this, r5, r6, r7));
            }
        }
    }

    public C21135A9v(AnonymousClass9XI r2, AnonymousClass9Y1 r3, C202279lS r4, C199439fJ r5, C25791Hr r6, AnonymousClass9UB r7, C20310xM r8) {
        C36321k7.A1B(r8, r4, r3, r2, r5);
        AnonymousClass00C.A0D(r6, 7);
        this.A06 = r8;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
    }
}
