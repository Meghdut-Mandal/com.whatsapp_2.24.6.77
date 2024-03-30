package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.2jS  reason: invalid class name and case insensitive filesystem */
public class C49642jS extends C132446Tt {
    public int A00;
    public Bitmap A01;
    public View A02;
    public ThumbnailButton A03;
    public String A04;
    public Map A05;
    public final /* synthetic */ CatalogCarouselDetailImageView A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C594033u r5 = (C594033u) obj;
        this.A05.put(this.A04, r5);
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A06;
        Bitmap bitmap = this.A01;
        boolean A1T = AnonymousClass000.A1T(bitmap.getWidth(), bitmap.getHeight());
        catalogCarouselDetailImageView.setImageAndGradient(r5, A1T, this.A03, bitmap, this.A02);
    }

    public C49642jS(Bitmap bitmap, View view, CatalogCarouselDetailImageView catalogCarouselDetailImageView, ThumbnailButton thumbnailButton, String str, Map map, int i) {
        this.A06 = catalogCarouselDetailImageView;
        this.A02 = view;
        this.A03 = thumbnailButton;
        this.A01 = bitmap;
        this.A00 = i;
        this.A05 = map;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C198029cm A002;
        AnonymousClass9UJ r3;
        Bitmap bitmap = this.A01;
        int i = this.A00;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return new C594033u(i, i);
        }
        boolean A1T = AnonymousClass000.A1T(width, height);
        AnonymousClass9UJ r10 = new AnonymousClass9UJ(bitmap);
        if (A1T) {
            double d = (double) width;
            r10.A01(0, 0, (int) (0.05d * d), height);
            A002 = r10.A00();
            r3 = new AnonymousClass9UJ(bitmap);
            r3.A01((int) (d * 0.95d), 0, width, height);
        } else {
            double d2 = (double) height;
            r10.A01(0, 0, width, (int) (0.05d * d2));
            A002 = r10.A00();
            r3 = new AnonymousClass9UJ(bitmap);
            r3.A01(0, (int) (d2 * 0.95d), width, height);
        }
        C198029cm A003 = r3.A00();
        int i2 = i;
        C200089ga r0 = A002.A01;
        if (r0 != null) {
            i2 = r0.A05;
        }
        C200089ga r02 = A003.A01;
        if (r02 != null) {
            i = r02.A05;
        }
        return new C594033u(i2, i);
    }
}
