package X;

import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2j4  reason: invalid class name and case insensitive filesystem */
public class C49412j4 extends C132446Tt {
    public final C02680Bk A00;
    public final AnonymousClass4QG A01;
    public final AnonymousClass1DF A02;
    public final HashMap A03 = AnonymousClass001.A0J();

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        StorageUsageDeleteMessagesDialogFragment A032;
        AnonymousClass01z A0k;
        Collection collection = (Collection) obj;
        C90244Zq r1 = (C90244Zq) this.A01;
        int i = r1.A02;
        Object obj2 = r1.A00;
        if (i != 0) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) obj2;
            Log.i("storage-usage-gallery-activity/load duplicate messages/loaded");
            StorageUsageGalleryActivity.A01(storageUsageGalleryActivity);
            A032 = StorageUsageDeleteMessagesDialogFragment.A03(new C89994Yr(storageUsageGalleryActivity, 1), (Collection) r1.A01, collection);
            A0k = storageUsageGalleryActivity.getSupportFragmentManager();
        } else {
            AnonymousClass02E r3 = (AnonymousClass02E) obj2;
            A032 = StorageUsageDeleteMessagesDialogFragment.A03(new C89994Yr(r3, 0), (Collection) r1.A01, collection);
            AnonymousClass01I A0h = r3.A0h();
            if (A0h != null && !A0h.isFinishing()) {
                A0k = r3.A0k();
            } else {
                return;
            }
        }
        A032.A1f(A0k, (String) null);
    }

    public C49412j4(C02680Bk r5, AnonymousClass4QG r6, AnonymousClass1DF r7, Collection collection) {
        File file;
        this.A02 = r7;
        this.A00 = r5;
        this.A01 = r6;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (A0l instanceof AnonymousClass2bU) {
                AnonymousClass2bU r1 = (AnonymousClass2bU) A0l;
                String str = r1.A04;
                C65013Qj r0 = r1.A01;
                if (r0 != null) {
                    file = r0.A0I;
                } else {
                    file = null;
                }
                if (!(str == null || file == null)) {
                    this.A03.put(str, file);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A10 = C36371kC.A10(this.A03);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            A0I.addAll(this.A02.A0C(this.A00, (File) A11.getValue(), (String) A11.getKey()));
        }
        return A0I;
    }
}
