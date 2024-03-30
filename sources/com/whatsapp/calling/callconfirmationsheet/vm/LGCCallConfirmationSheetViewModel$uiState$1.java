package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3UL;
import X.C009003v;
import X.C023509x;
import X.C36381kD;
import X.C47842fr;
import X.C47862ft;
import X.C61243Bc;
import X.C62773Hm;
import X.C74213lF;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel$uiState$1", f = "LGCCallConfirmationSheetViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class LGCCallConfirmationSheetViewModel$uiState$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LGCCallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LGCCallConfirmationSheetViewModel$uiState$1(LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = lGCCallConfirmationSheetViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        LGCCallConfirmationSheetViewModel$uiState$1 lGCCallConfirmationSheetViewModel$uiState$1 = new LGCCallConfirmationSheetViewModel$uiState$1(this.this$0, r4);
        lGCCallConfirmationSheetViewModel$uiState$1.L$0 = obj;
        return lGCCallConfirmationSheetViewModel$uiState$1;
    }

    public final Object invokeSuspend(Object obj) {
        C61243Bc r2;
        String A0v;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r3 = (AnonymousClass05G) this.L$0;
            LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel = this.this$0;
            AnonymousClass147 r7 = lGCCallConfirmationSheetViewModel.A07;
            AnonymousClass16D r6 = lGCCallConfirmationSheetViewModel.A03;
            AnonymousClass171 r22 = lGCCallConfirmationSheetViewModel.A04;
            AnonymousClass141 A01 = AnonymousClass3UL.A01(r6, lGCCallConfirmationSheetViewModel.A06, r7, lGCCallConfirmationSheetViewModel.A08, false);
            if (A01 == null || (A0v = C36381kD.A0v(r22, A01)) == null) {
                boolean z = this.this$0.A0D;
                int i2 = R.string.f12nameremoved;
                if (z) {
                    i2 = R.string.f12nameremoved;
                }
                r2 = new C47862ft(new Object[0], i2);
            } else {
                r2 = new C47842fr(A0v);
            }
            boolean z2 = this.this$0.A0D;
            int i3 = R.drawable.ic_action_audio_call_filled;
            if (z2) {
                i3 = R.drawable.ic_action_video_call_filled;
            }
            C62773Hm r0 = new C62773Hm(new C74213lF(i3), r2);
            this.label = 1;
            if (r3.B6N(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LGCCallConfirmationSheetViewModel$uiState$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
