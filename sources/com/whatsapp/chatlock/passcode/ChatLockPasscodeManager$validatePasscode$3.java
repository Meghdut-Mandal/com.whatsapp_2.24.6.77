package com.whatsapp.chatlock.passcode;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C63603Kr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3", f = "ChatLockPasscodeManager.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$validatePasscode$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $attempt;
    public int label;
    public final /* synthetic */ C63603Kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$validatePasscode$3(C63603Kr r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$attempt = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ChatLockPasscodeManager$validatePasscode$3(this.this$0, this.$attempt, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r1 != r4.A01) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        r0 = X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 == r3) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        if (r0 != r3) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r2 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r2) goto L_0x000a
            goto L_0x0080
        L_0x000a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x000f:
            X.AnonymousClass0AN.A00(r13)
            X.3Kr r0 = r12.this$0     // Catch:{ Exception -> 0x0090 }
            X.1Hn r0 = r0.A02     // Catch:{ Exception -> 0x0090 }
            X.8Qp r5 = r0.A00()     // Catch:{ Exception -> 0x0090 }
            if (r5 == 0) goto L_0x0089
            java.lang.String r9 = r12.$attempt     // Catch:{ Exception -> 0x0090 }
            X.3Kr r4 = r12.this$0     // Catch:{ Exception -> 0x0090 }
            X.9dW r6 = X.C198419dW.A00     // Catch:{ Exception -> 0x0090 }
            int r0 = r5.encoding_     // Catch:{ Exception -> 0x0090 }
            if (r0 == 0) goto L_0x002d
            X.2pw r7 = X.C52642pw.A01     // Catch:{ Exception -> 0x0090 }
        L_0x0028:
            int r0 = r5.transformer_     // Catch:{ Exception -> 0x0090 }
            if (r0 == 0) goto L_0x0035
            goto L_0x0030
        L_0x002d:
            X.2pw r7 = X.C52642pw.A01     // Catch:{ Exception -> 0x0090 }
            goto L_0x0028
        L_0x0030:
            if (r0 == r2) goto L_0x0038
            X.2q3 r8 = X.C52712q3.NONE     // Catch:{ Exception -> 0x0090 }
            goto L_0x003a
        L_0x0035:
            X.2q3 r8 = X.C52712q3.NONE     // Catch:{ Exception -> 0x0090 }
            goto L_0x003a
        L_0x0038:
            X.2q3 r8 = X.C52712q3.PBKDF2_HMAC_SHA512     // Catch:{ Exception -> 0x0090 }
        L_0x003a:
            X.AUx r0 = r5.transformedData_     // Catch:{ Exception -> 0x0090 }
            int r11 = r0.A02()     // Catch:{ Exception -> 0x0090 }
            X.B6c r10 = r5.transformerArg_     // Catch:{ Exception -> 0x0090 }
            X.AnonymousClass00C.A08(r10)     // Catch:{ Exception -> 0x0090 }
            X.8Qp r0 = r6.A01(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0090 }
            X.AUx r1 = r0.transformedData_     // Catch:{ Exception -> 0x0090 }
            X.AUx r0 = r5.transformedData_     // Catch:{ Exception -> 0x0090 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ Exception -> 0x0090 }
            if (r0 == 0) goto L_0x0086
            r12.label = r2     // Catch:{ Exception -> 0x0090 }
            X.2pw r0 = r4.A00     // Catch:{ Exception -> 0x0090 }
            if (r7 != r0) goto L_0x006b
            int r0 = r5.transformer_     // Catch:{ Exception -> 0x0090 }
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x0065
            X.2q3 r1 = X.C52712q3.NONE     // Catch:{ Exception -> 0x0090 }
            goto L_0x0067
        L_0x0062:
            X.2q3 r1 = X.C52712q3.NONE     // Catch:{ Exception -> 0x0090 }
            goto L_0x0067
        L_0x0065:
            X.2q3 r1 = X.C52712q3.PBKDF2_HMAC_SHA512     // Catch:{ Exception -> 0x0090 }
        L_0x0067:
            X.2q3 r0 = r4.A01     // Catch:{ Exception -> 0x0090 }
            if (r1 == r0) goto L_0x0078
        L_0x006b:
            X.02l r2 = r4.A04     // Catch:{ Exception -> 0x0090 }
            r1 = 0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3 r0 = new com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3     // Catch:{ Exception -> 0x0090 }
            r0.<init>(r4, r9, r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r12, r2, r0)     // Catch:{ Exception -> 0x0090 }
            goto L_0x007b
        L_0x0078:
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ Exception -> 0x0090 }
            goto L_0x007d
        L_0x007b:
            if (r0 != r3) goto L_0x0078
        L_0x007d:
            if (r0 != r3) goto L_0x0083
            return r3
        L_0x0080:
            X.AnonymousClass0AN.A00(r13)     // Catch:{ Exception -> 0x0090 }
        L_0x0083:
            X.2Ec r1 = X.AnonymousClass2Ec.A00     // Catch:{ Exception -> 0x0090 }
            return r1
        L_0x0086:
            X.2Eb r1 = X.AnonymousClass2Eb.A00     // Catch:{ Exception -> 0x0090 }
            return r1
        L_0x0089:
            r0 = 4
            X.2Ea r1 = new X.2Ea     // Catch:{ Exception -> 0x0090 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0090 }
            return r1
        L_0x0090:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatLockPasscodeManager/validatePasscode: "
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r2)
            java.lang.Throwable r0 = r2.getCause()
            com.whatsapp.util.Log.e(r1, r0)
            r0 = 0
            X.2Ea r1 = new X.2Ea
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$validatePasscode$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
