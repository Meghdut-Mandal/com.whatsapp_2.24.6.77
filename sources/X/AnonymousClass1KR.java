package X;

import com.whatsapp.biz.commerce.FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.List;
import javax.crypto.SecretKey;

/* renamed from: X.1KR  reason: invalid class name */
public final class AnonymousClass1KR {
    public final AnonymousClass1KY A00;
    public final C26601Ku A01;
    public final C26461Kg A02;
    public final AnonymousClass1KT A03;
    public final C26451Kf A04;
    public final C20810yC A05;
    public final C005502l A06;
    public final AnonymousClass040 A07;
    public final AnonymousClass19A A08;

    public AnonymousClass1KR(AnonymousClass1KY r2, C26601Ku r3, C26461Kg r4, AnonymousClass1KT r5, C26451Kf r6, C20810yC r7, AnonymousClass19A r8, C005502l r9, AnonymousClass040 r10) {
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass00C.A0D(r9, 9);
        this.A08 = r8;
        this.A05 = r7;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A07 = r10;
        this.A06 = r9;
    }

    public static final boolean A00(C121585tN r4) {
        if (r4 != null) {
            List<C128716Di> list = r4.A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C128716Di r1 : list) {
                    if (r1.A02 != null && "PUBLISHED".equalsIgnoreCase(r1.A00)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void A01(C160037kM r12, UserJid userJid, String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        String str2;
        AnonymousClass00C.A0D(userJid, 0);
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        if (z) {
            AnonymousClass1KT r2 = this.A03;
            if (z2) {
                str2 = "fetch_key_network_1_start";
            } else {
                str2 = "fetch_key_network_start";
            }
            r2.A08(Integer.valueOf(i2), str2);
        }
        new AI6(userJid, this.A08).A00(new C142946pj(this, r12, str, secretKey, bArr, i2, z3, z4));
    }

    public final void A02(UserJid userJid) {
        UserJid userJid2 = userJid;
        if (this.A00.A04(userJid)) {
            if (C20800yB.A01(C21000yV.A02, this.A05, 7351)) {
                AnonymousClass040 r3 = this.A07;
                AnonymousClass0A2.A02(C023109s.A00, this.A06, new FlowsBusinessDataCryptoProcessorDelegate$fetchFlowsBusinessPublicKeyMetadataGraphQl$1(this, userJid, (C023509x) null), r3);
                return;
            }
            A01((C160037kM) null, userJid2, (String) null, (SecretKey) null, (byte[]) null, -1, false, false);
        }
    }
}
