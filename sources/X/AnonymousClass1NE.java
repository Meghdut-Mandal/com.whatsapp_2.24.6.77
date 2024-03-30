package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1NE  reason: invalid class name */
public class AnonymousClass1NE implements AnonymousClass1ND {
    public long A00;
    public AnonymousClass00I A01;
    public final Handler A02;
    public final C21390zA A03;
    public final C19700wN A04;
    public final AnonymousClass17Y A05;
    public final C19730wQ A06;
    public final C21100yf A07;
    public final AnonymousClass1NG A08;
    public final AnonymousClass1PZ A09;
    public final AnonymousClass1PW A0A;
    public final C27671Pf A0B;
    public final C27641Pb A0C;
    public final AnonymousClass16D A0D;
    public final C21060yb A0E;
    public final C19970wo A0F;
    public final C20830yE A0G;
    public final AnonymousClass17X A0H;
    public final AnonymousClass1HO A0I;
    public final AnonymousClass12O A0J;
    public final C20810yC A0K;
    public final AnonymousClass1EL A0L;
    public final AnonymousClass13J A0M;
    public final C19770wU A0N;
    public final AnonymousClass005 A0O;
    public final C27631Pa A0P;
    public final AnonymousClass1NF A0Q;
    public final C27701Pj A0R;
    public final C27651Pc A0S;
    public final C19600wD A0T;
    public final AnonymousClass171 A0U;
    public final C19630wG A0V;
    public final C18820ts A0W;
    public final C20350xQ A0X;
    public final AnonymousClass1C6 A0Y;
    public volatile AnonymousClass6NW A0Z;

    public AnonymousClass1NE(C21390zA r9, C19700wN r10, AnonymousClass17Y r11, C19730wQ r12, C21100yf r13, AnonymousClass1NG r14, C27631Pa r15, AnonymousClass1PZ r16, AnonymousClass1NF r17, AnonymousClass1PW r18, C27671Pf r19, C27701Pj r20, C27641Pb r21, C27651Pc r22, C19600wD r23, AnonymousClass16D r24, AnonymousClass171 r25, C21060yb r26, C19970wo r27, C19630wG r28, C20830yE r29, C18820ts r30, AnonymousClass17X r31, AnonymousClass1HO r32, AnonymousClass12O r33, C20810yC r34, C20350xQ r35, AnonymousClass1EL r36, AnonymousClass1C6 r37, AnonymousClass13J r38, C19770wU r39, AnonymousClass005 r40) {
        C19970wo r5 = r27;
        this.A0F = r5;
        C20810yC r7 = r34;
        this.A0K = r7;
        this.A05 = r11;
        this.A04 = r10;
        this.A06 = r12;
        C19630wG r6 = r28;
        this.A0V = r6;
        this.A0N = r39;
        this.A0Y = r37;
        AnonymousClass1NF r2 = r17;
        this.A0Q = r2;
        this.A07 = r13;
        this.A0D = r24;
        this.A0E = r26;
        this.A0M = r38;
        this.A0U = r25;
        this.A0W = r30;
        this.A08 = r14;
        this.A0X = r35;
        this.A0J = r33;
        this.A0L = r36;
        this.A0A = r18;
        this.A0G = r29;
        this.A0I = r32;
        this.A09 = r16;
        this.A0P = r15;
        this.A0C = r21;
        this.A0H = r31;
        this.A0T = r23;
        this.A03 = r9;
        this.A0S = r22;
        C27671Pf r4 = r19;
        this.A0B = r4;
        this.A0O = r40;
        this.A0R = r20;
        if (Build.VERSION.SDK_INT >= 28) {
            r4.A08(new C27711Pl(r2, this, r4, r5, r6, r7));
        }
        this.A02 = new C35951jW(Looper.getMainLooper(), this, r5);
    }

    public static int A01(AnonymousClass1NE r14, AnonymousClass6NW r15, String str, List list, boolean z, boolean z2) {
        String charSequence;
        String A022;
        List list2 = list;
        UserJid userJid = (UserJid) list2.get(0);
        boolean z3 = r15.A0D;
        Context context = r14.A0V.A00;
        AnonymousClass16D r5 = r14.A0D;
        AnonymousClass171 r4 = r14.A0U;
        AnonymousClass141 A012 = AnonymousClass3UL.A01(r5, r14.A0X, r15.A07, r14.A0Y, z3);
        if (A012 == null || (A022 = r4.A0Q(A012, -1)) == null) {
            boolean z4 = false;
            if (list2.size() == 1) {
                z4 = true;
            }
            C61243Bc A042 = AnonymousClass3UD.A04(r5, r4, list2, 2, z4);
            if (A042 == null) {
                charSequence = null;
            } else {
                charSequence = A042.A00(context).toString();
            }
            A022 = AnonymousClass3TB.A02(charSequence);
        }
        if (A022 == null) {
            Log.w("app/startOutgoingCall/startTelecomFrameworkInternal displayName is null");
        } else if (Build.VERSION.SDK_INT >= 28) {
            C27671Pf r8 = r14.A0B;
            if (r8.A0D()) {
                r14.A00 = SystemClock.elapsedRealtime();
                if (r8.A0E()) {
                    r14.A0Z = r15;
                    boolean z5 = z2;
                    if (r8.A0G(userJid, str, A022, z, z5)) {
                        Handler handler = r14.A02;
                        handler.removeMessages(1);
                        Message message = new Message();
                        message.what = 1;
                        message.obj = Boolean.valueOf(z5);
                        handler.sendMessageDelayed(message, 2000);
                        return 0;
                    }
                    r14.A0Z = null;
                    return 10;
                }
            }
        }
        return 10;
    }

