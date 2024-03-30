package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1XQ;
import X.C005502l;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C123875xE;
import X.C129196Ft;
import X.C146786wA;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$createEmojiShape$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ C006302t $onShapeReady;
    public int label;
    public final /* synthetic */ C123875xE this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(B4v, r5, r22);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                r22.invoke(B4v);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$createEmojiShape$1(Context context, C123875xE r3, C023509x r4, C006302t r5, int[] iArr) {
        super(2, r4);
        this.$emoji = iArr;
        this.this$0 = r3;
        this.$context = context;
        this.$onShapeReady = r5;
    }

    public final C023509x create(Object obj, C023509x r8) {
        int[] iArr = this.$emoji;
        return new ExpressionsShapeCreator$createEmojiShape$1(this.$context, this.this$0, r8, this.$onShapeReady, iArr);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1XQ r2 = new AnonymousClass1XQ(this.$emoji);
            C123875xE r1 = this.this$0;
            final C129196Ft B4v = new C146786wA(r2, r1.A01).B4v(this.$context, r1.A00, false);
            C005502l r3 = this.this$0.A05;
            final C006302t r22 = this.$onShapeReady;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsShapeCreator$createEmojiShape$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
