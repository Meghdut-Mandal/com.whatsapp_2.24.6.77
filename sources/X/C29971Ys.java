package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Ys  reason: invalid class name and case insensitive filesystem */
public class C29971Ys {
    public final C20690y0 A00;
    public final AnonymousClass1HB A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final C19770wU A03;

    public void A00(ImageView imageView, C135106c9 r11, int i, int i2) {
        Drawable drawable;
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentBackgroundMetadata{id='");
        C135106c9 r4 = r11;
        sb.append(r11.A0F);
        sb.append("',fileSize=");
        sb.append(r11.A0E);
        sb.append(",width=");
        sb.append(r11.A0D);
        sb.append(",height=");
        sb.append(r11.A09);
        sb.append(",mimetype='");
        sb.append(r11.A0G);
        sb.append("'}_");
        int i3 = i;
        sb.append(i);
        sb.append("_");
        int i4 = i2;
        sb.append(i2);
        String obj = sb.toString();
        ImageView imageView2 = imageView;
        imageView.setTag(obj);
        Drawable drawable2 = imageView.getDrawable();
        Reference reference = (Reference) this.A02.get(obj);
        if (reference != null) {
            drawable = (Drawable) reference.get();
        } else {
            drawable = null;
        }
        if (drawable2 != null && drawable2.equals(drawable)) {
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            this.A03.Box(new AnonymousClass5MR(imageView2, r4, this, obj, i3, i4), new Void[0]);
        }
    }

    public C29971Ys(C20690y0 r2, AnonymousClass1HB r3, C19770wU r4) {
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }
}
