package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3dQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69373dQ implements C22916AyS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C225314u A03;
    public final /* synthetic */ C64723Pe A04;
    public final /* synthetic */ C207269up A05;
    public final /* synthetic */ C196089Xp A06;
    public final /* synthetic */ AnonymousClass11F A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ List A09;

    public /* synthetic */ C69373dQ(C225314u r1, C64723Pe r2, C207269up r3, C196089Xp r4, AnonymousClass11F r5, UserJid userJid, List list, int i, int i2, long j) {
        this.A04 = r2;
        this.A00 = i;
        this.A09 = list;
        this.A03 = r1;
        this.A01 = i2;
        this.A07 = r5;
        this.A05 = r3;
        this.A08 = userJid;
        this.A02 = j;
        this.A06 = r4;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        C64723Pe r5 = this.A04;
        int i = this.A00;
        List list = this.A09;
        C225314u r3 = this.A03;
        int i2 = this.A01;
        AnonymousClass11F r8 = this.A07;
        C207269up r6 = this.A05;
        UserJid userJid = this.A08;
        long j = this.A02;
        C196089Xp r7 = this.A06;
        C79593ty r4 = new C79593ty();
        r4.A0B(new C79583tx(r3, r4, r5, r6, r7, r8, userJid, list, i, i2, j, z), r5.A01.A04);
        r5.A07.Boy(new C1503374w(r5, r4, bitmap, 37));
    }
}
