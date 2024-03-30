package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass1BF;
import X.C009003v;
import X.C023509x;
import X.C24261Bt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2", f = "AvatarConfigRepository.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarConfigRepository$hasAvatarAwait$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C24261Bt $avatarSharedPreferences;
    public final /* synthetic */ boolean $skipCache;
    public int label;
    public final /* synthetic */ AnonymousClass1BF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarConfigRepository$hasAvatarAwait$2(AnonymousClass1BF r2, C24261Bt r3, C023509x r4, boolean z) {
        super(2, r4);
        this.$avatarSharedPreferences = r3;
        this.$skipCache = z;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AvatarConfigRepository$hasAvatarAwait$2(this.this$0, this.$avatarSharedPreferences, r6, this.$skipCache);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r2 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r4) goto L_0x0076
            X.AnonymousClass0AN.A00(r7)
        L_0x000c:
            X.5c9 r7 = (X.C111355c9) r7
            boolean r0 = r7 instanceof X.C105865Hg
            if (r0 == 0) goto L_0x0038
            X.5Hg r7 = (X.C105865Hg) r7
            java.lang.Object r1 = r7.A00
            X.6bG r1 = (X.C134576bG) r1
            if (r1 == 0) goto L_0x004c
            X.1BF r0 = r6.this$0
            X.004 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Bt r0 = (X.C24261Bt) r0
            boolean r2 = r1.A00
            X.00T r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r0)
            java.lang.String r0 = "pref_has_avatar_config"
            X.C36331k8.A0w(r1, r0, r2)
            if (r2 == 0) goto L_0x004c
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            return r1
        L_0x0038:
            boolean r0 = r7 instanceof X.C105855Hf
            if (r0 == 0) goto L_0x0071
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AvatarConfigRepository/hasAvatarWithCoroutines"
            r1.append(r0)
            X.5Hf r7 = (X.C105855Hf) r7
            java.lang.Object r0 = r7.A00
            X.C36331k8.A1P(r0, r1)
        L_0x004c:
            r4 = 0
            goto L_0x0033
        L_0x004e:
            X.AnonymousClass0AN.A00(r7)
            X.1Bt r0 = r6.$avatarSharedPreferences
            java.lang.Boolean r1 = r0.A00()
            boolean r0 = r6.$skipCache
            if (r0 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            return r1
        L_0x005e:
            X.1BF r3 = r6.this$0
            r6.label = r4
            X.02l r2 = r3.A02
            r1 = 0
            com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2 r0 = new com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2
            r0.<init>(r3, r1)
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r7 != r5) goto L_0x000c
            return r5
        L_0x0071:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarConfigRepository$hasAvatarAwait$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
