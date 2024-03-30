package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1w5  reason: invalid class name and case insensitive filesystem */
public final class C40771w5 extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ AnonymousClass3PF A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new C42191yQ(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
    }

    public C40771w5(AnonymousClass3PF r2) {
        this.A01 = r2;
    }

    public int A0J() {
        return this.A00.size();
    }

    public final void A0L(AnonymousClass11F r3) {
        for (C597635e r0 : this.A00) {
            if (r3.equals(r0.A01)) {
                A06();
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42191yQ r82 = (C42191yQ) r8;
        AnonymousClass00C.A0D(r82, 0);
        C597635e r6 = (C597635e) this.A00.get(i);
        AnonymousClass3PF r5 = this.A01;
        AnonymousClass141 A0D = r5.A0B.A0D(r6.A01);
        ((AnonymousClass1RY) r5.A0N.getValue()).A0B(r82.A00, A0D, false);
        r82.A02.A0I(r5.A0E.A0L(A0D));
        AnonymousClass3UY.A0H(r82.A01, r5.A0F, r5.A0G, r6.A00);
    }
}
