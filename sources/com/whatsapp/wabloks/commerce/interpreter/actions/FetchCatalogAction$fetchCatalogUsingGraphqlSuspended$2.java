package com.whatsapp.wabloks.commerce.interpreter.actions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass71G;
import X.C009003v;
import X.C023509x;
import X.C123815x8;
import X.C177048d7;
import X.C199899gC;
import X.C594233w;
import X.C90524aI;
import android.app.Activity;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wabloks.commerce.interpreter.actions.FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2", f = "FetchCatalogAction.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C594233w $callback;
    public final /* synthetic */ String $catalogId;
    public final /* synthetic */ C199899gC $productListRequest;
    public final /* synthetic */ boolean $showFullScreenError;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ AnonymousClass71G this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2(Activity activity, C199899gC r3, C594233w r4, AnonymousClass71G r5, String str, C023509x r7, boolean z) {
        super(2, r7);
        this.this$0 = r5;
        this.$productListRequest = r3;
        this.$catalogId = str;
        this.$activity = activity;
        this.$callback = r4;
        this.$showFullScreenError = z;
    }

    public final C023509x create(Object obj, C023509x r10) {
        AnonymousClass71G r4 = this.this$0;
        FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2 fetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2 = new FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2(this.$activity, this.$productListRequest, this.$callback, r4, this.$catalogId, r10, this.$showFullScreenError);
        fetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2.L$0 = obj;
        return fetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        C594233w r5;
        Activity activity;
        AnonymousClass71G r3;
        AnonymousClass0AO r8 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r3 = this.this$0;
            C199899gC r2 = this.$productListRequest;
            String str = this.$catalogId;
            activity = this.$activity;
            r5 = this.$callback;
            z = this.$showFullScreenError;
            try {
                C177048d7 A00 = r3.A00.A00(r2, str);
                this.L$0 = r3;
                this.L$1 = activity;
                this.L$2 = r5;
                this.Z$0 = z;
                this.label = 1;
                obj = GraphqlRequest$postAwait$2.A01(A00, this, AnonymousClass19R.A01);
                if (obj == r8) {
                    return r8;
                }
            } catch (Throwable th) {
                obj2 = C90524aI.A0t(th);
            }
        } else if (i == 1) {
            z = this.Z$0;
            r5 = (C594233w) this.L$2;
            activity = (Activity) this.L$1;
            r3 = (AnonymousClass71G) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C123815x8 r10 = (C123815x8) obj;
        if (!z) {
            z2 = false;
        }
        AnonymousClass71G.A00(activity, r5, r10, r3, z2);
        obj2 = AnonymousClass0AJ.A00;
        AnonymousClass71G r4 = this.this$0;
        Activity activity2 = this.$activity;
        boolean z3 = this.$showFullScreenError;
        C594233w r1 = this.$callback;
        if (AnonymousClass0AK.A00(obj2) != null) {
            AnonymousClass71G.A01(activity2, r1, r4, z3);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
