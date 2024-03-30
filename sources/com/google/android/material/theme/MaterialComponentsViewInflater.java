package com.google.android.material.theme;

import X.AnonymousClass05W;
import X.AnonymousClass07P;
import X.C015506r;
import X.C03320Ec;
import X.C03470Fg;
import X.C03490Fo;
import X.C93174g3;
import X.C93224gB;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends AnonymousClass05W {
    public C03320Ec A02(Context context, AttributeSet attributeSet) {
        return new C93174g3(context, attributeSet);
    }

    public C015506r A03(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public AppCompatCheckBox A04(Context context, AttributeSet attributeSet) {
        return new C03470Fg(context, attributeSet);
    }

    public AppCompatRadioButton A05(Context context, AttributeSet attributeSet) {
        return new C03490Fo(context, attributeSet);
    }

    public AnonymousClass07P A06(Context context, AttributeSet attributeSet) {
        return new C93224gB(context, attributeSet);
    }
}
