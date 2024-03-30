package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onStickerSelected$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {225, 234}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$onStickerSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C135066c4 $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$onStickerSelected$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C135066c4 r3, Integer num, C023509x r5, int i) {
        super(2, r5);
        this.this$0 = avatarExpressionsViewModel;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
        this.$position = i;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new AvatarExpressionsViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r3) goto L_0x0074
            if (r0 != r5) goto L_0x00b1
            X.AnonymousClass0AN.A00(r9)
        L_0x000f:
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            r2 = 7
            X.63V r1 = r0.A04
            X.55M r0 = X.AnonymousClass55M.A00
            r1.A00(r0, r0, r2)
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.6O1 r2 = r0.A02
            r1 = 3
            java.lang.Integer r0 = X.C90524aI.A0a(r1)
            r2.A02(r0, r3, r1)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0028:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.1Bv r1 = r0.A08
            X.6c4 r0 = r8.$sticker
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x008a
            X.1Bt r0 = r1.A01
            X.00T r0 = r0.A01
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "pref_key_avatar_soc_warning_shown"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x008a
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.1Bv r0 = r0.A08
            X.0yC r1 = r0.A00
            r0 = 7757(0x1e4d, float:1.087E-41)
            java.lang.String r6 = r1.A09(r0)
            X.AnonymousClass00C.A0B(r6)
            int r0 = r6.length()
            if (r0 == 0) goto L_0x008a
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.05J r2 = r0.A0H
            X.554 r1 = new X.554
            r1.<init>(r6)
            r8.L$0 = r6
            r8.L$1 = r0
            r8.label = r3
            java.lang.Object r1 = r2.B6N(r1, r8)
            if (r1 != r4) goto L_0x007b
            return r4
        L_0x0074:
            java.lang.Object r0 = r8.L$1
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r0
            X.AnonymousClass0AN.A00(r9)
        L_0x007b:
            X.1Bv r0 = r0.A08
            X.1Bt r0 = r0.A01
            X.00T r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r0)
            java.lang.String r0 = "pref_key_avatar_soc_warning_shown"
            X.C36331k8.A0w(r1, r0, r3)
        L_0x008a:
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.1C2 r1 = r0.A0A
            X.6c4 r0 = r8.$sticker
            X.6c4 r7 = r1.A01(r0)
            if (r7 == 0) goto L_0x000f
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.05J r6 = r0.A0H
            java.lang.Integer r2 = r8.$stickerSendOrigin
            int r0 = r8.$position
            X.555 r1 = new X.555
            r1.<init>(r7, r2, r0)
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r5
            java.lang.Object r0 = r6.B6N(r1, r8)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onStickerSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$onStickerSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
