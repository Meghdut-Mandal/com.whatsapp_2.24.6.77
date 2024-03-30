package com.whatsapp.voipcalling;

import X.AnonymousClass143;
import X.AnonymousClass6EE;
import X.C110325aU;
import X.C18740tg;
import X.C61213Az;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public UserJid callLinkCreatorJid;
    public int callLinkState;
    public String callLinkToken;
    public int callResult;
    public int callSetupErrorType;
    public final CallState callState;
    public C61213Az callWaitingInfo;
    public boolean canRingAll;
    public int connectedLimit;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isBCall;
    public boolean isBCallBroadcaster;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public boolean isLightweight;
    public boolean isPhashBasedCall;
    public final Map participants = new LinkedHashMap();
    public final UserJid peerJid;
    public final String relayCallUuid;
    public String scheduledId;
    public AnonymousClass6EE self;
    public final String selfParticipantUuid;
    public final String tsLogCallId;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    private void addParticipantInfo(AnonymousClass6EE r3) {
        this.participants.put(r3.A08, r3);
        if (r3.A0J) {
            this.self = r3;
        }
    }

    public static CallInfo convertCallLinkInfoToCallInfo(CallLinkInfo callLinkInfo) {
        CallLinkInfo callLinkInfo2 = callLinkInfo;
        AnonymousClass6EE r1 = callLinkInfo2.self;
        CallState callState2 = CallState.LINK;
        boolean z = callLinkInfo2.videoEnabled;
        boolean z2 = z;
        CallInfo callInfo = new CallInfo(callState2, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, (String) null, (String) null, (String) null, (UserJid) null, (UserJid) null, (UserJid) null, (GroupJid) null, false, true, false, false, z2, false, 0, 0, false, r1.A0O, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, callLinkInfo2.token, (String) null, false, false, false, false, false);
        callInfo.addParticipantInfo(r1);
        callInfo.callLinkCreatorJid = callLinkInfo2.creatorJid;
        callInfo.callLinkState = callLinkInfo2.linkState;
        return callInfo;
    }

    public static CallInfo convertCallWaitingInfoToCallInfo(CallInfo callInfo) {
        CallState callState2;
        CallInfo callInfo2 = callInfo;
        C61213Az r9 = callInfo2.callWaitingInfo;
        boolean z = true;
        if (r9.A01 == 1) {
            callState2 = CallState.RECEIVED_CALL;
        } else {
            callState2 = CallState.ACTIVE;
        }
        UserJid userJid = r9.A03.initialPeerJid;
        C18740tg.A06(userJid);
        String str = r9.A04;
        List<UserJid> list = r9.A06;
        UserJid userJid2 = (UserJid) list.get(0);
        GroupJid groupJid2 = r9.A02;
        if (r9.A00 <= 1) {
            z = false;
        }
        boolean z2 = callInfo2.isGroupCallEnabled;
        boolean z3 = r9.A08;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        GroupJid groupJid3 = groupJid2;
        boolean z4 = z;
        String str2 = str;
        CallInfo callInfo3 = new CallInfo(callState2, str2, (String) null, (String) null, (String) null, userJid, userJid3, userJid4, groupJid3, false, z4, z2, false, z3, false, 0, 0, false, false, false, 0, 0, 0, 0, 0, 0, 0, -1, 0, r9.A07, r9.A05, (String) null, false, false, false, false, false);
        AnonymousClass6EE r0 = callInfo2.self;
        UserJid userJid5 = r0.A08;
        int i = r0.A02;
        boolean z5 = r0.A0C;
        boolean z6 = r0.A0G;
        boolean z7 = r0.A0D;
        CallInfo callInfo4 = callInfo3;
        UserJid userJid6 = userJid5;
        int i2 = i;
        boolean z8 = z5;
        boolean z9 = z6;
        boolean z10 = z7;
        callInfo4.addParticipantInfo(userJid6, i2, true, false, z8, z9, z10, 1, r0.A0O, r0.A0N, r0.A0M, r0.A0L, r0.A07, r0.A04, r0.A05 * 90, r0.A09, r0.A0A, r0.A0K, false, false, false, 0, r0.A03, false, 0, false);
        for (UserJid addParticipantInfo : list) {
            callInfo4.addParticipantInfo(addParticipantInfo, 2, false, false, false, false, false, z3 ? 1 : 0, false, false, false, false, 0, 0, 0, false, false, false, false, false, false, 0, 1, false, 0, false);
        }
        callInfo3.setCallWaitingInfo(0, "", 0, new String[0], (GroupJid) null, false, false, 0, false, (CallLogInfo) null, false, (String) null, false);
        return callInfo3;
    }

    public boolean enableAudioVideoSwitch() {
        AnonymousClass6EE r0 = this.self;
        if (r0 == null || !r0.A09) {
            return false;
        }
        return true;
    }

    public int getConnectedParticipantsCount() {
        return C110325aU.A00(this.participants);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6EE getDefaultPeerInfo() {
        /*
            r5 = this;
            boolean r0 = r5.isGroupCall
            r4 = 0
            if (r0 != 0) goto L_0x002a
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r2 = r3.next()
            X.6EE r2 = (X.AnonymousClass6EE) r2
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r1 = r2.A08
            com.whatsapp.jid.UserJid r0 = r5.peerJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
        L_0x0029:
            return r2
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.6EE");
    }

    public AnonymousClass6EE getInfoByJid(UserJid userJid) {
        return (AnonymousClass6EE) this.participants.get(userJid);
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public List getPeerJids() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass6EE r1 : this.participants.values()) {
            if (!r1.A0J) {
                arrayList.add(r1.A08);
            }
        }
        return arrayList;
    }

    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        if (this.callState != CallState.ACTIVE || getDefaultPeerInfo() == null) {
            return false;
        }
        int i = getDefaultPeerInfo().A02;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isAudioChat() {
        if (this.groupJid == null || !this.isLightweight) {
            return false;
        }
        return true;
    }

    public boolean isCallFull() {
        if (this.connectedLimit <= 0 || C110325aU.A00(this.participants) < this.connectedLimit) {
            return false;
        }
        return true;
    }

    public boolean isCallLinkLobbyOrJoiningState() {
        int i = this.callLinkState;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isEitherSideRequestingUpgrade() {
        AnonymousClass6EE r0;
        if (this.isGroupCall || this.callState == CallState.NONE || (r0 = this.self) == null) {
            return false;
        }
        if (r0.A06 == 3 || isPeerRequestingUpgrade()) {
            return true;
        }
        return false;
    }

    public boolean isInLonelyState() {
        CallState callState2 = this.callState;
        if (callState2 != CallState.CONNECTED_LONELY) {
            if (callState2 == CallState.ACTIVE) {
                for (AnonymousClass6EE r1 : this.participants.values()) {
                    if (r1.A02 != 1 || r1.A0J) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean isLidCall() {
        return AnonymousClass143.A0I(this.creatorJid);
    }

    public boolean isPhashBasedCall() {
        if (this.groupJid == null || !this.isPhashBasedCall) {
            return false;
        }
        return true;
    }

    public boolean isSelfCallOnHold() {
        AnonymousClass6EE r0 = this.self;
        if (r0 == null || !r0.A0C) {
            return false;
        }
        return true;
    }

    public boolean isSelfRequestingUpgrade() {
        AnonymousClass6EE r2;
        if (this.isGroupCall || (r2 = this.self) == null || this.callState == CallState.NONE || r2.A06 != 3) {
            return false;
        }
        return true;
    }

    public boolean isStartedFromCallLink() {
        if (this.callLinkToken != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallId: ");
        sb.append(this.callId);
        sb.append(", peerJid: ");
        sb.append(this.peerJid);
        sb.append(", callState: ");
        sb.append(this.callState);
        return sb.toString();
    }

    public CallInfo(CallState callState2, String str, String str2, String str3, String str4, UserJid userJid, UserJid userJid2, UserJid userJid3, GroupJid groupJid2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i3, int i4, boolean z10, String str5, String str6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.callState = callState2;
        this.callId = str;
        this.tsLogCallId = str2;
        this.relayCallUuid = str3;
        this.selfParticipantUuid = str4;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.groupJid = groupJid2;
        this.isCaller = z;
        this.isGroupCall = z2;
        this.isGroupCallEnabled = z3;
        this.isGroupCallCreatedOnServer = z4;
        this.videoEnabled = z5;
        this.isEndedByMe = z6;
        this.callResult = i;
        this.callSetupErrorType = i2;
        this.callEnding = z7;
        this.videoPreviewReady = z8;
        this.videoCaptureStarted = z9;
        this.callActiveTime = j;
        this.callDuration = j2;
        this.audioDuration = j3;
        this.videoDuration = j4;
        this.bytesSent = j5;
        this.bytesReceived = j6;
        this.ECMode = j7;
        this.initialGroupTransactionId = i3;
        this.connectedLimit = i4;
        this.isJoinableGroupCall = z10;
        this.callLinkToken = str5;
        this.scheduledId = str6;
        this.isLightweight = z11;
        this.canRingAll = z12;
        this.isPhashBasedCall = z13;
        this.isBCall = z14;
        this.isBCallBroadcaster = z15;
    }

    private void setCallWaitingInfo(int i, String str, int i2, String[] strArr, GroupJid groupJid2, boolean z, boolean z2, int i3, boolean z3, CallLogInfo callLogInfo, boolean z4, String str2, boolean z5) {
        String str3 = str;
        GroupJid groupJid3 = groupJid2;
        CallLogInfo callLogInfo2 = callLogInfo;
        String str4 = str2;
        this.callWaitingInfo = new C61213Az(groupJid3, callLogInfo2, str3, str4, AnonymousClass143.A06(UserJid.class, Arrays.asList(strArr)), i, i2, z, z4, z5);
    }

    public boolean canRingAll() {
        return this.canRingAll;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public UserJid getCallLinkCreatorJid() {
        return this.callLinkCreatorJid;
    }

    public int getCallLinkState() {
        return this.callLinkState;
    }

    public String getCallLinkToken() {
        return this.callLinkToken;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public CallState getCallState() {
        return this.callState;
    }

    public C61213Az getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedLimit() {
        return this.connectedLimit;
    }

    public UserJid getCreatorJid() {
        boolean isCallLinkLobbyOrJoiningState = isCallLinkLobbyOrJoiningState();
        UserJid userJid = this.creatorJid;
        if (!isCallLinkLobbyOrJoiningState) {
            C18740tg.A06(userJid);
        }
        return userJid;
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public UserJid getInitialPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.initialPeerJid;
        C18740tg.A06(userJid);
        return userJid;
    }

    public Map getParticipants() {
        return this.participants;
    }

    public UserJid getPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.peerJid;
        C18740tg.A06(userJid);
        return userJid;
    }

    public String getRelayCallUuid() {
        return this.relayCallUuid;
    }

    public String getScheduledId() {
        return this.scheduledId;
    }

    public AnonymousClass6EE getSelfInfo() {
        return this.self;
    }

    public String getSelfParticipantUuid() {
        return this.selfParticipantUuid;
    }

    public String getTSLogCallId() {
        return this.tsLogCallId;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isBCall() {
        return this.isBCall;
    }

    public boolean isBCallBroadcaster() {
        return this.isBCallBroadcaster;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallOnHold() {
        if (!isCallLinkLobbyOrJoiningState() && !isInLonelyState()) {
            AnonymousClass6EE r0 = this.self;
            if (r0 == null || !r0.A0C) {
                for (AnonymousClass6EE r1 : this.participants.values()) {
                    if (r1.A0J || r1.A0C) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPeerRequestingUpgrade() {
        AnonymousClass6EE defaultPeerInfo = getDefaultPeerInfo();
        if (defaultPeerInfo == null || defaultPeerInfo.A06 != 3) {
            return false;
        }
        return true;
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    private void setCallLinkCreatorJid(UserJid userJid) {
        this.callLinkCreatorJid = userJid;
    }

    private void setCallLinkState(int i) {
        this.callLinkState = i;
    }

    private void addParticipantInfo(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, int i5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i6, int i7, boolean z16, int i8, boolean z17) {
        boolean z18 = true;
        int i9 = i;
        if (i9 < 1 || (i9 > 7 && i9 != 11)) {
            z18 = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid participant state ");
        sb.append(i9);
        C18740tg.A0D(z18, sb.toString());
        boolean z19 = z8;
        boolean z20 = z7;
        boolean z21 = z6;
        int i10 = i2;
        boolean z22 = z5;
        boolean z23 = z4;
        boolean z24 = z3;
        boolean z25 = z2;
        boolean z26 = z;
        UserJid userJid2 = userJid;
        boolean z27 = z16;
        int i11 = i7;
        int i12 = i6;
        boolean z28 = z15;
        boolean z29 = z14;
        boolean z30 = z13;
        boolean z31 = z12;
        boolean z32 = z11;
        boolean z33 = z10;
        int i13 = i5;
        int i14 = i4;
        AnonymousClass6EE r2 = new AnonymousClass6EE(userJid2, i9, z26, z25, z24, z23, z22, i10, z21, z20, z19, z9, i3, i14, i13, z33, z32, z31, z30, z29, z28, i12, i11, z27, i8, z17);
        this.participants.put(userJid2, r2);
        if (r2.A0J) {
            this.self = r2;
        }
    }
}
