package com.whatsapp.net.tls13;

import X.C203439o1;
import java.io.Serializable;
import java.util.Arrays;

public class WtCachedPsk implements Serializable {
    public static final long serialVersionUID = 84430101;
    public final byte certsID;
    public final String cipher;
    public final long maxEarlyDataSize;
    public final byte[] pskVal;
    public final String sni;
    public final byte[] ticket;
    public final long ticketAgeAdd;
    public final long ticketIssuedTime;
    public final long ticketLifetime;
    public boolean useTestTime = false;

    public WtCachedPsk(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte b, long j) {
        this.pskVal = bArr;
        this.cipher = "TLS_AES_128_GCM_SHA256";
        this.maxEarlyDataSize = j;
        this.ticketAgeAdd = C203439o1.A03(bArr2);
        long A03 = C203439o1.A03(bArr3);
        this.ticketLifetime = (A03 > 172800 ? 172800 : A03) * 1000;
        this.ticket = bArr4;
        this.ticketIssuedTime = System.currentTimeMillis();
        this.sni = str;
        this.certsID = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.ticket, ((WtCachedPsk) obj).ticket);
    }

    public int hashCode() {
        return Arrays.hashCode(this.ticket);
    }
}
