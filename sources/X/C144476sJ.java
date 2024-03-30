package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6sJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144476sJ implements C87714Pw {
    public final /* synthetic */ AnonymousClass5K1 A00;

    public /* synthetic */ C144476sJ(AnonymousClass5K1 r1) {
        this.A00 = r1;
    }

    public final void BR1(String str) {
        AnonymousClass5K1 r5 = this.A00;
        WaTextView waTextView = r5.A05;
        waTextView.setVisibility(0);
        int textSize = ((int) waTextView.getTextSize()) + (r5.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
        LinearLayout linearLayout = r5.A04;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.width;
        if (i < textSize) {
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(i2, textSize, C36421kH.A01(C36401kF.A1X(r5.A01) ? 1 : 0) | 80));
        }
    }
}
