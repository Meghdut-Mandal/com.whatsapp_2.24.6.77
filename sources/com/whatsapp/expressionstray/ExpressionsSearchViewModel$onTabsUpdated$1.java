package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55E;
import X.AnonymousClass6PO;
import X.C009003v;
import X.C023509x;
import X.C90524aI;
import android.graphics.Bitmap;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onTabsUpdated$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onTabsUpdated$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $from;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onTabsUpdated$1(ExpressionsSearchViewModel expressionsSearchViewModel, C023509x r3, int i) {
        super(2, r3);
        this.this$0 = expressionsSearchViewModel;
        this.$from = i;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsSearchViewModel$onTabsUpdated$1(this.this$0, r5, this.$from);
    }

    public final Object invokeSuspend(Object obj) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        Integer A0a;
        String str;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            expressionsSearchViewModel = this.this$0;
            int i2 = this.$from;
            expressionsSearchViewModel.A00 = i2;
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
        ExpressionsSearchViewModel expressionsSearchViewModel2 = this.this$0;
        int indexOf = expressionsSearchViewModel2.A04.indexOf(expressionsSearchViewModel2.A03);
        ExpressionsSearchViewModel expressionsSearchViewModel3 = this.this$0;
        if (indexOf < 0) {
            A0a = C90524aI.A0a(indexOf);
            str = "expression_search_tabs_update_failed";
        } else {
            boolean isEmpty = expressionsSearchViewModel3.A04.isEmpty();
            expressionsSearchViewModel3 = this.this$0;
            if (isEmpty) {
                A0a = C90524aI.A0a(indexOf);
                str = "expression_search_tabs_update_failed_expression_tabs_is_empty";
            } else {
                expressionsSearchViewModel3.A07.A0D(new AnonymousClass55E((Bitmap) null, expressionsSearchViewModel3.A03, expressionsSearchViewModel3.A04, indexOf, !ExpressionsSearchViewModel.A03(expressionsSearchViewModel3)));
                return AnonymousClass0AJ.A00;
            }
        }
        ExpressionsSearchViewModel.A02(expressionsSearchViewModel3, A0a, str);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onTabsUpdated$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
