package com.google.android.exoplayer2.ui;

import X.AnonymousClass001;
import X.AnonymousClass6LB;
import X.AnonymousClass7f0;
import X.C36361kB;
import X.C90514aH;
import X.C92334dc;
import X.C92804ek;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout {
    public float A00;
    public boolean A01;
    public boolean A02;
    public float A03;
    public int A04;
    public View A05;
    public AnonymousClass6LB A06;
    public AnonymousClass7f0 A07;
    public List A08;

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00() {
        this.A07.BwW(this.A06, getCuesWithStylingPreferencesApplied(), this.A00, this.A03, 0);
    }

    private List getCuesWithStylingPreferencesApplied() {
        if (this.A02 && this.A01) {
            return this.A08;
        }
        ArrayList A0r = C36361kB.A0r(this.A08);
        if (0 >= this.A08.size()) {
            return A0r;
        }
        this.A08.get(0);
        throw AnonymousClass001.A0A("text");
    }

    private float getUserCaptionFontScale() {
        CaptioningManager A0S;
        if (isInEditMode() || (A0S = C90514aH.A0S(this)) == null || !A0S.isEnabled()) {
            return 1.0f;
        }
        return A0S.getFontScale();
    }

    private void setView(View view) {
        removeView(this.A05);
        View view2 = this.A05;
        if (view2 instanceof C92804ek) {
            ((C92804ek) view2).A03.destroy();
        }
        this.A05 = view;
        this.A07 = (AnonymousClass7f0) view;
        addView(view);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.A01 = z;
        A00();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.A02 = z;
        A00();
    }

    public void setBottomPaddingFraction(float f) {
        this.A03 = f;
        A00();
    }

    public void setCues(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.A08 = list;
        A00();
    }

    public void setFractionalTextSize(float f) {
        this.A00 = f;
        A00();
    }

    public void setStyle(AnonymousClass6LB r1) {
        this.A06 = r1;
        A00();
    }

    public void setViewType(int i) {
        View r2;
        if (this.A04 != i) {
            if (i == 1) {
                r2 = new C92334dc(getContext(), (AttributeSet) null);
            } else if (i == 2) {
                r2 = new C92804ek(getContext());
            } else {
                throw new IllegalArgumentException();
            }
            setView(r2);
            this.A04 = i;
        }
    }

    private AnonymousClass6LB getUserCaptionStyle() {
        CaptioningManager A0S;
        int i;
        int i2;
        int i3;
        int i4;
        if (isInEditMode() || (A0S = C90514aH.A0S(this)) == null || !A0S.isEnabled()) {
            return AnonymousClass6LB.A05;
        }
        CaptioningManager.CaptionStyle userStyle = A0S.getUserStyle();
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = -16777216;
        }
        userStyle.hasWindowColor();
        if (userStyle.hasEdgeType()) {
            i3 = userStyle.edgeType;
        } else {
            i3 = 0;
        }
        if (userStyle.hasEdgeColor()) {
            i4 = userStyle.edgeColor;
        } else {
            i4 = -1;
        }
        return new AnonymousClass6LB(userStyle.getTypeface(), i, i2, i3, i4);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = Collections.emptyList();
        this.A06 = AnonymousClass6LB.A05;
        this.A00 = 0.0533f;
        this.A03 = 0.08f;
        this.A02 = true;
        this.A01 = true;
        C92334dc r0 = new C92334dc(context, attributeSet);
        this.A07 = r0;
        this.A05 = r0;
        addView(r0);
        this.A04 = 1;
    }
}
