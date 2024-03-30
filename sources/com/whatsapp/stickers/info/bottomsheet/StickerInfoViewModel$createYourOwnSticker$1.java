package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass3XM;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C28201Rs;
import X.C47662fQ;
import X.C47692fT;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$createYourOwnSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$createYourOwnSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public final /* synthetic */ int $origin;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$createYourOwnSticker$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$createYourOwnSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(stickerInfoViewModel, r6, i2);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C28201Rs r3;
            Object r2;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass11F r1 = AnonymousClass11F.this;
                StickerInfoViewModel stickerInfoViewModel = stickerInfoViewModel;
                if (r1 == null) {
                    r3 = stickerInfoViewModel.A09;
                    r2 = C47692fT.A00;
                } else {
                    AnonymousClass141 r0 = stickerInfoViewModel.A00;
                    boolean z = true;
                    if (r0 == null || !r0.A0G()) {
                        z = false;
                    }
                    AnonymousClass141 r02 = stickerInfoViewModel.A00;
                    if (r02 != null) {
                        str = r02.A0J();
                    } else {
                        str = null;
                    }
                    AnonymousClass3XM r12 = new AnonymousClass3XM(Boolean.valueOf(z), str, AnonymousClass11F.this.getRawString());
                    r3 = stickerInfoViewModel.A09;
                    r2 = new C47662fQ(r12, i2);
                }
                r3.A0C(r2);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$createYourOwnSticker$1(AnonymousClass11F r2, StickerInfoViewModel stickerInfoViewModel, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = stickerInfoViewModel;
        this.$chatJid = r2;
        this.$origin = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerInfoViewModel$createYourOwnSticker$1(this.$chatJid, this.this$0, r6, this.$origin);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r4 = stickerInfoViewModel.A0H;
            final AnonymousClass11F r3 = this.$chatJid;
            final int i2 = this.$origin;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$createYourOwnSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
