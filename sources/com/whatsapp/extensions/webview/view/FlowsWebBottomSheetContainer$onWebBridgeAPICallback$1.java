package com.whatsapp.extensions.webview.view;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import android.webkit.WebMessagePort;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ JSONObject $inputJson;
    public final /* synthetic */ WebMessagePort $sendPort;
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1(WebMessagePort webMessagePort, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C023509x r4, JSONObject jSONObject) {
        super(2, r4);
        this.this$0 = flowsWebBottomSheetContainer;
        this.$sendPort = webMessagePort;
        this.$inputJson = jSONObject;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1(this.$sendPort, this.this$0, r6, this.$inputJson);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            WaFlowsViewModel waFlowsViewModel = this.this$0.A0G;
            if (waFlowsViewModel == null) {
                throw C36331k8.A0d("waFlowsViewModel");
            }
            WebMessagePort webMessagePort = this.$sendPort;
            JSONObject jSONObject = this.$inputJson;
            this.label = 1;
            if (waFlowsViewModel.A0S(webMessagePort, this, jSONObject) == r4) {
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
        return ((FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
