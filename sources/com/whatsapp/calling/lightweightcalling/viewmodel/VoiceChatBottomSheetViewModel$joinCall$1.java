package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5Ng;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C107265Nh;
import X.C34681hT;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1", f = "VoiceChatBottomSheetViewModel.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
public final class VoiceChatBottomSheetViewModel$joinCall$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ VoiceChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatBottomSheetViewModel$joinCall$1(Context context, VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = voiceChatBottomSheetViewModel;
        this.$context = context;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new VoiceChatBottomSheetViewModel$joinCall$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = this.this$0;
            AnonymousClass5Ng A04 = voiceChatBottomSheetViewModel.A0J.A04(C34681hT.A09(voiceChatBottomSheetViewModel.A04));
            if (A04 != null) {
                VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel2 = this.this$0;
                Context context = this.$context;
                C107265Nh A042 = voiceChatBottomSheetViewModel2.A0H.A04(A04.A02());
                if (A042 != null) {
                    C005502l r2 = voiceChatBottomSheetViewModel2.A0N;
                    VoiceChatBottomSheetViewModel$joinCall$1$1$1$1 voiceChatBottomSheetViewModel$joinCall$1$1$1$1 = new VoiceChatBottomSheetViewModel$joinCall$1$1$1$1(context, voiceChatBottomSheetViewModel2, A042, (C023509x) null);
                    this.label = 1;
                    if (AnonymousClass0A2.A00(this, r2, voiceChatBottomSheetViewModel$joinCall$1$1$1$1) == r6) {
                        return r6;
                    }
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceChatBottomSheetViewModel$joinCall$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
