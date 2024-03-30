package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiSelected$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {320, 334, 345, 359}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$onEmojiSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$onEmojiSelected$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C023509x r3, int[] iArr, int i) {
        super(2, r3);
        this.$emoji = iArr;
        this.this$0 = emojiExpressionsViewModel;
        this.$position = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new EmojiExpressionsViewModel$onEmojiSelected$1(this.this$0, r6, this.$emoji, this.$position);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r5 = 3
            r6 = 2
            r4 = 4
            r7 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r7) goto L_0x002b
            if (r0 == r6) goto L_0x002b
            if (r0 == r5) goto L_0x002b
            if (r0 != r4) goto L_0x00ed
            X.AnonymousClass0AN.A00(r9)
        L_0x0015:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            r2 = 7
            X.63V r1 = r0.A06
            X.55N r0 = X.AnonymousClass55N.A00
            r1.A00(r0, r0, r2)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.6O1 r1 = r0.A02
            r0 = 17
            X.AnonymousClass6O1.A00(r1, r0, r4)
        L_0x0028:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x002b:
            X.AnonymousClass0AN.A00(r9)
            goto L_0x0028
        L_0x002f:
            X.AnonymousClass0AN.A00(r9)
            int[] r0 = r8.$emoji
            boolean r0 = X.AnonymousClass3UO.A02(r0)
            if (r0 == 0) goto L_0x0066
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.0wg r1 = r0.A09
            int[] r2 = r8.$emoji
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r1.A00(r0)
            java.lang.String r0 = X.AnonymousClass3TY.A00(r2)
            boolean r1 = r1.contains(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 != 0) goto L_0x00bf
            X.0sR r4 = r0.A00
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.55S r2 = new X.55S
            r2.<init>(r1, r0)
            r8.label = r7
        L_0x005f:
            java.lang.Object r0 = r4.Bpf(r2, r8)
        L_0x0063:
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x0066:
            int[] r0 = r8.$emoji
            boolean r0 = X.AnonymousClass3UO.A03(r0)
            if (r0 == 0) goto L_0x00ce
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.0v0 r0 = r0.A01
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "skin_emoji_tip"
            int r2 = X.C36371kC.A01(r1, r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r2 >= r7) goto L_0x0097
            X.0v0 r1 = r0.A01
            int r0 = r2 + 1
            r1.A1F(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.0sR r4 = r0.A00
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.55U r2 = new X.55U
            r2.<init>(r1, r0)
            r8.label = r6
            goto L_0x005f
        L_0x0097:
            X.0wg r1 = r0.A09
            int[] r2 = r8.$emoji
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r1.A00(r0)
            java.lang.String r0 = X.AnonymousClass3TY.A01(r2)
            boolean r1 = r1.contains(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 != 0) goto L_0x00c7
            X.0sR r4 = r0.A00
            int[] r2 = r8.$emoji
            int r1 = r8.$position
            X.55T r0 = new X.55T
            r0.<init>(r2, r1)
            r8.label = r5
            java.lang.Object r0 = r4.Bpf(r0, r8)
            goto L_0x0063
        L_0x00bf:
            X.0wg r1 = r0.A09
            int[] r0 = r8.$emoji
            X.AnonymousClass3TY.A02(r1, r0)
            goto L_0x00ce
        L_0x00c7:
            X.0wg r1 = r0.A09
            int[] r0 = r8.$emoji
            X.AnonymousClass3TY.A03(r1, r0)
        L_0x00ce:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.1XN r1 = r0.A03
            int[] r0 = r8.$emoji
            r1.A09(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.5lp r0 = r0.A04
            X.05J r2 = r0.A00
            int[] r1 = r8.$emoji
            X.550 r0 = new X.550
            r0.<init>(r1)
            r8.label = r4
            java.lang.Object r0 = r2.B6N(r0, r8)
            if (r0 != r3) goto L_0x0015
            return r3
        L_0x00ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsViewModel$onEmojiSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
