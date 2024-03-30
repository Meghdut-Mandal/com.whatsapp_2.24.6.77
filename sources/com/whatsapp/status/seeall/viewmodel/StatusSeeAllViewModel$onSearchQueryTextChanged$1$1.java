package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass098;
import X.AnonymousClass099;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3P0;
import X.AnonymousClass4YZ;
import X.C007103b;
import X.C009003v;
import X.C009403z;
import X.C023409w;
import X.C023509x;
import X.C18830tt;
import X.C48022gZ;
import X.C57862yw;
import X.C64243Nf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$onSearchQueryTextChanged$1$1", f = "StatusSeeAllViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusSeeAllViewModel$onSearchQueryTextChanged$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $queryText;
    public final /* synthetic */ AnonymousClass3P0 $statuses;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StatusSeeAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusSeeAllViewModel$onSearchQueryTextChanged$1$1(AnonymousClass3P0 r2, StatusSeeAllViewModel statusSeeAllViewModel, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = statusSeeAllViewModel;
        this.$statuses = r2;
        this.$queryText = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        StatusSeeAllViewModel$onSearchQueryTextChanged$1$1 statusSeeAllViewModel$onSearchQueryTextChanged$1$1 = new StatusSeeAllViewModel$onSearchQueryTextChanged$1$1(this.$statuses, this.this$0, this.$queryText, r6);
        statusSeeAllViewModel$onSearchQueryTextChanged$1$1.L$0 = obj;
        return statusSeeAllViewModel$onSearchQueryTextChanged$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        List A00;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (C009403z.A04((AnonymousClass040) this.L$0)) {
                StatusSeeAllViewModel statusSeeAllViewModel = this.this$0;
                if (statusSeeAllViewModel.A04) {
                    C57862yw r0 = statusSeeAllViewModel.A06;
                    AnonymousClass3P0 r2 = this.$statuses;
                    AnonymousClass00C.A07(r2);
                    C64243Nf r5 = new C64243Nf(r2, C18830tt.ADH(r0.A00.A01.A00), this.$queryText);
                    String str = r5.A01;
                    if (AnonymousClass098.A06(str)) {
                        A00 = C023409w.A00;
                    } else {
                        AnonymousClass3P0 r3 = r5.A00;
                        ArrayList A0S = C007103b.A0S(C64243Nf.A00(r5, r3.A01, true), C007103b.A0S(C64243Nf.A00(r5, r3.A03, false), C64243Nf.A00(r5, r3.A02, false)));
                        ArrayList A0I = AnonymousClass001.A0I();
                        Iterator it = A0S.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            String A0J = ((C48022gZ) next).A00.A0J();
                            if (A0J != null && AnonymousClass099.A0O(A0J, str, true)) {
                                A0I.add(next);
                            }
                        }
                        A00 = AnonymousClass4YZ.A00(A0I, r5, 12);
                    }
                    StatusSeeAllViewModel statusSeeAllViewModel2 = this.this$0;
                    statusSeeAllViewModel2.A01.A0C(StatusSeeAllViewModel.A01(statusSeeAllViewModel2, this.$queryText, A00));
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusSeeAllViewModel$onSearchQueryTextChanged$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
