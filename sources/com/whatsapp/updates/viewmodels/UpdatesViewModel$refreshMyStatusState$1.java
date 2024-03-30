package com.whatsapp.updates.viewmodels;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshMyStatusState$1", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshMyStatusState$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshMyStatusState$1(UpdatesViewModel updatesViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = updatesViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new UpdatesViewModel$refreshMyStatusState$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UpdatesViewModel$refreshMyStatusState$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        if (r1.A0f == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            if (r0 != 0) goto L_0x00ad
            X.AnonymousClass0AN.A00(r13)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r12.this$0
            X.00s r6 = r0.A0R
            X.35m r10 = r0.A0j
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r0 = r0.A0d
            X.3KF r5 = r0.A0S()
            X.1HT r1 = r10.A00
            X.13z r0 = X.C223613z.A00
            java.util.ArrayList r4 = r1.A03(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetMyStatusStateUseCase/invoke "
            X.C36321k7.A1K(r4, r0, r1)
            java.util.LinkedHashSet r9 = X.C36441kJ.A17()
            java.util.LinkedHashSet r8 = X.C36441kJ.A17()
            java.util.LinkedHashSet r7 = X.C36441kJ.A17()
            java.util.LinkedHashSet r3 = X.C36441kJ.A17()
            java.util.Iterator r11 = r4.iterator()
        L_0x0038:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x008f
            X.3T1 r2 = X.C36391kE.A0l(r11)
            int r1 = r2.A0D
            r0 = 20
            if (r1 == r0) goto L_0x007d
            boolean r0 = X.C66013Ui.A0n(r2)
            if (r0 == 0) goto L_0x0057
            X.3Qa r0 = r2.A1J
            X.AnonymousClass00C.A07(r0)
            r7.add(r0)
            goto L_0x0038
        L_0x0057:
            r0 = 4
            int r0 = X.AnonymousClass3TJ.A00(r1, r0)
            boolean r0 = X.C36401kF.A1U(r0)
            if (r0 == 0) goto L_0x006b
            X.3Qa r0 = r2.A1J
            X.AnonymousClass00C.A07(r0)
            r3.add(r0)
            goto L_0x0038
        L_0x006b:
            boolean r0 = r2 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0086
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r1 = r2.A01
            if (r1 == 0) goto L_0x0086
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0086
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0086
        L_0x007d:
            X.3Qa r0 = r2.A1J
            X.AnonymousClass00C.A07(r0)
            r9.add(r0)
            goto L_0x0038
        L_0x0086:
            X.3Qa r0 = r2.A1J
            X.AnonymousClass00C.A07(r0)
            r8.add(r0)
            goto L_0x0038
        L_0x008f:
            X.3EK r2 = new X.3EK
            r2.<init>(r9, r8, r7, r3)
            X.16E r0 = r10.A01
            X.3Sz r0 = r0.A07()
            if (r0 == 0) goto L_0x00ab
            X.3Sz r1 = r0.A06()
        L_0x00a0:
            X.3EL r0 = new X.3EL
            r0.<init>(r1, r5, r2, r4)
            r6.A0C(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00ab:
            r1 = 0
            goto L_0x00a0
        L_0x00ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshMyStatusState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
