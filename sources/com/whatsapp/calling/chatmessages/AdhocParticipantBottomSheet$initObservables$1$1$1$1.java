package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import X.C40421vW;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$1", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$1(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$1 adhocParticipantBottomSheet$initObservables$1$1$1$1 = new AdhocParticipantBottomSheet$initObservables$1$1$1$1(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$1.L$0 = obj;
        return adhocParticipantBottomSheet$initObservables$1$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            List list = (List) this.L$0;
            C40421vW r0 = this.this$0.A06;
            if (r0 == null) {
                throw C36331k8.A0Y();
            }
            r0.A0M(list);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheet$initObservables$1$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
