package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.C18740tg;
import X.C20690y0;
import X.C90464aC;
import android.graphics.Bitmap;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import com.whatsapp.calling.MultiNetworkCallback;
import com.whatsapp.calling.crypto.CryptoCallback;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

public final class Voip {
    public static CryptoCallback A00;
    public static final SimpleDateFormat A01 = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
    public static volatile SignalingXmppCallback A02;

    public enum DebugTapType {
        RECEIVED_AND_DECODED,
        CAPTURED_AND_POST_PROCESSED,
        OUTGOING_ENCODED,
        RAW_CAPTURED,
        RAW_PLAYBACK
    }

    public class JidHelper {
        public static UserJid convertToUserJid(Jid jid) {
            if (jid instanceof UserJid) {
                return (UserJid) jid;
            }
            if (jid instanceof DeviceJid) {
                return ((DeviceJid) jid).userJid;
            }
            return null;
        }

        public static Jid getNullable(String str) {
            return Jid.Companion.A02(str);
        }

        public static int getAgent(Jid jid) {
            return jid.getAgent();
        }

        public static int getDevice(Jid jid) {
            return jid.getDevice();
        }

        public static String getDomain(Jid jid) {
            return jid.getServer();
        }

        public static int getType(Jid jid) {
            return jid.getType();
        }

        public static String getIdentifier(Jid jid) {
            return jid.user;
        }
    }

    public static native void acceptCall();

    public static native void acceptCallWithVideoStopped();

    public static native int acceptVideoUpgrade();

    public static native void adjustAudioLevel(int i);

    public static native int cancelInviteToGroupCall(UserJid userJid);

    public static native int cancelServerReminder(String str, GroupJid groupJid);

    public static native int cancelVideoUpgrade(int i);

    public static native void checkOngoingCalls(String[] strArr, DeviceJid[] deviceJidArr);

    public static native void clearVoipParam(String str);

    public static native int createCallLink(boolean z);

    public static native boolean dumpLastVideoFrame(UserJid userJid, Bitmap bitmap);

    public static native void endCall(boolean z);

    public static native void endCallAndAcceptPendingCall(String str);

    public static native void endCallAndAcceptPendingCallWithVideoStopped(String str);

    public static native CallInfo getCallInfo();

    public static native CallLinkInfo getCallLinkInfo();

    public static native String getCurrentCallId();

    public static native int getCurrentCallLinkState();

    public static native CallState getCurrentCallState();

    public static native UserJid getPeerJid();

    public static native String getVoipParam(String str);

    public static native String getVoipParamForCall(String str, String str2);

    public static native int groupCallBufferProcessMessages();

    public static native void handleIncomingTerminatePush(String str);

    public static native int invite(CallParticipantJid[] callParticipantJidArr, boolean z);

    public static native int inviteToGroupCall(CallParticipantJid callParticipantJid);

    public static native int joinCallLink();

    public static native int joinOngoingCall(String str, UserJid userJid, DeviceJid deviceJid, boolean z, CallParticipantJid[] callParticipantJidArr, boolean z2, GroupJid groupJid, int i, String str2, String str3, boolean z3, boolean z4, String str4);

    public static native void muteCall(boolean z);

