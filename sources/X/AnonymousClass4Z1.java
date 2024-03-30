package X;

import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.4Z1  reason: invalid class name */
public class AnonymousClass4Z1 implements AnonymousClass4QW {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4Z1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BWO(AnonymousClass1XQ r5) {
        if (this.A02 != 0) {
            AnonymousClass3J6 r2 = (AnonymousClass3J6) this.A00;
            C36321k7.A0v(r2, 0, r5);
            r2.A01(false);
            ((AddTextStatusActivity) this.A01).A0J.BWN(r5.A00);
            return;
        }
        AnonymousClass3J6 r3 = (AnonymousClass3J6) this.A01;
        C36321k7.A0x(r3, r5);
        ReactionsTrayViewModel reactionsTrayViewModel = ((SingleSelectedMessageActivity) this.A00).A0D;
        if (reactionsTrayViewModel == null) {
            throw C36331k8.A0d("reactionsTrayViewModel");
        }
        reactionsTrayViewModel.A0V(AnonymousClass3UG.A06(r5.A00));
        r3.A01(false);
    }
}
