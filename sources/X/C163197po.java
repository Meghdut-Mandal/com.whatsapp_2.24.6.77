package X;

import android.graphics.Point;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.7po  reason: invalid class name and case insensitive filesystem */
public class C163197po implements C158997ia {
    public Object A00;
    public final int A01;

    public C163197po(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BT0() {
        if (2 - this.A01 == 0) {
            ((GroupChatLiveLocationsActivity) this.A00).A0W = false;
        }
    }

    public void BY0() {
        switch (this.A01) {
            case 2:
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
                groupChatLiveLocationsActivity.A0W = false;
                C139266jV r6 = groupChatLiveLocationsActivity.A05;
                C18740tg.A06(r6);
                C142466ov r1 = groupChatLiveLocationsActivity.A0N;
                C63593Kq r0 = r1.A0Q;
                if (r0 != null) {
                    C134976bv A002 = C134976bv.A00(r0.A00, r0.A01);
                    Point A04 = r6.A0R.A04(A002);
                    int i = A04.x;
                    if (i <= 0 || A04.y <= 0 || i >= groupChatLiveLocationsActivity.A0M.getWidth() || A04.y >= groupChatLiveLocationsActivity.A0M.getHeight()) {
                        groupChatLiveLocationsActivity.A0W = true;
                        groupChatLiveLocationsActivity.A05.A0A(C1264964g.A00(A002, groupChatLiveLocationsActivity.A00 * 2.0f), this, 1500);
                        return;
                    }
                    return;
                } else if (!r1.A0W && groupChatLiveLocationsActivity.A0X) {
                    groupChatLiveLocationsActivity.A0X = false;
                    GroupChatLiveLocationsActivity.A0I(groupChatLiveLocationsActivity, true);
                    return;
                } else {
                    return;
                }
            case 3:
                return;
            default:
                double d = C92794ej.A0n;
                ((C92794ej) this.A00).A0S.Bpr("zoom");
                return;
        }
    }
}
