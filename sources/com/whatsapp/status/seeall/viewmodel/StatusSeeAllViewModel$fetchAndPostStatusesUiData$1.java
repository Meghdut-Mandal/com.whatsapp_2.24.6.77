package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3P0;
import X.C009003v;
import X.C023509x;
import X.C13540k2;
import X.C18830tt;
import X.C36401kF;
import X.C36441kJ;
import X.C48122gk;
import X.C64253Ng;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$fetchAndPostStatusesUiData$1", f = "StatusSeeAllViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusSeeAllViewModel$fetchAndPostStatusesUiData$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3P0 $statuses;
    public int label;
    public final /* synthetic */ StatusSeeAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(AnonymousClass3P0 r2, StatusSeeAllViewModel statusSeeAllViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = statusSeeAllViewModel;
        this.$statuses = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(this.$statuses, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Collection A00;
        List list;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            StatusSeeAllViewModel statusSeeAllViewModel = this.this$0;
            C64253Ng r6 = new C64253Ng(this.$statuses, statusSeeAllViewModel.A02, C18830tt.ADH(statusSeeAllViewModel.A05.A00.A01.A00));
            ArrayList A0I = AnonymousClass001.A0I();
            int ordinal = r6.A01.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    list = r6.A00.A02;
                } else if (ordinal == 2) {
                    list = r6.A00.A03;
                } else if (ordinal == 3) {
                    A00 = C64253Ng.A00(r6, r6.A00.A01, true);
                } else {
                    throw C36441kJ.A18();
                }
                A00 = C64253Ng.A00(r6, list, false);
            } else {
                C13540k2 r3 = new C13540k2();
                AnonymousClass3P0 r7 = r6.A00;
                List list2 = r7.A02;
                if (C36401kF.A1a(list2)) {
                    r3.add(new C48122gk(R.string.f12nameremoved));
                    r3.addAll(C64253Ng.A00(r6, list2, false));
                }
                List list3 = r7.A03;
                if (C36401kF.A1a(list3)) {
                    r3.add(new C48122gk(R.string.f12nameremoved));
                    r3.addAll(C64253Ng.A00(r6, list3, false));
                }
                List list4 = r7.A01;
                if (C36401kF.A1a(list4)) {
                    r3.add(new C48122gk(R.string.f12nameremoved));
                    r3.addAll(C64253Ng.A00(r6, list4, true));
                }
                A00 = AnonymousClass03S.A00(r3);
            }
            A0I.addAll(A00);
            StatusSeeAllViewModel statusSeeAllViewModel2 = this.this$0;
            statusSeeAllViewModel2.A01.A0C(StatusSeeAllViewModel.A01(statusSeeAllViewModel2, (String) null, A0I));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusSeeAllViewModel$fetchAndPostStatusesUiData$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
