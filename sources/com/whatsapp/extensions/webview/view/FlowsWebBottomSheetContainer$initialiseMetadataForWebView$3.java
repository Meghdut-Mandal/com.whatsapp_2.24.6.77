package com.whatsapp.extensions.webview.view;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import X.C36331k8;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C10810fG $bizJid;
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C023509x r3, C10810fG r4) {
        super(2, r3);
        this.this$0 = flowsWebBottomSheetContainer;
        this.$bizJid = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3(this.this$0, r5, this.$bizJid);
    }

    public final Object invokeSuspend(Object obj) {
        Bundle extras;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Intent intent = this.this$0.A0i().getIntent();
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
                C10810fG r0 = this.$bizJid;
                WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0G;
                if (waFlowsViewModel == null) {
                    throw C36331k8.A0d("waFlowsViewModel");
                }
                this.label = 1;
                if (AnonymousClass0A2.A00(this, waFlowsViewModel.A0H, new WaFlowsViewModel$processFlowDataForWebView$2(extras, waFlowsViewModel, (UserJid) r0.element, (C023509x) null)) == r6) {
                    return r6;
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
        return ((FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
