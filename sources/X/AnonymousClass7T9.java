package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.StickerComposerFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7T9  reason: invalid class name */
public final class AnonymousClass7T9 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StickerComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7T9(StickerComposerFragment stickerComposerFragment) {
        super(1);
        this.this$0 = stickerComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C160827le A1a;
        Uri uri = (Uri) obj;
        if (!(uri == null || (A1a = this.this$0.A1a()) == null)) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a;
            AnonymousClass6VT r4 = mediaComposerActivity.A0s;
            List list = r4.A0E;
            list.add(uri);
            r4.A04.A0C(Collections.unmodifiableList(list));
            r4.A09(C36431kI.A07(list));
            mediaComposerActivity.A1x.add(uri);
            C36421kH.A1K(uri, mediaComposerActivity.A1v, ((long) C36401kF.A00(mediaComposerActivity.A0s.A04)) - 1);
            C132366Tg r3 = mediaComposerActivity.A1r;
            AnonymousClass6QO r1 = new AnonymousClass6QO(uri);
            r1.A0G(C36361kB.A0i());
            r1.A0F(AnonymousClass6YY.A03(uri));
            r3.A00.put(uri, r1);
            mediaComposerActivity.A0t.A09();
            C146636vv.A00(mediaComposerActivity);
            mediaComposerActivity.A0u.A06(true);
            mediaComposerActivity.A0i.setCurrentItem(C36341k9.A07(mediaComposerActivity.A0s.A03));
            MediaComposerActivity.A0o(mediaComposerActivity, C36341k9.A07(mediaComposerActivity.A0s.A03));
        }
        StickerComposerFragment.A00(this.this$0);
        return AnonymousClass0AJ.A00;
    }
}
