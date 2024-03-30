package X;

import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.4Bs  reason: invalid class name and case insensitive filesystem */
public final class C84044Bs extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ GalleryPickerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84044Bs(GalleryPickerFragment galleryPickerFragment) {
        super(0);
        this.this$0 = galleryPickerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3GM r1 = this.this$0.A0E;
        if (r1 != null) {
            r1.A01 = true;
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("galleryPartialPermissionProvider");
    }
}
