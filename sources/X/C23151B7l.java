package X;

import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import java.util.Collections;
import java.util.List;

/* renamed from: X.B7l  reason: case insensitive filesystem */
public class C23151B7l implements C87724Px {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C23151B7l(InteractiveMessageButton interactiveMessageButton, AnonymousClass3T1 r2, String str, int i) {
        this.A03 = i;
        this.A00 = interactiveMessageButton;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void BSV(int i) {
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) this.A00;
        AnonymousClass3T1 r4 = (AnonymousClass3T1) this.A01;
        String str = this.A02;
        AnonymousClass11F r0 = r4.A1J.A00;
        if (r0 != null) {
            interactiveMessageButton.A01.A0I((C145166tS) null, (AnonymousClass3XT) null, r4, str, Collections.singletonList(r0), (List) null, false, false);
        }
    }
}
