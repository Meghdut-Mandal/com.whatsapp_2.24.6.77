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
import X.C005502l;
import X.C009003v;
import X.C023509x;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$fetchContactAndUpdateUI$1", f = "StatusPlaybackContactFragment.kt", i = {}, l = {680}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackContactFragment$fetchContactAndUpdateUI$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $contactJidToFetch;
    public int label;
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$fetchContactAndUpdateUI$1$1", f = "StatusPlaybackContactFragment.kt", i = {}, l = {682}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$fetchContactAndUpdateUI$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(userJid, statusPlaybackContactFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass16D r1 = statusPlaybackContactFragment.A0C;
                if (r1 != null) {
                    final AnonymousClass141 A0D = r1.A0D(userJid);
                    final StatusPlaybackContactFragment statusPlaybackContactFragment = statusPlaybackContactFragment;
                    C005502l r2 = statusPlaybackContactFragment.A0q;
                    if (r2 != null) {
                        AnonymousClass1 r0 = new C009003v((C023509x) null) {
                            public int label;

                            public final C023509x create(Object obj, C023509x r5) {
                                return 

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                public StatusPlaybackContactFragment$fetchContactAndUpdateUI$1(UserJid userJid, StatusPlaybackContactFragment statusPlaybackContactFragment, C023509x r4) {
                                    super(2, r4);
                                    this.this$0 = statusPlaybackContactFragment;
                                    this.$contactJidToFetch = userJid;
                                }

                                public final C023509x create(Object obj, C023509x r5) {
                                    return new StatusPlaybackContactFragment$fetchContactAndUpdateUI$1(this.$contactJidToFetch, this.this$0, r5);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                                    int i = this.label;
                                    if (i == 0) {
                                        AnonymousClass0AN.A00(obj);
                                        final StatusPlaybackContactFragment statusPlaybackContactFragment = this.this$0;
                                        AnonymousClass01P r3 = AnonymousClass01P.STARTED;
                                        final UserJid userJid = this.$contactJidToFetch;
                                        AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                                        this.label = 1;
                                        if (AnonymousClass3LK.A01(r3, statusPlaybackContactFragment, this, r0) == r6) {
                                            return r6;
                                        }
                                    } else if (i == 1) {
                                        AnonymousClass0AN.A00(obj);
                                    } else {
                                        throw AnonymousClass000.A0e();
                                    }
                                    return AnonymousClass0AJ.A00;
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return ((StatusPlaybackContactFragment$fetchContactAndUpdateUI$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
                                }
                            }
