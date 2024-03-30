package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.RequestPermissionActivity;
import java.util.List;

/* renamed from: X.1dO  reason: invalid class name and case insensitive filesystem */
public final class C32341dO {
    public final AnonymousClass17Y A00;
    public final C19630wG A01;
    public final C20830yE A02;
    public final AnonymousClass1Q1 A03;
    public final C20410xW A04;
    public final C28201Rs A05 = new C28201Rs();
    public final AnonymousClass00T A06 = new AnonymousClass00U(new C32361dQ(this));
    public final AnonymousClass00T A07 = new AnonymousClass00U(new C32351dP(this));
    public final C19420v0 A08;
    public final C19770wU A09;

    public C32341dO(AnonymousClass17Y r3, C19630wG r4, C20830yE r5, C19420v0 r6, AnonymousClass1Q1 r7, C20410xW r8, C19770wU r9) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r9, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r8, 7);
        this.A00 = r3;
        this.A01 = r4;
        this.A09 = r9;
        this.A03 = r7;
        this.A02 = r5;
        this.A08 = r6;
        this.A04 = r8;
    }

    private final boolean A00(Activity activity, AnonymousClass02E r9, C158487ha r10, String str, List list) {
        boolean A0G;
        C20830yE r1 = this.A02;
        Activity activity2 = activity;
        if (!r1.A0D()) {
            AnonymousClass3US r0 = RequestPermissionActivity.A0B;
            if (r9 != null) {
                A0G = r0.A0K(r9, r1);
            } else {
                A0G = r0.A0G(activity, r1);
            }
            if (!A0G) {
                return false;
            }
        }
        this.A09.Boy(new C35541ir(activity2, r10, this, str, list));
        return true;
    }

    public final boolean A03(Activity activity, AnonymousClass02E r9, String str, List list) {
        AnonymousClass00C.A0D(list, 0);
        return A00(activity, r9, (C148496yx) this.A06.getValue(), str, list);
    }

    public final boolean A04(Activity activity, AnonymousClass02E r9, String str, List list) {
        AnonymousClass00C.A0D(list, 0);
        return A00(activity, r9, (C148506yy) this.A07.getValue(), str, list);
    }

    public final void A01(Intent intent) {
        if (intent != null) {
            C19420v0 r4 = this.A08;
            boolean z = ((SharedPreferences) r4.A00.get()).getBoolean("is_status_sharing_with_fb_disabled", false);
            boolean booleanExtra = intent.getBooleanExtra("feature_disabled", z);
            if (booleanExtra != z) {
                C19420v0.A00(r4).putBoolean("is_status_sharing_with_fb_disabled", booleanExtra).apply();
            }
        }
    }

    public final boolean A02() {
        C161257mS[] r3 = ((C148496yx) this.A06.getValue()).A00;
        int i = 0;
        while (true) {
            if (!r3[i].BNf()) {
                i++;
                if (i >= 2) {
                    break;
                }
            } else if (((SharedPreferences) this.A08.A00.get()).getBoolean("is_status_sharing_with_fb_disabled", false)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
