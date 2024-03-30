package X;

import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.4YG  reason: invalid class name */
public class AnonymousClass4YG implements C34661hR {
    public Object A00;
    public final int A01;

    public AnonymousClass4YG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Azi(long j, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                AnonymousClass2H1 r3 = (AnonymousClass2H1) obj;
                AnonymousClass3KV r0 = r3.A00;
                if (r0 != null && r0.A02 == j && i != 0) {
                    r3.A00 = null;
                    r3.A05.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) obj;
                AnonymousClass3KV r02 = groupCallButtonController.A02;
                if (r02 != null && r02.A02 == j && i != 0) {
                    groupCallButtonController.A02 = null;
                    C36371kC.A1O(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) obj;
                AnonymousClass3KV r03 = quickContactActivity.A0T;
                if (r03 != null && r03.A02 == j && i != 0) {
                    quickContactActivity.A0T = null;
                    AnonymousClass3QZ.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }

    public void Azj(AnonymousClass11F r3, String str, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                AnonymousClass2H1 r1 = (AnonymousClass2H1) obj;
                if (r1.A00 != null && r3.equals(r1.A0L) && str.equals(r1.A00.A07)) {
                    r1.A00 = null;
                    r1.A05.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) obj;
                if (groupCallButtonController.A02 != null && r3.equals(groupCallButtonController.A05) && str.equals(groupCallButtonController.A02.A07)) {
                    groupCallButtonController.A02 = null;
                    C36371kC.A1O(groupCallButtonController);
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) obj;
                if (quickContactActivity.A0T != null && r3.equals(quickContactActivity.A0c) && str.equals(quickContactActivity.A0T.A07)) {
                    quickContactActivity.A0T = null;
                    AnonymousClass3QZ.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }

    public void Bfl(AnonymousClass3KV r4) {
        switch (this.A01) {
            case 0:
                AnonymousClass2H1 r2 = (AnonymousClass2H1) this.A00;
                if (r2.A0G.equals(r4.A04)) {
                    r2.A00 = r4;
                    r2.A05.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                AnonymousClass11F r22 = r4.A04;
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                if (r22.equals(groupCallButtonController.A05)) {
                    groupCallButtonController.A02 = r4;
                    C36371kC.A1O(groupCallButtonController);
                    return;
                }
                return;
            default:
                AnonymousClass11F r23 = r4.A04;
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                if (r23.equals(quickContactActivity.A0c)) {
                    quickContactActivity.A0T = r4;
                    AnonymousClass3QZ.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
