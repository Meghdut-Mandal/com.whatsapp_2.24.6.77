package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8tH  reason: invalid class name and case insensitive filesystem */
public class C184958tH extends C118095nK {
    public Object A00;
    public Object A01;
    public String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0157, code lost:
        r0.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        r1 = X.C203379ns.A02(r5, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003e, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        r0.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C184958tH(X.C203399nx r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r5 = r21
            switch(r22) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0090;
                case 2: goto L_0x00be;
                case 3: goto L_0x010c;
                case 4: goto L_0x0043;
                case 5: goto L_0x0043;
                case 6: goto L_0x0189;
                case 7: goto L_0x0043;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x015b;
                case 11: goto L_0x0043;
                case 12: goto L_0x0007;
                case 13: goto L_0x0043;
                case 14: goto L_0x0043;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0.<init>()
            java.lang.String r1 = "image"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r1 = "description"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Object r1 = X.C203379ns.A05(r5, r3, r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "light"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.ARg r1 = X.C21588ARg.A00
            java.lang.Object r1 = X.C203379ns.A02(r5, r1, r2)
            r0.A01 = r1
            java.lang.String r1 = "dark"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.ARh r1 = X.C21589ARh.A00
        L_0x003a:
            java.lang.Object r1 = X.C203379ns.A02(r5, r1, r2)
        L_0x003e:
            r0.A00 = r1
        L_0x0040:
            r0.A00 = r5
            return
        L_0x0043:
            r0.<init>()
            java.lang.String r1 = "notification"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r1 = "t"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Long r7 = X.C36411kG.A0t()
            java.lang.Long r8 = X.C165567td.A0Q()
            r11 = 0
            r9 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            r0.A01 = r1
            java.lang.String r1 = "id"
            java.lang.String[] r18 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Long r15 = X.C165567td.A0P()
            r19 = 0
            r12 = r4
            r13 = r5
            r16 = r8
            r17 = r9
            java.lang.Object r1 = r12.A0Z(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "offline"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Long r8 = X.C165607th.A0l()
            java.lang.Object r1 = X.C203539oF.A07(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x003e
        L_0x0090:
            r0.<init>()
            java.lang.String r1 = "sale_price"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r2 = "price"
            java.lang.String r1 = "#elementValue"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.lang.String r1 = X.C203379ns.A0B(r5, r1)
            r0.A02 = r1
            java.lang.String r1 = "start_date"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AK8 r1 = X.AK8.A00
            java.lang.Object r1 = X.C203379ns.A02(r5, r1, r2)
            r0.A01 = r1
            java.lang.String r1 = "end_date"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AK9 r1 = X.AK9.A00
            goto L_0x003a
        L_0x00be:
            r0.<init>()
            java.lang.String r1 = "user"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r1 = "external_id"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Long r7 = X.C90474aD.A0Y()
            java.lang.Long r8 = X.C165577te.A0Z()
            r11 = 0
            r9 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "integrator_id"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r1 = 999(0x3e7, double:4.936E-321)
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            r0.A00 = r1
            r1 = 2
            X.Azj[] r2 = new X.C22993Azj[r1]
            X.ALb r1 = X.C21427ALb.A00
            r2[r11] = r1
            X.ALc r1 = X.C21428ALc.A00
            java.util.ArrayList r3 = X.C165567td.A0c(r1, r2)
            java.lang.String[] r2 = new java.lang.String[r11]
            java.lang.String r1 = "UserSuccess|UserError"
            java.lang.Object r1 = r4.A0a(r5, r1, r3, r2)
            goto L_0x0157
        L_0x010c:
            r0.<init>()
            java.lang.String r1 = "notification"
            java.lang.String[] r17 = X.C203399nx.A0O(r5, r1)
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.Long r7 = X.C165567td.A0P()
            java.lang.Long r8 = X.C165567td.A0Q()
            r11 = 0
            java.lang.String r16 = "w:gp2"
            r18 = 0
            r12 = r5
            r14 = r7
            r15 = r8
            X.C203379ns.A03(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String[] r10 = X.C165617ti.A0l()
            java.lang.Class<X.147> r6 = X.AnonymousClass147.class
            r9 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            r0.A00 = r1
            java.lang.String r1 = "notify"
            java.lang.String[] r17 = new java.lang.String[]{r1}
            java.lang.Long r14 = X.C90474aD.A0Y()
            java.lang.Long r15 = X.C165607th.A0l()
            r16 = r9
            java.lang.Object r1 = X.C203539oF.A07(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            X.AM1 r1 = X.AM1.A00
            java.lang.Object r1 = X.C203539oF.A02(r5, r1, r11)
        L_0x0157:
            r0.A01 = r1
            goto L_0x0040
        L_0x015b:
            r0.<init>()
            java.lang.String r1 = "sale_price"
            X.C203399nx.A0A(r5, r1)
            java.lang.String r2 = "price"
            java.lang.String r1 = "#elementValue"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.lang.String r1 = X.C203379ns.A0B(r5, r1)
            r0.A02 = r1
            java.lang.String r1 = "start_date"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AQr r1 = X.C21573AQr.A00
            java.lang.Object r1 = X.C203379ns.A02(r5, r1, r2)
            r0.A01 = r1
            java.lang.String r1 = "end_date"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AQs r1 = X.C21574AQs.A00
            goto L_0x003a
        L_0x0189:
            r0.<init>()
            X.C203399nx.A09(r5)
            java.lang.String r2 = "reaction"
            java.lang.String r1 = "code"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Long r7 = X.C90474aD.A0Y()
            java.lang.Long r8 = X.C165577te.A0Z()
            r9 = 0
            r11 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "t"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Long r7 = X.C36411kG.A0t()
            java.lang.Long r8 = X.C165567td.A0Q()
            java.lang.Object r1 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            r0.A01 = r1
            java.lang.String[] r2 = X.C165607th.A1b(r5, r0, r2)
            X.APo r1 = X.C21544APo.A00
            java.lang.Object r1 = X.C203539oF.A05(r5, r1, r2)
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184958tH.<init>(X.9nx, int):void");
    }

    public C184958tH(C203399nx r26, C203399nx r27, int i) {
        String str;
        C203399nx r11 = r26;
        String[] A0O = C203399nx.A0O(r11, "iq");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        if (8 - i != 0) {
            str = "result";
        } else {
            str = "error";
        }
        C203379ns.A03(r11, cls, A0P, A0Q, str, A0O, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C203539oF r2 = C203379ns.A00;
        C203399nx r3 = r27;
        Long l = A0P;
        Long l2 = A0Q;
        this.A02 = (String) r2.A0Z(r11, cls, l, l2, r2.A0Z(r3, cls, A0P, A0Q, (Object) null, strArr2, false), strArr, true);
        C203399nx r18 = r11;
        this.A01 = C203539oF.A07(r18, UserJid.class, A0P, A0Q, (Object) null, new String[]{"to"}, false);
        Class<Jid> cls2 = Jid.class;
        Class<Jid> cls3 = cls2;
        this.A00 = C203539oF.A07(r11, cls3, l, l2, C203539oF.A07(r3, cls2, A0P, A0Q, (Object) null, new String[]{"to"}, false), C165617ti.A0l(), true);
        this.A00 = r11;
    }
}
