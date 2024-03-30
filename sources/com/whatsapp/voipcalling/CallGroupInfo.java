package com.whatsapp.voipcalling;

import java.util.Arrays;

public final class CallGroupInfo {
    public final CallParticipant[] participants;
    public final int transactionId;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallGroupInfo{transactionId=");
        sb.append(this.transactionId);
        sb.append(", participants=");
        sb.append(Arrays.toString(this.participants));
        sb.append('}');
        return sb.toString();
    }

    public CallGroupInfo(int i, CallParticipant[] callParticipantArr) {
        this.transactionId = i;
        this.participants = callParticipantArr;
    }
}
