package X;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.2HM  reason: invalid class name */
public final class AnonymousClass2HM extends C80183uz {
    public int A00;
    public View A01;
    public AnonymousClass147 A02;
    public final ViewGroup A03;
    public final AnonymousClass16D A04;
    public final C19770wU A05;
    public final C28431Sq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HM(ViewGroup viewGroup, C28431Sq r3, AnonymousClass16D r4, AnonymousClass4V7 r5, AnonymousClass147 r6, C19770wU r7) {
        super(r5, 31);
        AnonymousClass00C.A0D(r5, 1);
        C36321k7.A1A(viewGroup, r4, r3, r7, 3);
        this.A02 = r6;
        this.A03 = viewGroup;
        this.A04 = r4;
        this.A06 = r3;
        this.A05 = r7;
    }

    public static final void A00(AnonymousClass2HM r10) {
        View view = r10.A01;
        if (view != null) {
            C85994Jf r3 = new C85994Jf(r10);
            C86004Jg r5 = new C86004Jg(r10);
            if (view instanceof WDSBannerCompact) {
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
                AnonymousClass155 A052 = C80183uz.A05(r10);
                AnonymousClass00C.A08(A052);
                int i = r10.A00;
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = AnonymousClass14B.A03(A052, R.color.f6nameremoved);
                AnonymousClass000.A1K(A0M, i);
                Spanned fromHtml = Html.fromHtml(A052.getResources().getQuantityString(R.plurals.f10nameremoved, i, AnonymousClass14B.A0I(A0M)));
                AnonymousClass00C.A08(fromHtml);
                wDSBannerCompact.setText((CharSequence) fromHtml);
                C66953Xy.A00(view, r3, 10);
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) new C66953Xy(r5, 9));
                return;
            }
            AnonymousClass4V7 r0 = r10.A01;
            AnonymousClass155 BoP = r0.BoP();
            int i2 = r10.A00;
            Object[] A0M2 = AnonymousClass001.A0M();
            C36361kB.A0x(r0.BoP(), r0.BoP(), A0M2);
            AnonymousClass000.A1L(A0M2, r10.A00, 1);
            Spanned fromHtml2 = Html.fromHtml(BoP.getResources().getQuantityString(R.plurals.f10nameremoved, i2, AnonymousClass14B.A0I(A0M2)));
            AnonymousClass00C.A08(fromHtml2);
            TextView A0P = C36391kE.A0P(view, R.id.pending_suggestions_text);
            if (A0P != null) {
                A0P.setText(fromHtml2);
            }
            C66953Xy.A00(view.findViewById(R.id.pending_suggestions_dismiss), r5, 11);
            C66953Xy.A00(view, r3, 8);
        }
    }
}
