package X;

import java.io.IOException;

/* renamed from: X.6us  reason: invalid class name and case insensitive filesystem */
public class C146006us implements C160087kR {
    public final /* synthetic */ C128936Ee A00;
    public final /* synthetic */ C122855vX A01;
    public final /* synthetic */ C134906bn A02;
    public final /* synthetic */ C160217ke A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ C131556Pn A0A;

    public C146006us(C131556Pn r1, C128936Ee r2, C122855vX r3, C134906bn r4, C160217ke r5, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A0A = r1;
        this.A06 = str;
        this.A02 = r4;
        this.A04 = str2;
        this.A05 = str3;
        this.A09 = z;
        this.A01 = r3;
        this.A08 = z2;
        this.A03 = r5;
        this.A00 = r2;
        this.A07 = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c5, code lost:
        r6 = r2.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r21) {
        /*
            r20 = this;
            r1 = r21
            X.66O r4 = r1.A04
            X.60z r6 = r1.A03
            int r0 = r1.A00
            r9 = r20
            if (r0 != 0) goto L_0x0085
            X.6Pn r10 = r9.A0A
            java.lang.String r4 = r9.A06
            java.lang.Object r0 = r6.A00
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.length()
            long r0 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "EVENT_PARAM_COMPRESSED_SIZE"
            r2.put(r0, r1)
        L_0x002d:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            r2.put(r0, r1)
            X.6Nh r1 = r10.A05
            java.lang.String r0 = "PAYLOAD_SIZE"
            r1.A02(r4, r0, r2)
            X.6bn r12 = r9.A02
            if (r12 == 0) goto L_0x0073
            java.lang.String r8 = r12.A01
            java.lang.String r0 = "ASYNC_COMPONENT"
            if (r8 == r0) goto L_0x0073
            X.005 r0 = r10.A08     // Catch:{ Exception -> 0x006d }
            java.lang.Object r7 = r0.get()     // Catch:{ Exception -> 0x006d }
            X.6Pt r7 = (X.C131616Pt) r7     // Catch:{ Exception -> 0x006d }
            X.6MZ r3 = r10.A03     // Catch:{ Exception -> 0x006d }
            java.lang.String r2 = r9.A04     // Catch:{ Exception -> 0x006d }
            java.lang.String r1 = r9.A05     // Catch:{ Exception -> 0x006d }
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ Exception -> 0x006d }
            X.5OH r5 = new X.5OH     // Catch:{ Exception -> 0x006d }
            r5.<init>(r3, r2, r1)     // Catch:{ Exception -> 0x006d }
            java.lang.Object r4 = r6.A00     // Catch:{ Exception -> 0x006d }
            long r1 = r12.A00     // Catch:{ Exception -> 0x006d }
            boolean r3 = r12.A02     // Catch:{ Exception -> 0x006d }
            X.6S9 r0 = new X.6S9     // Catch:{ Exception -> 0x006d }
            r0.<init>((java.lang.Object) r4, (long) r1, (boolean) r3)     // Catch:{ Exception -> 0x006d }
            r7.A02(r5, r0, r8)     // Catch:{ Exception -> 0x006d }
            goto L_0x0073
        L_0x006d:
            r1 = move-exception
            java.lang.String r0 = "Failed to save the bk-cache"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0073:
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x0084
            java.lang.Object r14 = r6.A00
            java.lang.String r14 = (java.lang.String) r14
            X.5vX r11 = r9.A01
            boolean r15 = r9.A08
            X.7ke r13 = r9.A03
            r10.A01(r11, r12, r13, r14, r15)
        L_0x0084:
            return
        L_0x0085:
            X.6Pn r2 = r9.A0A
            X.5vX r11 = r9.A01
            java.lang.String r14 = r9.A04
            X.6Ee r10 = r9.A00
            java.lang.String r15 = r9.A05
            boolean r3 = r9.A08
            X.6bn r12 = r9.A02
            java.lang.String r1 = r9.A07
            boolean r0 = r9.A09
            X.7ke r13 = r9.A03
            X.74F r8 = new X.74F
            r16 = r1
            r17 = r3
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r5 = r9.A06
            r3 = 4
            if (r4 == 0) goto L_0x0130
            java.util.Map r0 = r4.A00
            if (r0 == 0) goto L_0x0130
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0130
            java.lang.Object r7 = r4.A00(r11)
            java.lang.String r7 = (java.lang.String) r7
            X.6Ka r0 = r2.A04
            X.5pM r0 = X.C130176Ka.A00(r0, r14)
            X.5pL r0 = r0.A01
            X.6P0 r0 = r0.A01
            if (r0 == 0) goto L_0x00d4
            X.1UA r6 = r2.A06
            X.6OQ r1 = r6.A00(r0)
            if (r1 == 0) goto L_0x00d4
            int r0 = r11.A00
            if (r0 == r3) goto L_0x00da
            switch(r0) {
                case 8: goto L_0x00ee;
                case 9: goto L_0x0106;
                case 10: goto L_0x011e;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            if (r7 == 0) goto L_0x0135
            r2.A02(r11, r13, r7)
            return
        L_0x00da:
            java.lang.Exception r0 = r11.A02
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0 instanceof org.json.JSONException
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x00ee
            X.0wU r0 = r2.A07
            r0.Boy(r8)
            return
        L_0x00ee:
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x0106
            r19 = 2
            X.7rB r14 = new X.7rB
            r15 = r8
            r16 = r11
            r17 = r13
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r6.A02(r1, r14, r10)
            return
        L_0x0106:
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x011e
            r19 = 3
            X.7rB r14 = new X.7rB
            r15 = r8
            r16 = r11
            r17 = r13
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r6.A01(r1, r14, r10)
            return
        L_0x011e:
            java.lang.Long r0 = r10.A01()
            if (r0 == 0) goto L_0x00d4
            X.0wU r3 = r2.A07
            long r1 = r0.longValue()
            java.lang.String r0 = "BloksLayoutFetcherImpl/retryWithBackoff"
            r3.BpM(r8, r0, r1)
            return
        L_0x0130:
            r11.A00 = r3
            java.lang.String r0 = "Something went wrong"
            goto L_0x0168
        L_0x0135:
            java.util.Map r0 = r4.A00
            java.util.Iterator r0 = X.AnonymousClass000.A0y(r0)
            java.lang.Object r4 = X.C36351kA.A0u(r0)
            X.6Sy r4 = (X.C132286Sy) r4
            r11.A00 = r3
            X.5V0 r0 = new X.5V0
            r0.<init>(r4)
            r11.A02 = r0
            int r1 = r4.A01
            r0 = 2498098(0x261e32, float:3.500581E-39)
            if (r1 != r0) goto L_0x0159
            X.6Nh r3 = r2.A05
            r1 = 0
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            r3.A02(r5, r0, r1)
        L_0x0159:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Something went wrong :"
            r1.append(r0)
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0168:
            r2.A02(r11, r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146006us.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        C122855vX r3 = this.A01;
        r3.A02 = iOException;
        r3.A00 = 7;
        this.A0A.A02(r3, this.A03, iOException.getLocalizedMessage());
    }

    public void BWk(Exception exc) {
        C122855vX r3 = this.A01;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A0A.A02(r3, this.A03, exc.getLocalizedMessage());
    }
}
