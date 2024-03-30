package X;

import android.widget.FrameLayout;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.4YQ  reason: invalid class name */
public class AnonymousClass4YQ implements AnonymousClass4PC {
    public Object A00;
    public final int A01;

    public AnonymousClass4YQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BV4(AnonymousClass3KG r6) {
        FrameLayout frameLayout;
        int i;
        if (this.A01 != 0) {
            ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
            if (!profileInfoActivity.isFinishing() && profileInfoActivity.A03 != null) {
                if (profileInfoActivity.A0B.A01()) {
                    if (profileInfoActivity.A09 == null) {
                        C38361oQ r1 = new C38361oQ(profileInfoActivity);
                        profileInfoActivity.A09 = r1;
                        profileInfoActivity.A03.addView(r1);
                    }
                    profileInfoActivity.A09.A06.A03(r6);
                    frameLayout = profileInfoActivity.A03;
                    i = 0;
                } else {
                    frameLayout = profileInfoActivity.A03;
                    i = 8;
                }
                frameLayout.setVisibility(i);
                return;
            }
            return;
        }
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
        if (groupChatInfoActivity.isFinishing()) {
            return;
        }
        if (groupChatInfoActivity.A0T.A01()) {
            if (groupChatInfoActivity.A0Q == null) {
                C38351oP r12 = new C38351oP(groupChatInfoActivity);
                groupChatInfoActivity.A0Q = r12;
                groupChatInfoActivity.A08.addView(r12);
            }
            groupChatInfoActivity.A0Q.A06.A03(r6);
            groupChatInfoActivity.A1z.A03(8);
            groupChatInfoActivity.A09.setVisibility(0);
            return;
        }
        groupChatInfoActivity.A1z.A03(0);
        groupChatInfoActivity.A09.setVisibility(8);
    }
}
