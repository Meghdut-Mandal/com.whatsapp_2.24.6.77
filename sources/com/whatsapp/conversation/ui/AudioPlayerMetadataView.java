package com.whatsapp.conversation.ui;

import X.AnonymousClass000;
import X.AnonymousClass1JZ;
import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36391kE;
import X.C36441kJ;
import X.C56832wx;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class AudioPlayerMetadataView extends LinearLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public TextView A02;
    public boolean A03;

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C36341k9.A0U(generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(String str) {
        this.A02.setText(str);
    }

    public AudioPlayerMetadataView(Context context) {
        super(context);
        A01();
        A00(context, (AttributeSet) null);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup;
        View.inflate(context, R.layout.f9nameremoved, this);
        setOrientation(0);
        setGravity(17);
        View A022 = C012005e.A02(this, R.id.date_wrapper);
        View A023 = C012005e.A02(this, R.id.status);
        this.A02 = C36391kE.A0O(this, R.id.description);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56832wx.A00);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            AnonymousClass1JZ.A05(A022, this.A00, A022.getPaddingLeft(), dimensionPixelSize2);
            AnonymousClass1JZ.A03(A022, dimensionPixelSize, AnonymousClass000.A0a(A022).rightMargin);
            if (!z && (viewGroup = (ViewGroup) A023.getParent()) != null) {
                viewGroup.removeView(A023);
            }
        }
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context, attributeSet);
    }
}
