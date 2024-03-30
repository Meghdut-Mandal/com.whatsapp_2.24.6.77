package X;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.Queue;

/* renamed from: X.7pc  reason: invalid class name and case insensitive filesystem */
public class C163077pc implements Animation.AnimationListener {
    public Object A00;
    public final int A01;

    public C163077pc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        View view;
        switch (this.A01) {
            case 0:
                BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = (BusinessDirectorySERPMapViewActivity) this.A00;
                int dimensionPixelSize = businessDirectorySERPMapViewActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                int dimensionPixelSize2 = businessDirectorySERPMapViewActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                ImageView imageView = businessDirectorySERPMapViewActivity.A00;
                if (imageView == null) {
                    throw C36331k8.A0d("myLocationBtn");
                }
                C65723Tf.A02(imageView, new AnonymousClass3QI(0, 0, dimensionPixelSize, dimensionPixelSize2));
                return;
            case 1:
                BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity2 = (BusinessDirectorySERPMapViewActivity) this.A00;
                int dimensionPixelSize3 = businessDirectorySERPMapViewActivity2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                ImageView imageView2 = businessDirectorySERPMapViewActivity2.A00;
                if (imageView2 == null) {
                    throw C36331k8.A0d("myLocationBtn");
                }
                C65723Tf.A02(imageView2, new AnonymousClass3QI(0, 0, dimensionPixelSize3, dimensionPixelSize3));
                view = businessDirectorySERPMapViewActivity2.A02;
                if (view == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                break;
            case 2:
                TitleBarView titleBarView = (TitleBarView) this.A00;
                WaTextView waTextView = titleBarView.A0C;
                if (waTextView == null) {
                    throw C36331k8.A0d("mediaQualityToolTip");
                }
                waTextView.setAlpha(0.0f);
                view = titleBarView.A0C;
                if (view == null) {
                    throw C36331k8.A0d("mediaQualityToolTip");
                }
                break;
            default:
                C120325rK r2 = ((BkFcsPreloadingScreenFragment) this.A00).A03;
                r2.A00 = false;
                while (true) {
                    Queue queue = r2.A01;
                    if (!queue.isEmpty()) {
                        C36411kG.A1O(queue.remove());
                    } else {
                        return;
                    }
                }
        }
        view.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
