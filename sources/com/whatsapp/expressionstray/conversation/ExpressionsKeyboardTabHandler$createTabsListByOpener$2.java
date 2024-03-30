package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6PO;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2", f = "ExpressionsKeyboardTabHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardTabHandler$createTabsListByOpener$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $opener;
    public final /* synthetic */ boolean $showEmoji;
    public int label;
    public final /* synthetic */ AnonymousClass6PO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardTabHandler$createTabsListByOpener$2(AnonymousClass6PO r2, C023509x r3, int i, boolean z) {
        super(2, r3);
        this.$opener = i;
        this.$showEmoji = z;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ExpressionsKeyboardTabHandler$createTabsListByOpener$2(this.this$0, r6, this.$opener, this.$showEmoji);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r1.A02.A0E(811) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r2.add(X.AnonymousClass55O.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (r1.A03.A01() != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        if (r1.A00.A0L() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        if (r1.A02.A0E(4890) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (r0 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        r0 = X.AnonymousClass55M.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        r0 = X.AnonymousClass55P.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r1 = X.AnonymousClass03S.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        return X.C163907qx.A00(r1, 13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L_0x00e3
            X.AnonymousClass0AN.A00(r4)
            int r2 = r3.$opener
            switch(r2) {
                case 0: goto L_0x005c;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00be;
                case 3: goto L_0x0045;
                case 4: goto L_0x0033;
                case 5: goto L_0x0094;
                case 6: goto L_0x00d6;
                case 7: goto L_0x001f;
                case 8: goto L_0x008c;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExpressionsKeyboardOpener = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x001f:
            X.6PO r1 = r3.this$0
            X.0k2 r2 = new X.0k2
            r2.<init>()
            X.55N r0 = X.AnonymousClass55N.A00
            r2.add(r0)
            X.1BF r0 = r1.A03
            boolean r0 = r0.A01()
            goto L_0x00b9
        L_0x0033:
            boolean r0 = r3.$showEmoji
            X.0k2 r2 = new X.0k2
            r2.<init>()
            if (r0 == 0) goto L_0x0041
            X.55N r0 = X.AnonymousClass55N.A00
            r2.add(r0)
        L_0x0041:
            X.55O r0 = X.AnonymousClass55O.A00
            goto L_0x00ce
        L_0x0045:
            X.6PO r1 = r3.this$0
            X.0k2 r2 = new X.0k2
            r2.<init>()
            X.55N r0 = X.AnonymousClass55N.A00
            r2.add(r0)
            X.0yC r1 = r1.A02
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00d1
            goto L_0x00cc
        L_0x005c:
            boolean r0 = r3.$showEmoji
            if (r0 == 0) goto L_0x008c
            X.6PO r1 = r3.this$0
            X.0k2 r2 = new X.0k2
            r2.<init>()
            X.55N r0 = X.AnonymousClass55N.A00
            r2.add(r0)
        L_0x006c:
            X.55O r0 = X.AnonymousClass55O.A00
            r2.add(r0)
            X.1BF r0 = r1.A03
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00bb
            X.0wQ r0 = r1.A00
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x00cc
            X.0yC r1 = r1.A02
            r0 = 4890(0x131a, float:6.852E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00bb
            goto L_0x00cc
        L_0x008c:
            X.6PO r1 = r3.this$0
            X.0k2 r2 = new X.0k2
            r2.<init>()
            goto L_0x006c
        L_0x0094:
            X.6PO r1 = r3.this$0
            boolean r0 = r3.$showEmoji
            X.0k2 r2 = new X.0k2
            r2.<init>()
            if (r0 == 0) goto L_0x00a4
            X.55N r0 = X.AnonymousClass55N.A00
            r2.add(r0)
        L_0x00a4:
            X.55O r0 = X.AnonymousClass55O.A00
            r2.add(r0)
            X.0yC r1 = r1.A02
            r0 = 6110(0x17de, float:8.562E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 6383(0x18ef, float:8.944E-42)
            boolean r0 = r1.A0E(r0)
        L_0x00b9:
            if (r0 == 0) goto L_0x00cc
        L_0x00bb:
            X.55M r0 = X.AnonymousClass55M.A00
            goto L_0x00c9
        L_0x00be:
            boolean r0 = r3.$showEmoji
            X.0k2 r2 = new X.0k2
            r2.<init>()
            if (r0 == 0) goto L_0x00cc
            X.55N r0 = X.AnonymousClass55N.A00
        L_0x00c9:
            r2.add(r0)
        L_0x00cc:
            X.55P r0 = X.AnonymousClass55P.A00
        L_0x00ce:
            r2.add(r0)
        L_0x00d1:
            X.0k2 r1 = X.AnonymousClass03S.A00(r2)
            goto L_0x00dc
        L_0x00d6:
            X.55N r0 = X.AnonymousClass55N.A00
            java.util.List r1 = X.C36371kC.A11(r0)
        L_0x00dc:
            r0 = 13
            java.util.List r0 = X.C163907qx.A00(r1, r0)
            return r0
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsKeyboardTabHandler$createTabsListByOpener$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
