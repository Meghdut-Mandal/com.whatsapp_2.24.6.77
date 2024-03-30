package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3Er  reason: invalid class name and case insensitive filesystem */
public final class C62073Er {
    public final AnonymousClass01I A00;
    public final C225014r A01;
    public final C64693Pb A02;
    public final C24341Cb A03;
    public final C20060wx A04;
    public final AnonymousClass141 A05;
    public final AnonymousClass11F A06;

    public boolean A00() {
        if (this.A03.A02()) {
            Log.w("ExportChatAction/execute/need-sd-card");
            C225014r r2 = this.A01;
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            r2.BO5(i);
            return true;
        }
        this.A02.A02(this.A00, this.A01, this.A05, this.A06);
        return true;
    }

    public C62073Er(AnonymousClass01I r1, C225014r r2, C64693Pb r3, C24341Cb r4, C20060wx r5, AnonymousClass141 r6, AnonymousClass11F r7) {
        C36321k7.A1B(r5, r4, r3, r7, r6);
        C36321k7.A10(r2, r1);
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
        this.A00 = r1;
    }
}
