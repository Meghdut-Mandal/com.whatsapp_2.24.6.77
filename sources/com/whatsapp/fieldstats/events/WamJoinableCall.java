package com.whatsapp.fieldstats.events;

import X.AnonymousClass00C;
import X.C20890yK;
import X.C20910yM;
import X.C28991Ux;
import java.util.LinkedHashMap;
import java.util.Map;

public final class WamJoinableCall extends C20890yK {
    public Long acceptAckLatencyMs;
    public String callRandomId;
    public String callReplayerId;
    public Integer callSide;
    public Boolean groupAcceptNoCriticalGroupUpdate;
    public Long groupAcceptToCriticalGroupUpdateMs;
    public Boolean hasScheduleExactAlarmPermission;
    public Boolean hasSpamDialog;
    public Boolean isCallFull;
    public Boolean isFromCallLink;
    public Boolean isLidCall;
    public Boolean isLinkCreator;
    public Boolean isLinkJoin;
    public Boolean isLinkedGroupCall;
    public Boolean isPendingCall;
    public Boolean isPhashBased;
    public Boolean isPhashMismatch;
    public Boolean isRejoin;
    public Boolean isRering;
    public Boolean isScheduledCall;
    public Boolean isUpgradedGroupCallBeforeConnected;
    public Boolean isVoiceChat;
    public Long joinAckLatencyMs;
    public Boolean joinableAcceptBeforeLobbyAck;
    public Boolean joinableDuringCall;
    public Boolean joinableEndCallBeforeLobbyAck;
    public Integer legacyCallResult;
    public Long lobbyAckLatencyMs;
    public Integer lobbyEntryPoint;
    public Integer lobbyExit;
    public Long lobbyExitNackCode;
    public Boolean lobbyQueryWhileConnected;
    public Long lobbyVisibleT;
    public Boolean nseEnabled;
    public Long nseOfflineQueueMs;
    public Long numConnectedPeers;
    public Long numInvitedParticipants;
    public Long numOutgoingRingingPeers;
    public Long queryAckLatencyMs;
    public Long randomScheduledId;
    public Boolean receivedByNse;
    public Boolean rejoinMissingDbMapping;
    public Long timeSinceAcceptMs;
    public Long timeSinceLastClientPollMinutes;
    public Boolean videoEnabled;

    public static /* synthetic */ void getCallSide$annotations() {
    }

    public static /* synthetic */ void getLegacyCallResult$annotations() {
    }

    public static /* synthetic */ void getLobbyEntryPoint$annotations() {
    }

    public static /* synthetic */ void getLobbyExit$annotations() {
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(23, this.acceptAckLatencyMs);
        r3.Bpz(1, this.callRandomId);
        r3.Bpz(31, this.callReplayerId);
        r3.Bpz(41, this.callSide);
        r3.Bpz(37, this.groupAcceptNoCriticalGroupUpdate);
        r3.Bpz(38, this.groupAcceptToCriticalGroupUpdateMs);
        r3.Bpz(42, this.hasScheduleExactAlarmPermission);
        r3.Bpz(26, this.hasSpamDialog);
        r3.Bpz(30, this.isCallFull);
        r3.Bpz(32, this.isFromCallLink);
        r3.Bpz(45, this.isLidCall);
        r3.Bpz(39, this.isLinkCreator);
        r3.Bpz(33, this.isLinkJoin);
        r3.Bpz(24, this.isLinkedGroupCall);
        r3.Bpz(14, this.isPendingCall);
        r3.Bpz(46, this.isPhashBased);
        r3.Bpz(48, this.isPhashMismatch);
        r3.Bpz(3, this.isRejoin);
        r3.Bpz(8, this.isRering);
        r3.Bpz(40, this.isScheduledCall);
        r3.Bpz(47, this.isUpgradedGroupCallBeforeConnected);
        r3.Bpz(43, this.isVoiceChat);
        r3.Bpz(34, this.joinAckLatencyMs);
        r3.Bpz(16, this.joinableAcceptBeforeLobbyAck);
        r3.Bpz(9, this.joinableDuringCall);
        r3.Bpz(17, this.joinableEndCallBeforeLobbyAck);
        r3.Bpz(6, this.legacyCallResult);
        r3.Bpz(19, this.lobbyAckLatencyMs);
        r3.Bpz(2, this.lobbyEntryPoint);
        r3.Bpz(4, this.lobbyExit);
        r3.Bpz(5, this.lobbyExitNackCode);
        r3.Bpz(18, this.lobbyQueryWhileConnected);
        r3.Bpz(7, this.lobbyVisibleT);
        r3.Bpz(27, this.nseEnabled);
        r3.Bpz(28, this.nseOfflineQueueMs);
        r3.Bpz(13, this.numConnectedPeers);
        r3.Bpz(12, this.numInvitedParticipants);
        r3.Bpz(20, this.numOutgoingRingingPeers);
        r3.Bpz(35, this.queryAckLatencyMs);
        r3.Bpz(44, this.randomScheduledId);
        r3.Bpz(29, this.receivedByNse);
        r3.Bpz(22, this.rejoinMissingDbMapping);
        r3.Bpz(36, this.timeSinceAcceptMs);
        r3.Bpz(21, this.timeSinceLastClientPollMinutes);
        r3.Bpz(10, this.videoEnabled);
    }

