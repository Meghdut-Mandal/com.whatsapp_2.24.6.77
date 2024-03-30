package com.whatsapp.stickers;

import X.AnonymousClass00C;
import X.C06590Ue;
import X.C162567on;
import X.C165737u4;
import X.C165747u5;
import X.C18750th;
import X.C224714l;
import X.C36341k9;
import X.C81203wd;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

public final class StickerView extends WaImageView {
    public int A00;
    public C06590Ue A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final C06590Ue A06;

    public void invalidateDrawable(Drawable drawable) {
        AnonymousClass00C.A0D(drawable, 0);
        if (C224714l.A02()) {
            super.invalidateDrawable(drawable);
        } else {
            this.A05.post(new C81203wd(this, drawable, 18));
        }
    }

    public void A03() {
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C36341k9.A0U(generatedComponent());
        }
    }

    public final void A04() {
        int i;
        Boolean bool = C18750th.A01;
        Drawable drawable = getDrawable();
        if (drawable instanceof C165747u5) {
            AnonymousClass00C.A0B(drawable);
            C165747u5 r2 = (C165747u5) drawable;
            r2.A03 = this.A02;
            int i2 = this.A00;
            if (!r2.A04) {
                r2.A01 = i2;
            } else if (r2.A01 < i2) {
                r2.A01 = i2;
                r2.A00 = 0;
            }
        } else if (drawable instanceof C165737u4) {
            C165737u4 r22 = (C165737u4) drawable;
            if (this.A02) {
                i = -1;
            } else {
                i = this.A00;
            }
            r22.A0b.setRepeatCount(i);
        }
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (!animatable.isRunning()) {
                animatable.start();
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C165747u5 r4;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawable2 = getDrawable();
        if (drawable2 != drawable && (drawable2 instanceof C165747u5)) {
            C165747u5 r2 = (C165747u5) drawable2;
            C06590Ue r1 = this.A06;
            AnonymousClass00C.A0D(r1, 0);
            r2.A07.remove(r1);
            r2.stop();
        }
        super.setImageDrawable(drawable);
        if ((drawable instanceof C165747u5) && (r4 = (C165747u5) drawable) != null) {
            C06590Ue r12 = this.A06;
            AnonymousClass00C.A0D(r12, 0);
            r4.A07.add(r12);
        }
    }

    public StickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        this.A05 = C36341k9.A0H();
        this.A06 = new C162567on(this, 2);
    }

    public final void A05() {
        Drawable drawable = getDrawable();
        if (drawable instanceof C165737u4) {
            C165737u4 r2 = (C165737u4) drawable;
            if (r2.isRunning()) {
                r2.A0b.setRepeatCount(0);
                return;
            }
        }
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public final boolean getLoopIndefinitely() {
        return this.A02;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A03 && this.A02) {
            A04();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A05();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            A05();
        } else if (this.A03 && this.A02) {
            A04();
        }
    }

    public static final void A00(Drawable drawable, StickerView stickerView) {
        super.invalidateDrawable(drawable);
    }

    public final void setAnimationCallback(C06590Ue r1) {
        this.A01 = r1;
    }

    public final void setLoopIndefinitely(boolean z) {
        this.A02 = z;
    }

    public final void setMaxLoops(int i) {
        this.A00 = i;
    }

    public final void setUserVisibleForIndefiniteLoop(boolean z) {
        this.A03 = z;
    }

    public StickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A05 = C36341k9.A0H();
        this.A06 = new C162567on(this, 2);
    }

    public StickerView(Context context) {
        super(context);
        A03();
        this.A05 = C36341k9.A0H();
        this.A06 = new C162567on(this, 2);
    }
}
