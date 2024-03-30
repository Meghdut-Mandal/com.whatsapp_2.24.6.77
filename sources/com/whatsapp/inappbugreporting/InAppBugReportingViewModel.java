package com.whatsapp.inappbugreporting;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass1GX;
import X.AnonymousClass2W6;
import X.AnonymousClass2W8;
import X.AnonymousClass38O;
import X.AnonymousClass3DD;
import X.C001600r;
import X.C001700s;
import X.C005502l;
import X.C023409w;
import X.C196339Zf;
import X.C28201Rs;
import X.C36321k7;
import X.C36431kI;
import X.C36441kJ;
import X.C54572tA;
import X.C61043Ai;
import X.C61163Au;
import X.C61513Cf;
import X.C63353Js;
import X.C79223tN;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import java.util.List;

public final class InAppBugReportingViewModel extends AnonymousClass04R {
    public C001700s A00;
    public C001700s A01;
    public C001700s A02;
    public String A03 = "";
    public String A04;
    public C63353Js[] A05;
    public List A06 = C023409w.A00;
    public final C001600r A07;
    public final C001700s A08 = C36431kI.A0S();
    public final C001700s A09 = C36431kI.A0S();
    public final C61163Au A0A;
    public final AnonymousClass38O A0B;
    public final C61043Ai A0C;
    public final AnonymousClass3DD A0D;
    public final ReportBugProtocolHelper A0E;
    public final AnonymousClass1GX A0F;
    public final C28201Rs A0G;
    public final C005502l A0H;
    public final C61513Cf A0I;

