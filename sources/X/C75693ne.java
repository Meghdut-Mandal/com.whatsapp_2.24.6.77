package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.3ne  reason: invalid class name and case insensitive filesystem */
public final class C75693ne implements C88804Uc {
    public final /* synthetic */ CatalogMediaViewFragment A00;

    public void B5M(int i) {
    }

    public void BY2() {
    }

    public C75693ne(CatalogMediaViewFragment catalogMediaViewFragment) {
        this.A00 = catalogMediaViewFragment;
    }

    public AnonymousClass00I B50(int i) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        View inflate = catalogMediaViewFragment.A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        ViewGroup A0P = C36411kG.A0P(viewGroup, R.id.footer);
        AnonymousClass4WF r11 = new AnonymousClass4WF(catalogMediaViewFragment.A0a(), catalogMediaViewFragment, 0);
        r11.A0K = new C48732hx(catalogMediaViewFragment, 35);
        int i2 = i;
        if (i2 == catalogMediaViewFragment.A00) {
            C207269up r0 = catalogMediaViewFragment.A03;
            if (r0 == null) {
                throw C36331k8.A0d("product");
            }
            C011004s.A08(r11, AnonymousClass000.A0p("thumb-transition-", AnonymousClass000.A0r("_", AnonymousClass000.A0v(r0.A0F), i2), AnonymousClass000.A0u()));
        }
        int i3 = 0;
        viewGroup.addView(r11, 0);
        r11.A01 = 0.2f;
        r11.A0O = true;
        C196089Xp r10 = catalogMediaViewFragment.A05;
        if (r10 != null) {
            C207269up r02 = catalogMediaViewFragment.A03;
            if (r02 == null) {
                throw C36331k8.A0d("product");
            }
            C206759tv r12 = (C206759tv) r02.A07.get(i2);
            if (r12 != null) {
                r10.A02(r11, r12, (C22914AyQ) null, new C69353dO(catalogMediaViewFragment, r11, i2), 1);
            }
            C207269up r03 = catalogMediaViewFragment.A03;
            if (r03 == null) {
                throw C36331k8.A0d("product");
            }
            String str = r03.A0C;
            if (str != null && str.length() > 0) {
                View inflate2 = catalogMediaViewFragment.A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
                MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) C36361kB.A0G(inflate2, R.id.caption);
                A0P.addView(inflate2, 0);
                C011504z.A04(new ColorDrawable(AnonymousClass00F.A00(catalogMediaViewFragment.A0a(), R.color.f6nameremoved)), A0P);
                C207269up r04 = catalogMediaViewFragment.A03;
                if (r04 == null) {
                    throw C36331k8.A0d("product");
                }
                mediaCaptionTextView.setCaptionText(r04.A0C);
            }
            if (!catalogMediaViewFragment.A0G) {
                i3 = 8;
            }
            A0P.setVisibility(i3);
            C207269up r05 = catalogMediaViewFragment.A03;
            if (r05 != null) {
                return C36441kJ.A0W(viewGroup, AnonymousClass000.A0r("_", AnonymousClass000.A0v(r05.A0F), i2));
            }
            throw C36331k8.A0d("product");
        }
        throw C36331k8.A0d("loadSession");
    }

    public /* bridge */ /* synthetic */ int BG4(Object obj) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        C207269up r0 = catalogMediaViewFragment.A03;
        if (r0 == null) {
            throw C36331k8.A0d("product");
        }
        int size = r0.A07.size();
        int i = 0;
        while (i < size) {
            C207269up r02 = catalogMediaViewFragment.A03;
            if (r02 == null) {
                throw C36331k8.A0d("product");
            } else if (AnonymousClass00C.A0J(AnonymousClass000.A0r("_", AnonymousClass000.A0v(r02.A0F), i), obj)) {
                return i;
            } else {
                i++;
            }
        }
        return 0;
    }

    public int getCount() {
        C207269up r0 = this.A00.A03;
        if (r0 != null) {
            return r0.A07.size();
        }
        throw C36331k8.A0d("product");
    }
}
