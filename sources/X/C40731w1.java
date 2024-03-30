package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;
import java.util.Map;

/* renamed from: X.1w1  reason: invalid class name and case insensitive filesystem */
public class C40731w1 extends AnonymousClass0CZ {
    public final Map A00 = AnonymousClass001.A0J();
    public final /* synthetic */ CatalogCarouselDetailImageView A01;

    public C40731w1(CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        this.A01 = catalogCarouselDetailImageView;
    }

    public int A0J() {
        return this.A01.A01.A07.size();
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        List list = AnonymousClass0D3.A0I;
        ThumbnailButton thumbnailButton = ((C42661zB) r3).A01;
        thumbnailButton.setImageBitmap((Bitmap) null);
        thumbnailButton.setOnClickListener((View.OnClickListener) null);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r23, int i) {
        ThumbnailButton thumbnailButton;
        C42661zB r3 = (C42661zB) r23;
        Map map = this.A00;
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = r3.A02;
        if (!catalogCarouselDetailImageView.A01.A07.isEmpty()) {
            C207269up r1 = catalogCarouselDetailImageView.A01;
            if (!r1.A02()) {
                boolean z = true;
                if (r1.A07.size() <= 1) {
                    z = false;
                }
                int i2 = i;
                if (catalogCarouselDetailImageView.A01.A07.get(i2) != null) {
                    C206759tv r11 = (C206759tv) catalogCarouselDetailImageView.A01.A07.get(i2);
                    int i3 = r11.A03;
                    int i4 = r11.A02;
                    if (!(i3 == 0 || i4 == 0)) {
                        C42661zB.A00(r3, i3, i4, z);
                    }
                    String A0r = AnonymousClass000.A0r("_", AnonymousClass000.A0v(catalogCarouselDetailImageView.A01.A0F), i2);
                    thumbnailButton = r3.A01;
                    if (!A0r.equals(thumbnailButton.getTag())) {
                        thumbnailButton.setImageResource(R.color.f6nameremoved);
                    }
                    thumbnailButton.setTag(A0r);
                    int i5 = i3;
                    Map map2 = map;
                    String str = A0r;
                    C42661zB r16 = r3;
                    catalogCarouselDetailImageView.A03.A01(thumbnailButton, r11, (C22914AyQ) null, catalogCarouselDetailImageView.getImageLoadContext(), (C22915AyR) null, new C69363dP(r16, str, map2, i5, i4, z), 1);
                } else {
                    thumbnailButton = r3.A01;
                    thumbnailButton.setImageResource(R.color.f6nameremoved);
                }
                if (catalogCarouselDetailImageView.A0C) {
                    int i6 = 1;
                    if (!z) {
                        i6 = 0;
                    }
                    thumbnailButton.setOnClickListener(new C48792i4(r3, i2, i6));
                    return;
                }
                return;
            }
        }
        C53332r9.A00(r3.A01);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A01;
        return new C42661zB(C36361kB.A0E(C36351kA.A0C(catalogCarouselDetailImageView), viewGroup, R.layout.f9nameremoved), catalogCarouselDetailImageView);
    }
}
