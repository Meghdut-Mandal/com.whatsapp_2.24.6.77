package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.64F  reason: invalid class name */
public class AnonymousClass64F {
    public final byte A00;
    public final Jid A01;
    public final VoipStanzaChildNode A02;
    public final VoipStanzaChildNode A03;
    public final String A04;
    public final Map A05;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r1 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r1 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r0 = X.C34681hT.A02(r10, "enc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        com.whatsapp.util.Log.e("voip/voipUtil/getRawKeysFromDestination no deviceJid in <to>");
        X.C18740tg.A0D(false, "no deviceJid in <to>");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass64F(com.whatsapp.jid.Jid r14, java.lang.String r15, com.whatsapp.protocol.VoipStanzaChildNode r16) {
        /*
            r13 = this;
            r13.<init>()
            boolean r0 = X.AnonymousClass143.A0F(r14)
            if (r0 == 0) goto L_0x00be
            r13.A01 = r14
            r13.A04 = r15
            r2 = r16
            r13.A03 = r2
            java.lang.String r0 = "destination"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C34681hT.A02(r2, r0)
            r13.A02 = r0
            r4 = 0
            if (r0 == 0) goto L_0x008a
            com.whatsapp.protocol.VoipStanzaChildNode[] r8 = r0.getChildrenCopy()
            r6 = 0
            if (r8 != 0) goto L_0x0033
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no children under destination"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "no <dest> node"
            X.C18740tg.A0D(r4, r0)
        L_0x002d:
            X.C18740tg.A06(r6)
            r13.A05 = r6
            return
        L_0x0033:
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            int r5 = r8.length
            r3 = 0
        L_0x0039:
            if (r3 >= r5) goto L_0x0088
            r10 = r8[r3]
            X.1AL[] r12 = r10.getAttributesCopy()
            if (r12 != 0) goto L_0x004e
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no attribute in <to>"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "no attr in <to>"
            X.C18740tg.A0D(r4, r0)
            goto L_0x002d
        L_0x004e:
            int r11 = r12.length
            r9 = 0
        L_0x0050:
            if (r9 >= r11) goto L_0x007d
            r2 = r12[r9]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007a
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C34681hT.A02(r10, r0)
            if (r0 == 0) goto L_0x0078
            byte[] r0 = r0.getDataCopy()
        L_0x0072:
            r7.put(r1, r0)
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0078:
            r0 = r6
            goto L_0x0072
        L_0x007a:
            int r9 = r9 + 1
            goto L_0x0050
        L_0x007d:
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no deviceJid in <to>"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "no deviceJid in <to>"
            X.C18740tg.A0D(r4, r0)
            goto L_0x002d
        L_0x0088:
            r6 = r7
            goto L_0x002d
        L_0x008a:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)
            r5 = r1
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r2 = X.C34681hT.A02(r2, r0)
            if (r2 == 0) goto L_0x00b5
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r14)
            X.C18740tg.A06(r1)
            byte[] r0 = r2.getDataCopy()
            r3.put(r1, r0)
            java.lang.Byte r1 = X.C34681hT.A06(r2)
            if (r1 != 0) goto L_0x00b5
            java.lang.String r0 = "invalid retry count!"
            X.C18740tg.A0D(r4, r0)
            r1 = r5
        L_0x00b5:
            byte r0 = r1.byteValue()
            r13.A00 = r0
            r13.A05 = r3
            return
        L_0x00be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallOfferStanza: Wrong jid type: "
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r14, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64F.<init>(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("jid=");
        A0u.append(this.A01);
        A0u.append(" callId=");
        A0u.append(this.A04);
        A0u.append(" payload=");
        A0u.append(this.A03);
        A0u.append(" format=");
        if (this.A02 != null) {
            str = "fan-out";
        } else {
            str = "legacy";
        }
        return AnonymousClass000.A0q(str, A0u);
    }
}
