package X;

import android.os.ConditionVariable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8uZ  reason: invalid class name and case insensitive filesystem */
public class C185648uZ extends C592133b {
    public C185648uZ(int i) {
        String str;
        switch (i) {
            case 13:
                str = "allow_admin_reports";
                break;
            case 14:
                str = "allow_non_admin_sub_group_creation";
                break;
            case 15:
                str = "group_history";
                break;
            case 16:
                str = "no_group_history";
                break;
            case 17:
                str = "not_allow_admin_reports";
                break;
            case 18:
                str = "not_allow_non_admin_sub_group_creation";
                break;
            case 21:
                str = "announcement";
                break;
            default:
                str = "locked";
                break;
        }
        C592133b.A00(C36441kJ.A0q(str), this);
    }

    public C185648uZ(AnonymousClass147 r4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("group");
        if (C203539oF.A0N(r4, "jid")) {
            C36351kA.A1I(r4, A0q, "jid");
        }
        C592133b.A00(A0q, this);
    }

    public C185648uZ(C50632lE r3) {
        AnonymousClass6QB A0q = C36441kJ.A0q("linked_groups");
        ConditionVariable conditionVariable = C18740tg.A00;
        C165577te.A1H(A0q, r3, this);
    }

    public C185648uZ(C185648uZ r7, byte[] bArr) {
        AnonymousClass6QB A0q = C36441kJ.A0q("single_serialized_lookup");
        A0q.A05(r7.A00);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("label");
        C203539oF.A0I(bArr, 0, 32);
        A0q2.A01 = bArr;
        C165567td.A1F(A0q2, A0q, this);
    }

    public C185648uZ(C185718ug r3, int i) {
        AnonymousClass6QB A0q;
        switch (i) {
            case 7:
            case 8:
                A0q = C36441kJ.A0q("context");
                break;
            default:
                A0q = C36441kJ.A0q("membership_approval_mode");
                ConditionVariable conditionVariable = C18740tg.A00;
                break;
        }
        C165577te.A1H(A0q, r3, this);
    }

    public C185648uZ(C185718ug r3, C16440pF r4, C50592lA r5, C185658ua r6) {
        AnonymousClass6QB A0q = C36441kJ.A0q("picture");
        C165577te.A1G(A0q, r3);
        A0q.A06(r6.A00);
        A0q.A06(r5.A00);
        ConditionVariable conditionVariable = C18740tg.A00;
        C165577te.A1H(A0q, (C592133b) r4, this);
    }

    public C185648uZ(UserJid userJid) {
        AnonymousClass6QB A0q = C36441kJ.A0q("participant");
        if (C203539oF.A0N(userJid, "jid")) {
            C36351kA.A1I(userJid, A0q, "jid");
        }
        C592133b.A00(A0q, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (X.C203539oF.A0P(r4, r5, r7, r9) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        r2.A07(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        X.C36361kB.A1H(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (X.C203539oF.A0P(r4, r5, r7, r9) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r1.A07(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        X.C592133b.A00(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C185648uZ(java.lang.String r11, int r12) {
        /*
            r10 = this;
            r4 = r11
            switch(r12) {
                case 2: goto L_0x009c;
                case 4: goto L_0x008c;
                case 5: goto L_0x007d;
                case 6: goto L_0x005c;
                case 22: goto L_0x0046;
                case 27: goto L_0x0031;
                case 28: goto L_0x001f;
                default: goto L_0x0004;
            }
        L_0x0004:
            r10.<init>()
            java.lang.String r0 = "reason"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 100
        L_0x0012:
            boolean r0 = X.C203539oF.A0P(r4, r5, r7, r9)
            if (r0 == 0) goto L_0x001b
            r1.A07(r11)
        L_0x001b:
            X.C592133b.A00(r1, r10)
            return
        L_0x001f:
            r10.<init>()
            java.lang.String r0 = "after"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 0
            r7 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            goto L_0x0012
        L_0x0031:
            r10.<init>()
            java.lang.String r0 = "trace"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            java.lang.String r0 = "flow_id"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 36
            goto L_0x0070
        L_0x0046:
            r10.<init>()
            java.lang.String r0 = "description"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            java.lang.String r0 = "body"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0070
        L_0x005c:
            r10.<init>()
            java.lang.String r0 = "product"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            java.lang.String r0 = "id"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 200(0xc8, double:9.9E-322)
        L_0x0070:
            boolean r0 = X.C203539oF.A0P(r4, r5, r7, r9)
            if (r0 == 0) goto L_0x0079
            r2.A07(r11)
        L_0x0079:
            X.C36361kB.A1H(r2, r1)
            goto L_0x001b
        L_0x007d:
            r10.<init>()
            java.lang.String r0 = "title"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0012
        L_0x008c:
            r10.<init>()
            java.lang.String r0 = "device_log_handle"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r9 = 0
            r5 = 1
            r7 = 500(0x1f4, double:2.47E-321)
            goto L_0x0012
        L_0x009c:
            r10.<init>()
            java.lang.String r0 = "elo"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            r0 = 0
            r2 = 1
            boolean r0 = X.C203539oF.A0T(r11, r2, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "network_device_id"
            X.C36331k8.A1D(r1, r0, r11)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185648uZ.<init>(java.lang.String, int):void");
    }

    public C185648uZ(String str, String str2) {
        AnonymousClass6QB A0q = C36441kJ.A0q("metadata");
        if (C203539oF.A0S(str, 1, false)) {
            C36331k8.A1D(A0q, "key", str);
        }
        if (C203539oF.A0U(str2, 1, false)) {
            C36331k8.A1D(A0q, "value", str2);
        }
        C592133b.A00(A0q, this);
    }

    public C185648uZ(String str, String str2, String str3) {
        AnonymousClass6QB A0q = C36441kJ.A0q("elo");
        if (C203539oF.A0P(str, 1, 10000, false)) {
            C36331k8.A1D(A0q, "device_signature", str);
        }
        if (C203539oF.A0P(str2, 1, 10000, false)) {
            C36331k8.A1D(A0q, "wallet_signature", str2);
        }
        if (C203539oF.A0P(str3, 1, 10000, false)) {
            C36331k8.A1D(A0q, "challenge_id", str3);
        }
        C592133b.A00(A0q, this);
    }

    public C185648uZ(byte[] bArr) {
        AnonymousClass6QB A0q = C36441kJ.A0q("key");
        C203539oF.A0I(bArr, 0, 32);
        A0q.A01 = bArr;
        C592133b.A00(A0q, this);
    }
}
