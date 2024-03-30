package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3E9;
import X.AnonymousClass4MD;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C07570Yj;
import X.C12600iM;
import X.C30131Zi;
import X.C36411kG;
import X.C44072La;
import X.C75773nm;
import X.C85324Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.InvertNewsletterFollowStateUseCase$invoke$1", f = "InvertNewsletterFollowStateUseCase.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class InvertNewsletterFollowStateUseCase$invoke$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C44072La $newsletterInfo;
    public final /* synthetic */ C006302t $onComplete;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass3E9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvertNewsletterFollowStateUseCase$invoke$1(C44072La r2, AnonymousClass3E9 r3, C023509x r4, C006302t r5) {
        super(2, r4);
        this.$onComplete = r5;
        this.this$0 = r3;
        this.$newsletterInfo = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        C006302t r3 = this.$onComplete;
        return new InvertNewsletterFollowStateUseCase$invoke$1(this.$newsletterInfo, this.this$0, r6, r3);
    }

    public final Object invokeSuspend(Object obj) {
        C006302t r5;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r5 = this.$onComplete;
            AnonymousClass3E9 r7 = this.this$0;
            C44072La r4 = this.$newsletterInfo;
            this.L$0 = r5;
            this.label = 1;
            C12600iM A16 = C36411kG.A16(this);
            C75773nm r2 = new C75773nm(r4, r7, A16);
            r7.A00.registerObserver(r2);
            C07570Yj.A01(r7.A02.BAE()).BL4(new AnonymousClass4MD(r2, r7));
            boolean A0N = r4.A0N();
            C30131Zi r1 = r7.A01;
            if (A0N) {
                r1.A03(r4, new C85324Gq(r4, r7));
            } else {
                r1.A0A(r4.A0J());
            }
            obj = A16.A00();
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            r5 = (C006302t) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        r5.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InvertNewsletterFollowStateUseCase$invoke$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
