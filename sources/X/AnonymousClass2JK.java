package X;

import android.os.Handler;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.2JK  reason: invalid class name */
public final class AnonymousClass2JK extends C70763fg {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JK(AnonymousClass3O0 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    public boolean A00(C225314u r7, Collection collection) {
        if (!(r7 instanceof StorageUsageGalleryActivity)) {
            return super.A00(r7, collection);
        }
        StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r7;
        C62473Gh r2 = storageUsageGalleryActivity.A0D;
        if (r2 == null || r2.A03.isEmpty()) {
            Log.e("storageusagegallery/dialog/delete no messages");
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("storageusagegallery/dialog/delete/");
        C36321k7.A1Y(A0u, r2.A03.size());
        StorageUsageGalleryActivity.A01(storageUsageGalleryActivity);
        storageUsageGalleryActivity.A06 = new C02680Bk();
        Collection values = storageUsageGalleryActivity.A0D.A03.values();
        storageUsageGalleryActivity.A0F = new C49412j4(storageUsageGalleryActivity.A06, new C90244Zq(storageUsageGalleryActivity, values, 1), storageUsageGalleryActivity.A0G, values);
        storageUsageGalleryActivity.A0S = new C81203wd(storageUsageGalleryActivity, values, 31);
        Handler handler = storageUsageGalleryActivity.A0V;
        handler.postDelayed(storageUsageGalleryActivity.A0X, 800);
        handler.postDelayed(storageUsageGalleryActivity.A0S, 5000);
        C36331k8.A1F(storageUsageGalleryActivity.A0F, storageUsageGalleryActivity.A04);
        Log.i("storage-usage-gallery-activity/load duplicate messages");
        return true;
    }
}
