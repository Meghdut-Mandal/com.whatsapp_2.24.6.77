package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass144;
import X.AnonymousClass17X;
import X.AnonymousClass1RY;
import X.AnonymousClass2MU;
import X.AnonymousClass34G;
import X.AnonymousClass3IO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C36361kB;
import X.C36381kD;
import X.C38811q8;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventResponseUserView$bind$1", f = "EventResponseUserView.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class EventResponseUserView$bind$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass1RY $contactPhotoLoader;
    public final /* synthetic */ AnonymousClass2MU $userItem;
    public int label;
    public final /* synthetic */ C38811q8 this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventResponseUserView$bind$1$1", f = "EventResponseUserView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventResponseUserView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r10) {
            return new AnonymousClass1(A0D, r8, r9, r10, r10, A0G);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass1RY.this.A08(r9.A0D, A0D);
                C38811q8.A00(r8, r9, r10.A03);
                C38811q8.A01(r9, r10.A03, A0G);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventResponseUserView$bind$1(AnonymousClass1RY r2, C38811q8 r3, AnonymousClass2MU r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$userItem = r4;
        this.$contactPhotoLoader = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new EventResponseUserView$bind$1(this.$contactPhotoLoader, this.this$0, this.$userItem, r6);
    }

    public final Object invokeSuspend(Object obj) {
        final AnonymousClass141 A0D;
        final AnonymousClass3IO r8;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C38811q8 r4 = this.this$0;
            UserJid userJid = this.$userItem.A02;
            if (r4.getMeManager().A0M(userJid)) {
                A0D = C36381kD.A0T(r4.getMeManager());
                AnonymousClass00C.A08(A0D);
            } else {
                A0D = r4.getContactManager().A0D(userJid);
            }
            AnonymousClass17X groupParticipantsManager = this.this$0.getGroupParticipantsManager();
            AnonymousClass11F r1 = this.$userItem.A01;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
            final boolean A0G = groupParticipantsManager.A0G((AnonymousClass144) r1, this.$userItem.A02);
            C38811q8 r6 = this.this$0;
            AnonymousClass11F r12 = this.$userItem.A01;
            if (C36361kB.A1X(r6.getMeManager(), A0D)) {
                r8 = new AnonymousClass3IO(r6.getContext().getString(R.string.f12nameremoved), (String) null);
            } else {
                int A0A = r6.getWaContactNames().A0A(r12);
                AnonymousClass34G A0E = r6.getWaContactNames().A0E(A0D, A0A, false, true);
                r8 = new AnonymousClass3IO(A0E.A01, r6.getWaContactNames().A0G(A0E.A00, A0D, A0A));
            }
            C005502l mainDispatcher = this.this$0.getMainDispatcher();
            final AnonymousClass1RY r62 = this.$contactPhotoLoader;
            final C38811q8 r9 = this.this$0;
            final AnonymousClass2MU r10 = this.$userItem;
            AnonymousClass1 r5 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, mainDispatcher, r5) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventResponseUserView$bind$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