    public static native int nativeHandleIncomingSignalingXmpp(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native int nativeHandleIncomingSignalingXmppAck(Jid jid, String str, int i, VoipStanzaChildNode[] voipStanzaChildNodeArr);

    public static native int nativeHandleIncomingSignalingXmppReceipt(Jid jid, VoipStanzaChildNode voipStanzaChildNode);

    public static native int nativeHandleIncomingXmppOffer(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z, boolean z2, int i, boolean z3, int i2, boolean z4);

    public static native int nativeParseXmppOffer(CallOfferInfo[] callOfferInfoArr, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptoCallback);

    public static native void nativeRegisterEventCallback(VoipEventCallback voipEventCallback);

    public static native int nativeRegisterJNIUtils(JNIUtils jNIUtils);

    public static native void nativeRegisterMultiNetworkCallback(MultiNetworkCallback multiNetworkCallback);

    public static native void nativeRegisterSignalingXmppCallback(SignalingXmppCallback signalingXmppCallback);

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterJNIUtils();

    public static native void nativeUnregisterMultiNetworkCallback();

    public static native void nativeUnregisterSignalingXmppCallback();

    public static native void notifyAudioRouteChange(int i);

    public static native void notifyDeviceIdentityChanged(DeviceJid deviceJid);

    public static native void notifyDeviceIdentityDeleted(DeviceJid deviceJid);

    public static native int notifyFailureToCreateAlternativeSocket(boolean z);

    public static native int notifyLostOfAlternativeNetwork();

    public static native void onCallInterrupted(boolean z, boolean z2);

    public static native int peekIncomingOffer(String str, DeviceJid deviceJid, DeviceJid deviceJid2, boolean z, long j, long j2, boolean z2);

    public static native int previewCallLink(String str, boolean z);

    public static native void processPipModeChange(boolean z);

    public static native int refreshCaptureDevice();

    public static native int refreshVideoDevice();

    public static native void rejectCall(String str, String str2);

    public static native void rejectCallWithoutCallContext(String str, boolean z, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, int i, int i2);

    public static native void rejectPendingCall(String str);

    public static native int rejectVideoUpgrade(int i);

    public static native int requestVideoUpgrade();

    public static native void resendOfferOnDecryptionFailure(DeviceJid deviceJid, String str);

    public static native void sendDTMFTone(String str);

    public static native int sendMutePeerRequestInGroupCall(UserJid userJid);

    public static native void sendRekeyRequest(DeviceJid deviceJid, int i);

    public static native int sendRemoveUserRequest(UserJid userJid);

    public static native int setAsyncCaptureFailed();

    public static native int setBatteryState(float f, float f2, boolean z);

    public static native void setCallLowDataUsage(boolean z);

    public static native void setEnableAudioEffectAvailabilityCache(boolean z);

    public static native boolean setEnableFixedVideoOrientation(boolean z);

    public static native int setScreenSize(int i, int i2);

    public static native int setServerReminder(String str, GroupJid groupJid, long j);

    public static native int setVideoDisplayPort(UserJid userJid, VideoPort videoPort);

    public static native int setVideoPreviewPort(VideoPort videoPort);

    public static native int setVideoPreviewSize(int i, int i2);

    public static native int setVoipStackLogLevel(int i);

    public static native int startCall(String str, CallParticipantJid[] callParticipantJidArr, boolean z, GroupJid groupJid, boolean z2, String str2, boolean z3, String str3, int i, boolean z4, boolean z5);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native int startTestNetworkConditionWithAlternativeSocket(int i, String str, int i2);

    public static native void startVideoCaptureStream();

    public static native void startVideoRenderStream(UserJid userJid);

    public static native boolean stopCallRecording();

    public static native void stopVideoCaptureStream();

    public static native void stopVideoRenderStream(UserJid userJid);

    public static native int switchCamera();

    public static native int switchNetworkWithAlternativeSocket(int i, String str, int i2);

    public static native void timeoutPendingCall(String str);

    public static native int toggleToHammerheadDev(boolean z);

    public static native int turnCameraOff();

    public static native int turnCameraOn();

    public static native int turnScreenShareOff();

    public static native int turnScreenShareOn();

    public static native void updateNetworkMedium(int i, int i2);

    public static native void updateNetworkRestrictions(boolean z);

    public static native int updateParticipantsRxSubscription(UserJid[] userJidArr);

    public static native void videoDeviceAndDisplayOrientationChanged(int i, int i2, boolean z);

    public class RecordingInfo {
        public File outputFile;
        public OutputStream outputStream;

        public RecordingInfo(C20690y0 r7, DebugTapType debugTapType) {
            String str;
            int ordinal = debugTapType.ordinal();
            if (ordinal == 1) {
                str = "record.processed";
            } else if (ordinal == 2) {
                str = "record.encoded";
            } else if (ordinal == 0) {
                str = "received.decoded";
            } else if (ordinal == 3) {
                str = "record.raw";
            } else if (ordinal == 4) {
                str = "playback.raw";
            } else {
                throw AnonymousClass000.A0f(debugTapType, "unknown debug tap type: ", AnonymousClass000.A0u());
            }
            String format = Voip.A01.format(new Date(System.currentTimeMillis()));
            r7.A08();
            StringBuilder A0v = AnonymousClass000.A0v(format);
            A0v.append(".");
            A0v.append(str);
            File A0K = C90464aC.A0K((File) null, ".wav.gz", A0v);
            this.outputFile = A0K;
            try {
                this.outputStream = new GZIPOutputStream(new FileOutputStream(A0K, true));
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.outputStream = null;
            }
        }

        public File getOutputFile() {
            return this.outputFile;
        }

        public OutputStream getOutputStream() {
            return this.outputStream;
        }
    }

    public static String A05(int i) {
        if (i == 0) {
            return "kAudOutputDefault";
        }
        if (i == 1) {
            return "kAudOutputSpeaker";
        }
        if (i == 2) {
            return "kAudOutputEarpiece";
        }
        if (i == 3) {
            return "kAudOutputBluetooth";
        }
        if (i == 4) {
            return "kAudOutputHeadset";
        }
        C18740tg.A0D(false, "UNKNOWN AudioRoute");
        return "UNKNOWN AudioRoute";
    }

    public static boolean A09(CallState callState) {
        if (callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
            return true;
        }
        return false;
    }

    public static boolean A0A(CallState callState) {
        if (callState == null) {
            return false;
        }
        if (A09(callState) || callState == CallState.PRECALLING) {
            return true;
        }
        return false;
    }

    public static AcousticEchoCanceler A00(int i, boolean z) {
        if (!A07()) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                AcousticEchoCanceler create = AcousticEchoCanceler.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/hackBuiltInAec/enabled ");
                    sb.append(create.getEnabled());
                    sb.append(" on session id ");
                    sb.append(i3);
                    sb.append(" with previous session id ");
                    sb.append(i);
                    Log.i(sb.toString());
                    return create;
                }
                i2++;
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/hackBuiltInAec/failed previousAudioSessionId = ");
        sb2.append(i);
        sb2.append(", range = ");
        sb2.append(50);
        Log.i(sb2.toString());
        return null;
    }

