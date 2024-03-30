package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass144;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.C007103b;
import X.C019408g;
import X.C023509x;
import X.C19730wQ;
import X.C20810yC;
import X.C232317r;
import X.C34681hT;
import X.C36321k7;
import X.C52312pE;
import X.C63243Jh;
import X.C69743e1;
import X.C69753e2;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$favorites$1", f = "FavoriteCallListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListViewModel$favorites$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ FavoriteCallListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListViewModel$favorites$1(FavoriteCallListViewModel favoriteCallListViewModel, C023509x r3) {
        super(3, r3);
        this.this$0 = favoriteCallListViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            List<C63243Jh> list = (List) this.L$0;
            boolean z2 = this.Z$0;
            FavoriteCallListViewModel favoriteCallListViewModel = this.this$0;
            ArrayList A0J = C36321k7.A0J(list);
            for (C63243Jh r5 : list) {
                AnonymousClass16D r0 = favoriteCallListViewModel.A01;
                AnonymousClass11F r9 = r5.A03;
                AnonymousClass141 A0D = r0.A0D(r9);
                if (r5.A02 == C52312pE.GROUP) {
                    C20810yC r3 = favoriteCallListViewModel.A04;
                    C19730wQ r2 = favoriteCallListViewModel.A00;
                    AnonymousClass17X r1 = favoriteCallListViewModel.A02;
                    AnonymousClass00C.A0E(r9, "null cannot be cast to non-null type com.whatsapp.jid.GroupJid");
                    C232317r r02 = r1.A07;
                    z = true;
                    if (C34681hT.A0C(r2, r3, r02.A0B((AnonymousClass144) r9))) {
                        A0J.add(new C69743e1(A0D, r5, z, z2));
                    }
                }
                z = false;
                A0J.add(new C69743e1(A0D, r5, z, z2));
            }
            if (z2) {
                return C007103b.A0T(C69753e2.A00, A0J);
            }
            return A0J;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        boolean A1X = AnonymousClass000.A1X(obj2);
        FavoriteCallListViewModel$favorites$1 favoriteCallListViewModel$favorites$1 = new FavoriteCallListViewModel$favorites$1(this.this$0, (C023509x) obj3);
        favoriteCallListViewModel$favorites$1.L$0 = obj;
        favoriteCallListViewModel$favorites$1.Z$0 = A1X;
        return favoriteCallListViewModel$favorites$1.invokeSuspend(AnonymousClass0AJ.A00);
    }
}
