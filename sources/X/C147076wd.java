package X;

import com.whatsapp.R;
import com.whatsapp.glasses.SUPBottomSheetView;
import com.whatsapp.glasses.layouts.SupToggle;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6wd  reason: invalid class name and case insensitive filesystem */
public final class C147076wd implements AnonymousClass7hB {
    public int A00;
    public int A01;
    public AnonymousClass17Y A02;
    public C19630wG A03;
    public SUPBottomSheetView A04;
    public SupToggle A05;
    public AnonymousClass6n9 A06;
    public C131146Nx A07;
    public AnonymousClass005 A08;
    public AnonymousClass00S A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C;
    public boolean A0D;
    public final Map A0E;
    public final Set A0F;

    public void Biz(int i) {
        AnonymousClass00S r0;
        if (i == 3) {
            this.A00--;
        } else {
            Log.e("sup:VoipGlassesManager.kt Network resource download failure!");
        }
        if (this.A00 <= 0 && (r0 = this.A09) != null) {
            r0.invoke();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147076wd r4) {
        /*
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x0009
            boolean r0 = r4.A0A
            r4 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r4 = 1
        L_0x000a:
            X.9nR r0 = X.C108915Vl.A00
            if (r0 == 0) goto L_0x0027
            X.9gt r3 = r0.A0B
            boolean r0 = r3.A0R
            if (r0 == r4) goto L_0x0025
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "msc:shouldIgnoreSGCameraRequests = "
            java.lang.String r1 = X.C36371kC.A0z(r0, r1, r4)
            java.lang.String r0 = "sup:MediaStreamController"
            r2.A01(r0, r1)
        L_0x0025:
            r3.A0R = r4
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147076wd.A00(X.6wd):void");
    }

    public static final void A01(C147076wd r4) {
        C203169nR r0 = C108915Vl.A00;
        if (r0 != null) {
            AnonymousClass3FS r3 = r0.A02;
            AnonymousClass17Y r2 = r4.A02;
            if (r2 != null) {
                r2.A0H(new C81193wc(r4, r3, 45));
                return;
            }
            throw C36321k7.A06();
        }
    }

    public void A02() {
        C203169nR r4 = C108915Vl.A00;
        if (r4 != null) {
            C200219gt r5 = r4.A0B;
            C200159gk r2 = AnonymousClass9AO.A01;
            r2.A01("sup:MediaStreamController", "msc:release");
            if (!r5.A0M) {
                r2.A01("sup:MediaStreamController", "msc, not initialized, returning");
            } else {
                if (r5.A0K) {
                    r5.A05();
                    r5.A04();
                }
                r5.A02().A03();
                r5.A0V.set(false);
                r5.A0M = false;
                r5.A0L = false;
                r5.A0U.set(false);
                C36341k9.A0H().postDelayed(new C1497572q(r5, 30), 500);
            }
            r4.A02 = AnonymousClass21D.A00;
        }
        A01(this);
    }

    public C147076wd() {
        AnonymousClass011[] r2 = new AnonymousClass011[4];
        r2[0] = C36421kH.A0j(C108415Tk.SG_BLUETOOTH_ICON, R.id.bluetooth_icon);
        C36341k9.A1J(C108415Tk.SG_CLOSE_ICON, Integer.valueOf(R.id.sup_toggle_close_icon), r2, 1);
        r2[2] = C36421kH.A0j(C108415Tk.SG_GLASSES_ICON, R.id.sup_toggle_icon);
        r2[3] = C36421kH.A0j(C108415Tk.SG_GLASSES_TILE_BACKGROUND, R.id.glasses_tile_background);
        this.A0E = C000400e.A07(r2);
        C108415Tk[] r22 = {C108415Tk.SG_BATTERY_LOW_ICON, C108415Tk.SG_BATTERY_MID_ICON, C108415Tk.SG_BATTERY_FULL_ICON, C108415Tk.SG_ERROR_ICON, C108415Tk.SG_THERMAL_HIGH_ICON, C108415Tk.SG_THERMAL_MID_ICON, C108415Tk.SG_BATTERY_ZERO_ICON};
        AnonymousClass00C.A0D(r22, 0);
        this.A0F = AnonymousClass02R.A0E(r22);
    }
}
