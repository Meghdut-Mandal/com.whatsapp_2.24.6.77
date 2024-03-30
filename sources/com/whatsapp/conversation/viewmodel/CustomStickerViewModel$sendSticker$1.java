package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass1XQ;
import X.AnonymousClass3S2;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C36381kD;
import X.C39901uB;
import X.C64793Pl;
import X.C80403vL;
import android.graphics.Bitmap;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1", f = "CustomStickerViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class CustomStickerViewModel$sendSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public int label;
    public final /* synthetic */ C39901uB this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1$1", f = "CustomStickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.viewmodel.CustomStickerViewModel$sendSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r2, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                Bitmap bitmap = ((C64793Pl) C39901uB.this.A09.getValue()).A00;
                if (bitmap != null) {
                    C39901uB r5 = C39901uB.this;
                    AnonymousClass11F r4 = r2;
                    C135066c4 A01 = r5.A06.A01(bitmap, C36381kD.A0y(r5.A01));
                    A01.A04 = new AnonymousClass3S2((String) null, (String) null, r5.A04.A01(R.string.f12nameremoved), (String) null, (String) null, (String) null, (AnonymousClass1XQ[]) null, 5, false, true, false, false, false, false);
                    r5.A06.A03(A01);
                    r5.A02.A0H(new C80403vL(r5, A01, r4, 26));
                    C39901uB.A01(r5);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStickerViewModel$sendSticker$1(C39901uB r2, AnonymousClass11F r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$chatJid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CustomStickerViewModel$sendSticker$1(this.this$0, this.$chatJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C39901uB r4 = this.this$0;
            C005502l r3 = r4.A07;
            final AnonymousClass11F r2 = this.$chatJid;
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
        return ((CustomStickerViewModel$sendSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
