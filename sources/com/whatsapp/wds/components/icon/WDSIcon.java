package com.whatsapp.wds.components.icon;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass1QZ;
import X.AnonymousClass6P3;
import X.AnonymousClass6TW;
import X.C05250Oz;
import X.C107915Rj;
import X.C108155Sj;
import X.C108165Sk;
import X.C108445Tn;
import X.C18700tb;
import X.C27991Qq;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class WDSIcon extends AppCompatImageView implements C18700tb {
    public C107915Rj A00;
    public C108445Tn A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public PorterDuffColorFilter A04;
    public Drawable A05;
    public C108155Sj A06;
    public AnonymousClass6P3 A07;
    public C108165Sk A08;
    public boolean A09;

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        AnonymousClass6P3 r0 = this.A07;
        int i = (r0.A01 - r0.A00) / 2;
        Drawable drawable = this.A05;
        if (drawable != null) {
            PorterDuffColorFilter porterDuffColorFilter = this.A04;
            if (porterDuffColorFilter == null) {
                throw C36331k8.A0d("colorFilter");
            }
            drawable.setColorFilter(porterDuffColorFilter);
            int i2 = this.A07.A00 + i;
            drawable.setBounds(i, i, i2, i2);
            drawable.draw(canvas);
            drawable.clearColorFilter();
        }
    }

    public final void setAction(C108155Sj r2) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(this.A06, r2);
        this.A06 = r2;
        if (A1W) {
            A01();
            invalidate();
        }
    }

    public final void setShape(C107915Rj r2) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(this.A00, r2);
        this.A00 = r2;
        if (A1W) {
            A01();
            requestLayout();
        }
    }

    public final void setSize(C108445Tn r2) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(this.A01, r2);
        this.A01 = r2;
        if (A1W) {
            A00();
            A01();
            requestLayout();
        }
    }

    public final void setVariant(C108165Sk r2) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(this.A08, r2);
        this.A08 = r2;
        if (A1W) {
            A01();
            invalidate();
        }
    }

    private final void A00() {
        if (this.A09) {
            C108445Tn r4 = this.A01;
            Context A0B = C36371kC.A0B(this);
            this.A07 = new AnonymousClass6P3(A0B.getResources().getDimensionPixelSize(r4.size), A0B.getResources().getDimensionPixelSize(r4.iconSize));
        }
    }

    private final void A01() {
        if (this.A09) {
            AnonymousClass6TW A002 = AnonymousClass6TW.A02.A00(C36371kC.A0B(this), this.A06, this.A08);
            setupContentStyle(A002.A01);
            setupBackgroundStyle(A002.A00);
        }
    }

    private final void setupBackgroundStyle(int i) {
        Shape shape;
        int i2;
        C107915Rj r0 = this.A00;
        Context A0B = C36371kC.A0B(this);
        C108445Tn r5 = this.A01;
        AnonymousClass00C.A0D(r5, 1);
        int ordinal = r0.ordinal();
        if (ordinal == 0) {
            shape = new OvalShape();
        } else if (ordinal == 1) {
            int i3 = 0;
            float[] fArr = new float[8];
            do {
                Resources resources = A0B.getResources();
                switch (r5.ordinal()) {
                    case 0:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 1:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 2:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 3:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 4:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 5:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 6:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    case 7:
                        i2 = R.dimen.f7nameremoved;
                        break;
                    default:
                        throw C36441kJ.A18();
                }
                fArr[i3] = C36441kJ.A00(resources, i2);
                i3++;
            } while (i3 < 8);
            shape = new RoundRectShape(fArr, (RectF) null, (float[]) null);
        } else {
            throw C36441kJ.A18();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape);
        C36381kD.A16(getContext(), shapeDrawable.getPaint(), i);
        setBackground(shapeDrawable);
    }

    private final void setupIcon(Drawable drawable) {
        Drawable drawable2;
        if (drawable != null) {
            drawable2 = drawable.mutate();
        } else {
            drawable2 = null;
        }
        this.A05 = drawable2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A07.A01, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A07.A01, 1073741824));
    }

    public final void setIcon(int i) {
        Drawable A002;
        if (i == 0) {
            A002 = null;
        } else {
            A002 = AnonymousClass00E.A00(getContext(), i);
        }
        setIcon(A002);
    }

    public WDSIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    private final void setupContentStyle(int i) {
        this.A04 = new PorterDuffColorFilter(C36381kD.A05(this, i), PorterDuff.Mode.SRC_IN);
    }

    public final C108155Sj getAction() {
        return this.A06;
    }

    public final Drawable getIcon() {
        return this.A05;
    }

    public final C107915Rj getShape() {
        return this.A00;
    }

    public final C108445Tn getSize() {
        return this.A01;
    }

    public final C108165Sk getVariant() {
        return this.A08;
    }

    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            A01();
        }
    }

    public /* synthetic */ WDSIcon(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    public final void setIcon(Drawable drawable) {
        setupIcon(drawable);
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        C108445Tn r9 = C108445Tn.A04;
        this.A07 = new AnonymousClass6P3(r9.size, r9.iconSize);
        this.A01 = r9;
        C107915Rj r8 = C107915Rj.CIRCLE;
        this.A00 = r8;
        C108165Sk r7 = C108165Sk.FILLED;
        this.A08 = r7;
        C108155Sj r4 = C108155Sj.NORMAL;
        this.A06 = r4;
        this.A09 = true;
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A09;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                C36331k8.A0q(context, this, resourceId);
            }
            int i = obtainStyledAttributes.getInt(4, 4);
            C108445Tn[] values = C108445Tn.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r9 = values[i];
                }
            }
            setSize(r9);
            int i2 = obtainStyledAttributes.getInt(3, 0);
            C107915Rj[] values2 = C107915Rj.values();
            if (i2 >= 0) {
                AnonymousClass00C.A0D(values2, 0);
                if (i2 <= values2.length - 1) {
                    r8 = values2[i2];
                }
            }
            setShape(r8);
            int i3 = obtainStyledAttributes.getInt(5, 0);
            C108165Sk[] values3 = C108165Sk.values();
            if (i3 >= 0) {
                AnonymousClass00C.A0D(values3, 0);
                if (i3 <= values3.length - 1) {
                    r7 = values3[i3];
                }
            }
            setVariant(r7);
            int i4 = obtainStyledAttributes.getInt(2, 0);
            C108155Sj[] values4 = C108155Sj.values();
            if (i4 >= 0) {
                AnonymousClass00C.A0D(values4, 0);
                if (i4 <= values4.length - 1) {
                    r4 = values4[i4];
                }
            }
            setAction(r4);
            setupIcon(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
        }
        A00();
        A01();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSIcon(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }
}
