package com.whatsapp.productinfra.avatar.stickers.search;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass5MK;
import X.AnonymousClass66P;
import X.AnonymousClass683;
import X.C009003v;
import X.C023509x;
import X.C104645Ao;
import X.C111275c1;
import X.C165477tU;
import X.C18740tg;
import X.C36371kC;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2", f = "AvatarStickerSearchProvider.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerSearchProvider$searchAwait$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String[] $query;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C104645Ao this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerSearchProvider$searchAwait$2(C104645Ao r2, C023509x r3, String[] strArr) {
        super(2, r3);
        this.$query = strArr;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerSearchProvider$searchAwait$2(this.this$0, r5, this.$query);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass66P r9;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            String[] strArr = this.$query;
            C104645Ao r2 = this.this$0;
            this.L$0 = strArr;
            this.L$1 = r2;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            int length = strArr.length;
            if (length == 1) {
                String str = strArr[0];
                AnonymousClass00C.A0D(str, 0);
                r9 = r2.A00(str, false, false);
            } else {
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, length);
                AnonymousClass00C.A0D(strArr2, 0);
                r9 = new AnonymousClass66P();
                if (r2.A02) {
                    AnonymousClass683 r4 = r2.A03;
                    C165477tU r1 = new C165477tU(r9, 1);
                    C18740tg.A01();
                    Set set = r4.A09;
                    AnonymousClass5MK r22 = new AnonymousClass5MK(r4, r1, r4.A06, true);
                    r4.A08.Box(r22, Arrays.copyOf(strArr2, strArr2.length));
                    set.add(r22);
                }
            }
            r9.A00(new C111275c1(A12, 1));
            obj = A12.A0G();
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerSearchProvider$searchAwait$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
