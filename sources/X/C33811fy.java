package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.1fy  reason: invalid class name and case insensitive filesystem */
public class C33811fy implements C33681fl {
    public View A00;
    public final C33571fa A01;
    public final C19460v5 A02;
    public final C19460v5 A03;
    public final C19970wo A04;
    public final C19630wG A05;
    public final C19420v0 A06;
    public final C20810yC A07;
    public final C33621ff A08;

    private View A00() {
        if (this.A00 == null) {
            C33571fa r3 = this.A01;
            View inflate = LayoutInflater.from(r3.getContext()).inflate(R.layout.f9nameremoved, r3, false);
            this.A00 = inflate;
            inflate.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        return this.A00;
    }

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void BwS() {
        if (this.A00 == null) {
            this.A01.addView(A00());
        }
        A00().setVisibility(8);
    }

    public C33811fy(C19460v5 r1, C19460v5 r2, C33571fa r3, C19970wo r4, C19630wG r5, C19420v0 r6, C20810yC r7, C33621ff r8) {
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A02 = r1;
        this.A01 = r3;
        this.A06 = r6;
        this.A03 = r2;
        this.A08 = r8;
    }

    public boolean Bt0() {
        return false;
    }
}
