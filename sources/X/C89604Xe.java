package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatus.AddTextStatusActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

/* renamed from: X.4Xe  reason: invalid class name and case insensitive filesystem */
public class C89604Xe implements C88314Sf {
    public Object A00;
    public final int A01;

    public C89604Xe(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRp() {
        View view;
        switch (this.A01) {
            case 0:
                view = ((SharedTextPreviewDialogFragment) this.A00).A0G;
                break;
            case 1:
                view = ((EditMessageActivity) this.A00).A0H;
                if (view == null) {
                    throw C36331k8.A0d("entry");
                }
                break;
            case 3:
                C70803fk r1 = (C70803fk) this.A00;
                if (!r1.A2l.BMu()) {
                    view = r1.A4B;
                    break;
                } else {
                    return;
                }
            case 5:
                view = ((EmojiEditTextBottomSheetDialogFragment) this.A00).A05;
                break;
            case 6:
                view = ((AnonymousClass227) this.A00).A03;
                break;
            case 7:
                AnonymousClass22t r0 = (AnonymousClass22t) this.A00;
                r0.BoZ();
                C88314Sf r12 = r0.A06;
                if (r12 != null) {
                    AnonymousClass4QT r02 = r0.A0A;
                    if (r02 == null || r02.BM4()) {
                        r12.BRp();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                view = ((NewGroup) this.A00).A09;
                break;
            case 9:
                view = ((PopupNotification) this.A00).A0X;
                break;
            case 10:
                view = ((ProfilePhotoReminder) this.A00).A03;
                break;
            case 11:
                view = ((RegisterName) this.A00).A0I;
                break;
            case 12:
                HashMap hashMap = MessageReplyActivity.A1g;
                view = ((MessageReplyActivity) this.A00).A0o;
                break;
            case 14:
                view = ((TextStatusComposerActivity) this.A00).A0f;
                break;
            case 15:
                view = ((C60963Aa) this.A00).A05;
                break;
            default:
                return;
        }
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BWN(int[] iArr) {
        EditText editText;
        switch (this.A01) {
            case 0:
                editText = ((SharedTextPreviewDialogFragment) this.A00).A0G;
                break;
            case 1:
                MentionableEntry mentionableEntry = ((EditMessageActivity) this.A00).A0H;
                if (mentionableEntry == null) {
                    throw C36331k8.A0d("entry");
                }
                AnonymousClass3UG.A08(mentionableEntry, iArr, 0);
                return;
            case 2:
                AnonymousClass2IU r2 = (AnonymousClass2IU) this.A00;
                ReactionsTrayViewModel reactionsTrayViewModel = r2.A00.A0u;
                if (reactionsTrayViewModel != null && C36341k9.A07(reactionsTrayViewModel.A0B) == 2) {
                    ReactionsTrayViewModel reactionsTrayViewModel2 = r2.A00.A0u;
                    C18740tg.A06(reactionsTrayViewModel2);
                    reactionsTrayViewModel2.A0V(AnonymousClass3UG.A06(iArr));
                    return;
                }
                return;
            case 3:
                C70803fk r22 = (C70803fk) this.A00;
                if (r22.A2l.BMu()) {
                    ReactionsTrayViewModel reactionsTrayViewModel3 = r22.A2l.getReactionsTrayViewModel();
                    C18740tg.A06(reactionsTrayViewModel3);
                    reactionsTrayViewModel3.A0V(AnonymousClass3UG.A06(iArr));
                    AnonymousClass4V6 r1 = r22.A2l;
                    AnonymousClass3T1 r0 = r1.getReactionsTrayViewModel().A0G;
                    C18740tg.A06(r0);
                    r1.Bvv(r0);
                    return;
                }
                AnonymousClass3UG.A08(r22.A4B, iArr, 0);
                if (!C70803fk.A1e(r22)) {
                    r22.A4B.callOnClick();
                    return;
                }
                return;
            case 4:
                ReactionsTrayViewModel reactionsTrayViewModel4 = ((SingleSelectedMessageActivity) this.A00).A0D;
                if (reactionsTrayViewModel4 == null) {
                    throw C36331k8.A0d("reactionsTrayViewModel");
                }
                reactionsTrayViewModel4.A0V(AnonymousClass3UG.A06(iArr));
                return;
            case 5:
                EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = (EmojiEditTextBottomSheetDialogFragment) this.A00;
                AnonymousClass3UG.A08(emojiEditTextBottomSheetDialogFragment.A05, iArr, emojiEditTextBottomSheetDialogFragment.A02);
                return;
            case 6:
                AnonymousClass227 r02 = (AnonymousClass227) this.A00;
                AnonymousClass3UG.A08(r02.A03, iArr, r02.A0A);
                return;
            case 7:
                AnonymousClass22t r03 = (AnonymousClass22t) this.A00;
                r03.BoZ();
                C88314Sf r12 = r03.A06;
                if (r12 != null) {
                    AnonymousClass4QT r04 = r03.A0A;
                    if (r04 == null || r04.BM4()) {
                        r12.BWN(iArr);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                NewGroup newGroup = (NewGroup) this.A00;
                newGroup.A09.requestFocus();
                AnonymousClass3UG.A08(newGroup.A09, iArr, newGroup.A06.A04(C21100yf.A1v));
                return;
            case 9:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (popupNotification.A1G.A0H == null) {
                    editText = popupNotification.A0X;
                    break;
                } else {
                    return;
                }
            case 10:
                AnonymousClass3UG.A08(((ProfilePhotoReminder) this.A00).A03, iArr, 25);
                return;
            case 11:
                AnonymousClass3UG.A08(((RegisterName) this.A00).A0I, iArr, 25);
                return;
            case 12:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                HashMap hashMap = MessageReplyActivity.A1g;
                AnonymousClass6YP r05 = messageReplyActivity.A1E;
                if (r05 == null || r05.A0H == null) {
                    editText = messageReplyActivity.A0o;
                    break;
                } else {
                    return;
                }
                break;
            case 13:
                AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A00;
                AnonymousClass22t r06 = addTextStatusActivity.A05;
                if (r06 == null) {
                    throw C36331k8.A0d("emojiPopup");
                }
                r06.dismiss();
                addTextStatusActivity.A04.Bp1(new C81203wd(iArr, addTextStatusActivity, 39));
                AnonymousClass2M9 r07 = new AnonymousClass2M9(iArr);
                StringBuilder A0u = AnonymousClass000.A0u();
                for (int i : r07.A01) {
                    if (i != 65039) {
                        A0u.appendCodePoint(i);
                    }
                }
                addTextStatusActivity.A0E = A0u.toString();
                WDSButton wDSButton = addTextStatusActivity.A0D;
                if (wDSButton == null) {
                    throw C36331k8.A0d("clearButton");
                }
                wDSButton.setEnabled(true);
                return;
            case 14:
                editText = ((TextStatusComposerActivity) this.A00).A0f;
                break;
            default:
                AnonymousClass3UG.A08(((C60963Aa) this.A00).A05, iArr, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                return;
        }
        AnonymousClass3UG.A08(editText, iArr, 0);
    }
}
