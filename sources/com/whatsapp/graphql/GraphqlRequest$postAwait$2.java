package com.whatsapp.graphql;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.C005102h;
import X.C009003v;
import X.C023509x;
import X.C15230mu;
import X.C159497jS;
import X.C165557tc;
import X.C36371kC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.graphql.GraphqlRequest$postAwait$2", f = "GraphqlRequest.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
public final class GraphqlRequest$postAwait$2 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ C159497jS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphqlRequest$postAwait$2(C159497jS r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public static Object A01(C159497jS r2, C023509x r3, C005102h r4) {
        return AnonymousClass0A2.A00(r3, r4, new GraphqlRequest$postAwait$2(r2, (C023509x) null));
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GraphqlRequest$postAwait$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GraphqlRequest$postAwait$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C159497jS r3 = this.this$0;
            this.L$0 = r3;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            C165557tc r1 = new C165557tc(A12, 2);
            if (!(AnonymousClass0AR.A04.get(A12) instanceof C15230mu)) {
                r3.Blp(r1);
            }
            obj = A12.A0G();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }
}
