package X;

import android.view.ViewTreeObserver;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.3ZO  reason: invalid class name */
public class AnonymousClass3ZO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38051nd A01;
    public final /* synthetic */ ConversationListView A02;
    public final /* synthetic */ AnonymousClass3H5 A03;
    public final /* synthetic */ AnonymousClass1RJ A04;

    public AnonymousClass3ZO(C38051nd r1, ConversationListView conversationListView, AnonymousClass3H5 r3, AnonymousClass1RJ r4, int i) {
        this.A02 = conversationListView;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = r4;
    }

    public void onGlobalLayout() {
        ConversationListView conversationListView = this.A02;
        C36361kB.A16(conversationListView, this);
        C38051nd r2 = this.A01;
        AnonymousClass3H5 r4 = this.A03;
        r2.A0R.add(r4.A08.A1J);
        conversationListView.A05();
        ConversationListView.A01(conversationListView, this.A04, this.A00, r4.A05, r4.A01);
    }
}
