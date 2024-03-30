package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.3rN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C77983rN implements C88204Ru {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C74263lK A01;

    public /* synthetic */ C77983rN(Resources resources, C74263lK r2) {
        this.A01 = r2;
        this.A00 = resources;
    }

    public final void Bhd(Drawable drawable) {
        C74263lK r5 = this.A01;
        Resources resources = this.A00;
        if (drawable instanceof C165747u5) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(C36421kH.A03(drawable), drawable.getBounds().height(), Bitmap.Config.ARGB_8888);
                if (createBitmap != null) {
                    ((C165747u5) drawable).A00(new Canvas(createBitmap));
                    C39691tK r1 = r5.A08;
                    C18740tg.A06(r1);
                    r1.A0S(new BitmapDrawable(resources, createBitmap), 0);
                    return;
                }
            } catch (OutOfMemoryError unused) {
            }
            C39691tK r2 = r5.A08;
            C18740tg.A06(r2);
            r2.A0S((Drawable) null, 3);
            return;
        }
        C39691tK r0 = r5.A08;
        C18740tg.A06(r0);
        r0.A0S(drawable, 0);
    }
}
