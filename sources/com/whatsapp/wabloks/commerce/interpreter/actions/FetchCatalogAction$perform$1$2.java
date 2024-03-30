package com.whatsapp.wabloks.commerce.interpreter.actions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass71G;
import X.C009003v;
import X.C023509x;
import X.C199899gC;
import X.C594233w;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wabloks.commerce.interpreter.actions.FetchCatalogAction$perform$1$2", f = "FetchCatalogAction.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCatalogAction$perform$1$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C594233w $callback;
    public final /* synthetic */ String $catalogId;
    public final /* synthetic */ C199899gC $productListRequest;
    public final /* synthetic */ boolean $showFullScreenError;
    public int label;
    public final /* synthetic */ AnonymousClass71G this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCatalogAction$perform$1$2(Activity activity, C199899gC r3, C594233w r4, AnonymousClass71G r5, String str, C023509x r7, boolean z) {
        super(2, r7);
        this.this$0 = r5;
        this.$activity = activity;
        this.$productListRequest = r3;
        this.$catalogId = str;
        this.$callback = r4;
        this.$showFullScreenError = z;
    }

    public final C023509x create(Object obj, C023509x r10) {
        AnonymousClass71G r4 = this.this$0;
        return new FetchCatalogAction$perform$1$2(this.$activity, this.$productListRequest, this.$callback, r4, this.$catalogId, r10, this.$showFullScreenError);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass71G r7 = this.this$0;
            Activity activity = this.$activity;
            C199899gC r5 = this.$productListRequest;
            String str = this.$catalogId;
            C594233w r6 = this.$callback;
            boolean z = this.$showFullScreenError;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r7.A03, new FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2(activity, r5, r6, r7, str, (C023509x) null, z)) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCatalogAction$perform$1$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
