package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass2I7;
import X.AnonymousClass2bT;
import X.AnonymousClass3T1;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C19730wQ;
import X.C36391kE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1", f = "ConversationRowEvent.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillResponsesSection$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass2bT $eventMessage;
    public final /* synthetic */ List $facePileMessages;
    public int label;
    public final /* synthetic */ AnonymousClass2I7 this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1$1", f = "ConversationRowEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r3, r22, A0I, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            if (r0 == null) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
            if (r3.size() == 2) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                if (r0 != 0) goto L_0x00b7
                X.AnonymousClass0AN.A00(r10)
                java.util.ArrayList r0 = r5
                java.util.Iterator r8 = r0.iterator()
                r6 = 0
                r1 = 0
            L_0x000f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0037
                int r7 = r1 + 1
                X.141 r5 = X.C36391kE.A0f(r8)
                X.2I7 r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0G
                com.whatsapp.WaImageView r4 = r0.A02(r1)
                if (r4 == 0) goto L_0x0035
                X.2I7 r3 = r3
                X.1RY r2 = r3.A0H
                r1 = 1
                X.3U6 r0 = new X.3U6
                r0.<init>(r5, r3, r1)
                r2.A06(r4, r0, r5, r6)
                r4.setVisibility(r6)
            L_0x0035:
                r1 = r7
                goto L_0x000f
            L_0x0037:
                java.util.ArrayList r3 = r5
                boolean r0 = r3.isEmpty()
                r2 = 8
                r7 = 1
                if (r0 == 0) goto L_0x0071
                X.2I7 r0 = r3
                android.widget.LinearLayout r0 = r0.A09
            L_0x0046:
                r0.setVisibility(r2)
            L_0x0049:
                X.2bT r0 = r2
                java.util.List r1 = r0.A1X()
                r0 = 0
                if (r1 == 0) goto L_0x009b
                java.util.ArrayList r4 = X.AnonymousClass001.A0I()
                java.util.Iterator r3 = r1.iterator()
            L_0x005a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0097
                java.lang.Object r2 = r3.next()
                r0 = r2
                X.2bd r0 = (X.C46762bd) r0
                X.2pC r1 = r0.A01
                X.2pC r0 = X.C52292pC.GOING
                if (r1 != r0) goto L_0x005a
                r4.add(r2)
                goto L_0x005a
            L_0x0071:
                int r0 = r3.size()
                r1 = 2
                if (r0 != r7) goto L_0x0090
                X.2I7 r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0G
                com.whatsapp.WaImageView r0 = r0.A02(r7)
                if (r0 == 0) goto L_0x0085
                r0.setVisibility(r2)
            L_0x0085:
                X.2I7 r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0G
                com.whatsapp.WaImageView r0 = r0.A02(r1)
                if (r0 != 0) goto L_0x0046
                goto L_0x0049
            L_0x0090:
                int r0 = r3.size()
                if (r0 != r1) goto L_0x0049
                goto L_0x0085
            L_0x0097:
                int r0 = r4.size()
            L_0x009b:
                int r5 = r0 + 1
                X.2I7 r0 = r3
                com.whatsapp.WaTextView r4 = r0.A0F
                android.content.res.Resources r3 = X.C36341k9.A0F(r0)
                r2 = 2131755110(0x7f100066, float:1.914109E38)
                java.lang.Object[] r1 = new java.lang.Object[r7]
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r5)
                r1[r6] = r0
                X.C36351kA.A16(r3, r4, r1, r2, r5)
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x00b7:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillResponsesSection$1(AnonymousClass2I7 r2, AnonymousClass2bT r3, List list, C023509x r5) {
        super(2, r5);
        this.$facePileMessages = list;
        this.this$0 = r2;
        this.$eventMessage = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ConversationRowEvent$fillResponsesSection$1(this.this$0, this.$eventMessage, this.$facePileMessages, r6);
    }

    public final Object invokeSuspend(Object obj) {
        Object A0D;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = this.$facePileMessages.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A0l = C36391kE.A0l(it);
                AnonymousClass2I7 r2 = this.this$0;
                if (A0l.A1J.A02) {
                    C19730wQ r0 = r2.A0T;
                    r0.A0G();
                    A0D = r0.A0E;
                } else {
                    AnonymousClass11F A0J = A0l.A0J();
                    if (A0J != null) {
                        A0D = r2.A0l.A0D(A0J);
                    }
                }
                if (A0D != null) {
                    A0I.add(A0D);
                }
            }
            C005502l mainDispatcher = this.this$0.getMainDispatcher();
            final AnonymousClass2I7 r3 = this.this$0;
            final AnonymousClass2bT r22 = this.$eventMessage;
            AnonymousClass1 r02 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, mainDispatcher, r02) == r6) {
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
        return ((ConversationRowEvent$fillResponsesSection$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
