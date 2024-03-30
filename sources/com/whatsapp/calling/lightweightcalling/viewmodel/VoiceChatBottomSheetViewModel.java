package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1HK;
import X.AnonymousClass1HO;
import X.AnonymousClass1ND;
import X.AnonymousClass1PW;
import X.AnonymousClass5SC;
import X.AnonymousClass6YM;
import X.AnonymousClass7gG;
import X.C001700s;
import X.C005502l;
import X.C105545Fb;
import X.C1501574e;
import X.C162747p5;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C36321k7;
import X.C36431kI;
import X.C61243Bc;
import X.C95504lc;
import com.whatsapp.jid.GroupJid;

public final class VoiceChatBottomSheetViewModel extends C95504lc implements AnonymousClass7gG {
    public AnonymousClass5SC A00 = AnonymousClass5SC.NotInLobby;
    public AnonymousClass6YM A01;
    public GroupJid A02;
    public C61243Bc A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C001700s A08 = C36431kI.A0S();
    public final C001700s A09 = C36431kI.A0S();
    public final C001700s A0A = C36431kI.A0S();
    public final C19730wQ A0B;
    public final C105545Fb A0C;
    public final AnonymousClass1ND A0D;
    public final AnonymousClass1PW A0E;
    public final AnonymousClass16D A0F;
    public final AnonymousClass171 A0G;
    public final AnonymousClass1HK A0H;
    public final AnonymousClass17X A0I;
    public final AnonymousClass1HO A0J;
    public final C20810yC A0K;
    public final C19770wU A0L;
    public final C005502l A0M;
    public final C005502l A0N;
    public final AnonymousClass16I A0O;
    public final C162747p5 A0P;
    public volatile boolean A0Q;

    public void A0R() {
        this.A0Q = true;
        this.A0C.unregisterObserver(this);
        this.A0O.unregisterObserver(this.A0P);
        A07(this);
    }

    public static final void A07(VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel) {
        if (voiceChatBottomSheetViewModel.A01 != null) {
            voiceChatBottomSheetViewModel.A0E.A02(voiceChatBottomSheetViewModel);
            voiceChatBottomSheetViewModel.A01 = null;
            voiceChatBottomSheetViewModel.A04 = null;
            C95504lc.A02(voiceChatBottomSheetViewModel.A0C, voiceChatBottomSheetViewModel);
            voiceChatBottomSheetViewModel.A02 = null;
            voiceChatBottomSheetViewModel.A0L.Bp1(new C1501574e(voiceChatBottomSheetViewModel, 22));
            voiceChatBottomSheetViewModel.A07 = false;
        }
    }

    public void BgL(AnonymousClass6YM r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.whatsapp.calling.service.VoiceService");
        this.A01 = r2;
        C95504lc.A02(this.A0C, this);
    }

    public VoiceChatBottomSheetViewModel(C19730wQ r3, C105545Fb r4, AnonymousClass1ND r5, AnonymousClass1PW r6, AnonymousClass16D r7, AnonymousClass16I r8, AnonymousClass171 r9, AnonymousClass1HK r10, AnonymousClass17X r11, AnonymousClass1HO r12, C20810yC r13, C19770wU r14, C005502l r15, C005502l r16) {
        C36321k7.A1B(r13, r3, r14, r5, r10);
        C36321k7.A1C(r9, r4, r7, r8, r6);
        C36321k7.A15(r12, r11, r15);
        C005502l r1 = r16;
        AnonymousClass00C.A0D(r1, 14);
        this.A0K = r13;
        this.A0B = r3;
        this.A0L = r14;
        this.A0D = r5;
        this.A0H = r10;
        this.A0G = r9;
        this.A0C = r4;
        this.A0F = r7;
        this.A0O = r8;
        this.A0E = r6;
        this.A0J = r12;
        this.A0I = r11;
        this.A0N = r15;
        this.A0M = r1;
        C162747p5 r17 = new C162747p5(this, 3);
        this.A0P = r17;
        r4.registerObserver(this);
        r8.registerObserver(r17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r8.A0K.A07(5429) >= 3) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A06(com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r8, com.whatsapp.voipcalling.CallState r9, int r10, boolean r11, boolean r12) {
        /*
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r9 != r0) goto L_0x0083
            X.5SC r0 = X.AnonymousClass5SC.Creator
        L_0x000a:
            r8.A00 = r0
            X.5SC r6 = X.AnonymousClass5SC.Creator
            r7 = 3
            r3 = 0
            r4 = 1
            if (r0 != r6) goto L_0x001e
            X.0yC r1 = r8.A0K
            r0 = 5429(0x1535, float:7.608E-42)
            int r0 = r1.A07(r0)
            r1 = 0
            if (r0 < r7) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            X.5SC r0 = r8.A00
            int r0 = r0.ordinal()
            if (r0 != r4) goto L_0x0029
            boolean r11 = r8.A06
        L_0x0029:
            X.53E r0 = new X.53E
            r0.<init>(r11, r1)
            r2.add(r0)
            boolean r5 = X.AnonymousClass000.A1S(r10, r4)
            X.5SC r0 = r8.A00
            X.5SC r4 = X.AnonymousClass5SC.NotInLobby
            boolean r1 = X.C36361kB.A1a(r0, r4)
            X.53A r0 = new X.53A
            r0.<init>(r5, r1)
            r2.add(r0)
            X.5SC r0 = r8.A00
            boolean r5 = X.C36361kB.A1a(r0, r4)
            boolean r1 = X.AnonymousClass000.A1S(r10, r7)
            X.53D r0 = new X.53D
            r0.<init>(r5, r12, r1)
            r2.add(r0)
            X.5SC r0 = r8.A00
            boolean r1 = X.C36361kB.A1a(r0, r6)
            X.53C r0 = new X.53C
            r0.<init>(r1)
            r2.add(r0)
            X.5SC r1 = r8.A00
            X.5SC r0 = X.AnonymousClass5SC.Joiner
            boolean r1 = X.C36361kB.A1a(r1, r0)
            X.53F r0 = new X.53F
            r0.<init>(r11, r1)
            r2.add(r0)
            X.5SC r0 = r8.A00
            if (r0 != r4) goto L_0x007a
            r3 = 1
        L_0x007a:
            X.53B r0 = new X.53B
            r0.<init>(r3)
            r2.add(r0)
            return r2
        L_0x0083:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r9 == r0) goto L_0x008b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r9 != r0) goto L_0x0097
        L_0x008b:
            X.0yC r0 = r8.A0K
            boolean r0 = X.C34681hT.A0N(r0)
            if (r0 == 0) goto L_0x0097
            X.5SC r0 = X.AnonymousClass5SC.Joiner
            goto L_0x000a
        L_0x0097:
            X.5SC r0 = X.AnonymousClass5SC.NotInLobby
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel.A06(com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel, com.whatsapp.voipcalling.CallState, int, boolean, boolean):java.util.ArrayList");
    }
}
