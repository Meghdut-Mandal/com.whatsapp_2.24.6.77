package X;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.3q8  reason: invalid class name and case insensitive filesystem */
public final class C77213q8 implements AnonymousClass4UV {
    public int A00;
    public int A01 = 1;
    public final WaImageView A02;
    public final WaImageView A03;
    public final FrameLayout A04;

    public C77213q8(FrameLayout frameLayout) {
        this.A04 = frameLayout;
        WaImageView waImageView = new WaImageView(frameLayout.getContext());
        int i = C222013h.A07 ? R.drawable.input_mic_white_filled_wds : R.drawable.input_mic_white;
        waImageView.setVisibility(8);
        waImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        waImageView.setImageResource(i);
        frameLayout.addView(waImageView);
        this.A03 = waImageView;
        WaImageView waImageView2 = new WaImageView(frameLayout.getContext());
        int i2 = C222013h.A07 ? R.drawable.input_camera_white_filled_wds : R.drawable.input_camera_white;
        waImageView2.setVisibility(8);
        waImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        waImageView2.setImageResource(i2);
        frameLayout.addView(waImageView2);
        this.A02 = waImageView2;
        this.A00 = R.color.f6nameremoved;
        A00();
        BNt(1);
    }

    private final void A00() {
        WaImageView waImageView = this.A03;
        int i = this.A00;
        Drawable mutate = waImageView.getDrawable().mutate();
        AnonymousClass00C.A08(mutate);
        mutate.setTint(i);
        waImageView.setImageDrawable(mutate);
        WaImageView waImageView2 = this.A02;
        int i2 = this.A00;
        Drawable mutate2 = waImageView2.getDrawable().mutate();
        AnonymousClass00C.A08(mutate2);
        mutate2.setTint(i2);
        waImageView2.setImageDrawable(mutate2);
    }

    public void BNt(int i) {
        WaImageView waImageView;
        WaImageView waImageView2;
        this.A01 = i;
        if (i == 1) {
            waImageView = this.A03;
        } else {
            waImageView = this.A02;
            if (i != 1) {
                waImageView2 = this.A03;
                waImageView2.setVisibility(8);
                waImageView2.clearAnimation();
                waImageView.setVisibility(0);
                waImageView.clearAnimation();
            }
        }
        waImageView2 = this.A02;
        waImageView2.setVisibility(8);
        waImageView2.clearAnimation();
        waImageView.setVisibility(0);
        waImageView.clearAnimation();
    }

    public void Ble(int i) {
        WaImageView waImageView;
        WaImageView waImageView2;
        if (i != this.A01) {
            this.A01 = i;
            if (i == 1) {
                waImageView = this.A03;
            } else {
                waImageView = this.A02;
                if (i != 1) {
                    waImageView2 = this.A03;
                    waImageView2.setVisibility(8);
                    waImageView2.startAnimation(C53802ru.A00(true));
                    waImageView.setVisibility(0);
                    waImageView.startAnimation(C53802ru.A00(false));
                }
            }
            waImageView2 = this.A02;
            waImageView2.setVisibility(8);
            waImageView2.startAnimation(C53802ru.A00(true));
            waImageView.setVisibility(0);
            waImageView.startAnimation(C53802ru.A00(false));
        }
    }

    public void setTint(int i) {
        this.A00 = i;
        A00();
    }

    public int getTint() {
        return this.A00;
    }
}
