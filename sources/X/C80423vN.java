package X;

import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.3vN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80423vN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass29Q A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C80423vN(AnonymousClass29Q r1, String str, String str2, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public final void run() {
        AnonymousClass29Q r0 = this.A01;
        String str = this.A02;
        int i = this.A00;
        String str2 = this.A03;
        ConversationsFragment conversationsFragment = r0.A04;
        conversationsFragment.A0B.setProgress(i);
        conversationsFragment.A0k.setText(str2);
        conversationsFragment.A0C.setText(str);
    }
}
