package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.4lc  reason: invalid class name and case insensitive filesystem */
public abstract class C95504lc extends AnonymousClass04R implements C161057m5 {
    public static void A04(CallGridViewModel callGridViewModel) {
        CallGridViewModel.A0H(callGridViewModel.A0Q.A05(), callGridViewModel, false);
    }

    public void BcG(UserJid userJid) {
    }

    public static void A01(CallAvatarViewModel callAvatarViewModel, String str) {
        callAvatarViewModel.A06.A06(2, CallAvatarViewModel.A06(callAvatarViewModel), str, callAvatarViewModel.A05.A00);
        CallAvatarViewModel.A07(callAvatarViewModel, str, true);
    }

    public static void A03(CallGridViewModel callGridViewModel) {
        CallGridViewModel.A0H(callGridViewModel.A0Q.A05(), callGridViewModel, false);
    }

    public static void A05(InCallBannerViewModel inCallBannerViewModel, AnonymousClass655 r3, int i, int i2) {
        C74203lE r1 = new C74203lE(i, i2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        r3.A01 = r1;
        r3.A00 = scaleType;
        InCallBannerViewModel.A09(inCallBannerViewModel, r3.A00());
    }

    public void BRV(int i, boolean z, boolean z2) {
        if (this instanceof VoiceChatBottomSheetViewModel) {
            C001700s r1 = ((VoiceChatBottomSheetViewModel) this).A0A;
            AnonymousClass6DD r2 = (AnonymousClass6DD) r1.A04();
            if (r2 != null) {
                List<Object> list = r2.A03;
                ArrayList A0J = C36321k7.A0J(list);
                for (Object obj : list) {
                    boolean z3 = true;
                    if (obj instanceof AnonymousClass53D) {
                        AnonymousClass53D r3 = (AnonymousClass53D) obj;
                        if (i != 3) {
                            z3 = false;
                        }
                        obj = new AnonymousClass53D(r3.A01, z, z3);
                    } else if (obj instanceof AnonymousClass53A) {
                        AnonymousClass53A r32 = (AnonymousClass53A) obj;
                        if (i != 1) {
                            z3 = false;
                        }
                        obj = new AnonymousClass53A(z3, r32.A01);
                    } else if (obj instanceof AnonymousClass53E) {
                        obj = new AnonymousClass53E(z2, ((AnonymousClass53E) obj).A02);
                    } else if (obj instanceof AnonymousClass53F) {
                        obj = new AnonymousClass53F(z2, ((AnonymousClass53F) obj).A03);
                    }
                    A0J.add(obj);
                }
                r1.A0C(new AnonymousClass6DD(r2.A01, r2.A02, A0J, r2.A05, r2.A04));
            }
        } else if (this instanceof AudioChatCallingViewModel) {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this;
            if (audioChatCallingViewModel.A09) {
                C1260962n r12 = audioChatCallingViewModel.A02;
                if (r12 == null) {
                    r12 = new C1260962n(audioChatCallingViewModel.A0N);
                    audioChatCallingViewModel.A02 = r12;
                }
                if (i == 2) {
                    r12.A00(audioChatCallingViewModel.A0K);
                    return;
                }
                r12.A00((AnonymousClass7gH) null);
                AudioChatCallingViewModel.A09(audioChatCallingViewModel, false);
            }
        }
    }

    public void BS1(AnonymousClass3XF r2) {
        if (this instanceof CallGridViewModel) {
            ((CallGridViewModel) this).A0u.A0D(r2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSY(int r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel
            if (r0 == 0) goto L_0x000a
            r0 = r4
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel) r0
            r0.A00 = r5
        L_0x0009:
            return
        L_0x000a:
            boolean r0 = r4 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x0009
            r3 = r4
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r3
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1O(r5)
            r3.A07 = r0
            r0 = 3
            if (r5 != r0) goto L_0x0029
            X.5wA r1 = r3.A0R
            monitor-enter(r1)
            boolean r0 = r1.A04     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0033
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0042 }
            r0 = 1
            r1.A04 = r0     // Catch:{ all -> 0x0042 }
            goto L_0x0033
        L_0x0029:
            if (r5 != 0) goto L_0x0034
            X.5wA r1 = r3.A0R
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0042 }
            r1.A04 = r2     // Catch:{ all -> 0x0042 }
        L_0x0033:
            monitor-exit(r1)
        L_0x0034:
            X.5Fb r0 = r3.A0Q
            X.6OZ r1 = r0.A05()
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x0009
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0H(r1, r3, r2)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95504lc.BSY(int):void");
    }

    public void BSZ(long j) {
        if (this instanceof CallGridViewModel) {
            CallGridViewModel callGridViewModel = (CallGridViewModel) this;
            if (!callGridViewModel.A08) {
                callGridViewModel.A0G.A0D(Long.valueOf(j));
            }
        }
    }

    public void BSb() {
        if (this instanceof CallGridViewModel) {
            CallGridViewModel callGridViewModel = (CallGridViewModel) this;
            callGridViewModel.A05 = null;
            C001700s r1 = callGridViewModel.A0I;
            if (r1.A04() != null) {
                r1.A0D((Object) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0145, code lost:
        if (r3 == 3) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSn(X.AnonymousClass6OZ r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel
            if (r0 == 0) goto L_0x0057
            r4 = r11
            com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel r4 = (com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.147 r0 = r12.A06
            if (r0 != 0) goto L_0x0056
            X.0yC r3 = r4.A06
            com.whatsapp.voipcalling.CallState r2 = r12.A09
            boolean r1 = r12.A0J
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A03(r0)
            boolean r0 = X.C34681hT.A0Q(r3, r2, r0, r1)
            if (r0 == 0) goto L_0x0056
            X.0wy r2 = r12.A04
            java.util.Set r1 = r2.keySet()
            java.util.Set r0 = r4.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0056
            java.util.Set r0 = r2.keySet()
            X.AnonymousClass00C.A08(r0)
            r4.A01 = r0
            X.040 r3 = X.C109325Xd.A00(r4)
            X.02l r2 = r4.A08
            r0 = 0
            com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1 r1 = new com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1
            r1.<init>(r4, r0)
            java.lang.Integer r0 = X.C023109s.A00
            X.0ml r2 = X.AnonymousClass0A2.A01(r0, r2, r1, r3)
            X.0sP r1 = r4.A02
            if (r1 == 0) goto L_0x0054
            r0 = 0
            r1.B2S(r0)
        L_0x0054:
            r4.A02 = r2
        L_0x0056:
            return
        L_0x0057:
            boolean r0 = r11 instanceof X.AnonymousClass53T
            if (r0 == 0) goto L_0x0067
            r1 = r11
            X.53T r1 = (X.AnonymousClass53T) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.6EE r0 = r12.A05
            r1.A00 = r0
            return
        L_0x0067:
            boolean r0 = r11 instanceof com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel
            if (r0 == 0) goto L_0x007e
            r2 = r11
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.0wU r4 = r2.A0L
            r0 = 1
            X.74i r1 = new X.74i
            r1.<init>(r2, r12, r0)
        L_0x007a:
            r4.Bp1(r1)
            return
        L_0x007e:
            boolean r0 = r11 instanceof com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel
            if (r0 == 0) goto L_0x0097
            r3 = r11
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r3 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r3
            r1 = 0
            X.AnonymousClass00C.A0D(r12, r1)
            boolean r0 = r12.A0E
            r4 = 0
            if (r0 != 0) goto L_0x02f4
            X.00s r0 = r3.A0E
            X.C36341k9.A18(r0, r1)
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A07(r3)
            return
        L_0x0097:
            boolean r0 = r11 instanceof com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel
            if (r0 == 0) goto L_0x00b9
            r3 = r11
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r3 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r3
            com.whatsapp.voipcalling.CallState r0 = r12.A09
            boolean r2 = X.C131856Qx.A00(r0)
            X.1hi r1 = r3.A0A
            boolean r0 = r12.A0E
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0E(r0)
            X.0wU r4 = r3.A0B
            r0 = 12
            X.752 r1 = new X.752
            r1.<init>(r3, r12, r0, r2)
            goto L_0x007a
        L_0x00b9:
            boolean r0 = r11 instanceof com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel
            if (r0 == 0) goto L_0x012c
            r4 = r11
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r4 = (com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel) r4
            com.whatsapp.voipcalling.CallState r1 = r12.A09
            boolean r2 = com.whatsapp.voipcalling.Voip.A09(r1)
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x00ec
            if (r2 == 0) goto L_0x00ec
            int r6 = r4.A00
            boolean r0 = r12.A0G
            X.65r r3 = new X.65r
            r3.<init>(r0)
            r2 = 1
        L_0x00d6:
            r0 = 0
            X.67K r5 = new X.67K
            r5.<init>(r0, r3, r2, r6)
        L_0x00dc:
            X.00s r1 = r4.A01
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.C1901797e.A00(r0, r5)
            if (r0 != 0) goto L_0x0056
            r1.A0D(r5)
            return
        L_0x00ec:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 != r0) goto L_0x00fe
            r1 = 4
        L_0x00f1:
            r2 = 3
            r0 = 0
            int r6 = r4.A00
            X.65r r3 = new X.65r
            if (r1 == r2) goto L_0x0115
            r3.<init>(r0)
            r2 = 4
            goto L_0x00d6
        L_0x00fe:
            int r1 = r12.A00
            r0 = 1
            if (r1 == r0) goto L_0x0113
            r0 = 2
            if (r1 == r0) goto L_0x0113
            if (r2 == 0) goto L_0x0119
            r0 = 3
            if (r1 == r0) goto L_0x0119
            r1 = 0
            r0 = 0
            X.67K r5 = new X.67K
            r5.<init>(r0, r0, r1, r1)
            goto L_0x00dc
        L_0x0113:
            r1 = 3
            goto L_0x00f1
        L_0x0115:
            r3.<init>(r0)
            goto L_0x00d6
        L_0x0119:
            int r3 = r4.A00
            boolean r1 = r12.A0N
            com.whatsapp.jid.UserJid r0 = r12.A08
            X.66H r2 = new X.66H
            r2.<init>(r0, r1)
            r1 = 2
            r0 = 0
            X.67K r5 = new X.67K
            r5.<init>(r2, r0, r1, r3)
            goto L_0x00dc
        L_0x012c:
            boolean r0 = r11 instanceof com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel
            if (r0 == 0) goto L_0x01c5
            r4 = r11
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r4 = (com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel) r4
            boolean r5 = r12.A0N
            r4.A02 = r5
            int r3 = r12.A00
            r1 = 1
            if (r3 == r1) goto L_0x0140
            r0 = 2
            if (r3 == r0) goto L_0x0140
            r1 = 0
        L_0x0140:
            r2 = 0
            if (r1 != 0) goto L_0x0147
            r0 = 3
            r1 = 0
            if (r3 != r0) goto L_0x0148
        L_0x0147:
            r1 = 1
        L_0x0148:
            r4.A01 = r1
            boolean r0 = r12.A0I
            if (r0 != 0) goto L_0x0151
            if (r1 != 0) goto L_0x0151
            r2 = 1
        L_0x0151:
            X.00s r0 = r4.A05
            X.C90484aE.A1B(r0, r2)
            com.whatsapp.voipcalling.CallState r6 = r12.A09
            boolean r1 = X.C131856Qx.A00(r6)
            X.1hi r2 = r4.A0A
            java.lang.Object r0 = r2.A04()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016f
            r2.A0D(r1)
        L_0x016f:
            X.1hi r3 = r4.A0B
            java.lang.Object r0 = r3.A04()
            boolean r2 = r12.A0M
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0184
            r3.A0D(r1)
        L_0x0184:
            r1 = 1
            boolean r0 = X.C131856Qx.A00(r6)
            if (r0 != 0) goto L_0x01c3
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x01c3
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x01c3
            if (r5 == 0) goto L_0x01c3
            if (r2 != 0) goto L_0x01c3
            X.0yb r0 = r4.A08
            boolean r0 = X.C90504aG.A1V(r0)
            if (r0 != 0) goto L_0x01c3
        L_0x019f:
            X.00s r0 = r4.A06
            X.C90484aE.A1B(r0, r1)
            X.00s r3 = r4.A04
            java.lang.Object r2 = r3.A04()
            boolean r0 = r12.A0J
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C1901797e.A00(r2, r1)
            if (r0 != 0) goto L_0x01b9
            r3.A0D(r1)
        L_0x01b9:
            boolean r1 = com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel.A06(r12, r4)
            X.00s r0 = r4.A03
            X.C90484aE.A1B(r0, r1)
            return
        L_0x01c3:
            r1 = 0
            goto L_0x019f
        L_0x01c5:
            boolean r0 = r11 instanceof com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel
            if (r0 == 0) goto L_0x02b5
            r8 = r11
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r8 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r8
            X.5ul r1 = r8.A06
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            com.whatsapp.jid.UserJid r4 = r12.A08
            if (r4 == 0) goto L_0x01fd
            com.whatsapp.voipcalling.CallState r0 = r12.A09
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 == 0) goto L_0x01fd
            X.0yC r1 = r1.A02
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x01fd
            r0 = 5923(0x1723, float:8.3E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01fd
            X.0wU r3 = r8.A0B
            java.lang.String r2 = r4.getObfuscatedString()
            r1 = 44
            X.74h r0 = new X.74h
            r0.<init>(r8, r4, r1)
            r3.Bp2(r0, r2)
            return
        L_0x01fd:
            com.whatsapp.voipcalling.CallState r1 = r12.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            r5 = 1
            r7 = 0
            if (r1 != r0) goto L_0x0248
            com.whatsapp.jid.UserJid r2 = r12.A07
            if (r2 == 0) goto L_0x0242
            X.0wQ r1 = r8.A04
            boolean r0 = r1.A0M(r2)
            if (r0 == 0) goto L_0x0239
            X.0wh r0 = r1.A0A
            java.lang.String r0 = r0.A02()
        L_0x0217:
            if (r0 == 0) goto L_0x0242
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r7] = r0
            r0 = 2131887339(0x7f1204eb, float:1.9409282E38)
        L_0x0220:
            X.2ft r4 = X.C90524aI.A0O(r1, r0)
            X.00s r3 = r8.A02
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131887340(0x7f1204ec, float:1.9409284E38)
            X.2ft r2 = X.C90524aI.A0O(r1, r0)
            r1 = 0
            X.6CE r0 = new X.6CE
            r0.<init>(r2, r4, r1, r5)
            r3.A0D(r0)
            return
        L_0x0239:
            X.171 r1 = r8.A08
            X.16D r0 = r8.A07
            java.lang.String r0 = X.C36381kD.A0u(r0, r1, r2)
            goto L_0x0217
        L_0x0242:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131887338(0x7f1204ea, float:1.940928E38)
            goto L_0x0220
        L_0x0248:
            X.0yC r0 = r8.A01
            boolean r0 = X.C34681hT.A0R(r0, r7)
            if (r0 != 0) goto L_0x0056
            java.lang.String r2 = r12.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0056
            X.147 r10 = r12.A06
            if (r10 == 0) goto L_0x0056
            X.3KV r1 = r8.A00
            if (r1 == 0) goto L_0x02aa
            java.lang.String r0 = r1.A07
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02aa
            long r0 = r1.A03
            X.0ts r3 = r8.A09
            java.lang.String r6 = X.C20040wv.A06(r3, r0)
            java.lang.String r2 = X.C20040wv.A04(r3, r0)
            java.lang.String r9 = X.AnonymousClass3UM.A00(r3, r0)
            X.00s r4 = r8.A02
            X.171 r1 = r8.A08
            X.16D r0 = r8.A07
            X.141 r0 = r0.A0D(r10)
            java.lang.String r0 = X.C36381kD.A0v(r1, r0)
            X.2fr r3 = new X.2fr
            r3.<init>(r0)
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.3KV r0 = r8.A00
            java.lang.String r0 = r0.A00()
            r1[r7] = r0
            X.C90464aC.A1D(r6, r2, r9, r1)
            r0 = 2131887366(0x7f120506, float:1.9409337E38)
            X.2ft r2 = X.C90524aI.A0O(r1, r0)
            r1 = 0
            X.6CE r0 = new X.6CE
            r0.<init>(r3, r2, r1, r5)
            r4.A0D(r0)
            return
        L_0x02aa:
            X.0wU r4 = r8.A0B
            r0 = 43
            X.74h r1 = new X.74h
            r1.<init>(r8, r12, r0)
            goto L_0x007a
        L_0x02b5:
            boolean r0 = r11 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x02c1
            r1 = r11
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            r0 = 0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0H(r12, r1, r0)
            return
        L_0x02c1:
            boolean r0 = r11 instanceof com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel
            if (r0 == 0) goto L_0x0056
            r4 = r11
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r4 = (com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            boolean r3 = r4.A03
            com.whatsapp.voipcalling.CallState r2 = r12.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            r1 = 1
            if (r2 != r0) goto L_0x02e1
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x02e1
            X.6EE r0 = r12.A05
            if (r0 == 0) goto L_0x02e2
            boolean r0 = r0.A0C
            if (r0 != r1) goto L_0x02e2
        L_0x02e1:
            r1 = 0
        L_0x02e2:
            r4.A03 = r1
            if (r1 == 0) goto L_0x0056
            if (r3 != 0) goto L_0x0056
            boolean r0 = com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel.A08(r4)
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = "voip/CallAvatarViewModel/maybeShowUpsellBanner Criteria for showing banner is not met"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x02f4:
            boolean r2 = r3.A09
            com.whatsapp.voipcalling.CallState r1 = r12.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0310
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0310
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0310
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0310
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0310
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0311
        L_0x0310:
            r4 = 1
        L_0x0311:
            r3.A09 = r4
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x031d
            r0 = 0
            r3.A08 = r0
            r0 = 0
            r3.A05 = r0
        L_0x031d:
            java.lang.String r0 = r12.A0A
            if (r4 != 0) goto L_0x0322
            r0 = 0
        L_0x0322:
            r3.A04 = r0
            if (r2 == r4) goto L_0x032d
            if (r4 == 0) goto L_0x0331
            X.1PW r0 = r3.A0J
            r0.A01(r3)
        L_0x032d:
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A06(r12, r3)
            return
        L_0x0331:
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A07(r3)
            goto L_0x032d
        L_0x0335:
            X.03e r0 = r4.A02
            r2 = 0
            if (r0 == 0) goto L_0x033d
            r0.B2S(r2)
        L_0x033d:
            X.040 r1 = X.C109325Xd.A00(r4)
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$maybeShowUpsellBanner$1 r0 = new com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$maybeShowUpsellBanner$1
            r0.<init>(r4, r2)
            X.0A6 r0 = X.C36391kE.A12(r0, r1)
            r4.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95504lc.BSn(X.6OZ):void");
    }

    public void BSo(AnonymousClass6OZ r4) {
        if (this instanceof AudioChatCallingViewModel) {
            BSn(r4);
        } else if (this instanceof CallGridViewModel) {
            CallGridViewModel callGridViewModel = (CallGridViewModel) this;
            if (CallGridViewModel.A0B(r4).size() > 8) {
                CallGridViewModel.A0H(r4, callGridViewModel, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5.A0R.A04 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSq(android.graphics.Bitmap r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x001e
            r5 = r6
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r5 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r5
            r4 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0012
            X.5wA r0 = r5.A0R
            boolean r1 = r0.A04
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            X.5Mj r2 = new X.5Mj
            r2.<init>(r5, r0)
            if (r7 != 0) goto L_0x001f
            r0 = 0
            r2.A0C(r0)
        L_0x001e:
            return
        L_0x001f:
            X.0wU r1 = r5.A0x
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r3]
            r0[r4] = r7
            r1.Bp0(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95504lc.BSq(android.graphics.Bitmap, boolean):void");
    }

    public void BYw(boolean z) {
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            C27631Pa r4 = inCallBannerViewModel.A02;
            int i = C27631Pa.A00(r4).getInt("high_data_usage_banner_shown_count", 0);
            int A07 = inCallBannerViewModel.A06.A07(4043);
            if (i < A07) {
                C36341k9.A0v(C90474aD.A0F(r4), "high_data_usage_banner_shown_count", C27631Pa.A00(r4).getInt("high_data_usage_banner_shown_count", 0) + 1);
                C47862ft A0O = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
                C47852fs r2 = new C47852fs(new Object[0]);
                int i2 = R.color.f6nameremoved;
                if (z) {
                    i2 = R.color.f6nameremoved;
                }
                AnonymousClass655 r1 = new AnonymousClass655(A0O, r2, 12, i2);
                r1.A04 = true;
                InCallBannerViewModel.A09(inCallBannerViewModel, r1.A00());
            } else if (A07 == 0) {
                C36341k9.A0u(C90474aD.A0F(r4), "high_data_usage_banner_shown_count");
            }
        }
    }

    public void BbG(UserJid userJid, boolean z) {
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            C47862ft A0O = C90524aI.A0O(new Object[]{C36381kD.A0u(inCallBannerViewModel.A04, inCallBannerViewModel.A05, userJid)}, R.string.f12nameremoved);
            C47862ft A0O2 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
            int i = R.color.f6nameremoved;
            if (z) {
                i = R.color.f6nameremoved;
            }
            A05(inCallBannerViewModel, new AnonymousClass655(A0O, A0O2, 1, i), R.drawable.vec_ic_voip_voice_mute, R.color.f6nameremoved);
        }
    }

    public void BbH(UserJid userJid, boolean z) {
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            AnonymousClass141 A0D = inCallBannerViewModel.A04.A0D(userJid);
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = inCallBannerViewModel.A05.A0H(A0D);
            C47862ft A0O = C90524aI.A0O(A0L, R.string.f12nameremoved);
            C47862ft A0O2 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
            int i = R.color.f6nameremoved;
            if (z) {
                i = R.color.f6nameremoved;
            }
            A05(inCallBannerViewModel, new AnonymousClass655(A0O, A0O2, 0, i), R.drawable.vec_ic_voip_voice_mute, R.color.f6nameremoved);
        }
    }

    public void BbU(AnonymousClass6DW r9, boolean z) {
        C124725yh r0;
        AnonymousClass655 r5;
        int i;
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            int i2 = r9.A00;
            C47862ft r6 = null;
            int i3 = 14;
            if (i2 != 2) {
                if (i2 == 1) {
                    if (r9.A05) {
                        C47862ft A0O = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
                        if (r9.A04) {
                            r6 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
                        }
                        int i4 = R.color.f6nameremoved;
                        if (z) {
                            i4 = R.color.f6nameremoved;
                        }
                        r5 = new AnonymousClass655(A0O, r6, 15, i4);
                        i = R.drawable.vec_ic_network_health_none;
                    }
                } else if (i2 == 2) {
                    return;
                }
                if (r9.A02 && (r0 = (C124725yh) inCallBannerViewModel.A0C.A04()) != null && r0.A01 == 14) {
                    C36341k9.A18(inCallBannerViewModel.A08, true);
                    return;
                }
                return;
            } else if (r9.A06) {
                boolean z2 = r9.A02;
                if (!z2) {
                    i3 = 11;
                }
                C47862ft A0O2 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
                if (r9.A04) {
                    r6 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
                }
                int i5 = R.color.f6nameremoved;
                if (z) {
                    i5 = R.color.f6nameremoved;
                }
                r5 = new AnonymousClass655(A0O2, r6, i3, i5);
                i = R.drawable.vec_ic_network_health_poor;
                if (z2) {
                    i = R.drawable.vec_ic_network_health_poor_v2;
                }
            } else {
                return;
            }
            C74213lF r1 = new C74213lF(i);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            r5.A01 = r1;
            r5.A00 = scaleType;
            InCallBannerViewModel.A09(inCallBannerViewModel, r5.A00());
        } else if (this instanceof CallGridViewModel) {
            CallGridViewModel callGridViewModel = (CallGridViewModel) this;
            if (r9.A02 && z) {
                if ((!r9.A06 || callGridViewModel.A0A) && r9.A00 == 2) {
                    callGridViewModel.A0D = true;
                } else if (C1901797e.A00(callGridViewModel.A0I.A04(), callGridViewModel.A0W.A0S())) {
                    callGridViewModel.A0D = false;
                } else if (callGridViewModel.A0D) {
                    callGridViewModel.A0D = false;
                    if (r9.A01 != 2) {
                        return;
                    }
                } else {
                    return;
                }
                A04(callGridViewModel);
            }
        }
    }

    public void BcF(UserJid[] userJidArr, int[] iArr) {
        C001700s r1;
        int i;
        if (this instanceof AudioChatCallingViewModel) {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this;
            UserJid userJid = audioChatCallingViewModel.A03;
            if (userJid != null) {
                int A07 = AnonymousClass02R.A07(userJid, userJidArr);
                if (A07 < 0 || A07 > iArr.length - 1) {
                    r1 = audioChatCallingViewModel.A0D;
                    i = 0;
                } else {
                    r1 = audioChatCallingViewModel.A0D;
                    i = Integer.valueOf(iArr[A07]);
                }
                r1.A0D(i);
            }
        } else if (this instanceof CallGridViewModel) {
            CallGridViewModel callGridViewModel = (CallGridViewModel) this;
            int length = userJidArr.length;
            if (length != iArr.length) {
                Log.e("CallGridViewModel/onParticipantAudioUpdated, participantJids and audioLevels should be one-on-one mapped");
                return;
            }
            HashSet A0k = C90524aI.A0k(callGridViewModel.A0z.keySet());
            for (int i2 = 0; i2 < length; i2++) {
                C1258961t r2 = callGridViewModel.A0X;
                if (r2.A00.containsKey(userJidArr[i2])) {
                    r2.A00(Integer.valueOf(iArr[i2]), userJidArr[i2]);
                }
                A0k.remove(userJidArr[i2]);
            }
            Iterator it = A0k.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C1258961t r12 = callGridViewModel.A0X;
                if (r12.A00.containsKey(next)) {
                    r12.A00(0, next);
                }
            }
        }
    }

    public void Bea(UserJid userJid, boolean z, boolean z2) {
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            AnonymousClass141 A0D = inCallBannerViewModel.A04.A0D(userJid);
            int i = R.string.f12nameremoved;
            if (z2) {
                i = R.string.f12nameremoved;
            }
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = inCallBannerViewModel.A05.A0H(A0D);
            C47862ft A0O = C90524aI.A0O(A0L, i);
            C47862ft A0O2 = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
            int i2 = R.color.f6nameremoved;
            if (z) {
                i2 = R.color.f6nameremoved;
            }
            A05(inCallBannerViewModel, new AnonymousClass655(A0O, A0O2, 6, i2), R.drawable.vec_ic_remove_user_warning, R.color.f6nameremoved);
        }
    }

    public void Bed(UserJid userJid, boolean z, boolean z2) {
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            AnonymousClass141 A0D = inCallBannerViewModel.A04.A0D(userJid);
            int i = R.string.f12nameremoved;
            int i2 = R.drawable.vec_ic_calling_remove_user;
            if (z2) {
                i = R.string.f12nameremoved;
                i2 = R.drawable.vec_ic_calling_user_blocked;
            }
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = inCallBannerViewModel.A05.A0H(A0D);
            C47862ft A0O = C90524aI.A0O(A0L, i);
            int i3 = R.color.f6nameremoved;
            if (z) {
                i3 = R.color.f6nameremoved;
            }
            A05(inCallBannerViewModel, new AnonymousClass655(A0O, (C61243Bc) null, 7, i3), i2, R.color.f6nameremoved);
        }
    }

    public void Bfr(int i) {
        C28201Rs r1;
        if (this instanceof ScreenShareViewModel) {
            ScreenShareViewModel screenShareViewModel = (ScreenShareViewModel) this;
            C36321k7.A1T("ScreenShareViewModel onScreenShareEndedWithReason: ", AnonymousClass000.A0u(), i);
            if (i != 2) {
                if (i == 3) {
                    screenShareViewModel.A03 = C108065Sa.STOPPING;
                    r1 = screenShareViewModel.A0F;
                } else {
                    return;
                }
            } else if (screenShareViewModel.A03 != C108065Sa.STOPPED) {
                screenShareViewModel.A03 = C108065Sa.STOPPING;
                ScreenShareViewModel.A0B(screenShareViewModel);
                C131176Oa r2 = screenShareViewModel.A08;
                C007403e r12 = r2.A0G;
                if (r12 != null) {
                    r12.B2S((CancellationException) null);
                }
                C108345Td.A00(C108345Td.PEER_TAKEOVER, r2);
                r2.A0N.A00();
                r1 = screenShareViewModel.A0G;
            } else {
                return;
            }
            r1.A0D((Object) null);
        }
    }

    public void Bfs(UserJid userJid, boolean z, boolean z2) {
        if (this instanceof ScreenShareViewModel) {
            ScreenShareViewModel screenShareViewModel = (ScreenShareViewModel) this;
            StringBuilder A0i = C36341k9.A0i(userJid);
            A0i.append("ScreenShareViewModel onScreenShareStateChanged -- jid: ");
            A0i.append(userJid);
            A0i.append(", isStarted: ");
            A0i.append(z);
            C36321k7.A1X(", supportsGroupCallSharing: ", A0i, z2);
            if (screenShareViewModel.A06.A0M(userJid)) {
                if (z) {
                    ScreenShareViewModel.A0A(C108065Sa.STARTED, screenShareViewModel);
                } else {
                    ScreenShareViewModel.A0B(screenShareViewModel);
                    C007403e r1 = screenShareViewModel.A08.A0G;
                    if (r1 != null) {
                        r1.B2S((CancellationException) null);
                    }
                }
                screenShareViewModel.A08.A0H = z;
            }
        } else if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            if (!C34681hT.A0E(inCallBannerViewModel.A01, userJid)) {
                String A0H = inCallBannerViewModel.A05.A0H(inCallBannerViewModel.A04.A0D(userJid));
                if (A0H == null) {
                    Log.e("InCallBannerViewModel/onScreenShareStateChanged contact name is null");
                    return;
                }
                int i = 10;
                if (z) {
                    i = 9;
                }
                C47842fr r3 = new C47842fr(A0H);
                int i2 = R.string.f12nameremoved;
                if (z) {
                    i2 = R.string.f12nameremoved;
                }
                AnonymousClass655 r2 = new AnonymousClass655(r3, C90524aI.A0O(C90524aI.A0w(), i2), i, R.color.f6nameremoved);
                List singletonList = Collections.singletonList(userJid);
                r2.A05 = true;
                r2.A03.addAll(singletonList);
                InCallBannerViewModel.A09(inCallBannerViewModel, r2.A00());
            }
        }
    }

    public void BgU(String str, boolean z) {
        if (this instanceof MenuBottomSheetViewModel) {
            MenuBottomSheetViewModel menuBottomSheetViewModel = (MenuBottomSheetViewModel) this;
            C119375pi r1 = menuBottomSheetViewModel.A01;
            if (r1 == null || (!r1.A00.equals(str) && r1.A01 != z)) {
                menuBottomSheetViewModel.A01 = new C119375pi(str, z);
            }
            menuBottomSheetViewModel.A0C.A0D((Object) null);
            C119395pk r6 = new C119395pk(C90524aI.A0O(new Object[0], R.string.f12nameremoved));
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
            C121425t7 r0 = new C121425t7(C90524aI.A0O(A0L, R.string.f12nameremoved), 6, R.drawable.ic_action_forward);
            List list = r6.A01;
            list.add(r0);
            list.add(new C121425t7(C90524aI.A0O(new Object[0], R.string.f12nameremoved), 7, R.drawable.ic_action_copy));
            list.add(new C121425t7(C90524aI.A0O(new Object[0], R.string.f12nameremoved), 8, R.drawable.ic_share));
            menuBottomSheetViewModel.A04.A0D(new C119405pl(C23931Ak.copyOf((Collection) list), r6.A00));
        }
    }

    public void Bk9(UserJid userJid, boolean z) {
        if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            AnonymousClass141 A0D = inCallBannerViewModel.A04.A0D(userJid);
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = inCallBannerViewModel.A05.A0H(A0D);
            C47862ft A0O = C90524aI.A0O(A0L, R.string.f12nameremoved);
            int i = R.color.f6nameremoved;
            if (z) {
                i = R.color.f6nameremoved;
            }
            A05(inCallBannerViewModel, new AnonymousClass655(A0O, (C61243Bc) null, 4, i), R.drawable.vec_ic_calling_remove_user, R.color.f6nameremoved);
        }
    }

    public static void A02(C105545Fb r0, C95504lc r1) {
        r1.BSn(r0.A05());
    }
}
