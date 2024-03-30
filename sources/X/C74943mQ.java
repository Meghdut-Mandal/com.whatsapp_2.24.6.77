package X;

import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3mQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C74943mQ implements C158267ge {
    public final /* synthetic */ AnonymousClass2UK A00;

    public /* synthetic */ C74943mQ(AnonymousClass2UK r1) {
        this.A00 = r1;
    }

    public final int BjF(float f, float f2) {
        PhotoView A1b;
        MediaViewBaseFragment mediaViewBaseFragment = this.A00.A00;
        if (mediaViewBaseFragment.A0i().isFinishing() || (A1b = mediaViewBaseFragment.A1b(mediaViewBaseFragment.A1e(mediaViewBaseFragment.A08.getCurrentItem()))) == null || !A1b.A0B()) {
            return 0;
        }
        return 3;
    }
}
