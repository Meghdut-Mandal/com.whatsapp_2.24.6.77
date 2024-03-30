package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C36401kF;
import X.C48682hr;
import X.C48692hs;
import X.C48702ht;
import X.C55702v3;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.UsernameViewModel$onResult$1", f = "UsernameViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameViewModel$onResult$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C55702v3 $response;
    public int label;
    public final /* synthetic */ UsernameViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameViewModel$onResult$1(UsernameViewModel usernameViewModel, C55702v3 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = usernameViewModel;
        this.$response = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new UsernameViewModel$onResult$1(this.this$0, this.$response, r5);
    }

    public final Object invokeSuspend(Object obj) {
        UsernameViewModel usernameViewModel;
        int i;
        Integer valueOf;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            UsernameViewModel usernameViewModel2 = this.this$0;
            this.label = 1;
            if (UsernameViewModel.A01(usernameViewModel2, this) == r2) {
                return r2;
            }
        } else if (i2 == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C55702v3 r1 = this.$response;
        if (AnonymousClass00C.A0J(r1, C48692hs.A00)) {
            usernameViewModel = this.this$0;
            valueOf = new Integer(R.string.f12nameremoved);
        } else if (r1 instanceof C48682hr) {
            usernameViewModel = this.this$0;
            long longValue = new Long(((C48682hr) this.$response).A00).longValue();
            if (longValue == 406 || longValue == 40601) {
                i = R.string.f12nameremoved;
            } else {
                int i3 = (longValue > 40602 ? 1 : (longValue == 40602 ? 0 : -1));
                i = R.string.f12nameremoved;
                if (i3 == 0) {
                    i = R.string.f12nameremoved;
                }
            }
            valueOf = Integer.valueOf(i);
        } else {
            if (r1 instanceof C48702ht) {
                UsernameViewModel usernameViewModel3 = this.this$0;
                String str = usernameViewModel3.A01;
                if (str != null) {
                    usernameViewModel3.A04.A0I(str);
                }
                C36401kF.A1I(this.this$0, (Integer) null);
            }
            return AnonymousClass0AJ.A00;
        }
        C36401kF.A1I(usernameViewModel, valueOf);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameViewModel$onResult$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
