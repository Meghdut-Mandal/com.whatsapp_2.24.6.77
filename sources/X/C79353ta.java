package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3ta  reason: invalid class name and case insensitive filesystem */
public final class C79353ta implements C160527l9 {
    public static final Bitmap.Config A02 = Bitmap.Config.RGB_565;
    public final int A00;
    public final int A01;

    public /* synthetic */ void BXv() {
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r6) {
        AnonymousClass00C.A0D(view, 0);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, A02);
            bitmap.setPixel(0, 0, this.A00);
        }
        ((ImageView) view).setImageBitmap(bitmap);
    }

    public void Btu(View view) {
        ImageView imageView;
        AnonymousClass00C.A0D(view, 0);
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageResource(R.drawable.circle_shade_big);
        }
    }

    public C79353ta(Context context) {
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00 = AnonymousClass00F.A00(context, AnonymousClass1RC.A0A(context) ? R.color.f6nameremoved : R.color.f6nameremoved);
    }

    public int BHb() {
        return this.A01;
    }
}
