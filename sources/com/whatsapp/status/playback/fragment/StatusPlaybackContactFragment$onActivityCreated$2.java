package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C023509x;
import X.C02380Ab;
import X.C36331k8;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$onActivityCreated$2", f = "StatusPlaybackContactFragment.kt", i = {}, l = {478}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackContactFragment$onActivityCreated$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$onActivityCreated$2$1", f = "StatusPlaybackContactFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$onActivityCreated$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(userJid, statusPlaybackContactFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass16D r1 = statusPlaybackContactFragment.A0C;
                if (r1 != null) {
                    AnonymousClass141 A0D = r1.A0D(userJid);
                    if (A0D.A14) {
                        A0D.A14 = false;
                        AnonymousClass16D r0 = statusPlaybackContactFragment.A0C;
                        if (r0 != null) {
                            r0.A0Q(A0D);
                        } else {
                            throw C36331k8.A0Z();
                        }
                    }
                    return AnonymousClass0AJ.A00;
                }
                throw C36331k8.A0Z();
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackContactFragment$onActivityCreated$2(UserJid userJid, StatusPlaybackContactFragment statusPlaybackContactFragment, C023509x r4) {
        super(2, r4);
        this.this$0 = statusPlaybackContactFragment;
        this.$jid = userJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StatusPlaybackContactFragment$onActivityCreated$2(this.$jid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StatusPlaybackContactFragment statusPlaybackContactFragment = this.this$0;
            C02380Ab A0m = statusPlaybackContactFragment.A0m();
            AnonymousClass01P r3 = AnonymousClass01P.STARTED;
            final UserJid userJid = this.$jid;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A01(r3, A0m, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackContactFragment$onActivityCreated$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
