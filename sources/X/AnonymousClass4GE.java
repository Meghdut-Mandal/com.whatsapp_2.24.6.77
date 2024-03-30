package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.4GE  reason: invalid class name */
public final class AnonymousClass4GE extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C88924Uo $safeMediaList;
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GE(C88924Uo r2, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
        this.$safeMediaList = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.this$0;
        C88924Uo r1 = this.$safeMediaList;
        mediaGalleryFragmentBase.A0R = true;
        mediaGalleryFragmentBase.A01 = r1.getCount();
        mediaGalleryFragmentBase.A1b();
        return AnonymousClass0AJ.A00;
    }
}
