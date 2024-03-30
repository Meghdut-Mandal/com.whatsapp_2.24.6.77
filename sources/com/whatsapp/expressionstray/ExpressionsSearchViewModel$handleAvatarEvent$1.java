package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55O;
import X.AnonymousClass55P;
import X.AnonymousClass5IU;
import X.AnonymousClass6PO;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C111405cE;
import X.C119575q5;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$handleAvatarEvent$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {417}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$handleAvatarEvent$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C111405cE $event;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$handleAvatarEvent$1(ExpressionsSearchViewModel expressionsSearchViewModel, C111405cE r3, C023509x r4) {
        super(2, r4);
        this.this$0 = expressionsSearchViewModel;
        this.$event = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsSearchViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    public final Object invokeSuspend(Object obj) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            expressionsSearchViewModel = this.this$0;
            int i2 = expressionsSearchViewModel.A00;
            boolean A1S = AnonymousClass000.A1S(i2, 7);
            AnonymousClass6PO r3 = expressionsSearchViewModel.A0B;
            this.L$0 = expressionsSearchViewModel;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A04, new ExpressionsKeyboardTabHandler$createTabsListByOpener$2(r3, (C023509x) null, i2, A1S));
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            expressionsSearchViewModel = (ExpressionsSearchViewModel) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        expressionsSearchViewModel.A04 = (List) obj;
        if (this.$event instanceof AnonymousClass5IU) {
            C119575q5 r0 = this.this$0.A03;
            Object obj2 = AnonymousClass55O.A00;
            boolean A0J = AnonymousClass00C.A0J(r0, obj2);
            List list = this.this$0.A04;
            if (!A0J) {
                obj2 = AnonymousClass55P.A00;
            }
            int indexOf = list.indexOf(obj2);
            ExpressionsSearchViewModel expressionsSearchViewModel2 = this.this$0;
            expressionsSearchViewModel2.A02 = null;
            C119575q5 r02 = (C119575q5) C007103b.A0P(expressionsSearchViewModel2.A04, indexOf);
            if (r02 != null) {
                expressionsSearchViewModel2.A0S(r02);
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$handleAvatarEvent$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
