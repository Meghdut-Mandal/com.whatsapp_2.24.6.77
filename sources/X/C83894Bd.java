package X;

import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.4Bd  reason: invalid class name and case insensitive filesystem */
public final class C83894Bd extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83894Bd(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        AnonymousClass16L r4 = galleryTabHostFragment.A06;
        if (r4 != null) {
            C21060yb r3 = galleryTabHostFragment.A08;
            if (r3 != null) {
                return new AnonymousClass3K8(galleryTabHostFragment.A0L, r4, r3, "tabbed-gallery-ui");
            }
            throw C36331k8.A0W();
        }
        throw C36331k8.A0d("caches");
    }
}
