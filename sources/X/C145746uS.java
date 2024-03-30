package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.6uS  reason: invalid class name and case insensitive filesystem */
public final class C145746uS implements C160647lM {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ Toolbar A01;
    public final /* synthetic */ C225314u A02;
    public final /* synthetic */ AnonymousClass6CU A03;
    public final /* synthetic */ boolean A04;

    public void BWD(int i) {
    }

    public void BgQ(View view) {
    }

    public void Bgp(View view, float f) {
        float f2;
        float f3 = ((float) 1) - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        this.A00.setAlpha((int) (((float) 255) * f2));
        this.A01.setAlpha(f2);
        AnonymousClass6CU r4 = this.A03;
        int i = r4.A01;
        if (i != 0) {
            C225314u r3 = this.A02;
            r3.getWindow().setStatusBarColor(C018107s.A03(f2, i, -16777216));
            r3.getWindow().setNavigationBarColor(C018107s.A03(f2, r4.A00, -16777216));
        }
    }

    public C145746uS(Drawable drawable, Toolbar toolbar, C225314u r3, AnonymousClass6CU r4, boolean z) {
        this.A04 = z;
        this.A02 = r3;
        this.A00 = drawable;
        this.A01 = toolbar;
        this.A03 = r4;
    }

    public void BVs(View view) {
        boolean z = this.A04;
        C225314u r0 = this.A02;
        if (z) {
            r0.onBackPressed();
        } else {
            C36351kA.A11(r0);
        }
    }

    public /* synthetic */ boolean BLc(View view) {
        return true;
    }
}
