package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;
import java.util.Collection;

/* renamed from: X.4Zo  reason: invalid class name and case insensitive filesystem */
public class C90224Zo implements C32011co {
    public Object A00;
    public final int A01;

    public C90224Zo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSg(C107265Nh r5) {
        switch (this.A01) {
            case 0:
                AnonymousClass2H1 r3 = (AnonymousClass2H1) this.A00;
                AnonymousClass11F r2 = r3.A0G;
                if (r2.equals(r5.A0D)) {
                    C36321k7.A1K(r2, "groupconversationmenu/onCallLogUpdated groupJid: ", AnonymousClass000.A0u());
                    if (!C1901797e.A00(r5.A0F, r3.A02)) {
                        r3.A02 = r5.A0F;
                        r3.A05.invalidateOptionsMenu();
                    }
                    if (r3.A02 == null) {
                        r5 = null;
                    }
                    r3.A01 = r5;
                    r3.A0B.Bwj(r5);
                    return;
                }
                return;
            case 1:
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("GroupCallButtonController/onCallLogUpdated groupJid: ");
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                C36321k7.A1N(groupCallButtonController.A05, A0u);
                if (groupCallButtonController.A05.equals(r5.A0D)) {
                    if (!C1901797e.A00(r5.A0F, groupCallButtonController.A07)) {
                        groupCallButtonController.A07 = r5.A0F;
                        C36371kC.A1O(groupCallButtonController);
                    }
                    if (groupCallButtonController.A07 == null) {
                        r5 = null;
                    }
                    groupCallButtonController.A06 = r5;
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                AnonymousClass147 r1 = quickContactActivity.A0c;
                if (r1 != null && r1.equals(r5.A0D)) {
                    quickContactActivity.A0s = r5;
                    if (!C1901797e.A00(r5.A0F, quickContactActivity.A0v)) {
                        quickContactActivity.A0v = r5.A0F;
                        AnonymousClass3QZ.A01(quickContactActivity);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void BSd() {
    }

    public void BSf() {
    }

    public void BSh(Collection collection) {
    }
}
