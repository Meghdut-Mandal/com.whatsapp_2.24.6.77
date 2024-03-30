package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C19970wo;
import X.C36321k7;
import X.C63243Jh;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$loadFavoriteSuggestions$1", f = "FavoritePickerViewModel.kt", i = {0, 0}, l = {108}, m = "invokeSuspend", n = {"$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "J$0"})
public final class FavoritePickerViewModel$loadFavoriteSuggestions$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $selectedContacts;
    public long J$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$loadFavoriteSuggestions$1(FavoritePickerViewModel favoritePickerViewModel, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = favoritePickerViewModel;
        this.$selectedContacts = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FavoritePickerViewModel$loadFavoriteSuggestions$1(this.this$0, this.$selectedContacts, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            FavoritePickerViewModel favoritePickerViewModel = this.this$0;
            C19970wo r6 = favoritePickerViewModel.A07;
            List list = this.$selectedContacts;
            long uptimeMillis = SystemClock.uptimeMillis();
            List<C63243Jh> A00 = favoritePickerViewModel.A09.A00();
            favoritePickerViewModel.A00 = A00.size();
            ArrayList A0J = C36321k7.A0J(A00);
            for (C63243Jh r0 : A00) {
                A0J.add(r0.A03);
            }
            FavoritePickerViewModel.A01(favoritePickerViewModel, list, A0J);
            C007403e r02 = favoritePickerViewModel.A04;
            if (r02 != null) {
                this.L$0 = r6;
                this.J$0 = uptimeMillis;
                this.label = 1;
                if (r02.BNp(this) == r7) {
                    return r7;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        SystemClock.uptimeMillis();
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$loadFavoriteSuggestions$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
