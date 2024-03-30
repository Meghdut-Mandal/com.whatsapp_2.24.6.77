package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.087  reason: invalid class name */
public class AnonymousClass087 implements View.OnLayoutChangeListener {
    public final /* synthetic */ AnonymousClass081 A00;

    public AnonymousClass087(AnonymousClass081 r1) {
        this.A00 = r1;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AnonymousClass08H r2;
        AnonymousClass081 r1 = this.A00;
        ImageView imageView = r1.A0O;
        if (imageView.getVisibility() == 0 && (r2 = r1.A06) != null) {
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            r2.setBounds(rect);
            r2.A07(imageView, (FrameLayout) null);
        }
    }
}
