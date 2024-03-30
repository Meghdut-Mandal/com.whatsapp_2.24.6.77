package X;

import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1;
import com.whatsapp.service.RestoreChatConnectionWorker;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5WV  reason: invalid class name */
public class AnonymousClass5WV implements C20420xX {
    public Object A00;
    public final int A01;

    public AnonymousClass5WV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BYl() {
        switch (this.A01) {
            case 1:
                C148246yY r1 = (C148246yY) this.A00;
                synchronized (r1) {
                    AnonymousClass5JN r0 = r1.A00;
                    if (r0 != null) {
                        C148246yY.A00(r1, r0);
                    }
                    r1.A00 = null;
                    r1.A02.unregisterObserver(this);
                }
                return;
            case 2:
                ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = (ConversationsSuggestedContactsViewModel) this.A00;
                conversationsSuggestedContactsViewModel.A04.unregisterObserver(this);
                C36381kD.A1R(conversationsSuggestedContactsViewModel.A0E, new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(conversationsSuggestedContactsViewModel, (C023509x) null), C109325Xd.A00(conversationsSuggestedContactsViewModel));
                return;
            case 4:
                ((RestoreChatConnectionWorker) this.A00).A01.A06(C97344ox.A00());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BYn() {
        if (3 - this.A01 == 0) {
            ((CountDownLatch) this.A00).countDown();
        }
    }

    public void BYp() {
        if (this.A01 == 0) {
            ((CountDownLatch) this.A00).countDown();
        }
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYo() {
    }
}
