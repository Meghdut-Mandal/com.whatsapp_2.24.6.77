package com.whatsapp.interopui.compose;

import X.AnonymousClass011;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1", f = "InteropComposeEnterInfoViewModel.kt", i = {1}, l = {39, 45}, m = "invokeSuspend", n = {"userJid"}, s = {"L$0"})
public final class InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass011 $keyPair;
    public final /* synthetic */ List $param;
    public final /* synthetic */ String $userId;
    public Object L$0;
    public int label;
    public final /* synthetic */ InteropComposeEnterInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1(InteropComposeEnterInfoViewModel interopComposeEnterInfoViewModel, String str, List list, AnonymousClass011 r5, C023509x r6) {
        super(2, r6);
        this.this$0 = interopComposeEnterInfoViewModel;
        this.$param = list;
        this.$keyPair = r5;
        this.$userId = str;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1(this.this$0, this.$userId, this.$param, this.$keyPair, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r5) goto L_0x004b
            if (r0 != r7) goto L_0x00b3
            java.lang.Object r5 = r8.L$0
            X.AnonymousClass0AN.A00(r9)
        L_0x0011:
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r0 = r8.this$0
            X.00s r3 = r0.A01
            X.2oM r2 = X.C51772oM.SUCCESS
            r1 = 0
            X.3JA r0 = new X.3JA
            r0.<init>(r2, r1, r5)
            r3.A0C(r0)
        L_0x0020:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0023:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r0 = r8.this$0
            X.00s r2 = r0.A01
            X.2oM r1 = X.C51772oM.LOADING
            r4 = 0
            X.3JA r0 = new X.3JA
            r0.<init>(r1, r4, r4)
            r2.A0C(r0)
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r0 = r8.this$0
            X.1eG r3 = r0.A03
            java.util.List r2 = r8.$param
            r8.label = r5
            X.02l r1 = r3.A05
            com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2
            r0.<init>(r3, r2, r4)
            java.lang.Object r9 = X.AnonymousClass0A2.A00(r8, r1, r0)
            if (r9 != r6) goto L_0x004e
            return r6
        L_0x004b:
            X.AnonymousClass0AN.A00(r9)
        L_0x004e:
            X.2tO r9 = (X.C54712tO) r9
            boolean r0 = r9 instanceof X.AnonymousClass2X2
            if (r0 == 0) goto L_0x009d
            X.2X2 r9 = (X.AnonymousClass2X2) r9
            java.util.Map r1 = r9.A02
            X.011 r0 = r8.$keyPair
            java.lang.Object r5 = r1.get(r0)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            if (r5 == 0) goto L_0x0079
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r4 = r8.this$0
            X.02l r3 = r4.A04
            java.lang.String r2 = r8.$userId
            r1 = 0
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1$1 r0 = new com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1$1
            r0.<init>(r5, r2, r1)
            r8.L$0 = r5
            r8.label = r7
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r3, r0)
            if (r0 != r6) goto L_0x0011
            return r6
        L_0x0079:
            java.util.List r1 = r9.A01
            X.011 r0 = r8.$keyPair
            boolean r3 = r1.contains(r0)
            java.util.List r1 = r9.A00
            X.011 r0 = r8.$keyPair
            boolean r1 = r1.contains(r0)
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r0 = r8.this$0
            X.00s r2 = r0.A01
            if (r3 == 0) goto L_0x0095
            r0 = 1
        L_0x0091:
            X.C51772oM.A00(r2, r0)
            goto L_0x0020
        L_0x0095:
            if (r1 == 0) goto L_0x009a
            r0 = 3
            goto L_0x0091
        L_0x009a:
            r0 = 2
            goto L_0x0091
        L_0x009d:
            boolean r0 = r9 instanceof X.AnonymousClass2X1
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "InteropComposeEnterInfoViewModel/ResolveUserResult error code = "
            r1.append(r0)
            X.2X1 r9 = (X.AnonymousClass2X1) r9
            int r0 = r9.A00
            X.C36351kA.A1R(r1, r0)
            goto L_0x0020
        L_0x00b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
