package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass012;
import X.AnonymousClass04S;
import X.AnonymousClass1QZ;
import X.AnonymousClass394;
import X.AnonymousClass3UY;
import X.AnonymousClass4UP;
import X.C001600r;
import X.C18700tb;
import X.C18820ts;
import X.C34831hi;
import X.C36341k9;
import X.C36441kJ;
import X.C56832wx;
import X.C80403vL;
import X.C88554Td;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

public class MediaTimeDisplay extends FrameLayout implements C18700tb {
    public int A00;
    public AnonymousClass4UP A01;
    public AnonymousClass394 A02;
    public C18820ts A03;
    public AnonymousClass1QZ A04;
    public Runnable A05;
    public boolean A06;
    public WaTextView A07;
    public boolean A08;
    public final AnonymousClass04S A09;
    public final AnonymousClass04S A0A;

    public static void A01(MediaTimeDisplay mediaTimeDisplay) {
        int duration;
        if (mediaTimeDisplay.A01 == null || mediaTimeDisplay.getVisibility() != 0 || !mediaTimeDisplay.A06 || mediaTimeDisplay.A00 != 0) {
            AnonymousClass394 r2 = mediaTimeDisplay.A02;
            if (r2.A01) {
                r2.A01 = false;
                r2.A03.removeCallbacks(r2.A00);
            }
        } else {
            AnonymousClass394 r22 = mediaTimeDisplay.A02;
            if (!r22.A01) {
                r22.A01 = true;
                r22.A03.post(r22.A00);
            }
        }
        if (mediaTimeDisplay.getVisibility() == 0) {
            AnonymousClass4UP r1 = mediaTimeDisplay.A01;
            if (r1 == null) {
                duration = 0;
            } else if (mediaTimeDisplay.A00 == 0) {
                duration = r1.getCurrentPosition();
            } else {
                duration = r1.getDuration();
            }
            mediaTimeDisplay.A07.setText(AnonymousClass3UY.A07(mediaTimeDisplay.A03, (long) ((int) Math.floor((double) (duration / 1000)))));
        }
    }

    public void A02() {
        if (!this.A08) {
            this.A08 = true;
            this.A03 = C36341k9.A0U(generatedComponent());
        }
    }

    public void A03(AnonymousClass012 r5, AnonymousClass4UP r6) {
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        this.A01 = r6;
        C001600r BEL = r6.BEL();
        BEL.A08(r5, this.A0A);
        C34831hi BD0 = r6.BD0();
        BD0.A08(r5, this.A09);
        this.A05 = new C80403vL(this, BD0, BEL, 9);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setTextColor(int i) {
        this.A07.setTextColor(i);
    }

    public MediaTimeDisplay(Context context) {
        super(context);
        this.A09 = AnonymousClass394.A00(this);
        this.A0A = new C88554Td(this, 37);
        A00((AttributeSet) null);
    }

    private void A00(AttributeSet attributeSet) {
        boolean z;
        Context context = getContext();
        int i = -1;
        float f = 12.5f;
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56832wx.A03);
            int color = obtainStyledAttributes.getColor(1, -1);
            z = obtainStyledAttributes.getBoolean(0, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            if (dimensionPixelSize != -1) {
                f = (float) dimensionPixelSize;
                i2 = 0;
            }
            obtainStyledAttributes.recycle();
            i = color;
        } else {
            z = true;
        }
        WaTextView waTextView = new WaTextView(context);
        this.A07 = waTextView;
        waTextView.setLines(1);
        this.A07.setSingleLine(true);
        this.A07.setTextColor(i);
        this.A07.setTextSize(i2, f);
        WaTextView waTextView2 = this.A07;
        waTextView2.setTypeface(waTextView2.getTypeface(), z ? 1 : 0);
        addView(this.A07);
        A01(this);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A01(this);
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = AnonymousClass394.A00(this);
        this.A0A = new C88554Td(this, 37);
        A00(attributeSet);
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = AnonymousClass394.A00(this);
        this.A0A = new C88554Td(this, 37);
        A00(attributeSet);
    }
}
