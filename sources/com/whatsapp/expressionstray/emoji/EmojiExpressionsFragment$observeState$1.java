package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0R1;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C06830Vg;
import X.C13010j1;
import X.C15390nG;
import X.C164237rU;
import X.C90464aC;
import X.C90514aH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment$observeState$1", f = "EmojiExpressionsFragment.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsFragment$observeState$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $batch;
    public int label;
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsFragment$observeState$1(EmojiExpressionsFragment emojiExpressionsFragment, C023509x r3, int i) {
        super(2, r3);
        this.this$0 = emojiExpressionsFragment;
        this.$batch = i;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EmojiExpressionsFragment$observeState$1(this.this$0, r5, this.$batch);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            EmojiExpressionsViewModel A0c = C90514aH.A0c(this.this$0);
            int i2 = this.$batch;
            C15390nG A0p = C90464aC.A0p(this.this$0, AnonymousClass0R1.A00(A0c.A0B, C06830Vg.A00(new EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1(A0c, (C023509x) null, i2), new C13010j1((C007403e) null, A0c.A08.A01))));
            C164237rU r0 = new C164237rU(this.this$0, 16);
            this.label = 1;
            if (A0p.B36(this, r0) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsFragment$observeState$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
