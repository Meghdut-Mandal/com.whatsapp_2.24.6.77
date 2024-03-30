package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4Z2  reason: invalid class name */
public class AnonymousClass4Z2 implements AnonymousClass4QW {
    public Object A00;
    public final int A01;

    public AnonymousClass4Z2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWO(AnonymousClass1XQ r3) {
        C88314Sf r1;
        switch (this.A01) {
            case 0:
                r1 = ((SharedTextPreviewDialogFragment) this.A00).A0a;
                break;
            case 1:
                AnonymousClass00C.A0D(r3, 1);
                r1 = ((EditMessageActivity) this.A00).A0N;
                break;
            case 2:
                ReactionsTrayViewModel reactionsTrayViewModel = ((AnonymousClass2IU) this.A00).A00.A0u;
                C18740tg.A06(reactionsTrayViewModel);
                reactionsTrayViewModel.A0V(AnonymousClass3UG.A06(r3.A00));
                return;
            case 3:
                r1 = ((EmojiEditTextBottomSheetDialogFragment) this.A00).A0W;
                break;
            case 4:
                r1 = ((AnonymousClass227) this.A00).A0B;
                break;
            case 5:
                r1 = ((NewGroup) this.A00).A0r;
                break;
            case 6:
                r1 = ((PopupNotification) this.A00).A0C;
                break;
            case 7:
                r1 = ((ProfilePhotoReminder) this.A00).A0M;
                break;
            case 8:
                r1 = ((RegisterName) this.A00).A1n;
                break;
            case 9:
                r1 = ((MessageReplyActivity) this.A00).A1W;
                break;
            case 10:
                r1 = ((TextStatusComposerActivity) this.A00).A13;
                break;
            default:
                r1 = ((C60963Aa) this.A00).A02;
                break;
        }
        r1.BWN(r3.A00);
    }
}
