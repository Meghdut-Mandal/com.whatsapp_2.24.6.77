package X;

import android.os.ConditionVariable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8uf  reason: invalid class name and case insensitive filesystem */
public class C185708uf extends C50492l0 {
    public C185708uf(byte[] bArr, int i) {
        C203399nx A03;
        if (6 - i != 0) {
            AnonymousClass6QB A0X = C165597tg.A0X();
            AnonymousClass6QB A0q = C36441kJ.A0q("reporting");
            AnonymousClass6QB A0q2 = C36441kJ.A0q("reporting_tag");
            C203539oF.A0I(bArr, 16, 128);
            A0q2.A01 = bArr;
            A0X.A05(C165567td.A0I(A0q2, A0q));
            A03 = A0X.A03();
        } else {
            AnonymousClass6QB A0X2 = C165597tg.A0X();
            C203539oF.A0I(bArr, 1, 120);
            A0X2.A01 = bArr;
            A03 = A0X2.A03();
        }
        this.A00 = A03;
    }

    public static C185708uf A02(C207119ua r5) {
        return new C185708uf(String.valueOf(r5.A01()), String.valueOf(r5.A00), ((AnonymousClass16V) r5.A01).A02, 14);
    }

    public C185708uf(String str, String str2, String str3, int i) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (13 - i != 0) {
            AnonymousClass6QB A0q = C36441kJ.A0q("money");
            if (C203539oF.A0P(str4, 1, 100, false)) {
                C36331k8.A1D(A0q, "value", str4);
            }
            if (C203539oF.A0P(str5, 1, 100, false)) {
                C36331k8.A1D(A0q, "offset", str5);
            }
            if (C203539oF.A0P(str6, 1, 100, false)) {
                C36331k8.A1D(A0q, "currency", str6);
            }
            C36361kB.A1H(A0q, A0X);
        } else {
            if (C203539oF.A0P(str4, 6, 6, false)) {
                C36331k8.A1D(A0X, "debit-last-6", str4);
            }
            if (C203539oF.A0P(str5, 1, 2, false)) {
                C36331k8.A1D(A0X, "debit-exp-month", str5);
            }
            if (C203539oF.A0P(str6, 2, 2, false)) {
                C36331k8.A1D(A0X, "debit-exp-year", str6);
            }
        }
        C592133b.A00(A0X, this);
    }

    public C185708uf(String str) {
        AnonymousClass6QB A0W = C165597tg.A0W();
        AnonymousClass6QB A0q = C36441kJ.A0q("hsm");
        if (C203539oF.A0W(str, false)) {
            C36331k8.A1D(A0q, "tid", str);
        }
        C165567td.A1F(A0q, A0W, this);
    }

    public C185708uf(C185708uf r3) {
        AnonymousClass6QB A0W = C165597tg.A0W();
        ConditionVariable conditionVariable = C18740tg.A00;
        C165577te.A1H(A0W, r3, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        X.C36331k8.A1D(r2, r1, r0);
        r0 = r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r0 = X.C165567td.A0I(X.C36441kJ.A0q(r0), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C185708uf(int r5) {
        /*
            r4 = this;
            r4.<init>()
            switch(r5) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0006;
                case 2: goto L_0x0006;
                case 3: goto L_0x0035;
                case 4: goto L_0x002e;
                case 5: goto L_0x0027;
                case 6: goto L_0x0006;
                case 7: goto L_0x001e;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.6QB r3 = X.C165597tg.A0W()
            java.lang.String r0 = "meta"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            java.lang.String r1 = "biz_source"
            java.lang.String r0 = "smb_promo"
            X.C36331k8.A1D(r2, r1, r0)
            X.9nx r0 = X.C165567td.A0I(r2, r3)
        L_0x001b:
            r4.A00 = r0
            return
        L_0x001e:
            X.6QB r2 = X.C165597tg.A0W()
            java.lang.String r1 = "edit"
            java.lang.String r0 = "7"
            goto L_0x004c
        L_0x0027:
            X.6QB r1 = X.C165597tg.A0W()
            java.lang.String r0 = "url_text"
            goto L_0x003b
        L_0x002e:
            X.6QB r1 = X.C165597tg.A0W()
            java.lang.String r0 = "url_number"
            goto L_0x003b
        L_0x0035:
            X.6QB r1 = X.C165597tg.A0W()
            java.lang.String r0 = "multicast"
        L_0x003b:
            X.6QB r0 = X.C36441kJ.A0q(r0)
            X.9nx r0 = X.C165567td.A0I(r0, r1)
            goto L_0x001b
        L_0x0044:
            X.6QB r2 = X.C165597tg.A0W()
            java.lang.String r1 = "edit"
            java.lang.String r0 = "1"
        L_0x004c:
            X.C36331k8.A1D(r2, r1, r0)
            X.9nx r0 = r2.A03()
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185708uf.<init>(int):void");
    }

    public C185708uf(String str, String str2) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        if (C203539oF.A0P(str, 1, 100, false)) {
            C36331k8.A1D(A0X, "aadhaar-otp-txn-id", str);
        }
        if (C203539oF.A0P(str2, 1, 100, false)) {
            C36331k8.A1D(A0X, "aadhaar-otp-txn-ts", str2);
        }
        C592133b.A00(A0X, this);
    }

    public C185708uf(C185708uf r6, Long l) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        AnonymousClass6QB A0q = C36441kJ.A0q("tctoken");
        if (l != null && C203539oF.A0M(l, true)) {
            C36411kG.A1K(A0q, "t", l.longValue());
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r6.A00);
        C165567td.A1F(A0q, A0X, this);
    }

    public C185708uf(UserJid userJid) {
        AnonymousClass6QB A0W = C165597tg.A0W();
        if (C203539oF.A0N(userJid, "participant")) {
            C36351kA.A1I(userJid, A0W, "participant");
        }
        C592133b.A00(A0W, this);
    }
}
