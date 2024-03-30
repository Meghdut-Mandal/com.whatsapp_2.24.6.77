package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass13J;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C27851Qb;
import X.C27861Qc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class HoverAwareRecyclerView extends RecyclerView implements C18700tb {
    public AnonymousClass13J A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A16();
    }

    public final void setSystemFeatures(AnonymousClass13J r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A16() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass13J) ((C27861Qc) ((C27851Qb) generatedComponent())).A0M.A6z.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass13J getSystemFeatures() {
        AnonymousClass13J r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("systemFeatures");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        getSystemFeatures();
        return super.onInterceptHoverEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A16();
    }

    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A16();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
        A16();
    }
}
