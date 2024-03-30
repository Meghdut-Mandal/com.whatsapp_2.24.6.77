package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.quickcontact.QuickContactActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2ik  reason: invalid class name and case insensitive filesystem */
public class C49212ik extends C132446Tt {
    public final AnonymousClass1HO A00;
    public final GroupJid A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A03(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5Ng r4 = (AnonymousClass5Ng) obj;
        AnonymousClass4PR r1 = (AnonymousClass4PR) this.A02.get();
        if (r1 != null) {
            AnonymousClass4YT r12 = (AnonymousClass4YT) r1;
            switch (r12.A01) {
                case 0:
                    AnonymousClass2H1 r2 = (AnonymousClass2H1) r12.A00;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("groupconversationmenu/fetchJoinableCallLogCallback groupJid: ");
                    C36321k7.A1N(r2.A0G, A0u);
                    if (!C1901797e.A00(r4, r2.A02)) {
                        r2.A02 = r4;
                        if (r4 != null) {
                            AnonymousClass2H1.A05(r2, r4.A02());
                        }
                        r2.A05.invalidateOptionsMenu();
                        return;
                    }
                    return;
                case 1:
                    GroupCallButtonController groupCallButtonController = (GroupCallButtonController) r12.A00;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("GroupCallButtonController/fetchJoinableCallLogCallback groupJid: ");
                    C36321k7.A1N(groupCallButtonController.A05, A0u2);
                    if (!C1901797e.A00(r4, groupCallButtonController.A07)) {
                        groupCallButtonController.A07 = r4;
                        if (r4 != null) {
                            GroupCallButtonController.A00(groupCallButtonController, r4.A02());
                        }
                    }
                    C36371kC.A1O(groupCallButtonController);
                    return;
                default:
                    QuickContactActivity quickContactActivity = (QuickContactActivity) r12.A00;
                    if (r4 != null) {
                        quickContactActivity.A0v = r4;
                        QuickContactActivity.A01(quickContactActivity);
                        AnonymousClass3QZ.A01(quickContactActivity);
                        return;
                    }
                    return;
            }
        }
    }

    public C49212ik(AnonymousClass4PR r2, AnonymousClass1HO r3, GroupJid groupJid) {
        this.A00 = r3;
        this.A02 = AnonymousClass001.A0F(r2);
        this.A01 = groupJid;
    }
}
