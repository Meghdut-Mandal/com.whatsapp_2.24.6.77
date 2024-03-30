package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.8t4  reason: invalid class name and case insensitive filesystem */
public class C184828t4 extends C118095nK {
    public Object A00;
    public String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c6, code lost:
        r10 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        X.AnonymousClass00C.A0D(r5, 0);
        r1 = X.C203539oF.A09(r5, r6, r7, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
        r0.A00 = r1;
        r0.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0077, code lost:
        r1 = X.C203539oF.A02(r5, r1, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C184828t4(X.C203399nx r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r5 = r20
            switch(r21) {
                case 5: goto L_0x0038;
                case 8: goto L_0x0058;
                case 11: goto L_0x007c;
                case 12: goto L_0x009f;
                case 17: goto L_0x00cd;
                case 27: goto L_0x00f8;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0.<init>()
            java.lang.String r1 = "type"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r2 = "name"
            java.lang.String r1 = "#elementValue"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.lang.String r1 = X.C203379ns.A0B(r5, r1)
            r0.A01 = r1
            java.lang.String r2 = "options"
            java.lang.String r1 = "option"
            java.lang.String[] r7 = new java.lang.String[]{r2, r1}
            X.AR7 r6 = X.AR7.A00
            r8 = 1
            r10 = 50
        L_0x002b:
            r1 = 0
            X.AnonymousClass00C.A0D(r5, r1)
            java.util.ArrayList r1 = X.C203539oF.A09(r5, r6, r7, r8, r10)
        L_0x0033:
            r0.A00 = r1
            r0.A00 = r5
            return
        L_0x0038:
            r0.<init>()
            java.lang.String r1 = "alias"
            java.lang.String[] r10 = X.C203399nx.A0O(r5, r1)
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Long r7 = X.C90474aD.A0Y()
            java.lang.Long r8 = X.C165587tf.A0b()
            r11 = 0
            r9 = 0
            java.lang.Object r1 = X.C203539oF.A07(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r1
            X.AIu r1 = X.C21368AIu.A00
            goto L_0x0077
        L_0x0058:
            r0.<init>()
            java.lang.String r1 = "alias"
            java.lang.String[] r10 = X.C203399nx.A0O(r5, r1)
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Long r7 = X.C90474aD.A0Y()
            java.lang.Long r8 = X.C165587tf.A0b()
            r11 = 0
            r9 = 0
            java.lang.Object r1 = X.C203539oF.A07(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r1
            X.AKR r1 = X.AKR.A00
        L_0x0077:
            java.lang.Object r1 = X.C203539oF.A02(r5, r1, r11)
            goto L_0x0033
        L_0x007c:
            r0.<init>()
            java.lang.String r1 = "data"
            java.lang.String[] r4 = X.C203399nx.A0O(r5, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Object r1 = X.C203379ns.A05(r5, r3, r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r1
            java.lang.String r1 = "pay"
            java.lang.String[] r7 = new java.lang.String[]{r1}
            X.AKy r6 = X.C21424AKy.A00
            r8 = 0
            goto L_0x00c6
        L_0x009f:
            r0.<init>()
            java.lang.String r1 = "states"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r1 = "start_at"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Object r1 = X.C203379ns.A05(r5, r3, r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r1
            java.lang.String r1 = "state"
            java.lang.String[] r7 = new java.lang.String[]{r1}
            X.ALE r6 = X.ALE.A00
            r8 = 1
        L_0x00c6:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x002b
        L_0x00cd:
            r0.<init>()
            java.lang.String r1 = "report"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r1 = "message_id"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Object r1 = X.C203379ns.A05(r5, r3, r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r1
            java.lang.String r1 = "reporter"
            java.lang.String[] r7 = new java.lang.String[]{r1}
            X.AMi r6 = X.C21460AMi.A00
            r8 = 1
            r10 = 19999(0x4e1f, double:9.881E-320)
            goto L_0x002b
        L_0x00f8:
            r0.<init>()
            java.lang.String r1 = "linked_accounts"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r2 = "linked_account"
            java.lang.String r1 = "type"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Long r7 = X.C165567td.A0P()
            java.lang.Long r8 = X.C165567td.A0Q()
            r11 = 0
            java.lang.String r9 = "website"
            X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "url"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Long r7 = X.C36411kG.A0t()
            r3 = 4096(0x1000, double:2.0237E-320)
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r9 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r1
            java.lang.String[] r14 = X.C165607th.A1b(r5, r0, r2)
            X.API r13 = X.API.A00
            r15 = 1
            X.AnonymousClass00C.A0D(r5, r11)
            r17 = 1
            r12 = r5
            java.util.ArrayList r1 = X.C203539oF.A09(r12, r13, r14, r15, r17)
            java.lang.Object r1 = r1.get(r11)
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184828t4.<init>(X.9nx, int):void");
    }

    public C184828t4(C203399nx r26, C203399nx r27, int i) {
        String str;
        boolean z;
        Long l;
        Long l2;
        Class<String> cls;
        C203399nx r10 = r26;
        C203399nx r3 = r27;
        String[] A0O = C203399nx.A0O(r10, "iq");
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 13:
            case 15:
            case 18:
            case 21:
            case 23:
            case 25:
                cls = String.class;
                l2 = C165567td.A0P();
                l = C165567td.A0Q();
                z = false;
                str = "error";
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 10:
            case 14:
            case 16:
            case 19:
            case 20:
            case 22:
            case 24:
            case 26:
            case 28:
                cls = String.class;
                l2 = C165567td.A0P();
                l = C165567td.A0Q();
                z = false;
                str = "result";
                break;
            default:
                Class<String> cls2 = String.class;
                Long A0P = C165567td.A0P();
                Long A0Q = C165567td.A0Q();
                Long l3 = A0P;
                Long l4 = A0Q;
                C203379ns.A03(r10, cls2, l3, l4, "result", A0O, false);
                String[] A0l = C165617ti.A0l();
                Class<Jid> cls3 = Jid.class;
                C203539oF r2 = C203379ns.A00;
                C203539oF r9 = r2;
                this.A00 = r9.A0Z(r10, cls3, l3, l4, r2.A0Z(r3, cls3, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
                Class<String> cls4 = cls2;
                this.A01 = (String) r9.A0Z(r10, cls4, l3, l4, r2.A0Z(r3, cls2, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
                break;
        }
        C203379ns.A03(r10, cls, l2, l, str, A0O, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C203539oF r22 = C203379ns.A00;
        C203399nx r12 = r10;
        this.A01 = (String) r22.A0Z(r12, cls, l2, l, r22.A0Z(r3, cls, l2, l, (Object) null, strArr2, z), strArr, true);
        String[] A0l2 = C165617ti.A0l();
        Class<Jid> cls5 = Jid.class;
        this.A00 = r22.A0Z(r10, cls5, l2, l, r22.A0Z(r3, cls5, l2, l, (Object) null, new String[]{"to"}, z), A0l2, true);
        this.A00 = r10;
    }
}
