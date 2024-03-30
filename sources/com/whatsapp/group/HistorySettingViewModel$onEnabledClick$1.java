package com.whatsapp.group;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1", f = "HistorySettingViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {96, 101, 108, 111, 115}, m = "invokeSuspend", n = {"groupJid", "contact", "groupJid", "contact", "groupJid", "contact", "groupJid", "contact"}, s = {"L$1", "L$2", "L$1", "L$2", "L$1", "L$2", "L$1", "L$2"})
public final class HistorySettingViewModel$onEnabledClick$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$onEnabledClick$1(HistorySettingViewModel historySettingViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = historySettingViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new HistorySettingViewModel$onEnabledClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new HistorySettingViewModel$onEnabledClick$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 5
            r9 = 4
            r10 = 3
            r2 = 2
            r8 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r8) goto L_0x00a9
            if (r0 == r2) goto L_0x00a9
            if (r0 == r10) goto L_0x0085
            if (r0 == r9) goto L_0x00a9
            if (r0 != r4) goto L_0x00ef
            X.AnonymousClass0AN.A00(r13)
        L_0x0018:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x001b:
            X.AnonymousClass0AN.A00(r13)
            com.whatsapp.group.HistorySettingViewModel r5 = r12.this$0
            X.147 r6 = r5.A01
            if (r6 == 0) goto L_0x0018
            X.141 r7 = r5.A00
            if (r7 == 0) goto L_0x0018
            X.0wD r0 = r5.A02
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0043
            X.0sR r1 = r5.A06
            X.2Ve r0 = X.C46132Ve.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r8
        L_0x003c:
            java.lang.Object r0 = r1.Bpf(r0, r12)
            if (r0 != r3) goto L_0x00b8
            return r3
        L_0x0043:
            X.17X r0 = r5.A04
            boolean r0 = r0.A0D(r6)
            if (r0 != 0) goto L_0x0058
            X.0sR r1 = r5.A06
            X.2Vf r0 = X.C46142Vf.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r2
            goto L_0x003c
        L_0x0058:
            X.05L r11 = r5.A08
            java.lang.Object r0 = r11.getValue()
            X.3IR r0 = (X.AnonymousClass3IR) r0
            boolean r0 = r0.A00
            r8 = r0 ^ 1
        L_0x0064:
            java.lang.Object r2 = r11.getValue()
            r1 = 0
            X.3IR r0 = new X.3IR
            r0.<init>(r8, r1)
            boolean r0 = r11.B3B(r2, r0)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper r0 = r5.A05
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r10
            java.lang.Object r13 = r0.A00(r6, r12, r8)
            if (r13 != r3) goto L_0x0094
            return r3
        L_0x0085:
            java.lang.Object r7 = r12.L$2
            X.141 r7 = (X.AnonymousClass141) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            java.lang.Object r5 = r12.L$0
            com.whatsapp.group.HistorySettingViewModel r5 = (com.whatsapp.group.HistorySettingViewModel) r5
            X.AnonymousClass0AN.A00(r13)
        L_0x0094:
            X.2Vt r0 = X.C46252Vt.A00
            boolean r0 = X.AnonymousClass00C.A0J(r13, r0)
            if (r0 == 0) goto L_0x00d3
            X.0sR r1 = r5.A06
            X.2Vg r0 = X.C46152Vg.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r9
            goto L_0x003c
        L_0x00a9:
            java.lang.Object r7 = r12.L$2
            X.141 r7 = (X.AnonymousClass141) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            java.lang.Object r5 = r12.L$0
            com.whatsapp.group.HistorySettingViewModel r5 = (com.whatsapp.group.HistorySettingViewModel) r5
            X.AnonymousClass0AN.A00(r13)
        L_0x00b8:
            X.05L r4 = r5.A08
        L_0x00ba:
            java.lang.Object r3 = r4.getValue()
            boolean r2 = r7.A0h
            X.17X r0 = r5.A04
            boolean r1 = r0.A0D(r6)
            X.3IR r0 = new X.3IR
            r0.<init>(r2, r1)
            boolean r0 = r4.B3B(r3, r0)
            if (r0 == 0) goto L_0x00ba
            goto L_0x0018
        L_0x00d3:
            X.2Vu r0 = X.C46262Vu.A00
            boolean r0 = X.AnonymousClass00C.A0J(r13, r0)
            if (r0 == 0) goto L_0x0018
            X.0sR r2 = r5.A06
            X.2Vh r1 = X.C46162Vh.A00
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.label = r4
            java.lang.Object r0 = r2.Bpf(r1, r12)
            if (r0 != r3) goto L_0x0018
            return r3
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
