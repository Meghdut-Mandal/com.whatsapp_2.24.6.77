package X;

import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;

/* renamed from: X.3q7  reason: invalid class name and case insensitive filesystem */
public final class C77203q7 implements AnonymousClass4UV {
    public int A00;
    public int A01 = 1;
    public final LottieAnimationView A02;
    public final LottieAnimationView A03;
    public final FrameLayout A04;

    public C77203q7(FrameLayout frameLayout) {
        this.A04 = frameLayout;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(frameLayout.getContext());
        A00(lottieAnimationView, R.raw.voice_to_video_icon_animation);
        frameLayout.addView(lottieAnimationView);
        this.A03 = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(frameLayout.getContext());
        A00(lottieAnimationView2, R.raw.video_to_voice_icon_animation);
        frameLayout.addView(lottieAnimationView2);
        this.A02 = lottieAnimationView2;
        this.A00 = R.color.f6nameremoved;
        BNt(1);
    }

    private final void A00(LottieAnimationView lottieAnimationView, int i) {
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        lottieAnimationView.setAnimation(i);
        AnonymousClass9R3 r1 = new AnonymousClass9R3(lottieAnimationView, this);
        if (lottieAnimationView.A01 != null) {
            r1.A00();
        }
        lottieAnimationView.A0A.add(r1);
    }

    public void BNt(int i) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        this.A01 = i;
        if (i == 1) {
            lottieAnimationView = this.A02;
        } else {
            lottieAnimationView = this.A03;
            if (i != 1) {
                lottieAnimationView2 = this.A02;
                lottieAnimationView2.setVisibility(8);
                lottieAnimationView2.A03();
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.setProgress(1.0f);
            }
        }
        lottieAnimationView2 = this.A03;
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.A03();
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(1.0f);
    }

    public void Ble(int i) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        if (i != this.A01) {
            this.A01 = i;
            if (i == 1) {
                lottieAnimationView = this.A02;
            } else {
                lottieAnimationView = this.A03;
                if (i != 1) {
                    lottieAnimationView2 = this.A02;
                    lottieAnimationView2.setVisibility(8);
                    lottieAnimationView2.A03();
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.A04();
                }
            }
            lottieAnimationView2 = this.A03;
            lottieAnimationView2.setVisibility(8);
            lottieAnimationView2.A03();
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.A04();
        }
    }

    public int getTint() {
        return this.A00;
    }

    public void setTint(int i) {
        this.A00 = i;
    }
}
