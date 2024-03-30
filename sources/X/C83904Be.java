package X;

import android.view.LayoutInflater;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.4Be  reason: invalid class name and case insensitive filesystem */
public final class C83904Be extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83904Be(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LayoutInflater from = LayoutInflater.from(this.this$0.A0a());
        AnonymousClass00C.A08(from);
        return new C40801w8(from, (AnonymousClass3K8) this.this$0.A0N.getValue());
    }
}
