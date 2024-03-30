package com.whatsapp.interop.blocklist;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass148;
import X.C009003v;
import X.C023509x;
import X.C27231Nk;
import X.C27251Nm;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.InteropBlockListManager$blockUser$2", f = "InteropBlockListManager.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListManager$blockUser$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass148 $jid;
    public int label;
    public final /* synthetic */ C27251Nm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListManager$blockUser$2(C27251Nm r2, AnonymousClass148 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$jid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new InteropBlockListManager$blockUser$2(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean valueOf;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C27231Nk r2 = this.this$0.A01;
            AnonymousClass148 r1 = this.$jid;
            this.label = 1;
            Object A00 = C27231Nk.A00(r2, r1, "block", this);
            if (A00 != r3) {
                A00 = AnonymousClass0AJ.A00;
            }
            if (A00 == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C27251Nm r32 = this.this$0;
        Set set = r32.A02;
        AnonymousClass148 r12 = this.$jid;
        synchronized (set) {
            r32.A00.A00(r12, true);
            valueOf = Boolean.valueOf(r32.A02.add(r12));
        }
        return valueOf;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropBlockListManager$blockUser$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
