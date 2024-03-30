package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C18800tq;
import X.C19610wE;
import X.C27121Mz;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C40941wM;
import X.C57992z9;
import X.C58002zA;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1$1$1$1", f = "FavoriteCallListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListActivity$initObservables$1$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FavoriteCallListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListActivity$initObservables$1$1$1$1(FavoriteCallListActivity favoriteCallListActivity, C023509x r3) {
        super(2, r3);
        this.this$0 = favoriteCallListActivity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        FavoriteCallListActivity$initObservables$1$1$1$1 favoriteCallListActivity$initObservables$1$1$1$1 = new FavoriteCallListActivity$initObservables$1$1$1$1(this.this$0, r4);
        favoriteCallListActivity$initObservables$1$1$1$1.L$0 = obj;
        return favoriteCallListActivity$initObservables$1$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            Collection collection = (Collection) this.L$0;
            FavoriteCallListActivity favoriteCallListActivity = this.this$0;
            C40941wM r1 = favoriteCallListActivity.A03;
            if (r1 != null) {
                r1.A00 = C36361kB.A0q(collection);
                r1.A06();
            } else {
                C57992z9 r0 = favoriteCallListActivity.A02;
                if (r0 != null) {
                    ArrayList A0q = C36361kB.A0q(collection);
                    C27121Mz r2 = r0.A00;
                    C18800tq r12 = r2.A01;
                    favoriteCallListActivity.A03 = new C40941wM(C19610wE.A00(r12.AfJ), (C58002zA) r2.A00.A2L.get(), favoriteCallListActivity, C36351kA.A0T(r12), A0q);
                    FavoriteCallListActivity favoriteCallListActivity2 = this.this$0;
                    RecyclerView recyclerView = favoriteCallListActivity2.A01;
                    if (recyclerView == null) {
                        throw C36331k8.A0d("recyclerView");
                    }
                    C40941wM r02 = favoriteCallListActivity2.A03;
                    if (r02 == null) {
                        throw C36331k8.A0d("adapter");
                    }
                    recyclerView.setAdapter(r02);
                } else {
                    throw C36331k8.A0d("adapterFactory");
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteCallListActivity$initObservables$1$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
