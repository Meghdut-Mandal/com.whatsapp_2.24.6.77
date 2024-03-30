package X;

import java.util.AbstractList;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.784  reason: invalid class name */
public class AnonymousClass784 implements C88284Sc {
    public final /* synthetic */ GetCredential A00;

    public AnonymousClass784(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0229, code lost:
        if (X.C90494aF.A0o(r5, r3).A00 != A00(r5, r3)) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        if (r0 == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0141, code lost:
        if (X.C90494aF.A0o(r3, r5).A00 != A00(r3, r5)) goto L_0x0261;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Azl(android.view.View r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = r0.A00
            r12 = 0
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r2 = r21
            r0.<init>(r12, r2)
            r1.dispatchKeyEvent(r0)
            r0 = 66
            if (r2 != r0) goto L_0x03ac
            org.npci.upi.security.pinactivitycomponent.s r2 = r1.A0F
            if (r2 == 0) goto L_0x045c
            org.npci.upi.security.pinactivitycomponent.w r2 = (org.npci.upi.security.pinactivitycomponent.w) r2
            android.content.Context r0 = r2.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.65O r0 = r0.A0D
            boolean r0 = r0.A00()
            r4 = 1
            if (r0 == 0) goto L_0x0159
            java.util.ArrayList r3 = r2.A04
            int r0 = r3.size()
            java.lang.String r6 = "AADHAAR"
            if (r0 != r4) goto L_0x007e
            int r0 = r2.A07
            java.lang.Object r0 = r3.get(r0)
            X.4Uu r0 = (X.C88984Uu) r0
            boolean r0 = r0.Azn()
            if (r0 == 0) goto L_0x040b
            int r0 = r2.A01     // Catch:{ Exception -> 0x045c }
            if (r0 >= 0) goto L_0x0063
            int r0 = r2.A07     // Catch:{ Exception -> 0x045c }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x045c }
            X.4Uu r3 = (X.C88984Uu) r3     // Catch:{ Exception -> 0x045c }
            r0 = r3
            X.4fl r0 = (X.C93104fl) r0     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = r0.A0F     // Catch:{ Exception -> 0x045c }
            boolean r1 = r0.equals(r6)     // Catch:{ Exception -> 0x045c }
            r0 = 2131896338(0x7f122812, float:1.9427534E38)
            if (r1 == 0) goto L_0x005b
            r0 = 2131896244(0x7f1227b4, float:1.9427344E38)
        L_0x005b:
            java.lang.String r0 = r2.A0n(r0)     // Catch:{ Exception -> 0x045c }
            r3.Azm(r0)     // Catch:{ Exception -> 0x045c }
            return
        L_0x0063:
            java.lang.Boolean r0 = r2.A0E     // Catch:{ Exception -> 0x045c }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x045c }
            if (r0 != 0) goto L_0x045c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x045c }
            r2.A0D = r0     // Catch:{ Exception -> 0x045c }
            android.view.View r1 = r2.A08     // Catch:{ Exception -> 0x045c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x045c }
            org.npci.upi.security.pinactivitycomponent.w.A03(r1, r0, r2)     // Catch:{ Exception -> 0x045c }
            org.npci.upi.security.pinactivitycomponent.w.A05(r2, r4)     // Catch:{ Exception -> 0x045c }
            return
        L_0x007e:
            int r5 = r3.size()
            r0 = 4
            r7 = 3
            r1 = 2
            if (r5 != r0) goto L_0x00af
            int r5 = r2.A07
            if (r5 == r4) goto L_0x0245
            if (r5 != r1) goto L_0x011a
            java.lang.Boolean r0 = r2.A0F
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x045c
        L_0x0095:
            X.4fl r0 = X.C90494aF.A0o(r3, r5)
            int r1 = r0.A00
            int r0 = A00(r3, r5)
            if (r1 == r0) goto L_0x023f
            int r0 = r2.A07
            r3.get(r0)
            r3 = 2131896541(0x7f1228dd, float:1.9427946E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r0 = r2.A06
            goto L_0x0237
        L_0x00af:
            int r0 = r3.size()
            if (r0 != r7) goto L_0x0148
            int r5 = r2.A07
            if (r5 != 0) goto L_0x00f0
            X.4fl r0 = X.C90494aF.A0o(r3, r5)
            int r1 = r0.A00
            int r0 = A00(r3, r5)
            if (r1 != r0) goto L_0x011d
            android.widget.ViewFlipper r1 = r2.A09
            int r0 = r2.A07
            int r0 = r0 + 1
            r1.setDisplayedChild(r0)
            int r0 = r2.A07
            int r0 = r0 + 1
            r2.A07 = r0
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x045c
            r2.A07 = r12
            android.content.Context r0 = r2.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.65O r0 = r0.A0D
            int r0 = r0.A00
            r2.A01 = r0
            int r0 = r2.A00
            X.4fl r0 = X.C90494aF.A0o(r3, r0)
            r2.A1b(r0)
            r0.A0I = r4
            return
        L_0x00f0:
            if (r5 != r4) goto L_0x0145
            java.lang.Boolean r0 = r2.A0F
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0095
            boolean r1 = r2.A06
            java.lang.Object r0 = r3.get(r5)
            if (r1 == 0) goto L_0x0133
            X.4fl r0 = (X.C93104fl) r0
            int r1 = r0.A00
            int r0 = A00(r3, r5)
            if (r1 != r0) goto L_0x011d
            android.widget.ViewFlipper r0 = r2.A09
            r0.showNext()
            int r0 = r2.A07
            int r0 = r0 + 1
            r2.A07 = r0
            r2.A06 = r12
            return
        L_0x011a:
            if (r5 != r7) goto L_0x045c
            goto L_0x0154
        L_0x011d:
            int r0 = r2.A07
            r3.get(r0)
            X.4fl r0 = X.C90494aF.A0o(r3, r0)
            java.lang.String r0 = r0.A0F
            boolean r0 = r0.equals(r6)
            r3 = 2131896540(0x7f1228dc, float:1.9427944E38)
            if (r0 != 0) goto L_0x0269
            goto L_0x0266
        L_0x0133:
            boolean r0 = r0 instanceof X.C93104fl
            if (r0 == 0) goto L_0x023f
            X.4fl r0 = X.C90494aF.A0o(r3, r5)
            int r1 = r0.A00
            int r0 = A00(r3, r5)
            if (r1 == r0) goto L_0x023f
            goto L_0x0261
        L_0x0145:
            if (r5 != r1) goto L_0x045c
            goto L_0x0154
        L_0x0148:
            int r0 = r3.size()
            if (r0 != r1) goto L_0x0159
            int r5 = r2.A07
            if (r5 == 0) goto L_0x0245
            if (r5 != r4) goto L_0x045c
        L_0x0154:
            java.lang.Object r0 = r3.get(r5)
            goto L_0x01be
        L_0x0159:
            java.util.ArrayList r5 = r2.A04
            int r0 = r5.size()
            boolean r3 = X.AnonymousClass000.A1S(r0, r4)
            X.65O r0 = r2.A0H
            org.json.JSONArray r0 = r0.A07
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.contains(r0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x01a4
            int r3 = r2.A07
            X.4fl r0 = X.C90494aF.A0o(r5, r3)
            int r1 = r0.A00
            int r0 = A00(r5, r3)
            if (r1 != r0) goto L_0x022b
            int r0 = r2.A07
            java.lang.Object r0 = r5.get(r0)
            X.4Uu r0 = (X.C88984Uu) r0
            boolean r0 = r0.Azn()
            if (r0 == 0) goto L_0x045c
            android.content.Context r0 = r2.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.6WQ r1 = r0.A0E
            java.lang.Object r0 = r5.get(r12)
            X.4Uu r0 = (X.C88984Uu) r0
            java.lang.String r0 = r0.getInputValue()
            r1.A05(r0)
            return
        L_0x01a4:
            int r0 = r5.size()
            int r3 = r2.A07
            if (r0 != r4) goto L_0x021d
            X.4fl r0 = X.C90494aF.A0o(r5, r3)
            int r1 = r0.A00
            int r0 = A00(r5, r3)
            if (r1 != r0) goto L_0x022b
            int r0 = r2.A07
            java.lang.Object r0 = r5.get(r0)
        L_0x01be:
            X.4Uu r0 = (X.C88984Uu) r0
            boolean r0 = r0.Azn()
            if (r0 == 0) goto L_0x045c
            int r3 = r2.A00
            r0 = -1
            if (r3 == r0) goto L_0x01f8
            java.util.ArrayList r1 = r2.A04
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x01d3
            int r3 = r3 + -1
        L_0x01d3:
            java.lang.Object r0 = r1.get(r3)
            boolean r0 = r0 instanceof X.C93104fl
            if (r0 == 0) goto L_0x01f8
            X.4fl r3 = X.C90494aF.A0o(r1, r3)
            java.lang.String r0 = r3.getInputValue()
            if (r0 == 0) goto L_0x01ed
            int r1 = r0.length()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x01f8
        L_0x01ed:
            r0 = 2131896677(0x7f122965, float:1.9428222E38)
            java.lang.String r0 = r2.A0n(r0)
        L_0x01f4:
            r2.A1Z(r0)
            return
        L_0x01f8:
            r5 = 0
        L_0x01f9:
            java.util.ArrayList r7 = r2.A04
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x0276
            java.lang.Object r0 = r7.get(r5)
            boolean r0 = r0 instanceof X.C93104fl
            if (r0 == 0) goto L_0x021a
            X.4fl r3 = X.C90494aF.A0o(r7, r5)
            java.lang.String r0 = r3.getInputValue()
            int r1 = r0.length()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x021a
            goto L_0x0230
        L_0x021a:
            int r5 = r5 + 1
            goto L_0x01f9
        L_0x021d:
            if (r3 != 0) goto L_0x026e
            X.4fl r0 = X.C90494aF.A0o(r5, r3)
            int r1 = r0.A00
            int r0 = A00(r5, r3)
            if (r1 == r0) goto L_0x023f
        L_0x022b:
            int r0 = r2.A07
            r5.get(r0)
        L_0x0230:
            r3 = 2131896546(0x7f1228e2, float:1.9427956E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r0 = r2.A04
        L_0x0237:
            X.AnonymousClass000.A1L(r1, r0, r12)
            java.lang.String r0 = r2.A0o(r3, r1)
            goto L_0x01f4
        L_0x023f:
            android.widget.ViewFlipper r0 = r2.A09
            r0.showNext()
            goto L_0x025a
        L_0x0245:
            X.4fl r0 = X.C90494aF.A0o(r3, r5)
            int r1 = r0.A00
            int r0 = A00(r3, r5)
            if (r1 != r0) goto L_0x0261
            android.widget.ViewFlipper r1 = r2.A09
            int r0 = r2.A07
            int r0 = r0 + 1
            r1.setDisplayedChild(r0)
        L_0x025a:
            int r0 = r2.A07
            int r0 = r0 + 1
            r2.A07 = r0
            return
        L_0x0261:
            int r0 = r2.A07
            r3.get(r0)
        L_0x0266:
            r3 = 2131896542(0x7f1228de, float:1.9427948E38)
        L_0x0269:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r0 = r2.A05
            goto L_0x0237
        L_0x026e:
            if (r3 != r4) goto L_0x045c
            java.lang.Object r0 = r5.get(r3)
            goto L_0x01be
        L_0x0276:
            boolean r0 = r2.A0I
            if (r0 != 0) goto L_0x045c
            r2.A0I = r4
            r6 = 0
        L_0x027d:
            int r0 = r7.size()
            if (r6 >= r0) goto L_0x0342
            java.lang.Object r0 = r7.get(r6)     // Catch:{ Exception -> 0x033e }
            X.4Uu r0 = (X.C88984Uu) r0     // Catch:{ Exception -> 0x033e }
            java.lang.Object r1 = r0.getFormDataTag()     // Catch:{ Exception -> 0x033e }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x033e }
            java.lang.String r0 = "type"
            java.lang.String r16 = r1.getString(r0)     // Catch:{ Exception -> 0x033e }
            java.lang.String r0 = "subtype"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ Exception -> 0x033e }
            X.65O r0 = r2.A0H     // Catch:{ Exception -> 0x033e }
            org.json.JSONObject r3 = r0.A0C     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = "credential"
            java.lang.Object r0 = r7.get(r6)     // Catch:{ Exception -> 0x033e }
            X.4Uu r0 = (X.C88984Uu) r0     // Catch:{ Exception -> 0x033e }
            java.lang.String r0 = r0.getInputValue()     // Catch:{ Exception -> 0x033e }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x033e }
            X.65O r0 = r2.A0H     // Catch:{ Exception -> 0x033e }
            org.json.JSONObject r9 = r0.A0C     // Catch:{ Exception -> 0x033e }
            org.json.JSONArray r8 = X.C90524aI.A0u()     // Catch:{ Exception -> 0x033e }
            r3 = 0
        L_0x02b7:
            X.65O r0 = r2.A0H     // Catch:{ Exception -> 0x033e }
            org.json.JSONArray r0 = r0.A09     // Catch:{ Exception -> 0x033e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x033e }
            if (r3 >= r0) goto L_0x032d
            java.lang.String r1 = "txnId"
            X.65O r0 = r2.A0H     // Catch:{ Exception -> 0x033e }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x033e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x033e }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = "credType"
            X.65O r0 = r2.A0H     // Catch:{ Exception -> 0x033e }
            org.json.JSONArray r0 = r0.A09     // Catch:{ Exception -> 0x033e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x033e }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x033e }
            android.content.Context r0 = r2.A02     // Catch:{ Exception -> 0x033e }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033e }
            X.65O r0 = r0.A0D     // Catch:{ Exception -> 0x033e }
            X.684 r0 = r0.A0E     // Catch:{ Exception -> 0x033e }
            X.62L r0 = r0.A02     // Catch:{ Exception -> 0x033e }
            java.lang.String r0 = r0.A00(r9)     // Catch:{ Exception -> 0x033e }
            r8.put(r0)     // Catch:{ Exception -> 0x033e }
            android.content.Context r0 = r2.A02     // Catch:{ Exception -> 0x033e }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033e }
            X.65O r0 = r0.A0D     // Catch:{ Exception -> 0x033e }
            X.684 r0 = r0.A0E     // Catch:{ Exception -> 0x033e }
            X.672 r13 = r0.A01()     // Catch:{ Exception -> 0x033e }
            java.lang.String r15 = r8.getString(r3)     // Catch:{ Exception -> 0x033e }
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x033e }
            r18 = r9
            r17 = r5
            X.72D r0 = r13.A00(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x033e }
            r2.A0A = r0     // Catch:{ Exception -> 0x033e }
            if (r0 == 0) goto L_0x032a
            android.content.Context r0 = r2.A02     // Catch:{ Exception -> 0x033e }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033e }
            X.65O r11 = r0.A0D     // Catch:{ Exception -> 0x033e }
            X.65O r0 = r2.A0H     // Catch:{ Exception -> 0x033e }
            org.json.JSONArray r0 = r0.A09     // Catch:{ Exception -> 0x033e }
            java.lang.String r10 = r0.getString(r3)     // Catch:{ Exception -> 0x033e }
            X.72D r1 = r2.A0A     // Catch:{ Exception -> 0x033e }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x033e }
            X.C112065dI.A00(r1, r0)     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x033e }
            org.json.JSONObject r0 = r11.A0D     // Catch:{ Exception -> 0x033e }
            r0.put(r10, r1)     // Catch:{ Exception -> 0x033e }
        L_0x032a:
            int r3 = r3 + 1
            goto L_0x02b7
        L_0x032d:
            android.content.Context r0 = r2.A02     // Catch:{ Exception -> 0x033e }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033e }
            X.65O r3 = r0.A0D     // Catch:{ Exception -> 0x033e }
            org.json.JSONObject r0 = r3.A0D     // Catch:{ Exception -> 0x033e }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x033e }
            java.util.HashMap r0 = r3.A06     // Catch:{ Exception -> 0x033e }
            r0.put(r5, r1)     // Catch:{ Exception -> 0x033e }
        L_0x033e:
            int r6 = r6 + 1
            goto L_0x027d
        L_0x0342:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            X.65O r0 = r2.A0H
            org.json.JSONObject r3 = r0.A0B
            if (r3 == 0) goto L_0x035c
            java.lang.String r1 = "getDeviceDetails"
            java.lang.String r0 = "false"
            java.lang.String r0 = r3.optString(r1, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x035c:
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x038e
            android.content.Context r1 = r2.A02
            X.6MN r0 = new X.6MN
            r0.<init>(r1)
            java.lang.String r3 = r0.A01()
            X.65O r0 = r2.A0H
            org.json.JSONObject r1 = r0.A0C
            android.content.Context r0 = r2.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.65O r0 = r0.A0D
            X.684 r0 = r0.A0E
            X.672 r0 = r0.A01()
            java.lang.String r3 = r0.A01(r3, r1)
            android.content.Context r0 = r2.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.65O r0 = r0.A0D
            java.lang.String r1 = "det"
            java.util.HashMap r0 = r0.A06
            r0.put(r1, r3)
        L_0x038e:
            android.os.Bundle r3 = X.AnonymousClass001.A07()
            android.content.Context r0 = r2.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.65O r0 = r0.A0D
            java.util.HashMap r1 = r0.A06
            java.lang.String r0 = "credBlocks"
            r3.putSerializable(r0, r1)
            android.os.ResultReceiver r0 = X.C124765yl.A0B
            r0.send(r4, r3)
            X.01I r0 = r2.A0h()
            r0.finish()
            return
        L_0x03ac:
            r0 = 67
            if (r2 != r0) goto L_0x045c
            org.npci.upi.security.pinactivitycomponent.s r3 = r1.A0F
            org.npci.upi.security.pinactivitycomponent.w r3 = (org.npci.upi.security.pinactivitycomponent.w) r3
            java.lang.Boolean r0 = r3.A0B
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x045c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r3.A0B = r0
            X.01I r2 = r3.A0h()
            r1 = 24
            X.74f r0 = new X.74f
            r0.<init>(r3, r1)
            r2.runOnUiThread(r0)
            java.util.ArrayList r2 = r3.A04
            boolean r1 = r3.A06
            int r0 = r3.A00
            if (r1 == 0) goto L_0x03da
            int r0 = r0 + -1
        L_0x03da:
            android.view.View r0 = X.AnonymousClass000.A0Z(r2, r0)
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0408
            boolean r1 = r3.A06
            int r0 = r3.A00
            if (r1 == 0) goto L_0x03ec
            int r0 = r0 + -1
        L_0x03ec:
            X.4fl r2 = X.C90494aF.A0o(r2, r0)
            X.01I r1 = r3.A0h()
            r0 = 2131232846(0x7f08084e, float:1.8081813E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r1, r0)
            if (r1 == 0) goto L_0x0402
            android.widget.ImageView r0 = r2.A05
            r0.setImageDrawable(r1)
        L_0x0402:
            android.widget.ImageView r0 = r2.A05
            r2.A00(r0, r12)
            return
        L_0x0408:
            int r0 = r3.A00
            goto L_0x03ec
        L_0x040b:
            int r0 = r2.A07
            java.lang.Object r8 = r3.get(r0)
            X.4Uu r8 = (X.C88984Uu) r8
            X.01I r1 = r2.A0h()
            r0 = 2131232230(0x7f0805e6, float:1.8080563E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00E.A00(r1, r0)
            X.01I r1 = r2.A0h()
            r0 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.graphics.drawable.Drawable r16 = X.AnonymousClass00E.A00(r1, r0)
            X.01I r1 = r2.A0h()
            r0 = 2131231142(0x7f0801a6, float:1.8078357E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass00E.A00(r1, r0)
            X.01I r3 = r2.A0h()
            android.content.Context r0 = r2.A02
            X.4fl r1 = new X.4fl
            r1.<init>(r3, r0)
            r18 = 12
            X.3YT r10 = new X.3YT
            r13 = r10
            r14 = r8
            r15 = r9
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 2131896522(0x7f1228ca, float:1.9427908E38)
            java.lang.String r11 = r2.A0n(r0)
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x045d
            r9 = r4
        L_0x0457:
            r13 = 1
            r14 = 1
            r8.Azo(r9, r10, r11, r12, r13, r14)
        L_0x045c:
            return
        L_0x045d:
            boolean r0 = r8.getToggleCheckBox()
            if (r0 != 0) goto L_0x0457
            r9 = r16
            goto L_0x0457
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass784.Azl(android.view.View, int):void");
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((C88984Uu) abstractList.get(i)).getInputValue().length();
    }
}
