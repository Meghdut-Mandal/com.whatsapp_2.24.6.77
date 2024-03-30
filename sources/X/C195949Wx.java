package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.9Wx  reason: invalid class name and case insensitive filesystem */
public final class C195949Wx {
    public final UserJid A00;
    public final C64933Qa A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195949Wx) {
                C195949Wx r5 = (C195949Wx) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C53202qw.A00(((((Arrays.hashCode(this.A04) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01)) * 31, this.A03));
    }

    public C195949Wx(UserJid userJid, C64933Qa r2, String str, byte[] bArr, boolean z) {
        this.A04 = bArr;
        this.A00 = userJid;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageSecretEncryptionParams(data=");
        C90474aD.A1O(A0u, this.A04);
        A0u.append(", senderUserJid=");
        A0u.append(this.A00);
        A0u.append(", targetMessageKey=");
        A0u.append(this.A01);
        A0u.append(", isTargetMessageLidBased=");
        A0u.append(this.A03);
        A0u.append(", messageSecretUseCase=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
