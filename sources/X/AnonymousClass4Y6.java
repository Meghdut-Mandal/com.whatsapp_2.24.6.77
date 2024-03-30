package X;

import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.4Y6  reason: invalid class name */
public class AnonymousClass4Y6 implements AnonymousClass4S9 {
    public Object A00;
    public final int A01;

    public AnonymousClass4Y6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BTf() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) obj;
            groupChatInfoActivity.A0t.A06(groupChatInfoActivity.A1Y);
            return false;
        }
        AnonymousClass2HG r0 = (AnonymousClass2HG) obj;
        AnonymousClass4V7 r4 = r0.A01;
        r4.BoP().startActivity(AnonymousClass190.A0q(r4.BoP(), r0.A00.A0H, false, true, true));
        return true;
    }
}
