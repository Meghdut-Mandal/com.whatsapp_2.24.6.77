package com.whatsapp.calling;

import com.whatsapp.jid.UserJid;

public class CallSummary {
    public UserJid callCreatorJid;
    public String callID;
    public CallSummaryUser[] callSummaryUsers;
    public int durationMs;
    public boolean isVideoCall;

    public CallSummary(UserJid userJid, String str, boolean z, int i, CallSummaryUser[] callSummaryUserArr) {
        this.callCreatorJid = userJid;
        this.callID = str;
        this.isVideoCall = z;
        this.durationMs = i;
        this.callSummaryUsers = callSummaryUserArr;
    }
}
