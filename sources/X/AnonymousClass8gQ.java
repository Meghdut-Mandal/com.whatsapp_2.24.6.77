package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.8gQ  reason: invalid class name */
public class AnonymousClass8gQ extends AnonymousClass9I1 {
    public C202269lR A00;
    public final Context A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass16T A03;
    public final AnonymousClass19A A04;
    public final C29221Vu A05;
    public final C195479Ul A06;
    public final String A07;
    public final C29121Vk A08;

    public AnonymousClass8gQ(Context context, AnonymousClass17Y r3, AnonymousClass16T r4, AnonymousClass19A r5, C202269lR r6, C29221Vu r7, C29121Vk r8, C195479Ul r9, C29131Vl r10) {
        super(r6.A04, r8);
        this.A01 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r10.A01();
        this.A00 = r6;
        this.A08 = r8;
        this.A06 = r9;
        this.A03 = r4;
        this.A05 = r7;
    }

    public static void A00(C135086c7 r3, C135086c7 r4, AnonymousClass1XD r5, AnonymousClass8gQ r6, String str, String str2) {
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "upi-remove-credential", A0I);
        C36381kD.A1M("vpa", C165607th.A0s(r3), A0I);
        if (!TextUtils.isEmpty(str)) {
            C36381kD.A1M("vpa-id", str, A0I);
        }
        C36381kD.A1M("upi-bank-info", (String) C165577te.A0g(r4), A0I);
        C36381kD.A1M("device-id", r6.A07, A0I);
        C36381kD.A1M("credential-id", str2, A0I);
        r6.A08.A0B(r5, C203399nx.A06(A0I));
    }

    public void A01(C135086c7 r4, C135086c7 r5, AnonymousClass1XD r6, String str, String str2, boolean z, boolean z2) {
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "upi-edit-default-credential", A0I);
        C36381kD.A1M("vpa", C165607th.A0s(r4), A0I);
        if (!TextUtils.isEmpty(str)) {
            C36381kD.A1M("vpa-id", str, A0I);
        }
        C36381kD.A1M("upi-bank-info", (String) C165577te.A0g(r5), A0I);
        C36381kD.A1M("device-id", this.A07, A0I);
        C36381kD.A1M("credential-id", str2, A0I);
        C36381kD.A1M(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, Integer.toString(z ? 1 : 0), A0I);
        C36381kD.A1M("default-debit-p2m", Integer.toString(z2 ? 1 : 0), A0I);
        this.A08.A0C(r6, C203399nx.A06(A0I));
    }
}
