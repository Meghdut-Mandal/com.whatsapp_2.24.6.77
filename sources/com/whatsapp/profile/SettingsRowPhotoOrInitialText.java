package com.whatsapp.profile;

import X.AnonymousClass00C;
import X.C20800yB;
import X.C21000yV;
import X.C36351kA;
import X.C36431kI;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsRowIconText;

public final class SettingsRowPhotoOrInitialText extends SettingsRowIconText {
    public boolean A00;
    public final WaTextView A01;

    public SettingsRowPhotoOrInitialText(Context context) {
        super(context, (AttributeSet) null);
        A00();
        WaTextView A0Q = C36351kA.A0Q(this, R.id.settings_row_initial);
        this.A01 = A0Q;
        Drawable background = A0Q.getBackground();
        AnonymousClass00C.A0E(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(getResources().getColor(R.color.f6nameremoved));
    }

    public int getLayout() {
        if (C20800yB.A01(C21000yV.A01, this.A06, 7676)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    public final void setName(String str) {
        String A16;
        setText((CharSequence) str);
        if (str != null) {
            this.A02.setVisibility(8);
            WaTextView waTextView = this.A01;
            if (str.length() == 0) {
                A16 = "?";
            } else {
                A16 = C36431kI.A16(0, 1, str);
            }
            waTextView.setText(A16);
            waTextView.setVisibility(0);
        }
    }

    public SettingsRowPhotoOrInitialText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public SettingsRowPhotoOrInitialText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        WaTextView A0Q = C36351kA.A0Q(this, R.id.settings_row_initial);
        this.A01 = A0Q;
        Drawable background = A0Q.getBackground();
        AnonymousClass00C.A0E(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(getResources().getColor(R.color.f6nameremoved));
    }
}
