package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.4Bk  reason: invalid class name and case insensitive filesystem */
public final class C83964Bk extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83964Bk(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3GM r1 = this.this$0.A0I;
        if (r1 != null) {
            r1.A01 = true;
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("galleryPartialPermissionProvider");
    }
}
