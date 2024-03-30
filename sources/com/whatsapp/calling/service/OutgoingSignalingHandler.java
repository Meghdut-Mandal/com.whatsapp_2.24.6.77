package com.whatsapp.calling.service;

import X.AVn;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1AL;
import X.AnonymousClass1WI;
import X.AnonymousClass630;
import X.AnonymousClass64F;
import X.AnonymousClass67L;
import X.AnonymousClass6WM;
import X.AnonymousClass6YM;
import X.AnonymousClass744;
import X.AnonymousClass751;
import X.C121455tA;
import X.C122795vR;
import X.C1270266q;
import X.C132906Vt;
import X.C1501974i;
import X.C177598e3;
import X.C18740tg;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C19980wp;
import X.C203399nx;
import X.C20810yC;
import X.C237919w;
import X.C27691Pi;
import X.C27701Pj;
import X.C34681hT;
import X.C36321k7;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90514aH;
import X.C90524aI;
import android.os.ConditionVariable;
import android.os.Parcelable;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.SignalingXmppCallback;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OutgoingSignalingHandler implements SignalingXmppCallback {
    public final C20810yC abProps;
    public final C27691Pi callSendMethods;
    public final C19980wp companionModeSharedPreferences;
    public final AnonymousClass6WM encryptionHelper;
    public final C19730wQ meManager;
    public String outgoingCallOfferKey;
    public volatile AnonymousClass64F pendingCallOfferStanza;
    public final C19970wo time;
    public final C27701Pj voiceChatAcceptPingManager;
    public final AnonymousClass6YM voiceService;
    public final C19770wU waWorkers;

    public static VoipStanzaChildNode[] A02(Map map, Set set) {
        ArrayList arrayList;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
        Map map2 = map;
        if (map == null) {
            C18740tg.A0D(C90514aH.A1a(set), "no destination jids");
            arrayList = C36441kJ.A15(set);
        } else {
            C18740tg.A0D(map.keySet().equals(set), "some device are not encrypted!");
            arrayList = null;
        }
        ArrayList A02 = AnonymousClass1WI.A02((C1270266q) null, (Integer) null, (String) null, (String) null, arrayList, Collections.emptyMap(), (Map) null, map2, 0, false, false, false, false);
        if (!A02.isEmpty()) {
            voipStanzaChildNodeArr = new VoipStanzaChildNode[A02.size()];
            for (int i = 0; i < A02.size(); i++) {
                voipStanzaChildNodeArr[i] = VoipStanzaChildNode.fromProtocolTreeNode((C203399nx) A02.get(i));
            }
        }
        return voipStanzaChildNodeArr;
    }

    public void clearPendingCallOfferStanza() {
        this.pendingCallOfferStanza = null;
    }

    public boolean preSendTerminate(Jid jid, String str, boolean z) {
        sendPendingCallOfferStanza(jid, str, true);
        String str2 = this.outgoingCallOfferKey;
        if (str2 != null) {
            if (!z) {
                this.callSendMethods.A03.A05.A00(str2);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("OutgoingSignalingHandler/preSendTerminate: dropped unacked offer: call id = ");
                A0u.append(str);
                A0u.append(", stanza id = ");
                C36341k9.A1O(A0u, this.outgoingCallOfferKey);
            }
            this.outgoingCallOfferKey = null;
        }
        return true;
    }

    public void sendCallStanza(Jid jid, String str, VoipStanzaChildNode voipStanzaChildNode) {
        String str2;
        VoipStanzaChildNode voipStanzaChildNode2 = voipStanzaChildNode;
        String str3 = voipStanzaChildNode.tag;
        String A00 = C237919w.A00(this.meManager, this.time);
        boolean z = true;
        Jid jid2 = jid;
        String str4 = str;
        switch (str3.hashCode()) {
            case -1624583601:
                if (str3.equals("link_join")) {
                    AnonymousClass6YM r3 = this.voiceService;
                    if (r3.A0p == null) {
                        r3.A0p = new C121455tA(A00, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case -1423461112:
                if (str3.equals("accept")) {
                    AnonymousClass6YM r32 = this.voiceService;
                    if (r32.A0o == null) {
                        r32.A0o = new C121455tA(A00, SystemClock.elapsedRealtime());
                    }
                    C122795vR r2 = new C122795vR(jid, A00, str, voipStanzaChildNode);
                    C27701Pj r1 = this.voiceChatAcceptPingManager;
                    AnonymousClass00C.A0D(str, 0);
                    if (r1.A03.contains(str)) {
                        r1.A04.put(str, r2);
                    }
                    this.callSendMethods.A01(r2);
                    return;
                }
                break;
            case -934710369:
                str2 = "reject";
                break;
            case 103144406:
                if (str3.equals("lobby") && this.voiceService.A0r == null && C90484aE.A1V(str)) {
                    this.voiceService.A0r = new C121455tA(A00, SystemClock.elapsedRealtime());
                    break;
                }
            case 105650780:
                if (str3.equals("offer")) {
                    sendOfferStanza(new AnonymousClass64F(jid, str, voipStanzaChildNode));
                    return;
                }
                break;
            case 112202875:
                str2 = "video";
                break;
            case 1063018407:
                if (str3.equals("enc_rekey")) {
                    this.waWorkers.Boy(new AVn(this, jid2, voipStanzaChildNode2, A00, str4, 0));
                    return;
                }
                break;
            case 1184155715:
                if (str3.equals("link_query")) {
                    AnonymousClass6YM r33 = this.voiceService;
                    if (r33.A0q == null) {
                        r33.A0q = new C121455tA(A00, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case 1945493729:
                if (str3.equals("link_create")) {
                    AnonymousClass6YM.A3V = A00;
                    break;
                }
                break;
            case 2035990113:
                if (str3.equals("terminate")) {
                    CallState currentCallState = Voip.getCurrentCallState();
                    if (currentCallState == CallState.ACTIVE || currentCallState == CallState.CONNECTED_LONELY || !this.abProps.A0E(8003)) {
                        z = false;
                    }
                    preSendTerminate(jid, str, z);
                    C122795vR r12 = new C122795vR(jid, A00, str, voipStanzaChildNode);
                    C27691Pi r0 = this.callSendMethods;
                    if (z) {
                        r0.A00(r12);
                        C36321k7.A1Q("OutgoingSignalingHandler/sendCallStanza: sending terminate with retry: call id = ", str, AnonymousClass000.A0u());
                        return;
                    }
                    r0.A01(r12);
                    return;
                }
                break;
        }
        if (str3.equals(str2)) {
            this.callSendMethods.A00(new C122795vR(jid, A00, str, voipStanzaChildNode));
            return;
        }
        this.callSendMethods.A01(new C122795vR(jid, A00, str, voipStanzaChildNode));
    }

    public void sendOfferStanza(AnonymousClass64F r13) {
        AnonymousClass64F r4 = r13;
        Jid jid = r13.A01;
        String str = r13.A04;
        VoipStanzaChildNode voipStanzaChildNode = r13.A03;
        String A00 = C237919w.A00(this.meManager, this.time);
        this.outgoingCallOfferKey = A00;
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(r13.A05);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            if (A11.getValue() != null) {
                A0J.put(key, A11.getValue());
            }
        }
        Set keySet = A0J.keySet();
        boolean A1a = C90514aH.A1a(keySet);
        if (A1a) {
            for (Object next : keySet) {
                AnonymousClass67L r1 = this.encryptionHelper.A03;
                AnonymousClass00C.A0D(next, 0);
                if (r1.A01.contains(next)) {
                    C36321k7.A1K(next, "VoiceService:sendOfferStanza waiting for PreKey job finishes with ", AnonymousClass000.A0u());
                    this.pendingCallOfferStanza = r13;
                    return;
                }
            }
        }
        AnonymousClass744 r3 = new AnonymousClass744(r4, this, jid, voipStanzaChildNode, str, A00, A0J, A1a);
        if (A1a) {
            Log.i("VoiceService:sendOfferStanza without delay");
            this.voiceService.A1E.execute(r3);
            return;
        }
        r3.run();
    }

    private AnonymousClass630 rekeyEncryptionTask(byte[] bArr, DeviceJid deviceJid, String str, byte b) {
        this.voiceService.A3F.put(deviceJid, Byte.valueOf(b));
        AnonymousClass630 encryptedE2EKey = getEncryptedE2EKey(bArr, deviceJid);
        if (encryptedE2EKey != null) {
            if (!C90484aE.A1V(str)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("VoiceService:rekeyEncryptionTask(");
                C90474aD.A1L(A0u, str);
                A0u.append(deviceJid);
                C36341k9.A1O(A0u, ", the call has ended, do nothing)");
            } else {
                this.voiceService.A3F.remove(deviceJid);
                return encryptedE2EKey;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e7 A[SYNTHETIC, Splitter:B:34:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map getBulkEncryptedE2EKeys(java.util.Map r14, int r15, boolean r16) {
        /*
            r13 = this;
            X.6WM r3 = r13.encryptionHelper
            boolean r0 = r14.isEmpty()
            java.lang.Boolean r5 = X.C36371kC.A0m()
            r2 = 0
            if (r0 != 0) goto L_0x0020
            X.67L r1 = r3.A03
            java.util.Set r0 = r14.keySet()
            r4 = 0
            java.util.HashSet r7 = r1.A00(r0, r4)
            if (r16 != 0) goto L_0x0038
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0038
        L_0x0020:
            android.util.Pair r4 = X.C36441kJ.A0Q(r5, r2)
        L_0x0024:
            java.lang.Object r0 = r4.first
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0033
            X.6YM r1 = r13.voiceService
            r0 = 30
            r1.A0R(r0, r2)
        L_0x0033:
            java.lang.Object r0 = r4.second
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0038:
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            java.util.Iterator r12 = X.AnonymousClass000.A0y(r14)
        L_0x0040:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0148
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r12)
            java.lang.Object r6 = r0.getKey()
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.Object r1 = r0.getValue()
            byte[] r1 = (byte[]) r1
            boolean r0 = r7.contains(r6)
            if (r0 != 0) goto L_0x0040
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
            X.8NN r10 = r0.A0p()
            X.8Hz r0 = r10.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.4uD r0 = r0.call_
            if (r0 != 0) goto L_0x006c
            X.4uD r0 = X.C99944uD.DEFAULT_INSTANCE
        L_0x006c:
            X.8NN r9 = r0.A0q()
            X.4tY r9 = (X.C99534tY) r9
            int r0 = r1.length
            X.8I5 r11 = X.C21674AUx.A01(r1, r4, r0)
            X.8Hz r1 = X.C90524aI.A0H(r9)
            X.4uD r1 = (X.C99944uD) r1
            int r0 = X.C99944uD.CALL_KEY_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.callKey_ = r11
            if (r15 != 0) goto L_0x009e
            X.0yC r1 = r3.A0C
            r0 = 520(0x208, float:7.29E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x009e
            X.1IN r1 = r3.A08
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.9TX r0 = r1.A00(r0)
            r1.A05(r0, r9)
        L_0x009e:
            X.8Hz r1 = X.C90524aI.A0H(r10)
            X.8SX r1 = (X.AnonymousClass8SX) r1
            X.8Hz r0 = r9.A0R()
            X.4uD r0 = (X.C99944uD) r0
            r0.getClass()
            r1.call_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            X.1OD r1 = r3.A0B
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.9Na r9 = r1.A07(r0)
            if (r9 == 0) goto L_0x0123
            X.8Hz r1 = r10.A0R()
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
            X.8NN r0 = r0.A0p()
            r0.A0T(r1)
            X.8NL r0 = (X.AnonymousClass8NL) r0
            X.C183348qe.A03(r9, r0)
            if (r0 == 0) goto L_0x0123
            X.8Hz r9 = r0.A0R()
        L_0x00d7:
            X.8SX r9 = (X.AnonymousClass8SX) r9
            X.189 r10 = r3.A06
            boolean r0 = r10.A0X()
            if (r0 != 0) goto L_0x0105
            boolean r0 = r3.A05()
            if (r0 != 0) goto L_0x0105
            X.187 r0 = r3.A07     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            X.7qg r1 = new X.7qg     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            r1.<init>(r3, r6, r9, r4)     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            r3.A0I = r0     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            java.util.concurrent.Future r0 = r3.A0I     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            X.630 r0 = (X.AnonymousClass630) r0     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            r8.put(r6, r0)     // Catch:{ CancellationException -> 0x013a, InterruptedException -> 0x0128, ExecutionException -> 0x014e }
            r3.A0I = r2
            goto L_0x0040
        L_0x0105:
            X.6EZ r0 = X.C133256Xm.A02(r6)
            boolean r1 = r10.A0Z(r0)
            java.lang.String r0 = "no session with deviceJid"
            X.C18740tg.A0D(r1, r0)
            X.6EZ r1 = X.C133256Xm.A02(r6)
            byte[] r0 = r9.A0o()
            X.630 r0 = X.C110545aq.A01(r1, r10, r0)
            r8.put(r6, r0)
            goto L_0x0040
        L_0x0123:
            X.8Hz r9 = r10.A0R()
            goto L_0x00d7
        L_0x0128:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0154 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0154 }
            android.util.Pair r4 = X.C36441kJ.A0Q(r0, r2)     // Catch:{ all -> 0x0154 }
            r3.A0I = r2
            goto L_0x0024
        L_0x013a:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey cancelled"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0154 }
            android.util.Pair r4 = X.C36441kJ.A0Q(r5, r2)     // Catch:{ all -> 0x0154 }
            r3.A0I = r2
            goto L_0x0024
        L_0x0148:
            android.util.Pair r4 = X.C36441kJ.A0Q(r5, r8)
            goto L_0x0024
        L_0x014e:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            r3.A0I = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.getBulkEncryptedE2EKeys(java.util.Map, int, boolean):java.util.Map");
    }

    /* renamed from: lambda$sendCallStanza$0$com-whatsapp-calling-service-OutgoingSignalingHandler  reason: not valid java name */
    public /* synthetic */ void m7lambda$sendCallStanza$0$comwhatsappcallingserviceOutgoingSignalingHandler(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        if (jid instanceof C177598e3) {
            Parcelable.Creator creator = C177598e3.CREATOR;
            C177598e3 r2 = (C177598e3) jid;
            C18740tg.A06(r2);
            sendReKeyFanoutStanza(str, r2, str2, voipStanzaChildNode);
            return;
        }
        DeviceJid of = DeviceJid.of(jid);
        C18740tg.A06(of);
        sendReKeyStanza(str, of, str2, voipStanzaChildNode);
    }

    /* renamed from: lambda$sendOfferStanza$1$com-whatsapp-calling-service-OutgoingSignalingHandler  reason: not valid java name */
    public /* synthetic */ void m8lambda$sendOfferStanza$1$comwhatsappcallingserviceOutgoingSignalingHandler(boolean z, Jid jid, String str, Map map, AnonymousClass64F r10, VoipStanzaChildNode voipStanzaChildNode, String str2) {
        VoipStanzaChildNode A00;
        if (z) {
            UserJid convertToUserJid = Voip.JidHelper.convertToUserJid(jid);
            C18740tg.A06(convertToUserJid);
            Map sendOfferEncryptionTask = sendOfferEncryptionTask(str, convertToUserJid, map);
            if (sendOfferEncryptionTask != null) {
                if (r10.A02 != null) {
                    A00 = A01(r10.A03, A02(sendOfferEncryptionTask, r10.A05.keySet()));
                } else {
                    AnonymousClass630 r2 = null;
                    C18740tg.A0D(AnonymousClass000.A1S(sendOfferEncryptionTask.size(), 1), "cannot have multiple encrypted messages in old format!");
                    if (sendOfferEncryptionTask.size() == 1) {
                        DeviceJid of = DeviceJid.of(r10.A01);
                        C18740tg.A06(of);
                        r2 = (AnonymousClass630) C90514aH.A0p(of, sendOfferEncryptionTask);
                    }
                    A00 = A00(r2, r10.A03, r10.A00);
                }
                voipStanzaChildNode = C90494aF.A0Q(this, A00);
            } else {
                Log.i("VoiceService:sendOfferStanza sendOfferEcryptionTask skipped or failed");
                this.pendingCallOfferStanza = r10;
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("VoiceService:sendOfferStanza without enc (Call ID = ");
            A0u.append(str);
            A0u.append(", peer = ");
            A0u.append(jid);
            C36321k7.A1a(A0u, ")");
        }
        if (voipStanzaChildNode != null) {
            AnonymousClass6YM r3 = this.voiceService;
            if (r3.A0s == null) {
                r3.A0s = new C121455tA(str2, SystemClock.elapsedRealtime());
            }
            this.callSendMethods.A00(new C122795vR(jid, str2, str, voipStanzaChildNode));
            return;
        }
        this.pendingCallOfferStanza = r10;
    }

    public void maybeSendPendingOffer(DeviceJid deviceJid, String str) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        AnonymousClass64F r4 = this.pendingCallOfferStanza;
        if (r4 != null) {
            String str2 = r4.A04;
            if (str2.equals(str) && r4.A05.containsKey(deviceJid)) {
                this.pendingCallOfferStanza = null;
                VoipStanzaChildNode voipStanzaChildNode = r4.A02;
                if (voipStanzaChildNode != null) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                    C18740tg.A06(childrenCopy);
                    for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                        AnonymousClass1AL[] attributesCopy = voipStanzaChildNode2.getAttributesCopy();
                        C18740tg.A06(attributesCopy);
                        int length = attributesCopy.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            AnonymousClass1AL r1 = attributesCopy[i];
                            if ("jid".equals(r1.A02)) {
                                DeviceJid of = DeviceJid.of(r1.A01);
                                if (of != null && !of.equals(deviceJid)) {
                                    A0I.add(voipStanzaChildNode2);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!A0I.isEmpty() && (voipStanzaChildNodeArr = (VoipStanzaChildNode[]) A0I.toArray(new VoipStanzaChildNode[0])) != null) {
                        sendOfferStanza(new AnonymousClass64F(r4.A01, str2, A01(r4.A03, voipStanzaChildNodeArr)));
                    }
                }
            }
        }
    }

    public void sendOfferRetryRequest(DeviceJid deviceJid) {
        String A1A = C36431kI.A1A(deviceJid, this.voiceService.A1z);
        if (A1A != null) {
            C36321k7.A1K(deviceJid, "voip/sendOfferRetryRequest for jid:", AnonymousClass000.A0u());
            this.voiceService.A1z.remove(deviceJid);
            this.voiceService.A1E.execute(new AnonymousClass751(30, A1A, deviceJid));
        }
    }

    public void sendPendingCallOfferStanza(Jid jid, String str, boolean z) {
        VoipStanzaChildNode A00;
        if (str != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/sendPendingCallOfferStanza jid=");
            A0u.append(jid);
            A0u.append(" callId=");
            A0u.append(str);
            A0u.append(" callTerminated=");
            A0u.append(z);
            A0u.append(" pendingCallOfferStanza=(");
            A0u.append(this.pendingCallOfferStanza);
            C36321k7.A1K(this, "), this = ", A0u);
        }
        AnonymousClass64F r5 = this.pendingCallOfferStanza;
        if (r5 != null) {
            String str2 = r5.A04;
            if (str2.equals(str)) {
                Jid jid2 = r5.A01;
                Jid jid3 = jid2;
                if (jid2 instanceof DeviceJid) {
                    jid3 = ((DeviceJid) jid3).userJid;
                }
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
                if (jid3.equals(jid)) {
                    if (z) {
                        if (r5.A02 != null) {
                            A00 = A01(r5.A03, A02((Map) null, r5.A05.keySet()));
                        } else {
                            ConditionVariable conditionVariable = C18740tg.A00;
                            A00 = A00((AnonymousClass630) null, r5.A03, r5.A00);
                        }
                        r5 = new AnonymousClass64F(jid2, str2, A00);
                    }
                    this.pendingCallOfferStanza = null;
                    sendOfferStanza(r5);
                }
            }
        }
    }

    public void sendPendingRekeyRequest(DeviceJid deviceJid) {
        byte byteValue;
        Number A0b = C90524aI.A0b(deviceJid, this.voiceService.A3F);
        if (A0b != null && (byteValue = A0b.byteValue()) >= 0 && byteValue <= 4) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/sendPendingRekeyRequest for jid:");
            A0u.append(deviceJid);
            C36321k7.A1K(A0b, ", retry:", A0u);
            this.voiceService.A1E.execute(new C1501974i(deviceJid, A0b, 6));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r2 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = X.C34681hT.A02(r8, "enc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r1 = "VoiceService:sendReKeyFanoutStanza:invalid enc node";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r1 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r6.put(r2, r0);
        r13.voiceService.A3F.put(r2, (byte) 0);
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendReKeyFanoutStanza(java.lang.String r14, X.C177598e3 r15, java.lang.String r16, com.whatsapp.protocol.VoipStanzaChildNode r17) {
        /*
            r13 = this;
            java.lang.String r0 = "destination"
            r4 = r17
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C34681hT.A02(r4, r0)
            if (r1 == 0) goto L_0x0090
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r1.getChildrenCopy()
            if (r0 == 0) goto L_0x0090
            java.util.HashMap r6 = X.AnonymousClass001.A0J()
            com.whatsapp.protocol.VoipStanzaChildNode[] r7 = r1.getChildrenCopy()
            int r5 = r7.length
            r12 = 0
            r3 = 0
        L_0x001b:
            if (r3 >= r5) goto L_0x006d
            r8 = r7[r3]
            X.1AL[] r11 = r8.getAttributesCopy()
            X.C18740tg.A06(r11)
            int r10 = r11.length
            r9 = 0
        L_0x0028:
            if (r9 >= r10) goto L_0x006a
            r2 = r11[r9]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r2 == 0) goto L_0x006a
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C34681hT.A02(r8, r0)
            if (r0 != 0) goto L_0x004d
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:invalid enc node"
        L_0x0048:
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x004c:
            return
        L_0x004d:
            byte[] r0 = r0.getDataCopy()
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty"
            goto L_0x0048
        L_0x0056:
            r6.put(r2, r0)
            X.6YM r0 = r13.voiceService
            java.util.Map r1 = r0.A3F
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)
            r1.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0067:
            int r9 = r9 + 1
            goto L_0x0028
        L_0x006a:
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:no device jid"
            goto L_0x0048
        L_0x006d:
            r0 = 1
            java.util.Map r3 = r13.getBulkEncryptedE2EKeys(r6, r0, r0)
            if (r3 == 0) goto L_0x004c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x004c
            java.util.Iterator r2 = X.AnonymousClass000.A10(r3)
        L_0x007e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r2.next()
            X.6YM r0 = r13.voiceService
            java.util.Map r0 = r0.A3F
            r0.remove(r1)
            goto L_0x007e
        L_0x0090:
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:bad message format"
            goto L_0x0048
        L_0x0093:
            java.util.Set r0 = r3.keySet()
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = A02(r3, r0)
            com.whatsapp.protocol.VoipStanzaChildNode r2 = A01(r4, r0)
            X.1Pi r1 = r13.callSendMethods
            X.5vR r0 = new X.5vR
            r3 = r16
            r0.<init>(r15, r14, r3, r2)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.sendReKeyFanoutStanza(java.lang.String, X.8e3, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public void sendReKeyStanza(String str, DeviceJid deviceJid, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        String str3;
        VoipStanzaChildNode A02 = C34681hT.A02(voipStanzaChildNode, "enc");
        if (A02 == null) {
            str3 = "invalid enc node!";
        } else {
            Byte A06 = C34681hT.A06(A02);
            if (A06 == null) {
                str3 = "invalid retry count!";
            } else {
                byte[] dataCopy = A02.getDataCopy();
                if (dataCopy == null) {
                    Log.e("VoiceService:sendReKeyStanza, e2e key is empty");
                    str3 = "e2e key is empty!";
                } else {
                    byte byteValue = A06.byteValue();
                    AnonymousClass630 rekeyEncryptionTask = rekeyEncryptionTask(dataCopy, deviceJid, str2, byteValue);
                    if (rekeyEncryptionTask != null) {
                        this.callSendMethods.A00(new C122795vR(deviceJid, str, str2, C90494aF.A0Q(this, A00(rekeyEncryptionTask, voipStanzaChildNode, byteValue))));
                        return;
                    }
                    return;
                }
            }
        }
        C18740tg.A0D(false, str3);
    }

    public OutgoingSignalingHandler(C19970wo r1, C20810yC r2, C19730wQ r3, C19770wU r4, AnonymousClass6YM r5, C27691Pi r6, AnonymousClass6WM r7, C19980wp r8, C27701Pj r9) {
        this.time = r1;
        this.abProps = r2;
        this.meManager = r3;
        this.waWorkers = r4;
        this.voiceService = r5;
        this.callSendMethods = r6;
        this.encryptionHelper = r7;
        this.companionModeSharedPreferences = r8;
        this.voiceChatAcceptPingManager = r9;
    }

    public static VoipStanzaChildNode A00(AnonymousClass630 r8, VoipStanzaChildNode voipStanzaChildNode, byte b) {
        VoipStanzaChildNode voipStanzaChildNode2;
        VoipStanzaChildNode.Builder A01 = C34681hT.A01(voipStanzaChildNode);
        if (r8 != null) {
            voipStanzaChildNode2 = VoipStanzaChildNode.fromProtocolTreeNode(C132906Vt.A00(r8, b));
        } else {
            voipStanzaChildNode2 = null;
        }
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode3 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode3.tag)) {
                    voipStanzaChildNode3 = voipStanzaChildNode2;
                    if (voipStanzaChildNode2 == null) {
                    }
                }
                A01.addChild(voipStanzaChildNode3);
            }
        }
        return A01.build();
    }

    public static VoipStanzaChildNode A01(VoipStanzaChildNode voipStanzaChildNode, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        VoipStanzaChildNode.Builder A01 = C34681hT.A01(voipStanzaChildNode);
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    if (voipStanzaChildNodeArr != null) {
                        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder("destination");
                        builder.addChildren(voipStanzaChildNodeArr);
                        voipStanzaChildNode2 = builder.build();
                    }
                }
                A01.addChild(voipStanzaChildNode2);
            }
        }
        return A01.build();
    }

    private AnonymousClass630 getEncryptedE2EKey(byte[] bArr, DeviceJid deviceJid) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put(deviceJid, bArr);
        Map bulkEncryptedE2EKeys = getBulkEncryptedE2EKeys(A0J, 1, false);
        if (bulkEncryptedE2EKeys != null) {
            return (AnonymousClass630) bulkEncryptedE2EKeys.get(deviceJid);
        }
        return null;
    }

    public Map sendOfferEncryptionTask(String str, UserJid userJid, Map map) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService:sendOfferEcryptionTask, Call ID = ");
        A0u.append(str);
        C36321k7.A1K(userJid, ", peer = ", A0u);
        Map bulkEncryptedE2EKeys = getBulkEncryptedE2EKeys(map, 0, false);
        if (bulkEncryptedE2EKeys != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null && ((callInfo.isCaller || callInfo.callLinkToken != null) && callInfo.callId.equals(str) && C90494aF.A0M(callInfo).equals(userJid))) {
                return bulkEncryptedE2EKeys;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("VoiceService:sendOfferEcryptionTask(");
            C90474aD.A1L(A0u2, str);
            A0u2.append(userJid);
            C36341k9.A1O(A0u2, ", call state does not match, do nothing)");
        }
        return null;
    }
}
