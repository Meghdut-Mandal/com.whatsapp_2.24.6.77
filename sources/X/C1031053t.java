package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.53t  reason: invalid class name and case insensitive filesystem */
public class C1031053t extends C100764vd {
    public final /* synthetic */ MediaComposerActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1031053t(AnonymousClass01z r1, MediaComposerActivity mediaComposerActivity) {
        super(r1);
        this.A00 = mediaComposerActivity;
    }

    public static int A00(C1031053t r1, int i) {
        MediaComposerActivity mediaComposerActivity = r1.A00;
        if (!C36351kA.A1Y(mediaComposerActivity.A0V)) {
            return (C36401kF.A00(mediaComposerActivity.A0s.A04) - i) - 1;
        }
        return i;
    }

    public int A0H() {
        return C36401kF.A00(this.A00.A0s.A04);
    }

    public /* bridge */ /* synthetic */ int A0L(Object obj) {
        int indexOf = AnonymousClass6VT.A03(this.A00).indexOf(((MediaComposerFragment) ((AnonymousClass02E) obj)).A00);
        if (indexOf < 0) {
            return -2;
        }
        return A00(this, indexOf);
    }

    public void A0S(ViewGroup viewGroup, AnonymousClass02E r4, int i) {
        PhotoView photoView;
        if (r4 instanceof ImageComposerFragment) {
            ((ImageComposerFragment) r4).A04.A01();
        } else {
            View view = r4.A0F;
            if (!(view == null || (photoView = (PhotoView) view.findViewById(R.id.photo)) == null)) {
                photoView.A07();
            }
        }
        super.A0N(viewGroup, r4, i);
    }

    public void A0G(ViewGroup viewGroup) {
        super.A0G(viewGroup);
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (C36341k9.A07(mediaComposerActivity.A0s.A03) < 0 && !AnonymousClass6VT.A03(mediaComposerActivity).isEmpty()) {
            MediaComposerActivity.A0o(mediaComposerActivity, 0);
        }
        for (AnonymousClass02E r2 : mediaComposerActivity.A2m()) {
            if (r2 instanceof MediaComposerFragment) {
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) r2;
                mediaComposerFragment.A1g(mediaComposerActivity.A1p);
                if (mediaComposerActivity.A1W && mediaComposerFragment.A00.equals(mediaComposerActivity.B8e())) {
                    mediaComposerFragment.A1c();
                    mediaComposerFragment.A1b();
                }
            }
        }
    }
}
