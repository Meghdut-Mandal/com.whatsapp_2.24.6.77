package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.camera.DragGalleryStripIndicator;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.5cV  reason: invalid class name and case insensitive filesystem */
public class C111575cV implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C111575cV(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A02) {
            case 0:
                AnonymousClass6F9 r4 = (AnonymousClass6F9) this.A01;
                int i = this.A00;
                float A002 = AnonymousClass000.A00(valueAnimator);
                RecyclerView recyclerView = r4.A0A;
                recyclerView.getLayoutParams().height = (int) (((float) i) * A002);
                recyclerView.requestLayout();
                DragGalleryStripIndicator dragGalleryStripIndicator = r4.A03;
                if (dragGalleryStripIndicator != null) {
                    dragGalleryStripIndicator.setOffset(A002);
                    return;
                }
                return;
            case 1:
                int i2 = this.A00;
                TitleBarView titleBarView = ((C129126Fh) this.A01).A0I;
                float A003 = AnonymousClass000.A00(valueAnimator);
                C91184bb r1 = titleBarView.A0O;
                if (r1 == null) {
                    throw C36331k8.A0d("textToolDrawable");
                }
                r1.A01 = 0.0f;
                r1.A02 = i2;
                r1.A00 = A003;
                r1.invalidateSelf();
                return;
            default:
                FormItemEditText formItemEditText = (FormItemEditText) this.A01;
                formItemEditText.A0J[this.A00] = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                formItemEditText.invalidate();
                return;
        }
    }
}
