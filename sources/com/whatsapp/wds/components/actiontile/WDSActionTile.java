package com.whatsapp.wds.components.actiontile;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass06T;
import X.AnonymousClass088;
import X.C013105r;
import X.C20810yC;
import X.C27991Qq;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36411kG;
import X.C36421kH;
import X.C38631pQ;
import X.C592433e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Space;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSActionTile extends C38631pQ {
    public int A00;
    public int A01;
    public WaImageView A02;
    public WaTextView A03;
    public C20810yC A04;
    public C592433e A05;
    public boolean A06 = true;
    public Space A07;
    public boolean A08 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSActionTile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WaTextView waTextView;
        AnonymousClass00C.A0D(context, 1);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A00;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A01 = resourceId;
            }
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            this.A06 = obtainStyledAttributes.getBoolean(1, true);
            super.setOrientation(obtainStyledAttributes.getInt(2, 1));
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A02 = C36421kH.A0J(this, R.id.action_tile_icon);
        this.A03 = C36411kG.A0Z(this, R.id.action_tile_label);
        if (getAbProps().A0E(7442) && (waTextView = this.A03) != null) {
            waTextView.setMaxLines(getResources().getInteger(R.integer.f8nameremoved));
        }
        this.A07 = (Space) findViewById(R.id.action_tile_spacing);
        setClickable(this.A06);
        setFocusable(this.A06);
        A00();
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    private final void A00() {
        if (this.A08) {
            this.A05 = new C592433e(C36371kC.A0B(this));
            WaTextView waTextView = this.A03;
            if (waTextView != null) {
                waTextView.setText(this.A01);
                waTextView.setEnabled(this.A06);
            }
            A02();
            A05();
            A06();
            WaImageView waImageView = this.A02;
            if (waImageView != null) {
                waImageView.setEnabled(this.A06);
                waImageView.setImageResource(this.A00);
                C592433e r8 = this.A05;
                if (r8 == null) {
                    throw C36331k8.A0d("style");
                }
                Context context = r8.A00;
                AnonymousClass00C.A0D(context, 0);
                AnonymousClass06T.A00(new ColorStateList(new int[][]{new int[]{16842910}, new int[0]}, new int[]{C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved), C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved)}), waImageView);
            }
            A04();
            A01();
            A03();
        }
    }

    private final void A01() {
        C592433e r0 = this.A05;
        if (r0 == null) {
            throw C36331k8.A0d("style");
        }
        boolean z = this.A06;
        Context context = r0.A00;
        Drawable A002 = AnonymousClass00E.A00(context, R.drawable.wds_action_list_background);
        if (z) {
            AnonymousClass00C.A0D(context, 0);
            A002 = new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved), AnonymousClass00F.A00(context, R.color.f6nameremoved)}), A002, AnonymousClass00E.A00(context, R.drawable.wds_action_tile_background_mask));
        }
        setBackground(A002);
    }

    private final void A02() {
        WaTextView waTextView = this.A03;
        if (waTextView == null) {
            return;
        }
        if (this.A05 == null) {
            throw C36331k8.A0d("style");
        }
        int orientation = getOrientation();
        int i = R.style.f13nameremoved;
        if (orientation == 1) {
            i = R.style.f13nameremoved;
        }
        AnonymousClass088.A06(waTextView, i);
    }

    private final void A03() {
        int i;
        int dimensionPixelSize;
        int A022;
        int A023;
        C592433e r2 = this.A05;
        if (r2 == null) {
            throw C36331k8.A0d("style");
        }
        int orientation = getOrientation();
        Context context = r2.A00;
        if (orientation == 1) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            Resources resources = context.getResources();
            i = R.dimen.f7nameremoved;
            A022 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            A023 = C36361kB.A02(context, R.dimen.f7nameremoved);
        } else {
            Resources resources2 = context.getResources();
            i = R.dimen.f7nameremoved;
            dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.f7nameremoved);
            A022 = C36361kB.A02(context, R.dimen.f7nameremoved);
            A023 = C36361kB.A02(context, R.dimen.f7nameremoved);
        }
        setPadding(dimensionPixelSize, A022, A023, C36361kB.A02(context, i));
    }

    private final void A04() {
        if (this.A05 == null) {
            throw C36331k8.A0d("style");
        }
        int orientation = getOrientation();
        int i = R.dimen.f7nameremoved;
        if (orientation == 1) {
            i = R.dimen.f7nameremoved;
        }
        Space space = this.A07;
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C36371kC.A03(this, i);
            }
            space.requestLayout();
        }
    }

    private final void A05() {
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            C592433e r1 = this.A05;
            if (r1 == null) {
                throw C36331k8.A0d("style");
            }
            boolean z = this.A06;
            Context context = r1.A00;
            int i = R.attr.f4nameremoved;
            int i2 = R.color.f6nameremoved;
            if (z) {
                i = R.attr.f4nameremoved;
                i2 = R.color.f6nameremoved;
            }
            AnonymousClass00C.A0D(context, 0);
            C36321k7.A0M(context, waTextView, i, i2);
        }
    }

    private final void A06() {
        WaTextView waTextView = this.A03;
        if (waTextView == null) {
            return;
        }
        if (this.A05 == null) {
            throw C36331k8.A0d("style");
        }
        int i = 1;
        if (getOrientation() != 1) {
            i = 8388611;
        }
        waTextView.setGravity(i);
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final void setIcon(int i) {
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            waImageView.setImageDrawable(C013105r.A01(getContext(), i));
        }
    }

    public final void setText(int i) {
        this.A01 = i;
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            waTextView.setText(i);
        }
    }

    public final WaTextView getLabelView$app_ui_wds_wds_non_modified() {
        return this.A03;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A06 = z;
        A05();
        A01();
        setClickable(z);
        setFocusable(z);
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        if (!this.A08) {
            return;
        }
        if (this.A05 == null) {
            A00();
            return;
        }
        A02();
        A06();
        A04();
        A03();
    }

    public final void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            waImageView.setImageDrawable(drawable);
        }
    }

    public final void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            waTextView.setText(charSequence);
        }
    }
}
