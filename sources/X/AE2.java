package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

public final /* synthetic */ class AE2 implements C22954Az6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C135086c7 A01;
    public final /* synthetic */ C197639c2 A02;
    public final /* synthetic */ C191939Fb A03;

    public /* synthetic */ AE2(Activity activity, C135086c7 r2, C197639c2 r3, C191939Fb r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void BfL(UserJid userJid, C135086c7 r14, C135086c7 r15, C135086c7 r16, C202059ky r17, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C193699Mm r4;
        C28201Rs r0;
        String str4;
        BigDecimal bigDecimal;
        int i;
        C197639c2 r02 = this.A02;
        C191939Fb r1 = this.A03;
        Activity activity = this.A00;
        C135086c7 r9 = this.A01;
        C202059ky r2 = r17;
        if (!z || r17 != null) {
            r4 = new C193699Mm(1);
            r4.A01 = r2;
            r0 = r1.A00.A00;
        } else {
            boolean z6 = z2;
            if (z3) {
                r02.A00.A00(activity, new A9S(r1, z6), userJid, r9, true, false);
                return;
            }
            C167757yl r22 = r1.A00;
            C203479o6 A0S = r22.A0S();
            A0S.A0P = z6;
            A0S.A09 = (String) C165577te.A0g(r14);
            String str5 = str3;
            if (str3 != null) {
                A0S.A06 = str5;
            }
            if (!TextUtils.isEmpty(A0S.A0A) && (str4 = A0S.A02) != null && (str4.contentEquals("DEEP_LINK") || str4.contentEquals("GALLERY_QR_CODE"))) {
                String str6 = A0S.A0A;
                AnonymousClass16U r3 = AnonymousClass16W.A05;
                AnonymousClass16X A0R = C165607th.A0R(r3, str6);
                String A002 = r22.A06.A00(A0S.A06, A0S.A0C, z6);
                if (!AnonymousClass14B.A0F(A002)) {
                    bigDecimal = C165617ti.A0b(A002);
                    if (A0R != null && A0R.A00.compareTo(bigDecimal) > 0) {
                        i = 9;
                        if (z2) {
                            i = 8;
                        }
                    }
                } else {
                    bigDecimal = new BigDecimal(C202759mb.A00(r22.A04, A0S));
                    if (A0R != null && A0R.A00.compareTo(bigDecimal) > 0) {
                        i = 7;
                    }
                }
                r4 = new C193699Mm(i);
                r4.A02 = r3.B7e(r22.A05, bigDecimal);
                r0 = r22.A00;
            }
            r22.A03.A0D(A0S);
            C167757yl.A02(r22);
            return;
        }
        r0.A0D(r4);
    }
}
