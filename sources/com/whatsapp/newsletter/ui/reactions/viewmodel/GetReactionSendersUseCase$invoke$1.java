package com.whatsapp.newsletter.ui.reactions.viewmodel;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C123915xI;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1", f = "GetReactionSendersUseCase.kt", i = {0, 0}, l = {76}, m = "invokeSuspend", n = {"$this$launch", "sortIdToReactionsMap"}, s = {"L$0", "L$1"})
public final class GetReactionSendersUseCase$invoke$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $messageList;
    public final /* synthetic */ C006302t $onComplete;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ C123915xI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetReactionSendersUseCase$invoke$1(C123915xI r2, List list, C023509x r4, C006302t r5) {
        super(2, r4);
        this.$messageList = list;
        this.this$0 = r2;
        this.$onComplete = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        GetReactionSendersUseCase$invoke$1 getReactionSendersUseCase$invoke$1 = new GetReactionSendersUseCase$invoke$1(this.this$0, this.$messageList, r6, this.$onComplete);
        getReactionSendersUseCase$invoke$1.L$0 = obj;
        return getReactionSendersUseCase$invoke$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r16 = r1.A1O;
        r1 = r5.A01.A09(r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if ((r1 instanceof X.C44072La) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        r1 = (X.C44072La) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r1 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r1.A0L() != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r6.invoke(X.C000400e.A0D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r12 = X.C36381kD.A0y(r2);
        r8.L$0 = r3;
        r8.L$1 = r4;
        r8.L$2 = r5;
        r8.L$3 = r6;
        r8.L$4 = r10;
        r8.L$5 = r4;
        r8.L$6 = r12;
        r8.label = 1;
        r11 = X.C36411kG.A16(r8);
        r15 = new X.C10770fC();
        r14 = new X.C21230ADm(r5, r11, r15);
        r2 = new X.C10810fG();
        r21 = r16;
        r15 = r13;
        r16 = r14;
        r5.A03.Bp1(new X.AVt(r15, r16, r5, r11, r15, r2, r21));
        X.C07570Yj.A01(r5.A05.BAE()).BL4(new X.AnonymousClass7TD(r2));
        r1 = r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        if (r1 != r9) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[EDGE_INSN: B:28:0x0064->B:18:0x0064 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r24
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r8 = r23
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x00c2
            if (r0 != r7) goto L_0x00d7
            java.lang.Object r12 = r8.L$6
            java.lang.Object r0 = r8.L$5
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r10 = r8.L$4
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r6 = r8.L$3
            X.02t r6 = (X.C006302t) r6
            java.lang.Object r5 = r8.L$2
            X.5xI r5 = (X.C123915xI) r5
            java.lang.Object r4 = r8.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r8.L$0
            X.AnonymousClass0AN.A00(r1)
        L_0x0028:
            r0.put(r12, r1)
            r6.invoke(r4)
        L_0x002e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0064
            X.3T1 r1 = X.C36391kE.A0l(r10)
            X.3Qa r2 = r1.A1J
            X.11F r13 = r2.A00
            boolean r0 = r13 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x002e
            X.1Uw r13 = (X.C28981Uw) r13
            if (r13 == 0) goto L_0x002e
            long r0 = r1.A1O
            r16 = r0
            X.12q r1 = r5.A01
            r0 = 0
            X.3Qp r1 = r1.A09(r13, r0)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0067
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.A0L()
            if (r0 != 0) goto L_0x0067
            X.00f r0 = X.C000400e.A0D()
            r6.invoke(r0)
        L_0x0064:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0067:
            java.lang.String r12 = X.C36381kD.A0y(r2)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.L$2 = r5
            r8.L$3 = r6
            r8.L$4 = r10
            r8.L$5 = r4
            r8.L$6 = r12
            r8.label = r7
            X.0iM r11 = X.C36411kG.A16(r8)
            X.0fC r15 = new X.0fC
            r15.<init>()
            X.ADm r14 = new X.ADm
            r14.<init>(r5, r11, r15)
            X.0fG r2 = new X.0fG
            r2.<init>()
            X.0wU r1 = r5.A03
            X.AVt r0 = new X.AVt
            r21 = r16
            r19 = r15
            r20 = r2
            r17 = r5
            r18 = r11
            r15 = r13
            r16 = r14
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.Bp1(r0)
            X.040 r0 = r5.A05
            X.02h r0 = r0.BAE()
            X.03e r1 = X.C07570Yj.A01(r0)
            X.7TD r0 = new X.7TD
            r0.<init>(r2)
            r1.BL4(r0)
            java.lang.Object r1 = r11.A00()
            if (r1 != r9) goto L_0x00bf
            return r9
        L_0x00bf:
            r0 = r4
            goto L_0x0028
        L_0x00c2:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r3 = r8.L$0
            java.util.LinkedHashMap r4 = X.C36431kI.A1G()
            java.util.List r0 = r8.$messageList
            X.5xI r5 = r8.this$0
            X.02t r6 = r8.$onComplete
            java.util.Iterator r10 = r0.iterator()
            goto L_0x002e
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetReactionSendersUseCase$invoke$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
