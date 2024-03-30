package X;

import android.widget.ImageView;

/* renamed from: X.4qr  reason: invalid class name and case insensitive filesystem */
public class C98094qr extends C140326lP {
    public int A00;
    public final /* synthetic */ AnonymousClass6QH A01;

    public C98094qr(AnonymousClass6QH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void Bgx(AnonymousClass6E4 r12) {
        C118615oR r10 = r12.A07;
        double d = 1.0d - 0.0d;
        float f = (float) (0.5d + (((r10.A00 - 0.0d) / d) * (1.0d - 0.5d)));
        AnonymousClass6QH r7 = this.A01;
        ImageView imageView = r7.A0O;
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        int i = this.A00;
        if (i != 0) {
            float f2 = (float) (0.0d + (((r10.A00 - 0.0d) / d) * (((double) i) - 0.0d)));
            int width = imageView.getWidth() / 4;
            if (C36401kF.A1X(r7.A0R)) {
                width = -width;
            }
            imageView.setTranslationX(f2 + ((float) width));
        }
    }
}
