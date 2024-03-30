package X;

import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4ZK  reason: invalid class name */
public class AnonymousClass4ZK implements C87784Qd {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYd(AnonymousClass3XU r2) {
        if (this.A01 != 0) {
            TextStatusComposerActivity.A0H(r2, (TextStatusComposerActivity) this.A00);
        } else {
            ((MessageReplyActivity) this.A00).A3k(r2);
        }
    }
}
