package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.7Mc  reason: invalid class name and case insensitive filesystem */
public final class C152857Mc extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C119895qd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152857Mc(C119895qd r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        File A0w = C36441kJ.A0w(C90524aI.A0R(this.this$0.A00), "newsletter_image_cache");
        if (!A0w.mkdirs() && !A0w.isDirectory()) {
            Log.w("NewsletterBitmapCache Unable to create newsletter cache dir");
        }
        return new C132416Tn(A0w, 1048576);
    }
}
