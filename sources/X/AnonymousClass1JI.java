package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.1JI  reason: invalid class name */
public class AnonymousClass1JI {
    public C34121gU A00;
    public Boolean A01;
    public String A02;
    public final C21430zE A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass1JJ A05;
    public final C20810yC A06;
    public final C21010yW A07;
    public final AnonymousClass1JK A08;

    public static boolean A00(AnonymousClass1JI r3) {
        Boolean bool = r3.A01;
        if (bool == null) {
            bool = Boolean.valueOf(new C18950u5(1, 1, 1, false).A00());
            r3.A01 = bool;
        }
        return bool.booleanValue();
    }

    public void A03(Window window, int i) {
        if (this.A00 != null) {
            C21430zE r4 = this.A03;
            r4.markerStart(689639794);
            if (C20800yB.A01(C21000yV.A02, this.A06, 6084)) {
                r4.BPD(new C77263qD(this), 689639794);
            }
            this.A00.Bfv(window, i, A00(this), r4.BMN(689639794));
        }
    }

    public AnonymousClass1JI(AnonymousClass1JJ r1, C20810yC r2, C21010yW r3, AnonymousClass1JK r4, C21430zE r5, AnonymousClass005 r6) {
        this.A03 = r5;
        this.A06 = r2;
        this.A07 = r3;
        this.A05 = r1;
        this.A04 = r6;
        this.A08 = r4;
    }

    public void A01(Activity activity) {
        C34121gU r0;
        if ((A00(this) || this.A03.BPJ(689639794)) && this.A00 == null) {
            boolean A012 = C20800yB.A01(C21000yV.A01, this.A06, 5025);
            C21010yW r3 = this.A07;
            C21430zE r2 = this.A03;
            AnonymousClass1JJ r1 = this.A05;
            if (A012) {
                r0 = new AH6(activity, r1, r3, r2);
            } else {
                r0 = new C34131gV(activity, r1, r3, r2);
            }
            this.A00 = r0;
        }
    }

    public void A02(Window window) {
        C34121gU r0;
        if ((A00(this) || this.A03.BMN(689639794)) && (r0 = this.A00) != null) {
            r0.Bfw(window);
        }
    }
}
