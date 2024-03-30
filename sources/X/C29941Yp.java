package X;

import com.whatsapp.conversation.ConversationListView;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Yp  reason: invalid class name and case insensitive filesystem */
public class C29941Yp extends C19590wC {
    public void A00() {
        for (AnonymousClass3N3 r0 : getObservers()) {
            ConversationListView conversationListView = r0.A00.A2U;
            conversationListView.post(new C80223v3(conversationListView, 25));
        }
    }

    public void A01() {
        Iterator it = getObservers().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void A02(Set set) {
        if (!set.isEmpty()) {
            for (AnonymousClass3N3 r0 : getObservers()) {
                ConversationListView conversationListView = r0.A00.A2U;
                conversationListView.post(new C80223v3(conversationListView, 25));
            }
        }
    }
}
