package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8gt  reason: invalid class name and case insensitive filesystem */
public class C178658gt extends AF8 {
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final C21100yf A02;
    public final C20050ww A03;
    public final C33771fu A04;
    public final C21060yb A05;
    public final C19970wo A06;
    public final C18820ts A07;
    public final C24881Ed A08;
    public final AnonymousClass16T A09;
    public final C20810yC A0A;
    public final AnonymousClass19A A0B;
    public final C196129Xv A0C;
    public final AEA A0D;
    public final C202269lR A0E;
    public final AE0 A0F;
    public final C201659k4 A0G;
    public final AE5 A0H;
    public final AnonymousClass1EZ A0I;
    public final C29221Vu A0J;
    public final C29231Vv A0K;
    public final C202629mK A0L;
    public final C24601Db A0M;
    public final C29121Vk A0N;
    public final AF7 A0O;
    public final AE8 A0P;
    public final C200169gl A0Q;
    public final AnonymousClass5GM A0R;
    public final C202699mR A0S;
    public final C29131Vl A0T;
    public final C19770wU A0U;
    public final C24651Dg A0V;
    public final AnonymousClass1EV A0W;
    public final AnonymousClass1YQ A0X;

    public int BHO() {
        return 1;
    }

    public C193429Lk BIl(C175728ax r2, UserJid userJid, String str) {
        return null;
    }

    public C175708av BKY() {
        return new C175928bI();
    }

    public C23075B3f BBn() {
        return this.A0O;
    }

    public List BFH(C202319lY r11, C64933Qa r12) {
        ArrayList arrayList;
        List BFH = super.BFH(r11, r12);
        C175708av r2 = r11.A0A;
        if (r2 instanceof C175928bI) {
            C175928bI r22 = (C175928bI) r2;
            if (!TextUtils.isEmpty(r22.A0U)) {
                arrayList = AnonymousClass001.A0I();
                AnonymousClass1AL[] A0k = C165617ti.A0k();
                C36341k9.A1L("token", r22.A0U, A0k, 0);
                C207259uo r0 = r22.A02;
                C203399nx r1 = null;
                if (r0 != null) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    if (!TextUtils.isEmpty(r0.A01)) {
                        C36381kD.A1M("order-id", r22.A02.A01, A0I2);
                        if (!TextUtils.isEmpty(r22.A02.A02)) {
                            C36381kD.A1M("order-message-id", r22.A02.A02, A0I2);
                        }
                        long j = r22.A02.A00;
                        if (j != 0) {
                            C165597tg.A1I("expiry-ts", A0I2, j);
                        }
                        r1 = C203399nx.A04("order", C165577te.A1a(A0I2, 0));
                    }
                }
                C203399nx.A0B(r1, "upi", arrayList, A0k);
                ArrayList A0I3 = AnonymousClass001.A0I();
                if (BFH != null && !BFH.isEmpty()) {
                    A0I3.addAll(BFH);
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    A0I3.addAll(arrayList);
                }
                return A0I3;
            }
        }
        arrayList = null;
        ArrayList A0I32 = AnonymousClass001.A0I();
        A0I32.addAll(BFH);
        A0I32.addAll(arrayList);
        return A0I32;
    }

    public Class BFM() {
        return IndiaUpiCheckOrderDetailsActivity.class;
    }

    public Class BFn() {
        return IndiaUpiPaymentTransactionDetailsActivity.class;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C178658gt(X.C24801Dv r10, X.AnonymousClass17Y r11, X.C21100yf r12, X.C20050ww r13, X.C33771fu r14, X.AnonymousClass16D r15, X.AnonymousClass171 r16, X.C21060yb r17, X.C19970wo r18, X.C19630wG r19, X.C18820ts r20, X.C24881Ed r21, X.AnonymousClass16T r22, X.C20810yC r23, X.AnonymousClass19A r24, X.C196129Xv r25, X.AEA r26, X.C202269lR r27, X.AE0 r28, X.C201659k4 r29, X.AE5 r30, X.AnonymousClass1EZ r31, X.C29221Vu r32, X.C29231Vv r33, X.C202629mK r34, X.C24651Dg r35, X.C24601Db r36, X.C29121Vk r37, X.AnonymousClass1EV r38, X.AnonymousClass1EU r39, X.AF7 r40, X.AnonymousClass1YQ r41, X.C194949Rw r42, X.AE8 r43, X.C200169gl r44, X.AnonymousClass5GM r45, X.C202699mR r46, X.C29131Vl r47, X.AnonymousClass1FR r48, X.C19770wU r49) {
        /*
            r9 = this;
            java.lang.String r8 = "UPI"
            r1 = r9
            r6 = r39
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r48
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r18
            r9.A06 = r0
            r9.A04 = r14
            r0 = r23
            r9.A0A = r0
            r9.A01 = r11
            r0 = r49
            r9.A0U = r0
            r9.A03 = r13
            r9.A02 = r12
            r9.A00 = r10
            r0 = r24
            r9.A0B = r0
            r9.A05 = r4
            r0 = r20
            r9.A07 = r0
            r0 = r47
            r9.A0T = r0
            r0 = r46
            r9.A0S = r0
            r0 = r36
            r9.A0M = r0
            r0 = r26
            r9.A0D = r0
            r0 = r31
            r9.A0I = r0
            r0 = r27
            r9.A0E = r0
            r0 = r29
            r9.A0G = r0
            r0 = r37
            r9.A0N = r0
            r0 = r38
            r9.A0W = r0
            r0 = r43
            r9.A0P = r0
            r0 = r22
            r9.A09 = r0
            r0 = r41
            r9.A0X = r0
            r0 = r21
            r9.A08 = r0
            r0 = r35
            r9.A0V = r0
            r0 = r25
            r9.A0C = r0
            r0 = r40
            r9.A0O = r0
            r0 = r30
            r9.A0H = r0
            r0 = r32
            r9.A0J = r0
            r0 = r44
            r9.A0Q = r0
            r0 = r28
            r9.A0F = r0
            r0 = r34
            r9.A0L = r0
            r0 = r33
            r9.A0K = r0
            r0 = r45
            r9.A0R = r0
            r0 = 0
            r1 = r42
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178658gt.<init>(X.1Dv, X.17Y, X.0yf, X.0ww, X.1fu, X.16D, X.171, X.0yb, X.0wo, X.0wG, X.0ts, X.1Ed, X.16T, X.0yC, X.19A, X.9Xv, X.AEA, X.9lR, X.AE0, X.9k4, X.AE5, X.1EZ, X.1Vu, X.1Vv, X.9mK, X.1Dg, X.1Db, X.1Vk, X.1EV, X.1EU, X.AF7, X.1YQ, X.9Rw, X.AE8, X.9gl, X.5GM, X.9mR, X.1Vl, X.1FR, X.0wU):void");
    }
}
