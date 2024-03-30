package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.5Iw  reason: invalid class name and case insensitive filesystem */
public class C106235Iw extends C122795vR {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final DeviceJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public boolean A01() {
        VoipStanzaChildNode firstChildByTag;
        AnonymousClass1AL firstAttributeByName;
        VoipStanzaChildNode voipStanzaChildNode = this.A01;
        if (!voipStanzaChildNode.tag.equals("offer") || (firstChildByTag = voipStanzaChildNode.getFirstChildByTag("silence")) == null || (firstAttributeByName = firstChildByTag.getFirstAttributeByName("reason")) == null) {
            return false;
        }
        return !firstAttributeByName.A03.isEmpty();
    }

    public C106235Iw(DeviceJid deviceJid, DeviceJid deviceJid2, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, boolean z) {
        super(jid, str, str2, voipStanzaChildNode);
        this.A03 = deviceJid;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = j;
        this.A00 = j2;
        this.A08 = z;
        this.A04 = deviceJid2;
        this.A02 = j3;
        this.A06 = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0009 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1423461112: goto L_0x000a;
                case -934710369: goto L_0x000d;
                case 105650780: goto L_0x0010;
                case 1063018407: goto L_0x0013;
                case 2035990113: goto L_0x0016;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r2
        L_0x000a:
            java.lang.String r0 = "accept"
            goto L_0x0018
        L_0x000d:
            java.lang.String r0 = "reject"
            goto L_0x0018
        L_0x0010:
            java.lang.String r0 = "offer"
            goto L_0x0018
        L_0x0013:
            java.lang.String r0 = "enc_rekey"
            goto L_0x0018
        L_0x0016:
            java.lang.String r0 = "terminate"
        L_0x0018:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106235Iw.A00(java.lang.String):boolean");
    }
}
