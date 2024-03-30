package com.whatsapp.companiondevice.hosteddevicepairing;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C107995Rt;
import X.C23931Ak;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.hosteddevicepairing.HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1", f = "HostedDeviceAccountEncryptionTypeTransitionController.kt", i = {0}, l = {54}, m = "invokeSuspend", n = {"hasTaskFailure"}, s = {"I$0"})
public final class HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $accountTransitionCallback;
    public final /* synthetic */ C107995Rt $encryptionTypeTransition;
    public final /* synthetic */ C23931Ak $tasks;
    public int I$0;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1(C23931Ak r2, C107995Rt r3, C023509x r4, C009003v r5) {
        super(2, r4);
        this.$tasks = r2;
        this.$encryptionTypeTransition = r3;
        this.$accountTransitionCallback = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1(this.$tasks, this.$encryptionTypeTransition, r6, this.$accountTransitionCallback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r4) goto L_0x0058
            int r3 = r6.I$0
            java.lang.Object r2 = r6.L$0
            X.14x r2 = (X.C225614x) r2
            X.AnonymousClass0AN.A00(r7)
        L_0x0012:
            X.5pt r7 = (X.C119485pt) r7
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0030
            X.5Sd r2 = r7.A00
            X.03v r1 = r6.$accountTransitionCallback
            java.lang.Boolean r0 = X.C36381kD.A0j()
            r1.invoke(r0, r2)
        L_0x0023:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0026:
            X.AnonymousClass0AN.A00(r7)
            X.1Ak r0 = r6.$tasks
            X.14x r2 = r0.iterator()
            r3 = 0
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r2.next()
            X.1OJ r1 = (X.AnonymousClass1OJ) r1
            X.5Rt r0 = r6.$encryptionTypeTransition
            r6.L$0 = r2
            r6.I$0 = r3
            r6.label = r4
            java.lang.Object r7 = r1.Bot(r0, r6)
            if (r7 != r5) goto L_0x0012
            return r5
        L_0x004b:
            if (r3 != 0) goto L_0x0023
            X.03v r2 = r6.$accountTransitionCallback
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0 = 0
            r2.invoke(r1, r0)
            goto L_0x0023
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.hosteddevicepairing.HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
