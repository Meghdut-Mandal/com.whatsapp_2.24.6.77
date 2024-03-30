package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019708j;
import X.C023509x;
import X.C130616Lt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$1", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$createStickersFlow$1 extends AnonymousClass0A1 implements C019708j {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public /* synthetic */ Object L$4;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$createStickersFlow$1(C130616Lt r2, C023509x r3) {
        super(6, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        AvatarExpressionsDataFlow$createStickersFlow$1 avatarExpressionsDataFlow$createStickersFlow$1 = new AvatarExpressionsDataFlow$createStickersFlow$1(this.this$0, (C023509x) obj6);
        avatarExpressionsDataFlow$createStickersFlow$1.L$0 = obj;
        avatarExpressionsDataFlow$createStickersFlow$1.L$1 = obj2;
        avatarExpressionsDataFlow$createStickersFlow$1.L$2 = obj3;
        avatarExpressionsDataFlow$createStickersFlow$1.L$3 = obj4;
        avatarExpressionsDataFlow$createStickersFlow$1.L$4 = obj5;
        return avatarExpressionsDataFlow$createStickersFlow$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            if (r0 != 0) goto L_0x01d8
            X.AnonymousClass0AN.A00(r14)
            java.lang.Object r10 = r13.L$0
            X.5b4 r10 = (X.C110685b4) r10
            java.lang.Object r8 = r13.L$1
            java.lang.Object r7 = r13.L$2
            X.5cb r7 = (X.C111635cb) r7
            java.lang.Object r6 = r13.L$3
            X.5cc r6 = (X.C111645cc) r6
            java.lang.Object r5 = r13.L$4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            X.6Lt r0 = r13.this$0
            X.6W5 r9 = r0.A01
            X.C36321k7.A0w(r10, r8)
            boolean r0 = r10 instanceof X.C1034655n
            if (r0 != 0) goto L_0x01d4
            X.5IF r4 = X.AnonymousClass5IF.A00
            java.lang.String r0 = r4.toString()
            X.565 r3 = new X.565
            r3.<init>(r4, r0)
            boolean r2 = r8 instanceof X.C106115Ik
            boolean r1 = r10 instanceof X.AnonymousClass55l
            boolean r0 = r8 instanceof X.C106125Il
            if (r0 != 0) goto L_0x01d4
            if (r2 != 0) goto L_0x0194
            if (r1 != 0) goto L_0x0194
            X.55m r10 = (X.C1034555m) r10
            java.util.List r1 = r10.A00
            java.lang.String r0 = r9.A04(r4)
            X.0k2 r9 = X.AnonymousClass6W5.A03(r4, r0, r1)
        L_0x0047:
            X.6Lt r0 = r13.this$0
            X.6W5 r12 = r0.A01
            r4 = 0
            X.AnonymousClass00C.A0D(r7, r4)
            r11 = 1
            X.5IC r10 = X.AnonymousClass5IC.A00
            java.lang.String r0 = r10.toString()
            X.565 r3 = new X.565
            r3.<init>(r10, r0)
            boolean r2 = r8 instanceof X.C106125Il
            if (r2 != 0) goto L_0x0190
            boolean r0 = r7 instanceof X.C106695Kx
            if (r0 != 0) goto L_0x0190
            boolean r0 = r8 instanceof X.C106105Ij
            if (r0 == 0) goto L_0x012e
            boolean r0 = r7 instanceof X.AnonymousClass5Kw
            if (r0 == 0) goto L_0x012e
            X.5Kw r7 = (X.AnonymousClass5Kw) r7
            java.util.List r1 = r7.A00
            java.lang.String r0 = r12.A04(r10)
            X.0k2 r7 = X.AnonymousClass6W5.A03(r10, r0, r1)
        L_0x0077:
            X.6Lt r0 = r13.this$0
            X.6W5 r12 = r0.A01
            X.AnonymousClass00C.A0D(r6, r4)
            r11 = 1
            X.5IE r10 = X.AnonymousClass5IE.A00
            java.lang.String r0 = r10.toString()
            X.565 r3 = new X.565
            r3.<init>(r10, r0)
            if (r2 != 0) goto L_0x012a
            boolean r0 = r6 instanceof X.AnonymousClass5L0
            if (r0 != 0) goto L_0x012a
            boolean r0 = r8 instanceof X.C106105Ij
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r6 instanceof X.C106715Kz
            if (r0 == 0) goto L_0x00b1
            X.5Kz r6 = (X.C106715Kz) r6
            java.util.List r1 = r6.A00
            java.lang.String r0 = r12.A04(r10)
            X.0k2 r0 = X.AnonymousClass6W5.A03(r10, r0, r1)
        L_0x00a4:
            java.util.ArrayList r0 = X.C007103b.A0S(r0, r7)
            java.util.ArrayList r0 = X.C007103b.A0S(r9, r0)
            java.util.ArrayList r0 = X.C007103b.A0S(r5, r0)
            return r0
        L_0x00b1:
            boolean r0 = r8 instanceof X.C106115Ik
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r6 instanceof X.C106715Kz
            if (r0 == 0) goto L_0x00e6
            X.0k2 r2 = new X.0k2
            r2.<init>()
            X.5Kz r6 = (X.C106715Kz) r6
            java.util.List r1 = r6.A00
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x00e1
            X.C1035555x.A00(r12, r3, r10, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e1
            X.6c4 r0 = X.C90504aG.A0U(r1)
            java.lang.String r0 = X.AnonymousClass6W5.A02(r10, r0)
            X.C1035155t.A00(r3, r0, r2)
            goto L_0x00cf
        L_0x00e1:
            X.0k2 r0 = X.AnonymousClass03S.A00(r2)
            goto L_0x00a4
        L_0x00e6:
            r0 = 5
            X.65b[] r6 = new X.C1266865b[r0]
            java.lang.String r8 = r12.A04(r10)
            r2 = 0
            r1 = 10
            X.55x r0 = new X.55x
            r0.<init>((X.C125385zp) r3, (java.lang.Integer) r2, (java.lang.String) r8, (int) r1)
            r6[r4] = r0
            java.lang.String r1 = X.AnonymousClass6W5.A00(r10, r4)
            X.55t r0 = new X.55t
            r0.<init>(r3, r1)
            r6[r11] = r0
            java.lang.String r0 = X.AnonymousClass6W5.A00(r10, r11)
            X.55t r1 = new X.55t
            r1.<init>(r3, r0)
            r0 = 2
            r6[r0] = r1
            java.lang.String r0 = X.AnonymousClass6W5.A00(r10, r0)
            X.55t r1 = new X.55t
            r1.<init>(r3, r0)
            r0 = 3
            r6[r0] = r1
            r2 = 4
            java.lang.String r1 = X.AnonymousClass6W5.A00(r10, r0)
            X.55t r0 = new X.55t
            r0.<init>(r3, r1)
            java.util.List r0 = X.C36341k9.A0m(r0, r6, r2)
            goto L_0x00a4
        L_0x012a:
            X.09w r0 = X.C023409w.A00
            goto L_0x00a4
        L_0x012e:
            boolean r0 = r8 instanceof X.C106115Ik
            if (r0 == 0) goto L_0x0164
            boolean r0 = r7 instanceof X.AnonymousClass5Kw
            if (r0 == 0) goto L_0x0164
            X.0k2 r11 = new X.0k2
            r11.<init>()
            X.5Kw r7 = (X.AnonymousClass5Kw) r7
            java.util.List r1 = r7.A00
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x015e
            X.C1035555x.A00(r12, r3, r10, r11)
            java.util.Iterator r1 = r1.iterator()
        L_0x014c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015e
            X.6c4 r0 = X.C90504aG.A0U(r1)
            java.lang.String r0 = X.AnonymousClass6W5.A02(r10, r0)
            X.C1035155t.A00(r3, r0, r11)
            goto L_0x014c
        L_0x015e:
            X.0k2 r7 = X.AnonymousClass03S.A00(r11)
            goto L_0x0077
        L_0x0164:
            X.0k2 r1 = new X.0k2
            r1.<init>()
            X.C1035555x.A00(r12, r3, r10, r1)
            java.lang.String r0 = X.AnonymousClass6W5.A00(r10, r4)
            X.C1035155t.A00(r3, r0, r1)
            java.lang.String r0 = X.AnonymousClass6W5.A00(r10, r11)
            X.C1035155t.A00(r3, r0, r1)
            r0 = 2
            java.lang.String r0 = X.AnonymousClass6W5.A00(r10, r0)
            X.C1035155t.A00(r3, r0, r1)
            r0 = 3
            java.lang.String r0 = X.AnonymousClass6W5.A00(r10, r0)
            X.C1035155t.A00(r3, r0, r1)
            X.0k2 r7 = X.AnonymousClass03S.A00(r1)
            goto L_0x0077
        L_0x0190:
            X.09w r7 = X.C023409w.A00
            goto L_0x0077
        L_0x0194:
            X.0k2 r2 = new X.0k2
            r2.<init>()
            X.C1035555x.A00(r9, r3, r4, r2)
            if (r1 == 0) goto L_0x01b0
            r0 = r10
            X.55l r0 = (X.AnonymousClass55l) r0
            int r9 = r0.A00
            r1 = 0
        L_0x01a4:
            if (r1 >= r9) goto L_0x01b0
            java.lang.String r0 = X.AnonymousClass6W5.A00(r4, r1)
            X.C1035155t.A00(r3, r0, r2)
            int r1 = r1 + 1
            goto L_0x01a4
        L_0x01b0:
            boolean r0 = r10 instanceof X.C1034555m
            if (r0 == 0) goto L_0x01ce
            X.55m r10 = (X.C1034555m) r10
            java.util.List r0 = r10.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x01bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ce
            X.6c4 r0 = X.C90504aG.A0U(r1)
            java.lang.String r0 = X.AnonymousClass6W5.A02(r4, r0)
            X.C1035155t.A00(r3, r0, r2)
            goto L_0x01bc
        L_0x01ce:
            X.0k2 r9 = X.AnonymousClass03S.A00(r2)
            goto L_0x0047
        L_0x01d4:
            X.09w r9 = X.C023409w.A00
            goto L_0x0047
        L_0x01d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
