package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vh  reason: invalid class name and case insensitive filesystem */
public final class C40531vh extends AnonymousClass0CZ {
    public final AnonymousClass3CG A00;
    public final /* synthetic */ CatalogImageListActivity A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        CatalogImageListActivity catalogImageListActivity = this.A01;
        View inflate = catalogImageListActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
        List list = AnonymousClass0D3.A0I;
        AnonymousClass3CG r1 = this.A00;
        AnonymousClass00C.A0B(inflate);
        return new C42211yS(inflate, catalogImageListActivity, r1);
    }

    public C40531vh(CatalogImageListActivity catalogImageListActivity, AnonymousClass3CG r2) {
        this.A01 = catalogImageListActivity;
        this.A00 = r2;
    }

    public int A0J() {
        C207269up r0 = this.A01.A02;
        if (r0 != null) {
            return r0.A07.size();
        }
        throw C36331k8.A0d("product");
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r11, int i) {
        C42211yS r112 = (C42211yS) r11;
        AnonymousClass00C.A0D(r112, 0);
        r112.A00 = AnonymousClass000.A1S(i, this.A01.A00);
        CatalogImageListActivity catalogImageListActivity = r112.A03;
        C196089Xp r4 = catalogImageListActivity.A03;
        if (r4 != null) {
            C207269up r0 = catalogImageListActivity.A02;
            if (r0 == null) {
                throw C36331k8.A0d("product");
            }
            C206759tv r6 = (C206759tv) r0.A07.get(i);
            if (r6 != null) {
                C55872vK r8 = new C55872vK(r112, 0);
                C89514Wv r7 = new C89514Wv(r112, 0);
                ImageView imageView = r112.A01;
                r4.A02(imageView, r6, r7, r8, 1);
                imageView.setOnClickListener(new C48942iJ(catalogImageListActivity, i, 0, r112));
                C207269up r02 = catalogImageListActivity.A02;
                if (r02 == null) {
                    throw C36331k8.A0d("product");
                }
                C011004s.A08(imageView, AnonymousClass000.A0p("thumb-transition-", AnonymousClass000.A0r("_", AnonymousClass000.A0v(r02.A0F), i), AnonymousClass000.A0u()));
                return;
            }
            return;
        }
        throw C36331k8.A0d("loadSession");
    }
}
