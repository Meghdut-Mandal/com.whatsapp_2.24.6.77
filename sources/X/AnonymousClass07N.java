package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.whatsapp.R;

/* renamed from: X.07N  reason: invalid class name */
public class AnonymousClass07N extends ImageButton {
    public final C015706u A00;
    public final AnonymousClass06S A01;

    public ColorStateList getSupportBackgroundTintList() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportImageTintList() {
        C015806v r0;
        AnonymousClass06S r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C015806v r0;
        AnonymousClass06S r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public boolean hasOverlappingRendering() {
        if ((this.A01.A02.getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setImageResource(int i) {
        this.A01.A02(i);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AnonymousClass06S r2 = this.A01;
        if (r2 != null) {
            C015806v r1 = r2.A00;
            if (r1 == null) {
                r1 = new C015806v();
                r2.A00 = r1;
            }
            r1.A00 = colorStateList;
            r1.A02 = true;
            r2.A01();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AnonymousClass06S r2 = this.A01;
        if (r2 != null) {
            C015806v r1 = r2.A00;
            if (r1 == null) {
                r1 = new C015806v();
                r2.A00 = r1;
            }
            r1.A01 = mode;
            r1.A03 = true;
            r2.A01();
        }
    }

    public AnonymousClass07N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass06S r02 = this.A01;
        if (r02 != null) {
            r02.A01();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A02(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AnonymousClass06S r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        AnonymousClass06S r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AnonymousClass06S r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass07N(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C015606t.A03(getContext(), this);
        C015706u r0 = new C015706u(this);
        this.A00 = r0;
        r0.A05(attributeSet, i);
        AnonymousClass06S r02 = new AnonymousClass06S(this);
        this.A01 = r02;
        r02.A03(attributeSet, i);
    }
}
