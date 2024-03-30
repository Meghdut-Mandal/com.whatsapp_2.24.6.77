package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.calling.PeerAvatarLayout;

/* renamed from: X.7KJ  reason: invalid class name */
public final class AnonymousClass7KJ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ View $itemView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7KJ(View view) {
        super(0);
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        PeerAvatarLayout peerAvatarLayout = (PeerAvatarLayout) C012005e.A02(this.$itemView, R.id.peer_avatar_layout);
        peerAvatarLayout.A04 = R.dimen.f7nameremoved;
        peerAvatarLayout.A01 = R.dimen.f7nameremoved;
        peerAvatarLayout.A00 = R.color.f6nameremoved;
        return peerAvatarLayout;
    }
}
