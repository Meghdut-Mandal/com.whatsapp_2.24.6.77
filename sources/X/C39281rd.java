package X;

import android.view.View;
import com.whatsapp.KeyboardPopupLayout;
import java.util.List;

/* renamed from: X.1rd  reason: invalid class name and case insensitive filesystem */
public final class C39281rd extends C06650Um {
    public AnonymousClass00S A00;
    public AnonymousClass00S A01;
    public final View A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39281rd(View view, int i, boolean z) {
        super(i);
        AnonymousClass00C.A0D(view, 1);
        this.A02 = view;
        this.A03 = z;
    }

    public AnonymousClass0Y8 A00(AnonymousClass0Y8 r2, C07460Xt r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00S r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
            this.A01 = null;
        }
        return r2;
    }

    public AnonymousClass09H A01(AnonymousClass09H r8, List list) {
        View view = this.A02;
        if (((view instanceof KeyboardPopupLayout) && ((KeyboardPopupLayout) view).A04) || !this.A03) {
            return r8;
        }
        AnonymousClass09I r2 = r8.A00;
        AnonymousClass09T A0C = r2.A0C(8);
        AnonymousClass00C.A08(A0C);
        AnonymousClass09T A0C2 = r2.A0C(7);
        AnonymousClass00C.A08(A0C2);
        AnonymousClass09T A022 = AnonymousClass09T.A02(AnonymousClass09T.A00(A0C.A01 - A0C2.A01, A0C.A03 - A0C2.A03, A0C.A02 - A0C2.A02, A0C.A00 - A0C2.A00), AnonymousClass09T.A04);
        view.setTranslationY((float) (A022.A03 - A022.A00));
        return r8;
    }

    public void A03(C07460Xt r3) {
        View view = this.A02;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        AnonymousClass00S r0 = this.A00;
        if (r0 != null) {
            r0.invoke();
            this.A00 = null;
        }
    }
}
