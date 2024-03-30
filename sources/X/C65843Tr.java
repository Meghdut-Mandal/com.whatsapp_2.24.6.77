package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.3Tr  reason: invalid class name and case insensitive filesystem */
public class C65843Tr implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static void A00(C65843Tr r5, Throwable th) {
        ((AnonymousClass4U4) r5.A02).onError(800);
        Log.e("Connection/handleInvalidJidReceived", th);
        ((C20510xg) r5.A00).A00.A0E("Connection/handleInvalidJidReceived", "invalid-jid-received", true);
        ((C170888Hw) r5.A01).A04((Object) null);
    }

    public C65843Tr(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public void A01(AnonymousClass3S5 r4, AnonymousClass147 r5) {
        C20510xg r2 = (C20510xg) this.A00;
        int i = r4.A00;
        if (5 == i || 6 == i) {
            Set set = r2.A0F;
            synchronized (set) {
                set.remove(r5);
            }
        }
    }

    public void BVN(String str) {
        StringBuilder A0u;
        String str2;
        switch (this.A03) {
            case 0:
                C36321k7.A1Q("GroupXmppMethods/sendModifyAdmin/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                AnonymousClass4ZR r1 = (AnonymousClass4ZR) ((AnonymousClass4U4) this.A02);
                switch (r1.A01) {
                    case 0:
                        break;
                    case 2:
                        C40041ue.A02((C40041ue) r1.A00, -408, 2);
                        break;
                    default:
                        throw null;
                }
                C36321k7.A0R((C170888Hw) this.A01, "sendModifyAdmin IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
            case 1:
                C36321k7.A1Q("GroupXmppMethods/sendGetGroupInfoByInviteAddKey/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                C36321k7.A0R((C170888Hw) this.A01, "sendGetGroupInfoByInviteAddKey IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
            case 2:
                A0u = AnonymousClass000.A0u();
                str2 = "GroupXmppMethods/sendGetGroupProfile/onDeliveryFailure; iq=";
                break;
            case 3:
                C36321k7.A1Q("GroupXmppMethods/sendSetGroupDescription/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                ((AnonymousClass4U6) this.A02).BVN(str);
                C36321k7.A0R((C170888Hw) this.A01, "sendSetGroupDescription IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
            case 4:
                return;
            case 5:
                A01((AnonymousClass3S5) this.A02, (AnonymousClass147) this.A01);
                Log.i("GroupXmppMethod/GetGroupInfo/delivery fail");
                return;
            default:
                A0u = AnonymousClass000.A0u();
                str2 = "BroadcastXmppMethods/sendDeleteBroadcastList/onDeliveryFailure; iq=";
                break;
        }
        C36321k7.A1Q(str2, str, A0u);
    }

    public void BWw(C203399nx r6, String str) {
        switch (this.A03) {
            case 2:
                ((AnonymousClass4TC) this.A02).onError(AnonymousClass3ME.A00(r6));
                return;
            case 3:
                ((AnonymousClass4U6) this.A02).BWp(str, AnonymousClass3ME.A00(r6));
                break;
            case 4:
                ((AnonymousClass4RS) this.A01).Bou(AnonymousClass3ME.A00(r6));
                return;
            case 5:
                AnonymousClass147 r3 = (AnonymousClass147) this.A01;
                A01((AnonymousClass3S5) this.A02, r3);
                int A002 = AnonymousClass3ME.A00(r6);
                if (A002 == 429) {
                    C20510xg r0 = (C20510xg) this.A00;
                    r0.A0E.put(r3, Long.valueOf(C19970wo.A00(r0.A01)));
                }
                C20350xQ A0d = C36431kI.A0d((C20510xg) this.A00);
                if (A002 != 403) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    if (A002 != 404) {
                        A0u.append("groupmgr/groupInfoError/groupjid = ");
                        A0u.append(r3);
                        C36321k7.A1T("errorcode = ", A0u, A002);
                        return;
                    }
                    C36321k7.A1J(r3, "groupmgr/groupInfoError/does not exist: ", A0u);
                    return;
                }
                C36321k7.A1J(r3, "groupmgr/groupInfoError/not a participant: ", AnonymousClass000.A0u());
                A0d.A0k(Collections.singletonList(r3), true);
                return;
            case 6:
                C36321k7.A1Q("BroadcastXmppMethods/sendDeleteBroadcastList/onError; iq=", str, AnonymousClass000.A0u());
                ((AnonymousClass4RS) this.A01).Bou(AnonymousClass3ME.A00(r6));
                return;
            default:
                ((AnonymousClass4U4) this.A02).onError(AnonymousClass3ME.A00(r6));
                break;
        }
        C36381kD.A1J(this.A01);
    }

    public void BiM(C203399nx r23, String str) {
        String str2;
        String str3;
        C203399nx r5 = r23;
        switch (this.A03) {
            case 0:
                C203399nx A0a = r5.A0a();
                UserJid userJid = (UserJid) A0a.A0X(UserJid.class, "creator");
                long A012 = AnonymousClass6R8.A01(A0a.A0i("creation", (String) null), 0) * 1000;
                String A0i = A0a.A0i("subject", (String) null);
                long A013 = AnonymousClass6R8.A01(A0a.A0i("s_t", (String) null), 0) * 1000;
                String A0i2 = A0a.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                if (A0i2 == null) {
                    ((AnonymousClass4U4) this.A02).onError(500);
                    ((C170888Hw) this.A01).A04((Object) null);
                    return;
                }
                try {
                    AnonymousClass147 A022 = AnonymousClass143.A02(A0i2);
                    String A0i3 = A0a.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
                    LinkedHashMap A06 = AnonymousClass3UA.A06(A0a, ((C20510xg) this.A00).A00);
                    int A05 = C36371kC.A05(A0a, A06);
                    C203399nx A0c = A0a.A0c("parent");
                    if (A0c != null) {
                        A05 = AnonymousClass6R8.A00(A0c.A0i("num_sub_groups", (String) null), 0);
                    }
                    AnonymousClass4U4 r6 = (AnonymousClass4U4) this.A02;
                    AnonymousClass3QL A04 = AnonymousClass3UA.A04(A0a);
                    int A023 = AnonymousClass3UA.A02(A0a);
                    int A002 = AnonymousClass3MD.A00(A0a);
                    C203399nx A0c2 = A0a.A0c("linked_parent");
                    if (A0c2 != null) {
                        str3 = A0c2.A0i("subject", (String) null);
                    } else {
                        str3 = null;
                    }
                    try {
                        r6.BYi(A022, AnonymousClass3UA.A03(A0a), userJid, A04, A0i, A0i3, str3, A06, A05, A023, A002, A012, A013);
                    } catch (C19740wR e) {
                        e = e;
                    }
                } catch (C19740wR e2) {
                    e = e2;
                    A00(this, e);
                    ((C170888Hw) this.A01).A04((Object) null);
                    return;
                }
                ((C170888Hw) this.A01).A04((Object) null);
                return;
            case 1:
                C203399nx A0a2 = r5.A0a();
                UserJid userJid2 = (UserJid) A0a2.A0X(UserJid.class, "creator");
                long A014 = AnonymousClass6R8.A01(A0a2.A0i("creation", (String) null), 0) * 1000;
                String A0i4 = A0a2.A0i("subject", (String) null);
                long A015 = AnonymousClass6R8.A01(A0a2.A0i("s_t", (String) null), 0) * 1000;
                try {
                    String A0i5 = A0a2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                    C18740tg.A06(A0i5);
                    AnonymousClass147 A024 = AnonymousClass143.A02(A0i5);
                    String A0i6 = A0a2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
                    LinkedHashMap A062 = AnonymousClass3UA.A06(A0a2, ((C20510xg) this.A00).A00);
                    int A052 = C36371kC.A05(A0a2, A062);
                    AnonymousClass4U4 r62 = (AnonymousClass4U4) this.A02;
                    AnonymousClass3QL A042 = AnonymousClass3UA.A04(A0a2);
                    int A025 = AnonymousClass3UA.A02(A0a2);
                    int A003 = AnonymousClass3MD.A00(A0a2);
                    C203399nx A0c3 = A0a2.A0c("linked_parent");
                    if (A0c3 != null) {
                        str2 = A0c3.A0i("subject", (String) null);
                    } else {
                        str2 = null;
                    }
                    try {
                        r62.BYi(A024, AnonymousClass3UA.A03(A0a2), userJid2, A042, A0i4, A0i6, str2, A062, A052, A025, A003, A014, A015);
                    } catch (C19740wR e3) {
                        e = e3;
                    }
                } catch (C19740wR e4) {
                    e = e4;
                    A00(this, e);
                    ((C170888Hw) this.A01).A04((Object) null);
                    return;
                }
                ((C170888Hw) this.A01).A04((Object) null);
                return;
            case 2:
                C203399nx A0d = r5.A0d("picture");
                ((AnonymousClass4TC) this.A02).BYj(((C605738j) this.A01).A01, A0d.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null), A0d.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null), A0d.A0i("url", (String) null), A0d.A01);
                return;
            case 3:
                ((AnonymousClass4U6) this.A02).onSuccess();
                C36381kD.A1J(this.A01);
                return;
            case 4:
                break;
            case 5:
                AnonymousClass147 r3 = (AnonymousClass147) this.A01;
                AnonymousClass3S5 r2 = (AnonymousClass3S5) this.A02;
                A01(r2, r3);
                String str4 = r2.A01;
                if (("prefetch".equals(str4) || ("interactive".equals(str4) && ((C20510xg) this.A00).A03.A0E(6531))) && r5.A0b(0) == null) {
                    ((C20510xg) this.A00).A06.A00.A01(r3);
                    return;
                }
                C20510xg r0 = (C20510xg) this.A00;
                AnonymousClass3MD.A01(r0.A00, C36431kI.A0d(r0), r2, r5);
                return;
            default:
                C36321k7.A1Q("BroadcastXmppMethods/sendDeleteBroadcastList/onSuccess; iq=", str, AnonymousClass000.A0u());
                break;
        }
        C36411kG.A1O(this.A02);
    }
}
