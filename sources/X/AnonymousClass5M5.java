package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogHeader;
import java.lang.ref.WeakReference;

/* renamed from: X.5M5  reason: invalid class name */
public class AnonymousClass5M5 extends C132446Tt {
    public final C27761Ps A00;
    public final AnonymousClass141 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        CatalogHeader catalogHeader = (CatalogHeader) this.A02.get();
        if (catalogHeader == null) {
            return;
        }
        if (bitmap == null) {
            catalogHeader.A00.setImageResource(R.drawable.avatar_contact_large);
        } else {
            catalogHeader.A00.setImageBitmap(bitmap);
        }
    }

    public AnonymousClass5M5(CatalogHeader catalogHeader, C27761Ps r3, AnonymousClass141 r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass001.A0F(catalogHeader);
    }
}
