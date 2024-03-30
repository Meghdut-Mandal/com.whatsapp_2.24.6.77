package com.whatsapp.conversation.comments;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
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
import X.AnonymousClass34G;
import X.AnonymousClass3SF;
import X.AnonymousClass3T1;
import X.AnonymousClass6PM;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C19730wQ;
import X.C33511fU;
import X.C36321k7;
import X.C36441kJ;
import X.C55772vA;
import X.C64933Qa;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.CommentHeader$bind$1", f = "CommentHeader.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class CommentHeader$bind$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3T1 $message;
    public int label;
    public final /* synthetic */ CommentHeader this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.comments.CommentHeader$bind$1$1", f = "CommentHeader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.comments.CommentHeader$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r10) {
            CommentHeader commentHeader = commentHeader;
            AnonymousClass3T1 r5 = r8;
            AnonymousClass11F r4 = A0J;
            return new AnonymousClass1(A0C, commentHeader, A08, r4, r5, r10, A0A);
        }

        public final Object invokeSuspend(Object obj) {
            int A00;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                ContactNamePrimary A002 = commentHeader.getContactNamePrimary();
                AnonymousClass3T1 r1 = r8;
                AnonymousClass11F r6 = A0J;
                AnonymousClass141 r14 = A08;
                int i = A0A;
                C36321k7.A0v(r1, 0, r14);
                AnonymousClass3SF r7 = new AnonymousClass3SF(A002.getContext(), A002, A002.getWaContactNames(), A002.getWhatsAppLocale(), A002.getChatsCache(), A002.getAbProps());
                AnonymousClass17X groupParticipantsManager = A002.getGroupParticipantsManager();
                C64933Qa r4 = r1.A1J;
                AnonymousClass11F r12 = r4.A00;
                AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                AnonymousClass6PM A03 = groupParticipantsManager.A03((AnonymousClass144) r12, (UserJid) r6);
                if (A03 != null) {
                    A00 = C55772vA.A00(A002.getResources(), A03);
                } else {
                    A00 = AnonymousClass00F.A00(A002.getContext(), R.color.f6nameremoved);
                }
                TextEmojiLabel textEmojiLabel = r7.A01;
                textEmojiLabel.setTextColor(A00);
                C33511fU.A03(textEmojiLabel);
                if (r4.A02) {
                    r7.A02();
                } else {
                    r7.A04(r7.A02.A0C(r14, i), r14, (List) null, i, r7.A0A(r14));
                }
                A002.setTextSize(A002.getConversationFont().A02(A002.getResources()));
                ContactNameSecondary A01 = commentHeader.getContactNameSecondary();
                AnonymousClass3T1 r13 = r8;
                AnonymousClass141 r42 = A08;
                int i2 = A0A;
                AnonymousClass34G r2 = A0C;
                C36321k7.A0w(r13, r42);
                AnonymousClass00C.A0D(r2, 3);
                if (!r13.A1J.A02) {
                    A01.getElevatedProfileNameHelper().A00(A01, r2.A00, r42, i2);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentHeader$bind$1(CommentHeader commentHeader, AnonymousClass3T1 r3, C023509x r4) {
        super(2, r4);
        this.$message = r3;
        this.this$0 = commentHeader;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommentHeader$bind$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        final AnonymousClass11F A0J;
        final AnonymousClass141 A08;
        AnonymousClass0AO r1 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3T1 r3 = this.$message;
            if (r3.A1J.A02) {
                A0J = C36441kJ.A0n(this.this$0.getMeManager());
            } else {
                A0J = r3.A0J();
            }
            if (this.$message.A1J.A02) {
                C19730wQ meManager = this.this$0.getMeManager();
                meManager.A0G();
                A08 = meManager.A0E;
            } else if (A0J != null) {
                A08 = this.this$0.getContactManager().A08(A0J);
            }
            if (A08 != null) {
                final int A0A = this.this$0.getWaContactNames().A0A(this.$message.A1J.A00);
                final AnonymousClass34G A0C = this.this$0.getWaContactNames().A0C(A08, A0A);
                C005502l mainDispatcher = this.this$0.getMainDispatcher();
                final CommentHeader commentHeader = this.this$0;
                final AnonymousClass3T1 r8 = this.$message;
                AnonymousClass1 r32 = new AnonymousClass1((C023509x) null);
                this.label = 1;
                if (AnonymousClass0A2.A00(this, mainDispatcher, r32) == r1) {
                    return r1;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentHeader$bind$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
