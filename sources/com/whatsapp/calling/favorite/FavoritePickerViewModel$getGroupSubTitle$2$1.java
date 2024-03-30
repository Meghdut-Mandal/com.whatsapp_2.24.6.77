package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass144;
import X.AnonymousClass171;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$getGroupSubTitle$2$1", f = "FavoritePickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePickerViewModel$getGroupSubTitle$2$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass144 $it;
    public final /* synthetic */ AnonymousClass171 $waContactNames;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$getGroupSubTitle$2$1(AnonymousClass171 r2, AnonymousClass144 r3, C023509x r4) {
        super(2, r4);
        this.$waContactNames = r2;
        this.$it = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoritePickerViewModel$getGroupSubTitle$2$1(this.$waContactNames, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return AnonymousClass171.A04(this.$waContactNames, this.$it, -1, true);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$getGroupSubTitle$2$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
