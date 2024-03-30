package com.whatsapp.profile;

import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.AnonymousClass3UF;
import X.C18700tb;
import X.C18820ts;
import X.C36331k8;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class ProfileSettingsRowIconText extends LinearLayout implements C18700tb {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public C18820ts A06;
    public AnonymousClass1QZ A07;
    public boolean A08;

    public ProfileSettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00() {
        WaImageView waImageView;
        int i;
        if (this.A01.getVisibility() == 0 && this.A04.getVisibility() == 0) {
            waImageView = this.A02;
            i = 4;
        } else {
            waImageView = this.A02;
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A07;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(CharSequence charSequence) {
        WaTextView waTextView = this.A04;
        waTextView.setVisibility(C36411kG.A08(charSequence));
        A00();
        waTextView.setText(charSequence);
    }

    public void setPrimaryIcon(int i) {
        WaImageView waImageView = this.A01;
        waImageView.setVisibility(C36421kH.A00(i));
        A00();
        waImageView.setImageResource(i);
        this.A02.setImageResource(i);
    }

    public void setSecondaryIcon(int i) {
        WaImageView waImageView = this.A03;
        waImageView.setVisibility(C36421kH.A00(i));
        waImageView.setImageResource(i);
    }

    public void setSubText(CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setVisibility(C36411kG.A08(charSequence));
        textEmojiLabel.A0I(charSequence);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A05;
        waTextView.setVisibility(C36411kG.A08(charSequence));
        waTextView.setText(charSequence);
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C36331k8.A0C(generatedComponent());
        }
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C36331k8.A0C(generatedComponent());
        }
        setOrientation(1);
        setGravity(8388627);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A01 = C36421kH.A0J(this, R.id.profile_settings_row_icon);
        this.A02 = C36421kH.A0J(this, R.id.profile_settings_row_icon_placeholder);
        this.A03 = C36421kH.A0J(this, R.id.profile_settings_row_secondary_icon);
        this.A05 = C36411kG.A0Z(this, R.id.profile_settings_row_text);
        this.A00 = C36401kF.A0P(this, R.id.profile_settings_row_subtext);
        this.A04 = C36411kG.A0Z(this, R.id.profile_settings_row_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2x6.A05);
        try {
            setPrimaryIcon(obtainStyledAttributes.getResourceId(1, 0));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                AnonymousClass3UF.A0E(this.A01, color);
            }
            setSecondaryIcon(obtainStyledAttributes.getResourceId(3, 0));
            int color2 = obtainStyledAttributes.getColor(4, -1);
            if (color2 != -1) {
                AnonymousClass3UF.A0E(this.A03, color2);
            }
            setText(this.A06.A0F(obtainStyledAttributes, 6));
            setSubText(this.A06.A0F(obtainStyledAttributes, 5));
            setDescription(this.A06.A0F(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
