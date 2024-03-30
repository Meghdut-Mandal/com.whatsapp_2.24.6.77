package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

public class B80 implements C88634Tl {
    public Object A00;
    public Object A01;
    public final int A02;

    public B80(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BbO() {
        if (this.A02 != 0) {
            C36431kI.A1N(this.A00);
        } else {
            C36431kI.A1N(this.A00);
        }
    }

    public void Bcz(boolean z) {
        C225314u r1;
        AnonymousClass141 r5;
        C19770wU r7;
        AnonymousClass1X4 r2;
        AnonymousClass1JL r6;
        C19420v0 r3;
        C24381Cf r4;
        if (this.A02 != 0) {
            Log.i("conversations/delete-contact");
            ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = (ConversationsFragment.DeleteContactDialogFragment) this.A00;
            deleteContactDialogFragment.A1c();
            r1 = (C225314u) deleteContactDialogFragment.A0h();
            r5 = (AnonymousClass141) this.A01;
            r7 = deleteContactDialogFragment.A08;
            r2 = deleteContactDialogFragment.A00;
            r6 = deleteContactDialogFragment.A06;
            r3 = deleteContactDialogFragment.A04;
            r4 = deleteContactDialogFragment.A05;
        } else {
            Log.i("conversations/delete-list");
            ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = (ConversationsFragment.DeleteBroadcastListDialogFragment) this.A00;
            deleteBroadcastListDialogFragment.A1b();
            r1 = (C225314u) deleteBroadcastListDialogFragment.A0h();
            r5 = (AnonymousClass141) this.A01;
            r7 = deleteBroadcastListDialogFragment.A08;
            r2 = deleteBroadcastListDialogFragment.A00;
            r6 = deleteBroadcastListDialogFragment.A06;
            r3 = deleteBroadcastListDialogFragment.A04;
            r4 = deleteBroadcastListDialogFragment.A05;
        }
        C54042sJ.A00(r1, r2, r3, r4, r5, r6, r7, z);
    }
}
