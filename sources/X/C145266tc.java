package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1;

/* renamed from: X.6tc  reason: invalid class name and case insensitive filesystem */
public final class C145266tc implements C160427kz {
    public final /* synthetic */ C128716Di A00;
    public final /* synthetic */ AnonymousClass7hO A01;
    public final /* synthetic */ AnonymousClass6E7 A02;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines A03;
    public final /* synthetic */ C159657ji A04;

    public C145266tc(AnonymousClass6E7 r1, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C128716Di r3, AnonymousClass7hO r4, C159657ji r5) {
        this.A03 = phoenixFlowsManagerWithCoroutines;
        this.A02 = r1;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public void BQX() {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A03;
        C26551Kp r3 = phoenixFlowsManagerWithCoroutines.A0J;
        String str = this.A02.A05;
        r3.A05(str.hashCode(), 105);
        PhoenixFlowsManagerWithCoroutines.A08(phoenixFlowsManagerWithCoroutines, this.A04, "Download aborted", str);
    }

    public /* bridge */ /* synthetic */ void BWm(Integer num) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A03;
        C26551Kp r3 = phoenixFlowsManagerWithCoroutines.A0J;
        String str = this.A02.A05;
        r3.A05(str.hashCode(), 3);
        PhoenixFlowsManagerWithCoroutines.A08(phoenixFlowsManagerWithCoroutines, this.A04, "Download failed", str);
    }

    public /* bridge */ /* synthetic */ void BjA(Integer num) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A03;
        C26551Kp r3 = phoenixFlowsManagerWithCoroutines.A0J;
        String str = this.A02.A05;
        r3.A05(str.hashCode(), 3);
        PhoenixFlowsManagerWithCoroutines.A08(phoenixFlowsManagerWithCoroutines, this.A04, "Download timed out", str);
    }

    public void onSuccess() {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.A03;
        C36331k8.A1T(new PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(this.A02, phoenixFlowsManagerWithCoroutines, this.A00, this.A01, this.A04, (C023509x) null), phoenixFlowsManagerWithCoroutines.A0Q);
    }
}
