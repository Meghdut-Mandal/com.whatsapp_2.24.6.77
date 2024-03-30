package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.3T7  reason: invalid class name */
public class AnonymousClass3T7 implements C236119d {
    public Object A00;
    public final int A01;

    public AnonymousClass3T7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVN(String str) {
        switch (this.A01) {
            case 0:
                C36321k7.A1R("JoinSubgroupProtocolHelper/onDeliveryFailure iqid=", str, C36401kF.A0t(str, 0));
                C20760y7 r0 = AnonymousClass3NW.A02;
                C40041ue.A01(((AnonymousClass3NW) this.A00).A00.A00.A00, 0);
                return;
            case 1:
                Log.i("groupchatinfo/getgroupdescription/delivery fail");
                return;
            case 2:
                Log.e("SpamXmppMethods/failed to deliver spam report");
                return;
            default:
                return;
        }
    }

    public void BWw(C203399nx r5, String str) {
        Object obj;
        int intValue;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(r5, 1);
                Log.e("JoinSubgroupProtocolHelper/onError");
                Pair A012 = AnonymousClass3ME.A01(r5);
                if (!(A012 == null || (obj = A012.first) == null)) {
                    C36321k7.A1J(obj, "JoinSubgroupProtocolHelper/onError: ", AnonymousClass000.A0u());
                    Object obj2 = A012.first;
                    Number number = (Number) obj2;
                    if (number != null && ((intValue = number.intValue()) == 304 || intValue == 400 || intValue == 403 || intValue == 401 || intValue == 404 || intValue == 405 || intValue == 409 || intValue == 412 || intValue == 419 || intValue == 426 || intValue == 500)) {
                        C20760y7 r0 = AnonymousClass3NW.A02;
                        C603837q r2 = ((AnonymousClass3NW) this.A00).A00;
                        AnonymousClass00C.A07(obj2);
                        int A0I = AnonymousClass000.A0I(obj2);
                        C586730p r02 = r2.A00;
                        AnonymousClass147 r3 = r2.A03;
                        C40041ue.A01(r02.A00, A0I);
                        if (A0I == 409) {
                            r2.A02.A05.A0k.A0E(r3, "subgroup_conflict_recovery", 3);
                            return;
                        }
                        return;
                    }
                }
                C20760y7 r03 = AnonymousClass3NW.A02;
                C40041ue.A01(((AnonymousClass3NW) this.A00).A00.A00.A00, -1);
                return;
            case 1:
                Log.i("groupchatinfo/getgroupdescription/error");
                return;
            case 2:
                Log.e("SpamXmppMethods/bad spam report");
                return;
            default:
                return;
        }
    }

    public void BiM(C203399nx r11, String str) {
        String str2;
        AnonymousClass3QL r0;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(r11, 1);
                C203399nx A0c = r11.A0c("membership_approval_request");
                C20760y7 r02 = AnonymousClass3NW.A02;
                C603837q r1 = ((AnonymousClass3NW) this.A00).A00;
                if (A0c != null) {
                    C586830q r03 = r1.A01;
                    C40041ue.A03(r03.A00, r1.A03, 1);
                    return;
                }
                C586830q r04 = r1.A01;
                C40041ue.A03(r04.A00, r1.A03, 0);
                return;
            case 1:
                Log.i("groupchatinfo/getgroupdescription/success");
                C203399nx A0a = r11.A0a();
                AnonymousClass147 r7 = (AnonymousClass147) r11.A0X(AnonymousClass147.class, "from");
                if (r7 != null) {
                    C20350xQ A0d = C36431kI.A0d((C20510xg) this.A00);
                    AnonymousClass00C.A0D(A0a, 0);
                    AnonymousClass3QL A04 = AnonymousClass3UA.A04(A0a);
                    int A05 = A0d.A0M.A05(r7);
                    AnonymousClass16D r2 = A0d.A0C;
                    AnonymousClass141 A0A = r2.A0A(r7);
                    if (A05 == 1) {
                        if (A0A == null || (r0 = A0A.A0K) == null) {
                            str2 = "groupmgr/onParentGroupDescription/new community";
                        } else {
                            String str3 = r0.A03;
                            AnonymousClass147 A02 = C20350xQ.A02(A0d, r7);
                            if (A02 != null && !TextUtils.equals(str3, A04.A03)) {
                                Log.i("groupmgr/onParentGroupDescription/changed");
                                r2.A0c(r7, A04);
                                C27531Oo r6 = A0d.A0c;
                                C238019x r4 = A0d.A0x;
                                r6.BJb(r4.A08(r7, A04, (C207209uj) null, true), 3015);
                                A0d.A0T(3006, r4.A08(A02, A04, (C207209uj) null, true));
                                return;
                            }
                            return;
                        }
                    } else if (A0A == null) {
                        str2 = "groupmgr/onGroupDescription/new group";
                    } else if (!TextUtils.equals(A0A.A0K.A03, A04.A03)) {
                        Log.i("groupmgr/onGroupDescription/changed");
                        r2.A0c(r7, A04);
                        A0d.A0T(3006, A0d.A0x.A08(r7, A04, (C207209uj) null, false));
                        return;
                    } else {
                        return;
                    }
                    Log.w(str2);
                    return;
                }
                return;
            case 2:
                Log.i("SpamXmppMethods/success");
                return;
            default:
                return;
        }
    }
}
