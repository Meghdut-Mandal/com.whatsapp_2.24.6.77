package com.whatsapp.wds.components.banners;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass2lR;
import X.AnonymousClass3A8;
import X.C27991Qq;
import X.C33521fV;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36421kH;
import X.C50702lO;
import X.C50712lP;
import X.C50722lQ;
import X.C50762lX;
import X.C607339d;
import X.C62053Eo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSBanner extends ConstraintLayout {
    public WaImageView A00 = C36421kH.A0J(this, R.id.dismiss_icon);
    public WaImageView A01 = C36421kH.A0J(this, R.id.banner_icon);
    public WaTextView A02 = C36411kG.A0Z(this, R.id.banner_description);
    public WaTextView A03 = C36411kG.A0Z(this, R.id.banner_header);
    public C607339d A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.f13nameremoved);
        WaImageView waImageView;
        AnonymousClass00C.A0D(context, 1);
        C607339d r5 = C50702lO.A00;
        this.A04 = r5;
        View.inflate(context, R.layout.f9nameremoved, this);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A01;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            C62053Eo r4 = new C62053Eo();
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                r5 = new AnonymousClass2lR(new C50762lX(resourceId));
            } else {
                int i = obtainStyledAttributes.getInt(1, 0);
                if (i != 0) {
                    if (i == 1) {
                        r5 = C50722lQ.A00;
                    } else if (i == 2) {
                        r5 = C50712lP.A00;
                    }
                }
            }
            this.A04 = r5;
            r4.A02 = r5;
            int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId2 != 0) {
                r4.A01 = resourceId2;
            } else {
                r4.A04 = obtainStyledAttributes.getString(4);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                r4.A00 = resourceId3;
            } else {
                r4.A03 = obtainStyledAttributes.getString(2);
            }
            setDismissible(obtainStyledAttributes.getBoolean(3, false));
            AnonymousClass3A8 A012 = r4.A01();
            if (!(A012.A03 == null && A012.A00 == 0)) {
                setState(A012);
            }
            float dimension = obtainStyledAttributes.getDimension(5, -1.0f);
            if (!(dimension == -1.0f || (waImageView = this.A01) == null)) {
                ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
                int i2 = (int) dimension;
                layoutParams.width = i2;
                layoutParams.height = i2;
            }
            obtainStyledAttributes.recycle();
        }
        WaImageView waImageView2 = this.A00;
        if (waImageView2 != null) {
            C33521fV.A02(waImageView2);
        }
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0102, code lost:
        if (r7.getVisibility() != 8) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setState(X.AnonymousClass3A8 r9) {
        /*
            r8 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            X.39d r0 = r9.A02
            r8.A04 = r0
            java.lang.String r2 = r9.A04
            if (r2 == 0) goto L_0x0017
            int r0 = r9.A01
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "Both id and string values are set for headlineText. Please specify one of them"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0017:
            int r1 = r9.A01
            if (r1 == 0) goto L_0x0031
            com.whatsapp.WaTextView r0 = r8.A03
            if (r0 == 0) goto L_0x0022
            r0.setText(r1)
        L_0x0022:
            java.lang.CharSequence r2 = r9.A03
            if (r2 == 0) goto L_0x003b
            int r0 = r9.A00
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "Both id and string values are set for descriptionText. Please specify one of them"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0031:
            if (r2 == 0) goto L_0x0022
            com.whatsapp.WaTextView r0 = r8.A03
            if (r0 == 0) goto L_0x0022
            r0.setText(r2)
            goto L_0x0022
        L_0x003b:
            int r1 = r9.A00
            if (r1 == 0) goto L_0x0157
            com.whatsapp.WaTextView r0 = r8.A02
            if (r0 == 0) goto L_0x0046
            r0.setText(r1)
        L_0x0046:
            boolean r0 = r9.A05
            r8.setDismissible(r0)
            android.content.Context r2 = r8.getContext()
            X.39d r0 = r8.A04
            int r1 = r0.A02
            int r0 = r0.A03
            int r4 = X.C224514j.A00(r2, r1, r0)
            X.39d r0 = r8.A04
            X.2vW r3 = r0.A04
            boolean r0 = r3 instanceof X.C50762lX
            r2 = 0
            if (r0 == 0) goto L_0x014d
            android.content.res.Resources r1 = r8.getResources()
            X.2lX r3 = (X.C50762lX) r3
            int r0 = r3.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0BT.A00(r2, r1, r0)
        L_0x006e:
            if (r0 == 0) goto L_0x008d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass08I.A01(r0)
            X.AnonymousClass00C.A08(r1)
            android.content.res.Resources r0 = r8.getResources()
            int r0 = X.C015006m.A00(r2, r0, r4)
            X.AnonymousClass076.A06(r1, r0)
            com.whatsapp.WaImageView r0 = r8.A01
            if (r0 == 0) goto L_0x008d
            r0.setImageDrawable(r1)
        L_0x008d:
            X.06M r2 = new X.06M
            r2.<init>()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168945(0x7f070eb1, float:1.7952206E38)
            float r0 = r1.getDimension(r0)
            r2.A01(r0)
            X.06J r0 = new X.06J
            r0.<init>(r2)
            X.05l r2 = new X.05l
            r2.<init>((X.AnonymousClass06J) r0)
            android.content.Context r3 = r8.getContext()
            X.39d r0 = r8.A04
            int r1 = r0.A00
            int r0 = r0.A01
            int r1 = X.C224514j.A00(r3, r1, r0)
            android.content.Context r0 = r8.getContext()
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r0, r1)
            r2.A0C(r0)
            X.39d r1 = r8.A04
            X.2lP r0 = X.C50712lP.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00ed
            android.content.Context r1 = r8.getContext()
            r0 = 2131102777(0x7f060c39, float:1.7818002E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r1, r0)
            r2.A0D(r0)
            android.content.res.Resources r1 = X.C36341k9.A0F(r8)
            r0 = 2131168878(0x7f070e6e, float:1.795207E38)
            float r1 = r1.getDimension(r0)
            X.06X r0 = r2.A01
            r0.A04 = r1
            r2.invalidateSelf()
        L_0x00ed:
            r8.setBackground(r2)
            X.0Yx r4 = new X.0Yx
            r4.<init>()
            com.whatsapp.WaTextView r7 = r8.A03
            r6 = 8
            r5 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0104
            int r1 = r7.getVisibility()
            r0 = 1
            if (r1 == r6) goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r3 = 7
            if (r0 != 0) goto L_0x012a
            if (r7 == 0) goto L_0x0119
            java.lang.CharSequence r0 = r7.getText()
            if (r0 == 0) goto L_0x0116
            boolean r0 = X.AnonymousClass098.A06(r0)
            if (r0 == 0) goto L_0x012c
        L_0x0116:
            r7.setVisibility(r6)
        L_0x0119:
            r4.A0B(r8)
            r2 = 2131427928(0x7f0b0258, float:1.8477486E38)
            r1 = 2131429611(0x7f0b08eb, float:1.84809E38)
            r0 = 6
            r4.A08(r2, r3, r1, r0)
        L_0x0126:
            r4.A09(r8)
        L_0x0129:
            return
        L_0x012a:
            if (r7 == 0) goto L_0x0129
        L_0x012c:
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x0129
            java.lang.CharSequence r0 = r7.getText()
            if (r0 == 0) goto L_0x0129
            boolean r0 = X.AnonymousClass098.A06(r0)
            r0 = r0 ^ 1
            if (r0 != r5) goto L_0x0129
            r7.setVisibility(r2)
            r4.A0B(r8)
            r0 = 2131427928(0x7f0b0258, float:1.8477486E38)
            r4.A08(r0, r3, r2, r3)
            goto L_0x0126
        L_0x014d:
            boolean r0 = r3 instanceof X.C50752lW
            if (r0 == 0) goto L_0x0162
            X.2lW r3 = (X.C50752lW) r3
            android.graphics.drawable.BitmapDrawable r0 = r3.A00
            goto L_0x006e
        L_0x0157:
            if (r2 == 0) goto L_0x0046
            com.whatsapp.WaTextView r0 = r8.A02
            if (r0 == 0) goto L_0x0046
            r0.setText(r2)
            goto L_0x0046
        L_0x0162:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.banners.WDSBanner.setState(X.3A8):void");
    }

    public final void setDescriptionSelected(boolean z) {
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            waTextView.setSelected(z);
        }
    }

    public final void setDismissible(boolean z) {
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            waImageView.setVisibility(C36381kD.A00(z ? 1 : 0));
        }
    }

    public final void setOnDismissListener(AnonymousClass00S r3) {
        WaImageView waImageView = this.A00;
        if (r3 == null) {
            if (waImageView != null) {
                waImageView.setOnClickListener((View.OnClickListener) null);
            }
        } else if (waImageView != null) {
            C36351kA.A1E(waImageView, r3, 31);
        }
    }

    private final void A00(int i, int i2) {
        Object layoutParams;
        if (getLayoutParams() != null) {
            layoutParams = getLayoutParams();
            AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i2, i, i2, i);
        requestLayout();
    }

    public final void A06() {
        A00(0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public final void A07() {
        A00(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public static final void setOnDismissListener$lambda$4(AnonymousClass00S r0, View view) {
        r0.invoke();
    }

    public final void setOnDismissListener(View.OnClickListener onClickListener) {
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            waImageView.setOnClickListener(onClickListener);
        }
    }
}
