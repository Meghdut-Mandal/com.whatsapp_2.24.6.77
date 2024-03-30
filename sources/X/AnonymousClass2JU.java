package X;

import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;

/* renamed from: X.2JU  reason: invalid class name */
public final class AnonymousClass2JU extends C70813fl {
    public final StorageUsageGalleryActivity A00;
    public final C43682Jk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JU(AnonymousClass3C3 r4, StorageUsageGalleryActivity storageUsageGalleryActivity, C43682Jk r6) {
        super(r4.A00(storageUsageGalleryActivity));
        AnonymousClass00C.A0D(r4, 1);
        this.A00 = storageUsageGalleryActivity;
        this.A01 = r6;
    }

    public boolean B73(AnonymousClass4Q1 r3, Collection collection, int i) {
        AnonymousClass00C.A0D(collection, 1);
        if (i == 21) {
            return this.A01.A00.A00(this.A00, collection);
        }
        return super.B73(r3, collection, i);
    }
}
