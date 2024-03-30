package X;

import android.content.Intent;
import com.whatsapp.ConversationFragment;

/* renamed from: X.3xv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81963xv implements AnonymousClass00S {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ AnonymousClass15G A01;

    public /* synthetic */ C81963xv(Intent intent, AnonymousClass15G r2) {
        this.A01 = r2;
        this.A00 = intent;
    }

    public final Object invoke() {
        AnonymousClass15G r4 = this.A01;
        Intent intent = this.A00;
        if (r4.A07.A09() && r4.A00 != -1) {
            Intent A012 = r4.A07.A01(r4, intent);
            if (!A012.equals(intent)) {
                r4.startActivity(A012);
            } else {
                r4.A3j();
                r4.A3k();
                r4.setIntent(intent);
                AnonymousClass01z supportFragmentManager = r4.getSupportFragmentManager();
                if (!r4.isFinishing() && !supportFragmentManager.A0E && !supportFragmentManager.A0r()) {
                    ConversationFragment conversationFragment = new ConversationFragment();
                    AnonymousClass09Y A0O = C36341k9.A0O(r4);
                    A0O.A0E(conversationFragment, "com.whatsapp.HomeActivity.ConversationFragment", r4.A00);
                    A0O.A03();
                }
            }
        }
        return C36371kC.A0m();
    }
}
