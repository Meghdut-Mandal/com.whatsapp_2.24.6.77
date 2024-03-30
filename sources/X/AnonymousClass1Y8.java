package X;

/* renamed from: X.1Y8  reason: invalid class name */
public final class AnonymousClass1Y8 {
    public final C19730wQ A00;
    public final AnonymousClass1YA A01;
    public final AnonymousClass1Y9 A02;

    public AnonymousClass1Y8(C19730wQ r2, AnonymousClass1YA r3, AnonymousClass1Y9 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static final void A00(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("expected media key of length 32 bytes.");
        } else if (bArr2.length != 12) {
            throw new IllegalArgumentException("expected iv of length 12 bytes.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass11F r13, com.whatsapp.jid.Jid r14, com.whatsapp.jid.UserJid r15, X.AnonymousClass2bU r16, java.lang.String r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r12 = this;
            r0 = 2
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = 3
            r5 = r17
            X.AnonymousClass00C.A0D(r5, r0)
            r1 = 1
            r8 = r19
            if (r8 == r1) goto L_0x0031
            X.0wQ r2 = r12.A00
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            boolean r0 = r14 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0021
            r0 = r14
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
        L_0x001a:
            boolean r0 = r2.A0N(r0)
            if (r0 != 0) goto L_0x0031
            return
        L_0x0021:
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x002f
            r0 = r14
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            if (r0 == 0) goto L_0x002f
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()
            goto L_0x001a
        L_0x002f:
            r0 = 0
            goto L_0x001a
        L_0x0031:
            r11 = 0
            r2 = r16
            if (r16 == 0) goto L_0x0136
            r0 = 12
            byte[] r9 = X.C18750th.A0H(r0)
            X.3Qj r0 = r2.A01
            X.C18740tg.A06(r0)
            byte[] r3 = r0.A0a
            X.C18740tg.A06(r3)
            X.3Qa r0 = r2.A1J
            java.lang.String r2 = r0.A01
            if (r8 != r1) goto L_0x004e
            r11 = r18
        L_0x004e:
            X.6JR r0 = new X.6JR
            r0.<init>(r2, r11, r8)
            X.AnonymousClass00C.A0B(r3)
            X.AnonymousClass00C.A07(r2)
            X.AnonymousClass00C.A0D(r3, r1)
            A00(r3, r9)
            com.facebook.simplejni.NativeHolder r1 = r0.A00
            r0 = 2
            java.lang.Object r11 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r0, r2, r1, r3, r9)
            byte[] r11 = (byte[]) r11
        L_0x0068:
            X.1YA r4 = r12.A01
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r1 = "id"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r5)
            r3.add(r0)
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r1)
            r3.add(r0)
            java.lang.String r2 = "type"
            java.lang.String r1 = "mediaretry"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3.add(r0)
            java.lang.String r7 = "participant"
            if (r15 == 0) goto L_0x009b
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r7)
            r3.add(r0)
        L_0x009b:
            r0 = 2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r5 = 0
            r10 = 1
            if (r11 == 0) goto L_0x0121
            if (r9 == 0) goto L_0x0121
            X.9nx[] r8 = new X.C203399nx[r0]
            java.lang.String r1 = "enc_p"
            r2 = 0
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (byte[]) r11, (X.AnonymousClass1AL[]) r2)
            r8[r5] = r0
            java.lang.String r1 = "enc_iv"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (byte[]) r9, (X.AnonymousClass1AL[]) r2)
            r8[r10] = r0
            java.lang.String r0 = "encrypt"
            X.9nx r1 = new X.9nx
            r1.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r2, (X.C203399nx[]) r8)
        L_0x00c3:
            r6.add(r1)
        L_0x00c6:
            if (r13 == 0) goto L_0x0102
            r0 = 3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.lang.String r1 = "jid"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r13, (java.lang.String) r1)
            r8.add(r0)
            java.lang.String r2 = java.lang.String.valueOf(r20)
            java.lang.String r1 = "from_me"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r8.add(r0)
            if (r15 == 0) goto L_0x00f0
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r7)
            r8.add(r0)
        L_0x00f0:
            X.1AL[] r0 = X.AnonymousClass1YA.A01
            java.lang.Object[] r2 = r8.toArray(r0)
            X.1AL[] r2 = (X.AnonymousClass1AL[]) r2
            java.lang.String r1 = "rmr"
            X.9nx r0 = new X.9nx
            r0.<init>(r1, r2)
            r6.add(r0)
        L_0x0102:
            X.1AL[] r0 = X.AnonymousClass1YA.A01
            java.lang.Object[] r3 = r3.toArray(r0)
            X.1AL[] r3 = (X.AnonymousClass1AL[]) r3
            X.9nx[] r0 = new X.C203399nx[r5]
            java.lang.Object[] r1 = r6.toArray(r0)
            X.9nx[] r1 = (X.C203399nx[]) r1
            java.lang.String r0 = "notification"
            X.9nx r2 = new X.9nx
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r3, (X.C203399nx[]) r1)
            X.19A r1 = r4.A00
            r0 = 34
            r1.A0G(r2, r0)
            return
        L_0x0121:
            if (r8 == r10) goto L_0x00c6
            X.1AL[] r2 = new X.AnonymousClass1AL[r10]
            java.lang.String r1 = "code"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (int) r8)
            r2[r5] = r0
            java.lang.String r0 = "error"
            X.9nx r1 = new X.9nx
            r1.<init>(r0, r2)
            goto L_0x00c3
        L_0x0136:
            r9 = r11
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Y8.A01(X.11F, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, X.2bU, java.lang.String, java.lang.String, int, boolean):void");
    }
}
