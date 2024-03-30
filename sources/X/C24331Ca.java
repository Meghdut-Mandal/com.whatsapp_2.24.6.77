package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Ca  reason: invalid class name and case insensitive filesystem */
public class C24331Ca {
    public final C19630wG A00;
    public final AnonymousClass1CZ A01;
    public final C19700wN A02;
    public final AnonymousClass19J A03;
    public final AnonymousClass19A A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (java.lang.Byte.parseByte(r6) < 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Runnable r21, java.lang.String r22, byte[] r23, byte[] r24) {
        /*
            r20 = this;
            r15 = r20
            X.0wN r3 = r15.A02
            r4 = r24
            X.AnonymousClass6YO.A0C(r3, r4)
            r5 = r23
            int r1 = r5.length
            r0 = 32
            if (r1 == r0) goto L_0x001a
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r1 = 1
            java.lang.String r0 = "crypto-iq-incorrect-server-salt-size"
            r3.A0E(r0, r2, r1)
        L_0x001a:
            r6 = r22
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0028
            byte r0 = java.lang.Byte.parseByte(r6)     // Catch:{ NumberFormatException -> 0x0028 }
            if (r0 >= 0) goto L_0x002e
        L_0x0028:
            r1 = 1
            java.lang.String r0 = "crypto-iq-incorrect-key-version"
            r3.A0E(r0, r6, r1)
        L_0x002e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "BackupSendMethods/sendGetCipherKey/v="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19A r3 = r15.A04
            java.lang.String r2 = r3.A09()
            r11 = 2
            X.1AL[] r12 = new X.AnonymousClass1AL[r11]
            java.lang.String r1 = "action"
            java.lang.String r10 = "get"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)
            r14 = 0
            r12[r14] = r0
            java.lang.String r1 = "version"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r6)
            r13 = 1
            r12[r13] = r0
            X.9nx[] r9 = new X.C203399nx[r11]
            java.lang.String r1 = "google"
            r7 = 0
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (byte[]) r4, (X.AnonymousClass1AL[]) r7)
            r9[r14] = r0
            java.lang.String r1 = "code"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (byte[]) r5, (X.AnonymousClass1AL[]) r7)
            r9[r13] = r0
            java.lang.String r0 = "crypto"
            X.9nx r8 = new X.9nx
            r8.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r12, (X.C203399nx[]) r9)
            r0 = 4
            X.1AL[] r7 = new X.AnonymousClass1AL[r0]
            X.8e2 r9 = X.C177588e2.A00
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r1)
            r7[r14] = r0
            java.lang.String r9 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r9, (java.lang.String) r1)
            r7[r13] = r0
            java.lang.String r1 = "type"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)
            r7[r11] = r0
            java.lang.String r0 = "id"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r0 = 3
            r7[r0] = r1
            java.lang.String r1 = "iq"
            X.9nx r0 = new X.9nx
            r0.<init>((X.C203399nx) r8, (java.lang.String) r1, (X.AnonymousClass1AL[]) r7)
            X.6xo r14 = new X.6xo
            r16 = r21
            r19 = r4
            r18 = r5
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r7 = 75
            r8 = 32000(0x7d00, double:1.581E-319)
            r4 = r14
            r5 = r0
            r6 = r2
            r3.A0F(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24331Ca.A00(java.lang.Runnable, java.lang.String, byte[], byte[]):void");
    }

    public boolean A01(Runnable runnable, byte[] bArr, byte[] bArr2, int i) {
        if (!this.A03.A06) {
            return false;
        }
        Log.i("sendmethods/sendcreatecipherkey");
        C19700wN r3 = this.A02;
        byte[] bArr3 = bArr;
        AnonymousClass6YO.A0C(r3, bArr3);
        byte[] bArr4 = bArr2;
        int length = bArr4.length;
        if (length != 16) {
            r3.A0E("crypto-iq-incorrect-account-salt-size", String.valueOf(length), true);
        }
        AnonymousClass19A r14 = this.A04;
        String A09 = r14.A09();
        r14.A0F(new C147816xp(this, runnable, bArr3, bArr4, i), new C203399nx(new C203399nx("crypto", new AnonymousClass1AL[]{new AnonymousClass1AL("action", "create")}, new C203399nx[]{new C203399nx("google", bArr3, (AnonymousClass1AL[]) null)}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09)}), A09, 74, 32000);
        return true;
    }

    public C24331Ca(C19700wN r1, AnonymousClass19J r2, C19630wG r3, AnonymousClass1CZ r4, AnonymousClass19A r5) {
        this.A00 = r3;
        this.A02 = r1;
        this.A04 = r5;
        this.A01 = r4;
        this.A03 = r2;
    }
}
