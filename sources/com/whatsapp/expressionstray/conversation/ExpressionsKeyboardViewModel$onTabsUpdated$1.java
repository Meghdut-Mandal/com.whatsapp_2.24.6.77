package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onTabsUpdated$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onTabsUpdated$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $from;
    public final /* synthetic */ Integer $trayChatType;
    public final /* synthetic */ Integer $trayOrigin;
    public final /* synthetic */ Integer $trayScreen;
    public final /* synthetic */ Integer $trayTarget;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onTabsUpdated$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, Integer num, Integer num2, Integer num3, Integer num4, C023509x r7, int i) {
        super(2, r7);
        this.this$0 = expressionsKeyboardViewModel;
        this.$from = i;
        this.$trayOrigin = num;
        this.$trayTarget = num2;
        this.$trayScreen = num3;
        this.$trayChatType = num4;
    }

    public final C023509x create(Object obj, C023509x r10) {
        return new ExpressionsKeyboardViewModel$onTabsUpdated$1(this.this$0, this.$trayOrigin, this.$trayTarget, this.$trayScreen, this.$trayChatType, r10, this.$from);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r4 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r0 = r8.$trayScreen;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r5 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r6 = r8.$trayOrigin.intValue();
        r3 = r8.$trayChatType;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r3 = X.C54212sa.A00(r8.this$0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r2.A03(r3, r4, r5, r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r0 = r8.this$0;
        r6 = r0.A04.indexOf(r0.A02);
        r2 = r8.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r6 >= 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r1 = X.C90524aI.A0a(r6);
        r0 = "expression_keyboard_tab_update_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel.A02(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r0 = r2.A04.isEmpty();
        r2 = r8.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r0 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r1 = X.C90524aI.A0a(r6);
        r0 = "expression_keyboard_tab_update_failed_expression_tabs_is_empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r2.A05.A0D(new X.AnonymousClass55Q(r2.A01, r2.A02, r2.A04, r6, r2.A0D.A01()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        r1 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (X.AnonymousClass00C.A0J(r1, X.AnonymousClass55N.A00) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (X.AnonymousClass00C.A0J(r1, X.AnonymousClass55P.A00) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r5 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        if (X.AnonymousClass00C.A0J(r1, X.AnonymousClass55O.A00) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (X.AnonymousClass00C.A0J(r1, X.AnonymousClass55M.A00) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r4 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        r0 = X.AnonymousClass00C.A0J(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel.A01(r2, r8.this$0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        throw X.C36441kJ.A18();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r8.$trayOrigin == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r1 = r8.this$0;
        r2 = r1.A07;
        r0 = r8.$trayTarget;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r0 == null) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x00f6
            if (r0 != r6) goto L_0x012b
            java.lang.Object r5 = r8.L$0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel) r5
            X.AnonymousClass0AN.A00(r9)
        L_0x0010:
            java.util.List r9 = (java.util.List) r9
            r5.A04 = r9
            int r0 = r8.$from
            switch(r0) {
                case 1: goto L_0x00b9;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00b9;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.Integer r0 = r8.$trayOrigin
            if (r0 == 0) goto L_0x0047
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r1 = r8.this$0
            X.6O1 r2 = r1.A07
            java.lang.Integer r0 = r8.$trayTarget
            if (r0 == 0) goto L_0x00b5
            int r4 = r0.intValue()
        L_0x0029:
            java.lang.Integer r0 = r8.$trayScreen
            if (r0 == 0) goto L_0x0089
            int r5 = r0.intValue()
        L_0x0031:
            java.lang.Integer r0 = r8.$trayOrigin
            int r6 = r0.intValue()
            java.lang.Integer r3 = r8.$trayChatType
            if (r3 != 0) goto L_0x0043
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.11F r0 = r0.A03
            java.lang.Integer r3 = X.C54212sa.A00(r0)
        L_0x0043:
            r7 = 1
            r2.A03(r3, r4, r5, r6, r7)
        L_0x0047:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            java.util.List r1 = r0.A04
            X.5q5 r0 = r0.A02
            int r6 = r1.indexOf(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r2 = r8.this$0
            if (r6 >= 0) goto L_0x0061
            java.lang.Integer r1 = X.C90524aI.A0a(r6)
            java.lang.String r0 = "expression_keyboard_tab_update_failed"
        L_0x005b:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel.A02(r2, r1, r0)
        L_0x005e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0061:
            java.util.List r0 = r2.A04
            boolean r0 = r0.isEmpty()
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r2 = r8.this$0
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r1 = X.C90524aI.A0a(r6)
            java.lang.String r0 = "expression_keyboard_tab_update_failed_expression_tabs_is_empty"
            goto L_0x005b
        L_0x0072:
            X.00s r1 = r2.A05
            X.5q5 r4 = r2.A02
            android.graphics.Bitmap r3 = r2.A01
            java.util.List r5 = r2.A04
            X.1BF r0 = r2.A0D
            boolean r7 = r0.A01()
            X.55Q r2 = new X.55Q
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A0D(r2)
            goto L_0x005e
        L_0x0089:
            X.5q5 r1 = r1.A02
            X.55N r0 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0095
            r5 = 4
            goto L_0x0031
        L_0x0095:
            X.55P r0 = X.AnonymousClass55P.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00a0
            r5 = 10
            goto L_0x0031
        L_0x00a0:
            X.55O r0 = X.AnonymousClass55O.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00aa
            r5 = 6
            goto L_0x0031
        L_0x00aa:
            X.55M r0 = X.AnonymousClass55M.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0126
            r5 = 3
            goto L_0x0031
        L_0x00b5:
            r4 = 20
            goto L_0x0029
        L_0x00b9:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.5q5 r0 = r0.A02
            X.55N r2 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            goto L_0x00ed
        L_0x00c4:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.5q5 r0 = r0.A02
            X.55N r2 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 != 0) goto L_0x0019
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.5q5 r1 = r0.A02
            X.55P r0 = X.AnonymousClass55P.A00
            goto L_0x00e9
        L_0x00d7:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.5q5 r0 = r0.A02
            X.55N r2 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 != 0) goto L_0x0019
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.5q5 r1 = r0.A02
            X.55O r0 = X.AnonymousClass55O.A00
        L_0x00e9:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
        L_0x00ed:
            if (r0 != 0) goto L_0x0019
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel.A01(r2, r0)
            goto L_0x0019
        L_0x00f6:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r1 = r8.this$0
            int r0 = r8.$from
            r1.A00 = r0
            if (r0 != r6) goto L_0x011f
            X.55N r0 = X.AnonymousClass55N.A00
        L_0x0103:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel.A01(r0, r1)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = r8.this$0
            X.6PO r4 = r5.A08
            int r3 = r8.$from
            r8.L$0 = r5
            r8.label = r6
            X.02l r2 = r4.A04
            r1 = 0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2
            r0.<init>(r4, r1, r3, r6)
            java.lang.Object r9 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0010
            return r7
        L_0x011f:
            X.6PO r0 = r1.A08
            X.5q5 r0 = r0.A00(r6)
            goto L_0x0103
        L_0x0126:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x012b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onTabsUpdated$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsKeyboardViewModel$onTabsUpdated$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
