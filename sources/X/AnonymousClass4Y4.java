package X;

import android.view.View;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.4Y4  reason: invalid class name */
public class AnonymousClass4Y4 implements View.OnLongClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass4Y4(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            ((ConversationAttachmentContentView) obj).A0D.A0G(this.A01, true);
            return true;
        }
        C69273dG r0 = (C69273dG) obj;
        AnonymousClass3MV.A01(r0.A0X, r0.A0q, this.A01);
        return true;
    }
}
