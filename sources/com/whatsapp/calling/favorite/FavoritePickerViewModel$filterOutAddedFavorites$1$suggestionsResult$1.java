package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass63R;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1", f = "FavoritePickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $alreadyAddedFavorites;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1(FavoritePickerViewModel favoritePickerViewModel, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = favoritePickerViewModel;
        this.$alreadyAddedFavorites = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1(this.this$0, this.$alreadyAddedFavorites, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return ((AnonymousClass63R) this.this$0.A0A.getValue()).A00(this.$alreadyAddedFavorites);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
