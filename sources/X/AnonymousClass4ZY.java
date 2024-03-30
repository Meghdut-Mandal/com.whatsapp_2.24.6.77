package X;

import android.database.Cursor;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

/* renamed from: X.4ZY  reason: invalid class name */
public class AnonymousClass4ZY implements C87774Qc {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final C88924Uo B4h(boolean z) {
        C74853mH r6;
        Cursor A02;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) obj;
            C20810yC r8 = storageUsageMediaGalleryFragment.A0F;
            AnonymousClass1A1 r10 = storageUsageMediaGalleryFragment.A08;
            r6 = new AnonymousClass2Tv(storageUsageMediaGalleryFragment.A04, r8, storageUsageMediaGalleryFragment.A07, r10, storageUsageMediaGalleryFragment.A0A, storageUsageMediaGalleryFragment.A03, storageUsageMediaGalleryFragment.A00);
        } else {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) obj;
            C20810yC r82 = mediaGalleryFragment.A0F;
            AnonymousClass1A1 r102 = mediaGalleryFragment.A04;
            r6 = new C74853mH(mediaGalleryFragment.A01, r82, mediaGalleryFragment.A03, r102, mediaGalleryFragment.A05);
        }
        if (r6.A01 == null) {
            AnonymousClass1A1 r5 = r6.A04;
            AnonymousClass11F r4 = r6.A03;
            if (r6 instanceof AnonymousClass2Tv) {
                AnonymousClass2Tv r0 = (AnonymousClass2Tv) r6;
                int i2 = r0.A00;
                int i3 = r0.A01;
                A02 = AnonymousClass1V2.A02(r0.A02, r0.A03, i2, i3);
            } else {
                C18740tg.A06(r4);
                A02 = r6.A02.A02(r4);
            }
            r6.A01 = new C36691l9(A02, (C20810yC) null, r4, r5);
        }
        return r6;
    }
}
