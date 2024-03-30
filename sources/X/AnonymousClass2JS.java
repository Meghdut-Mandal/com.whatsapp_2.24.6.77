package X;

import com.whatsapp.gallery.MediaGalleryActivity;
import java.util.Collection;

/* renamed from: X.2JS  reason: invalid class name */
public final class AnonymousClass2JS extends C70813fl {
    public final MediaGalleryActivity A00;
    public final C43692Jl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JS(AnonymousClass3C3 r4, MediaGalleryActivity mediaGalleryActivity, C43692Jl r6) {
        super(r4.A00(mediaGalleryActivity));
        AnonymousClass00C.A0D(r4, 1);
        this.A00 = mediaGalleryActivity;
        this.A01 = r6;
    }

    public boolean B73(AnonymousClass4Q1 r4, Collection collection, int i) {
        AnonymousClass00C.A0D(collection, 1);
        if (i == 19) {
            return this.A01.A00.A03(this.A00, C36421kH.A0S(collection));
        } else if (i != 20) {
            return super.B73(r4, collection, i);
        } else {
            return this.A01.A01.A03(this.A00, C36421kH.A0S(collection));
        }
    }
}
