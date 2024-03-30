package com.whatsapp.calling.header;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C124795yo;
import X.C27631Pa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder$animationState$1", f = "CallHeaderStateHolder.kt", i = {0, 1, 2, 3, 4, 5}, l = {49, 50, 51, 52, 53, 54, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
public final class CallHeaderStateHolder$animationState$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C27631Pa $voipSharedPreferences;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C124795yo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallHeaderStateHolder$animationState$1(C27631Pa r2, C124795yo r3, C023509x r4) {
        super(2, r4);
        this.$voipSharedPreferences = r2;
        this.this$0 = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        CallHeaderStateHolder$animationState$1 callHeaderStateHolder$animationState$1 = new CallHeaderStateHolder$animationState$1(this.$voipSharedPreferences, this.this$0, r5);
        callHeaderStateHolder$animationState$1.L$0 = obj;
        return callHeaderStateHolder$animationState$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r0 = new java.lang.Integer(2);
        r11.L$0 = r4;
        r11.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r4.B6N(r0, r11) != r5) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r11.L$0 = r4;
        r11.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (X.C07330Xf.A00(r11, 300) != r5) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r3 = new java.lang.Integer(3);
        r11.L$0 = r4;
        r11.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r4.B6N(r3, r11) != r5) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        r11.L$0 = r4;
        r11.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (X.C07330Xf.A00(r11, 300) != r5) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r1 = new java.lang.Integer(1);
        r11.L$0 = null;
        r11.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (r4.B6N(r1, r11) != r5) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        r1 = r11.$voipSharedPreferences;
        r2 = r11.this$0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r2 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        X.C36341k9.A0x(X.C27631Pa.A00(r1).edit(), "e2ee_shown_for_callid", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        throw X.C36381kD.A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r11.L$0 = r4;
        r11.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (X.C07330Xf.A00(r11, 5000) != r5) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r11.label
            r1 = 300(0x12c, double:1.48E-321)
            r9 = 3
            r10 = 2
            r8 = 1
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0029;
                case 2: goto L_0x003d;
                case 3: goto L_0x0054;
                case 4: goto L_0x0067;
                case 5: goto L_0x007f;
                case 6: goto L_0x0092;
                case 7: goto L_0x00ab;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0011:
            X.AnonymousClass0AN.A00(r12)
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            r3 = 0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            r11.L$0 = r4
            r11.label = r8
            java.lang.Object r0 = r4.B6N(r0, r11)
            if (r0 != r5) goto L_0x0030
            return r5
        L_0x0029:
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r12)
        L_0x0030:
            r6 = 5000(0x1388, double:2.4703E-320)
            r11.L$0 = r4
            r11.label = r10
            java.lang.Object r0 = X.C07330Xf.A00(r11, r6)
            if (r0 != r5) goto L_0x0044
            return r5
        L_0x003d:
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r12)
        L_0x0044:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r10)
            r11.L$0 = r4
            r11.label = r9
            java.lang.Object r0 = r4.B6N(r0, r11)
            if (r0 != r5) goto L_0x005b
            return r5
        L_0x0054:
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r12)
        L_0x005b:
            r11.L$0 = r4
            r0 = 4
            r11.label = r0
            java.lang.Object r0 = X.C07330Xf.A00(r11, r1)
            if (r0 != r5) goto L_0x006e
            return r5
        L_0x0067:
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r12)
        L_0x006e:
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r11.L$0 = r4
            r0 = 5
            r11.label = r0
            java.lang.Object r0 = r4.B6N(r3, r11)
            if (r0 != r5) goto L_0x0086
            return r5
        L_0x007f:
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r12)
        L_0x0086:
            r11.L$0 = r4
            r0 = 6
            r11.label = r0
            java.lang.Object r0 = X.C07330Xf.A00(r11, r1)
            if (r0 != r5) goto L_0x0099
            return r5
        L_0x0092:
            java.lang.Object r4 = r11.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r12)
        L_0x0099:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            r0 = 0
            r11.L$0 = r0
            r0 = 7
            r11.label = r0
            java.lang.Object r0 = r4.B6N(r1, r11)
            if (r0 != r5) goto L_0x00ae
            return r5
        L_0x00ab:
            X.AnonymousClass0AN.A00(r12)
        L_0x00ae:
            X.1Pa r1 = r11.$voipSharedPreferences
            X.5yo r0 = r11.this$0
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x00c6
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r1)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "e2ee_shown_for_callid"
            X.C36341k9.A0x(r1, r0, r2)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.header.CallHeaderStateHolder$animationState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallHeaderStateHolder$animationState$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
