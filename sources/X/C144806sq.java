package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6sq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144806sq implements C22934Ayk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C30221Zr A02;

    public /* synthetic */ C144806sq(UserJid userJid, C30221Zr r2, long j) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = j;
    }

    public final void BJg(byte[] bArr) {
        StringBuilder sb;
        C30221Zr r5 = this.A02;
        UserJid userJid = this.A01;
        long j = this.A00;
        byte[] A022 = C200429hO.A02((C45832Sw) null, (C177808eP) null, bArr);
        if (A022 != null) {
            try {
                AnonymousClass8SX A0i = AnonymousClass8SX.A0i(A022);
                if ((A0i.bitField0_ & 65536) != 0) {
                    AnonymousClass1P5 r8 = r5.A01;
                    C36321k7.A1K(userJid, "LocationSharingManager/onReceiveLocation; location.jid=", AnonymousClass000.A0u());
                    long A002 = C19970wo.A00(r8.A0D);
                    C63593Kq A023 = AnonymousClass1P5.A02(userJid, A0i, (C46902br) null);
                    A023.A05 = A002 - (j * 1000);
                    if (r8.A0h(A023)) {
                        for (AnonymousClass4U8 BeG : r8.A0U) {
                            BeG.BeG(A023);
                        }
                        return;
                    }
                    sb = AnonymousClass000.A0u();
                    sb.append("LocationSharingManager/onReceiveLocation/sharer not in any group; remote_resource=");
                    sb.append(A023.A06);
                } else {
                    sb = AnonymousClass000.A0u();
                    sb.append("axolotl e2eMessage is missing live location message; jid=");
                    sb.append(userJid);
                }
                Log.w(sb.toString());
            } catch (AnonymousClass186 e) {
                Log.w(AnonymousClass000.A0l(userJid, "axolotl derived plaintext does not represent valid protocol buffer; jid=", AnonymousClass000.A0u()), e);
            }
        }
    }
}
