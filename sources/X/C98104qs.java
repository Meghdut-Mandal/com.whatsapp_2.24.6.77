package X;

import android.widget.ImageButton;

/* renamed from: X.4qs  reason: invalid class name and case insensitive filesystem */
public class C98104qs extends C140326lP {
    public final float A00;
    public final float A01;
    public final /* synthetic */ AnonymousClass6VH A02;

    public void Bgx(AnonymousClass6E4 r6) {
        AnonymousClass00C.A0D(r6, 0);
        float f = (float) r6.A07.A00;
        AnonymousClass6VH r3 = this.A02;
        ImageButton imageButton = r3.A00;
        imageButton.setScaleX(f);
        imageButton.setScaleY(f);
        AnonymousClass6VH.A01(r3, Math.max((int) A00(r6, 0.0f, 76.0f), 0));
    }

    public C98104qs(AnonymousClass6VH r1, float f, float f2) {
        this.A02 = r1;
        this.A01 = f;
        this.A00 = f2;
    }

    public final double A00(AnonymousClass6E4 r11, float f, float f2) {
        float f3 = this.A01;
        float f4 = this.A00;
        float min = Math.min(f3, f4);
        float max = Math.max(f3, f4);
        double d = (double) min;
        double d2 = (double) f;
        return d2 + (((r11.A07.A00 - d) / (((double) max) - d)) * (((double) f2) - d2));
    }
}
