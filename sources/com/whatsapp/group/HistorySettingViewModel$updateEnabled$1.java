package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass147;
import X.AnonymousClass3IR;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$updateEnabled$1", f = "HistorySettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HistorySettingViewModel$updateEnabled$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$updateEnabled$1(HistorySettingViewModel historySettingViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = historySettingViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new HistorySettingViewModel$updateEnabled$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new HistorySettingViewModel$updateEnabled$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            HistorySettingViewModel historySettingViewModel = this.this$0;
            AnonymousClass147 r5 = historySettingViewModel.A01;
            if (r5 != null) {
                AnonymousClass05L r4 = historySettingViewModel.A08;
                do {
                    value = r4.getValue();
                } while (!r4.B3B(value, new AnonymousClass3IR(((AnonymousClass3IR) value).A00, historySettingViewModel.A04.A0D(r5))));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
