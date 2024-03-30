package com.whatsapp.calling.avatar.camera;

import X.AnonymousClass17Y;
import X.C36321k7;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

public final class InitializeAvatarEffectUseCase {
    public final AnonymousClass17Y A00;
    public final VoipCameraManager A01;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[SYNTHETIC, Splitter:B:18:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095 A[Catch:{ CancellationException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C119345pf r11, X.C128656Dc r12, X.C023509x r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.AnonymousClass7B8
            if (r0 == 0) goto L_0x0031
            r6 = r13
            X.7B8 r6 = (X.AnonymousClass7B8) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 == r4) goto L_0x0040
            if (r0 != r5) goto L_0x003b
            int r8 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r11 = r6.L$2
            X.5pf r11 = (X.C119345pf) r11
            java.lang.Object r12 = r6.L$1
            X.6Dc r12 = (X.C128656Dc) r12
            java.lang.Object r2 = r6.L$0
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r2 = (com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase) r2
            goto L_0x0037
        L_0x0031:
            X.7B8 r6 = new X.7B8
            r6.<init>(r10, r13)
            goto L_0x0012
        L_0x0037:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ CancellationException -> 0x00b9 }
            goto L_0x00ac
        L_0x003b:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0e()
            throw r1
        L_0x0040:
            int r9 = r6.I$2
            int r8 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r11 = r6.L$2
            X.5pf r11 = (X.C119345pf) r11
            java.lang.Object r12 = r6.L$1
            X.6Dc r12 = (X.C128656Dc) r12
            java.lang.Object r2 = r6.L$0
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r2 = (com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase) r2
            goto L_0x0089
        L_0x0053:
            X.AnonymousClass0AN.A00(r1)
            r2 = r10
            r9 = 0
            r3 = 3
        L_0x0059:
            if (r9 >= r3) goto L_0x00b1
            r6.L$0 = r2     // Catch:{ CancellationException -> 0x00b9 }
            r6.L$1 = r12     // Catch:{ CancellationException -> 0x00b9 }
            r6.L$2 = r11     // Catch:{ CancellationException -> 0x00b9 }
            r6.I$0 = r3     // Catch:{ CancellationException -> 0x00b9 }
            r6.I$1 = r9     // Catch:{ CancellationException -> 0x00b9 }
            r6.I$2 = r9     // Catch:{ CancellationException -> 0x00b9 }
            r6.label = r4     // Catch:{ CancellationException -> 0x00b9 }
            X.0AR r8 = X.C36371kC.A12(r6)     // Catch:{ CancellationException -> 0x00b9 }
            X.6yu r1 = new X.6yu     // Catch:{ CancellationException -> 0x00b9 }
            r1.<init>(r2, r11, r8)     // Catch:{ CancellationException -> 0x00b9 }
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A01     // Catch:{ CancellationException -> 0x00b9 }
            boolean r0 = r0.enableAREffect(r12, r1)     // Catch:{ CancellationException -> 0x00b9 }
            if (r0 != 0) goto L_0x0081
            java.lang.Boolean r0 = X.C36381kD.A0j()     // Catch:{ CancellationException -> 0x00b9 }
            r8.resumeWith(r0)     // Catch:{ CancellationException -> 0x00b9 }
        L_0x0081:
            java.lang.Object r1 = r8.A0G()     // Catch:{ CancellationException -> 0x00b9 }
            if (r1 == r7) goto L_0x00b0
            r8 = r9
            goto L_0x008c
        L_0x0089:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ CancellationException -> 0x00b9 }
        L_0x008c:
            boolean r0 = X.AnonymousClass000.A1X(r1)     // Catch:{ CancellationException -> 0x00b9 }
            if (r0 == 0) goto L_0x0095
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ CancellationException -> 0x00b9 }
            return r0
        L_0x0095:
            if (r9 >= r5) goto L_0x00ac
            r0 = 200(0xc8, double:9.9E-322)
            r6.L$0 = r2     // Catch:{ CancellationException -> 0x00b9 }
            r6.L$1 = r12     // Catch:{ CancellationException -> 0x00b9 }
            r6.L$2 = r11     // Catch:{ CancellationException -> 0x00b9 }
            r6.I$0 = r3     // Catch:{ CancellationException -> 0x00b9 }
            r6.I$1 = r8     // Catch:{ CancellationException -> 0x00b9 }
            r6.label = r5     // Catch:{ CancellationException -> 0x00b9 }
            java.lang.Object r0 = X.C07330Xf.A00(r6, r0)     // Catch:{ CancellationException -> 0x00b9 }
            if (r0 != r7) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            int r9 = r8 + 1
            goto L_0x0059
        L_0x00af:
            return r7
        L_0x00b0:
            return r7
        L_0x00b1:
            java.lang.String r0 = "voip/InitializeAvatarEffectUseCase/invoke All attempts to enable AR effect failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ CancellationException -> 0x00b9 }
            X.529 r0 = X.AnonymousClass529.A00     // Catch:{ CancellationException -> 0x00b9 }
            throw r0     // Catch:{ CancellationException -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A01
            boolean r0 = r0.disableAREffect()
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = "voip/InitializeAvatarEffectUseCase/invoke Disabling during cancellation failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.79N r0 = new X.79N
            r0.<init>(r1)
            throw r0
        L_0x00cd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase.A00(X.5pf, X.6Dc, X.09x):java.lang.Object");
    }

    public InitializeAvatarEffectUseCase(AnonymousClass17Y r1, VoipCameraManager voipCameraManager) {
        C36321k7.A0x(r1, voipCameraManager);
        this.A00 = r1;
        this.A01 = voipCameraManager;
    }
}
