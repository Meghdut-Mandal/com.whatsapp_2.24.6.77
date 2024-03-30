package X;

import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2K8  reason: invalid class name */
public final class AnonymousClass2K8 extends AnonymousClass2JO {
    public boolean A03(C225314u r5, AnonymousClass3T1 r6) {
        int i;
        AnonymousClass00C.A0D(r6, 0);
        if (!(r5 instanceof MediaGalleryActivity)) {
            return super.A03(r5, r6);
        }
        MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r5;
        AnonymousClass00C.A0D(mediaGalleryActivity, 0);
        int i2 = mediaGalleryActivity.A00;
        if (i2 == mediaGalleryActivity.A03) {
            i = 4;
        } else if (i2 == mediaGalleryActivity.A01) {
            i = 5;
        } else {
            int i3 = mediaGalleryActivity.A02;
            i = 3;
            if (i2 == i3) {
                i = 6;
            }
        }
        return A02(r5, r6, i, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2K8(AnonymousClass1X4 r1, AnonymousClass3QW r2) {
        super(r1, r2);
        C36321k7.A0x(r1, r2);
    }
}
