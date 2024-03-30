package com.whatsapp.productinfra.datasharingdisclosure.data;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3EX;
import X.C009003v;
import X.C023509x;
import X.C71383gg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1", f = "ConsumerCtwaDisclosureSyncDailyCron.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
public final class ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C71383gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1(C71383gg r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3EX r3 = (AnonymousClass3EX) this.this$0.A01.getValue();
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3.A03, new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(r3, (C023509x) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
