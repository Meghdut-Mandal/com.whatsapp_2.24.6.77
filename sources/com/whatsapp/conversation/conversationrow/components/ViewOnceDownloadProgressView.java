package com.whatsapp.conversation.conversationrow.components;

import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1Y4;
import X.AnonymousClass3UF;
import X.AnonymousClass4ZP;
import X.C18700tb;
import X.C18800tq;
import X.C20810yC;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class ViewOnceDownloadProgressView extends FrameLayout implements C18700tb {
    public C20810yC A00;
    public AnonymousClass1Y4 A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final AnonymousClass1RJ A04;
    public final WaImageView A05;

    public ViewOnceDownloadProgressView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void A00(int i, int i2, int i3) {
        WaImageView waImageView = this.A05;
        Drawable drawable = null;
        if (i2 != -1) {
            drawable = AnonymousClass3UF.A06(getResources(), C36381kD.A0H(getContext(), i2), i3);
        }
        waImageView.setBackgroundDrawable(drawable);
        waImageView.setImageDrawable(AnonymousClass3UF.A06(getResources(), C36381kD.A0H(getContext(), i), i3));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36341k9.A0V(A0W);
            this.A01 = (AnonymousClass1Y4) A0W.AZK.get();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A05 = C36431kI.A0X(this, R.id.view_once_control_icon);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.view_once_progressbar);
        this.A04 = A0X;
        A0X.A07(new AnonymousClass4ZP((Object) this, 6));
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
