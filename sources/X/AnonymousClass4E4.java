package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.4E4  reason: invalid class name */
public final class AnonymousClass4E4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4E4(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        super(0);
        this.this$0 = statusPlaybackContactFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.this$0;
        C27731Pn r2 = statusPlaybackContactFragment.A0F;
        if (r2 != null) {
            return r2.A05(statusPlaybackContactFragment.A0a(), "status-playback-contact-fragment");
        }
        throw C36331k8.A0d("contactPhotos");
    }
}
