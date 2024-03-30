package com.whatsapp.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class SettingsRowPrivacyText extends LinearLayout {
    public SettingsRowPrivacyText(Context context) {
        this(context, (AttributeSet) null);
    }

    public SettingsRowPrivacyText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        View.inflate(context, R.layout.f9nameremoved, this);
    }
}
