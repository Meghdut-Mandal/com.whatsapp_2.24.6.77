package com.whatsapp.calling.views;

import X.AnonymousClass0Z5;
import X.AnonymousClass1QZ;
import X.AnonymousClass7gJ;
import X.C011504z;
import X.C012005e;
import X.C18700tb;
import X.C21060yb;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C95254kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class CallResponseLayout extends FrameLayout implements C18700tb {
    public View A00;
    public View A01;
    public AnonymousClass7gJ A02;
    public C21060yb A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewConfiguration A08;
    public final AnonymousClass0Z5 A09;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A09.A0C(motionEvent);
        return true;
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = C36351kA.A0U(C36391kE.A0W(generatedComponent()));
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A09.A0I(true)) {
            C011504z.A05(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return this.A09.A0F(motionEvent);
        }
        this.A09.A0A();
        return false;
    }

    public void onVisibilityChanged(View view, int i) {
        int height;
        super.onVisibilityChanged(view, i);
        if (this.A01 != null && i == 0 && (height = (getHeight() - this.A01.getHeight()) - ((int) this.A01.getY())) != 0) {
            C012005e.A0Q(this.A01, height);
        }
    }

    public void setCallResponseSwipeUpHintView(View view) {
        this.A00 = view;
    }

    public void setCallResponseView(View view) {
        this.A01 = view;
    }

    public void setResponseListener(AnonymousClass7gJ r1) {
        this.A02 = r1;
    }

    public void setShowSwipeUpHintByDefault(boolean z) {
        this.A06 = z;
    }

    public void setTouchDownAfterDrag(boolean z) {
        this.A07 = z;
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = C36351kA.A0U(C36391kE.A0W(generatedComponent()));
        }
        this.A09 = AnonymousClass0Z5.A01(this, new C95254kJ(this));
        this.A08 = ViewConfiguration.get(getContext());
    }

    public CallResponseLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
