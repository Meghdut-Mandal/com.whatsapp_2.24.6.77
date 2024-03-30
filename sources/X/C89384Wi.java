package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4Wi  reason: invalid class name and case insensitive filesystem */
public class C89384Wi implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public C89384Wi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.setOnEditorActionListener(new C89384Wi(obj, i));
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        switch (this.A01) {
            case 0:
                EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A00;
                if (i == 0) {
                    encryptionKeyFragment.A01.A0V();
                    break;
                }
                break;
            case 1:
                AnonymousClass24b r2 = (AnonymousClass24b) this.A00;
                if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    if (r2 instanceof ChatLockCreateSecretCodeActivity) {
                        i2 = 5;
                    } else {
                        i2 = 6;
                    }
                    if (i != i2) {
                        return true;
                    }
                }
                if (!r2.A3k().isEnabled()) {
                    return true;
                }
                r2.A3k().callOnClick();
                return true;
            case 2:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A00;
                if (i == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    ConversationSearchViewModel conversationSearchViewModel = conversationSearchFragment.A02;
                    if (conversationSearchViewModel == null) {
                        return true;
                    }
                    C36341k9.A18(conversationSearchViewModel.A04, true);
                    return true;
                }
            case 3:
                AnonymousClass4YO r22 = (AnonymousClass4YO) this.A00;
                if (i == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    C70803fk.A1M((C70803fk) r22.A00, true);
                    return true;
                }
            case 4:
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                if (i == 3) {
                    WaEditText waEditText = gifSearchContainer.A06;
                    if (waEditText == null) {
                        return true;
                    }
                    waEditText.A0B();
                    return true;
                }
                break;
            case 5:
                AnonymousClass4UT r1 = (AnonymousClass4UT) this.A00;
                if (i == 6) {
                    Log.i("MediaCaptionDialog/dismiss/send");
                    r1.onDismiss();
                    return true;
                }
                break;
            case 6:
                C75643nZ r23 = (C75643nZ) this.A00;
                AnonymousClass00C.A0D(textView, 1);
                if (i == 6) {
                    String A18 = C36431kI.A18(textView);
                    AnonymousClass00C.A0D(A18, 0);
                    r23.A03.A04 = A18;
                    r23.dismiss();
                    return true;
                }
                break;
            case 7:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (i == 4) {
                    PopupNotification.A0J(popupNotification);
                    return true;
                }
                break;
            case 8:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (i != 4) {
                    return false;
                }
                MessageReplyActivity.A0l(messageReplyActivity, false);
                return true;
            case 9:
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A00;
                if (i == 4) {
                    TextStatusComposerActivity.A0O(textStatusComposerActivity);
                    TextStatusComposerActivity.A0M(textStatusComposerActivity);
                    return true;
                }
                break;
            case 10:
                C006302t r12 = (C006302t) this.A00;
                if (i != 3) {
                    return true;
                }
                r12.invoke(C36431kI.A18(textView));
                return true;
        }
        return false;
    }
}