    public static AnonymousClass00I A02(int i) {
        int i2;
        int i3 = 1;
        int i4 = null;
        if (!(i == 1 || i == 2)) {
            if (i != 4) {
                if (i != 7) {
                    if (i != 16) {
                        if (i != 25) {
                            if (!(i == 35 || i == 9)) {
                                if (i != 10) {
                                    switch (i) {
                                        case 45:
                                        case 46:
                                        case 47:
                                            i2 = 4;
                                            i4 = 7;
                                            break;
                                    }
                                }
                            }
                        } else {
                            return new AnonymousClass00I(4, 1);
                        }
                    }
                }
                i3 = 5;
            } else {
                i3 = 39;
            }
            i2 = Integer.valueOf(i3);
            return new AnonymousClass00I(i2, i4);
        }
        i3 = 15;
        i2 = Integer.valueOf(i3);
        return new AnonymousClass00I(i2, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r0 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (android.text.TextUtils.equals(r15, r5.callId) == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A08(android.content.Context r12, X.C63083Ir r13, com.whatsapp.jid.GroupJid r14, java.lang.String r15, java.util.ArrayList r16, java.util.ArrayList r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r11 = this;
            r3 = 0
            r2 = 1
            r10 = 0
            if (r15 == 0) goto L_0x0006
            r10 = 1
        L_0x0006:
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r4 = r18.size()
            if (r15 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
            java.lang.String r0 = r5.callId
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            r1 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r0 = 0
            if (r13 == 0) goto L_0x0020
            r0 = 1
        L_0x0020:
            if (r1 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = r13.A02
            java.lang.String r0 = r5.callLinkToken
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            if (r4 != 0) goto L_0x0072
            X.190 r2 = new X.190
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r5.getPeerJid()
            X.C18740tg.A06(r1)
            X.0zA r0 = r11.A03
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r2 = r2.A1b(r12, r1, r0)
            r1 = 3
            java.lang.String r0 = "lobbyEntryPoint"
            r2.putExtra(r0, r1)
            r12.startActivity(r2)
        L_0x0053:
            r1 = 8
            return r1
        L_0x0056:
            if (r0 == 0) goto L_0x0072
        L_0x0058:
            if (r4 != 0) goto L_0x0072
            r1 = 0
            java.util.List r0 = java.util.Collections.singletonList(r15)
            android.os.Message r3 = android.os.Message.obtain(r1, r3, r0)
            X.1PW r2 = r11.A0A
            java.lang.String r1 = "check_ongoing_calls"
            X.6Up r0 = new X.6Up
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            r1 = 12
            return r1
        L_0x0072:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "app/startOutgoingCall empty list of contacts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r10 != 0) goto L_0x0086
            if (r14 == 0) goto L_0x0086
            r0 = 16
            r11.A05(r0)
        L_0x0086:
            return r2
        L_0x0087:
            X.6NW r0 = r11.A0Z
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "app/startOutgoingCall user tapped the call button twice before the telecom framework responds"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2
            return r1
        L_0x0092:
            r0 = 0
            r11.A00 = r0
            java.util.Iterator r6 = r18.iterator()
        L_0x009a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r4 = r6.next()
            X.141 r4 = (X.AnonymousClass141) r4
            X.0wQ r1 = r11.A06
            X.11F r0 = r4.A0H
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x00b9
            X.17Y r1 = r11.A05
            r0 = 2131895921(0x7f122671, float:1.9426689E38)
            r1.A04(r0, r2)
            return r2
        L_0x00b9:
            boolean r0 = r4.A0G()
            r1 = r0 ^ 1
            java.lang.String r0 = "can't start a call with a group contact"
            X.C18740tg.A0E(r1, r0)
            goto L_0x009a
        L_0x00c5:
            r1 = r20
            if (r10 == 0) goto L_0x00cb
            if (r20 == 0) goto L_0x00d3
        L_0x00cb:
            boolean r0 = r11.A09(r12, r1)
            if (r0 != 0) goto L_0x00d3
            r1 = 4
            return r1
        L_0x00d3:
            r9 = 2131895872(0x7f122640, float:1.942659E38)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.0ts r7 = r11.A0W
            X.171 r4 = r11.A0U
            r0 = -1
            r6 = r17
            java.lang.String r0 = r4.A0X(r6, r0)
            java.lang.String r0 = r7.A0G(r0)
            r8[r3] = r0
            java.lang.String r4 = r12.getString(r9, r8)
            int r0 = r18.size()
            if (r0 <= 0) goto L_0x012d
            int r7 = r6.size()
            int r0 = r18.size()
            if (r7 != r0) goto L_0x012d
            X.17Y r0 = r11.A05
            X.14r r5 = r0.A00
            if (r5 == 0) goto L_0x0129
            boolean r0 = r5.BLh()
            if (r0 != 0) goto L_0x0127
            boolean r0 = r5 instanceof X.C225314u
            if (r0 == 0) goto L_0x0127
            com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment r2 = new com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "message"
            r1.putString(r0, r4)
            java.lang.String r0 = "jids"
            r1.putParcelableArrayList(r0, r6)
            r2.A17(r1)
            r5.Btm(r2)
        L_0x0127:
            r1 = 5
            return r1
        L_0x0129:
            r0.A0E(r4, r3)
            goto L_0x0127
        L_0x012d:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0138
            X.17Y r0 = r11.A05
            r0.A0E(r4, r3)
        L_0x0138:
            boolean r0 = r16.isEmpty()
            r4 = r0 ^ 1
            java.lang.String r0 = "callable jids must not be empty"
            X.C18740tg.A0D(r4, r0)
            X.13J r4 = r11.A0M
            X.0yE r7 = r11.A0G
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x01cf
            r0 = r19
            boolean r0 = X.AnonymousClass3UD.A08(r7, r4, r0)
            if (r0 != 0) goto L_0x01cf
            boolean r0 = r7.A0G()
            if (r0 == 0) goto L_0x0163
            r1 = 11
            java.lang.String r0 = "app/startOutgoingCall/failed_no_read_phone_state_permission"
        L_0x015f:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r1
        L_0x0163:
            r4 = 7
            boolean r0 = X.C34681hT.A0T(r5)
            if (r0 == 0) goto L_0x01b1
            com.whatsapp.voipcalling.CallState r6 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r6 == r0) goto L_0x01b1
            java.util.Objects.requireNonNull(r5)
            if (r10 == 0) goto L_0x01f7
            java.lang.String r0 = r5.callId
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            if (r0 == 0) goto L_0x01f7
            boolean r0 = r5.isAudioChat()
            if (r0 == 0) goto L_0x01d3
            com.whatsapp.jid.GroupJid r0 = r5.groupJid
            if (r0 == 0) goto L_0x01d3
            java.lang.String r5 = r5.callId
            X.17Y r0 = r11.A05
            X.14r r4 = r0.A00
            if (r4 == 0) goto L_0x0053
            r11.A04()
            X.AnonymousClass00C.A0D(r5, r3)
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = new com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "audio_chat_call_id"
            r1.putString(r0, r5)
            r2.A17(r1)
            r11.A04()
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r4.Btl(r2, r0)
            goto L_0x0053
        L_0x01b1:
            X.0yb r0 = r11.A0E
            android.telephony.TelephonyManager r0 = r0.A0K()
            int r0 = X.AnonymousClass3UL.A00(r0, r7)
            if (r0 == 0) goto L_0x0212
            r1 = 2131887514(0x7f12059a, float:1.9409637E38)
            if (r10 == 0) goto L_0x01c5
            r1 = 2131895947(0x7f12268b, float:1.9426741E38)
        L_0x01c5:
            X.17Y r0 = r11.A05
            r0.A04(r1, r2)
            r1 = 9
            java.lang.String r0 = "app/startOutgoingCall/failed_cellular_call_in_progress"
            goto L_0x015f
        L_0x01cf:
            r1 = 7
            java.lang.String r0 = "app/startOutgoingCall/failed_no_record_audio_permission"
            goto L_0x015f
        L_0x01d3:
            X.190 r2 = new X.190
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r5.getPeerJid()
            X.C18740tg.A06(r1)
            X.0zA r0 = r11.A03
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r1 = r2.A1b(r12, r1, r0)
            java.lang.String r0 = "lobbyEntryPoint"
            r1.putExtra(r0, r4)
            r12.startActivity(r1)
            goto L_0x0053
        L_0x01f7:
            java.lang.String r0 = "app/startOutgoingCall/ try to start outgoing call from active voip call "
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131889278(0x7f120c7e, float:1.9413215E38)
            if (r10 == 0) goto L_0x0204
            r0 = 2131889294(0x7f120c8e, float:1.9413248E38)
        L_0x0204:
            android.widget.Toast r1 = android.widget.Toast.makeText(r12, r0, r2)
            r0 = 17
            r1.setGravity(r0, r3, r3)
            r1.show()
            goto L_0x0053
        L_0x0212:
            if (r10 != 0) goto L_0x028e
            if (r14 == 0) goto L_0x028e
            X.17X r5 = r11.A0H
            boolean r0 = r5.A0C(r14)
            r4 = 0
            if (r0 != 0) goto L_0x022d
            r0 = 13
            r11.A05(r0)
            X.0wN r1 = r11.A04
            java.lang.String r0 = "linked-group-call/left-chat-group"
        L_0x0228:
            r1.A0E(r0, r4, r3)
        L_0x022b:
            r1 = 1
            return r1
        L_0x022d:
            X.16D r0 = r11.A0D
            X.141 r2 = r0.A0A(r14)
            X.C18740tg.A06(r2)
            X.1EL r0 = r11.A0L
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0244
            r0 = 17
        L_0x0240:
            r11.A05(r0)
            goto L_0x022b
        L_0x0244:
            boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x0251
            boolean r0 = r5.A0D(r14)
            if (r0 != 0) goto L_0x0251
            r0 = 14
            goto L_0x0240
        L_0x0251:
            X.17r r0 = r5.A07
            X.6X6 r0 = r0.A0C(r14)
            java.util.Map r0 = r0.A08
            java.util.Set r0 = r0.keySet()
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)
            if (r20 != 0) goto L_0x0281
            int r2 = r0.size()
            X.0yf r1 = r11.A07
            X.0yh r0 = X.C21100yf.A1g
            int r1 = r1.A04(r0)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 <= r0) goto L_0x0281
            r0 = 15
            r11.A05(r0)
            X.0wN r1 = r11.A04
            java.lang.String r0 = "linked-group-call/log-exceed-size"
            goto L_0x0228
        L_0x0281:
            X.1HO r0 = r11.A0I
            X.5Ng r0 = r0.A02(r14)
            if (r0 == 0) goto L_0x028c
            r0 = 11
            goto L_0x0240
        L_0x028c:
            r1 = 0
            return r1
        L_0x028e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NE.A08(android.content.Context, X.3Ir, com.whatsapp.jid.GroupJid, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, boolean, boolean):int");
    }

    public boolean B07(Context context, boolean z) {
        if (!A09(context, true)) {
            return false;
        }
        Voip.acceptCall();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C34681hT.A0P(r10.A0K, r10.A0H.A07.A0B(r12)) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BPb(android.content.Context r11, com.whatsapp.jid.GroupJid r12, java.util.List r13, int r14) {
        /*
            r10 = this;
            r2 = r10
            r4 = r12
            if (r12 == 0) goto L_0x0015
            X.0yC r1 = r10.A0K
            X.17X r0 = r10.A0H
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r12)
            boolean r0 = X.C34681hT.A0P(r1, r0)
            r8 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r8 = 0
        L_0x0016:
            r7 = 0
            r9 = 0
            r3 = r11
            r5 = r13
            r6 = r14
            boolean r0 = r2.BPc(r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NE.BPb(android.content.Context, com.whatsapp.jid.GroupJid, java.util.List, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (X.C34681hT.A0C(r3, r4, r14) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BPc(android.content.Context r17, com.whatsapp.jid.GroupJid r18, java.util.List r19, int r20, boolean r21, boolean r22, boolean r23) {
        /*
            r16 = this;
            r5 = 0
            r10 = r16
            r11 = r18
            if (r18 != 0) goto L_0x015b
            r14 = 0
        L_0x0008:
            X.0yC r4 = r10.A0K
            X.0wQ r3 = r10.A06
            boolean r0 = X.C34681hT.A0D(r3, r4, r14)
            if (r0 == 0) goto L_0x0019
            boolean r1 = X.C34681hT.A0C(r3, r4, r14)
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2 = 0
            r6 = 1
            r9 = r17
            r13 = r20
            if (r0 == 0) goto L_0x0069
            if (r21 != 0) goto L_0x0068
            X.17Y r0 = r10.A05
            X.14r r0 = r0.A00
            if (r0 == 0) goto L_0x0068
            X.1qm r8 = X.AnonymousClass3LW.A00(r9)
            r7 = 2131895821(0x7f12260d, float:1.9426486E38)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r1 = 4676(0x1244, float:6.552E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r4, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r5] = r0
            java.lang.String r0 = r9.getString(r7, r3)
            r8.A0p(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r8.A0h(r2, r0)
            r8.A0b()
            X.00I r4 = A02(r13)
            X.1PZ r3 = r10.A09
            r2 = 26
            java.lang.Object r0 = r4.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r4.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.A01(r0, r2, r1)
        L_0x0068:
            return r5
        L_0x0069:
            if (r18 == 0) goto L_0x0068
            X.17X r0 = r10.A0H
            boolean r0 = r0.A0C(r11)
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.C34681hT.A0C(r3, r4, r14)
            if (r0 == 0) goto L_0x0068
            X.1Pa r7 = r10.A0P
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r7)
            java.lang.String r3 = "voice_chat_education_seen_count"
            int r0 = r0.getInt(r3, r5)
            r12 = r19
            if (r0 >= r6) goto L_0x00d7
            r0 = 5091(0x13e3, float:7.134E-42)
            X.0yV r1 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r1, r4, r0)
            r0 = r0 & 1
            if (r0 == r6) goto L_0x00a5
            r0 = 6067(0x17b3, float:8.502E-42)
            int r0 = X.C20800yB.A00(r1, r4, r0)
            if (r14 < r0) goto L_0x00d7
            r0 = 6068(0x17b4, float:8.503E-42)
            int r0 = X.C20800yB.A00(r1, r4, r0)
            if (r14 > r0) goto L_0x00d7
        L_0x00a5:
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r7)
            int r0 = r0.getInt(r3, r5)
            int r1 = r0 + 1
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r7)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)
            r0.apply()
            X.17Y r0 = r10.A05
            X.14r r1 = r0.A00
            if (r1 == 0) goto L_0x00d6
            r10.A04()
            X.3YZ r8 = new X.3YZ
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog r0 = new com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog
            r0.<init>()
            r0.A00 = r8
            r1.Btl(r0, r2)
        L_0x00d6:
            return r6
        L_0x00d7:
            if (r22 != 0) goto L_0x0131
            boolean r0 = X.C34681hT.A0P(r4, r14)
            if (r0 == 0) goto L_0x0131
            X.00I r4 = A02(r13)
            X.1PZ r3 = r10.A09
            r2 = 25
            java.lang.Object r0 = r4.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r4.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.A01(r0, r2, r1)
        L_0x00f6:
            X.17Y r0 = r10.A05
            X.14r r7 = r0.A00
            if (r7 == 0) goto L_0x00d6
            r10.A04()
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r4 = new com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog
            r4.<init>()
            r0 = 2
            X.011[] r3 = new X.AnonymousClass011[r0]
            java.lang.String r2 = r11.getRawString()
            java.lang.String r1 = "voice_chat_group_jid"
            X.011 r0 = new X.011
            r0.<init>(r1, r2)
            r3[r5] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.String r1 = "voice_chat_call_from_ui"
            X.011 r0 = new X.011
            r0.<init>(r1, r2)
            r3[r6] = r0
            android.os.Bundle r0 = X.C05430Pr.A00(r3)
            r4.A17(r0)
            r10.A04()
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r7.Btl(r4, r0)
            return r6
        L_0x0131:
            r1 = 5429(0x1535, float:7.608E-42)
            X.0yV r0 = X.C21000yV.A02
            int r7 = X.C20800yB.A00(r0, r4, r1)
            X.00I r1 = A02(r13)
            X.1PZ r4 = r10.A09
            r3 = 4
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4.A01(r1, r3, r2)
            r15 = r23
            A06(r9, r10, r11, r12, r13, r14, r15)
            if (r7 != r6) goto L_0x00d6
            r0 = 7
            r4.A01(r1, r0, r2)
            goto L_0x00f6
        L_0x015b:
            X.17X r0 = r10.A0H
            X.17r r0 = r0.A07
            int r14 = r0.A0B(r11)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NE.BPc(android.content.Context, com.whatsapp.jid.GroupJid, java.util.List, int, boolean, boolean, boolean):boolean");
    }

    public int Bub(Context context, List list, int i, boolean z) {
        return A00(context, this, (GroupJid) null, (Integer) null, C18750th.A06(C237919w.A01(this.A06, this.A0F, true)), (String) null, list, i, 0, z, false, false, false);
    }

    public int Buc(Context context, GroupJid groupJid, List list, int i, boolean z) {
        return A00(context, this, groupJid, (Integer) null, C18750th.A06(C237919w.A01(this.A06, this.A0F, true)), (String) null, list, i, 0, z, false, false, false);
    }

    public void Bug(Context context, AnonymousClass3KV r13, int i) {
        AnonymousClass16D r3 = this.A0D;
        AnonymousClass141 A0D2 = r3.A0D(r13.A04);
        Jid A062 = A0D2.A06(AnonymousClass147.class);
        C18740tg.A06(A062);
        GroupJid groupJid = (GroupJid) A062;
        List A042 = AnonymousClass3UL.A04(this.A06, r3, this.A0H, A0D2);
        boolean z = false;
        if (r13.A00 == 2) {
            z = true;
        }
        Bui(context, groupJid, r13.A07, A042, i, z);
    }

    private void A04() {
        ((C20780y9) this.A0O.get()).A01(C20540xj.class);
    }

    private void A05(int i) {
        C225014r r2 = this.A05.A00;
        if (r2 != null) {
            ((C20780y9) this.A0O.get()).A01(C20530xi.class);
            r2.Btl(VoipErrorDialogFragment.A05(new AnonymousClass3FU(), i), (String) null);
        }
    }

    public static void A06(Context context, AnonymousClass1NE r16, GroupJid groupJid, List list, int i, int i2, boolean z) {
        int i3;
        AnonymousClass1NE r4 = r16;
        String A062 = C18750th.A06(C237919w.A01(r4.A06, r4.A0F, true));
        C20810yC r2 = r4.A0K;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A00(r1, r2, 5429) != 1 || C20800yB.A00(r1, r2, 6083) <= 0 || i2 < C20800yB.A00(r1, r2, 6119)) {
            i3 = 0;
        } else {
            i3 = C20800yB.A00(r1, r2, 6083);
        }
        A00(context, r4, groupJid, (Integer) null, A062, (String) null, list, i, i3, false, false, true, z);
    }

    public static void A07(AnonymousClass1NE r3, AnonymousClass6NW r4) {
        if (r4.A08 != null) {
            r3.A0N.Boy(new C35651j2(r3, r4, 11));
        }
    }

    public boolean A09(Context context, boolean z) {
        AnonymousClass17Y r1;
        int i;
        if (this.A0T.A03(true) != 0) {
            return true;
        }
        if (C19600wD.A02(context)) {
            Log.w("CallsManager/isNetworkAvailable: airplane mode is on");
            if (!z) {
                r1 = this.A05;
                i = R.string.f12nameremoved;
            }
            A05(3);
            return false;
        }
        Log.w("CallsManager/isNetworkAvailable: no network is available");
        if (!z) {
            r1 = this.A05;
            i = R.string.f12nameremoved;
        }
        A05(3);
        return false;
        r1.A04(i, 1);
        return false;
    }

    public int Bua(Context context, AnonymousClass141 r17, int i, boolean z) {
        if (r17 == null) {
            return 1;
        }
        return A00(context, this, (GroupJid) null, (Integer) null, C18750th.A06(C237919w.A01(this.A06, this.A0F, true)), (String) null, Collections.singletonList(r17), i, 0, z, false, false, false);
    }

    public void Bui(Context context, GroupJid groupJid, String str, List list, int i, boolean z) {
        List list2 = list;
        if (list2.size() <= 1) {
            Log.e("app/startPrecall scheduled call is only supported for group with more than 2 people");
            return;
        }
        String A062 = C18750th.A06(C237919w.A01(this.A06, this.A0F, true));
        A00(context, this, groupJid, Integer.valueOf(i), A062, str, list2, 4, 0, z, true, false, false);
    }

    private ArrayList A03(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass141 r1 = (AnonymousClass141) it.next();
            C223313w r2 = (C223313w) r1.A06(C223313w.class);
            if (r2 != null) {
                PhoneUserJid A0A2 = this.A0J.A0A(r2);
                if (A0A2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No PN mapping for ");
                    sb.append(r2);
                    Log.w(sb.toString());
                } else {
                    r1 = this.A0D.A0D(A0A2);
                }
            }
            arrayList.add(r1);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BNr(android.content.Context r25, X.C107265Nh r26, int r27, boolean r28) {
        /*
            r24 = this;
            X.C18740tg.A01()
            r14 = r24
            X.1Pc r0 = r14.A0S
            boolean r0 = r0.A00()
            r8 = 0
            r13 = 0
            r15 = r25
            if (r0 == 0) goto L_0x0025
            X.1qm r1 = X.AnonymousClass3LW.A00(r15)
            r0 = 2131896023(0x7f1226d7, float:1.9426896E38)
            r1.A0c(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1.A0h(r8, r0)
            r1.A0b()
            return r13
        L_0x0025:
            r6 = r26
            int r0 = r6.A08
            r7 = 2
            r3 = 1
            r5 = r27
            r4 = r28
            if (r0 != r7) goto L_0x011f
            com.whatsapp.jid.GroupJid r0 = r6.A0D
            if (r0 == 0) goto L_0x011f
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.17X r0 = r14.A0H
            com.whatsapp.jid.GroupJid r1 = r6.A0D
            X.C18740tg.A06(r1)
            X.17r r0 = r0.A07
            int r9 = r0.A0B(r1)
            X.0yC r10 = r14.A0K
            X.0wQ r0 = r14.A06
            boolean r11 = X.C34681hT.A0A(r0, r10)
            r1 = 4907(0x132b, float:6.876E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r10, r1)
            r12 = 1
            r1 = 0
            if (r0 < r7) goto L_0x005b
            r1 = 1
        L_0x005b:
            if (r11 == 0) goto L_0x00e8
            r0 = 64
            if (r9 <= r0) goto L_0x0063
            if (r1 == 0) goto L_0x00e8
        L_0x0063:
            r11 = 4
            r9 = 1
            if (r5 == r3) goto L_0x00d4
            r1 = 3
            r0 = 15
            if (r5 == r1) goto L_0x00cf
            r0 = 22
            if (r5 == r0) goto L_0x00c8
            switch(r27) {
                case 8: goto L_0x00c8;
                case 9: goto L_0x00da;
                case 10: goto L_0x00ce;
                case 11: goto L_0x00ce;
                default: goto L_0x0073;
            }
        L_0x0073:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0077:
            X.00I r9 = new X.00I
            r9.<init>(r0, r8)
        L_0x007c:
            if (r2 == 0) goto L_0x0084
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x00bd
        L_0x0084:
            if (r28 != 0) goto L_0x00bd
            boolean r0 = X.C34681hT.A0N(r10)
            if (r0 == 0) goto L_0x00bd
            r11 = 25
        L_0x008e:
            X.1PZ r10 = r14.A09
            java.lang.Object r0 = r9.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r9.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A01(r0, r11, r1)
            if (r12 != 0) goto L_0x00eb
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipAppUpdateActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "feature_type"
            r2.putExtra(r0, r7)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r15.startActivity(r2)
            return r13
        L_0x00bd:
            com.whatsapp.jid.GroupJid r0 = r6.A0D
            boolean r0 = X.C34681hT.A0S(r0, r2)
            r11 = 6
            if (r0 == 0) goto L_0x008e
            r11 = 7
            goto L_0x008e
        L_0x00c8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r9 = 7
            goto L_0x00de
        L_0x00ce:
            r0 = 5
        L_0x00cf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0077
        L_0x00d4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r9 = 2
            goto L_0x00de
        L_0x00da:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
        L_0x00de:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.00I r9 = new X.00I
            r9.<init>(r1, r0)
            goto L_0x007c
        L_0x00e8:
            r12 = 0
            goto L_0x0063
        L_0x00eb:
            X.5Ng r0 = r6.A0F
            if (r0 == 0) goto L_0x00fe
            X.5Ng r0 = r6.A0F
            java.lang.String r0 = r0.A00
            java.lang.String r8 = X.C34681hT.A08(r0)
            if (r8 == 0) goto L_0x00fe
            X.1Pj r0 = r14.A0R
            X.C27701Pj.A00(r0, r8, r3)
        L_0x00fe:
            if (r2 == 0) goto L_0x011f
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x011f
            com.whatsapp.jid.GroupJid r1 = r2.groupJid
            com.whatsapp.jid.GroupJid r0 = r6.A0D
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = r2.callId
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x011f
            if (r28 == 0) goto L_0x011f
            boolean r0 = r14.B07(r15, r3)
            return r0
        L_0x011f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/startFromCallLog/from "
            r1.append(r0)
            X.6by r0 = r6.A09()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6NW r0 = r14.A0Z
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "app/startFromCallLog user tapped the call button twice before the telecom framework responds"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r13
        L_0x0141:
            r0 = 0
            r14.A00 = r0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r0 = r6.A0C()
            java.util.Iterator r2 = r0.iterator()
        L_0x015c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r1 = r2.next()
            X.5Nf r1 = (X.C107255Nf) r1
            X.0wQ r0 = r14.A06
            com.whatsapp.jid.UserJid r1 = r1.A00
            boolean r0 = r0.A0M(r1)
            if (r0 != 0) goto L_0x015c
            r13.add(r1)
            X.16D r0 = r14.A0D
            X.141 r0 = r0.A0D(r1)
            r10.add(r0)
            goto L_0x015c
        L_0x017f:
            X.6by r9 = r6.A04
            java.lang.String r8 = r9.A02
            java.lang.String r2 = X.C34681hT.A08(r8)
            X.1NF r1 = r14.A0Q
            boolean r12 = r6.A0K
            int r11 = r10.size()
            r0 = 726210773(0x2b4918d5, float:7.1444006E-13)
            boolean r0 = X.AnonymousClass1NF.A00(r1, r2, r0)
            if (r0 == 0) goto L_0x019b
            r1.A02(r2, r11, r12, r3)
        L_0x019b:
            boolean r12 = r6.A0K
            java.lang.String r18 = X.C34681hT.A08(r8)
            r17 = 0
            X.3Ir r11 = r6.A0C
            int r0 = r6.A08
            r23 = 0
            if (r0 != r7) goto L_0x01ad
            r23 = 1
        L_0x01ad:
            r0 = 7
            r19 = r13
            r21 = r10
            r22 = r12
            r16 = r11
            int r10 = r14.A08(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r10 == 0) goto L_0x0213
            if (r10 == r0) goto L_0x01c2
            r3 = 11
            if (r10 != r3) goto L_0x020c
        L_0x01c2:
            int r12 = r9.A00
            boolean r11 = r9.A03
            com.whatsapp.jid.UserJid r3 = r9.A01
            boolean r7 = r6.A0K
            r6 = 1
            if (r10 != r0) goto L_0x01ce
            r6 = 0
        L_0x01ce:
            r10 = 1
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r9 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipPermissionsActivity"
            r4.setClassName(r9, r0)
            java.lang.String r0 = "join_call_log"
            r4.putExtra(r0, r10)
            java.lang.String r0 = "call_log_call_id"
            r4.putExtra(r0, r8)
            java.lang.String r0 = "call_log_transaction_id"
            r4.putExtra(r0, r12)
            java.lang.String r0 = "call_log_from_me"
            r4.putExtra(r0, r11)
            java.lang.String r3 = r3.getRawString()
            java.lang.String r0 = "call_log_user_jid"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "video_call"
            r4.putExtra(r0, r7)
            java.lang.String r0 = "lobby_entry_point"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "permission_type"
            r4.putExtra(r0, r6)
            r15.startActivity(r4)
        L_0x020c:
            r0 = 7952(0x1f10, float:1.1143E-41)
            r1.A04(r2, r0)
            r0 = 0
            return r0
        L_0x0213:
            int r0 = r6.A08
            if (r0 != r7) goto L_0x0245
            if (r28 != 0) goto L_0x0245
            X.0yC r8 = r14.A0K
            boolean r0 = X.C34681hT.A0N(r8)
            if (r0 == 0) goto L_0x0245
            r1 = 6688(0x1a20, float:9.372E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r1)
            if (r0 == 0) goto L_0x0245
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.00I r0 = new X.00I
            r0.<init>(r2, r1)
            r14.A01 = r0
        L_0x0236:
            int r0 = r6.A08
            r1 = 0
            if (r0 != r7) goto L_0x023c
            r1 = 1
        L_0x023c:
            X.6NW r0 = new X.6NW
            r0.<init>(r6, r5, r4, r1)
            A07(r14, r0)
            return r3
        L_0x0245:
            boolean r8 = r6.A0K
            int r0 = r6.A08
            r1 = 0
            if (r0 != r7) goto L_0x024d
            r1 = 1
        L_0x024d:
            X.6NW r0 = new X.6NW
            r0.<init>(r6, r5, r4, r1)
            r19 = 1
            r15 = r0
            r16 = r2
            r17 = r13
            r18 = r8
            int r0 = A01(r14, r15, r16, r17, r18, r19)
            if (r0 != 0) goto L_0x0236
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NE.BNr(android.content.Context, X.5Nh, int, boolean):boolean");
    }

    public void BmF(Context context, String str, int i, boolean z) {
        int i2;
        C18740tg.A01();
        AnonymousClass13J r1 = this.A0M;
        C20830yE r2 = this.A0G;
        if (!r2.A0C() || AnonymousClass3UD.A08(r2, r1, z)) {
            i2 = 0;
        } else if (r2.A0G()) {
            i2 = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("app/previewCallLink token:");
            sb.append(str);
            sb.append(" isVideoEnabled: ");
            sb.append(z);
            Log.i(sb.toString());
            if (str.length() != 22) {
                Log.e("app/previewCallLink token with wrong length!");
                return;
            }
            boolean z2 = false;
            if (this.A0I.A04(Voip.getCurrentCallId()) != null) {
                z2 = true;
            }
            if (AnonymousClass3UL.A00(this.A0E.A0K(), r2) != 0) {
                int i3 = R.string.f12nameremoved;
                if (z2) {
                    i3 = R.string.f12nameremoved;
                }
                this.A05.A04(i3, 1);
                return;
            }
            this.A0N.Boy(new AnonymousClass73B(this, str, i, z));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.calling.VoipPermissionsActivity");
        intent.putExtra("video_call", z);
        intent.putExtra("permission_type", i2);
        intent.putExtra("call_link_lobby_token", str);
        intent.putExtra("lobby_entry_point", i);
        context.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01eb, code lost:
        if (r8.A0B.A0D() == false) goto L_0x01ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r29, X.AnonymousClass1NE r30, com.whatsapp.jid.GroupJid r31, java.lang.Integer r32, java.lang.String r33, java.lang.String r34, java.util.List r35, int r36, int r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            X.C18740tg.A01()
            r8 = r30
            X.0yC r11 = r8.A0K
            r1 = 3358(0xd1e, float:4.706E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r11, r1)
            r2 = 1
            r13 = 0
            r26 = 0
            r4 = r35
            if (r0 <= 0) goto L_0x0089
            r26 = 1
            int r0 = r4.size()     // Catch:{ all -> 0x0087 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0087 }
            r12.<init>(r0)     // Catch:{ all -> 0x0087 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0026:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0087 }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ all -> 0x0087 }
            X.11F r0 = r1.A0H     // Catch:{ all -> 0x0087 }
            boolean r0 = X.AnonymousClass143.A0I(r0)     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0072
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r0 = com.whatsapp.jid.PhoneUserJid.class
            com.whatsapp.jid.Jid r3 = r1.A06(r0)     // Catch:{ all -> 0x0087 }
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0026
            X.12O r0 = r8.A0J     // Catch:{ all -> 0x0087 }
            X.13w r1 = r0.A09(r3)     // Catch:{ all -> 0x0087 }
            if (r1 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "No LID mapping for "
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            r1.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0087 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0087 }
        L_0x0060:
            int r3 = r12.size()     // Catch:{ all -> 0x0087 }
            int r0 = r4.size()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r3 != r0) goto L_0x0077
            goto L_0x0076
        L_0x006c:
            X.16D r0 = r8.A0D     // Catch:{ all -> 0x0087 }
            X.141 r1 = r0.A0D(r1)     // Catch:{ all -> 0x0087 }
        L_0x0072:
            r12.add(r1)     // Catch:{ all -> 0x0087 }
            goto L_0x0026
        L_0x0076:
            r1 = 1
        L_0x0077:
            java.lang.String r0 = "Lid contacts size not equal to contacts, 1 or more lid contact was found null"
            X.C18740tg.A0D(r1, r0)     // Catch:{ all -> 0x0087 }
            int r1 = r12.size()     // Catch:{ all -> 0x0087 }
            int r0 = r4.size()     // Catch:{ all -> 0x0087 }
            if (r1 == r0) goto L_0x008f
            goto L_0x008e
        L_0x0087:
            r0 = move-exception
            throw r0
        L_0x0089:
            java.util.ArrayList r12 = r8.A03(r4)
            goto L_0x008f
        L_0x008e:
            r12 = 0
        L_0x008f:
            r3 = 0
            if (r12 == 0) goto L_0x0098
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x00aa
        L_0x0098:
            if (r26 == 0) goto L_0x027a
            X.0wN r1 = r8.A04
            java.lang.String r0 = "startOutgoingCallInternal/phoneNumber_lid_mapping_missing"
            r1.A0E(r0, r3, r2)
            java.util.ArrayList r12 = r8.A03(r4)
            X.C18740tg.A06(r12)
            r26 = 0
        L_0x00aa:
            X.1Pc r0 = r8.A0S
            boolean r0 = r0.A00()
            r10 = r29
            if (r0 == 0) goto L_0x00ca
            X.1qm r1 = X.AnonymousClass3LW.A00(r10)
            r0 = 2131896023(0x7f1226d7, float:1.9426896E38)
            r1.A0c(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1.A0h(r3, r0)
            r1.A0b()
            r0 = 12
            return r0
        L_0x00ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/startOutgoingCall/from "
            r1.append(r0)
            r6 = r36
            r1.append(r6)
            java.lang.String r0 = ", video call:"
            r1.append(r0)
            r5 = r38
            r1.append(r5)
            java.lang.String r0 = ", groupJid:"
            r1.append(r0)
            r15 = r31
            r1.append(r15)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NF r9 = r8.A0Q
            int r1 = r12.size()
            r0 = 726210773(0x2b4918d5, float:7.1444006E-13)
            r7 = r33
            boolean r0 = X.AnonymousClass1NF.A00(r9, r7, r0)
            if (r0 == 0) goto L_0x0108
            r9.A02(r7, r1, r5, r13)
        L_0x0108:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r12.iterator()
            if (r31 == 0) goto L_0x012e
        L_0x0118:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r4 = r14.next()
            X.141 r4 = (X.AnonymousClass141) r4
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A06(r0)
            r2.add(r0)
            goto L_0x0118
        L_0x012e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r4 = r14.next()
            X.141 r4 = (X.AnonymousClass141) r4
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r4.A06(r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.1NG r0 = r8.A08
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x0153
            r1.add(r4)
            java.lang.String r0 = "app/startOutgoingCall/failed_contact_blocked"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x012e
        L_0x0153:
            r2.add(r4)
            goto L_0x012e
        L_0x0157:
            r20 = r3
            r4 = r40
            r16 = r8
            r17 = r10
            r18 = r3
            r19 = r15
            r21 = r2
            r22 = r1
            r23 = r12
            r24 = r5
            r25 = r4
            int r1 = r16.A08(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = r34
            if (r1 == 0) goto L_0x01c7
            r0 = 7
            if (r1 == r0) goto L_0x017d
            r0 = 11
            if (r1 != r0) goto L_0x01c1
            r13 = 1
        L_0x017d:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r8 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipPermissionsActivity"
            r3.setClassName(r8, r0)
            java.util.ArrayList r2 = X.AnonymousClass143.A07(r2)
            java.lang.String r0 = "jids"
            r3.putStringArrayListExtra(r0, r2)
            java.lang.String r0 = "call_from"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "video_call"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "permission_type"
            r3.putExtra(r0, r13)
            java.lang.String r0 = "voice_chat"
            r3.putExtra(r0, r4)
            if (r31 == 0) goto L_0x01b3
            java.lang.String r2 = r15.getRawString()
            java.lang.String r0 = "group_jid"
            r3.putExtra(r0, r2)
        L_0x01b3:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = "scheduled_id"
            r3.putExtra(r0, r12)
        L_0x01be:
            r10.startActivity(r3)
        L_0x01c1:
            r0 = 7952(0x1f10, float:1.1143E-41)
            r9.A04(r7, r0)
            return r1
        L_0x01c7:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x01d0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r9.next()
            r1.put(r0, r3)
            goto L_0x01d0
        L_0x01de:
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r9 < r0) goto L_0x01ed
            X.1Pf r0 = r8.A0B
            boolean r9 = r0.A0D()
            r0 = 1
            if (r9 != 0) goto L_0x01ee
        L_0x01ed:
            r0 = 0
        L_0x01ee:
            r16 = r32
            r22 = r37
            r38 = r39
            r27 = r41
            if (r39 != 0) goto L_0x024f
            if (r0 == 0) goto L_0x024f
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x0203:
            boolean r0 = r10.hasNext()
            r19 = 0
            if (r0 == 0) goto L_0x0213
            java.lang.Object r0 = r10.next()
            r9.put(r0, r3)
            goto L_0x0203
        L_0x0213:
            if (r31 == 0) goto L_0x022b
            X.17X r0 = r8.A0H
            X.17r r10 = r0.A07
            int r0 = r10.A0B(r15)
            boolean r0 = X.C34681hT.A0O(r11, r0)
            if (r0 == 0) goto L_0x022b
            X.6X6 r0 = r10.A0C(r15)
            java.lang.String r19 = r0.A0E()
        L_0x022b:
            X.6NW r14 = new X.6NW
            r24 = 0
            r20 = r9
            r21 = r6
            r23 = r5
            r17 = r7
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r33 = 0
            r28 = r8
            r29 = r14
            r30 = r7
            r31 = r2
            r32 = r5
            int r0 = A01(r28, r29, r30, r31, r32, r33)
            if (r0 != 0) goto L_0x024f
            return r0
        L_0x024f:
            X.6NW r9 = new X.6NW
            r28 = r9
            r29 = r15
            r30 = r16
            r31 = r7
            r32 = r12
            r33 = r3
            r34 = r1
            r35 = r6
            r36 = r22
            r37 = r5
            r39 = r4
            r40 = r26
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.0wU r2 = r8.A0N
            r1 = 10
            X.1j2 r0 = new X.1j2
            r0.<init>(r8, r9, r1)
            r2.Boy(r0)
            r0 = 0
            return r0
        L_0x027a:
            java.lang.String r0 = "callManagerImpl/startOutgoingCallInternal: contacts is null or empty in !isLidCall case"
            X.C18740tg.A0D(r13, r0)
            java.lang.String r0 = "callManagerImpl/startOutgoingCallInternal: convertContactJidParity failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NE.A00(android.content.Context, X.1NE, com.whatsapp.jid.GroupJid, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean, boolean):int");
    }
}
