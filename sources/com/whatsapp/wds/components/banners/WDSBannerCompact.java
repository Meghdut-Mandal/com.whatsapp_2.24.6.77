package com.whatsapp.wds.components.banners;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass076;
import X.AnonymousClass4XU;
import X.C015006m;
import X.C27991Qq;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36421kH;
import X.C50732lU;
import X.C50742lV;
import X.C599435w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.text.ReadMoreTextView;

public final class WDSBannerCompact extends LinearLayout {
    public ReadMoreTextView A00 = ((ReadMoreTextView) findViewById(R.id.banner_text));
    public WaImageView A01 = C36421kH.A0J(this, R.id.dismiss_icon);
    public WaImageView A02 = C36421kH.A0J(this, R.id.banner_icon);
    public C599435w A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSBannerCompact(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        C599435w r2 = C50732lU.A00;
        this.A03 = r2;
        View.inflate(context, R.layout.f9nameremoved, this);
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A02;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            AnonymousClass00C.A0D(obtainStyledAttributes, 0);
            int i = obtainStyledAttributes.getInt(2, 0);
            if (i != 0 && i == 1) {
                r2 = C50742lV.A00;
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                WaImageView waImageView = this.A02;
                if (waImageView != null) {
                    waImageView.setVisibility(0);
                }
                WaImageView waImageView2 = this.A02;
                if (waImageView2 != null) {
                    waImageView2.setImageDrawable(drawable);
                }
            }
            ReadMoreTextView readMoreTextView = this.A00;
            if (readMoreTextView != null) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    readMoreTextView.setText(resourceId);
                } else {
                    readMoreTextView.setText(obtainStyledAttributes.getText(1));
                }
                readMoreTextView.setLinesLimit(obtainStyledAttributes.getInt(3, 0));
                String string = obtainStyledAttributes.getString(4);
                if (string != null) {
                    readMoreTextView.A04 = string;
                }
            }
            obtainStyledAttributes.recycle();
        }
        setStyle(r2);
    }

    public final void setText(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            readMoreTextView.setText(charSequence);
        }
    }

    private final void setStyle(C599435w r5) {
        Drawable drawable;
        this.A03 = r5;
        setBackgroundColor(C015006m.A00((Resources.Theme) null, getResources(), r5.A00));
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            readMoreTextView.setTextColor(C015006m.A00((Resources.Theme) null, getResources(), r5.A01));
        }
        if (r5 instanceof C50742lV) {
            C36331k8.A0y(this.A01);
            if (readMoreTextView != null) {
                readMoreTextView.setGravity(17);
                return;
            }
            return;
        }
        WaImageView waImageView = this.A02;
        if (waImageView != null && (drawable = waImageView.getDrawable()) != null) {
            AnonymousClass076.A06(drawable, C015006m.A00((Resources.Theme) null, C36341k9.A0F(this), R.color.f6nameremoved));
        }
    }

    public final TextPaint getTextPaint() {
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            return readMoreTextView.getPaint();
        }
        return null;
    }

    public final void setOnDismissListener(AnonymousClass00S r3) {
        WaImageView waImageView = this.A01;
        if (r3 == null) {
            if (waImageView != null) {
                waImageView.setOnClickListener((View.OnClickListener) null);
            }
        } else if (waImageView != null) {
            C36351kA.A1E(waImageView, r3, 32);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        AnonymousClass4XU r0;
        super.setOnClickListener(onClickListener);
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null && readMoreTextView.A00 != 0) {
            if (onClickListener != null) {
                r0 = new AnonymousClass4XU(onClickListener, this, 1);
            } else {
                r0 = null;
            }
            readMoreTextView.A02 = r0;
        }
    }

    public static final void setOnDismissListener$lambda$5(AnonymousClass00S r0, View view) {
        r0.invoke();
    }

    public final void setOnDismissListener(View.OnClickListener onClickListener) {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setOnClickListener(onClickListener);
        }
    }

    public final void setText(int i) {
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            readMoreTextView.setText(i);
        }
    }
}
