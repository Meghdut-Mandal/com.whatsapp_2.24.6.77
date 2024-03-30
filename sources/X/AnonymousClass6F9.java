package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.camera.DragGalleryStripIndicator;

/* renamed from: X.6F9  reason: invalid class name */
public class AnonymousClass6F9 {
    public AnimatorSet A00;
    public View A01;
    public View A02;
    public DragGalleryStripIndicator A03;
    public C41041wW A04;
    public AnonymousClass3K8 A05;
    public C132446Tt A06;
    public final Resources A07;
    public final View A08;
    public final View A09;
    public final RecyclerView A0A;
    public final CameraBottomSheetBehavior A0B;
    public final boolean A0C;
    public final boolean A0D;

    public void A00() {
        boolean A1S = AnonymousClass000.A1S(this.A0B.A0J, 4);
        RecyclerView recyclerView = this.A0A;
        if (!A1S) {
            recyclerView.setVisibility(4);
            recyclerView.setAlpha(0.0f);
            View view = this.A01;
            if (view != null) {
                view.setVisibility(4);
            }
            View view2 = this.A09;
            view2.setEnabled(true);
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
            return;
        }
        recyclerView.setVisibility(0);
        recyclerView.setAlpha(1.0f);
        View view3 = this.A01;
        if (view3 != null) {
            view3.setVisibility(C36351kA.A00(this.A0C ? 1 : 0));
        }
        View view4 = this.A09;
        view4.setEnabled(false);
        view4.setAlpha(0.0f);
    }

    public void A01() {
        View view = this.A08;
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
            AnimationSet animationSet = new AnimationSet(true);
            new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300);
            view.startAnimation(animationSet);
        }
    }

    public void A02(boolean z) {
        View view;
        int i;
        float A032 = C90514aH.A03(z ? 1 : 0);
        float f = 1.0f - A032;
        View view2 = this.A02;
        if (view2 != null && (view = this.A01) != null && this.A03 != null) {
            int measuredHeight = view2.getMeasuredHeight();
            int i2 = -measuredHeight;
            int translationY = (int) view.getTranslationY();
            if (z) {
                i = i2 + translationY;
            } else {
                i = translationY - i2;
            }
            C162337oQ r2 = new C162337oQ(this, 17);
            C162337oQ r1 = new C162337oQ(this, 18);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{A032, f});
            C90494aF.A0q(ofFloat);
            ofFloat.addUpdateListener(new C111575cV(this, measuredHeight, 0));
            if (!z) {
                r2 = r1;
            }
            ofFloat.addListener(r2);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{translationY, i});
            C111565cU.A00(ofInt, this, 19);
            AnimatorSet A0C2 = C36441kJ.A0C();
            A0C2.setDuration(150);
            A0C2.playTogether(new Animator[]{ofFloat, ofInt});
            this.A00 = A0C2;
            A0C2.start();
        }
    }

    public void A03(boolean z) {
        if (this.A0B.A0J != 4) {
            return;
        }
        if (!z || (this.A07.getConfiguration().orientation == 2 && !this.A0D)) {
            A01();
            return;
        }
        this.A08.setVisibility(0);
        A00();
    }

    public AnonymousClass6F9(View view, boolean z, boolean z2) {
        View A022 = C012005e.A02(view, R.id.bottom_sheet);
        this.A08 = A022;
        ((ViewGroup) A022).setClipChildren(true);
        this.A02 = C012005e.A02(view, R.id.gallery_strip_container);
        DragGalleryStripIndicator dragGalleryStripIndicator = (DragGalleryStripIndicator) C012005e.A02(view, R.id.drag_gallery_strip_indicator);
        this.A03 = dragGalleryStripIndicator;
        dragGalleryStripIndicator.setVisibility(0);
        this.A01 = C012005e.A02(view, R.id.drag_gallery_strip_layout);
        this.A0A = C90504aG.A0J(view, R.id.recent_media);
        this.A09 = C012005e.A02(view, R.id.gallery_container);
        this.A07 = view.getResources();
        this.A0D = z;
        this.A0C = z2;
        View view2 = this.A02;
        this.A0B = new C1030353h(view2 == null ? this.A0A : view2, this);
        View view3 = this.A09;
        view3.setEnabled(false);
        view3.setAlpha(0.0f);
        this.A0B.A0Y(this.A07.getDimensionPixelSize(R.dimen.f7nameremoved), false);
        ((C02460Ak) this.A08.getLayoutParams()).A00(this.A0B);
        View view4 = this.A01;
        if (view4 != null && this.A03 != null) {
            view4.measure(0, 0);
            view4.setTranslationY((float) (-view4.getMeasuredHeight()));
            view4.setVisibility(8);
        }
    }
}