    public WamJoinableCall() {
        super(2572, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(23, this.acceptAckLatencyMs);
        linkedHashMap.put(1, this.callRandomId);
        linkedHashMap.put(31, this.callReplayerId);
        linkedHashMap.put(41, this.callSide);
        linkedHashMap.put(37, this.groupAcceptNoCriticalGroupUpdate);
        linkedHashMap.put(38, this.groupAcceptToCriticalGroupUpdateMs);
        linkedHashMap.put(42, this.hasScheduleExactAlarmPermission);
        linkedHashMap.put(26, this.hasSpamDialog);
        linkedHashMap.put(30, this.isCallFull);
        linkedHashMap.put(32, this.isFromCallLink);
        linkedHashMap.put(45, this.isLidCall);
        linkedHashMap.put(39, this.isLinkCreator);
        linkedHashMap.put(33, this.isLinkJoin);
        linkedHashMap.put(24, this.isLinkedGroupCall);
        linkedHashMap.put(14, this.isPendingCall);
        linkedHashMap.put(46, this.isPhashBased);
        linkedHashMap.put(48, this.isPhashMismatch);
        linkedHashMap.put(3, this.isRejoin);
        linkedHashMap.put(8, this.isRering);
        linkedHashMap.put(40, this.isScheduledCall);
        linkedHashMap.put(47, this.isUpgradedGroupCallBeforeConnected);
        linkedHashMap.put(43, this.isVoiceChat);
        linkedHashMap.put(34, this.joinAckLatencyMs);
        linkedHashMap.put(16, this.joinableAcceptBeforeLobbyAck);
        linkedHashMap.put(9, this.joinableDuringCall);
        linkedHashMap.put(17, this.joinableEndCallBeforeLobbyAck);
        linkedHashMap.put(6, this.legacyCallResult);
        linkedHashMap.put(19, this.lobbyAckLatencyMs);
        linkedHashMap.put(2, this.lobbyEntryPoint);
        linkedHashMap.put(4, this.lobbyExit);
        linkedHashMap.put(5, this.lobbyExitNackCode);
        linkedHashMap.put(18, this.lobbyQueryWhileConnected);
        linkedHashMap.put(7, this.lobbyVisibleT);
        linkedHashMap.put(27, this.nseEnabled);
        linkedHashMap.put(28, this.nseOfflineQueueMs);
        linkedHashMap.put(13, this.numConnectedPeers);
        linkedHashMap.put(12, this.numInvitedParticipants);
        linkedHashMap.put(20, this.numOutgoingRingingPeers);
        linkedHashMap.put(35, this.queryAckLatencyMs);
        linkedHashMap.put(44, this.randomScheduledId);
        linkedHashMap.put(29, this.receivedByNse);
        linkedHashMap.put(22, this.rejoinMissingDbMapping);
        linkedHashMap.put(36, this.timeSinceAcceptMs);
        linkedHashMap.put(21, this.timeSinceLastClientPollMinutes);
        linkedHashMap.put(10, this.videoEnabled);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        StringBuilder sb = new StringBuilder();
        sb.append("WamJoinableCall {");
        C20910yM.A00(this.acceptAckLatencyMs, "acceptAckLatencyMs", sb);
        C20910yM.A00(this.callRandomId, "callRandomId", sb);
        C20910yM.A00(this.callReplayerId, "callReplayerId", sb);
        Integer num = this.callSide;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        C20910yM.A00(obj, "callSide", sb);
        C20910yM.A00(this.groupAcceptNoCriticalGroupUpdate, "groupAcceptNoCriticalGroupUpdate", sb);
        C20910yM.A00(this.groupAcceptToCriticalGroupUpdateMs, "groupAcceptToCriticalGroupUpdateMs", sb);
        C20910yM.A00(this.hasScheduleExactAlarmPermission, "hasScheduleExactAlarmPermission", sb);
        C20910yM.A00(this.hasSpamDialog, "hasSpamDialog", sb);
        C20910yM.A00(this.isCallFull, "isCallFull", sb);
        C20910yM.A00(this.isFromCallLink, "isFromCallLink", sb);
        C20910yM.A00(this.isLidCall, "isLidCall", sb);
        C20910yM.A00(this.isLinkCreator, "isLinkCreator", sb);
        C20910yM.A00(this.isLinkJoin, "isLinkJoin", sb);
        C20910yM.A00(this.isLinkedGroupCall, "isLinkedGroupCall", sb);
        C20910yM.A00(this.isPendingCall, "isPendingCall", sb);
        C20910yM.A00(this.isPhashBased, "isPhashBased", sb);
        C20910yM.A00(this.isPhashMismatch, "isPhashMismatch", sb);
        C20910yM.A00(this.isRejoin, "isRejoin", sb);
        C20910yM.A00(this.isRering, "isRering", sb);
        C20910yM.A00(this.isScheduledCall, "isScheduledCall", sb);
        C20910yM.A00(this.isUpgradedGroupCallBeforeConnected, "isUpgradedGroupCallBeforeConnected", sb);
        C20910yM.A00(this.isVoiceChat, "isVoiceChat", sb);
        C20910yM.A00(this.joinAckLatencyMs, "joinAckLatencyMs", sb);
        C20910yM.A00(this.joinableAcceptBeforeLobbyAck, "joinableAcceptBeforeLobbyAck", sb);
        C20910yM.A00(this.joinableDuringCall, "joinableDuringCall", sb);
        C20910yM.A00(this.joinableEndCallBeforeLobbyAck, "joinableEndCallBeforeLobbyAck", sb);
        Integer num2 = this.legacyCallResult;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        C20910yM.A00(obj2, "legacyCallResult", sb);
        C20910yM.A00(this.lobbyAckLatencyMs, "lobbyAckLatencyMs", sb);
        Integer num3 = this.lobbyEntryPoint;
        if (num3 == null) {
            obj3 = null;
        } else {
            obj3 = num3.toString();
        }
        C20910yM.A00(obj3, "lobbyEntryPoint", sb);
        Integer num4 = this.lobbyExit;
        if (num4 == null) {
            obj4 = null;
        } else {
            obj4 = num4.toString();
        }
        C20910yM.A00(obj4, "lobbyExit", sb);
        C20910yM.A00(this.lobbyExitNackCode, "lobbyExitNackCode", sb);
        C20910yM.A00(this.lobbyQueryWhileConnected, "lobbyQueryWhileConnected", sb);
        C20910yM.A00(this.lobbyVisibleT, "lobbyVisibleT", sb);
        C20910yM.A00(this.nseEnabled, "nseEnabled", sb);
        C20910yM.A00(this.nseOfflineQueueMs, "nseOfflineQueueMs", sb);
        C20910yM.A00(this.numConnectedPeers, "numConnectedPeers", sb);
        C20910yM.A00(this.numInvitedParticipants, "numInvitedParticipants", sb);
        C20910yM.A00(this.numOutgoingRingingPeers, "numOutgoingRingingPeers", sb);
        C20910yM.A00(this.queryAckLatencyMs, "queryAckLatencyMs", sb);
        C20910yM.A00(this.randomScheduledId, "randomScheduledId", sb);
        C20910yM.A00(this.receivedByNse, "receivedByNse", sb);
        C20910yM.A00(this.rejoinMissingDbMapping, "rejoinMissingDbMapping", sb);
        C20910yM.A00(this.timeSinceAcceptMs, "timeSinceAcceptMs", sb);
        C20910yM.A00(this.timeSinceLastClientPollMinutes, "timeSinceLastClientPollMinutes", sb);
        C20910yM.A00(this.videoEnabled, "videoEnabled", sb);
        sb.append("}");
        String obj5 = sb.toString();
        AnonymousClass00C.A08(obj5);
        return obj5;
    }
}
