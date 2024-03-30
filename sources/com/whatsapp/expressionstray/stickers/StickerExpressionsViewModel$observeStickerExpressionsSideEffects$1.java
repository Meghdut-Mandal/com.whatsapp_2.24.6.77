package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass56N;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C1037156p;
import X.C109325Xd;
import X.C110785bE;
import X.C36331k8;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C006302t {
        public int label;

        public final C023509x create(C023509x r4) {
            return new AnonymousClass1(r1, r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ((AnonymousClass1) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass05J r2 = StickerExpressionsViewModel.this.A0e;
                AnonymousClass56N r0 = new AnonymousClass56N(((C1037156p) r1).A00);
                this.label = 1;
                if (r2.B6N(r0, this) == r4) {
                    return r4;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1 = new StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1(this.this$0, r4);
        stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1.L$0 = obj;
        return stickerExpressionsViewModel$observeStickerExpressionsSideEffects$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            final C110785bE r1 = (C110785bE) this.L$0;
            if (r1 instanceof C1037156p) {
                final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
                AnonymousClass1 r2 = new AnonymousClass1((C023509x) null);
                C36331k8.A1T(new StickerExpressionsViewModel$launchAfterDataLoad$1(stickerExpressionsViewModel, (C023509x) null, r2), C109325Xd.A00(stickerExpressionsViewModel));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$observeStickerExpressionsSideEffects$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
