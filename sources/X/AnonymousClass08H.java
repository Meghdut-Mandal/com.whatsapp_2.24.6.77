package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* renamed from: X.08H  reason: invalid class name */
public class AnonymousClass08H extends Drawable implements AnonymousClass08G {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public WeakReference A06;
    public WeakReference A07;
    public final C07190Wr A08;
    public final AnonymousClass0UX A09;
    public final WeakReference A0A;
    public final Rect A0B = new Rect();
    public final C012505l A0C = new C012505l();

    public AnonymousClass08H(Context context, C08800bL r7) {
        Context context2;
        this.A0A = new WeakReference(context);
        C013205s.A04(context, "Theme.MaterialComponents", C013205s.A01);
        AnonymousClass0UX r0 = new AnonymousClass0UX(this);
        this.A09 = r0;
        r0.A04.setTextAlign(Paint.Align.CENTER);
        WeakReference weakReference = this.A0A;
        Context context3 = (Context) weakReference.get();
        if (context3 != null) {
            AnonymousClass0YF r2 = new AnonymousClass0YF(context3, R.style.f13nameremoved);
            AnonymousClass0UX r1 = this.A09;
            if (!(r1.A00 == r2 || (context2 = (Context) weakReference.get()) == null)) {
                r1.A01(context2, r2);
                A04(this);
            }
        }
        this.A08 = new C07190Wr(context, r7);
        A03(this);
        AnonymousClass0UX r12 = this.A09;
        r12.A02 = true;
        A04(this);
        invalidateSelf();
        TextPaint textPaint = r12.A04;
        C08800bL r13 = this.A08.A03;
        textPaint.setAlpha(r13.A00);
        invalidateSelf();
        A01(this);
        textPaint.setColor(r13.A0C.intValue());
        invalidateSelf();
        A02(this);
        A04(this);
        setVisible(r13.A06.booleanValue(), false);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    private String A00() {
        C08800bL r3 = this.A08.A03;
        int i = r3.A05;
        if (i == -1) {
            i = 0;
        }
        if (i <= this.A05) {
            NumberFormat instance = NumberFormat.getInstance(r3.A0H);
            int i2 = r3.A05;
            if (i2 == -1) {
                i2 = 0;
            }
            return instance.format((long) i2);
        }
        Context context = (Context) this.A0A.get();
        if (context == null) {
            return "";
        }
        return String.format(r3.A0H, context.getString(R.string.f12nameremoved), new Object[]{Integer.valueOf(this.A05), "+"});
    }

    public static void A01(AnonymousClass08H r3) {
        ColorStateList valueOf = ColorStateList.valueOf(r3.A08.A03.A0A.intValue());
        C012505l r1 = r3.A0C;
        if (r1.A01.A0B != valueOf) {
            r1.A0C(valueOf);
            r3.invalidateSelf();
        }
    }

    public static void A02(AnonymousClass08H r2) {
        FrameLayout frameLayout;
        WeakReference weakReference = r2.A07;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) weakReference.get();
            WeakReference weakReference2 = r2.A06;
            if (weakReference2 != null) {
                frameLayout = (FrameLayout) weakReference2.get();
            } else {
                frameLayout = null;
            }
            r2.A07(view, frameLayout);
        }
    }

    public static void A03(AnonymousClass08H r4) {
        r4.A05 = ((int) Math.pow(10.0d, ((double) r4.A08.A03.A04) - 1.0d)) - 1;
        r4.A09.A02 = true;
        A04(r4);
        r4.invalidateSelf();
    }

    public static void A04(AnonymousClass08H r11) {
        Integer num;
        int i;
        float f;
        int i2;
        Integer num2;
        float f2;
        float f3;
        ViewGroup viewGroup;
        Context context = (Context) r11.A0A.get();
        WeakReference weakReference = r11.A07;
        View view = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = r11.A0B;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference2 = r11.A06;
            if (!(weakReference2 == null || (viewGroup = (ViewGroup) weakReference2.get()) == null)) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            C07190Wr r10 = r11.A08;
            C08800bL r9 = r10.A03;
            if (r9.A05 != -1) {
                num = r9.A0F;
            } else {
                num = r9.A0G;
            }
            int intValue = num.intValue() + r9.A09.intValue();
            int intValue2 = r9.A0B.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                i = rect3.bottom - intValue;
            } else {
                i = rect3.top + intValue;
            }
            r11.A01 = (float) i;
            int i3 = r9.A05;
            if (i3 == -1 || i3 <= 9) {
                if (i3 != -1) {
                    f = r10.A02;
                } else {
                    f = r10.A00;
                }
                r11.A02 = f;
                r11.A03 = f;
            } else {
                float f4 = r10.A02;
                r11.A02 = f4;
                r11.A03 = f4;
                f = (r11.A09.A00(r11.A00()) / 2.0f) + r10.A01;
            }
            r11.A04 = f;
            Resources resources = context.getResources();
            if (r9.A05 != -1) {
                i2 = R.dimen.f7nameremoved;
            } else {
                i2 = R.dimen.f7nameremoved;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            if (r9.A05 != -1) {
                num2 = r9.A0D;
            } else {
                num2 = r9.A0E;
            }
            int intValue3 = num2.intValue() + r9.A08.intValue();
            int intValue4 = r9.A0B.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691 ? AnonymousClass04F.A01(view) != 0 : AnonymousClass04F.A01(view) == 0) {
                f2 = r11.A04;
                f3 = ((((float) rect3.right) + f2) - ((float) dimensionPixelSize)) - ((float) intValue3);
            } else {
                f2 = r11.A04;
                f3 = (((float) rect3.left) - f2) + ((float) dimensionPixelSize) + ((float) intValue3);
            }
            r11.A00 = f3;
            float f5 = r11.A01;
            float f6 = r11.A03;
            rect2.set((int) (f3 - f2), (int) (f5 - f6), (int) (f3 + f2), (int) (f5 + f6));
            C012505l r4 = r11.A0C;
            r4.setShapeAppearanceModel(r4.A01.A0K.A04(r11.A02));
            if (!rect.equals(rect2)) {
                r4.setBounds(rect2);
            }
        }
    }

    public void A06() {
        C07190Wr r3 = this.A08;
        C08800bL r2 = r3.A03;
        if (r2.A05 != -1) {
            r3.A04.A05 = -1;
            r2.A05 = -1;
            this.A09.A02 = true;
            A04(this);
            invalidateSelf();
        }
    }

    public void A07(View view, FrameLayout frameLayout) {
        this.A07 = new WeakReference(view);
        this.A06 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        A04(this);
        invalidateSelf();
    }

    public void A08(boolean z) {
        C07190Wr r2 = this.A08;
        C08800bL r0 = r2.A04;
        Boolean valueOf = Boolean.valueOf(z);
        r0.A06 = valueOf;
        r2.A03.A06 = valueOf;
        setVisible(valueOf.booleanValue(), false);
    }

    public int getAlpha() {
        return this.A08.A03.A00;
    }

    public int getIntrinsicHeight() {
        return this.A0B.height();
    }

    public int getIntrinsicWidth() {
        return this.A0B.width();
    }

    public void setAlpha(int i) {
        C07190Wr r1 = this.A08;
        r1.A04.A00 = i;
        r1.A03.A00 = i;
        this.A09.A04.setAlpha(i);
        invalidateSelf();
    }

    public CharSequence A05() {
        Context context;
        if (isVisible()) {
            C08800bL r6 = this.A08.A03;
            if (r6.A05 == -1) {
                return r6.A07;
            }
            if (!(r6.A03 == 0 || (context = (Context) this.A0A.get()) == null)) {
                int i = r6.A05;
                if (i == -1) {
                    i = 0;
                }
                int i2 = this.A05;
                if (i <= i2) {
                    Resources resources = context.getResources();
                    int i3 = r6.A03;
                    int i4 = r6.A05;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    return resources.getQuantityString(i3, i4, new Object[]{Integer.valueOf(i4)});
                }
                return context.getString(r6.A02, new Object[]{Integer.valueOf(i2)});
            }
        }
        return null;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            C08800bL r1 = this.A08.A03;
            if (r1.A00 != 0 && isVisible()) {
                this.A0C.draw(canvas);
                if (r1.A05 != -1) {
                    Rect rect = new Rect();
                    String A002 = A00();
                    TextPaint textPaint = this.A09.A04;
                    textPaint.getTextBounds(A002, 0, A002.length(), rect);
                    canvas.drawText(A002, this.A00, this.A01 + ((float) (rect.height() / 2)), textPaint);
                }
            }
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void Bj0() {
        invalidateSelf();
    }
}
