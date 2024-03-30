package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$loadFavorites$1", f = "FavoriteCallListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListViewModel$loadFavorites$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ FavoriteCallListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListViewModel$loadFavorites$1(FavoriteCallListViewModel favoriteCallListViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = favoriteCallListViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FavoriteCallListViewModel$loadFavorites$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FavoriteCallListViewModel$loadFavorites$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            FavoriteCallListViewModel favoriteCallListViewModel = this.this$0;
            favoriteCallListViewModel.A0A.setValue(favoriteCallListViewModel.A03.A00());
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
