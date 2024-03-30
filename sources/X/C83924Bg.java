package X;

import android.os.Bundle;
import com.whatsapp.gallery.GalleryRecentsFragment;

/* renamed from: X.4Bg  reason: invalid class name and case insensitive filesystem */
public final class C83924Bg extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C39401sD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83924Bg(C39401sD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryRecentsFragment galleryRecentsFragment = new GalleryRecentsFragment();
        C39401sD r3 = this.this$0;
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("jid", r3.A0H);
        A07.putInt("include", r3.A00);
        A07.putBoolean("is_coming_from_chat", r3.A0L);
        Boolean bool = r3.A05;
        if (bool != null) {
            A07.putBoolean("is_send_as_document", bool.booleanValue());
        }
        galleryRecentsFragment.A17(A07);
        galleryRecentsFragment.A03 = r3.A02;
        galleryRecentsFragment.A01 = r3.A01;
        return galleryRecentsFragment;
    }
}
