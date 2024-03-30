package X;

import android.content.Intent;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.3xy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81993xy implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass01I A00;
    public final /* synthetic */ C38161nw A01;
    public final /* synthetic */ ConversationsFragment A02;

    public /* synthetic */ C81993xy(AnonymousClass01I r1, C38161nw r2, ConversationsFragment conversationsFragment) {
        this.A02 = conversationsFragment;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object invoke() {
        ConversationsFragment conversationsFragment = this.A02;
        AnonymousClass01I r0 = this.A00;
        C38161nw r3 = this.A01;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(r0.getPackageName(), "com.whatsapp.conversationslist.LockedConversationsActivity");
        conversationsFragment.startActivityForResult(A0D, 13);
        conversationsFragment.A3A = true;
        r3.setOnClickListener(new C35161iF((Object) conversationsFragment, 35));
        return AnonymousClass0AJ.A00;
    }
}
