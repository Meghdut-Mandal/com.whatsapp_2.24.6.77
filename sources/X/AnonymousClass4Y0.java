package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.util.HashMap;

/* renamed from: X.4Y0  reason: invalid class name */
public class AnonymousClass4Y0 implements AnonymousClass4R7 {
    public Object A00;
    public final int A01;

    public AnonymousClass4Y0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTF(boolean z) {
        switch (this.A01) {
            case 0:
                EditMessageActivity editMessageActivity = (EditMessageActivity) this.A00;
                if (!z) {
                    C39681tF r2 = editMessageActivity.A09;
                    if (r2 == null) {
                        throw C36331k8.A0d("editMessageViewModel");
                    }
                    MentionableEntry mentionableEntry = editMessageActivity.A0H;
                    if (mentionableEntry == null) {
                        throw C36331k8.A0d("entry");
                    }
                    r2.A00 = mentionableEntry.getStringText();
                    r2.A01 = mentionableEntry.getMentions();
                }
                EditMessageActivity.A0F(editMessageActivity);
                return;
            case 1:
                C70803fk r1 = (C70803fk) this.A00;
                int i = R.drawable.ib_new_expanded_bottom;
                if (!z) {
                    i = r1.A1i(2);
                }
                r1.A23(i);
                C70803fk.A10(r1);
                return;
            default:
                View view = (View) this.A00;
                HashMap hashMap = MessageReplyActivity.A1g;
                int i2 = R.drawable.ib_new_expanded;
                if (z) {
                    i2 = R.drawable.ib_new_expanded_bottom;
                }
                view.setBackgroundResource(i2);
                return;
        }
    }
}
