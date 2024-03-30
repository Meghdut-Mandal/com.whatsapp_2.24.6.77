package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4mN  reason: invalid class name and case insensitive filesystem */
public final class C95844mN extends C02920Ck {
    public static final C02830Cb A01 = new C162467od(4);
    public final C006302t A00;

    public C95844mN(C006302t r3) {
        super(A01);
        this.A00 = r3;
        A0B(true);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C96744np(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved));
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r7, int i) {
        C96744np r72 = (C96744np) r7;
        AnonymousClass00C.A0D(r72, 0);
        AnonymousClass6CK r5 = (AnonymousClass6CK) A0L(i);
        AnonymousClass00C.A0B(r5);
        C006302t r2 = this.A00;
        C36331k8.A1I(r5, r2);
        WaImageView waImageView = r72.A01;
        waImageView.setImageResource(r5.A01);
        AnonymousClass3YG.A00(r72.A00, r2, r5, 14);
        View view = r72.A0H;
        C36331k8.A0q(view.getContext(), waImageView, r5.A00);
        boolean z = r5.A03;
        int i2 = R.color.f6nameremoved;
        if (z) {
            i2 = R.color.f6nameremoved;
        }
        AnonymousClass06T.A00(ColorStateList.valueOf(C36381kD.A05(view, i2)), waImageView);
        r72.A02.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public long A0E(int i) {
        return (long) ((AnonymousClass6CK) A0L(i)).A02.hashCode();
    }
}
