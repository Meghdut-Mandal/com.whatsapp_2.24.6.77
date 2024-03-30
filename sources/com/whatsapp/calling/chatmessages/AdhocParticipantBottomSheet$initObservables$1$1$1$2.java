package com.whatsapp.calling.chatmessages;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$2", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$2(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$2 adhocParticipantBottomSheet$initObservables$1$1$1$2 = new AdhocParticipantBottomSheet$initObservables$1$1$1$2(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$2.L$0 = obj;
        return adhocParticipantBottomSheet$initObservables$1$1$1$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r3.this$0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L_0x0021
            X.AnonymousClass0AN.A00(r4)
            java.lang.Object r2 = r3.L$0
            X.3Bc r2 = (X.C61243Bc) r2
            if (r2 == 0) goto L_0x001e
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r0 = r3.this$0
            android.widget.TextView r1 = r0.A00
            if (r1 == 0) goto L_0x001e
            android.content.Context r0 = r0.A0a()
            java.lang.CharSequence r0 = r2.A00(r0)
            r1.setText(r0)
        L_0x001e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheet$initObservables$1$1$1$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
