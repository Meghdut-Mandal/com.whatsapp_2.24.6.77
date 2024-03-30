package com.whatsapp.jid;

import X.AnonymousClass00C;
import X.AnonymousClass03N;
import X.AnonymousClass14B;
import X.C19740wR;
import X.C223113u;
import X.C223613z;

public abstract class DeviceJid extends Jid {
    public static final C223113u Companion = new C223113u();
    public final byte deviceByte;
    public final UserJid userJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceJid(UserJid userJid2, int i) {
        super(userJid2.user);
        byte b = (byte) i;
        this.userJid = userJid2;
        this.deviceByte = b;
        if (userJid2 == C223613z.A00) {
            throw new C19740wR((Jid) userJid2);
        } else if (b < 0 || b > 99) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid device: ");
            sb.append(b);
            throw new C19740wR(sb.toString());
        }
    }

    public static final DeviceJid getFromUserJidAndDeviceIdNullable(UserJid userJid2, int i) {
        Object obj;
        C223113u r1 = Companion;
        AnonymousClass00C.A0D(userJid2, 0);
        try {
            obj = r1.A01(userJid2, i);
        } catch (Throwable th) {
            obj = new AnonymousClass03N(th);
        }
        if (obj instanceof AnonymousClass03N) {
            obj = null;
        }
        return (DeviceJid) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.length() == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.jid.DeviceJid getNullable(java.lang.String r4) {
        /*
            X.13u r3 = Companion
            if (r4 == 0) goto L_0x000b
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r2 = 0
            if (r0 != 0) goto L_0x0021
            com.whatsapp.jid.DeviceJid r1 = r3.A02(r4)     // Catch:{ all -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x001a:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x001f
            r2 = r1
        L_0x001f:
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jid.DeviceJid.getNullable(java.lang.String):com.whatsapp.jid.DeviceJid");
    }

    public static final DeviceJid of(Jid jid) {
        UserJid userJid2;
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (!(jid instanceof UserJid) || (userJid2 = (UserJid) jid) == null) {
            return null;
        }
        return userJid2.getPrimaryDevice();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass00C.A0J(getClass(), obj.getClass()) || !super.equals(obj)) {
            return false;
        }
        DeviceJid deviceJid = (DeviceJid) obj;
        if (getDevice() == deviceJid.getDevice()) {
            return AnonymousClass00C.A0J(this.userJid, deviceJid.userJid);
        }
        return false;
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass14B.A0B(this.user, 4));
        sb.append(':');
        sb.append(getDevice());
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public String getRawString() {
        return C223113u.A00(this.user, getServer(), getAgent(), getDevice());
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.userJid.hashCode()) * 31) + getDevice();
    }
}
