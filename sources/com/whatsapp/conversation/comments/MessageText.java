package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass1A5;
import X.AnonymousClass1C6;
import X.AnonymousClass1H2;
import X.AnonymousClass1RJ;
import X.AnonymousClass3T1;
import X.AnonymousClass9SI;
import X.C05250Oz;
import X.C18800tq;
import X.C18830tt;
import X.C194889Rq;
import X.C19730wQ;
import X.C19890wg;
import X.C199009eY;
import X.C20350xQ;
import X.C20800yB;
import X.C21000yV;
import X.C21060yb;
import X.C220412q;
import X.C27851Qb;
import X.C27861Qc;
import X.C28371Sj;
import X.C32711e4;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36431kI;
import X.C598835q;
import X.C61743Dg;
import X.C63193Jc;
import X.C64933Qa;
import X.C65853Ts;
import X.C67673aI;
import X.C70433f9;
import X.C74243lI;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class MessageText extends TextEmojiLabel {
    public int A00;
    public C19730wQ A01;
    public AnonymousClass16D A02;
    public C63193Jc A03;
    public AnonymousClass9SI A04;
    public C61743Dg A05;
    public C199009eY A06;
    public C194889Rq A07;
    public C220412q A08;
    public AnonymousClass1A5 A09;
    public C20350xQ A0A;
    public AnonymousClass1C6 A0B;
    public C32711e4 A0C;
    public AnonymousClass1RJ A0D;
    public AnonymousClass3T1 A0E;
    public boolean A0F;

    public final void setChatsCache(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setConversationContactManager(AnonymousClass1A5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setConversationFont(C63193Jc r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setGroupChatManager(C20350xQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setGroupLinkHelper(C61743Dg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkifierUtils(C32711e4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setPhoneLinkHelper(C199009eY r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setSpamManager(AnonymousClass1C6 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setSuspiciousLinkHelper(C194889Rq r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public void A09() {
        if (!this.A0F) {
            this.A0F = true;
            C27861Qc r3 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r2 = r3.A0M;
            C36321k7.A0d(r2, this);
            C18830tt r1 = r2.A00;
            C36361kB.A1D(r1, this);
            this.A08 = C36351kA.A0a(r2);
            this.A02 = C36341k9.A0R(r2);
            this.A09 = C36371kC.A0X(r2);
            this.A03 = C36371kC.A0V(r2);
            this.A0A = C36361kB.A0a(r2);
            this.A05 = C27861Qc.A0R(r3);
            this.A0C = (C32711e4) r1.A2Z.get();
            this.A01 = C36351kA.A0N(r2);
            this.A06 = C27861Qc.A0V(r3);
            this.A0B = (AnonymousClass1C6) r2.A7s.get();
            this.A07 = C27861Qc.A0W(r3);
        }
    }

    public final void A0K(AnonymousClass9SI r19, AnonymousClass3T1 r20, AnonymousClass1RJ r21) {
        C64933Qa r1;
        AnonymousClass9SI r2;
        AnonymousClass3T1 r0 = r20;
        C64933Qa r22 = r0.A1J;
        AnonymousClass3T1 r12 = this.A0E;
        if (r12 != null) {
            r1 = r12.A1J;
        } else {
            r1 = null;
        }
        if (!AnonymousClass00C.A0J(r22, r1)) {
            this.A00 = 1;
            C36421kH.A1F(this.A0D);
        }
        this.A04 = r19;
        this.A0D = r21;
        this.A0E = r0;
        String A0b = r0.A0b();
        if (A0b == null) {
            A0b = "";
        }
        AnonymousClass1H2 r9 = this.A04;
        C21060yb r8 = this.A02;
        getWhatsAppLocale();
        C19890wg r11 = this.A05;
        C67673aI r5 = new C67673aI(this, r0);
        C74243lI r7 = new C74243lI(this.A00, 768);
        C63193Jc conversationFont = getConversationFont();
        C598835q A002 = C65853Ts.A00((Context) null, r5, this, r7, r8, r9, (C28371Sj) null, r11, (AnonymousClass3T1) null, A0b, conversationFont.A03(getResources(), conversationFont.A00), r0.A1I, true, C20800yB.A01(C21000yV.A01, getAbProps(), 4093));
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) A002.A00;
        Boolean bool = (Boolean) A002.A01;
        AnonymousClass00C.A0B(bool);
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            C33521fV.A08(this, this.A02, getAbProps());
            C36361kB.A19(this);
        }
        C36431kI.A1M(this, spannableStringBuilder);
        AnonymousClass00C.A0B(spannableStringBuilder);
        AnonymousClass16D contactManager = getContactManager();
        AnonymousClass1A5 conversationContactManager = getConversationContactManager();
        C20350xQ groupChatManager = getGroupChatManager();
        C19730wQ meManager = getMeManager();
        AnonymousClass1C6 spamManager = getSpamManager();
        if (C65853Ts.A06(meManager, contactManager, getChatsCache(), conversationContactManager, getAbProps(), groupChatManager, r0, spamManager) && (r2 = this.A04) != null) {
            r2.A00(this, new C70433f9(this, r0, booleanValue), r0, spannableStringBuilder);
        }
    }

    public final C220412q getChatsCache() {
        C220412q r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final AnonymousClass1A5 getConversationContactManager() {
        AnonymousClass1A5 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("conversationContactManager");
    }

    public final C63193Jc getConversationFont() {
        C63193Jc r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("conversationFont");
    }

    public final C20350xQ getGroupChatManager() {
        C20350xQ r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatManager");
    }

    public final C61743Dg getGroupLinkHelper() {
        C61743Dg r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupLinkHelper");
    }

    public final C32711e4 getLinkifierUtils() {
        C32711e4 r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkifierUtils");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C199009eY getPhoneLinkHelper() {
        C199009eY r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("phoneLinkHelper");
    }

    public final AnonymousClass1C6 getSpamManager() {
        AnonymousClass1C6 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("spamManager");
    }

    public final C194889Rq getSuspiciousLinkHelper() {
        C194889Rq r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("suspiciousLinkHelper");
    }

    public MessageText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    public final AnonymousClass9SI getAsyncLinkifier() {
        return this.A04;
    }

    public final AnonymousClass3T1 getFMessage() {
        return this.A0E;
    }

    public final int getPageLimit() {
        return this.A00;
    }

    public final AnonymousClass1RJ getSuspiciousLinkViewStub() {
        return this.A0D;
    }

    public final void setAsyncLinkifier(AnonymousClass9SI r1) {
        this.A04 = r1;
    }

    public final void setFMessage(AnonymousClass3T1 r1) {
        this.A0E = r1;
    }

    public final void setPageLimit(int i) {
        this.A00 = i;
    }

    public final void setSuspiciousLinkViewStub(AnonymousClass1RJ r1) {
        this.A0D = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
        this.A00 = 1;
    }

    public /* synthetic */ MessageText(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
