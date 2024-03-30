package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$5", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$5 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$5(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$5 adhocParticipantBottomSheet$initObservables$1$1$1$5 = new AdhocParticipantBottomSheet$initObservables$1$1$1$5(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$5.I$0 = AnonymousClass000.A0I(obj);
        return adhocParticipantBottomSheet$initObservables$1$1$1$5;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            int i = this.I$0;
            TextView textView = this.this$0.A01;
            boolean z = true;
            if (textView != null) {
                textView.setEnabled(AnonymousClass000.A1R(i));
            }
            TextView textView2 = this.this$0.A02;
            if (textView2 != null) {
                if (i <= 0) {
                    z = false;
                }
                textView2.setEnabled(z);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheet$initObservables$1$1$1$5) create(Integer.valueOf(AnonymousClass000.A0I(obj)), (C023509x) obj2)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
