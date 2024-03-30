package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C023509x;
import X.C36361kB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1", f = "FavoriteCallListActivity.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListActivity$initObservables$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ FavoriteCallListActivity this$0;

    @DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1$1", f = "FavoriteCallListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass040 r5 = (AnonymousClass040) this.L$0;
                FavoriteCallListViewModel favoriteCallListViewModel = (FavoriteCallListViewModel) FavoriteCallListActivity.this.A0B.getValue();
                FavoriteCallListActivity favoriteCallListActivity = FavoriteCallListActivity.this;
                C36361kB.A1T(new FavoriteCallListActivity$initObservables$1$1$1$1(favoriteCallListActivity, (C023509x) null), r5, favoriteCallListViewModel.A0C);
                C36361kB.A1T(new FavoriteCallListActivity$initObservables$1$1$1$2(favoriteCallListActivity, (C023509x) null), r5, favoriteCallListViewModel.A0B);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListActivity$initObservables$1(FavoriteCallListActivity favoriteCallListActivity, C023509x r3) {
        super(2, r3);
        this.this$0 = favoriteCallListActivity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FavoriteCallListActivity$initObservables$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FavoriteCallListActivity$initObservables$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final FavoriteCallListActivity favoriteCallListActivity = this.this$0;
            AnonymousClass01P r2 = AnonymousClass01P.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A01(r2, favoriteCallListActivity, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
