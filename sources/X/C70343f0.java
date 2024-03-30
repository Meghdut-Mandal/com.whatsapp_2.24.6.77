package X;

import android.view.KeyEvent;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.3f0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70343f0 implements C87624Pn {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ C70343f0(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final void BZV(KeyEvent keyEvent, int i) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
            messageReplyActivity.A3i();
            MessageReplyActivity.A0i(messageReplyActivity);
            MessageReplyActivity.A0O(messageReplyActivity);
        }
    }
}
