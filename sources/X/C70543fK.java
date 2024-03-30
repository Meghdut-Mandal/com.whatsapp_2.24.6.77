package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;

/* renamed from: X.3fK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70543fK implements C87724Px {
    public final /* synthetic */ InteractiveMessageButton A00;
    public final /* synthetic */ AnonymousClass3T1 A01;
    public final /* synthetic */ C207219uk A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C70543fK(InteractiveMessageButton interactiveMessageButton, AnonymousClass3T1 r2, C207219uk r3, boolean z) {
        this.A00 = interactiveMessageButton;
        this.A03 = z;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void BSV(int i) {
        InteractiveMessageButton interactiveMessageButton = this.A00;
        boolean z = this.A03;
        C207219uk r0 = this.A02;
        AnonymousClass3T1 r4 = this.A01;
        if (!z) {
            int size = r0.A04.A03.size();
            AnonymousClass3FX r1 = interactiveMessageButton.A03;
            Context context = interactiveMessageButton.getContext();
            if (size > 1) {
                r1.A01(context, r4, i);
            } else {
                r1.A00(context, r4);
            }
        }
    }
}
