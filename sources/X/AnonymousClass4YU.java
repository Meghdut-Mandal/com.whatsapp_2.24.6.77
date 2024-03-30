package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.4YU  reason: invalid class name */
public class AnonymousClass4YU implements C88064Rg {
    public Object A00;
    public final int A01;

    public AnonymousClass4YU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bfk(AnonymousClass3KV r3) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                AnonymousClass2H1 r0 = (AnonymousClass2H1) obj;
                if (r3 != null) {
                    r0.A00 = r3;
                    r0.A05.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) obj;
                if (r3 != null) {
                    groupCallButtonController.A02 = r3;
                    C36371kC.A1O(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) obj;
                if (r3 != null) {
                    quickContactActivity.A0T = r3;
                    AnonymousClass3QZ.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