    public InAppBugReportingViewModel(C61163Au r6, AnonymousClass38O r7, C61043Ai r8, AnonymousClass3DD r9, C61513Cf r10, ReportBugProtocolHelper reportBugProtocolHelper, AnonymousClass1GX r12, C005502l r13) {
        AnonymousClass00C.A0D(r10, 5);
        C36321k7.A13(r12, r9, r13);
        this.A0A = r6;
        this.A0C = r8;
        this.A0B = r7;
        this.A0E = reportBugProtocolHelper;
        this.A0I = r10;
        this.A0F = r12;
        this.A0D = r9;
        this.A0H = r13;
        C001700s A0S = C36431kI.A0S();
        AnonymousClass2W6 r1 = AnonymousClass2W6.A00;
        A0S.A0D(r1);
        this.A02 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        A0S2.A0D(r1);
        this.A00 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        A0S3.A0D(r1);
        this.A01 = A0S3;
        this.A07 = C196339Zf.A00(this.A02, this.A00, A0S3, C79223tN.A00);
        this.A0G = C36441kJ.A0t();
        this.A05 = new C63353Js[3];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a3, code lost:
        if (r6.length() == 0) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(java.lang.String r6, java.lang.String r7, java.lang.String r8, android.net.Uri[] r9, boolean r10) {
        /*
            r5 = this;
            r3 = 1
            X.C36321k7.A0v(r7, r3, r9)
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = X.C36371kC.A0y(r7)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.AnonymousClass00C.A08(r0)
            int r2 = r0.length()
            r0 = 10
            X.00s r1 = r5.A08
            if (r2 >= r0) goto L_0x002b
            X.2W0 r0 = X.AnonymousClass2W0.A00
        L_0x0027:
            r1.A0D(r0)
            return
        L_0x002b:
            X.2W1 r0 = X.AnonymousClass2W1.A00
            r1.A0D(r0)
            if (r10 != 0) goto L_0x0042
            X.00r r0 = r5.A07
            java.lang.Object r0 = r0.A04()
            boolean r0 = X.C36371kC.A1X(r0, r3)
            if (r0 == 0) goto L_0x0042
            X.1Rs r1 = r5.A0G
            r0 = 0
            goto L_0x0027
        L_0x0042:
            X.3DD r0 = r5.A0D
            r3 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.0zE r2 = r0.A00
            r2.markerStart(r3)
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "network_type"
            r2.markerAnnotate((int) r3, (java.lang.String) r0, (java.lang.String) r1)
            X.00s r1 = r5.A09
            X.2W4 r0 = X.AnonymousClass2W4.A00
            r1.A0D(r0)
            X.3Au r2 = r5.A0A
            X.3ty r4 = new X.3ty
            r4.<init>()
            X.0wU r1 = r2.A09
            r0 = 15
            X.C80293vA.A00(r1, r2, r4, r0)
            X.38O r3 = r5.A0B
            X.3ty r2 = new X.3ty
            r2.<init>()
            X.0wU r1 = r3.A03
            r0 = 16
            X.C80293vA.A00(r1, r3, r2, r0)
            r0 = 2
            X.3ty[] r0 = new X.C79593ty[r0]
            X.C36341k9.A1I(r4, r2, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.AnonymousClass00C.A08(r0)
            X.8UW r1 = new X.8UW
            r1.<init>(r0)
            X.3ts r0 = new X.3ts
            r0.<init>(r5, r6, r7, r8)
            r1.A0A(r0)
            X.3Cf r4 = r5.A0I
            java.util.List r0 = X.AnonymousClass02R.A0C(r9)
            int r3 = r0.size()
            if (r6 == 0) goto L_0x00a5
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            r2 = r0 ^ 1
            X.2Qi r1 = new X.2Qi
            r1.<init>()
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A01 = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r3)
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A00 = r0
            r1.A04 = r8
            X.0yW r0 = r4.A00
            r0.Blv(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingViewModel.A0T(java.lang.String, java.lang.String, java.lang.String, android.net.Uri[], boolean):void");
    }

    public static final void A01(C54572tA r1, InAppBugReportingViewModel inAppBugReportingViewModel, int i) {
        C001700s r0;
        if (i == 0) {
            r0 = inAppBugReportingViewModel.A02;
        } else if (i == 1) {
            r0 = inAppBugReportingViewModel.A00;
        } else if (i == 2) {
            r0 = inAppBugReportingViewModel.A01;
        } else {
            return;
        }
        r0.A0D(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f5, code lost:
        X.C05600Qi.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(android.net.Uri r38, int r39) {
        /*
            r37 = this;
            X.2W8 r0 = X.AnonymousClass2W8.A00
            r6 = r37
            r2 = r39
            A01(r0, r6, r2)
            X.3Ai r1 = r6.A0C
            X.3DD r9 = r1.A04
            r0 = 476716874(0x1c6a1f4a, float:7.7464546E-22)
            X.0zE r4 = r9.A00
            r4.markerStart(r0, r2)
            X.3ty r5 = new X.3ty
            r5.<init>()
            r3 = 1
            r0 = 0
            X.3Ot r7 = new X.3Ot
            r7.<init>(r3, r0, r3)
            X.0yC r0 = r1.A03
            X.2XN r8 = new X.2XN
            r8.<init>(r0)
            X.1GX r0 = r1.A07
            X.0yb r0 = r0.A01
            X.0ya r10 = r0.A0O()
            r0 = r38
            java.lang.String r10 = X.AnonymousClass1GW.A0M(r0, r10)
            boolean r36 = X.AnonymousClass1GX.A0c(r10)
            if (r36 == 0) goto L_0x00f9
            java.lang.String r8 = X.C36381kD.A0y(r0)
            android.net.Uri r11 = android.net.Uri.parse(r8)
            X.0yb r8 = r1.A02
            X.0ya r10 = r8.A0O()
            r12 = 0
            if (r10 == 0) goto L_0x0064
            r14 = r12
            r15 = r12
            r13 = r12
            android.database.Cursor r12 = r10.A03(r11, r12, r13, r14, r15)
            if (r12 == 0) goto L_0x0064
            r12.moveToFirst()     // Catch:{ all -> 0x00f2 }
            java.lang.String r8 = "_data"
            int r8 = r12.getColumnIndex(r8)     // Catch:{ all -> 0x00f2 }
            java.lang.String r8 = r12.getString(r8)     // Catch:{ all -> 0x00f2 }
            goto L_0x0069
        L_0x0064:
            java.lang.String r8 = r11.getPath()     // Catch:{ all -> 0x00f2 }
            goto L_0x006c
        L_0x0069:
            r12.close()
        L_0x006c:
            if (r8 != 0) goto L_0x0078
            java.lang.String r0 = "InAppBugReportingScreenshotsUploadRepository/getFilePath: null path for media uri"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8 = 0
        L_0x0074:
            java.lang.String r10 = "video"
            goto L_0x0110
        L_0x0078:
            java.io.File r15 = new java.io.File
            r15.<init>(r8)
            r11 = 0
            X.1Gl r13 = X.C25471Gl.A0i
            java.lang.String r8 = "doodle"
            java.lang.String r16 = r0.getQueryParameter(r8)
            java.lang.String r8 = "from"
            java.lang.String r10 = r0.getQueryParameter(r8)
            if (r10 == 0) goto L_0x00ef
            int r8 = r10.length()
            if (r8 == 0) goto L_0x00ef
            long r24 = java.lang.Long.parseLong(r10)
        L_0x0098:
            java.lang.String r8 = "to"
            java.lang.String r8 = r0.getQueryParameter(r8)
            if (r8 == 0) goto L_0x00ec
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00ec
            long r26 = java.lang.Long.parseLong(r8)
        L_0x00aa:
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            android.net.Uri r8 = android.net.Uri.fromFile(r15)
            java.lang.String r17 = r8.toString()
            boolean r29 = X.AnonymousClass6Y1.A06(r13)
            X.65P r10 = new X.65P
            r14 = r11
            r18 = r11
            r19 = r11
            r21 = 0
            r22 = 0
            r23 = 0
            r28 = 0
            r30 = 1
            r31 = 1
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r20 = 0
            r12 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35)
            X.5z9 r13 = X.AnonymousClass3M4.A00(r11, r13, r0, r3)
            X.3Rg r8 = new X.3Rg
            r17 = 0
            r12 = r8
            r14 = r10
            r15 = r7
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x0074
        L_0x00ec:
            r26 = 0
            goto L_0x00aa
        L_0x00ef:
            r24 = 0
            goto L_0x0098
        L_0x00f2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            X.C05600Qi.A00(r12, r1)
            throw r0
        L_0x00f9:
            r11 = 0
            r17 = 0
            X.1Gl r14 = X.C25471Gl.A0D
            r16 = r11
            r18 = 0
            r19 = 1
            r20 = 1
            r10 = r0
            r12 = r8
            r13 = r7
            r15 = r11
            X.3Rg r8 = X.C65233Rg.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r10 = "image"
        L_0x0110:
            java.lang.String r0 = "mms_type"
            r7 = 476716874(0x1c6a1f4a, float:7.7464546E-22)
            r4.markerAnnotate((int) r7, (int) r2, (java.lang.String) r0, (java.lang.String) r10)
            java.lang.String r9 = r9.A00()
            java.lang.String r0 = "network_type"
            r4.markerAnnotate((int) r7, (int) r2, (java.lang.String) r0, (java.lang.String) r9)
            if (r8 != 0) goto L_0x0145
            java.lang.String r0 = "InAppBugReportingScreenshotsUploadRepository/mediaJobRequestData is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r13 = 19
            r9 = 0
            X.3Js r8 = new X.3Js
            r11 = r9
            r12 = r9
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            r5.A0C(r8)
            r0 = 148(0x94, float:2.07E-43)
            r4.markerEnd(r7, r2, r0)
        L_0x013b:
            r1 = 1
            X.3IU r0 = new X.3IU
            r0.<init>(r6, r2, r1)
            r5.A0A(r0)
            return
        L_0x0145:
            X.1D0 r0 = r1.A06
            X.6vi r4 = r0.A07(r8, r3)
            java.lang.String r0 = "mms"
            r4.A0X = r0
            X.0wU r3 = r1.A08
            r0 = 27
            X.C81333wq.A00(r3, r1, r4, r2, r0)
            X.3tt r3 = new X.3tt
            r31 = r3
            r32 = r5
            r33 = r1
            r34 = r4
            r35 = r2
            r31.<init>(r32, r33, r34, r35, r36)
            r0 = 0
            r4.A06(r3, r0)
            goto L_0x013b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingViewModel.A0S(android.net.Uri, int):void");
    }

    public final boolean A0U() {
        Object A042 = this.A02.A04();
        AnonymousClass2W8 r1 = AnonymousClass2W8.A00;
        if (AnonymousClass00C.A0J(A042, r1) || AnonymousClass00C.A0J(this.A00.A04(), r1) || AnonymousClass00C.A0J(this.A01.A04(), r1)) {
            return true;
        }
        return false;
    }
}