    public static AutomaticGainControl A01(int i, boolean z) {
        boolean z2;
        try {
            z2 = AutomaticGainControl.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                AutomaticGainControl create = AutomaticGainControl.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/hackBuiltInAgc/enabled ");
                    sb.append(create.getEnabled());
                    sb.append(" on session id ");
                    sb.append(i3);
                    sb.append(" with previous session id ");
                    sb.append(i);
                    Log.i(sb.toString());
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/hackBuiltInAgc/failed previousAudioSessionId = ");
        sb2.append(i);
        sb2.append(", range = ");
        sb2.append(50);
        Log.i(sb2.toString());
        return null;
    }

    public static NoiseSuppressor A02(int i, boolean z) {
        boolean z2;
        try {
            z2 = NoiseSuppressor.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                NoiseSuppressor create = NoiseSuppressor.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/hackBuiltInNs/enabled ");
                    sb.append(create.getEnabled());
                    sb.append(" on session id ");
                    sb.append(i3);
                    sb.append(" with previous session id ");
                    sb.append(i);
                    Log.i(sb.toString());
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/hackBuiltInNs/failed previousAudioSessionId = ");
        sb2.append(i);
        sb2.append(", range = ");
        sb2.append(50);
        Log.i(sb2.toString());
        return null;
    }

    public static Boolean A03(String str) {
        Integer A04 = A04(str);
        if (A04 == null) {
            return null;
        }
        int intValue = A04.intValue();
        boolean z = false;
        if (intValue != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Integer A04(String str) {
        String A06 = A06(str);
        if (A06 == null || A06.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("No value found for param ");
            sb.append(str);
            Log.i(sb.toString());
            return null;
        }
        try {
            return Integer.valueOf(A06);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Wrong format for param ");
            sb2.append(str);
            sb2.append(", value ");
            sb2.append(A06);
            Log.e(sb2.toString(), e);
            return null;
        }
    }

    public static String A06(String str) {
        String voipParam = getVoipParam(str);
        if (voipParam == null || voipParam.isEmpty()) {
            return null;
        }
        return voipParam;
    }

    public static boolean A07() {
        try {
            return AcousticEchoCanceler.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            return false;
        }
    }

    public static boolean A08() {
        CallState currentCallState = getCurrentCallState();
        int currentCallLinkState = getCurrentCallLinkState();
        if (currentCallState != CallState.LINK || currentCallLinkState == 4) {
            return false;
        }
        return true;
    }
}
