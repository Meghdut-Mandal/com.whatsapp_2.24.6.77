package X;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.2HN  reason: invalid class name */
public class AnonymousClass2HN extends C80183uz {
    public int A00 = 0;
    public View A01;
    public AnonymousClass147 A02;
    public boolean A03 = false;
    public final ViewGroup A04;
    public final C24801Dv A05;
    public final AnonymousClass16D A06;
    public final C19770wU A07;
    public final boolean A08;

    public AnonymousClass2HN(ViewGroup viewGroup, C24801Dv r3, AnonymousClass16D r4, AnonymousClass4V7 r5, AnonymousClass141 r6, C19770wU r7, boolean z) {
        super(r5, 30);
        this.A04 = viewGroup;
        this.A07 = r7;
        this.A05 = r3;
        this.A06 = r4;
        if (r6.A0G()) {
            this.A02 = C36431kI.A0j(r6);
            this.A03 = r6.A0u;
        }
        this.A08 = z;
    }

    public static void A00(AnonymousClass2HN r9) {
        View view = r9.A01;
        if (view != null) {
            C66953Xy r6 = new C66953Xy(r9, 6);
            C66953Xy r5 = new C66953Xy(r9, 7);
            if (view instanceof WDSBannerCompact) {
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
                AnonymousClass155 A052 = C80183uz.A05(r9);
                int i = r9.A00;
                AnonymousClass00C.A0D(A052, 0);
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = AnonymousClass14B.A03(A052, R.color.f6nameremoved);
                AnonymousClass000.A1K(A0M, i);
                Spanned fromHtml = Html.fromHtml(A052.getResources().getQuantityString(R.plurals.f10nameremoved, i, AnonymousClass14B.A0I(A0M)));
                AnonymousClass00C.A08(fromHtml);
                wDSBannerCompact.setText((CharSequence) fromHtml);
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) r6);
                wDSBannerCompact.setOnClickListener(r5);
                return;
            }
            TextView A0O = C36391kE.A0O(view, R.id.pending_requests_text);
            AnonymousClass4V7 r0 = r9.A01;
            AnonymousClass155 BoP = r0.BoP();
            int i2 = r9.A00;
            Object[] A0M2 = AnonymousClass001.A0M();
            C36361kB.A0x(r0.BoP(), r0.BoP(), A0M2);
            AnonymousClass000.A1L(A0M2, r9.A00, 1);
            C36361kB.A1P(BoP.getResources().getQuantityString(R.plurals.f10nameremoved, i2, AnonymousClass14B.A0I(A0M2)), A0O);
            C012005e.A02(r9.A01, R.id.pending_participants_dismiss).setOnClickListener(r6);
            r9.A01.setOnClickListener(r5);
        }
    }
}
