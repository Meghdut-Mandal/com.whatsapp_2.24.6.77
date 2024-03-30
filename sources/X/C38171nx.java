package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.1nx  reason: invalid class name and case insensitive filesystem */
public final class C38171nx extends FrameLayout implements AnonymousClass012, C18700tb {
    public AnonymousClass3O5 A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final AnonymousClass01N A03;

    public final void setViewModel(AnonymousClass3O5 r2) {
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

    public final AnonymousClass3O5 getViewModel() {
        AnonymousClass3O5 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0a();
    }

    public C38171nx(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C27861Qc.A03((C27861Qc) ((C27851Qb) generatedComponent()));
        }
        this.A03 = new AnonymousClass01N(this);
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.A07(AnonymousClass01P.RESUMED);
        C36391kE.A0O(this, R.id.auto_muted_text).setText(R.string.f12nameremoved);
        C66923Xv.A01(C012005e.A02(this, R.id.unmute_cta), this, 41);
        C66923Xv.A01(C012005e.A02(this, R.id.ok_cta), this, 40);
        C55492ui.A01(this, getViewModel().A02, new AnonymousClass4IM(this), 3);
        C55492ui.A01(this, getViewModel().A01, new AnonymousClass4IN(this), 2);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A03.A07(AnonymousClass01P.DESTROYED);
        AnonymousClass3O5 viewModel = getViewModel();
        viewModel.A04.unregisterObserver(viewModel.A03);
    }

    public AnonymousClass01N getLifecycle() {
        return this.A03;
    }
}
