package com.whatsapp.pushtorecordmedia;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass4UV;
import X.C05250Oz;
import X.C36391kE;
import X.C77203q7;
import X.C77213q8;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class PushToRecordIconAnimation extends FrameLayout implements AnonymousClass4UV {
    public AnonymousClass4UV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushToRecordIconAnimation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void A00(boolean z) {
        AnonymousClass4UV r0;
        if (this.A00 == null) {
            if (z) {
                r0 = new C77213q8(this);
            } else {
                r0 = new C77203q7(this);
            }
            this.A00 = r0;
            return;
        }
        throw AnonymousClass001.A09("PushToRecordIconAnimation already initialized");
    }

    public void BNt(int i) {
        AnonymousClass4UV r0 = this.A00;
        AnonymousClass00C.A0B(r0);
        r0.BNt(i);
    }

    public void Ble(int i) {
        AnonymousClass4UV r0 = this.A00;
        AnonymousClass00C.A0B(r0);
        r0.Ble(i);
    }

    public int getTint() {
        AnonymousClass4UV r0 = this.A00;
        AnonymousClass00C.A0B(r0);
        return r0.getTint();
    }

    public void setTint(int i) {
        AnonymousClass4UV r0 = this.A00;
        AnonymousClass00C.A0B(r0);
        r0.setTint(i);
    }

    public /* synthetic */ PushToRecordIconAnimation(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r6) {
        this(context, attributeSet, C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToRecordIconAnimation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
