package X;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Sw  reason: invalid class name and case insensitive filesystem */
public final class C154617Sw extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154617Sw(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
        Bundle bundle = flowsWebBottomSheetContainer.A0A;
        if (bundle != null) {
            String string = bundle.getString("flow_id");
            AnonymousClass09Y A0S = C36411kG.A0S(flowsWebBottomSheetContainer);
            C20810yC r0 = flowsWebBottomSheetContainer.A0H;
            if (r0 != null) {
                String A09 = r0.A09(6060);
                AnonymousClass00C.A0B(A09);
                String A0f = C90464aC.A0f(string, AnonymousClass000.A0v(A09), '/');
                AnonymousClass00C.A0D(A0f, 0);
                FlowsWebViewFragment flowsWebViewFragment = new FlowsWebViewFragment();
                flowsWebViewFragment.A17(C36431kI.A0I("url", A0f));
                LinearLayout linearLayout = flowsWebBottomSheetContainer.A00;
                if (linearLayout != null) {
                    A0S.A0F(flowsWebViewFragment, "WEB_FRAGMENT", linearLayout.getId());
                }
                A0S.A00(false);
                WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0G;
                if (waFlowsViewModel == null) {
                    throw C36331k8.A0d("waFlowsViewModel");
                }
                AnonymousClass6DY r7 = waFlowsViewModel.A0D.A00;
                if (r7 != null) {
                    AnonymousClass6OE r5 = flowsWebBottomSheetContainer.A08;
                    if (r5 != null) {
                        AnonymousClass185 r6 = flowsWebBottomSheetContainer.A06;
                        if (r6 != null) {
                            AnonymousClass6NP r10 = flowsWebBottomSheetContainer.A0C;
                            if (r10 != null) {
                                UserJid userJid = r7.A01;
                                String str2 = r7.A03;
                                AnonymousClass3T1 A02 = r5.A02.A02(new C64933Qa(userJid, str2, false));
                                JSONObject A1B = C36441kJ.A1B();
                                String A022 = C132586Uj.A00.A02(r5.A00, str2, false);
                                String A0b = C90464aC.A0b(r7.A04);
                                AnonymousClass00C.A08(A0b);
                                try {
                                    A1B.put("cta", "galaxy_message");
                                    A1B.put("flow_id", r7.A02);
                                    A1B.put("extensions_message_id", A022);
                                    A1B.put("session_id", A0b);
                                    A1B.put("data_channel_navigation", r7.A05);
                                } catch (JSONException e) {
                                    Log.w(C36331k8.A0i("SExtensionsLogger/PhoenixExtensionsFlowMessage/reportWamEvent()/Error - ", AnonymousClass000.A0u(), e));
                                }
                                int A00 = C110465ai.A00(r6.A01(userJid));
                                AnonymousClass9Xu A01 = r5.A01.A01.A01(userJid);
                                if (A02 != null) {
                                    C66013Ui.A0q(A02);
                                }
                                String A0y = C36381kD.A0y(A1B);
                                Integer valueOf = Integer.valueOf(A00);
                                String str3 = null;
                                if (A01 != null) {
                                    str3 = A01.A06;
                                    str = A01.A05;
                                } else {
                                    str = null;
                                }
                                r10.A01(userJid, A02, valueOf, A0y, str3, str, str2, 0);
                            } else {
                                throw C36331k8.A0d("wamFlowsStructuredMessageInteractionReporter");
                            }
                        } else {
                            throw C36331k8.A0d("verifiedNameManager");
                        }
                    } else {
                        throw C36331k8.A0d("extensionsDataUtil");
                    }
                }
            } else {
                throw C36321k7.A07();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
