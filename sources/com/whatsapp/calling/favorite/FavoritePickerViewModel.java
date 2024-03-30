package com.whatsapp.calling.favorite;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass040;
import X.AnonymousClass04R;
import X.AnonymousClass0A2;
import X.AnonymousClass0A6;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass4F5;
import X.AnonymousClass4PS;
import X.C005502l;
import X.C007403e;
import X.C023109s;
import X.C023409w;
import X.C023509x;
import X.C109325Xd;
import X.C19970wo;
import X.C34641hP;
import X.C36321k7;
import X.C36431kI;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class FavoritePickerViewModel extends AnonymousClass04R {
    public int A00;
    public List A01;
    public List A02;
    public C007403e A03;
    public C007403e A04;
    public List A05;
    public final AnonymousClass16D A06;
    public final C19970wo A07;
    public final AnonymousClass17X A08;
    public final C34641hP A09;
    public final AnonymousClass00T A0A;
    public final C005502l A0B;
    public final C005502l A0C;

    public static final void A01(FavoritePickerViewModel favoritePickerViewModel, List list, List list2) {
        if (!AnonymousClass00C.A0J(list, favoritePickerViewModel.A05) || !AnonymousClass00C.A0J(list2, favoritePickerViewModel.A01)) {
            favoritePickerViewModel.A01 = list2;
            AnonymousClass040 A002 = C109325Xd.A00(favoritePickerViewModel);
            AnonymousClass0A6 A022 = AnonymousClass0A2.A02(C023109s.A00, favoritePickerViewModel.A0B, new FavoritePickerViewModel$filterOutAddedFavorites$1(favoritePickerViewModel, list, list2, (C023509x) null), A002);
            C007403e r1 = favoritePickerViewModel.A04;
            if (r1 != null) {
                r1.B2S((CancellationException) null);
            }
            favoritePickerViewModel.A04 = A022;
        }
    }

    public final void A0S(List list) {
        if (!AnonymousClass00C.A0J(list, this.A05)) {
            this.A05 = list;
            AnonymousClass040 A002 = C109325Xd.A00(this);
            AnonymousClass0A6 A022 = AnonymousClass0A2.A02(C023109s.A00, this.A0B, new FavoritePickerViewModel$loadFavoriteSuggestions$1(this, list, (C023509x) null), A002);
            C007403e r1 = this.A03;
            if (r1 != null) {
                r1.B2S((CancellationException) null);
            }
            this.A03 = A022;
        }
    }

    public FavoritePickerViewModel(AnonymousClass4PS r2, AnonymousClass16D r3, C19970wo r4, AnonymousClass17X r5, C34641hP r6, C005502l r7, C005502l r8) {
        C36321k7.A1B(r3, r6, r4, r5, r2);
        C36321k7.A10(r7, r8);
        this.A06 = r3;
        this.A09 = r6;
        this.A07 = r4;
        this.A08 = r5;
        this.A0B = r7;
        this.A0C = r8;
        C023409w r0 = C023409w.A00;
        A0S(r0);
        A01(this, r0, r0);
        this.A0A = C36431kI.A1I(new AnonymousClass4F5(r2, this));
    }
}
