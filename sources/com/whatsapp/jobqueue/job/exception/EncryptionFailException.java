package com.whatsapp.jobqueue.job.exception;

import X.AnonymousClass000;
import com.whatsapp.jid.DeviceJid;

public class EncryptionFailException extends Exception {
    public final int encryptionRetryCount;
    public final DeviceJid jid;

    public EncryptionFailException(DeviceJid deviceJid, int i) {
        super(AnonymousClass000.A0l(deviceJid, "Unable to encrypt message for ", AnonymousClass000.A0u()));
        this.jid = deviceJid;
        this.encryptionRetryCount = i;
    }
}
