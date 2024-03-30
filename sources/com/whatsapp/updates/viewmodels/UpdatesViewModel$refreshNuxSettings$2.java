package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C19420v0;
import X.C36341k9;
import X.C598335l;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshNuxSettings$2", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshNuxSettings$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshNuxSettings$2(UpdatesViewModel updatesViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = updatesViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new UpdatesViewModel$refreshNuxSettings$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UpdatesViewModel$refreshNuxSettings$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C598335l r4 = this.this$0.A0h;
            C19420v0 r3 = r4.A00;
            if (C36341k9.A0E(r3).getBoolean("show_statuses_education", true) && r4.A01.A0H()) {
                r3.A11();
            }
            C36341k9.A19(this.this$0.A00, true);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
