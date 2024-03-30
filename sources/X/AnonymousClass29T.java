package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.29T  reason: invalid class name */
public abstract class AnonymousClass29T extends C33701fn {
    public final FrameLayout A00;

    public int A00(C87374On r3, boolean z) {
        if (AnonymousClass00C.A0J(((C21642ATi) r3).A0G, "whatsapp_banner_privacy_tip")) {
            return AnonymousClass00F.A00(this.A00.getContext(), R.color.f6nameremoved);
        }
        return super.A00(r3, z);
    }

    public void A04(AnonymousClass3KG r6, C607939j r7, C87374On r8) {
        AnonymousClass00C.A0D(r7, 0);
        super.A04(r6, r7, r8);
        if (r8 != null) {
            r7.A05.setVisibility(8);
            r7.A00.setBackgroundResource(R.drawable.banner_with_rounded_corners);
            C36421kH.A0t(r7.A01);
            if (AnonymousClass00C.A0J(((C21642ATi) r8).A0G, "whatsapp_banner_privacy_tip")) {
                if (!this.A01) {
                    r7.A02.setImageResource(R.drawable.vec_ic_tips_v2);
                }
                ImageView imageView = r7.A02;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                FrameLayout frameLayout = this.A00;
                layoutParams.height = frameLayout.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                imageView.getLayoutParams().width = C36371kC.A03(frameLayout, R.dimen.f7nameremoved);
                imageView.setImageTintList(AnonymousClass00F.A04(imageView.getContext(), R.color.f6nameremoved));
            }
        }
    }

    public boolean A06(C20810yC r3) {
        if (!AnonymousClass1MI.A02(r3, (C21000yV) null, 6778) || !AnonymousClass1MI.A02(r3, (C21000yV) null, 6779)) {
            return false;
        }
        return true;
    }

    public C607339d A02(C87374On r2, C55982vW r3) {
        if (r3 != null) {
            return new AnonymousClass2lS(r3);
        }
        return C50712lP.A00;
    }

    public AnonymousClass29T(FrameLayout frameLayout, C32991eX r4, C33581fb r5, C20810yC r6, C19770wU r7) {
        super(frameLayout, r4, r5, r6, r7);
        this.A00 = frameLayout;
        r4.A00.A0E(3712);
    }
}
