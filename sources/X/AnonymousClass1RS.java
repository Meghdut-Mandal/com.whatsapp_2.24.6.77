package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.1RS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1RS implements AnonymousClass1RR {
    public final /* synthetic */ HomeActivity A00;

    public /* synthetic */ AnonymousClass1RS(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public final void BZA(View view, ViewGroup viewGroup, String str, int i) {
        ImageView.ScaleType scaleType;
        HomeActivity homeActivity = this.A00;
        if (homeActivity.A0J == null) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            homeActivity.A0J = viewGroup2;
            WaImageView waImageView = (WaImageView) viewGroup2.findViewById(R.id.toolbar_logo);
            homeActivity.A0k = waImageView;
            if (C18820ts.A00(homeActivity.A00).A06) {
                scaleType = ImageView.ScaleType.FIT_END;
            } else {
                scaleType = ImageView.ScaleType.FIT_START;
            }
            waImageView.setScaleType(scaleType);
            homeActivity.A0M.addView(homeActivity.A0J);
            homeActivity.A0J.setVisibility(homeActivity.A05);
            int i2 = homeActivity.A06;
            if (i2 != 0) {
                homeActivity.A06 = i2;
                WaImageView waImageView2 = homeActivity.A0k;
                if (waImageView2 != null) {
                    ViewGroup.LayoutParams layoutParams = waImageView2.getLayoutParams();
                    layoutParams.height = homeActivity.getResources().getDimensionPixelSize(i2);
                    homeActivity.A0k.setLayoutParams(layoutParams);
                }
            }
            int i3 = homeActivity.A04;
            if (i3 != 0) {
                homeActivity.A04 = i3;
                WaImageView waImageView3 = homeActivity.A0k;
                if (waImageView3 != null) {
                    AnonymousClass06T.A00(ColorStateList.valueOf(AnonymousClass00F.A00(homeActivity, i3)), waImageView3);
                }
            }
        }
    }
}
