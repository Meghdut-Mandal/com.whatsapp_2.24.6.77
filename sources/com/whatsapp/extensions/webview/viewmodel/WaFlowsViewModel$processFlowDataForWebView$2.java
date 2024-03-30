package com.whatsapp.extensions.webview.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass571;
import X.AnonymousClass572;
import X.AnonymousClass573;
import X.AnonymousClass7M8;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C110855bL;
import android.os.Bundle;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2", f = "WaFlowsViewModel.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
public final class WaFlowsViewModel$processFlowDataForWebView$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ Bundle $bundle;
    public Object L$0;
    public int label;
    public final /* synthetic */ WaFlowsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaFlowsViewModel$processFlowDataForWebView$2(Bundle bundle, WaFlowsViewModel waFlowsViewModel, UserJid userJid, C023509x r5) {
        super(2, r5);
        this.$bizJid = userJid;
        this.this$0 = waFlowsViewModel;
        this.$bundle = bundle;
    }

    public final C023509x create(Object obj, C023509x r6) {
        UserJid userJid = this.$bizJid;
        return new WaFlowsViewModel$processFlowDataForWebView$2(this.$bundle, this.this$0, userJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        WaFlowsViewModel waFlowsViewModel;
        C001700s r1;
        Object obj2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            UserJid userJid = this.$bizJid;
            if (userJid == null) {
                return new AnonymousClass7M8(this.this$0);
            }
            waFlowsViewModel = this.this$0;
            Bundle bundle = this.$bundle;
            FlowsWebViewDataRepository flowsWebViewDataRepository = waFlowsViewModel.A0D;
            this.L$0 = waFlowsViewModel;
            this.label = 1;
            obj = flowsWebViewDataRepository.A03(bundle, userJid, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            waFlowsViewModel = (WaFlowsViewModel) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C110855bL r7 = (C110855bL) obj;
        if (r7 instanceof AnonymousClass573) {
            r1 = waFlowsViewModel.A05;
        } else if (r7 instanceof AnonymousClass572) {
            r1 = waFlowsViewModel.A01;
        } else {
            if (r7 instanceof AnonymousClass571) {
                r1 = waFlowsViewModel.A06;
                obj2 = ((AnonymousClass571) r7).A00;
                r1.A0C(obj2);
            }
            return AnonymousClass0AJ.A00;
        }
        obj2 = AnonymousClass0AJ.A00;
        r1.A0C(obj2);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaFlowsViewModel$processFlowDataForWebView$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
