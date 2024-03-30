package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.1pF  reason: invalid class name and case insensitive filesystem */
public final class C38531pF extends LinearLayout implements AnonymousClass012, C18700tb {
    public C39931uI A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final AnonymousClass01N A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38531pF(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C39931uI) ((C27861Qc) ((C27851Qb) generatedComponent())).A0L.A3a.get();
        }
        this.A03 = new AnonymousClass01N(this);
    }

    public final void setViewModel(C39931uI r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C39931uI getViewModel() {
        C39931uI r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0a();
    }

    public AnonymousClass01M getLifecycle() {
        return this.A03;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.A07(AnonymousClass01P.RESUMED);
        C36371kC.A1D(this);
        setOrientation(1);
        C55492ui.A01(this, getViewModel().A09, C53102qm.A02(this, 7), 37);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A03.A07(AnonymousClass01P.DESTROYED);
    }
}
