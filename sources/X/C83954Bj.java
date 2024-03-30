package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.4Bj  reason: invalid class name and case insensitive filesystem */
public final class C83954Bj extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83954Bj(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.this$0;
        AnonymousClass4QB r1 = mediaGalleryFragmentBase.A0D;
        if (r1 != null) {
            C18820ts r0 = mediaGalleryFragmentBase.A0E;
            if (r0 != null) {
                return r1.BC3(r0);
            }
            throw C36321k7.A09();
        }
        throw C36331k8.A0d("monthYearFormat");
    }
}
