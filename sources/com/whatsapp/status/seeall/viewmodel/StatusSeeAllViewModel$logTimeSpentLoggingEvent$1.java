package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass1N6;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$logTimeSpentLoggingEvent$1", f = "StatusSeeAllViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusSeeAllViewModel$logTimeSpentLoggingEvent$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StatusSeeAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusSeeAllViewModel$logTimeSpentLoggingEvent$1(StatusSeeAllViewModel statusSeeAllViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = statusSeeAllViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StatusSeeAllViewModel$logTimeSpentLoggingEvent$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StatusSeeAllViewModel$logTimeSpentLoggingEvent$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1N6 r3 = this.this$0.A08;
            AnonymousClass00T r0 = AnonymousClass1N6.A0A;
            r3.A03((AnonymousClass11F) null, 84);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
