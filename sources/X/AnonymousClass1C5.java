package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1C5  reason: invalid class name */
public class AnonymousClass1C5 {
    public final C19700wN A00;
    public final C231417i A01;
    public final AnonymousClass16D A02;
    public final C19970wo A03;
    public final C19420v0 A04;
    public final C20810yC A05;
    public final AnonymousClass1C6 A06;

    private boolean A00(AnonymousClass11F r4) {
        AnonymousClass141 A08;
        C20810yC r2;
        int i;
        boolean A022;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r4);
        boolean z = false;
        if (!(r4 == null || A002 == null || this.A06.A0A(A002) || (A08 = this.A02.A08(r4)) == null)) {
            AnonymousClass3L0 r02 = A08.A0E;
            if (r02 == null || (!(A022 = r02.A02()) && !r02.A01())) {
                r2 = this.A05;
                i = 3962;
            } else if (A022) {
                r2 = this.A05;
                i = 5263;
            }
            z = C20800yB.A01(C21000yV.A02, r2, i);
            if (z) {
                Log.i("Disabling read receipts for possible spam");
            }
        }
        return z;
    }

    public C194019Nu A01(AnonymousClass11F r20, AnonymousClass11F r21, DeviceJid deviceJid, UserJid userJid, String[] strArr, int i, long j, boolean z) {
        C194019Nu r12;
        AnonymousClass11F r13 = r21;
        AnonymousClass11F r6 = r20;
        String A022 = A02(r6, z);
        DeviceJid deviceJid2 = deviceJid;
        UserJid userJid2 = userJid;
        String[] strArr2 = strArr;
        int i2 = i;
        if (r13 instanceof C177528dw) {
            Log.w("ReadReceiptUtils/buildReadReceiptHandler malformed participant flipping");
            r12 = new C194019Nu(r6, deviceJid2, userJid2, new C64933Qa(C177528dw.A00, strArr[0], false), A022, i2);
        } else {
            C64933Qa r1 = new C64933Qa(r6, strArr[0], false);
            if (r6 instanceof C177638e7) {
                r13 = null;
            }
            r12 = new C194019Nu(r13, deviceJid2, userJid2, r1, A022, i2);
        }
        r12.A01 = j;
        int length = strArr2.length;
        if (length > 1) {
            int i3 = length - 1;
            String[] strArr3 = new String[i3];
            r12.A02 = strArr3;
            System.arraycopy(strArr2, 1, strArr3, 0, i3);
        }
        return r12;
    }

    public String A02(AnonymousClass11F r3, boolean z) {
        return (z || (!AnonymousClass143.A0G(r3) && !this.A04.A2L()) || (r3 instanceof C28981Uw) || (r3 instanceof C177638e7) || A00(r3)) ? "read-self" : "read";
    }

    public boolean A06(AnonymousClass3T1 r6) {
        if (r6.A0I < 1415214000000L || (r6 instanceof AnonymousClass2bM) || !A04(r6.A1J.A00)) {
            return false;
        }
        return true;
    }

    public AnonymousClass1C5(C19700wN r1, AnonymousClass16D r2, C19970wo r3, C19420v0 r4, C231417i r5, C20810yC r6, AnonymousClass1C6 r7) {
        this.A03 = r3;
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A02 = r2;
        this.A01 = r5;
        this.A04 = r4;
    }

    public boolean A03(AnonymousClass11F r3) {
        if (A04(r3) || (!this.A01.A02().isEmpty())) {
            return true;
        }
        return false;
    }

    public boolean A04(AnonymousClass11F r4) {
        if (AnonymousClass143.A0G(r4) || (r4 instanceof C28981Uw) || (r4 instanceof C177638e7)) {
            return true;
        }
        if (!AnonymousClass143.A0H(r4) && this.A04.A2L() && !A00(r4)) {
            return true;
        }
        return false;
    }

    public boolean A05(AnonymousClass11F r5, Throwable th, String[] strArr, long j, boolean z) {
        if (A03(r5)) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (AnonymousClass14B.A0F(strArr[i])) {
                    Log.e("ReadReceiptUtils/buildReadReceiptHandler received invalid message id(s)");
                    if (th != null) {
                        this.A00.A0D("SendReadReceiptInvalidMessageIds", "Unable to send read receipts as it has invalid message id(s)", th);
                    }
                } else {
                    i++;
                }
            }
            if ((r5 instanceof C177528dw) && j > 0 && j + 86400000 < C19970wo.A00(this.A03)) {
                return false;
            }
            if (!"read-self".equals(A02(r5, z)) || (!this.A01.A02().isEmpty())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
