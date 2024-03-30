package X;

import android.os.ConditionVariable;

/* renamed from: X.1Zh  reason: invalid class name and case insensitive filesystem */
public class C30121Zh {
    public final C20810yC A00;
    public final C000100b A01;
    public final C29571Xd A02;
    public final AnonymousClass1FE A03;
    public final AnonymousClass1VN A04;
    public final AnonymousClass1A1 A05;

    public AnonymousClass3T1 A00(AnonymousClass9X8 r5, AnonymousClass11F r6) {
        AnonymousClass11F A002 = AnonymousClass143.A00(r5.A00);
        if (A002 != null) {
            r6 = A002;
        }
        String str = r5.A04;
        C64933Qa r0 = new C64933Qa(r6, str, true);
        AnonymousClass1A1 r2 = this.A05;
        AnonymousClass3T1 A032 = r2.A03(r0);
        if (A032 == null) {
            return r2.A03(new C64933Qa(r6, str, false));
        }
        return A032;
    }

    public C64933Qa A01(AnonymousClass9X8 r4, AnonymousClass11F r5, C64933Qa r6) {
        AnonymousClass11F A002 = AnonymousClass143.A00(r4.A00);
        if (A002 != null) {
            r5 = A002;
        }
        return new C64933Qa(r5, r6.A01, false);
    }

    public byte[] A02(AnonymousClass9X8 r5, AnonymousClass11F r6) {
        String str = r5.A03;
        if (!AnonymousClass14B.A0F(str)) {
            AnonymousClass11F A002 = AnonymousClass143.A00(r5.A00);
            if (A002 != null) {
                r6 = A002;
            }
            C18740tg.A06(str);
            C64933Qa r2 = new C64933Qa(r6, str, false);
            C29571Xd r1 = this.A02;
            AnonymousClass3T1 A032 = r1.A0b.A03(r2);
            if (!(A032 == null && (A032 = r1.A0Z.A00(r2)) == null)) {
                return A032.A1b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r7 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        r5 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r5 = r10.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(X.AnonymousClass9X8 r11, X.AnonymousClass11F r12, com.whatsapp.jid.UserJid r13, X.AnonymousClass3T1 r14, java.lang.String r15, java.lang.String r16, byte[] r17) {
        /*
            r10 = this;
            X.0yC r2 = r10.A00
            r1 = 4165(0x1045, float:5.836E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r9 = 0
            if (r0 == 0) goto L_0x0014
            if (r13 != 0) goto L_0x0015
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/sender jid is empty"
        L_0x0011:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0014:
            return r9
        L_0x0015:
            if (r14 != 0) goto L_0x0063
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/getBotMessageSecret/getting bot message secret from bot message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r1 = r10.A02(r11, r12)
            if (r1 == 0) goto L_0x0089
            r0 = 29
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r0, r1)
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0
            X.9Fj r6 = new X.9Fj
            r6.<init>(r0)
        L_0x002f:
            com.whatsapp.jid.UserJid r1 = r11.A01
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r1)
            if (r7 != 0) goto L_0x00c8
            if (r14 == 0) goto L_0x0050
            X.1FE r1 = r10.A03
            X.3Qa r0 = r14.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x005e
            r14.A0f()
            com.whatsapp.jid.DeviceJid r0 = r1.A00(r14)
            if (r0 == 0) goto L_0x0053
            com.whatsapp.jid.UserJid r7 = r0.userJid
        L_0x004e:
            if (r7 != 0) goto L_0x00c8
        L_0x0050:
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/originalUserJid is null"
            goto L_0x0011
        L_0x0053:
            X.0wQ r0 = r1.A00
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r7 = r0.A03
            X.C18740tg.A06(r7)
            goto L_0x004e
        L_0x005e:
            com.whatsapp.jid.UserJid r7 = r14.A0L()
            goto L_0x004e
        L_0x0063:
            boolean r0 = r14.A1I()
            if (r0 != 0) goto L_0x00b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/target msg no secret key="
            r1.append(r0)
            X.3Qa r0 = r14.A1J
            r1.append(r0)
            java.lang.String r0 = "; type="
            r1.append(r0)
            int r0 = r14.A1I
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0086:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0089:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/botMessageSecret is null, id="
            r1.append(r0)
            java.lang.String r0 = r11.A04
            r1.append(r0)
            java.lang.String r0 = "; senderJid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "; metadataJid="
            r1.append(r0)
            X.11F r0 = r11.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r9
        L_0x00b2:
            X.00b r1 = r10.A01
            byte[] r0 = r14.A1b
            X.9Fi r0 = r1.WCMMessageSecretAPICreateWithSerialized(r0)
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/messageSecret is null"
            goto L_0x0086
        L_0x00bf:
            X.9Fj r6 = r1.WcmBotMessageSecretAPICreateWithMessageSecret(r0)
            if (r6 != 0) goto L_0x002f
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/botMessageSecret is null"
            goto L_0x0086
        L_0x00c8:
            r1 = r16
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 != 0) goto L_0x00d8
            X.00b r5 = r10.A01
            X.33W r2 = r5.WcmMsmsgSecretAPICreateFromBotMessageSecret(r6, r1, r7, r13)
            if (r2 != 0) goto L_0x00e4
        L_0x00d8:
            X.00b r5 = r10.A01
            X.33W r2 = r5.WcmMsmsgSecretAPICreateFromBotMessageSecret(r6, r15, r7, r13)
            if (r2 != 0) goto L_0x00e4
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/msmsgSecret is null"
            goto L_0x0011
        L_0x00e4:
            r4 = r5
            com.whatsapp.wamsys.JniBridge r4 = (com.whatsapp.wamsys.JniBridge) r4
            java.util.concurrent.atomic.AtomicReference r0 = r4.wajContext
            java.lang.Object r1 = r0.get()
            com.facebook.simplejni.NativeHolder r0 = r2.A00
            r3 = 4
            r8 = r17
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r3, r1, r0, r8)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x0112
            X.33W r2 = r5.WcmMsmsgSecretAPICreateFromBotMessageSecret(r6, r15, r7, r13)
            java.util.concurrent.atomic.AtomicReference r0 = r4.wajContext
            java.lang.Object r1 = r0.get()
            com.facebook.simplejni.NativeHolder r0 = r2.A00
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r3, r1, r0, r8)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/decryptMessageSecretMessage/msmsg decrypt fails"
            goto L_0x0011
        L_0x0112:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30121Zh.A03(X.9X8, X.11F, com.whatsapp.jid.UserJid, X.3T1, java.lang.String, java.lang.String, byte[]):byte[]");
    }

    public C30121Zh(C29571Xd r2, AnonymousClass1FE r3, C20810yC r4, AnonymousClass1VN r5, AnonymousClass1A1 r6, C000100b r7) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A00 = r4;
        this.A01 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r3;
        this.A02 = r2;
    }
}
