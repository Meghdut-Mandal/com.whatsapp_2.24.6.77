package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8aR  reason: invalid class name and case insensitive filesystem */
public final class C175408aR extends C175468aX {
    public static final long A05 = TimeUnit.DAYS.toMillis(7);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175408aR(UserJid userJid, String str, String str2, long j, long j2, boolean z) {
        super(userJid, 2);
        AnonymousClass00C.A0D(str, 2);
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C175408aR r7 = (C175408aR) obj;
            if (!(this.A00 == r7.A00 && AnonymousClass00C.A0J(this.A00.getRawString(), r7.A00.getRawString()) && AnonymousClass00C.A0J(this.A03, r7.A03) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A04 == r7.A04 && AnonymousClass00C.A0J(this.A02, r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1J(objArr, this.A00);
        objArr[1] = this.A00.getRawString();
        objArr[2] = this.A03;
        C165587tf.A1W(objArr, this.A00);
        C165607th.A1T(objArr, this.A01);
        objArr[5] = Boolean.valueOf(this.A04);
        return AnonymousClass000.A0M(this.A02, objArr, 6);
    }
}
