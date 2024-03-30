package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass3IR;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$updateChecked$1", f = "HistorySettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HistorySettingViewModel$updateChecked$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$updateChecked$1(HistorySettingViewModel historySettingViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = historySettingViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new HistorySettingViewModel$updateChecked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new HistorySettingViewModel$updateChecked$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            HistorySettingViewModel historySettingViewModel = this.this$0;
            AnonymousClass147 r6 = historySettingViewModel.A01;
            if (r6 != null) {
                AnonymousClass141 A08 = historySettingViewModel.A03.A08(r6);
                historySettingViewModel.A00 = A08;
                if (A08 != null) {
                    AnonymousClass05L r4 = historySettingViewModel.A08;
                    do {
                    } while (!r4.B3B(r4.getValue(), new AnonymousClass3IR(A08.A0h, historySettingViewModel.A04.A0D(r6))));
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
