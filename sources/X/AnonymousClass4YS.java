package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.4YS  reason: invalid class name */
public class AnonymousClass4YS implements AnonymousClass4PQ {
    public Object A00;
    public final int A01;

    public AnonymousClass4YS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BSe(C107265Nh r4) {
        switch (this.A01) {
            case 0:
                AnonymousClass2H1 r2 = (AnonymousClass2H1) this.A00;
                r2.A01 = r4;
                r2.A0B.Bwj(r4);
                if (r4 != null && r4.A08 == 2) {
                    r2.A05.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                if (!C1901797e.A00(r4, groupCallButtonController.A06)) {
                    groupCallButtonController.A06 = r4;
                    C36371kC.A1O(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A0s = r4;
                AnonymousClass3QZ.A01(quickContactActivity);
                return;
        }
    }
}
