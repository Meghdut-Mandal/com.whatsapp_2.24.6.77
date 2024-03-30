package com.whatsapp.interop.integrator;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19A;
import X.AnonymousClass32L;
import X.C009003v;
import X.C023509x;
import X.C12600iM;
import X.C203399nx;
import X.C32831eG;
import X.C32861eJ;
import X.C35891jQ;
import X.C35911jS;
import X.C35921jT;
import X.C36321k7;
import X.C36411kG;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$resolveUsers$2", f = "IntegratorManager.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$resolveUsers$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $users;
    public int label;
    public final /* synthetic */ C32831eG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$resolveUsers$2(C32831eG r2, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$users = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new IntegratorManager$resolveUsers$2(this.this$0, this.$users, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj2);
            C32861eJ r1 = this.this$0.A04;
            List<AnonymousClass011> list = this.$users;
            this.label = 1;
            C12600iM A16 = C36411kG.A16(this);
            AnonymousClass19A r8 = r1.A00;
            String A09 = r8.A09();
            ArrayList A0J = C36321k7.A0J(list);
            for (AnonymousClass011 r0 : list) {
                A0J.add(new C35891jQ((String) r0.first, new Long((long) AnonymousClass000.A0I(r0.second))));
            }
            C35911jS r2 = new C35911jS((List) A0J, 7, A09);
            C203399nx r10 = r2.A00;
            AnonymousClass00C.A08(r10);
            r8.A0E(new C35921jT(r2, new AnonymousClass32L(A16), 4), r10, A09, 393, 32000);
            obj2 = A16.A00();
            if (obj2 == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj2);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IntegratorManager$resolveUsers$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
