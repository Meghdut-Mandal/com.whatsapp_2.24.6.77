package com.whatsapp.blocklist;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass148;
import X.AnonymousClass1NG;
import X.AnonymousClass3B0;
import X.AnonymousClass75B;
import X.C009003v;
import X.C023509x;
import X.C27251Nm;
import X.C35621iz;
import X.C36321k7;
import X.C60993Ad;
import com.whatsapp.interop.blocklist.InteropBlockListManager$blockUser$2;
import com.whatsapp.interop.blocklist.InteropBlockListManager$unblockUser$2;
import com.whatsapp.jid.UserJid;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.blocklist.InteropBlockListResponseHandler$send$1", f = "InteropBlockListResponseHandler.kt", i = {}, l = {39, 41}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListResponseHandler$send$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C60993Ad this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListResponseHandler$send$1(C60993Ad r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new InteropBlockListResponseHandler$send$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropBlockListResponseHandler$send$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C60993Ad r3 = this.this$0;
                AnonymousClass3B0 r2 = r3.A04;
                if (r2.A0A) {
                    C27251Nm r4 = r3.A06;
                    UserJid userJid = r2.A04;
                    AnonymousClass00C.A0E(userJid, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                    this.label = 1;
                    obj2 = AnonymousClass0A2.A00(this, r4.A03, new InteropBlockListManager$blockUser$2(r4, (AnonymousClass148) userJid, (C023509x) null));
                    if (obj2 != r6) {
                        obj2 = AnonymousClass0AJ.A00;
                    }
                } else {
                    C27251Nm r42 = r3.A06;
                    UserJid userJid2 = r2.A04;
                    AnonymousClass00C.A0E(userJid2, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                    this.label = 2;
                    obj2 = AnonymousClass0A2.A00(this, r42.A03, new InteropBlockListManager$unblockUser$2(r42, (AnonymousClass148) userJid2, (C023509x) null));
                    if (obj2 != r6) {
                        obj2 = AnonymousClass0AJ.A00;
                    }
                }
                if (obj2 == r6) {
                    return r6;
                }
            } catch (IOException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("InteropBlockListResponseHandler/error: ");
                C36321k7.A1a(A0u, e.getMessage());
                z = false;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C60993Ad r0 = this.this$0;
        AnonymousClass1NG r43 = r0.A03;
        r43.A0J.Boy(new C35621iz(r0.A04, r43, 48));
        C60993Ad r32 = this.this$0;
        r32.A01.Bp3(new AnonymousClass75B(12, (Object) r32, z));
        return AnonymousClass0AJ.A00;
    }
}
