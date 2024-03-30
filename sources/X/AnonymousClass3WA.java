package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Collections;

/* renamed from: X.3WA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WA implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass01z A00;
    public final /* synthetic */ AnonymousClass012 A01;
    public final /* synthetic */ C225014r A02;
    public final /* synthetic */ AnonymousClass1LV A03;
    public final /* synthetic */ AnonymousClass1YR A04;
    public final /* synthetic */ AnonymousClass141 A05;
    public final /* synthetic */ AnonymousClass147 A06;
    public final /* synthetic */ C19770wU A07;

    public /* synthetic */ AnonymousClass3WA(AnonymousClass01z r1, AnonymousClass012 r2, C225014r r3, AnonymousClass1LV r4, AnonymousClass1YR r5, AnonymousClass141 r6, AnonymousClass147 r7, C19770wU r8) {
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C225014r r6 = this.A02;
        C19770wU r5 = this.A07;
        AnonymousClass012 r8 = this.A01;
        AnonymousClass1YR r10 = this.A04;
        AnonymousClass1LV r9 = this.A03;
        AnonymousClass147 r2 = this.A06;
        AnonymousClass141 r1 = this.A05;
        AnonymousClass01z r4 = this.A00;
        r6.Bu2(0, R.string.f12nameremoved);
        r5.Box(new C49422j5(new AnonymousClass4ZH(r6, r2, 0), r8, r9, r10, Collections.singleton(r2)), new Object[0]);
        ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
        AnonymousClass3TK.A02(deleteGroupDialogFragment, r1);
        deleteGroupDialogFragment.A0b().putBoolean("chatContainsStarredMessages", false);
        deleteGroupDialogFragment.A1f(r4, (String) null);
    }
}
