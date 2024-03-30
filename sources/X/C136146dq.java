package X;

import android.widget.SeekBar;
import com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1;
import com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1;

/* renamed from: X.6dq  reason: invalid class name and case insensitive filesystem */
public final class C136146dq implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C100384uv A00;
    public final /* synthetic */ C1271967i A01;
    public final /* synthetic */ C140456lc A02;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C136146dq(C100384uv r1, C1271967i r2, C140456lc r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C1271967i r2 = this.A01;
        C140456lc r3 = this.A02;
        C120765s2 r1 = (C120765s2) C133266Xn.A05(r2, r3);
        if (r1 != null) {
            C128436Cg r0 = r1.A02;
            int i2 = i;
            if (r0 != null) {
                r0.A00 = i;
                C100384uv.A01(r0.A02);
            }
            C128436Cg r02 = r1.A02;
            if (r02 != null && !r02.A04) {
                C160377ku A0X = r3.A0X(42);
                C005502l r03 = C006702x.A00;
                C36331k8.A1T(new ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(r2, r3, A0X, (C023509x) null, i2), C009403z.A02(AnonymousClass03K.A00));
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C128436Cg r2;
        C1271967i r3 = this.A01;
        C140456lc r4 = this.A02;
        C120765s2 r0 = (C120765s2) C133266Xn.A05(r3, r4);
        if (r0 != null && (r2 = r0.A02) != null && r2.A04) {
            C160377ku A0X = r4.A0X(42);
            C005502l r02 = C006702x.A00;
            C36331k8.A1T(new ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1(r2, r3, r4, A0X, (C023509x) null), C009403z.A02(AnonymousClass03K.A00));
        }
    }
}
