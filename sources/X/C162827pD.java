package X;

import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.7pD  reason: invalid class name and case insensitive filesystem */
public class C162827pD extends C142466ov {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162827pD(C24801Dv r2, C237019m r3, AnonymousClass17Y r4, C19730wQ r5, AnonymousClass19J r6, C24361Cd r7, AnonymousClass1Pp r8, AnonymousClass16D r9, AnonymousClass16I r10, AnonymousClass171 r11, C27731Pn r12, C27761Ps r13, C19970wo r14, C20830yE r15, C18820ts r16, AnonymousClass16J r17, C233117z r18, AnonymousClass1P5 r19, AnonymousClass2XH r20, AnonymousClass1PA r21, Object obj, int i) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0O() {
        int i = this.A01;
        super.A0O();
        if (i != 0) {
            GroupChatLiveLocationsActivity2.A0G((GroupChatLiveLocationsActivity2) this.A00);
        } else {
            GroupChatLiveLocationsActivity.A0G((GroupChatLiveLocationsActivity) this.A00);
        }
    }

    public void onLocationChanged(Location location) {
        int i = this.A01;
        super.onLocationChanged(location);
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (groupChatLiveLocationsActivity2.A0O.A0U && location != null) {
                C18740tg.A06(groupChatLiveLocationsActivity2.A06);
                groupChatLiveLocationsActivity2.A06.A0B(AnonymousClass6UP.A01(C90474aD.A0N(location)), groupChatLiveLocationsActivity2.A05);
            }
            groupChatLiveLocationsActivity2.A0N.A06 = location;
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
        if (groupChatLiveLocationsActivity.A0N.A0U && location != null) {
            C18740tg.A06(groupChatLiveLocationsActivity.A05);
            C134976bv A012 = C134976bv.A01(location);
            C139266jV r1 = groupChatLiveLocationsActivity.A05;
            C1264964g r0 = new C1264964g();
            r0.A06 = A012;
            r1.A08(r0);
        }
    }
}
