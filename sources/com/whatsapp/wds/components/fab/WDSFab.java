package com.whatsapp.wds.components.fab;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass060;
import X.AnonymousClass06J;
import X.AnonymousClass1MI;
import X.AnonymousClass1QZ;
import X.C004602b;
import X.C05250Oz;
import X.C18700tb;
import X.C20810yC;
import X.C21000yV;
import X.C224514j;
import X.C27851Qb;
import X.C27861Qc;
import X.C27891Qg;
import X.C27991Qq;
import X.C28021Qu;
import X.C35751jC;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;

public final class WDSFab extends AnonymousClass060 implements C18700tb {
    public C20810yC A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public C28021Qu A03;
    public boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(new C004602b(context, (int) R.style.f13nameremoved), attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C20810yC) ((C27861Qc) ((C27851Qb) generatedComponent())).A0M.A02.get();
        }
        C28021Qu r4 = C28021Qu.PRIMARY;
        this.A03 = r4;
        this.A04 = true;
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A08;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            int i2 = obtainStyledAttributes.getInt(1, 0);
            C28021Qu[] values = C28021Qu.values();
            if (i2 >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i2 <= values.length - 1) {
                    r4 = values[i2];
                }
            }
            setWdsFabStyle(r4);
            obtainStyledAttributes.recycle();
        }
        if (AnonymousClass1MI.A02(this.A00, (C21000yV) null, 4611)) {
            post(new C35751jC(this, 17));
        } else {
            A01(this);
        }
    }

    public static final void A01(WDSFab wDSFab) {
        wDSFab.setElevation(0.0f);
        wDSFab.setSize(-1);
        wDSFab.setImageTintList((ColorStateList) null);
        wDSFab.setBackgroundTintList((ColorStateList) null);
        wDSFab.setScaleType(ImageView.ScaleType.CENTER);
        wDSFab.setShapeAppearanceModel(new AnonymousClass06J());
    }

    public void setShapeAppearanceModel(AnonymousClass06J r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (this.A04) {
            C28021Qu r3 = this.A03;
            Context context = getContext();
            AnonymousClass00C.A08(context);
            r5 = new AnonymousClass06J().A04((float) context.getResources().getDimensionPixelSize(r3.cornerRadius));
        }
        super.setShapeAppearanceModel(r5);
    }

    public final void setWdsFabStyle(C28021Qu r3) {
        boolean z = false;
        AnonymousClass00C.A0D(r3, 0);
        if (this.A03 != r3) {
            z = true;
        }
        this.A03 = r3;
        if (z) {
            A01(this);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A04) {
            C28021Qu r0 = this.A03;
            Context context = getContext();
            AnonymousClass00C.A08(context);
            colorStateList = AnonymousClass00F.A04(context, C224514j.A00(context, r0.backgroundAttrb, r0.background));
        }
        super.setBackgroundTintList(colorStateList);
    }

    public void setElevation(float f) {
        if (this.A04) {
            C28021Qu r2 = this.A03;
            Context context = getContext();
            AnonymousClass00C.A08(context);
            f = (float) context.getResources().getDimensionPixelSize(r2.elevation);
        }
        super.setElevation(f);
    }

    public void setImageTintList(ColorStateList colorStateList) {
        if (this.A04) {
            C28021Qu r0 = this.A03;
            Context context = getContext();
            AnonymousClass00C.A08(context);
            colorStateList = AnonymousClass00F.A04(context, C224514j.A00(context, r0.contentAttrb, r0.content));
        }
        super.setImageTintList(colorStateList);
    }

    public void setSize(int i) {
        if (this.A04) {
            i = this.A03.size;
        }
        super.setSize(i);
    }

    public final C20810yC getAbProps() {
        return this.A00;
    }

    public final C28021Qu getWdsFabStyle() {
        return this.A03;
    }

    public final void setAbProps(C20810yC r1) {
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSFab(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
