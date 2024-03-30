package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.3UF  reason: invalid class name */
public abstract class AnonymousClass3UF {
    public static Drawable A05(Context context, Drawable drawable, boolean z) {
        int i;
        Drawable drawable2;
        Drawable drawable3 = drawable;
        if (!z) {
            i = 1;
        } else if ((drawable instanceof InsetDrawable) && (drawable2 = ((InsetDrawable) drawable3).getDrawable()) != null) {
            return drawable2;
        } else {
            i = -1;
        }
        int dimensionPixelSize = i * context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        return new InsetDrawable(drawable3, dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public static Bitmap A00(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Drawable A07(Resources resources, Drawable drawable, int i) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        return new BitmapDrawable(resources, Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), i, i, false));
    }

    public static Drawable A08(Drawable drawable, int i) {
        if (i == 0) {
            return drawable;
        }
        Drawable A01 = AnonymousClass08I.A01(drawable);
        AnonymousClass076.A06(A01, i);
        return A01;
    }

    public static void A0E(ImageView imageView, int i) {
        ColorStateList valueOf;
        AnonymousClass06T.A01(PorterDuff.Mode.SRC_IN, imageView);
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = ColorStateList.valueOf(i);
        }
        AnonymousClass06T.A00(valueOf, imageView);
    }

    public static void A0F(TextView textView, int i) {
        if (i != 0) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        }
    }

    public static Drawable A01(Context context, int i, int i2) {
        Drawable A02 = A02(context, i, i2);
        AnonymousClass00C.A08(A02);
        return A02;
    }

    public static Drawable A02(Context context, int i, int i2) {
        Integer num;
        int intValue;
        Drawable A0H = C36381kD.A0H(context, i);
        if (i2 != 0) {
            try {
                num = Integer.valueOf(AnonymousClass00F.A00(context, i2));
            } catch (Resources.NotFoundException unused) {
                num = null;
            }
            if (!(num == null || (intValue = num.intValue()) == 0)) {
                Drawable A01 = AnonymousClass08I.A01(A0H.mutate());
                AnonymousClass076.A06(A01, intValue);
                return A01;
            }
        }
        return A0H;
    }

    public static Drawable A03(Context context, int i, boolean z) {
        Drawable A02 = A02(context, i, R.color.f6nameremoved);
        if (z) {
            return A05(context, A02, false);
        }
        return A02;
    }

    public static Drawable A04(Context context, Drawable drawable, int i) {
        return A08(drawable, AnonymousClass00F.A00(context, i));
    }

    public static Drawable A06(Resources resources, Drawable drawable, int i) {
        return A08(drawable, resources.getColor(i));
    }

    public static void A09(Context context, Menu menu) {
        menu.add(0, R.id.menuitem_contactqr_share, 0, R.string.f12nameremoved).setIcon(A02(context, R.drawable.ic_share, R.color.f6nameremoved)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, R.string.f12nameremoved);
    }

    public static void A0A(Context context, ImageView imageView) {
        A0E(imageView, AnonymousClass1RC.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public static void A0B(Context context, ImageView imageView, int i, int i2) {
        imageView.setImageDrawable(A02(context, i, i2));
    }

    public static void A0C(Context context, Toolbar toolbar, C18820ts r5) {
        toolbar.setNavigationIcon((Drawable) new C100744vb(A08(context.getResources().getDrawable(R.drawable.ic_back), context.getResources().getColor(R.color.f6nameremoved)), r5));
    }

    public static void A0D(Context context, Toolbar toolbar, C18820ts r3, int i) {
        toolbar.setNavigationIcon((Drawable) new C100744vb(A02(context, R.drawable.ic_back, i), r3));
    }
}
