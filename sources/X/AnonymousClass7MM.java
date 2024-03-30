package X;

import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7MM  reason: invalid class name */
public final class AnonymousClass7MM extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ VideoComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7MM(VideoComposerFragment videoComposerFragment) {
        super(0);
        this.this$0 = videoComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        VideoComposerFragment videoComposerFragment = this.this$0;
        AnonymousClass1GJ r3 = videoComposerFragment.A0E;
        if (r3 != null) {
            return r3.A0E(videoComposerFragment.A0S, videoComposerFragment.A0Q, videoComposerFragment.A0R);
        }
        throw C36331k8.A0d("transcodeUtils");
    }
}
