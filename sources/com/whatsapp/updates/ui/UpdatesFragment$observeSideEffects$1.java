package com.whatsapp.updates.ui;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import X.C02380Ab;
import X.C15390nG;
import X.C52992qW;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.ui.UpdatesFragment$observeSideEffects$1", f = "UpdatesFragment.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesFragment$observeSideEffects$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesFragment$observeSideEffects$1(UpdatesFragment updatesFragment, C023509x r3) {
        super(2, r3);
        this.this$0 = updatesFragment;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new UpdatesFragment$observeSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UpdatesFragment$observeSideEffects$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05H r2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            UpdatesFragment updatesFragment = this.this$0;
            UpdatesViewModel updatesViewModel = updatesFragment.A0c;
            if (!(updatesViewModel == null || (r2 = updatesViewModel.A0q) == null)) {
                C02380Ab A0m = updatesFragment.A0m();
                A0m.A00();
                AnonymousClass01N r1 = A0m.A00;
                AnonymousClass00C.A08(r1);
                C15390nG A00 = C52992qW.A00(AnonymousClass01P.RESUMED, r1, r2);
                AnonymousClass4Z8 r0 = new AnonymousClass4Z8(this.this$0, 20);
                this.label = 1;
                if (A00.B36(this, r0) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
