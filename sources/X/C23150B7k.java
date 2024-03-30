package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;

/* renamed from: X.B7k  reason: case insensitive filesystem */
public class C23150B7k implements C87724Px {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23150B7k(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BSV(int i) {
        AnonymousClass3T1 r3;
        AnonymousClass3FX r2;
        Context context;
        int i2;
        switch (this.A02) {
            case 0:
                ((DialogFragment) this.A00).A1f((AnonymousClass01z) this.A01, "NativeFlowMessageButtonBottomSheet");
                return;
            case 1:
            case 3:
            case 8:
                InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton.A03;
                context = interactiveMessageButton.getContext();
                i2 = 1;
                break;
            case 4:
                InteractiveMessageButton interactiveMessageButton2 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton2.A03;
                context = interactiveMessageButton2.getContext();
                i2 = 2;
                break;
            case 6:
                InteractiveMessageButton interactiveMessageButton3 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton3.A03;
                context = interactiveMessageButton3.getContext();
                i2 = 5;
                break;
            case 7:
                InteractiveMessageButton interactiveMessageButton4 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton4.A03;
                context = interactiveMessageButton4.getContext();
                i2 = 4;
                break;
            case 9:
                InteractiveMessageButton interactiveMessageButton5 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton5.A03;
                context = interactiveMessageButton5.getContext();
                i2 = 3;
                break;
            case 10:
                InteractiveMessageButton interactiveMessageButton6 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton6.A03;
                context = interactiveMessageButton6.getContext();
                i2 = 10;
                break;
            case 11:
                InteractiveMessageButton interactiveMessageButton7 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton7.A03;
                context = interactiveMessageButton7.getContext();
                i2 = 11;
                break;
            default:
                InteractiveMessageButton interactiveMessageButton8 = (InteractiveMessageButton) this.A00;
                r3 = (AnonymousClass3T1) this.A01;
                r2 = interactiveMessageButton8.A03;
                context = interactiveMessageButton8.getContext();
                i2 = 0;
                break;
        }
        r2.A01(context, r3, i2);
    }
}
