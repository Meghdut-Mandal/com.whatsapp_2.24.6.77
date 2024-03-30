package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.3D7  reason: invalid class name */
public class AnonymousClass3D7 {
    public final /* synthetic */ InteractiveMessageView A00;
    public final /* synthetic */ AnonymousClass3T1 A01;

    public AnonymousClass3D7(InteractiveMessageView interactiveMessageView, AnonymousClass3T1 r2) {
        this.A00 = interactiveMessageView;
        this.A01 = r2;
    }

    public void A00(String str, int i, boolean z, boolean z2) {
        InteractiveMessageView interactiveMessageView = this.A00;
        interactiveMessageView.A04.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (TextUtils.isEmpty(str)) {
            interactiveMessageView.A04.setText(i);
        } else {
            WaTextView waTextView = interactiveMessageView.A04;
            Context context = interactiveMessageView.getContext();
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = str;
            C36341k9.A0s(context, waTextView, A0L, i);
        }
        interactiveMessageView.A04.setSingleLine(z2);
    }
}
