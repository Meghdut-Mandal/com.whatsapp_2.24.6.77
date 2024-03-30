package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.media.utwonet.UTwoNetViewModel;
import com.whatsapp.media.utwonet.UTwoNetViewModel$process$1;
import com.whatsapp.mediacomposer.StickerComposerFragment;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1;
import java.util.List;

/* renamed from: X.7TA  reason: invalid class name */
public final class AnonymousClass7TA extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StickerComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TA(StickerComposerFragment stickerComposerFragment) {
        super(1);
        this.this$0 = stickerComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C111035bd r10 = (C111035bd) obj;
        StickerComposerFragment stickerComposerFragment = this.this$0;
        AnonymousClass00C.A0B(r10);
        if (r10 instanceof AnonymousClass5C6) {
            StickerComposerViewModel stickerComposerViewModel = (StickerComposerViewModel) stickerComposerFragment.A04.getValue();
            Bitmap bitmap = (Bitmap) C007103b.A0L(((AnonymousClass5C6) r10).A00);
            AnonymousClass00C.A0D(bitmap, 0);
            C36331k8.A1T(new StickerComposerViewModel$processBitmap$1(bitmap, stickerComposerViewModel, (C023509x) null), C109325Xd.A00(stickerComposerViewModel));
        } else if (AnonymousClass00C.A0J(r10, AnonymousClass5CB.A00)) {
            Uri uri = stickerComposerFragment.A00;
            if (uri != null) {
                UTwoNetViewModel uTwoNetViewModel = (UTwoNetViewModel) stickerComposerFragment.A05.getValue();
                C20810yC r1 = stickerComposerFragment.A0A;
                if (r1 != null) {
                    int A07 = r1.A07(1576);
                    List A11 = C36371kC.A11("WA_CUTOUT_BITMAP");
                    AnonymousClass5TL r4 = AnonymousClass5TL.NORMAL;
                    if (uTwoNetViewModel.A00 != null) {
                        C36331k8.A1T(new UTwoNetViewModel$process$1(uri, uTwoNetViewModel, r4, A11, (C023509x) null, 512, A07), C109325Xd.A00(uTwoNetViewModel));
                    }
                } else {
                    throw C36321k7.A07();
                }
            }
        } else if (!AnonymousClass00C.A0J(r10, AnonymousClass5C8.A00)) {
            StickerComposerFragment.A00(stickerComposerFragment);
        }
        return AnonymousClass0AJ.A00;
    }
}
