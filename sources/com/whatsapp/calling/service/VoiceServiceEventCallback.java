package com.whatsapp.calling.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass143;
import X.AnonymousClass17Y;
import X.AnonymousClass1GE;
import X.AnonymousClass1HQ;
import X.AnonymousClass1VD;
import X.AnonymousClass1ZY;
import X.AnonymousClass2ZG;
import X.AnonymousClass36B;
import X.AnonymousClass3DQ;
import X.AnonymousClass3KV;
import X.AnonymousClass3OE;
import X.AnonymousClass6CG;
import X.AnonymousClass6DW;
import X.AnonymousClass6Ts;
import X.AnonymousClass6YM;
import X.AnonymousClass735;
import X.AnonymousClass73M;
import X.AnonymousClass743;
import X.AnonymousClass74M;
import X.AnonymousClass74Z;
import X.C110255aN;
import X.C119435po;
import X.C120285rG;
import X.C121455tA;
import X.C124445yC;
import X.C132636Up;
import X.C146276vL;
import X.C146286vM;
import X.C1501574e;
import X.C1501974i;
import X.C1502474n;
import X.C157227cc;
import X.C160737lV;
import X.C18740tg;
import X.C1901797e;
import X.C19460v5;
import X.C19700wN;
import X.C21010yW;
import X.C21100yf;
import X.C27631Pa;
import X.C34681hT;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C80383vJ;
import X.C80523vX;
import X.C80653vk;
import X.C81263wj;
import X.C88444Ss;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.calling.CallSummary;
import com.whatsapp.calling.bcall.data.AudienceInfo;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallFatalError;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallOfferAckError;
import com.whatsapp.voipcalling.CallParticipant;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.SyncDevicesUserInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipEventCallback;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class VoiceServiceEventCallback implements VoipEventCallback {
    public static final int TIMEOUT_CALLER_BEFORE_ACCEPT_DEFAULT_MS = 90000;
    public final C120285rG bufferQueue = new C120285rG();
    public final AnonymousClass1GE httpsFormPostFactory;
    public final AnonymousClass6YM voiceService;
    public final WhatsAppDynamicPytorchLoader whatsappDynamicPytorchLoader;

    private boolean isSelfNacked(CallOfferAckError[] callOfferAckErrorArr) {
        for (CallOfferAckError callOfferAckError : callOfferAckErrorArr) {
            if (this.voiceService.A29.A0M(callOfferAckError.errorJid)) {
                return true;
            }
        }
        return false;
    }

    public void bCallCreated(String str, byte[] bArr, String str2) {
        changeAudioRoute(1);
    }

    public void bCallJoined(String str, String str2, String str3) {
        changeAudioRoute(1);
    }

    public void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i, Voip.RecordingInfo[] recordingInfoArr) {
        C18740tg.A0B(false);
        byte[] bArr2 = bArr;
        if (bArr != null && bArr.length != 0) {
            int i2 = i;
            if (i > 0) {
                Voip.RecordingInfo[] recordingInfoArr2 = recordingInfoArr;
                if (recordingInfoArr != null) {
                    AnonymousClass6YM.A3W.execute(new C80653vk(this, recordingInfoArr2, debugTapType, bArr2, i2, 2));
                }
            }
        }
    }

    public void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr) {
        C18740tg.A0B(false);
        AnonymousClass6YM.A3W.execute(new C1501974i(recordingInfoArr, debugTapType, 17));
    }

    public void lidCallerDisplayInfo(UserJid[] userJidArr, UserJid[] userJidArr2) {
        boolean z;
        int length = userJidArr.length;
        C18740tg.A0D(AnonymousClass000.A1S(length, userJidArr2.length), "Lid User array & Phone User Array length mismatch");
        HashMap A0J = AnonymousClass001.A0J();
        for (int i = 0; i < length; i++) {
            if (AnonymousClass143.A0I(userJidArr[i])) {
                z = true;
                if (userJidArr2[i] instanceof PhoneUserJid) {
                    C18740tg.A0D(z, "Lid User Jid or Phone User Jid class mismatch");
                    A0J.put(userJidArr[i], userJidArr2[i]);
                }
            }
            z = false;
            C18740tg.A0D(z, "Lid User Jid or Phone User Jid class mismatch");
            A0J.put(userJidArr[i], userJidArr2[i]);
        }
        C36411kG.A1M(this.voiceService.A36, this, A0J, 18);
    }

    public void networkHealthChanged(int i, int i2, boolean z, boolean z2) {
        AnonymousClass6DW r2 = new AnonymousClass6DW(i, i2, z, z2, true, false, false);
        C36321k7.A1K(r2, "VoiceService EVENT:networkHealthChanged eventData: ", AnonymousClass000.A0u());
        this.voiceService.A0c.obtainMessage(53, r2).sendToTarget();
    }

    public void networkHealthChangedV2(int i, int i2, boolean z, boolean z2, boolean z3) {
        AnonymousClass6DW r2 = new AnonymousClass6DW(i, i2, z, true, z2, z3, true);
        C36321k7.A1K(r2, "VoiceService EVENT:networkHealthChangedV2 eventData: ", AnonymousClass000.A0u());
        this.voiceService.A0c.obtainMessage(53, r2).sendToTarget();
    }

    public void setScheduledCallJoinTimeDiffMs(GroupJid groupJid, String str) {
        GroupJid groupJid2 = groupJid;
        if (groupJid != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass6YM r1 = this.voiceService;
                if (r1.A3H) {
                    r1.A36.Bp1(new AnonymousClass73M(this, groupJid2, str2, 2, System.currentTimeMillis()));
                }
            }
        }
    }

    public void showCallNotAllowedActivity(ArrayList arrayList, int i, String str) {
        this.voiceService.A28.A0H(new C80523vX(this, arrayList, str, i, 0));
    }

    public void speakerStatusChanged(UserJid[] userJidArr, int[] iArr) {
        C18740tg.A0D(AnonymousClass000.A1S(userJidArr.length, iArr.length), "Participant jid list and audio level list should be one-to-one mapped");
        Message obtainMessage = this.voiceService.A0c.obtainMessage(39);
        obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        obtainMessage.getData().putIntArray("audio_levels", iArr);
        obtainMessage.sendToTarget();
    }

    public void startCallRecording() {
        C18740tg.A0B(false);
    }

    private void changeAudioRoute(int i) {
        this.voiceService.A0c.removeMessages(27);
        Handler handler = this.voiceService.A0c;
        handler.sendMessage(handler.obtainMessage(27, i, 0));
    }

    private void handleFatalOfferNack(ArrayList arrayList, int i, CallInfo callInfo) {
        int i2 = 3;
        if (i != 401) {
            i2 = 10;
            int i3 = 2;
            if (i != 460) {
                if (i == 411) {
                    this.voiceService.A0l(arrayList, 11);
                } else if (i == 412) {
                    this.voiceService.A0l(arrayList, 10);
                } else if (i == 431) {
                    i2 = 15;
                } else if (i != 432) {
                    i2 = 0;
                    switch (i) {
                        case 403:
                            if (callInfo.videoEnabled) {
                                i2 = 7;
                                break;
                            }
                            break;
                        case 404:
                            i2 = 16;
                            break;
                        case 405:
                            i2 = 4;
                            break;
                        case 406:
                            if (callInfo.videoEnabled) {
                                i3 = 11;
                            }
                            i2 = i3;
                            break;
                        default:
                            switch (i) {
                                case 426:
                                    i2 = 1;
                                    if (callInfo.videoEnabled) {
                                        i2 = 9;
                                        break;
                                    }
                                    break;
                                case 427:
                                    i2 = 12;
                                    break;
                                case 428:
                                    i2 = 14;
                                    break;
                                default:
                                    if (callInfo.videoEnabled) {
                                        i2 = 8;
                                        break;
                                    }
                                    break;
                            }
                    }
                } else {
                    this.voiceService.A0l(arrayList, 2);
                }
                i2 = -1;
            } else if (!callInfo.videoEnabled) {
                i2 = 2;
            }
        }
        if (i2 != -1) {
            showCallNotAllowedActivity(arrayList, i2, (String) null);
        }
        this.voiceService.A0R(25, (String) null);
    }

    private boolean isFatalErrorCode(int i) {
        return AnonymousClass000.A1S(i, 432);
    }

    private /* synthetic */ void lambda$startCallRecording$5() {
        if (!Voip.startCallRecording(this.voiceService.A0M)) {
            Log.w("voip/callCapture/start fail");
        }
    }

    private void logCallExternalEvent(CallInfo callInfo) {
        AnonymousClass6YM r2;
        AnonymousClass3DQ A01;
        AnonymousClass3DQ r0;
        boolean z = callInfo.isCaller;
        CallState callState = callInfo.callState;
        if (!z ? callState == CallState.ACTIVE : callState == CallState.CALLING) {
            r2 = this.voiceService;
            A01 = r2.A1y.A01(1);
        } else if (callState == CallState.NONE && (r0 = this.voiceService.A02) != null) {
            r0.A00();
            r2 = this.voiceService;
            A01 = null;
        } else {
            return;
        }
        r2.A02 = A01;
    }

    public void NoSamplingRatesForAudioRecord() {
        Log.i("VoiceService EVENT:NoSamplingRatesForAudioRecord");
        AnonymousClass6YM r2 = this.voiceService;
        r2.A0R(23, r2.A22.getString(R.string.f12nameremoved));
    }

    public void audioDriverRestart() {
        Log.i("VoiceService EVENT:audioDriverRestart");
    }

    public void audioInitError() {
        Log.i("VoiceService EVENT:audioInitError");
        C36341k9.A0u(C90474aD.A0G(this).remove("audio_sampling_hash").remove("audio_sampling_rates"), "audio_native_sampling_rate");
        AnonymousClass6YM r2 = this.voiceService;
        r2.A0R(23, r2.A22.getString(R.string.f12nameremoved));
    }

    public void audioStreamStarted() {
        Log.i("VoiceService EVENT:audioStreamStarted");
    }

    public void audioTestReplayFinished() {
        throw C90524aI.A0Y("audioTestReplayFinished is a debug only method");
    }

    public void autoVideoPauseStateChanged() {
        C90474aD.A0x(this.voiceService.A0c, this, 55);
    }

    public void batteryLevelLow() {
        C90514aH.A0N(this, "VoiceService EVENT:batteryLevelLow").sendEmptyMessage(18);
    }

    public void callAcceptFailed() {
        C90464aC.A15(this, "VoiceService EVENT:callAcceptFailed");
    }

    public void callAcceptReceived() {
        Log.i("VoiceService EVENT:callAcceptReceived");
    }

    public void callAutoConnected(String str, String str2) {
        Message.obtain(C90514aH.A0N(this, "VoiceService EVENT:callAutoConnected"), 31, new C119435po(str, str2)).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
        if (r2.delete() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        if (r2.delete() != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        com.whatsapp.util.Log.i("app/VoiceService: time series log could not be deleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        r0 = r13.voiceService;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callEnding(com.whatsapp.voipcalling.CallLogInfo r14, int r15, java.lang.String r16) {
        /*
            r13 = this;
            java.lang.String r6 = "app/VoiceService: time series log could not be deleted"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService EVENT:callEnding result="
            r1.append(r0)
            if (r14 != 0) goto L_0x0055
            java.lang.String r0 = "null"
        L_0x000f:
            r1.append(r0)
            java.lang.String r0 = " rating interval="
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " time series dir= "
            r2 = r16
            X.C36321k7.A1Q(r0, r2, r1)
            X.6YM r0 = r13.voiceService
            java.lang.Integer r0 = r0.A3S
            if (r0 != 0) goto L_0x002f
            X.6YM r1 = r13.voiceService
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1.A3S = r0
        L_0x002f:
            X.6YM r0 = r13.voiceService
            r0.A3T = r2
            X.6YM r0 = r13.voiceService
            X.6XP r1 = r0.A2V
            java.lang.String r0 = "options.call_replayer_file_max_size"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r0 == 0) goto L_0x0049
            int r0 = r0.intValue()
            int r0 = r0 * 1024
            int r0 = r0 * 1024
            r1.A00 = r0
        L_0x0049:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 != 0) goto L_0x005c
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0055:
            int r0 = r14.callLogResultType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x000f
        L_0x005c:
            int r1 = r3.callResult
            r0 = 1
            if (r1 != r0) goto L_0x007a
            java.lang.String r0 = "options.wa_log_dummy_time_series"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A03(r0)
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.6YM r0 = r13.voiceService
            X.6XP r2 = r0.A2V
            X.0wU r1 = r2.A04
            r0 = 42
            X.C1501574e.A01(r1, r2, r0)
        L_0x007a:
            java.lang.String r0 = "options.wa_log_time_series"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A03(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0106
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0106
            X.6YM r0 = r13.voiceService
            X.0y0 r0 = r0.A1a
            r0.A08()
            X.6YM r0 = r13.voiceService
            android.content.Context r0 = r0.A22
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "wa_call_time_series.mtar.gz"
            java.io.File r2 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0106
            X.6YM r0 = r13.voiceService
            X.0wN r0 = r0.A26
            java.lang.String r5 = r0.A0A()
            X.1GE r7 = r13.httpsFormPostFactory     // Catch:{ IOException -> 0x00eb }
            java.lang.String r9 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r11 = 16
            r12 = 0
            r10 = r8
            X.6VO r4 = r7.A00(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x00eb }
            java.lang.String r1 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r4.A06(r1, r0)     // Catch:{ IOException -> 0x00eb }
            java.io.FileInputStream r1 = X.C90524aI.A0U(r2)     // Catch:{ IOException -> 0x00eb }
            java.lang.String r0 = "attachment"
            X.AnonymousClass6VO.A03(r4, r2, r1, r0)     // Catch:{ IOException -> 0x00eb }
            java.lang.String r0 = "from_jid"
            r4.A07(r0, r5)     // Catch:{ IOException -> 0x00eb }
            java.lang.String r1 = "tags"
            java.lang.String r0 = "voip_time_series"
            r4.A07(r1, r0)     // Catch:{ IOException -> 0x00eb }
            java.lang.String r1 = "android_hprof_extras"
            X.6YM r0 = r13.voiceService     // Catch:{ IOException -> 0x00eb }
            X.0wN r0 = r0.A26     // Catch:{ IOException -> 0x00eb }
            java.lang.String r0 = r0.A0B(r8)     // Catch:{ IOException -> 0x00eb }
            r4.A07(r1, r0)     // Catch:{ IOException -> 0x00eb }
            r4.A04(r8)     // Catch:{ IOException -> 0x00eb }
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0106
            goto L_0x0103
        L_0x00eb:
            r1 = move-exception
            java.lang.String r0 = "app/VoiceService: could not open time series log data"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00f2 }
            goto L_0x00fd
        L_0x00f2:
            r1 = move-exception
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x00fc
            com.whatsapp.util.Log.i((java.lang.String) r6)
        L_0x00fc:
            throw r1
        L_0x00fd:
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0106
        L_0x0103:
            com.whatsapp.util.Log.i((java.lang.String) r6)
        L_0x0106:
            X.6YM r0 = r13.voiceService
            r0.A0J()
            int r4 = r3.callSetupErrorType
            r0 = 17
            r2 = 6
            if (r4 != r0) goto L_0x012f
            boolean r0 = r3.isCaller
            if (r0 != 0) goto L_0x011c
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x012f
        L_0x011c:
            com.whatsapp.jid.UserJid r0 = X.C90494aF.A0M(r3)
            r13.showCallNotAllowedActivity((com.whatsapp.jid.UserJid) r0, (int) r2, (java.lang.String) r8)
        L_0x0123:
            X.6YM r0 = r13.voiceService
            X.6Ts r2 = r0.A2L
            X.0wk r1 = r2.A0A
            r0 = 28
            X.C1502474n.A00(r1, r2, r14, r3, r0)
            return
        L_0x012f:
            int r0 = r3.callResult
            if (r0 != r2) goto L_0x0123
            r0 = 18
            if (r4 == r0) goto L_0x013b
            r0 = 19
            if (r4 != r0) goto L_0x0123
        L_0x013b:
            X.6YM r0 = r13.voiceService
            X.7lV r2 = r0.A0t
            if (r2 == 0) goto L_0x0123
            android.content.Context r1 = r0.A22
            r0 = 2131895873(0x7f122641, float:1.9426591E38)
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            r2.A1h = r0
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callEnding(com.whatsapp.voipcalling.CallLogInfo, int, java.lang.String):void");
    }

    public void callGridRankingChanged() {
        this.voiceService.A0c.sendEmptyMessage(45);
    }

    public void callLinkStateChanged(int i, CallLinkInfo callLinkInfo) {
        if (callLinkInfo != null) {
            int i2 = callLinkInfo.linkState;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("VoiceService EVENT:callLinkStateChanged(");
            C90474aD.A1L(A0u, C110255aN.A00(i));
            Log.i(C36321k7.A0E(C110255aN.A00(i2), A0u));
            if (i == 3 && i2 == 4) {
                this.voiceService.A1L = true;
                updateSettingsFromVoipParamsAfterHandlingSignaling(callLinkInfo.videoEnabled);
                CallInfo callInfo = Voip.getCallInfo();
                C18740tg.A06(callInfo);
                AnonymousClass6Ts r2 = this.voiceService.A2L;
                C1502474n.A00(r2.A0A, r2, callInfo, callLinkInfo, 27);
            }
            Message obtain = Message.obtain(this.voiceService.A0c, 42, callLinkInfo);
            obtain.arg1 = i;
            obtain.sendToTarget();
        }
    }

    public void callOfferAcked() {
        Log.i("VoiceService EVENT:callOfferAcked");
        this.voiceService.A0b.removeMessages(2);
        AnonymousClass6YM r1 = this.voiceService;
        if (!r1.A0E) {
            r1.A0E = true;
            r1.A0c.sendEmptyMessage(56);
        }
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            updateSettingsFromVoipParamsAfterHandlingSignaling(callInfo.videoEnabled);
            if (Voip.A03("options.caller_end_call_threshold") != null) {
                this.voiceService.A13 = Voip.A04("options.caller_end_call_threshold");
            }
            CallState callState = callInfo.callState;
            if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
                Integer A04 = Voip.A04("options.caller_timeout");
                if (A04 != null) {
                    long intValue = (long) (A04.intValue() * 1000);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass6YM r9 = this.voiceService;
                    long j = intValue - (elapsedRealtime - r9.A0T);
                    if (j > 0 && j < 120000) {
                        r9.A0b.removeCallbacksAndMessages((Object) null);
                        this.voiceService.A0b.sendEmptyMessageDelayed(0, j);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("voip/receive_message/call-offer-ack change the caller timeout to ");
                        A0u.append(intValue);
                        C36321k7.A1V(", remaining ", A0u, j);
                    }
                }
                this.voiceService.A0d(callInfo.callState, callInfo.callId);
            }
        }
    }

    public void callOfferReceiptReceived() {
        Log.i("VoiceService EVENT:callOfferReceiptReceived");
    }

    public void callOfferReceived() {
        Log.i("VoiceService EVENT:callOfferReceived");
    }

    public void callOfferSent() {
        Log.i("VoiceService EVENT:callOfferSent");
    }

    public void callPreAcceptReceived() {
        Log.i("VoiceService EVENT:callPreAcceptReceived");
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.CallState r12, com.whatsapp.voipcalling.CallInfo r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L_0x00e4
            com.whatsapp.voipcalling.CallState r4 = r13.callState
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService EVENT:callStateChanged("
            r1.append(r0)
            r1.append(r12)
            X.C90504aG.A1M(r1)
            java.lang.String r0 = X.AnonymousClass000.A0m(r4, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == r12) goto L_0x00e4
            X.6YM r0 = r11.voiceService
            X.1HQ r0 = r0.A1m
            java.lang.String r2 = r13.callId
            r7 = 0
            X.C36331k8.A1I(r2, r4)
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            java.util.HashMap r0 = r0.A00
            if (r4 != r1) goto L_0x01d6
            r0.remove(r2)
        L_0x002f:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r4 != r0) goto L_0x0039
            X.6YM r0 = r11.voiceService
            boolean r0 = r0.A3U
            if (r0 == 0) goto L_0x0041
        L_0x0039:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 != r0) goto L_0x0046
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r12 != r0) goto L_0x0046
        L_0x0041:
            boolean r0 = r13.videoEnabled
            r11.updateSettingsFromVoipParamsAfterHandlingSignaling(r0)
        L_0x0046:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r4 == r0) goto L_0x0051
            X.6YM r1 = r11.voiceService
            java.lang.String r0 = r13.callId
            r1.A0d(r4, r0)
        L_0x0051:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            r5 = 4
            r3 = 0
            r2 = 0
            if (r4 == r0) goto L_0x01cd
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 == r0) goto L_0x01cd
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 == r0) goto L_0x01cd
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 == r0) goto L_0x01cd
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r4 == r0) goto L_0x01cd
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.BCALL_STARTING
            if (r4 == r0) goto L_0x01cd
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r4 == r0) goto L_0x019c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r4 == r0) goto L_0x019c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r4 != r0) goto L_0x0168
            X.6YM r0 = r11.voiceService
            android.os.Handler r0 = r0.A0b
            r0.removeCallbacksAndMessages(r2)
            X.6YM r8 = r11.voiceService
            boolean r6 = r13.isGroupCall
            r0 = 23000(0x59d8, double:1.13635E-319)
            if (r6 == 0) goto L_0x014a
            X.0yC r9 = r8.A2t
            r6 = 5170(0x1432, float:7.245E-42)
            int r7 = r9.A07(r6)
            r6 = 1
            if (r7 <= r6) goto L_0x014d
            r0 = 45000(0xafc8, double:2.2233E-319)
        L_0x0095:
            X.6YM r6 = r11.voiceService
            android.os.Handler r6 = r6.A0b
            r6.sendEmptyMessageDelayed(r5, r0)
            X.6YM r6 = r11.voiceService
            android.os.Handler r6 = r6.A0b
            r6.sendEmptyMessageDelayed(r3, r0)
        L_0x00a3:
            int r6 = r4.ordinal()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            switch(r6) {
                case 0: goto L_0x010a;
                case 1: goto L_0x00ac;
                case 2: goto L_0x010a;
                case 3: goto L_0x010a;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00e5;
                case 7: goto L_0x010a;
                case 8: goto L_0x00ac;
                case 9: goto L_0x00ac;
                case 10: goto L_0x00e5;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            X.6YM r0 = r11.voiceService
            android.os.Handler r1 = r0.A0c
            int r0 = r12.ordinal()
            android.os.Message r0 = android.os.Message.obtain(r1, r5, r0, r6, r13)
            r0.sendToTarget()
            X.6YM r0 = r11.voiceService
            X.0v5 r1 = r0.A1Z
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r2 = r1.A02()
            X.1ZY r2 = (X.AnonymousClass1ZY) r2
            X.1VC r0 = r2.A01
            X.0yf r1 = r0.A00
            X.0yi r0 = X.C21100yf.A0P
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00e1
            X.1VD r1 = r2.A02
            X.6vI r0 = new X.6vI
            r0.<init>(r12, r13)
            X.AnonymousClass1VD.A00(r0, r1)
        L_0x00e1:
            r11.logCallExternalEvent(r13)
        L_0x00e4:
            return
        L_0x00e5:
            X.6YM r2 = r11.voiceService
            r2.A0O = r0
            android.os.Handler r1 = r2.A0c
            r0 = 3
            X.C90474aD.A0x(r1, r11, r0)
            X.6YM r0 = r11.voiceService
            X.6zT r0 = r0.A2E
            r0.A0F(r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r12 == r0) goto L_0x0102
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r12 == r0) goto L_0x0102
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r12 != r0) goto L_0x00ac
        L_0x0102:
            com.whatsapp.jid.GroupJid r1 = r13.groupJid
            java.lang.String r0 = r13.scheduledId
            r11.setScheduledCallJoinTimeDiffMs(r1, r0)
            goto L_0x00ac
        L_0x010a:
            X.6YM r7 = r11.voiceService
            android.os.Handler r7 = r7.A0c
            r7.removeCallbacksAndMessages(r2)
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r12 == r2) goto L_0x0119
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r12 != r2) goto L_0x0124
        L_0x0119:
            X.6YM r2 = r11.voiceService
            r2.A0N = r0
            android.os.Handler r1 = r2.A0c
            r0 = 17
            r1.sendEmptyMessage(r0)
        L_0x0124:
            X.6YM r0 = r11.voiceService
            X.0yC r1 = r0.A2t
            r0 = 4778(0x12aa, float:6.695E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00ac
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r12 == r0) goto L_0x0138
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r12 != r0) goto L_0x00ac
        L_0x0138:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 != r0) goto L_0x00ac
            X.6YM r0 = r11.voiceService
            X.6zT r0 = r0.A2E
            r0.A0F(r3)
            java.lang.String r0 = "Device microphone unmute at call end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00ac
        L_0x014a:
            boolean r6 = r13.isGroupCall
            goto L_0x0161
        L_0x014d:
            com.whatsapp.jid.GroupJid r6 = r13.groupJid
            if (r6 != 0) goto L_0x014a
            r6 = 5170(0x1432, float:7.245E-42)
            int r6 = r9.A07(r6)
            if (r6 <= 0) goto L_0x014a
            java.lang.String r6 = r13.callId
            X.5yC r6 = r8.A0G(r6)
            boolean r6 = r6.A06
        L_0x0161:
            if (r6 != 0) goto L_0x0095
            r0 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x0095
        L_0x0168:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r4 == r0) goto L_0x017f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r4 == r0) goto L_0x017f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UNKNOWN call state "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)
            X.C18740tg.A0D(r7, r0)
            goto L_0x00a3
        L_0x017f:
            X.6YM r0 = r11.voiceService
            android.os.Handler r0 = r0.A0b
            r0.removeCallbacksAndMessages(r2)
            X.6YM r0 = r11.voiceService
            android.os.Handler r6 = r0.A0b
            r0 = 90000(0x15f90, double:4.4466E-319)
            r6.sendEmptyMessageDelayed(r7, r0)
            X.6YM r0 = r11.voiceService
            android.os.Handler r7 = r0.A0b
            r6 = 2
            r0 = 15000(0x3a98, double:7.411E-320)
            r7.sendEmptyMessageDelayed(r6, r0)
            goto L_0x00a3
        L_0x019c:
            X.6YM r7 = r11.voiceService
            boolean r6 = r13.isAudioChat()
            r0 = 30000(0x7530, double:1.4822E-319)
            if (r6 == 0) goto L_0x01bc
            X.0yC r7 = r7.A2t
            r6 = 6007(0x1777, float:8.418E-42)
            long r9 = X.C36441kJ.A0B(r7, r6)
            r7 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x01bc
            r7 = 90000(0x15f90, double:4.4466E-319)
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x01bc
            r0 = r9
        L_0x01bc:
            X.6YM r6 = r11.voiceService
            android.os.Handler r6 = r6.A0b
            r6.removeCallbacksAndMessages(r2)
            X.6YM r6 = r11.voiceService
            android.os.Handler r7 = r6.A0b
            r6 = 1
            r7.sendEmptyMessageDelayed(r6, r0)
            goto L_0x00a3
        L_0x01cd:
            X.6YM r0 = r11.voiceService
            android.os.Handler r0 = r0.A0b
            r0.removeCallbacksAndMessages(r2)
            goto L_0x00a3
        L_0x01d6:
            r0.put(r2, r4)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callStateChanged(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void callTerminateReceived() {
        Log.i("VoiceService EVENT:callTerminateReceived");
    }

    public void endCallWhenRelayBindFailed(CallInfo callInfo) {
        int i;
        int A03 = this.voiceService.A2a.A03(true);
        if (A03 == 0) {
            AnonymousClass6YM r2 = this.voiceService;
            r2.A0R(3, r2.A22.getString(R.string.f12nameremoved));
            return;
        }
        if (callInfo.isCaller || callInfo.callState == CallState.ACCEPT_SENT) {
            AnonymousClass6YM r1 = this.voiceService;
            boolean z = r1.A0I;
            Context context = r1.A22;
            if (z) {
                i = R.string.f12nameremoved;
                if (A03 == 1) {
                    i = R.string.f12nameremoved;
                }
            } else {
                i = R.string.f12nameremoved;
            }
            showCallNotAllowedActivity(C90494aF.A0M(callInfo), 5, context.getString(i));
        }
        this.voiceService.A0R(3, (String) null);
    }

    public void errorGatheringHostCandidates() {
        Log.i("VoiceService EVENT:errorGatheringHostCandidates");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0685  */
    public void fieldstatsReady(com.whatsapp.fieldstats.events.WamCall r27, java.lang.String r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r25 = r30
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService EVENT:fieldstatsReady lastReport: "
            r1.append(r0)
            r24 = r29
            r0 = r24
            r1.append(r0)
            java.lang.String r0 = ", realtime="
            r1.append(r0)
            r0 = r25
            r1.append(r0)
            java.lang.String r0 = ", callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            r7 = r26
            X.6YM r0 = r7.voiceService
            java.lang.Long r0 = r0.A17
            X.C36321k7.A1N(r0, r1)
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 != 0) goto L_0x0036
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0035:
            return
        L_0x0036:
            X.6YM r1 = r7.voiceService
            java.lang.String r0 = r6.callId
            X.5yC r10 = r1.A0G(r0)
            X.6YM r0 = r7.voiceService
            java.util.Set r0 = r0.A21
            r0.clear()
            X.6YM r0 = r7.voiceService
            X.0yb r0 = r0.A2g
            android.media.AudioManager r11 = r0.A0D()
            r3 = 0
            if (r11 != 0) goto L_0x0109
            r12 = r3
        L_0x0051:
            X.6YM r1 = r7.voiceService
            java.lang.String r0 = r6.callId
            X.4cX r1 = r1.A0H(r0)
            if (r1 == 0) goto L_0x0106
            boolean r0 = X.C19550w8.A01()
            if (r0 == 0) goto L_0x0106
            boolean r0 = r1.getAudioModeIsVoip()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService:fieldstatsReady audio mode: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", audioModeIsVoip: "
            X.C36321k7.A1K(r2, r0, r1)
            X.6YM r0 = r7.voiceService
            X.65J r9 = r0.A1l
            com.whatsapp.jid.UserJid r15 = X.C36431kI.A0l(r28)
            X.6YM r0 = r7.voiceService
            java.lang.Long r5 = r0.A17
            java.lang.Integer r4 = r0.A04
            java.lang.Integer r2 = r10.A02
            java.lang.String r1 = r0.A1B
            java.lang.String r0 = r0.A1A
            r8 = r27
            r13 = r9
            r14 = r8
            r16 = r4
            r17 = r12
            r18 = r2
            r19 = r5
            r20 = r1
            r21 = r0
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Integer r0 = r10.A03
            if (r0 == 0) goto L_0x00a7
            r8.incomingCallUiAction = r0
        L_0x00a7:
            boolean r0 = r10.A06
            r12 = 1
            if (r0 == 0) goto L_0x00b2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r8.isRering = r0
        L_0x00b2:
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x00bc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r8.doNotDisturbEnabled = r0
        L_0x00bc:
            X.6YM r2 = r7.voiceService
            X.6CH r4 = r2.A0n
            boolean r1 = r4.A01
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00c8
            r1 = r1 | 2
        L_0x00c8:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x00ce
            r1 = r1 | 4
        L_0x00ce:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00d4
            r1 = r1 | 8
        L_0x00d4:
            java.lang.Long r0 = X.C36441kJ.A0y(r1)
            r8.callNotificationState = r0
            java.lang.Long r0 = r2.A07
            if (r0 == 0) goto L_0x00e0
            r8.telecomFrameworkCallStartDelayT = r0
        L_0x00e0:
            java.lang.Long r0 = r2.A08
            if (r0 == 0) goto L_0x00e6
            r8.androidTelecomTimeSpentBeforeReject = r0
        L_0x00e6:
            r8.callHistEchoLikelihood = r3
            r7.updateHistoricalEcho(r8)
            X.6YM r2 = r7.voiceService
            java.lang.Integer r0 = r2.A14
            r8.endCallAfterConfirmation = r0
            java.lang.Integer r0 = r2.A16
            r8.presentEndCallConfirmation = r0
            java.lang.Integer r0 = r8.callAecMode
            r4 = 0
            if (r0 == 0) goto L_0x0122
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0139
            java.lang.Object r0 = r2.A0A
            if (r0 == 0) goto L_0x0120
            goto L_0x0113
        L_0x0106:
            r2 = r3
            goto L_0x0069
        L_0x0109:
            int r0 = r11.getMode()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x0051
        L_0x0113:
            android.media.audiofx.AcousticEchoCanceler r0 = (android.media.audiofx.AcousticEchoCanceler) r0     // Catch:{ all -> 0x011c }
            boolean r0 = r0.getEnabled()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0120
            goto L_0x0139
        L_0x011c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0120:
            r0 = 0
            goto L_0x013a
        L_0x0122:
            java.lang.Object r0 = r2.A0A
            if (r0 == 0) goto L_0x0140
            android.media.audiofx.AcousticEchoCanceler r0 = (android.media.audiofx.AcousticEchoCanceler) r0     // Catch:{ all -> 0x012d }
            boolean r0 = r0.getEnabled()     // Catch:{ all -> 0x012d }
            goto L_0x0132
        L_0x012d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0132:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.builtinAecEnabled = r0
            goto L_0x0140
        L_0x0139:
            r0 = 1
        L_0x013a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.builtinAecEnabled = r0
        L_0x0140:
            if (r11 == 0) goto L_0x0167
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "voip/AudioManager PROPERTY_OUTPUT_SAMPLE_RATE = "
            r1.append(r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r0 = r11.getProperty(r0)     // Catch:{ all -> 0x0163 }
            r1.append(r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = ", PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "
            r1.append(r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r0 = r11.getProperty(r0)     // Catch:{ all -> 0x0163 }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x0163 }
            goto L_0x0167
        L_0x0163:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0167:
            java.lang.Long r1 = r10.A04
            if (r1 == 0) goto L_0x017b
            X.6YM r0 = r7.voiceService
            boolean r0 = r0.A1S
            if (r0 == 0) goto L_0x017b
            long r0 = r1.longValue()
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r8.pushToCallOfferDelay = r0
        L_0x017b:
            boolean r0 = r6.isCaller
            if (r0 == 0) goto L_0x018f
            X.6YM r0 = r7.voiceService
            int r1 = r0.A3R
            r0 = 13
            if (r1 != r0) goto L_0x018f
            java.lang.Integer r0 = X.C36401kF.A0k()
            r8.callResult = r0
            r25 = 1
        L_0x018f:
            boolean r0 = r6.videoEnabled
            r1 = 2
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = android.os.Build.HARDWARE
            r8.deviceHardware = r0
            java.lang.String r0 = android.os.Build.BOARD
            r8.deviceBoard = r0
            X.6YM r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A39
            int r2 = r0.getCameraStartMode()
            r0 = -1
            if (r2 == r0) goto L_0x0262
            if (r2 == 0) goto L_0x025c
            if (r2 == r12) goto L_0x0256
            if (r2 == r1) goto L_0x0250
            java.lang.Integer r0 = X.C36421kH.A0U()
        L_0x01b1:
            r8.cameraStartMode = r0
        L_0x01b3:
            X.6YM r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A39
            boolean r0 = r0.isCameraTextureApiFailed()
            int r0 = X.C36371kC.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.cameraPreviewMode = r0
            X.6YM r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A39
            int r0 = r0.getCurrentApiVersion()
            if (r0 != r1) goto L_0x0241
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x01d3:
            r8.androidCameraApi = r0
        L_0x01d5:
            if (r29 == 0) goto L_0x03d0
            X.6YM r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A39
            int r0 = r0.getCachedCam2HardwareLevel()
            if (r0 < 0) goto L_0x01e7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.androidCamera2MinHardwareSupportLevel = r0
        L_0x01e7:
            r17 = 1
            r4 = 0
            if (r29 == 0) goto L_0x03d0
            X.6YM r1 = r7.voiceService
            int r0 = r1.A0P
            if (r0 <= 0) goto L_0x0272
            r1.A0K()
            X.6YM r1 = r7.voiceService
            int r0 = r1.A0P
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.groupCallVideoMaximizedCount = r0
            java.util.Map r0 = r1.A1C
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r0)
            r15 = 0
            r13 = 0
        L_0x020a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0266
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r3)
            java.lang.Object r0 = r2.getValue()
            long r0 = X.C36431kI.A09(r0)
            long r15 = r15 + r0
            X.6YM r0 = r7.voiceService
            X.0wQ r1 = r0.A29
            java.lang.Object r0 = r2.getKey()
            X.11F r0 = (X.AnonymousClass11F) r0
            boolean r1 = r1.A0M(r0)
            java.lang.Object r0 = r2.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r1 == 0) goto L_0x0236
            r8.groupCallVideoSelfMaximizedDuration = r0
            goto L_0x020a
        L_0x0236:
            long r1 = r0.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x020a
            long r13 = r13 + r17
            goto L_0x020a
        L_0x0241:
            X.6YM r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A39
            int r0 = r0.getCurrentApiVersion()
            if (r0 != r12) goto L_0x01d5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x01d3
        L_0x0250:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x01b1
        L_0x0256:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x01b1
        L_0x025c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01b1
        L_0x0262:
            r8.cameraStartMode = r3
            goto L_0x01b3
        L_0x0266:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r8.groupCallVideoMaximizedDuration = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r8.groupCallMaximizedPeerCount = r0
        L_0x0272:
            X.6YM r0 = r7.voiceService
            r0.A0O()
            X.6YM r9 = r7.voiceService
            long r0 = r9.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0285
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.androidSystemPictureInPictureT = r0
        L_0x0285:
            long r0 = r9.A0V
            r13 = -1
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x07e4
            long r0 = X.C36441kJ.A0A(r0)
            long r2 = r9.A0Y
            long r0 = r0 + r2
        L_0x0294:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x029e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.callMinimizedDurationT = r0
        L_0x029e:
            X.5tA r3 = r9.A0s
            if (r3 == 0) goto L_0x02b4
            boolean r0 = r6.isCaller
            if (r0 == 0) goto L_0x02b4
            long r0 = r3.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            long r0 = X.C90504aG.A0F(r3, r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.offerAckLatencyMs = r0
        L_0x02b4:
            X.5tA r3 = r9.A0o
            if (r3 == 0) goto L_0x02c6
            long r0 = r3.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            long r0 = X.C90504aG.A0F(r3, r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.acceptAckLatencyMs = r0
        L_0x02c6:
            java.lang.Long r0 = r9.A05
            if (r0 == 0) goto L_0x02cc
            r8.pytorchEdgeLibAvgLoadingTime = r0
        L_0x02cc:
            boolean r0 = r9.A0L
            if (r0 == 0) goto L_0x02da
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r0 = r7.whatsappDynamicPytorchLoader
            long r0 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.pytorchEdgeLibFirstLoadingTime = r0
        L_0x02da:
            boolean r0 = r6.isCaller
            if (r0 != 0) goto L_0x02f0
            long r2 = r10.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f0
            long r0 = r10.A01
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x02f0
            java.lang.Long r0 = X.C90504aG.A0h(r0, r2)
            r8.calleeOfferToRingT = r0
        L_0x02f0:
            java.lang.Integer r0 = r8.callResult
            if (r0 == 0) goto L_0x03d0
            int r1 = r0.intValue()
            if (r1 == r12) goto L_0x02fe
            r0 = 10
            if (r1 != r0) goto L_0x03d0
        L_0x02fe:
            X.0wo r0 = r9.A2h
            long r2 = X.C19970wo.A00(r0)
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r0)
            java.lang.String r9 = "previous_call_peer_id"
            java.lang.String r0 = X.C36371kC.A0t(r0, r9)
            com.whatsapp.jid.UserJid r13 = X.C36431kI.A0l(r0)
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r0)
            java.lang.String r10 = "previous_call_end_time"
            long r0 = r0.getLong(r10, r4)
            if (r13 == 0) goto L_0x0376
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0376
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0376
            X.6YM r4 = r7.voiceService
            X.1Pa r4 = r4.A2D
            android.content.SharedPreferences r5 = X.C27631Pa.A00(r4)
            java.lang.String r4 = "previous_call_video_enabled"
            boolean r4 = X.C36371kC.A1U(r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.previousCallVideoEnabled = r4
            com.whatsapp.jid.UserJid r4 = X.C90494aF.A0M(r6)
            boolean r4 = r13.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.previousCallWithSamePeer = r4
            java.lang.Long r4 = X.C90504aG.A0h(r2, r0)
            r8.previousCallInterval = r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService:fieldstatsReady previous call callInfo: interval "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", video enabled "
            r1.append(r0)
            java.lang.Boolean r0 = r8.previousCallVideoEnabled
            r1.append(r0)
            java.lang.String r0 = ", with same peer "
            r1.append(r0)
            java.lang.Boolean r0 = r8.previousCallWithSamePeer
            X.C36321k7.A1N(r0, r1)
        L_0x0376:
            java.lang.Integer r0 = r8.callResult
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x03d0
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            r16 = r0
            boolean r15 = r6.videoEnabled
            com.whatsapp.jid.UserJid r14 = X.C90494aF.A0M(r6)
            java.lang.String r13 = r6.tsLogCallId
            java.lang.String r5 = r6.relayCallUuid
            java.lang.String r4 = r6.selfParticipantUuid
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "setPreviousCallInfo callEndTime "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", video enabled "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", peerId "
            X.C36321k7.A1K(r14, r0, r1)
            android.content.SharedPreferences$Editor r0 = X.C90474aD.A0F(r16)
            android.content.SharedPreferences$Editor r1 = r0.putLong(r10, r2)
            java.lang.String r0 = "previous_call_video_enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r15)
            java.lang.String r0 = r14.getRawString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r9, r0)
            java.lang.String r0 = "previous_call_tslog_call_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r13)
            java.lang.String r0 = "previous_relay_call_uuid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r5)
            java.lang.String r0 = "previous_self_participant_uuid"
            X.C36341k9.A0x(r1, r0, r4)
        L_0x03d0:
            java.lang.Integer r0 = r8.callTermReason
            if (r0 == 0) goto L_0x03e1
            int r1 = r0.intValue()
            r0 = 10
            if (r1 != r0) goto L_0x03e1
            java.lang.String r0 = "VoiceService: call end because detect some peer's identity is changed!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x03e1:
            X.6YM r2 = r7.voiceService
            java.lang.Long r0 = r2.A09
            if (r0 == 0) goto L_0x03e9
            r8.wifiRssiAtCallStart = r0
        L_0x03e9:
            java.lang.String r1 = r6.callId
            X.1PY r0 = r2.A2I
            java.lang.String r2 = r0.A00(r1)
            r8.callRandomId = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService:fieldstatsReady callRandomId: "
            X.C36321k7.A1Q(r0, r2, r1)
            X.6YM r2 = r7.voiceService
            if (r29 != 0) goto L_0x0649
            X.6Mm r1 = r2.A2T
            r0 = r25
            r1.A01(r8, r0)
        L_0x0407:
            java.lang.Integer r0 = r8.fieldStatsRowType
            if (r0 == 0) goto L_0x05e2
            int r1 = r0.intValue()
            if (r1 == r12) goto L_0x0414
            r0 = 2
            if (r1 != r0) goto L_0x05e2
        L_0x0414:
            X.6YM r0 = r7.voiceService
            X.13J r0 = r0.A35
            boolean r0 = r0.BN6()
            if (r0 == 0) goto L_0x054e
            X.6YM r1 = r7.voiceService
            X.6Mm r0 = r1.A2T
            r20 = r0
            X.6Oa r5 = r1.A1j
            X.6Ea r11 = r5.A0K
            boolean r15 = r11.A01
            X.6Ea r10 = r5.A0N
            boolean r14 = r10.A01
            X.6Ea r9 = r5.A0J
            boolean r13 = r9.A01
            r11.A00()
            r9.A00()
            X.58p r4 = new X.58p
            r4.<init>()
            long r0 = r11.A00
            r18 = 0
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x044b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0A = r0
        L_0x044b:
            int r0 = r5.A05
            if (r0 <= 0) goto L_0x0455
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A08 = r0
        L_0x0455:
            long r0 = r9.A00
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0461
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A09 = r0
        L_0x0461:
            if (r29 == 0) goto L_0x052a
            long r0 = r5.A0C
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x046f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0D = r0
        L_0x046f:
            long r0 = r5.A0D
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x047b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0E = r0
        L_0x047b:
            long r2 = r5.A0A
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0492
            long r0 = r5.A0E
            int r16 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r16 <= 0) goto L_0x0492
            r16 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r16
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A03 = r0
        L_0x0492:
            long r0 = r5.A0B
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x049e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A04 = r0
        L_0x049e:
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x04ab
            int r1 = r5.A08
            X.5Td r0 = X.C108345Td.CALL_ENDED
            int r0 = r0.value
            r1 = r1 | r0
            r5.A08 = r1
        L_0x04ab:
            int r0 = r5.A08
            if (r0 <= 0) goto L_0x04b5
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A0C = r0
        L_0x04b5:
            long r0 = r5.A0F
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x04c1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0F = r0
        L_0x04c1:
            int r0 = r5.A02
            if (r0 <= 0) goto L_0x04cb
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A05 = r0
        L_0x04cb:
            int r0 = r5.A04
            if (r0 <= 0) goto L_0x04d5
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A06 = r0
        L_0x04d5:
            r10.A00()
            long r0 = r10.A00
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x04e4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0B = r0
        L_0x04e4:
            int r0 = r5.A06
            if (r0 <= 0) goto L_0x04ee
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A0H = r0
        L_0x04ee:
            int r0 = r5.A07
            if (r0 <= 0) goto L_0x04f8
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A0I = r0
        L_0x04f8:
            int r0 = r5.A09
            if (r0 <= 0) goto L_0x0502
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A0G = r0
        L_0x0502:
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x050c
            java.lang.Long r0 = X.C90474aD.A0Y()
            r4.A07 = r0
        L_0x050c:
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x0516
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A00 = r0
        L_0x0516:
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x0520
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A01 = r0
        L_0x0520:
            int r0 = r5.A03
            if (r0 <= 0) goto L_0x052a
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r4.A02 = r0
        L_0x052a:
            r0 = 0
            r5.A05 = r0
            r11.A01()
            r9.A01()
            if (r29 == 0) goto L_0x0538
            X.C131176Oa.A00(r5)
        L_0x0538:
            if (r15 == 0) goto L_0x053d
            r11.A02()
        L_0x053d:
            if (r14 == 0) goto L_0x0542
            r10.A02()
        L_0x0542:
            if (r13 == 0) goto L_0x0547
            r9.A02()
        L_0x0547:
            r0 = r20
            X.0yW r0 = r0.A00
            r0.Bly(r4)
        L_0x054e:
            X.6YM r0 = r7.voiceService
            X.0yC r1 = r0.A2t
            r0 = 3153(0xc51, float:4.418E-42)
            int r1 = r1.A07(r0)
            r0 = 4
            if (r1 < r0) goto L_0x05e2
            boolean r0 = r6.videoEnabled
            if (r0 == 0) goto L_0x05e2
            X.6EE r0 = r6.self
            boolean r2 = r0.A0K
            long r0 = X.C90474aD.A09(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeEnabled = r0
            if (r2 == 0) goto L_0x05e2
            X.6YM r0 = r7.voiceService
            X.5x3 r4 = r0.A1i
            X.6Ea r10 = r4.A03
            boolean r14 = r10.A01
            X.6Ea r9 = r4.A04
            boolean r13 = r9.A01
            X.6Ea r5 = r4.A05
            boolean r11 = r5.A01
            r10.A00()
            r9.A00()
            r5.A00()
            long r0 = r4.A02
            r2 = 0
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0596
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeSwitchCount = r0
        L_0x0596:
            long r0 = r4.A01
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x05a2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeLockedSwitchCount = r0
        L_0x05a2:
            long r0 = r10.A00
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x05ae
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeDurationT = r0
        L_0x05ae:
            long r0 = r9.A00
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x05ba
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeLockedDurationT = r0
        L_0x05ba:
            long r0 = r5.A00
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x05c6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModePipMixedDurationT = r0
        L_0x05c6:
            r4.A02 = r2
            r4.A01 = r2
            r10.A01()
            r9.A01()
            r5.A01()
            if (r14 == 0) goto L_0x05d8
            r10.A02()
        L_0x05d8:
            if (r13 == 0) goto L_0x05dd
            r9.A02()
        L_0x05dd:
            if (r11 == 0) goto L_0x05e2
            r5.A02()
        L_0x05e2:
            java.lang.Integer r0 = r8.fieldStatsRowType
            if (r0 == 0) goto L_0x060b
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x060b
            com.whatsapp.jid.GroupJid r1 = r6.groupJid
            if (r1 == 0) goto L_0x060b
            boolean r0 = r6.isPhashBasedCall()
            if (r0 == 0) goto L_0x060b
            X.6YM r0 = r7.voiceService
            X.0xQ r0 = r0.A1w
            X.17X r0 = r0.A0U
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r1)
            if (r0 <= 0) goto L_0x0643
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.numInvitedParticipants = r0
        L_0x060b:
            boolean r0 = r6.isCaller
            if (r0 != 0) goto L_0x0635
            X.6YM r0 = r7.voiceService
            X.1DM r1 = r0.A2c
            com.whatsapp.jid.UserJid r0 = r6.getPeerJid()
            boolean r0 = r1.A0C(r0)
            java.lang.Boolean r0 = X.C36441kJ.A0x(r0)
            r8.privacyUnknownCaller = r0
            com.whatsapp.jid.GroupJid r1 = r6.groupJid
            if (r1 == 0) goto L_0x0635
            X.6YM r0 = r7.voiceService
            X.1C6 r0 = r0.A34
            int r0 = X.AnonymousClass1C6.A00(r1, r0)
            if (r0 != r12) goto L_0x0635
            java.lang.Boolean r0 = X.C36381kD.A0j()
            r8.privacyUnknownCaller = r0
        L_0x0635:
            X.6YM r1 = r7.voiceService
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x0035
            android.content.Context r0 = r1.A22
            r8.canUseFullScreenIntent = java.lang.Boolean.valueOf(((android.app.NotificationManager) r0.getSystemService("notification")).canUseFullScreenIntent())
            return
        L_0x0643:
            java.lang.String r0 = "VoiceService:fieldstatsReady groupMembersCount error"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x060b
        L_0x0649:
            java.lang.Boolean r1 = r2.A12
            if (r1 == 0) goto L_0x0653
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x06be
        L_0x0653:
            if (r11 == 0) goto L_0x06be
            boolean r0 = r2.A0n(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A12 = r0
        L_0x065f:
            X.6YM r1 = r7.voiceService
            boolean r0 = r1.A1M
            if (r0 == 0) goto L_0x06b5
            r0 = 18
        L_0x0667:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.callTermReason = r0
        L_0x066d:
            if (r11 == 0) goto L_0x067f
            boolean r0 = r6.isSelfCallOnHold()
            if (r0 != 0) goto L_0x067f
            boolean r0 = r11.isMicrophoneMute()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.isOsMicrophoneMute = r0
        L_0x067f:
            X.6YM r2 = r7.voiceService
            int r0 = r2.A0R
            if (r0 != 0) goto L_0x068a
            boolean r1 = r2.A0G
            r0 = 0
            if (r1 == 0) goto L_0x068b
        L_0x068a:
            r0 = 1
        L_0x068b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.pstnCallExists = r0
            X.5uj r0 = r2.A1d
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.connectedToCar = r0
            X.3Db r0 = r2.A1e
            X.0yC r1 = r0.A00
            r0 = 1756(0x6dc, float:2.46E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x079d
            r0 = 3359(0xd1f, float:4.707E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x079d
            X.6YM r0 = r7.voiceService
            X.6WJ r4 = r0.A1f
            monitor-enter(r4)
            goto L_0x06c1
        L_0x06b5:
            int r1 = r1.A3R
            r0 = 31
            if (r1 != r0) goto L_0x066d
            r0 = 21
            goto L_0x0667
        L_0x06be:
            r8.androidAudioRouteMismatch = r1
            goto L_0x065f
        L_0x06c1:
            X.58r r0 = r4.A01     // Catch:{ all -> 0x07e8 }
            if (r0 == 0) goto L_0x06ca
            r1 = 0
            r0 = 2
            X.AnonymousClass6WJ.A01(r4, r1, r0)     // Catch:{ all -> 0x07e8 }
        L_0x06ca:
            long r0 = r4.A00     // Catch:{ all -> 0x07e8 }
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x06d8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x07e8 }
            r8.switchToAvatarDisplayedCount = r0     // Catch:{ all -> 0x07e8 }
        L_0x06d8:
            java.util.List r5 = r4.A03     // Catch:{ all -> 0x07e8 }
            boolean r0 = X.C36401kF.A1a(r5)     // Catch:{ all -> 0x07e8 }
            if (r0 == 0) goto L_0x06e6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x07e8 }
            r8.avatarAttempted = r0     // Catch:{ all -> 0x07e8 }
        L_0x06e6:
            r22 = 0
            r20 = 0
            r18 = 0
            r16 = 0
            r14 = 0
            java.util.Iterator r13 = r5.iterator()     // Catch:{ all -> 0x07e8 }
        L_0x06f4:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x07e8 }
            if (r0 == 0) goto L_0x072e
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x07e8 }
            X.58r r11 = (X.C1042058r) r11     // Catch:{ all -> 0x07e8 }
            java.lang.Integer r0 = r11.A03     // Catch:{ all -> 0x07e8 }
            r9 = 1
            if (r0 == 0) goto L_0x06f4
            int r1 = r0.intValue()     // Catch:{ all -> 0x07e8 }
            if (r1 != r12) goto L_0x0722
            long r22 = r22 + r9
            java.lang.Long r0 = r11.A0G     // Catch:{ all -> 0x07e8 }
            if (r0 == 0) goto L_0x0718
            long r0 = r0.longValue()     // Catch:{ all -> 0x07e8 }
            long r16 = r16 + r0
        L_0x0718:
            java.lang.Long r0 = r11.A08     // Catch:{ all -> 0x07e8 }
            if (r0 == 0) goto L_0x06f4
            long r0 = r0.longValue()     // Catch:{ all -> 0x07e8 }
            long r14 = r14 + r0
            goto L_0x06f4
        L_0x0722:
            r0 = 3
            if (r1 != r0) goto L_0x0728
            long r20 = r20 + r9
            goto L_0x06f4
        L_0x0728:
            r0 = 2
            if (r1 != r0) goto L_0x06f4
            long r18 = r18 + r9
            goto L_0x06f4
        L_0x072e:
            int r0 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x073e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x07e8 }
            r8.avatarEnabled = r0     // Catch:{ all -> 0x07e8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x07e8 }
            r8.avatarEnabledCount = r0     // Catch:{ all -> 0x07e8 }
        L_0x073e:
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x074e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x07e8 }
            r8.avatarFailed = r0     // Catch:{ all -> 0x07e8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x07e8 }
            r8.avatarFailedCount = r0     // Catch:{ all -> 0x07e8 }
        L_0x074e:
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x075e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x07e8 }
            r8.avatarCanceled = r0     // Catch:{ all -> 0x07e8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x07e8 }
            r8.avatarCanceledCount = r0     // Catch:{ all -> 0x07e8 }
        L_0x075e:
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0768
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x07e8 }
            r8.avatarLoadingT = r0     // Catch:{ all -> 0x07e8 }
        L_0x0768:
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0772
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x07e8 }
            r8.avatarDurationT = r0     // Catch:{ all -> 0x07e8 }
        L_0x0772:
            java.util.List r1 = X.C007103b.A0Y(r5)     // Catch:{ all -> 0x07e8 }
            r4.A00 = r2     // Catch:{ all -> 0x07e8 }
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x07e8 }
            r5.clear()     // Catch:{ all -> 0x07e8 }
            monitor-exit(r4)
            X.6YM r0 = r7.voiceService
            X.6Mm r4 = r0.A2T
            java.lang.String r3 = r8.callRandomId
            java.util.Iterator r2 = r1.iterator()
        L_0x0789:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x079d
            java.lang.Object r1 = r2.next()
            X.58r r1 = (X.C1042058r) r1
            r1.A0H = r3
            X.0yW r0 = r4.A00
            r0.Blw(r1)
            goto L_0x0789
        L_0x079d:
            X.6YM r1 = r7.voiceService
            java.lang.Long r0 = r1.A06
            r8.scheduledCallJoinTimeDiffMs = r0
            r1.A0x = r8
            r0 = r25
            r1.A1V = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService:fieldstatsReady call ending. callFieldStat will be posted when call/link state change to None. callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            java.lang.Long r0 = r8.callOfferElapsedT
            X.C36321k7.A1N(r0, r1)
            java.lang.Integer r0 = r8.callFromUi
            if (r0 == 0) goto L_0x0407
            int r1 = r0.intValue()
            r0 = 45
            if (r1 == r0) goto L_0x07e2
            r0 = 46
            if (r1 != r0) goto L_0x0407
            r3 = 8
        L_0x07c9:
            java.lang.String r2 = r8.callRandomId
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r8.videoEnabled
            boolean r0 = r1.equals(r0)
            X.2Qk r1 = X.AnonymousClass3UD.A03(r2, r3, r0, r12)
            X.6YM r0 = r7.voiceService
            X.6Mm r0 = r0.A2T
            X.0yW r0 = r0.A00
            r0.Bly(r1)
            goto L_0x0407
        L_0x07e2:
            r3 = 7
            goto L_0x07c9
        L_0x07e4:
            long r0 = r9.A0Y
            goto L_0x0294
        L_0x07e8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.fieldstatsReady(com.whatsapp.fieldstats.events.WamCall, java.lang.String, boolean, boolean):void");
    }

    public byte[] getByteBuffer(int i) {
        byte[] bArr;
        C120285rG r3 = this.bufferQueue;
        synchronized (r3) {
            Iterator it = r3.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r3.A00 += i;
                    bArr = new byte[i];
                    break;
                }
                bArr = (byte[]) it.next();
                if (bArr.length >= i) {
                    it.remove();
                    break;
                }
            }
        }
        return bArr;
    }

    public void groupCallBufferHandleMessages() {
        Log.i("VoiceService EVENT:groupCallBufferProcessMessages");
        this.voiceService.A1E.execute(AnonymousClass74Z.A00);
    }

    public void groupInfoChanged() {
        boolean z;
        Log.i("VoiceService EVENT:groupInfoChanged");
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            z = false;
        } else if (callInfo.callState == CallState.NONE) {
            z = true;
        } else {
            AnonymousClass6Ts r3 = this.voiceService.A2L;
            r3.A0A.execute(new C1501974i(r3, callInfo, 3));
            C90474aD.A0x(this.voiceService.A0c, this, 25);
            return;
        }
        C18740tg.A0D(z, " CallInfo should not be null in groupInfoChanged callback");
    }

    public void handleAcceptFailed() {
        C90464aC.A15(this, "VoiceService EVENT:handleAcceptFailed");
    }

    public void handleCallLinkLobbyError(int i) {
        Message obtainMessage = this.voiceService.A0c.obtainMessage(44);
        obtainMessage.arg1 = i;
        obtainMessage.sendToTarget();
    }

    public void handleFDLeakDetected() {
        Log.i("VoiceService EVENT:handleFDLeakDetected");
    }

    public void handleOfferAckFailed() {
        C90464aC.A15(this, "VoiceService EVENT:handleOfferAckFailed");
    }

    public void handlePreAcceptFailed() {
        C90464aC.A15(this, "VoiceService EVENT:handlePreAcceptFailed");
    }

    public void highDataUsageDetected() {
        C90514aH.A1I(C90514aH.A0N(this, "VoiceService EVENT:highDataUsageDetected"), 54);
    }

    public void interruptionStateChanged() {
        C90514aH.A0N(this, "VoiceService EVENT:interruptionStateChanged").removeMessages(30);
        C90514aH.A1I(this.voiceService.A0c, 30);
        C132636Up.A00(this.voiceService.A2R, "refresh_notification");
    }

    public void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z) {
        CallInfo A03 = C34681hT.A03(this.voiceService.A2C);
        if (A03 == null) {
            Log.e("VoiceService:joinableFieldstatsReady not in an active call");
            return;
        }
        C124445yC A0G = this.voiceService.A0G(A03.callId);
        AnonymousClass6YM r0 = this.voiceService;
        String A00 = r0.A2I.A00(A03.callId);
        wamJoinableCall.callRandomId = A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:joinableFieldstatsReady callId:");
        A0u.append(A03.callId);
        A0u.append(" callRandomId:");
        A0u.append(A00);
        A0u.append(" callSide:");
        A0u.append(wamJoinableCall.callSide);
        C36321k7.A1X(" realtime:", A0u, z);
        AnonymousClass6YM r6 = this.voiceService;
        int i = r6.A15;
        boolean z2 = false;
        if (i == null) {
            if (r6.A0U == 0) {
                i = C36371kC.A0p();
                r6.A15 = i;
            } else {
                C18740tg.A0D(false, "Bug with tracking call lobby");
                i = 0;
                this.voiceService.A15 = 0;
            }
        }
        wamJoinableCall.lobbyEntryPoint = i;
        if (C1901797e.A00(wamJoinableCall.lobbyExit, C36401kF.A0j())) {
            this.voiceService.A15 = 20;
        }
        AnonymousClass6YM r62 = this.voiceService;
        long j = r62.A0U;
        if (j > 0) {
            wamJoinableCall.lobbyVisibleT = Long.valueOf(C36441kJ.A0A(j));
        }
        if (r62.A0F) {
            wamJoinableCall.hasSpamDialog = true;
        }
        if (A0G.A06) {
            wamJoinableCall.isRering = true;
        }
        Boolean bool = wamJoinableCall.isRejoin;
        if (bool != null && bool.booleanValue()) {
            C121455tA r7 = r62.A0r;
            if (r7 != null) {
                long j2 = r7.A00;
                wamJoinableCall.lobbyAckLatencyMs = Long.valueOf(C90504aG.A0F(r7, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
            C121455tA r72 = r62.A0o;
            if (r72 != null) {
                long j3 = r72.A00;
                wamJoinableCall.acceptAckLatencyMs = Long.valueOf(C90504aG.A0F(r72, (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j3));
            }
            long j4 = C27631Pa.A00(r62.A2D).getLong("zombie_cleanup", 0);
            if (!(wamJoinableCall.lobbyExitNackCode == null || j4 == 0)) {
                wamJoinableCall.timeSinceLastClientPollMinutes = Long.valueOf(C36391kE.A0B(C36441kJ.A0A(j4)) / 60);
            }
        }
        if (Build.VERSION.SDK_INT < 31 || this.voiceService.A1q.A00.A00()) {
            z2 = true;
        }
        wamJoinableCall.hasScheduleExactAlarmPermission = Boolean.valueOf(z2);
        Boolean bool2 = wamJoinableCall.isLinkJoin;
        if (bool2 != null && bool2.booleanValue()) {
            AnonymousClass6YM r63 = this.voiceService;
            C121455tA r5 = r63.A0q;
            if (r5 != null) {
                long j5 = r5.A00;
                wamJoinableCall.queryAckLatencyMs = Long.valueOf(C90504aG.A0F(r5, (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1)), j5));
            }
            C121455tA r52 = r63.A0p;
            if (r52 != null) {
                long j6 = r52.A00;
                wamJoinableCall.joinAckLatencyMs = Long.valueOf(C90504aG.A0F(r52, (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1)), j6));
            }
        }
        C21010yW r02 = this.voiceService.A2T.A00;
        r02.Blw(wamJoinableCall);
        if (z) {
            r02.BP7();
        }
    }

    /* renamed from: lambda$lidCallerDisplayInfo$4$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m10lambda$lidCallerDisplayInfo$4$comwhatsappcallingserviceVoiceServiceEventCallback(Map map) {
        this.voiceService.A2r.A0D(map);
    }

    /* renamed from: lambda$linkCreateAcked$0$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m11lambda$linkCreateAcked$0$comwhatsappcallingserviceVoiceServiceEventCallback(String str, boolean z) {
        Iterator A0s = C36361kB.A0s(this.voiceService.A1g);
        while (A0s.hasNext()) {
            for (C88444Ss BZh : ((AnonymousClass36B) A0s.next()).A02) {
                BZh.BZh(str, z);
            }
        }
    }

    /* renamed from: lambda$rejectedDecryptionFailure$3$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m12lambda$rejectedDecryptionFailure$3$comwhatsappcallingserviceVoiceServiceEventCallback(DeviceJid deviceJid, String str, byte[] bArr, int i) {
        this.voiceService.A2U.A04(deviceJid, C34681hT.A09(str), bArr, i);
    }

    /* renamed from: lambda$setScheduledCallJoinTimeDiffMs$6$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m13lambda$setScheduledCallJoinTimeDiffMs$6$comwhatsappcallingserviceVoiceServiceEventCallback(long j, AnonymousClass3KV r6) {
        this.voiceService.A06 = C90504aG.A0h(j, r6.A03);
    }

    /* renamed from: lambda$setScheduledCallJoinTimeDiffMs$7$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m14lambda$setScheduledCallJoinTimeDiffMs$7$comwhatsappcallingserviceVoiceServiceEventCallback(String str, GroupJid groupJid, long j) {
        AnonymousClass3KV A02 = this.voiceService.A2q.A02(groupJid, str);
        if (A02 != null) {
            this.voiceService.A28.A0H(new AnonymousClass735(this, A02, 2, j));
        }
    }

    /* renamed from: lambda$showCallNotAllowedActivity$8$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m15lambda$showCallNotAllowedActivity$8$comwhatsappcallingserviceVoiceServiceEventCallback(ArrayList arrayList, int i, String str) {
        AnonymousClass6YM r1 = this.voiceService;
        r1.A1R = true;
        Intent className = C36431kI.A0D().setClassName(r1.A22.getPackageName(), "com.whatsapp.calling.VoipNotAllowedActivity");
        className.putStringArrayListExtra("jids", AnonymousClass143.A07(arrayList));
        className.putExtra("reason", i);
        if (str != null) {
            className.putExtra("message", str);
        }
        className.setFlags(268435456);
        this.voiceService.A22.startActivity(className);
    }

    public void lobbyTimeout() {
        Log.i("VoiceService EVENT:lobbyTimeout");
        CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState == CallState.REJOINING || currentCallState == CallState.PRECALLING) {
            this.voiceService.A0R(28, (String) null);
        } else if (this.voiceService.A2Y.A01()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            C18740tg.A06(callLinkInfo);
            int i = callLinkInfo.linkState;
            if (i == 1 || i == 2) {
                handleCallLinkLobbyError(21);
            }
        }
    }

    public void mediaStreamError() {
        C90464aC.A15(this, "VoiceService EVENT:mediaStreamError");
    }

    public void mediaStreamStartError() {
        C90464aC.A15(this, "VoiceService EVENT:mediaStreamStartError");
    }

    public void missingRelayInfo() {
        Log.i("VoiceService EVENT:missingRelayInfo");
    }

    public void muteRequestFailed(UserJid userJid) {
        C90514aH.A0N(this, "VoiceService EVENT:muteRequestFailed").removeMessages(43);
        Message message = new Message();
        message.what = 43;
        message.obj = userJid;
        this.voiceService.A0c.sendMessage(message);
    }

    public void muteStateChanged() {
        C90474aD.A0x(C90514aH.A0N(this, "VoiceService EVENT:muteStateChanged"), this, 32);
        C19460v5 r1 = this.voiceService.A1Z;
        if (r1.A05()) {
            AnonymousClass1ZY r2 = (AnonymousClass1ZY) r1.A02();
            if (r2.A01.A00.A09(C21100yf.A0P)) {
                AnonymousClass1VD.A00(C146276vL.A00, r2.A02);
            }
        }
    }

    public void mutedByOthers(UserJid userJid) {
        C90514aH.A0N(this, "VoiceService EVENT:mutedByOthers").removeMessages(41);
        Message message = new Message();
        message.what = 41;
        message.obj = userJid;
        this.voiceService.A0c.sendMessage(message);
    }

    public void offerPeekTimeout() {
        Log.i("VoiceService EVENT:offerPeekTimeout");
        AnonymousClass6YM r0 = this.voiceService;
        r0.A0c.obtainMessage(49, 32, 0, r0.A22.getString(R.string.f12nameremoved)).sendToTarget();
    }

    public void p2pNegotaitionFailed() {
        Log.i("VoiceService EVENT:p2pNegotaitionFailed");
    }

    public void p2pNegotiationSuccess() {
        Log.i("VoiceService EVENT:p2pNegotiationSuccess");
    }

    public void p2pTransportCreateFailed() {
        C90464aC.A15(this, "VoiceService EVENT:p2pTransportCreateFailed");
    }

    public void p2pTransportRestartSuccess() {
        Log.i("VoiceService EVENT:p2pTransportRestartSuccess");
    }

    public void p2pTransportStartFailed() {
        C90464aC.A15(this, "VoiceService EVENT:p2pTransportStartFailed");
    }

    public void relayCreateSuccess() {
        Log.i("VoiceService EVENT:relayCreateSuccess");
    }

    public void relayLatencySendFailed() {
        Log.i("VoiceService EVENT:relayLatencySendFailed");
    }

    public void removeUserFailed(UserJid userJid) {
        Log.i("VoiceService EVENT:removeUserAckedOrNacked");
        this.voiceService.A1D.remove(userJid);
        Message.obtain(this.voiceService.A0c, 47, userJid).sendToTarget();
    }

    public void restartCamera() {
        Log.i("VoiceService EVENT:restartCamera");
        C160737lV r0 = this.voiceService.A0t;
        if (r0 != null) {
            ((VoipActivityV2) r0).A0x.A05();
        }
    }

    public void rtcpByeReceived() {
        Log.i("VoiceService EVENT:rtcpByeReceived");
        this.voiceService.A0R(18, (String) null);
    }

    public void rxTimeout() {
        Log.i("VoiceService EVENT:rxTimeout");
        this.voiceService.A0R(5, (String) null);
    }

    public void rxTrafficStarted() {
        Log.i("VoiceService EVENT:rxTrafficStarted");
    }

    public void rxTrafficStateForPeerChanged() {
        C90474aD.A0x(C90514aH.A0N(this, "VoiceService EVENT:rxTrafficStateForPeerChanged"), this, 33);
    }

    public void rxTrafficStopped() {
        boolean isPowerSaveMode;
        boolean z = this.voiceService.A25.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:rxTrafficStopped.  powerSavingMode: ");
        PowerManager A0G = this.voiceService.A2g.A0G();
        if (A0G == null) {
            Log.w("voip/service/start pm=null");
            isPowerSaveMode = false;
        } else {
            isPowerSaveMode = A0G.isPowerSaveMode();
        }
        A0u.append(isPowerSaveMode);
        A0u.append(", isAppInForeground: ");
        A0u.append(z);
        A0u.append(", screenLocked: ");
        C36331k8.A1S(A0u, this.voiceService.A0K);
    }

    public void sendAcceptFailed() {
        Log.i("VoiceService EVENT:sendAcceptFailed");
        this.voiceService.A2P.A06();
    }

    public void sendOfferFailed() {
        Log.i("VoiceService EVENT:sendOfferFailed");
    }

    public void showLonelyStateNotification(CallInfo callInfo, int i) {
        AnonymousClass6YM r0 = this.voiceService;
        r0.A2i.A07(callInfo.callId, 51, r0.A2J.A06(r0.A22, AnonymousClass3OE.A00(callInfo, i, r0.A1P), this.voiceService.A2R, 1, false));
    }

    public void soundPortCreateFailed() {
        C90464aC.A15(this, "VoiceService EVENT:soundPortCreateFailed");
    }

    public void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr) {
        Log.i("VoiceService EVENT:syncDevices");
        ArrayList A0I = AnonymousClass001.A0I();
        for (SyncDevicesUserInfo syncDevicesUserInfo : syncDevicesUserInfoArr) {
            if (!this.voiceService.A1u.A0I(syncDevicesUserInfo.jid, syncDevicesUserInfo.phash)) {
                A0I.add(syncDevicesUserInfo.jid);
            }
        }
        if (!A0I.isEmpty()) {
            this.voiceService.A1p.A01((UserJid[]) A0I.toArray(new UserJid[0]), 4);
        }
    }

    public void transportCandSendFailed() {
        Log.i("VoiceService EVENT:transportCandSendFailed");
    }

    public void txTimeout() {
        Log.i("VoiceService EVENT:txTimeout");
        this.voiceService.A0R(6, (String) null);
    }

    public void updateHistoricalEcho(WamCall wamCall) {
        Long l;
        float f;
        if (wamCall != null && wamCall.callAecMode != null && wamCall.callEchoLikelihoodBeforeEc != null && (l = wamCall.callT) != null && l.intValue() >= 10000) {
            float f2 = C27631Pa.A00(this.voiceService.A2D).getFloat("pref_hist_echo", -1.0f);
            float floatValue = wamCall.callEchoLikelihoodBeforeEc.floatValue();
            if (floatValue < 0.0f || floatValue > 100.0f) {
                Log.e(C90484aE.A0o("voip/updateHistoricalEcho wrong new Echo: ", AnonymousClass000.A0u(), floatValue));
                return;
            }
            int intValue = wamCall.callAecMode.intValue();
            boolean z = true;
            if (intValue == 1 || intValue == 2) {
                if (f2 < 0.0f) {
                    f = floatValue;
                } else {
                    f = (f2 * 0.5f) + (0.5f * floatValue);
                }
                if (f < 0.0f || f > 100.0f) {
                    z = false;
                }
                C18740tg.A0D(z, "echo should be in the range of 0 to 100");
                C90474aD.A0G(this).putFloat("pref_hist_echo", f).apply();
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voip/updateHistoricalEcho histEcho: ");
                A0u.append(f2);
                A0u.append(", newEcho: ");
                A0u.append(floatValue);
                A0u.append(", updated: ");
                A0u.append(f);
                C36411kG.A1P(A0u);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateSettingsFromVoipParamsAfterHandlingSignaling(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = "test.name"
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.A06(r0)
            if (r3 == 0) goto L_0x0022
            X.6YM r0 = r7.voiceService
            X.1Hq r2 = r0.A1v
            X.0v0 r0 = r2.A05
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "voip_call_ab_test_bucket"
            X.C36341k9.A0x(r1, r0, r3)
            X.0yN r0 = r2.A08
            X.AnonymousClass1M3.A01(r0, r3)
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A0F = r0
        L_0x0022:
            java.lang.String r0 = "options.spam_call_threshold_seconds"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r0 == 0) goto L_0x002d
            r0.intValue()
        L_0x002d:
            X.6YM r1 = r7.voiceService
            java.lang.String r0 = "options.android_audio_mode_in_call"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            r1.A03 = r0
            java.lang.String r0 = "options.audio_level_adjust"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r0 == 0) goto L_0x0047
            X.6YM r1 = r7.voiceService
            int r0 = r0.intValue()
            r1.A0S = r0
        L_0x0047:
            X.6YM r0 = r7.voiceService
            X.0yC r1 = r0.A2t
            r0 = 5527(0x1597, float:7.745E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x005c
            X.6YM r0 = r7.voiceService
            X.62m r1 = r0.A2H
            X.5TG r0 = X.AnonymousClass5TG.OPUS_MLOW
            r1.A00(r0)
        L_0x005c:
            X.6YM r0 = r7.voiceService
            X.0yC r1 = r0.A2t
            r0 = 5989(0x1765, float:8.392E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0071
            X.6YM r0 = r7.voiceService
            X.62m r1 = r0.A2H
            X.5TG r0 = X.AnonymousClass5TG.AOM
            r1.A00(r0)
        L_0x0071:
            java.lang.String r0 = "vid_rc.cc_enable_ml_plc_inference"
            java.lang.Integer r6 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_rc.cc_enable_ml_undershoot_inference"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_rc.enable_ptedge_lib_loading"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_rc.cc_ml_pytorch_load_mode"
            java.lang.Integer r5 = com.whatsapp.voipcalling.Voip.A04(r0)
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0093
            int r0 = r1.intValue()
            if (r0 == r3) goto L_0x00a3
        L_0x0093:
            if (r6 == 0) goto L_0x009b
            int r0 = r6.intValue()
            if (r0 == r3) goto L_0x00a3
        L_0x009b:
            if (r2 == 0) goto L_0x00d3
            int r0 = r2.intValue()
            if (r0 != r3) goto L_0x00d3
        L_0x00a3:
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r2 = r7.whatsappDynamicPytorchLoader
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x00c1
            X.6YM r1 = r7.voiceService
            r1.A0L = r3
            if (r5 == 0) goto L_0x0274
            int r0 = r5.intValue()
            if (r0 == 0) goto L_0x0274
            if (r0 != r3) goto L_0x00c1
            X.0wU r1 = r1.A36
            java.util.Objects.requireNonNull(r2)
            r0 = 39
            X.C1501574e.A01(r1, r2, r0)
        L_0x00c1:
            X.6YM r2 = r7.voiceService
            java.lang.Long r0 = r2.A05
            if (r0 != 0) goto L_0x00d3
            if (r4 == 0) goto L_0x0270
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r0 = r7.whatsappDynamicPytorchLoader
            long r0 = r0.A00
        L_0x00cd:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
        L_0x00d3:
            java.lang.String r0 = "vid_driver.camera_width"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.camera_height"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r2 == 0) goto L_0x0244
            if (r1 == 0) goto L_0x0244
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            int r3 = r2.intValue()
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "video_call_front_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r3)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x00ff:
            r0.apply()
        L_0x0102:
            java.lang.String r0 = "vid_driver.back_camera_width"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.back_camera_height"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r2 == 0) goto L_0x0218
            if (r1 == 0) goto L_0x0218
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            int r3 = r2.intValue()
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "video_call_back_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r3)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x012e:
            r0.apply()
        L_0x0131:
            java.lang.String r0 = "options.portrait_mode_threshold"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r1 == 0) goto L_0x020c
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x014b:
            r0.apply()
            java.lang.String r0 = "options.landscape_mode_threshold"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r1 == 0) goto L_0x0200
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0168:
            r0.apply()
            java.lang.String r0 = "options.enable_vqm"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            if (r1 == 0) goto L_0x01f5
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x0185:
            r0.apply()
            if (r8 == 0) goto L_0x01d9
            java.lang.String r0 = "options.disable_device_specific_camera_size"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            if (r1 == 0) goto L_0x01ea
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01a4:
            r0.apply()
            java.lang.String r0 = "options.android_camera2_support_level"
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.A06(r0)
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0G(r7)
            java.lang.String r0 = "camera2_required_hardware_support_level"
            if (r2 == 0) goto L_0x01e5
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x01b9:
            r0.apply()
            java.lang.String r0 = "options.force_passive_capture_dev_stream_role"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            if (r1 == 0) goto L_0x01da
            X.6YM r0 = r7.voiceService
            X.1Pa r0 = r0.A2D
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0F(r0)
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01d6:
            r0.apply()
        L_0x01d9:
            return
        L_0x01da:
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0G(r7)
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01d6
        L_0x01e5:
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01b9
        L_0x01ea:
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0G(r7)
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01a4
        L_0x01f5:
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0G(r7)
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0185
        L_0x0200:
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0G(r7)
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0168
        L_0x020c:
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0G(r7)
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x014b
        L_0x0218:
            X.6YM r0 = r7.voiceService
            X.1Pa r1 = r0.A2D
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r1)
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0234
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r1)
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0131
        L_0x0234:
            android.content.SharedPreferences$Editor r0 = X.C90474aD.A0G(r7)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x012e
        L_0x0244:
            X.6YM r0 = r7.voiceService
            X.1Pa r1 = r0.A2D
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r1)
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0260
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r1)
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0102
        L_0x0260:
            android.content.SharedPreferences$Editor r0 = X.C90474aD.A0G(r7)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x00ff
        L_0x0270:
            r0 = 0
            goto L_0x00cd
        L_0x0274:
            r2.A00()
            r4 = 1
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.updateSettingsFromVoipParamsAfterHandlingSignaling(boolean):void");
    }

    public void userRemoved(UserJid userJid, UserJid userJid2) {
        Log.i("VoiceService EVENT:userRemoved");
        if (C34681hT.A0E(this.voiceService.A29, userJid2)) {
            C18740tg.A06(userJid);
            AnonymousClass6YM r0 = this.voiceService;
            r0.A1N = true;
            String A0v = C36381kD.A0v(this.voiceService.A2d, r0.A2b.A0D(userJid));
            AnonymousClass6YM r02 = this.voiceService;
            Message obtainMessage = r02.A0c.obtainMessage(49, C36381kD.A0r(r02.A22, A0v, new Object[1], R.string.f12nameremoved));
            obtainMessage.arg1 = 29;
            obtainMessage.sendToTarget();
            return;
        }
        Message obtain = Message.obtain(this.voiceService.A0c, 51, userJid2);
        if (this.voiceService.A1D.contains(userJid2)) {
            obtain.arg1 = 1;
            this.voiceService.A1D.remove(userJid2);
        }
        this.voiceService.A0c.sendMessage(obtain);
    }

    public void videoCaptureStarted() {
        Log.i("VoiceService EVENT:videoCaptureStarted");
    }

    public void videoCodecMismatch() {
        Log.i("VoiceService EVENT:videoCodecMismatch");
        this.voiceService.A28.A03(R.string.f12nameremoved);
    }

    public void videoCodecStateChanged() {
        C90474aD.A0x(C90514aH.A0N(this, "VoiceService EVENT:videoCodecStateChanged"), this, 15);
    }

    public void videoDecodeFatalError() {
        Log.i("VoiceService EVENT:videoDecodeFatalError");
    }

    public void videoDecodePaused() {
        C90474aD.A0x(C90514aH.A0N(this, "VoiceService EVENT:videoDecodePaused"), this, 15);
    }

    public void videoDecodeResumed() {
        C90474aD.A0x(C90514aH.A0N(this, "VoiceService EVENT:videoDecodeResumed"), this, 15);
    }

    public void videoDecodeStarted() {
        Log.i("VoiceService EVENT:videoDecodeStarted");
    }

    public void videoEncodeFatalError() {
        Log.i("VoiceService EVENT:videoEncodeFatalError");
    }

    public void videoPortCreateFailed() {
        Log.i("VoiceService EVENT:videoPortCreateFailed");
        this.voiceService.A0R(17, (String) null);
    }

    public void videoPreviewError() {
        Log.i("VoiceService EVENT:videoPreviewError");
    }

    public void videoPreviewReady() {
        Log.i("VoiceService EVENT:videoPreviewReady");
    }

    public void videoRenderFormatChanged(UserJid userJid) {
        this.voiceService.A0c.obtainMessage(10, userJid).sendToTarget();
    }

    public void videoStreamCreateError() {
        Log.i("VoiceService EVENT:videoStreamCreateError");
        this.voiceService.A0R(16, (String) null);
    }

    public void weakWifiSwitchedToCellular() {
        C90514aH.A0N(this, "VoiceService EVENT:weakWifiSwitchedToCellular").sendEmptyMessage(35);
    }

    public void willCreateSoundPort() {
        Log.i("VoiceService EVENT:willCreateSoundPort");
    }

    public VoiceServiceEventCallback(AnonymousClass6YM r2, AnonymousClass1GE r3, WhatsAppDynamicPytorchLoader whatsAppDynamicPytorchLoader) {
        this.voiceService = r2;
        this.httpsFormPostFactory = r3;
        this.whatsappDynamicPytorchLoader = whatsAppDynamicPytorchLoader;
    }

    private C157227cc getBCallManager() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r1 == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleNonFatalOfferNack(java.util.List r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r5 = X.C36361kB.A0r(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            X.11F r1 = X.C36401kF.A0a(r2)
            X.6YM r0 = r8.voiceService
            X.16D r0 = r0.A2b
            X.141 r1 = r0.A0D(r1)
            X.6YM r0 = r8.voiceService
            X.171 r0 = r0.A2d
            java.lang.String r0 = X.C36381kD.A0v(r0, r1)
            r5.add(r0)
            goto L_0x0008
        L_0x0026:
            X.6YM r0 = r8.voiceService
            X.171 r0 = r0.A2d
            r4 = 1
            X.0ts r0 = r0.A02
            java.lang.String r6 = X.C55782vB.A00(r0, r5, r4)
            r0 = 427(0x1ab, float:5.98E-43)
            r3 = 1
            r2 = 0
            if (r10 == r0) goto L_0x0095
            r0 = 428(0x1ac, float:6.0E-43)
            if (r10 == r0) goto L_0x008d
            r0 = 431(0x1af, float:6.04E-43)
            if (r10 == r0) goto L_0x0081
            r0 = 435(0x1b3, float:6.1E-43)
            if (r10 == r0) goto L_0x0066
            r0 = 538(0x21a, float:7.54E-43)
            if (r10 == r0) goto L_0x00e7
            java.lang.String r0 = "Unknown error code"
            X.C18740tg.A0D(r2, r0)
            X.6YM r0 = r8.voiceService
            X.0ts r7 = r0.A1s
            r5 = 2131755430(0x7f1001a6, float:1.914174E38)
        L_0x0053:
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r2] = r6
            java.lang.String r1 = r7.A0L(r3, r5, r0)
        L_0x0060:
            X.6YM r0 = r8.voiceService
            r0.A0f(r1)
            return
        L_0x0066:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.6YM r0 = r8.voiceService
            android.content.Context r2 = r0.A22
            if (r1 == 0) goto L_0x0079
            boolean r1 = r1.isAudioChat()
            r0 = 2131895154(0x7f122372, float:1.9425133E38)
            if (r1 != 0) goto L_0x007c
        L_0x0079:
            r0 = 2131895147(0x7f12236b, float:1.9425119E38)
        L_0x007c:
            java.lang.String r1 = r2.getString(r0)
            goto L_0x0060
        L_0x0081:
            X.6YM r0 = r8.voiceService
            android.content.Context r1 = r0.A22
            r0 = 2131895146(0x7f12236a, float:1.9425117E38)
            java.lang.String r1 = X.C36351kA.A0w(r1, r6, r4, r0)
            goto L_0x0060
        L_0x008d:
            X.6YM r0 = r8.voiceService
            android.content.Context r6 = r0.A22
            r3 = 2131895926(0x7f122676, float:1.9426699E38)
            goto L_0x00d3
        L_0x0095:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r7 = 0
            if (r1 == 0) goto L_0x00de
            int r0 = r9.size()
            if (r0 != r4) goto L_0x00ac
            java.lang.Object r0 = r9.get(r2)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.6EE r7 = r1.getInfoByJid(r0)
        L_0x00ac:
            boolean r0 = r1.isGroupCall
            if (r0 == 0) goto L_0x00c6
            java.util.Map r0 = r1.participants
            int r1 = r0.size()
            r0 = 4
            if (r1 <= r0) goto L_0x00c6
            X.6YM r1 = r8.voiceService
            if (r7 == 0) goto L_0x00c2
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x00c2
            r3 = 6
        L_0x00c2:
            r1.A0l(r9, r3)
            return
        L_0x00c6:
            if (r7 == 0) goto L_0x00de
            int r0 = r7.A02
            if (r0 != r4) goto L_0x00de
            X.6YM r0 = r8.voiceService
            android.content.Context r6 = r0.A22
            r3 = 2131896027(0x7f1226db, float:1.9426904E38)
        L_0x00d3:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object r0 = r5.get(r2)
            java.lang.String r1 = X.C36391kE.A0v(r6, r0, r1, r2, r3)
            goto L_0x0060
        L_0x00de:
            X.6YM r0 = r8.voiceService
            X.0ts r7 = r0.A1s
            r5 = 2131755424(0x7f1001a0, float:1.9141727E38)
            goto L_0x0053
        L_0x00e7:
            X.6YM r2 = r8.voiceService
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r0 = 35
            r2.A0l(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.handleNonFatalOfferNack(java.util.List, int):void");
    }

    public static /* synthetic */ void lambda$callCaptureEnded$2(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType) {
        OutputStream outputStream;
        Voip.RecordingInfo recordingInfo = recordingInfoArr[debugTapType.ordinal()];
        if (recordingInfo != null && (outputStream = recordingInfo.outputStream) != null) {
            try {
                outputStream.close();
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("VoiceService EVENT:callCaptureEnded ");
                A0u.append(recordingInfo.outputFile);
                A0u.append(" size ");
                C36351kA.A1S(A0u, recordingInfo.outputFile.length());
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public void callMissed(String str, UserJid userJid, String str2, String str3, int i, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4, GroupJid groupJid, int i2, WamCall wamCall, long j2, boolean z5) {
        int i3;
        UserJid userJid2 = userJid;
        C36321k7.A1K(userJid2, "VoiceService EVENT:callMissed ", AnonymousClass000.A0u());
        CallGroupInfo callGroupInfo2 = callGroupInfo;
        if (callGroupInfo == null || callGroupInfo2.participants.length <= 0) {
            i3 = -1;
        } else {
            i3 = callGroupInfo2.transactionId;
        }
        AnonymousClass6Ts r2 = this.voiceService.A2L;
        int i4 = i;
        long j3 = j2;
        String str4 = str2;
        WamCall wamCall2 = wamCall;
        String str5 = str;
        int i5 = i2;
        String str6 = str3;
        long j4 = j;
        boolean z6 = z;
        boolean z7 = z2;
        r2.A0A.execute(new AnonymousClass74M(r2, wamCall2, groupJid, userJid2, callGroupInfo2, Voip.getCallInfo(), str5, str4, str6, i3, i5, i4, j4, j3, z6, z7, z3, z4, z5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r6.isAudioChat() != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[] r12) {
        /*
            r11 = this;
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 != 0) goto L_0x000c
            java.lang.String r0 = "we are not in a active call"
        L_0x0008:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000c:
            if (r12 == 0) goto L_0x0027
            int r9 = r12.length
            if (r9 == 0) goto L_0x0027
            r10 = 0
            r5 = 1
            if (r9 != r5) goto L_0x002a
            r0 = r12[r10]
            int r1 = r0.errorCode
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0021
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x002a
        L_0x0021:
            java.lang.String r0 = "Server received duplicate offers. Just return"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0027:
            java.lang.String r0 = "Received offer nack without any errors"
            goto L_0x0008
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService EVENT:callOfferNacked error: "
            X.C36321k7.A1T(r0, r1, r9)
            java.util.ArrayList r4 = X.C36441kJ.A14(r9)
            java.util.Map r0 = r6.participants
            int r2 = r0.size()
            int r2 = r2 - r5
            r0 = r12[r10]
            int r3 = r0.errorCode
            java.lang.String r0 = r6.callLinkToken
            if (r0 != 0) goto L_0x004d
            boolean r0 = r6.isAudioChat()
            r1 = 0
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            boolean r0 = r11.isSelfNacked(r12)
            if (r0 != 0) goto L_0x0058
            if (r1 != 0) goto L_0x008d
            if (r2 != r9) goto L_0x008d
        L_0x0058:
            r8 = 1
        L_0x0059:
            r7 = 0
        L_0x005a:
            r2 = r12[r7]
            int r1 = r2.errorCode
            r0 = 432(0x1b0, float:6.05E-43)
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r8 != 0) goto L_0x006a
            if (r0 == 0) goto L_0x008b
            int r3 = r2.errorCode
        L_0x006a:
            r8 = 1
        L_0x006b:
            com.whatsapp.jid.UserJid r0 = r2.errorJid
            r4.add(r0)
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x005a
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x007e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0081
        L_0x007e:
            if (r8 == 0) goto L_0x0081
            r10 = 1
        L_0x0081:
            X.6YM r0 = r11.voiceService
            r0.A0E = r5
            if (r10 == 0) goto L_0x008f
            r11.handleFatalOfferNack(r4, r3, r6)
            return
        L_0x008b:
            r8 = 0
            goto L_0x006b
        L_0x008d:
            r8 = 0
            goto L_0x0059
        L_0x008f:
            r11.handleNonFatalOfferNack(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[]):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callRejectReceived(com.whatsapp.jid.UserJid r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService EVENT:callRejectReceived("
            r1.append(r0)
            java.lang.String r0 = X.C36321k7.A0E(r11, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0048
            boolean r0 = r3.isGroupCall
            r7 = 3
            java.lang.String r8 = "uncallable"
            java.lang.String r4 = "tos"
            java.lang.String r2 = "busy"
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x008e
            X.6YM r0 = r9.voiceService
            X.171 r1 = r0.A2d
            X.16D r0 = r0.A2b
            X.141 r0 = r0.A0D(r10)
            java.lang.String r7 = X.C36381kD.A0v(r1, r0)
            int r0 = r11.hashCode()
            switch(r0) {
                case 0: goto L_0x007e;
                case 115032: goto L_0x005c;
                case 3035641: goto L_0x004e;
                case 1353979473: goto L_0x0049;
                default: goto L_0x0038;
            }
        L_0x0038:
            X.6YM r0 = r9.voiceService
            android.content.Context r1 = r0.A22
            r0 = 2131895146(0x7f12236a, float:1.9425117E38)
        L_0x003f:
            java.lang.String r1 = X.C36351kA.A0w(r1, r7, r6, r0)
        L_0x0043:
            X.6YM r0 = r9.voiceService
            r0.A0f(r1)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r11.equals(r8)
            goto L_0x0060
        L_0x004e:
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0038
            X.6YM r0 = r9.voiceService
            android.content.Context r1 = r0.A22
            r0 = 2131892764(0x7f121a1c, float:1.9420286E38)
            goto L_0x003f
        L_0x005c:
            boolean r0 = r11.equals(r4)
        L_0x0060:
            if (r0 == 0) goto L_0x0038
            boolean r1 = r3.videoEnabled
            X.6YM r0 = r9.voiceService
            if (r1 == 0) goto L_0x006e
            android.content.Context r1 = r0.A22
            r0 = 2131896053(0x7f1226f5, float:1.9426956E38)
            goto L_0x003f
        L_0x006e:
            X.0ts r4 = r0.A1s
            r3 = 2131755430(0x7f1001a6, float:1.914174E38)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r7
            java.lang.String r1 = r4.A0L(r0, r3, r1)
            goto L_0x0043
        L_0x007e:
            java.lang.String r0 = ""
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.6YM r0 = r9.voiceService
            android.content.Context r1 = r0.A22
            r0 = 2131895924(0x7f122674, float:1.9426695E38)
            goto L_0x003f
        L_0x008e:
            boolean r0 = r2.equals(r11)
            r2 = 0
            if (r0 == 0) goto L_0x00a8
            X.6YM r0 = r9.voiceService
            r0.A1P = r6
            android.os.Handler r0 = r0.A0b
            r0.removeCallbacksAndMessages(r2)
            X.6YM r0 = r9.voiceService
            android.os.Handler r2 = r0.A0b
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.sendEmptyMessageDelayed(r7, r0)
            return
        L_0x00a8:
            boolean r0 = r8.equals(r11)
            r1 = 12
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto L_0x00bc
            X.6YM r0 = r9.voiceService
            r0.A0R(r1, r2)
            return
        L_0x00bc:
            X.6YM r0 = r9.voiceService
            r0.A0R(r1, r2)
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x00c7
            r5 = 11
        L_0x00c7:
            r9.showCallNotAllowedActivity((com.whatsapp.jid.UserJid) r10, (int) r5, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callRejectReceived(com.whatsapp.jid.UserJid, java.lang.String):void");
    }

    public void callWaitingStateChanged(int i) {
        String str;
        CallState callState;
        C36321k7.A1T("VoiceService EVENT:callWaitingStateChanged ", AnonymousClass000.A0u(), i);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            str = callInfo.callWaitingInfo.A04;
            if (str != null) {
                AnonymousClass1HQ r3 = this.voiceService.A1m;
                if (i == 1) {
                    callState = CallState.RECEIVED_CALL;
                } else {
                    callState = CallState.NONE;
                }
                CallState callState2 = CallState.NONE;
                HashMap hashMap = r3.A00;
                if (callState == callState2) {
                    hashMap.remove(str);
                } else {
                    hashMap.put(str, callState);
                }
            }
        } else {
            str = null;
        }
        this.voiceService.A0c.removeMessages(34);
        this.voiceService.A0c.obtainMessage(34, i, 0, str).sendToTarget();
    }

    public void eventNotHandled(int i, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Event ");
        A0u.append(str);
        A0u.append(" (code  ");
        A0u.append(i);
        this.voiceService.A0f(AnonymousClass000.A0q(") not handled", A0u));
    }

    public void groupParticipantLeft(UserJid userJid, String str, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:groupParticipantLeft ");
        A0u.append(userJid);
        C90494aF.A1K(A0u, i);
        C36321k7.A1a(A0u, ")");
        if (i == 4) {
            if (str == null) {
                str = "";
            }
            callRejectReceived(userJid, str);
        }
    }

    public void handleAcceptAckFailed(String str, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:handleAcceptAckFailed, error_code = ");
        A0u.append(i);
        C36321k7.A1Q("error_raw_device_jid: ", str, A0u);
        AnonymousClass6YM r2 = this.voiceService;
        int i2 = 26;
        if (i != 434) {
            i2 = 25;
        }
        r2.A0R(i2, (String) null);
    }

    public void handleCallFatal(CallFatalError callFatalError) {
        AnonymousClass6YM r1;
        int i;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:handleCallFatal Reason: ");
        C36321k7.A1Y(A0u, callFatalError.reasonCode);
        C19700wN r3 = this.voiceService.A26;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("voip/callFatal Reason:");
        r3.A0E("VoiceServiceEventCallback/handleCallFatal", C36381kD.A10(A0u2, callFatalError.reasonCode), true);
        int i2 = callFatalError.reasonCode;
        if (i2 == 3) {
            this.voiceService.A0R(6, (String) null);
        } else if (i2 != 4) {
            if (i2 == 5) {
                r1 = this.voiceService;
                i = 16;
            } else if (i2 != 6) {
                AnonymousClass6YM r32 = this.voiceService;
                if (i2 != 7) {
                    r32.A0R(30, (String) null);
                    return;
                } else {
                    r32.A0R(23, r32.A22.getString(R.string.f12nameremoved));
                    return;
                }
            } else {
                r1 = this.voiceService;
                i = 17;
            }
            r1.A0R(i, (String) null);
        } else {
            this.voiceService.A0R(5, (String) null);
        }
    }

    public void handleVoipAssert(String str, int i) {
        String str2;
        String A0r = AnonymousClass000.A0r(":", AnonymousClass000.A0v(str), i);
        if (this.voiceService.A21.add(A0r)) {
            this.voiceService.A26.A0E(AnonymousClass000.A0p("voip-assert:", str, AnonymousClass000.A0u()), A0r, false);
            str2 = " (first occurence)";
        } else {
            str2 = "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoipAssert at ");
        C36321k7.A1P(A0r, str2, A0u);
    }

    public void heartbeatNacked(int i, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:heartbeatNacked callId: ");
        A0u.append(str);
        C36321k7.A1T(" errorCode:", A0u, i);
        if (C90484aE.A1V(str)) {
            this.voiceService.A0R(25, (String) null);
        }
    }

    /* renamed from: lambda$callCaptureBufferFilled$1$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m9lambda$callCaptureBufferFilled$1$comwhatsappcallingserviceVoiceServiceEventCallback(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i) {
        int ordinal = debugTapType.ordinal();
        Voip.RecordingInfo recordingInfo = recordingInfoArr[ordinal];
        if (recordingInfo == null) {
            recordingInfoArr[ordinal] = new Voip.RecordingInfo(this.voiceService.A1a, debugTapType);
            recordingInfo = recordingInfoArr[ordinal];
        }
        OutputStream outputStream = recordingInfo.outputStream;
        if (outputStream == null) {
            Log.e("voip/callCaptureBufferFilled/OutputStream/null");
        } else {
            try {
                outputStream.write(bArr, 0, i);
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
            C120285rG r1 = this.bufferQueue;
            synchronized (r1) {
                if (bArr != null) {
                    r1.A01.addFirst(bArr);
                }
            }
            if (recordingInfo.outputFile.length() >= 52428800) {
                Log.i("callCaptureBufferFilled stop recording due to exceeds file size limit");
            } else {
                return;
            }
        }
        Voip.stopCallRecording();
    }

    public void linkCreateAcked(String str, boolean z) {
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:linkCreateAcked token: ");
        A0u.append(str);
        A0u.append(" media: ");
        if (z) {
            str2 = "video";
        } else {
            str2 = "audio";
        }
        C36321k7.A1a(A0u, str2);
        this.voiceService.A28.A0H(new C80383vJ(this, str, 1, z));
    }

    public void linkCreateNacked(int i) {
        C36321k7.A1T("VoiceService EVENT:linkCreateNacked errorCode:", AnonymousClass000.A0u(), i);
        AnonymousClass6YM r0 = this.voiceService;
        AnonymousClass17Y r3 = r0.A28;
        AnonymousClass2ZG r2 = r0.A1g;
        Objects.requireNonNull(r2);
        r3.A0H(new C1501574e(r2, 38));
    }

    public void linkEditAcked(String str) {
        C36321k7.A1Q("kEventLinkEditAcked token ", str, AnonymousClass000.A0u());
    }

    public void linkEditNacked(String str, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("kEventLinkEditNacked token ");
        A0u.append(str);
        C36321k7.A1S(" error ", A0u, i);
    }

    public void linkJoinNacked(int i) {
        C36321k7.A1T("VoiceService EVENT:linkJoinNacked errorCode:", AnonymousClass000.A0u(), i);
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        int i2 = 26;
        if (i != 400) {
            i2 = 22;
            if (i != 404) {
                i2 = 24;
                if (i != 428) {
                    i2 = 23;
                }
            }
        }
        handleCallLinkLobbyError(i2);
    }

    public void linkQueryNacked(int i) {
        C36321k7.A1T("VoiceService EVENT:linkQueryNacked errorCode:", AnonymousClass000.A0u(), i);
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        int i2 = 26;
        if (i != 400) {
            i2 = 22;
            if (i != 404) {
                i2 = 24;
                if (i != 428) {
                    i2 = 23;
                }
            }
        }
        handleCallLinkLobbyError(i2);
    }

    public void lobbyNacked(int i, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:lobbyNacked callId: ");
        A0u.append(str);
        C36321k7.A1T(" errorCode:", A0u, i);
        if (C90484aE.A1V(str)) {
            this.voiceService.A0R(25, (String) null);
        }
    }

    public void lonelyStateTimeout(int i) {
        C36321k7.A1T("VoiceService EVENT:lonelyStateTimeout remainingDurationMs: ", AnonymousClass000.A0u(), i);
        CallInfo A03 = C34681hT.A03(this.voiceService.A2C);
        C18740tg.A06(A03);
        if (i == 0) {
            AnonymousClass6YM r0 = this.voiceService;
            Message obtainMessage = r0.A0c.obtainMessage(49, r0.A22.getString(R.string.f12nameremoved));
            obtainMessage.arg1 = 27;
            obtainMessage.sendToTarget();
            return;
        }
        showLonelyStateNotification(A03, (int) (((long) i) / 60000));
    }

    public void peerBatteryLevelLow(UserJid userJid) {
        C36321k7.A1K(userJid, "VoiceService EVENT:peerBatteryLevelLow, Jid:", AnonymousClass000.A0u());
        AnonymousClass6YM r1 = this.voiceService;
        Message message = new Message();
        message.what = 19;
        message.obj = userJid;
        r1.A0c.sendMessageDelayed(message, 3000);
    }

    public void peerVideoStateChanged(int i) {
        C36321k7.A1T("VoiceService EVENT:peerVideoStateChanged ", AnonymousClass000.A0u(), i);
        this.voiceService.A0c.removeMessages(12);
        this.voiceService.A0c.obtainMessage(12, i, 0).sendToTarget();
        C19460v5 r1 = this.voiceService.A1Z;
        if (r1.A05()) {
            AnonymousClass1ZY r2 = (AnonymousClass1ZY) r1.A02();
            if (r2.A01.A00.A09(C21100yf.A0P)) {
                AnonymousClass1VD.A00(C146286vM.A00, r2.A02);
            }
        }
    }

    public void playCallTone(int i) {
        C36321k7.A1T("VoiceService EVENT:playCallTone type:", AnonymousClass000.A0u(), i);
        Integer num = (Integer) C36371kC.A0r(this.voiceService.A20, i);
        AnonymousClass6YM r3 = this.voiceService;
        if (r3.A01 == null) {
            r3.A01 = new SoundPool(1, 0, 0);
        }
        this.voiceService.A0e(num, "callTone", 1.0f, 1.0f);
    }

    public void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i) {
        DeviceJid nullable = DeviceJid.getNullable(str);
        StringBuilder A0f = C36421kH.A0f(nullable);
        A0f.append("VoiceService EVENT:rejectedDecryptionFailure, Jid:");
        A0f.append(nullable);
        A0f.append(", callId:");
        A0f.append(str2);
        C36321k7.A1T(", retryCount:", A0f, i);
        this.voiceService.A1z.put(nullable, str2);
        this.voiceService.A36.Boy(new C81263wj(this, nullable, bArr, str2, i, 2));
    }

    public void relayBindsFailed(boolean z) {
        C36321k7.A1X("VoiceService EVENT:relayBindsFailed self bad asn=", AnonymousClass000.A0u(), z);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        this.voiceService.A0I = z;
        endCallWhenRelayBindFailed(callInfo);
    }

    public void screenShare(UserJid userJid, int i, int i2, int i3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:screenShare ");
        A0u.append(i);
        C36321k7.A1K(userJid, " for ", A0u);
        this.voiceService.A0c.obtainMessage(52, new AnonymousClass6CG(userJid, i, i2, i3)).sendToTarget();
    }

    public void selfVideoStateChanged(int i) {
        C36321k7.A1T("VoiceService EVENT:selfVideoStateChanged ", AnonymousClass000.A0u(), i);
        this.voiceService.A0c.removeMessages(11);
        this.voiceService.A0c.obtainMessage(11, i, 0).sendToTarget();
    }

    public void sendJoinableClientPollCriticalEvent(int i) {
        C36321k7.A1T("VoiceService EVENT:sendJoinableClientPollCriticalEvent errorCode:", AnonymousClass000.A0u(), i);
        this.voiceService.A26.A0E("linked-group-call/client-poll-nack", String.valueOf(i), false);
    }

    public void sendLinkedGroupCallDowngradedCriticalEvent(boolean z) {
        String str;
        C36321k7.A1X("VoiceService EVENT:sendLinkedGroupCallDowngradedCriticalEvent isPendingCall:", AnonymousClass000.A0u(), z);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("linked-group-call/downgrade-");
        if (z) {
            str = "pending-call";
        } else {
            str = "ongoing-call";
        }
        this.voiceService.A26.A0E(AnonymousClass000.A0q(str, A0u), (String) null, false);
    }

    public void soundPortCreated(int i) {
        NoiseSuppressor A02;
        AutomaticGainControl A01;
        AcousticEchoCanceler A00;
        C36321k7.A1T("VoiceService EVENT:soundPortCreated with engine type ", AnonymousClass000.A0u(), i);
        Integer A04 = Voip.A04("aec.builtin");
        AnonymousClass6YM r1 = this.voiceService;
        if (r1.A0A == null && A04 != null) {
            int intValue = A04.intValue();
            if (intValue == 2) {
                A00 = Voip.A00(r1.A38.previousAudioSessionId, true);
            } else if (intValue == 3) {
                A00 = Voip.A00(r1.A38.previousAudioSessionId, false);
            }
            r1.A0A = A00;
        }
        Integer A042 = Voip.A04("agc.builtin");
        AnonymousClass6YM r12 = this.voiceService;
        if (r12.A0B == null && A042 != null) {
            int intValue2 = A042.intValue();
            if (intValue2 == 2) {
                A01 = Voip.A01(r12.A38.previousAudioSessionId, true);
            } else if (intValue2 == 3) {
                A01 = Voip.A01(r12.A38.previousAudioSessionId, false);
            }
            r12.A0B = A01;
        }
        Integer A043 = Voip.A04("ns.builtin");
        AnonymousClass6YM r13 = this.voiceService;
        if (r13.A0C == null && A043 != null) {
            int intValue3 = A043.intValue();
            if (intValue3 == 2) {
                A02 = Voip.A02(r13.A38.previousAudioSessionId, true);
            } else if (intValue3 == 3) {
                A02 = Voip.A02(r13.A38.previousAudioSessionId, false);
            } else {
                return;
            }
            r13.A0C = A02;
        }
    }

    public void updateJoinableCallLog(int i, String str, UserJid userJid, boolean z, int i2, CallParticipant[] callParticipantArr, CallSummary callSummary) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService EVENT:updateJoinableCallLog updateType: ");
        A0u.append(i);
        C36321k7.A1Q(" callId:", str, A0u);
        AnonymousClass6Ts r3 = this.voiceService.A2L;
        UserJid userJid2 = userJid;
        CallParticipant[] callParticipantArr2 = callParticipantArr;
        CallSummary callSummary2 = callSummary;
        r3.A0A.execute(new AnonymousClass743(callSummary2, r3, userJid2, str, callParticipantArr2, i2, i, z));
    }

    public void updateVoipSettings(boolean z) {
        C36321k7.A1X("VoiceService EVENT:updateVoipSettings isVideoCall: ", AnonymousClass000.A0u(), z);
        updateSettingsFromVoipParamsAfterHandlingSignaling(z);
    }

    public void videoPortCreated(UserJid userJid) {
        C36321k7.A1K(userJid, "VoiceService EVENT:videoPortCreated ", AnonymousClass000.A0u());
        C90514aH.A1I(this.voiceService.A0c, 7);
    }

    public void videoRenderStarted(UserJid userJid) {
        C36321k7.A1K(userJid, "VoiceService EVENT:videoRenderStarted ", AnonymousClass000.A0u());
        this.voiceService.A0c.obtainMessage(8, userJid).sendToTarget();
    }

    public void bCallAudienceUpdated(AudienceInfo audienceInfo) {
    }

    public void bCallCreateFailed(int i) {
    }

    public void bCallEnded(String str) {
    }

    public void showCallNotAllowedActivity(UserJid userJid, int i, String str) {
        ArrayList A14 = C36441kJ.A14(1);
        A14.add(userJid);
        showCallNotAllowedActivity(A14, i, str);
    }
}
