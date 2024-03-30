package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
public class C48782i3 extends C33541fX {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C33351fB A01;
    public final /* synthetic */ AnonymousClass141 A02;

    public C48782i3(C33351fB r1, AnonymousClass141 r2, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    public void A02(View view) {
        C33351fB r3 = this.A01;
        ConversationsFragment conversationsFragment = r3.A06;
        AnonymousClass141 r2 = this.A02;
        conversationsFragment.A1m((Intent) null, r2);
        r3.A07.Bly(r3.A09(r2, Long.valueOf(this.A00), 4));
    }
}
