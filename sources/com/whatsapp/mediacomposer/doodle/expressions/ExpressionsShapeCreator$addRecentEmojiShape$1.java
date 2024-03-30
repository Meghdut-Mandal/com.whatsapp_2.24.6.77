package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1XQ;
import X.C009003v;
import X.C023509x;
import X.C123875xE;
import X.C146786wA;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentEmojiShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$addRecentEmojiShape$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int[] $emoji;
    public int label;
    public final /* synthetic */ C123875xE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$addRecentEmojiShape$1(C123875xE r2, C023509x r3, int[] iArr) {
        super(2, r3);
        this.$emoji = iArr;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsShapeCreator$addRecentEmojiShape$1(this.this$0, r5, this.$emoji);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1XQ r3 = new AnonymousClass1XQ(this.$emoji);
            C123875xE r2 = this.this$0;
            r2.A02.A0C(new C146786wA(r3, r2.A01));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsShapeCreator$addRecentEmojiShape$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
