package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass00E;
import X.AnonymousClass65O;
import X.AnonymousClass66Z;
import X.AnonymousClass72D;
import X.AnonymousClass7dR;
import X.C1501674f;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C66983Yb;
import X.C88984Uu;
import X.C90494aF;
import X.C93104fl;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import com.whatsapp.R;
import java.util.ArrayList;

public class w extends s implements AnonymousClass7dR {
    public LinearLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03 = null;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = 0;
    public View A08 = null;
    public ViewFlipper A09 = null;
    public AnonymousClass72D A0A;
    public Boolean A0B = false;
    public Boolean A0C = false;
    public Boolean A0D = false;
    public Boolean A0E = false;
    public Boolean A0F = false;
    public String A0G = "";
    public AnonymousClass65O A0H;
    public boolean A0I = false;
    public boolean A0J = false;

    /* JADX WARNING: Can't wrap try/catch for region: R(19:7|8|9|10|11|12|13|14|(2:17|15)|33|18|19|20|(1:22)(1:23)|24|25|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0125 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e A[Catch:{  }, LOOP:0: B:15:0x0094->B:17:0x009e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c4 A[Catch:{ Exception -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c6 A[Catch:{ Exception -> 0x0125 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r16, android.view.View r17) {
        /*
            r15 = this;
            r7 = r15
            r0 = r17
            r15.A08 = r0
            r1 = r16
            super.A1S(r1, r0)
            android.content.Context r1 = r15.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.65O r1 = r1.A0D
            r15.A0H = r1
            r1 = 2131431362(0x7f0b0fc2, float:1.8484451E38)
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r0, r1)
            r15.A01 = r1
            r1 = 2131431363(0x7f0b0fc3, float:1.8484453E38)
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r0, r1)
            r15.A00 = r1
            r1 = 2131433017(0x7f0b1639, float:1.8487808E38)
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r0, r1)
            r15.A02 = r1
            r1 = 2131433019(0x7f0b163b, float:1.8487812E38)
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r0, r1)
            r15.A03 = r1
            android.content.Context r1 = r15.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.65O r1 = r1.A0D
            java.lang.Boolean r1 = r1.A02
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x004a
            java.lang.Boolean r1 = X.C36371kC.A0m()
            r15.A0C = r1
        L_0x004a:
            r1 = 2131435179(0x7f0b1eab, float:1.8492193E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ViewFlipper r1 = (android.widget.ViewFlipper) r1
            r15.A09 = r1
            X.65O r1 = r15.A0H
            boolean r1 = r1.A00()
            r12 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            if (r1 == 0) goto L_0x015b
            android.content.Context r1 = r15.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.65O r1 = r1.A0D
            boolean r1 = r1.A0H
            if (r1 == 0) goto L_0x015b
            org.json.JSONArray r4 = X.C90524aI.A0u()
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{  }
            java.lang.String r2 = "type"
            java.lang.String r1 = "CARD"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = "subtype"
            java.lang.String r1 = "CARDDETAILS"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = "dType"
            java.lang.String r1 = "NUM"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = "dLength"
            java.lang.String r1 = "6"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            r4.put(r12, r3)     // Catch:{  }
            r3 = 0
        L_0x0094:
            X.65O r1 = r15.A0H     // Catch:{  }
            org.json.JSONArray r1 = r1.A07     // Catch:{  }
            int r1 = r1.length()     // Catch:{  }
            if (r3 >= r1) goto L_0x00ad
            int r2 = r3 + 1
            X.65O r1 = r15.A0H     // Catch:{  }
            org.json.JSONArray r1 = r1.A07     // Catch:{  }
            java.lang.Object r1 = r1.get(r3)     // Catch:{  }
            r4.put(r2, r1)     // Catch:{  }
            r3 = r2
            goto L_0x0094
        L_0x00ad:
            X.65O r1 = r15.A0H     // Catch:{  }
            r1.A07 = r4     // Catch:{  }
            java.lang.String r2 = "dLength"
            r6 = 1
            org.json.JSONObject r4 = r4.getJSONObject(r12)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r1 = "subtype"
            java.lang.String r11 = r4.getString(r1)     // Catch:{ Exception -> 0x0125 }
            int r1 = r4.optInt(r2)     // Catch:{ Exception -> 0x0125 }
            if (r1 != 0) goto L_0x00c6
            r13 = 6
            goto L_0x00ca
        L_0x00c6:
            int r13 = r4.optInt(r2)     // Catch:{ Exception -> 0x0125 }
        L_0x00ca:
            r5 = 2131896392(0x7f122848, float:1.9427644E38)
            java.lang.Object[] r3 = X.AnonymousClass001.A0M()     // Catch:{ Exception -> 0x0125 }
            X.65O r2 = r15.A0H     // Catch:{ Exception -> 0x0125 }
            java.lang.String r1 = r2.A05     // Catch:{ Exception -> 0x0125 }
            r3[r12] = r1     // Catch:{ Exception -> 0x0125 }
            java.lang.String r1 = r2.A04     // Catch:{ Exception -> 0x0125 }
            java.lang.String r1 = X.C36401kF.A0q(r15, r1, r3, r6, r5)     // Catch:{ Exception -> 0x0125 }
            r15.A0G = r1     // Catch:{ Exception -> 0x0125 }
            r1 = 2131896393(0x7f122849, float:1.9427646E38)
            java.lang.String r9 = r15.A0n(r1)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r10 = r15.A0G     // Catch:{ Exception -> 0x0125 }
            java.lang.Boolean r8 = r15.A0C     // Catch:{ Exception -> 0x0125 }
            X.4fl r2 = r7.A1Y(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0125 }
            r1 = 2131896391(0x7f122847, float:1.9427642E38)
            java.lang.String r9 = r15.A0n(r1)     // Catch:{ Exception -> 0x0125 }
            r13 = 4
            java.lang.String r10 = r15.A0G     // Catch:{ Exception -> 0x0125 }
            java.lang.Boolean r8 = r15.A0C     // Catch:{ Exception -> 0x0125 }
            X.4fl r1 = r7.A1Y(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0125 }
            java.util.ArrayList r3 = X.C90484aE.A0r(r2)     // Catch:{ Exception -> 0x0125 }
            r3.add(r1)     // Catch:{ Exception -> 0x0125 }
            X.01I r1 = r15.A0h()     // Catch:{ Exception -> 0x0125 }
            X.4fC r2 = new X.4fC     // Catch:{ Exception -> 0x0125 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0125 }
            r2.A00(r3, r15)     // Catch:{ Exception -> 0x0125 }
            r2.A02 = r4     // Catch:{ Exception -> 0x0125 }
            java.util.ArrayList r1 = r15.A04     // Catch:{ Exception -> 0x0125 }
            r1.add(r2)     // Catch:{ Exception -> 0x0125 }
            r1 = 2131429403(0x7f0b081b, float:1.8480478E38)
            r15.A00(r1, r12)     // Catch:{ Exception -> 0x0125 }
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r0, r1)     // Catch:{ Exception -> 0x0125 }
            r1.addView(r2)     // Catch:{ Exception -> 0x0125 }
        L_0x0125:
            java.util.ArrayList r1 = r15.A04     // Catch:{  }
            java.lang.Object r8 = r1.get(r12)     // Catch:{  }
            X.4Uu r8 = (X.C88984Uu) r8     // Catch:{  }
            X.01I r2 = r15.A0h()     // Catch:{  }
            r1 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass00E.A00(r2, r1)     // Catch:{  }
            X.01I r2 = r15.A0h()     // Catch:{  }
            r1 = 2131231142(0x7f0801a6, float:1.8078357E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00E.A00(r2, r1)     // Catch:{  }
            r6 = 13
            X.3YT r10 = new X.3YT     // Catch:{  }
            r1 = r10
            r2 = r8
            r4 = r9
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{  }
            r1 = 2131896522(0x7f1228ca, float:1.9427908E38)
            java.lang.String r11 = r15.A0n(r1)     // Catch:{ JSONException -> 0x0161 }
            r13 = 1
            r14 = 1
            r8.Azo(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x0161
        L_0x015b:
            A03(r0, r2, r15)
            A05(r15, r12)
        L_0x0161:
            r1 = 2
            java.util.ArrayList r0 = r0.getFocusables(r1)
            android.view.View r0 = X.AnonymousClass000.A0Z(r0, r12)
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.w.A1S(android.os.Bundle, android.view.View):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.4fC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.4fl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v173, resolved type: X.4fC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v174, resolved type: X.4fC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v175, resolved type: X.4fC} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0253, code lost:
        r15 = r5.optString("value", r15);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03d1 A[Catch:{ Exception -> 0x04ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x049f A[Catch:{ Exception -> 0x04ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e5 A[Catch:{ Exception -> 0x04ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.view.View r27, java.lang.Integer r28, org.npci.upi.security.pinactivitycomponent.w r29) {
        /*
            java.lang.String r19 = "mobileNumber"
            java.lang.String r18 = "dLength"
            java.lang.String r17 = "subtype"
            java.lang.String r16 = "MPIN"
            r3 = r29
            X.65O r0 = r3.A0H
            org.json.JSONArray r0 = r0.A07
            if (r0 == 0) goto L_0x04d1
            int r2 = r28.intValue()
        L_0x0014:
            X.65O r0 = r3.A0H
            org.json.JSONArray r0 = r0.A07
            int r0 = r0.length()
            r6 = 0
            r5 = 1
            if (r2 >= r0) goto L_0x04b1
            X.65O r0 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r0 = r0.A07     // Catch:{ Exception -> 0x04ad }
            org.json.JSONObject r4 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x04ad }
            r0 = r17
            java.lang.String r1 = r4.getString(r0)     // Catch:{ Exception -> 0x04ad }
            r0 = r18
            int r7 = r4.optInt(r0)     // Catch:{ Exception -> 0x04ad }
            r0 = 6
            if (r7 == 0) goto L_0x003d
            r0 = r18
            int r0 = r4.optInt(r0)     // Catch:{ Exception -> 0x04ad }
        L_0x003d:
            java.lang.String r7 = "securePinUrl"
            boolean r7 = r4.has(r7)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r13 = "ATMPIN"
            if (r7 != 0) goto L_0x008b
            boolean r7 = r13.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r7 == 0) goto L_0x008b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0F = r7     // Catch:{ Exception -> 0x04ad }
            r7 = 2131896875(0x7f122a2b, float:1.9428624E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04ad }
            X.AnonymousClass000.A1L(r5, r0, r6)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = r3.A0o(r7, r5)     // Catch:{ Exception -> 0x04ad }
            r5 = 2131896524(0x7f1228cc, float:1.9427912E38)
            java.lang.String r9 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04ad }
            r6 = r3
            r7 = r5
            r10 = r1
            r11 = r2
            r12 = r0
            X.4fl r5 = r6.A1Y(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x04ad }
            r5.A0C = r4     // Catch:{ Exception -> 0x04ad }
            java.util.ArrayList r1 = r3.A04     // Catch:{ Exception -> 0x04ad }
            r1.add(r5)     // Catch:{ Exception -> 0x04ad }
            r4 = 2131434524(0x7f0b1c1c, float:1.8490864E38)
            r3.A00(r4, r2)     // Catch:{ Exception -> 0x04ad }
            r1 = r27
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r1, r4)     // Catch:{ Exception -> 0x04ad }
            r1.addView(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A06 = r0     // Catch:{ Exception -> 0x04ad }
            goto L_0x04ad
        L_0x008b:
            r5 = r16
            boolean r21 = r1.equals(r5)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r20 = "SIGNATURE"
            java.lang.String r12 = "TOTP"
            java.lang.String r11 = "HOTP"
            java.lang.String r10 = "EMAIL"
            java.lang.String r9 = "SMS"
            java.lang.String r8 = "OTP"
            java.lang.String r7 = "AADHAAR"
            java.lang.String r14 = "NMPIN"
            if (r21 != 0) goto L_0x00e3
            boolean r5 = r1.equals(r14)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r13.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r8.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r9.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r11.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r12.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r7.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            java.lang.String r5 = "CARDDETAILS"
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00e3
            r5 = r20
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x04ad
        L_0x00e3:
            boolean r5 = r1.equals(r14)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x00f3
            if (r21 == 0) goto L_0x019c
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r5.A00()     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x019c
        L_0x00f3:
            r5 = 2131896527(0x7f1228cf, float:1.9427918E38)
            java.lang.String r5 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r5     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r3.A0J     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x0164
            r7 = 2131896880(0x7f122a30, float:1.9428634E38)
            r9 = 1
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x04ad }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r22 = X.C36401kF.A0q(r3, r8, r5, r6, r7)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x04ad }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04ad }
            r20 = r3
            r21 = r5
            r23 = r7
            r24 = r1
            r25 = r2
            r26 = r0
            X.4fl r10 = r20.A1Y(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x04ad }
            r7 = 2131896878(0x7f122a2e, float:1.942863E38)
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x04ad }
            java.lang.String r22 = X.C36401kF.A0q(r3, r8, r5, r6, r7)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x04ad }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04ad }
            r21 = r5
            r23 = r7
            X.4fl r0 = r20.A1Y(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x04ad }
            r3.A0J = r6     // Catch:{ Exception -> 0x04ad }
        L_0x0139:
            java.util.ArrayList r1 = X.C90484aE.A0r(r10)     // Catch:{ Exception -> 0x04ad }
            r1.add(r0)     // Catch:{ Exception -> 0x04ad }
            X.01I r0 = r3.A0h()     // Catch:{ Exception -> 0x04ad }
            X.4fC r5 = new X.4fC     // Catch:{ Exception -> 0x04ad }
            r5.<init>(r0)     // Catch:{ Exception -> 0x04ad }
            r5.A00(r1, r3)     // Catch:{ Exception -> 0x04ad }
            r5.A02 = r4     // Catch:{ Exception -> 0x04ad }
            java.util.ArrayList r0 = r3.A04     // Catch:{ Exception -> 0x04ad }
            r0.add(r5)     // Catch:{ Exception -> 0x04ad }
            r1 = 2131434523(0x7f0b1c1b, float:1.8490862E38)
            r3.A00(r1, r2)     // Catch:{ Exception -> 0x04ad }
            r0 = r27
            android.widget.LinearLayout r0 = X.C36441kJ.A0U(r0, r1)     // Catch:{ Exception -> 0x04ad }
        L_0x015f:
            r0.addView(r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x04ad
        L_0x0164:
            r9 = 1
            r7 = 2131896883(0x7f122a33, float:1.942864E38)
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x04ad }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r22 = X.C36401kF.A0q(r3, r8, r5, r6, r7)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x04ad }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04ad }
            r20 = r3
            r21 = r5
            r23 = r7
            r24 = r1
            r25 = r2
            r26 = r0
            X.4fl r10 = r20.A1Y(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x04ad }
            r7 = 2131896877(0x7f122a2d, float:1.9428628E38)
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x04ad }
            java.lang.String r22 = X.C36401kF.A0q(r3, r8, r5, r6, r7)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r6 = r3.A0G     // Catch:{ Exception -> 0x04ad }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04ad }
            r21 = r5
            r23 = r6
            X.4fl r0 = r20.A1Y(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x04ad }
            goto L_0x0139
        L_0x019c:
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A07     // Catch:{ Exception -> 0x04ad }
            int r6 = r5.length()     // Catch:{ Exception -> 0x04ad }
            java.lang.String r15 = ""
            r5 = 1
            if (r6 <= r5) goto L_0x01c9
            if (r21 == 0) goto L_0x01c9
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A07     // Catch:{ Exception -> 0x04ad }
            r6 = r5
            int r5 = r2 + 1
            org.json.JSONObject r5 = r6.getJSONObject(r5)     // Catch:{ Exception -> 0x04ad }
            r6 = r17
            java.lang.String r5 = r5.getString(r6)     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r5.equals(r14)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x01c9
            r5 = 1
            r3.A0J = r5     // Catch:{ Exception -> 0x04ad }
            r6 = 2131896881(0x7f122a31, float:1.9428636E38)
            goto L_0x01cb
        L_0x01c9:
            r6 = r15
            goto L_0x01df
        L_0x01cb:
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04ad }
            X.AnonymousClass000.A1J(r5, r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r6 = r3.A0o(r6, r5)     // Catch:{ Exception -> 0x04ad }
            r5 = 2131896527(0x7f1228cf, float:1.9427918E38)
            java.lang.String r5 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r5     // Catch:{ Exception -> 0x04ad }
            r3.A04 = r0     // Catch:{ Exception -> 0x04ad }
        L_0x01df:
            boolean r5 = r6.equals(r15)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x03b5
            if (r21 == 0) goto L_0x0381
            r6 = 2131896879(0x7f122a2f, float:1.9428632E38)
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()     // Catch:{ Exception -> 0x04ad }
            X.AnonymousClass000.A1J(r5, r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r6 = r3.A0o(r6, r5)     // Catch:{ Exception -> 0x04ad }
            X.65O r9 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONObject r8 = r9.A0C     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "credType"
            org.json.JSONArray r5 = r8.getJSONArray(r5)     // Catch:{ Exception -> 0x04ad }
            r9.A09 = r5     // Catch:{ Exception -> 0x04ad }
            java.lang.String r10 = "mandate"
            r9 = r10
            r8 = 0
        L_0x0205:
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            int r5 = r5.length()     // Catch:{ Exception -> 0x04ad }
            java.lang.String r13 = "value"
            java.lang.String r12 = "name"
            if (r8 >= r5) goto L_0x022e
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.String r11 = X.C90474aD.A0d(r12, r5, r8)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "mandateSubType"
            boolean r5 = r11.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x022b
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.String r9 = X.C90474aD.A0d(r13, r5, r8)     // Catch:{ Exception -> 0x04ad }
        L_0x022b:
            int r8 = r8 + 1
            goto L_0x0205
        L_0x022e:
            r11 = 0
        L_0x022f:
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            int r5 = r5.length()     // Catch:{ Exception -> 0x04ad }
            if (r11 >= r5) goto L_0x0291
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = X.C90474aD.A0d(r12, r5, r11)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "payeeName"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x0258
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.Object r5 = r5.get(r11)     // Catch:{ Exception -> 0x04ad }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x04ad }
        L_0x0253:
            java.lang.String r15 = r5.optString(r13, r15)     // Catch:{ Exception -> 0x04ad }
            goto L_0x0291
        L_0x0258:
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = X.C90474aD.A0d(r12, r5, r11)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "account"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x0273
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.Object r5 = r5.get(r11)     // Catch:{ Exception -> 0x04ad }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x04ad }
            goto L_0x0253
        L_0x0273:
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = X.C90474aD.A0d(r12, r5, r11)     // Catch:{ Exception -> 0x04ad }
            r5 = r19
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x028e
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r8 = r5.A08     // Catch:{ Exception -> 0x04ad }
            r5 = r19
            java.lang.String r15 = X.C90474aD.A0d(r5, r8, r11)     // Catch:{ Exception -> 0x04ad }
            goto L_0x0291
        L_0x028e:
            int r11 = r11 + 1
            goto L_0x022f
        L_0x0291:
            r11 = 0
        L_0x0292:
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04ad }
            int r5 = r5.length()     // Catch:{ Exception -> 0x04ad }
            if (r11 >= r5) goto L_0x037e
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = r5.getString(r11)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "pay"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x0371
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = r5.getString(r11)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "collect"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x0371
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r5.getString(r11)     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x0371
            X.65O r5 = r3.A0H     // Catch:{ Exception -> 0x04ad }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r5.getString(r11)     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x0368
            int r5 = r9.hashCode()     // Catch:{ Exception -> 0x04ad }
            switch(r5) {
                case -1352294148: goto L_0x0354;
                case -1068795718: goto L_0x02f0;
                case -934343034: goto L_0x032c;
                case -690213213: goto L_0x0318;
                case -280604931: goto L_0x0340;
                case 106440182: goto L_0x0304;
                default: goto L_0x02df;
            }     // Catch:{ Exception -> 0x04ad }
        L_0x02df:
            r5 = 1
            r8 = 2131896530(0x7f1228d2, float:1.9427924E38)
            java.lang.Object[] r5 = X.C36431kI.A1Z(r15, r5)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
        L_0x02eb:
            r3.A0G = r5     // Catch:{ Exception -> 0x04ad }
            int r11 = r11 + 1
            goto L_0x0292
        L_0x02f0:
            java.lang.String r5 = "modify"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x02df
            r8 = 2131896532(0x7f1228d4, float:1.9427928E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x0304:
            java.lang.String r5 = "pause"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x02df
            r8 = 2131896533(0x7f1228d5, float:1.942793E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x0318:
            java.lang.String r5 = "register"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x02df
            r8 = 2131896534(0x7f1228d6, float:1.9427932E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x032c:
            java.lang.String r5 = "revoke"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x02df
            r8 = 2131896535(0x7f1228d7, float:1.9427934E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x0340:
            java.lang.String r5 = "unpause"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x02df
            r8 = 2131896536(0x7f1228d8, float:1.9427936E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x0354:
            java.lang.String r5 = "create"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x02df
            r8 = 2131896531(0x7f1228d3, float:1.9427926E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x0368:
            r5 = 2131896527(0x7f1228cf, float:1.9427918E38)
            java.lang.String r5 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            goto L_0x02eb
        L_0x0371:
            r8 = 2131896529(0x7f1228d1, float:1.9427922E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r15)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r3.A0o(r8, r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r5     // Catch:{ Exception -> 0x04ad }
        L_0x037e:
            r3.A04 = r0     // Catch:{ Exception -> 0x04ad }
            goto L_0x03b5
        L_0x0381:
            boolean r5 = r8.equals(r1)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r8 = " "
            if (r5 != 0) goto L_0x03df
            boolean r5 = r9.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x03df
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x03df
            boolean r5 = r11.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x03df
            boolean r5 = r12.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x03df
            boolean r5 = r13.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x0424
            r6 = 2131896875(0x7f122a2b, float:1.9428624E38)
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()     // Catch:{ Exception -> 0x04ad }
            X.AnonymousClass000.A1J(r5, r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r6 = r3.A0o(r6, r5)     // Catch:{ Exception -> 0x04ad }
        L_0x03b5:
            java.lang.String r8 = r3.A0G     // Catch:{ Exception -> 0x04ad }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04ad }
            r9 = r3
            r10 = r5
            r11 = r6
            r12 = r8
            r13 = r1
            r14 = r2
            r15 = r0
            X.4fl r5 = r9.A1Y(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x04ad }
            r5.A0C = r4     // Catch:{ Exception -> 0x04ad }
            java.util.ArrayList r0 = r3.A04     // Catch:{ Exception -> 0x04ad }
            r0.add(r5)     // Catch:{ Exception -> 0x04ad }
            boolean r0 = r7.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r0 == 0) goto L_0x049f
            r1 = 2131434524(0x7f0b1c1c, float:1.8490864E38)
            r3.A00(r1, r2)     // Catch:{ Exception -> 0x04ad }
            r0 = r27
            android.widget.LinearLayout r0 = X.C36441kJ.A0U(r0, r1)     // Catch:{ Exception -> 0x04ad }
            goto L_0x015f
        L_0x03df:
            r6 = 2131896876(0x7f122a2c, float:1.9428626E38)
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()     // Catch:{ Exception -> 0x04ad }
            X.AnonymousClass000.A1J(r5, r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r6 = r3.A0o(r6, r5)     // Catch:{ Exception -> 0x04ad }
            r5 = 2131896525(0x7f1228cd, float:1.9427914E38)
            java.lang.String r9 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r9     // Catch:{ Exception -> 0x04ad }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0v(r8)     // Catch:{ Exception -> 0x04ad }
            r5 = 2131896337(0x7f122811, float:1.9427532E38)
            java.lang.String r5 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = X.AnonymousClass000.A0q(r5, r8)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r9.concat(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r5     // Catch:{ Exception -> 0x04ad }
            r3.A00 = r2     // Catch:{ Exception -> 0x04ad }
            r3.A05 = r0     // Catch:{ Exception -> 0x04ad }
            X.01I r8 = r3.A0h()     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x03b5
            org.npci.upi.security.pinactivitycomponent.GetCredential r8 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r8     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "android.permission.READ_SMS"
            int r5 = r8.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x03b5
            int r9 = r3.A05     // Catch:{ Exception -> 0x04ad }
            goto L_0x046d
        L_0x0424:
            boolean r5 = r7.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x0496
            r5 = 1
            r3.A06 = r5     // Catch:{ Exception -> 0x04ad }
            r6 = 2131896874(0x7f122a2a, float:1.9428622E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04ad }
            X.AnonymousClass000.A1J(r5, r0)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r6 = r3.A0o(r6, r5)     // Catch:{ Exception -> 0x04ad }
            r5 = 2131896523(0x7f1228cb, float:1.942791E38)
            java.lang.String r9 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r9     // Catch:{ Exception -> 0x04ad }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0v(r8)     // Catch:{ Exception -> 0x04ad }
            r5 = 2131896243(0x7f1227b3, float:1.9427342E38)
            java.lang.String r5 = r3.A0n(r5)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = X.AnonymousClass000.A0q(r5, r8)     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = r9.concat(r5)     // Catch:{ Exception -> 0x04ad }
            r3.A0G = r5     // Catch:{ Exception -> 0x04ad }
            r3.A05 = r0     // Catch:{ Exception -> 0x04ad }
            X.01I r8 = r3.A0h()     // Catch:{ Exception -> 0x04ad }
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x03b5
            org.npci.upi.security.pinactivitycomponent.GetCredential r8 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r8     // Catch:{ Exception -> 0x04ad }
            java.lang.String r5 = "android.permission.READ_SMS"
            int r5 = r8.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x04ad }
            if (r5 != 0) goto L_0x03b5
            int r9 = r3.A05     // Catch:{ Exception -> 0x04ad }
        L_0x046d:
            X.01I r8 = r3.A0h()     // Catch:{ Exception -> 0x04ad }
            if (r8 == 0) goto L_0x047c
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x047c
            r5 = r8
            org.npci.upi.security.pinactivitycomponent.GetCredential r5 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r5     // Catch:{ Exception -> 0x04ad }
            r5.A01 = r9     // Catch:{ Exception -> 0x04ad }
        L_0x047c:
            org.npci.upi.security.pinactivitycomponent.u r5 = new org.npci.upi.security.pinactivitycomponent.u     // Catch:{ Exception -> 0x04ad }
            r5.<init>(r8)     // Catch:{ Exception -> 0x04ad }
            java.util.Timer r10 = new java.util.Timer     // Catch:{ Exception -> 0x04ad }
            r10.<init>()     // Catch:{ Exception -> 0x04ad }
            r3.A05 = r10     // Catch:{ Exception -> 0x04ad }
            X.79E r11 = new X.79E     // Catch:{ Exception -> 0x04ad }
            r11.<init>(r3, r5, r9)     // Catch:{ Exception -> 0x04ad }
            r12 = 100
            r14 = 2000(0x7d0, double:9.88E-321)
            r10.scheduleAtFixedRate(r11, r12, r14)     // Catch:{ Exception -> 0x04ad }
            goto L_0x03b5
        L_0x0496:
            r5 = r20
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x04ad }
            if (r5 == 0) goto L_0x03b5
            goto L_0x04b1
        L_0x049f:
            r1 = 2131434522(0x7f0b1c1a, float:1.849086E38)
            r3.A00(r1, r2)     // Catch:{ Exception -> 0x04ad }
            r0 = r27
            android.widget.LinearLayout r0 = X.C36441kJ.A0U(r0, r1)     // Catch:{ Exception -> 0x04ad }
            goto L_0x015f
        L_0x04ad:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x04b1:
            r1 = 1
            java.lang.Boolean r0 = r3.A0D
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04d1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A0E = r0
            java.lang.Boolean r0 = X.C36381kD.A0j()
            r3.A0D = r0
            android.widget.ViewFlipper r0 = r3.A09
            r0.showNext()
            int r0 = r3.A07
            int r0 = r0 + 1
            r3.A07 = r0
        L_0x04d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.w.A03(android.view.View, java.lang.Integer, org.npci.upi.security.pinactivitycomponent.w):void");
    }

    public static void A05(w wVar, int i) {
        String str;
        w wVar2 = wVar;
        int i2 = wVar2.A00;
        if (i2 != -1) {
            ArrayList arrayList = wVar2.A04;
            if (wVar2.A06) {
                i2--;
            }
            if (arrayList.get(i2) instanceof C93104fl) {
                C93104fl A0o = C90494aF.A0o(arrayList, i2);
                wVar2.A1b(A0o);
                A0o.A0I = true;
                try {
                    str = new AnonymousClass66Z(wVar2.A02).A01.getString("otp_type_bank", "");
                } catch (Exception unused) {
                    str = null;
                }
                if (!str.isEmpty()) {
                    C36341k9.A0H().postDelayed(new C1501674f(wVar2, 25), 1500);
                }
            }
        }
        ArrayList arrayList2 = wVar2.A04;
        int size = arrayList2.size();
        for (int i3 = i; i3 < size; i3++) {
            boolean z = wVar2.A06;
            int i4 = wVar2.A00;
            int i5 = i4;
            if (z) {
                i4--;
            }
            if (i3 != i4) {
                if (i5 != -1 && (arrayList2.get(i3) instanceof C93104fl)) {
                    C88984Uu r5 = (C88984Uu) arrayList2.get(i3);
                    if (!(r5 instanceof C93104fl) || !((C93104fl) r5).A0F.equals("SMS") || !wVar2.A06) {
                        C88984Uu r52 = (C88984Uu) arrayList2.get(i3);
                        if ((r52 instanceof C93104fl) && ((C93104fl) r52).A0F.equals("AADHAAR")) {
                        }
                    }
                }
                C88984Uu r6 = (C88984Uu) arrayList2.get(i3);
                Drawable A002 = AnonymousClass00E.A00(wVar2.A0h(), R.drawable.ic_visibility_on);
                Drawable A003 = AnonymousClass00E.A00(wVar2.A0h(), R.drawable.ic_visibility_blue_24px);
                Drawable A004 = AnonymousClass00E.A00(wVar2.A0h(), R.drawable.ic_visibility_off);
                String A0n = wVar2.A0n(R.string.f12nameremoved);
                String A0n2 = wVar2.A0n(R.string.f12nameremoved);
                r6.Azo(A003, new C66983Yb(r6, A004, A002, wVar2, A0n, A0n2, 1), A0n2, 0, false, false);
            }
        }
    }

    private void A00(int i, int i2) {
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        LinearLayout linearLayout = new LinearLayout(A0h());
        linearLayout.setLayoutParams(A0N);
        linearLayout.setDividerDrawable(C36341k9.A0G(this).getDrawable(R.drawable.fragment_transparent_divider));
        linearLayout.setPadding(16, 0, 16, 0);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setId(i);
        this.A09.addView(linearLayout, i2);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
