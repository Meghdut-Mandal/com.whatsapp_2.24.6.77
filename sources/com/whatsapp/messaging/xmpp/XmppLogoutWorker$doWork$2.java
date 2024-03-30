package com.whatsapp.messaging.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0Nh;
import X.C009003v;
import X.C023509x;
import X.C06790Vc;
import X.C07330Xf;
import X.C97334ow;
import X.C97344ox;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2", f = "XmppLogoutWorker.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class XmppLogoutWorker$doWork$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ XmppLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLogoutWorker$doWork$2(XmppLogoutWorker xmppLogoutWorker, C023509x r3) {
        super(2, r3);
        this.this$0 = xmppLogoutWorker;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new XmppLogoutWorker$doWork$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new XmppLogoutWorker$doWork$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A00 = C06790Vc.A00(AnonymousClass0Nh.SECONDS, this.this$0.A00.A07(3532));
            this.label = 1;
            if (C07330Xf.A01(this, A00) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (this.this$0.A01.A00()) {
            return C97344ox.A00();
        }
        return C97334ow.A00();
    }
}
