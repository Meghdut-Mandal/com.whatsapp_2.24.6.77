package com.whatsapp.conversation.conversationrow.dynamicview;

import X.AnonymousClass00C;
import X.AnonymousClass1X4;
import X.AnonymousClass3T1;
import X.C18820ts;
import X.C19630wG;
import X.C36321k7;
import X.C36331k8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.WaLinearLayout;
import java.util.List;

public final class DynamicMessageView extends WaLinearLayout {
    public AnonymousClass1X4 A00;
    public C19630wG A01;
    public C18820ts A02;
    public AnonymousClass3T1 A03;
    public List A04;
    public boolean A05;
    public boolean A06;

    public final void setUserAction(AnonymousClass1X4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContext(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final AnonymousClass1X4 getUserAction() {
        AnonymousClass1X4 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("userAction");
    }

    public final C19630wG getWaContext() {
        C19630wG r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A05) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DynamicMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    public final boolean getChildCanCaptureTouchEvent() {
        return this.A05;
    }

    public final void setChildCanCaptureTouchEvent(boolean z) {
        this.A05 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C36321k7.A0v(context, 1, attributeSet);
        A01();
        setOrientation(1);
        this.A05 = true;
    }
}
