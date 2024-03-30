package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1PW;
import X.AnonymousClass1PZ;
import X.AnonymousClass53G;
import X.AnonymousClass53J;
import X.AnonymousClass6YM;
import X.AnonymousClass7gG;
import X.AnonymousClass7gH;
import X.C001700s;
import X.C007403e;
import X.C023509x;
import X.C105545Fb;
import X.C109325Xd;
import X.C116975lV;
import X.C1260962n;
import X.C164857sU;
import X.C19730wQ;
import X.C20810yC;
import X.C21060yb;
import X.C36321k7;
import X.C36391kE;
import X.C36431kI;
import X.C95504lc;
import android.os.PowerManager;
import com.whatsapp.jid.UserJid;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class AudioChatCallingViewModel extends C95504lc implements AnonymousClass7gG {
    public C116975lV A00 = AnonymousClass53J.A00;
    public AnonymousClass6YM A01;
    public C1260962n A02;
    public UserJid A03;
    public String A04;
    public Set A05;
    public C007403e A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public PowerManager.WakeLock A0B;
    public boolean A0C;
    public final C001700s A0D = C36431kI.A0S();
    public final C001700s A0E = C36431kI.A0S();
    public final C001700s A0F = C36431kI.A0S();
    public final C19730wQ A0G;
    public final C105545Fb A0H;
    public final AnonymousClass1PZ A0I;
    public final AnonymousClass1PW A0J;
    public final AnonymousClass7gH A0K = new C164857sU(this, 0);
    public final AnonymousClass16D A0L;
    public final AnonymousClass171 A0M;
    public final C21060yb A0N;
    public final AnonymousClass17X A0O;
    public final C20810yC A0P;

    public static final void A07(AudioChatCallingViewModel audioChatCallingViewModel) {
        if (audioChatCallingViewModel.A01 != null) {
            audioChatCallingViewModel.A0J.A02(audioChatCallingViewModel);
            audioChatCallingViewModel.A01 = null;
        }
        C1260962n r0 = audioChatCallingViewModel.A02;
        if (r0 != null) {
            r0.A00((AnonymousClass7gH) null);
        }
        A09(audioChatCallingViewModel, false);
    }

    public static final void A08(AudioChatCallingViewModel audioChatCallingViewModel, C116975lV r4) {
        if ((r4 instanceof AnonymousClass53G) && !AnonymousClass00C.A0J(r4, audioChatCallingViewModel.A00)) {
            C007403e r0 = audioChatCallingViewModel.A06;
            if (r0 != null) {
                r0.B2S((CancellationException) null);
            }
            audioChatCallingViewModel.A06 = C36391kE.A12(new AudioChatCallingViewModel$restartSubtitleTimer$1(audioChatCallingViewModel, (C023509x) null), C109325Xd.A00(audioChatCallingViewModel));
        }
        audioChatCallingViewModel.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r4, boolean r5) {
        /*
            boolean r0 = r4.A0C
            if (r0 == r5) goto L_0x0027
            r4.A0C = r5
            r3 = 1
            android.os.PowerManager$WakeLock r0 = r4.A0B
            if (r5 == 0) goto L_0x0032
            if (r0 != 0) goto L_0x0021
            X.0yb r0 = r4.A0N
            android.os.PowerManager r2 = r0.A0G()
            if (r2 == 0) goto L_0x0030
            r1 = 32
            java.lang.String r0 = "AudioChatCallingViewModel"
            android.os.PowerManager$WakeLock r0 = X.C111765co.A00(r2, r0, r1)
        L_0x001d:
            r4.A0B = r0
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            boolean r0 = r0.isHeld()
            if (r0 != r3) goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            android.os.PowerManager$WakeLock r0 = r4.A0B
            if (r0 == 0) goto L_0x0027
            r0.acquire()
            return
        L_0x0030:
            r0 = 0
            goto L_0x001d
        L_0x0032:
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.isHeld()
            if (r0 != r3) goto L_0x0027
            android.os.PowerManager$WakeLock r0 = r4.A0B
            if (r0 == 0) goto L_0x0027
            r0.release(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A09(com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel, boolean):void");
    }

    public void A0R() {
        this.A0H.unregisterObserver(this);
        A07(this);
    }

    public void BgL(AnonymousClass6YM r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.whatsapp.calling.service.VoiceService");
        this.A01 = r2;
    }

    public AudioChatCallingViewModel(C19730wQ r3, C105545Fb r4, AnonymousClass1PZ r5, AnonymousClass1PW r6, AnonymousClass16D r7, AnonymousClass171 r8, C21060yb r9, AnonymousClass17X r10, C20810yC r11) {
        C36321k7.A1B(r11, r6, r4, r3, r8);
        C36321k7.A13(r7, r10, r9);
        AnonymousClass00C.A0D(r5, 9);
        this.A0P = r11;
        this.A0J = r6;
        this.A0H = r4;
        this.A0G = r3;
        this.A0M = r8;
        this.A0L = r7;
        this.A0O = r10;
        this.A0N = r9;
        this.A0I = r5;
        r4.registerObserver(this);
        C95504lc.A02(r4, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.11F} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        if ((r15.A0P.A07(5091) & 64) > 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0135, code lost:
        if (r7 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0137;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass6OZ r14, com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r15) {
        /*
            java.util.LinkedHashSet r6 = X.C36441kJ.A17()
            X.0wy r2 = r14.A04
            java.util.Collection r0 = r2.values()
            X.0y6 r0 = (X.C20750y6) r0
            X.14x r4 = r0.iterator()
            r9 = 0
            r8 = r9
        L_0x0012:
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.Object r3 = r4.next()
            X.AnonymousClass00C.A08(r3)
            X.6EE r3 = (X.AnonymousClass6EE) r3
            int r1 = r3.A02
            r0 = 1
            if (r1 != r0) goto L_0x0012
            if (r8 == 0) goto L_0x002b
            int r5 = r8.A00
        L_0x002b:
            int r0 = r3.A00
            if (r5 >= r0) goto L_0x0030
            r8 = r3
        L_0x0030:
            com.whatsapp.jid.UserJid r0 = r3.A08
            X.AnonymousClass00C.A08(r0)
            r6.add(r0)
            goto L_0x0012
        L_0x0039:
            com.whatsapp.jid.UserJid r4 = r15.A03
            com.whatsapp.voipcalling.CallState r7 = r14.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 == r0) goto L_0x0045
            if (r8 == 0) goto L_0x0045
            com.whatsapp.jid.UserJid r9 = r8.A08
        L_0x0045:
            r15.A03 = r9
            X.00s r1 = r15.A0E
            boolean r0 = r15.A09
            r12 = 1
            if (r0 == 0) goto L_0x01cc
            boolean r0 = r15.A0A
            if (r0 != 0) goto L_0x01cc
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x01cc
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 != r0) goto L_0x0062
            X.0yC r0 = r15.A0P
            boolean r0 = X.C34681hT.A0N(r0)
            if (r0 != 0) goto L_0x01cc
        L_0x0062:
            r0 = 1
        L_0x0063:
            X.C36341k9.A18(r1, r0)
            boolean r0 = r14.A0J
            if (r0 != 0) goto L_0x011f
            X.53J r8 = X.AnonymousClass53J.A00
        L_0x006c:
            A08(r15, r8)
            X.00s r1 = r15.A0F
            X.AnonymousClass00C.A07(r7)
            com.whatsapp.jid.UserJid r2 = r15.A03
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 != r0) goto L_0x00dd
            r2 = 2131895999(0x7f1226bf, float:1.9426847E38)
        L_0x007d:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.2ft r9 = X.C90524aI.A0O(r0, r2)
        L_0x0083:
            X.147 r3 = r14.A06
            com.whatsapp.jid.UserJid r2 = r15.A03
            r11 = 0
            if (r2 == 0) goto L_0x009a
            if (r3 == 0) goto L_0x00db
            X.17X r0 = r15.A0O
            X.6PM r0 = r0.A03(r3, r2)
            if (r0 == 0) goto L_0x00db
            int r0 = r0.A00
        L_0x0096:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x009a:
            com.whatsapp.jid.UserJid r0 = r15.A03
            if (r0 != 0) goto L_0x009f
            r12 = 0
        L_0x009f:
            X.5lV r0 = r15.A00
            X.3Bc r10 = r0.A00
            X.6EE r0 = r14.A05
            if (r0 == 0) goto L_0x00d9
            boolean r13 = r0.A0F
        L_0x00a9:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 == r0) goto L_0x00b1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r7 != r0) goto L_0x00be
        L_0x00b1:
            X.0yC r2 = r15.A0P
            r0 = 5091(0x13e3, float:7.134E-42)
            int r0 = r2.A07(r0)
            r0 = r0 & 64
            r14 = 1
            if (r0 > 0) goto L_0x00bf
        L_0x00be:
            r14 = 0
        L_0x00bf:
            X.6DE r8 = new X.6DE
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A0D(r8)
            com.whatsapp.jid.UserJid r0 = r15.A03
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00d6
        L_0x00d1:
            X.00s r0 = r15.A0D
            X.C36341k9.A16(r0, r5)
        L_0x00d6:
            r15.A05 = r6
            return
        L_0x00d9:
            r13 = 0
            goto L_0x00a9
        L_0x00db:
            r0 = -1
            goto L_0x0096
        L_0x00dd:
            if (r2 == 0) goto L_0x011a
            X.0wQ r0 = r15.A0G
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x00f1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            X.2ft r9 = X.C90524aI.A0O(r2, r0)
            goto L_0x0083
        L_0x00f1:
            X.16D r0 = r15.A0L
            X.141 r3 = r0.A0D(r2)
            boolean r0 = r3.A0B()
            if (r0 != 0) goto L_0x0113
            X.171 r2 = r15.A0M
            boolean r0 = X.AnonymousClass171.A06(r3)
            if (r0 == 0) goto L_0x0113
            r0 = 2131896511(0x7f1228bf, float:1.9427885E38)
            java.lang.String r0 = X.AnonymousClass171.A03(r2, r3, r0)
        L_0x010c:
            X.2fr r9 = new X.2fr
            r9.<init>(r0)
            goto L_0x0083
        L_0x0113:
            X.171 r0 = r15.A0M
            java.lang.String r0 = r0.A0H(r3)
            goto L_0x010c
        L_0x011a:
            r2 = 2131895825(0x7f122611, float:1.9426494E38)
            goto L_0x007d
        L_0x011f:
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r7 == r1) goto L_0x012b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r7 == r0) goto L_0x012b
            X.53I r8 = X.AnonymousClass53I.A00
            goto L_0x006c
        L_0x012b:
            java.util.Set r8 = r15.A05
            r3 = 0
            if (r8 == 0) goto L_0x018d
            if (r7 == r1) goto L_0x0137
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r1 = 1
            if (r7 != r0) goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x018d
            if (r1 != 0) goto L_0x018d
            X.5lV r1 = r15.A00
            boolean r0 = r1 instanceof X.AnonymousClass53G
            if (r0 == 0) goto L_0x018b
            X.53G r1 = (X.AnonymousClass53G) r1
            if (r1 == 0) goto L_0x018b
            X.141 r1 = r1.A00
        L_0x014c:
            java.util.Iterator r11 = r6.iterator()
        L_0x0150:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r10 = r11.next()
            r9 = r10
            X.11F r9 = (X.AnonymousClass11F) r9
            if (r1 == 0) goto L_0x0189
            X.11F r0 = r1.A0H
        L_0x0161:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r9)
            if (r0 != 0) goto L_0x0150
            boolean r0 = r8.contains(r9)
            if (r0 != 0) goto L_0x0150
            X.0wQ r0 = r15.A0G
            boolean r0 = r0.A0M(r9)
            if (r0 != 0) goto L_0x0150
            r3 = r10
        L_0x0176:
            X.11F r3 = (X.AnonymousClass11F) r3
            if (r3 == 0) goto L_0x018d
            X.16D r0 = r15.A0L
            X.141 r1 = r0.A0D(r3)
            X.171 r0 = r15.A0M
            X.53G r8 = new X.53G
            r8.<init>(r0, r1)
            goto L_0x006c
        L_0x0189:
            r0 = r3
            goto L_0x0161
        L_0x018b:
            r1 = r3
            goto L_0x014c
        L_0x018d:
            X.5lV r8 = r15.A00
            boolean r0 = r8 instanceof X.AnonymousClass53G
            if (r0 != 0) goto L_0x006c
            boolean r0 = r15.A08
            if (r0 != 0) goto L_0x019b
            X.53K r8 = X.AnonymousClass53K.A00
            goto L_0x006c
        L_0x019b:
            X.147 r1 = r14.A06
            if (r1 == 0) goto L_0x01b2
            X.16D r0 = r15.A0L
            X.141 r2 = r0.A0D(r1)
            int r1 = r6.size()
            X.171 r0 = r15.A0M
            X.53H r8 = new X.53H
            r8.<init>(r0, r2, r1)
            goto L_0x006c
        L_0x01b2:
            java.util.Set r0 = r2.keySet()
            X.AnonymousClass00C.A08(r0)
            java.util.List r3 = X.C007103b.A0Y(r0)
            int r2 = r6.size()
            X.171 r1 = r15.A0M
            X.16D r0 = r15.A0L
            X.53H r8 = new X.53H
            r8.<init>(r0, r1, r3, r2)
            goto L_0x006c
        L_0x01cc:
            r0 = 0
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A06(X.6OZ, com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel):void");
    }
}
