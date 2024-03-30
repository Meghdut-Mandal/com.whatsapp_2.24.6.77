package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: X.0EV  reason: invalid class name */
public class AnonymousClass0EV extends ViewOutlineProvider {
    public final Rect A00 = AnonymousClass001.A06();
    public final /* synthetic */ ShapeableImageView A01;

    public AnonymousClass0EV(ShapeableImageView shapeableImageView) {
        this.A01 = shapeableImageView;
    }

    public void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.A01;
        AnonymousClass06J r1 = shapeableImageView.A07;
        if (r1 != null) {
            if (shapeableImageView.A06 == null) {
                shapeableImageView.A06 = new C012505l(r1);
            }
            RectF rectF = shapeableImageView.A0E;
            Rect rect = this.A00;
            rectF.round(rect);
            shapeableImageView.A06.setBounds(rect);
            shapeableImageView.A06.getOutline(outline);
        }
    }
}
