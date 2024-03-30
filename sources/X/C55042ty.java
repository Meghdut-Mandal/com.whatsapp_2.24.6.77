package X;

import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.2ty  reason: invalid class name and case insensitive filesystem */
public class C55042ty implements C87794Qe {
    public Object A00;
    public final int A01;

    public C55042ty(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYd(AnonymousClass3XU r3) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((C70803fk) obj).A2H(r3);
                return;
            case 1:
                ((MessageReplyActivity) obj).A3k(r3);
                return;
            default:
                TextStatusComposerActivity.A0H(r3, (TextStatusComposerActivity) obj);
                return;
        }
    }
}
