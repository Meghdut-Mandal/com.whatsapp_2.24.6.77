package com.whatsapp.settings;

import X.AnonymousClass1RJ;
import X.AnonymousClass3UF;
import X.C013105r;
import X.C100744vb;
import X.C18820ts;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C36341k9;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C38601pN;
import X.C56712wl;
import X.C88894Ul;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

@Deprecated
public class SettingsRowIconText extends C38601pN implements C88894Ul {
    public int A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;
    public C18820ts A05;
    public C20810yC A06;
    public AnonymousClass1RJ A07;

    public SettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setBadgeIcon(Drawable drawable) {
        A01(drawable, false);
    }

    public void A01(Drawable drawable, boolean z) {
        ImageView imageView;
        if (C20800yB.A01(C21000yV.A01, this.A06, 7676)) {
            AnonymousClass1RJ r2 = this.A07;
            int i = 8;
            if (drawable != null) {
                i = 0;
            }
            r2.A03(i);
            if (drawable != null) {
                if (z) {
                    drawable = new C100744vb(drawable, this.A05);
                }
                imageView = (ImageView) r2.A01();
                int i2 = this.A00;
                if (i2 != -1) {
                    AnonymousClass3UF.A0E(imageView, i2);
                }
            } else {
                return;
            }
        } else {
            imageView = this.A01;
            int i3 = 8;
            if (drawable != null) {
                i3 = 0;
            }
            if (imageView.getVisibility() != i3) {
                imageView.setVisibility(i3);
            }
            if (drawable != null && z) {
                drawable = new C100744vb(drawable, this.A05);
            }
        }
        imageView.setImageDrawable(drawable);
    }

    public int getLayout() {
        if (C20800yB.A01(C21000yV.A01, this.A06, 7676)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    public void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A02;
        waImageView.setVisibility(C36411kG.A08(drawable));
        waImageView.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        WaTextView waTextView = this.A03;
        waTextView.setVisibility(C36411kG.A08(charSequence));
        waTextView.setText(charSequence);
    }

    public void setText(int i) {
        WaTextView waTextView = this.A04;
        waTextView.setVisibility(C36421kH.A00(i));
        waTextView.setText(i);
    }

    public WaImageView getIcon() {
        return this.A02;
    }

    public SettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        View inflate = View.inflate(context, getLayout(), this);
        this.A02 = C36431kI.A0X(inflate, R.id.settings_row_icon);
        this.A04 = C36401kF.A0Q(inflate, R.id.settings_row_text);
        this.A03 = C36401kF.A0Q(inflate, R.id.settings_row_subtext);
        C20810yC r1 = this.A06;
        C21000yV r6 = C21000yV.A01;
        if (C20800yB.A01(r6, r1, 7676)) {
            this.A07 = C36341k9.A0X(inflate, R.id.settings_row_badge_stub);
        } else {
            this.A01 = C36431kI.A0X(inflate, R.id.settings_row_badge);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56712wl.A01);
        try {
            boolean z = obtainStyledAttributes.getBoolean(4, false);
            if (obtainStyledAttributes.hasValue(3)) {
                Drawable A012 = C013105r.A01(context, obtainStyledAttributes.getResourceId(3, -1));
                WaImageView waImageView = this.A02;
                if (A012 == null) {
                    waImageView.setVisibility(8);
                } else {
                    waImageView.setVisibility(0);
                    if (z) {
                        A012 = new C100744vb(A012, this.A05);
                    }
                }
                this.A02.setImageDrawable(A012);
            } else {
                setIcon((int) R.drawable.ic_settings_help);
            }
            int color = obtainStyledAttributes.getColor(1, -1);
            if (color != -1) {
                AnonymousClass3UF.A0E(this.A02, color);
            }
            setText((CharSequence) this.A05.A0F(obtainStyledAttributes, 6));
            setSubText(this.A05.A0F(obtainStyledAttributes, 5));
            int color2 = obtainStyledAttributes.getColor(0, -1);
            this.A00 = color2;
            if (color2 != -1 && !C20800yB.A01(r6, this.A06, 7676)) {
                AnonymousClass3UF.A0E(this.A01, this.A00);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                A01(C013105r.A01(context, obtainStyledAttributes.getResourceId(2, -1)), z);
            }
            int color3 = obtainStyledAttributes.getColor(8, -1);
            if (color3 != -1) {
                this.A04.setTextColor(color3);
            }
            if (obtainStyledAttributes.hasValue(7)) {
                this.A03.setMaxLines(obtainStyledAttributes.getInt(7, 0));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setIcon(int i) {
        this.A02.setImageResource(i);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A04;
        waTextView.setVisibility(C36411kG.A08(charSequence));
        waTextView.setText(charSequence);
    }
}
