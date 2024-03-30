package X;

import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4XG  reason: invalid class name */
public class AnonymousClass4XG implements C88634Tl {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XG(Object obj, Object obj2, int i) {
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
        boolean z2 = z;
        if (this.A02 != 0) {
            Log.i("conversations/user-deleteGroup");
            ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = (ConversationsFragment.DeleteGroupDialogFragment) this.A00;
            deleteGroupDialogFragment.A1b();
            C19770wU r12 = deleteGroupDialogFragment.A09;
            AnonymousClass1X4 r7 = deleteGroupDialogFragment.A00;
            AnonymousClass1JL r11 = deleteGroupDialogFragment.A07;
            C54042sJ.A00((C225314u) deleteGroupDialogFragment.A0h(), r7, deleteGroupDialogFragment.A04, deleteGroupDialogFragment.A05, (AnonymousClass141) this.A01, r11, r12, z2);
            return;
        }
        Log.i("conversations/bulk-delete");
        ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment = (ConversationsFragment.BulkDeleteConversationDialogFragment) this.A00;
        bulkDeleteConversationDialogFragment.A1b();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = ((List) this.A01).iterator();
        while (it.hasNext()) {
            C36381kD.A1H(bulkDeleteConversationDialogFragment.A01, C36401kF.A0a(it), A0I);
        }
        AnonymousClass01I A0h = bulkDeleteConversationDialogFragment.A0h();
        C18740tg.A06(A0h);
        C225314u r4 = (C225314u) A0h;
        C19770wU r1 = bulkDeleteConversationDialogFragment.A07;
        AnonymousClass1X4 r5 = bulkDeleteConversationDialogFragment.A00;
        AnonymousClass1JL r8 = bulkDeleteConversationDialogFragment.A05;
        C19420v0 r6 = bulkDeleteConversationDialogFragment.A03;
        C24381Cf r72 = bulkDeleteConversationDialogFragment.A04;
        r4.Bu1(R.string.f12nameremoved);
        r1.Box(new C49742jc(r4, r5, r6, r72, r8, AnonymousClass001.A0F(r4), A0I, SystemClock.elapsedRealtime(), z2), new Object[0]);
    }
}
