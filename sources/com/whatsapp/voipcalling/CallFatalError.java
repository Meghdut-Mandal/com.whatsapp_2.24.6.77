package com.whatsapp.voipcalling;

public class CallFatalError {
    public final int reasonCode;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallFatalError {reasonCode=");
        sb.append(this.reasonCode);
        sb.append('}');
        return sb.toString();
    }

    public CallFatalError(int i) {
        this.reasonCode = i;
    }
}
