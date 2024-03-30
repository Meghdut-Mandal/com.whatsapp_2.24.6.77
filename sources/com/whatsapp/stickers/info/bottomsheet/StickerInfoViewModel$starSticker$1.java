package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C36371kC;
import X.C47682fS;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$starSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$starSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$starSticker$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$starSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r2, stickerInfoViewModel, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                stickerInfoViewModel.A07.A0F(C36371kC.A11(r2), true);
                stickerInfoViewModel.A09.A0C(C47682fS.A00);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$starSticker$1(C135066c4 r2, StickerInfoViewModel stickerInfoViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = stickerInfoViewModel;
        this.$sticker = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StickerInfoViewModel$starSticker$1(this.$sticker, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r3 = stickerInfoViewModel.A0H;
            final C135066c4 r2 = this.$sticker;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$starSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
