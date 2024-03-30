package com.whatsapp.messaging.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6DP;
import X.AnonymousClass6GL;
import X.AnonymousClass6VR;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager$startLogoutWork$1", f = "XmppConnectionMetricsWorkManager.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class XmppConnectionMetricsWorkManager$startLogoutWork$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppConnectionMetricsWorkManager$startLogoutWork$1(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, C023509x r3) {
        super(2, r3);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new XmppConnectionMetricsWorkManager$startLogoutWork$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new XmppConnectionMetricsWorkManager$startLogoutWork$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager = this.this$0;
            Object obj2 = xmppConnectionMetricsWorkManager.A02.get();
            AnonymousClass00C.A08(obj2);
            this.label = 1;
            obj = XmppConnectionMetricsWorkManager.A00((AnonymousClass6VR) obj2, xmppConnectionMetricsWorkManager, "xmpp-lifecycle-worker", this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass6DP r6 = (AnonymousClass6DP) obj;
        if (r6 != null) {
            XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager2 = this.this$0;
            Integer num = r6.A00;
            if (num != C023109s.A01 && AnonymousClass6GL.A01(num)) {
                XmppConnectionMetricsWorkManager.A01(xmppConnectionMetricsWorkManager2);
            }
        }
        this.this$0.A0A = null;
        return AnonymousClass0AJ.A00;
    }
}
