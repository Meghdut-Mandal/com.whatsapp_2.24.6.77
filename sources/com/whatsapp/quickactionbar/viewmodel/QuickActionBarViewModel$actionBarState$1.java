package com.whatsapp.quickactionbar.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.quickactionbar.viewmodel.QuickActionBarViewModel$actionBarState$1", f = "QuickActionBarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class QuickActionBarViewModel$actionBarState$1 extends AnonymousClass0A1 implements C009003v {
    public int label;

    public QuickActionBarViewModel$actionBarState$1(C023509x r2) {
        super(2, r2);
    }

    public final C023509x create(Object obj, C023509x r3) {
        return new QuickActionBarViewModel$actionBarState$1(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new QuickActionBarViewModel$actionBarState$1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}