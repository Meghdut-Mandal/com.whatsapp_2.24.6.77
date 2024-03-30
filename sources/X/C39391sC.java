package X;

import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

/* renamed from: X.1sC  reason: invalid class name and case insensitive filesystem */
public class C39391sC extends AnonymousClass07T implements AnonymousClass1RE {
    public final AnonymousClass35O[] A00 = new AnonymousClass35O[2];
    public final /* synthetic */ C47072cl A01;

    public int A0H() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39391sC(AnonymousClass01z r2, C47072cl r3) {
        super(r2, 0);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r5 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0F(int r5) {
        /*
            r4 = this;
            X.2cl r3 = r4.A01
            X.0ts r0 = r3.A0H
            boolean r2 = X.C36351kA.A1Y(r0)
            r1 = 1
            if (r5 == 0) goto L_0x0014
            if (r5 == r1) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0014:
            r2 = r2 ^ 1
        L_0x0016:
            r0 = 2131888311(0x7f1208b7, float:1.9411254E38)
            if (r2 == 0) goto L_0x0020
            if (r2 != r1) goto L_0x000d
            r0 = 2131888321(0x7f1208c1, float:1.9411274E38)
        L_0x0020:
            java.lang.String r0 = r3.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39391sC.A0F(int):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r3 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02E A0M(int r3) {
        /*
            r2 = this;
            X.2cl r0 = r2.A01
            X.0ts r0 = r0.A0H
            boolean r1 = X.C36351kA.A1Y(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0014
            if (r3 == r0) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0014:
            r1 = r1 ^ 1
        L_0x0016:
            if (r1 == 0) goto L_0x0020
            if (r1 != r0) goto L_0x000d
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r0 = new com.whatsapp.qrcode.contactqr.QrScanCodeFragment
            r0.<init>()
            return r0
        L_0x0020:
            com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment r0 = new com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39391sC.A0M(int):X.02E");
    }

    public View BF1(int i) {
        AnonymousClass35O[] r3 = this.A00;
        if (r3[i] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A07;
            AnonymousClass35O r2 = new AnonymousClass35O(C36361kB.A0E(C36351kA.A0C(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.f9nameremoved));
            CharSequence A0F = A0F(i);
            C18740tg.A06(A0F);
            r2.A01.setText(A0F);
            r3[i] = r2;
        }
        return r3[i].A00;
    }
}
