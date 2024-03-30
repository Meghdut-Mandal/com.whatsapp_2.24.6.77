package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.AnonymousClass3JI;
import X.AnonymousClass4RL;
import X.C009003v;
import X.C023509x;
import X.C36321k7;
import X.C44072La;
import X.C75903nz;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1", f = "GetRecommendedNewslettersUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass4RL $listener;
    public final /* synthetic */ List $newsletters;
    public int label;
    public final /* synthetic */ C75903nz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1(AnonymousClass4RL r2, C75903nz r3, List list, C023509x r5) {
        super(2, r5);
        this.$newsletters = list;
        this.$listener = r2;
        this.this$0 = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1(this.$listener, this.this$0, this.$newsletters, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.$newsletters.size();
            AnonymousClass4RL r6 = this.$listener;
            List<C44072La> list = this.$newsletters;
            C75903nz r5 = this.this$0;
            ArrayList A0J = C36321k7.A0J(list);
            for (C44072La r2 : list) {
                AnonymousClass141 A0D = r5.A03.A0D(r2.A06());
                AnonymousClass141 A04 = A0D.A04();
                if (A04 != null) {
                    A0D = A04;
                }
                A0J.add(new AnonymousClass3JI(r2, A0D));
            }
            r6.BZl(A0J);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
