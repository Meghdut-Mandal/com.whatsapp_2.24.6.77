package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8ve  reason: invalid class name and case insensitive filesystem */
public final class C186248ve extends AnonymousClass5PS {
    public static final ArrayList A0F = C165567td.A0e("0", "1");
    public static final ArrayList A0G = C165567td.A0f("ACTIVE", "ARCHIVED", "INACTIVE");
    public final C184308sE A00;
    public final C184038rn A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final C203399nx A0C;
    public final C203399nx A0D;
    public final C184828t4 A0E;

    public C186248ve(C203399nx r29, C186018vH r30) {
        C203399nx r15 = r29;
        C203399nx A0e = C90514aH.A0e(r15, r30);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203539oF r6 = C203379ns.A00;
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r15, cls2, l, l2, r6.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        String[] strArr = {"account", "offer", PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<Long> cls3 = Long.class;
        Long A0Y = C90474aD.A0Y();
        Long l3 = A0Q;
        Long l4 = A0Y;
        C203379ns.A03(r15, cls3, l4, l3, (Object) null, strArr, false);
        C203539oF r14 = r6;
        this.A0B = (String) r14.A0Z(r15, cls2, A0Y, l2, (Object) null, new String[]{"account", "offer", "title"}, false);
        this.A06 = (String) r14.A0Z(r15, cls2, A0Y, l2, (Object) null, new String[]{"account", "offer", "description"}, false);
        this.A08 = (String) r14.A0Z(r15, cls2, A0Y, l2, (Object) null, new String[]{"account", "offer", "fine_print_url"}, false);
        this.A0A = (String) r14.A0Z(r15, cls2, A0Y, l2, (Object) null, new String[]{"account", "offer", "terms_url"}, false);
        C203539oF r20 = r6;
        C203399nx r21 = r15;
        this.A04 = (Long) r20.A0Z(r21, cls3, l4, l3, (Object) null, new String[]{"account", "offer", "redeem_limit"}, false);
        this.A05 = (Long) r20.A0Z(r21, cls3, l4, l3, (Object) null, new String[]{"account", "offer", "start_ts"}, false);
        this.A03 = (Long) r20.A0Z(r21, cls3, l4, l3, (Object) null, new String[]{"account", "offer", "end_ts"}, false);
        C203379ns.A03(r21, cls3, l4, l3, (Object) null, new String[]{"account", "offer", "version"}, false);
        this.A02 = (Long) C203539oF.A07(r21, cls3, C36411kG.A0t(), l3, (Object) null, new String[]{"account", "offer", "eligibility", "receiver", "max_from_sender"}, false);
        this.A09 = C203379ns.A0A(r15, A0G, new String[]{"account", "offer", "state"});
        this.A07 = C203379ns.A09(r15, A0F, new String[]{"account", "offer", "eligibility", "receiver", "usync_pay_eligible_offers_includes_current_offer_id"});
        this.A00 = (C184308sE) C203539oF.A06(r15, AKS.A00, new String[]{"account", "offer", "offer_amount"});
        this.A0E = (C184828t4) C203539oF.A02(r15, new C23212B9u(A0e, 27), 0);
        this.A01 = (C184038rn) C203379ns.A02(r15, AKT.A00, new String[]{"account", "offer", "eligibility", "payment", "min_amount"});
        this.A00 = r15;
        AKU aku = AKU.A00;
        AnonymousClass00C.A0D(r15, 0);
        this.A0D = (C203399nx) C203539oF.A09(r15, aku, new String[]{"account", "offer"}, 1, 1).get(0);
        this.A0C = (C203399nx) C203539oF.A09(r15, AKV.A00, new String[]{"account", "offer", "eligibility", "receiver"}, 1, 1).get(0);
    }
}
