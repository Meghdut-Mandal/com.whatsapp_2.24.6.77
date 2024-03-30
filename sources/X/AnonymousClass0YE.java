package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.0YE  reason: invalid class name */
public abstract class AnonymousClass0YE {
    public C07700Yy A00;
    public CharSequence A01;
    public boolean A02 = false;

    public RemoteViews A07(C15690np r2) {
        return null;
    }

    public RemoteViews A08(C15690np r2) {
        return null;
    }

    public abstract String A09();

    public abstract void A0B(C15690np r1);

    public static Bitmap A05(AnonymousClass0YE r6, int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = r6.A00.A0F;
        Objects.requireNonNull(context);
        Bitmap A06 = A06(r6, IconCompat.A02(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(A06);
        Drawable mutate = r6.A00.A0F.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return A06;
    }

    public static Bitmap A06(AnonymousClass0YE r3, IconCompat iconCompat, int i, int i2) {
        int i3;
        Drawable A07 = iconCompat.A07(r3.A00.A0F);
        if (i2 == 0) {
            i3 = A07.getIntrinsicWidth();
            i2 = A07.getIntrinsicHeight();
        } else {
            i3 = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        A07.setBounds(0, 0, i3, i2);
        if (i != 0) {
            A07.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        A07.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void A0A(Bundle bundle) {
        if (this.A02) {
            bundle.putCharSequence("android.summaryText", this.A01);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", A09());
    }
}
