package X;

import android.content.ContentValues;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.1iO  reason: invalid class name and case insensitive filesystem */
public class C35251iO implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35251iO(Object obj, Object obj2, int i, long j) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = j;
        this.A02 = obj2;
    }

    public final void run() {
        int i;
        C28981Uw r3;
        C88944Uq r0;
        AnonymousClass3SB r2;
        switch (this.A03) {
            case 4:
                AnonymousClass1YE r32 = (AnonymousClass1YE) this.A01;
                AnonymousClass2bM r5 = (AnonymousClass2bM) this.A02;
                r32.A09.A0L(r5, this.A00);
                AnonymousClass3T1 A032 = r32.A0E.A03(r5.A1Z());
                if ((r5 instanceof C180868mY) && A032 != null && (r0 = A032.A0J) != null) {
                    r0.B0j(r5);
                } else if ((r5 instanceof C46752bc) && r5.A1X) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(A032);
                    r32.A05.A0u(hashSet, 0);
                }
                HashSet A002 = r32.A08.A00(r5.A1J);
                r32.A02.A0N(r5, 1, r5.A0C + 1, AnonymousClass143.A09(r32.A00, A002).size(), A002.size(), false);
                return;
            case 5:
                C236419g r6 = (C236419g) this.A01;
                long j = this.A00;
                AnonymousClass3SB A003 = C236419g.A00(r6, (DeviceJid) this.A02);
                if (A003 != null) {
                    A003.A00 = j;
                    C231517j r22 = r6.A0I;
                    DeviceJid deviceJid = A003.A07;
                    C231917n r4 = r22.A04;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("last_active", Long.valueOf(j));
                    AnonymousClass1M0 A04 = r4.A02.A04();
                    try {
                        A04.A02.A01(contentValues, "devices", "device_id = ?", "setLastActiveTime/UPDATE_DEVICES", new String[]{deviceJid.getRawString()});
                        synchronized (r4) {
                            C20070wy r23 = r4.A00;
                            if (!(r23 == null || (r2 = (AnonymousClass3SB) r23.get(deviceJid)) == null)) {
                                r2.A00 = j;
                            }
                        }
                        A04.close();
                        C236419g.A05(A003, r6);
                        return;
                    } catch (Throwable th) {
                        try {
                            A04.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    return;
                }
            case 6:
                C31051bC r42 = (C31051bC) this.A01;
                C21337AHp aHp = (C21337AHp) this.A02;
                long j2 = this.A00;
                AnonymousClass00C.A0D(aHp, 1);
                try {
                    AnonymousClass3T1 A004 = r42.A06.A00(aHp, j2);
                    Parcelable.Creator creator = C28981Uw.CREATOR;
                    C64933Qa r24 = A004.A1J;
                    AnonymousClass11F r33 = r24.A00;
                    if ((r33 instanceof C28981Uw) && (r3 = (C28981Uw) r33) != null) {
                        C201579ju A005 = AnonymousClass19L.A00(r42.A03, 0, aHp.A07);
                        if (A005 != null) {
                            A005.A04(4);
                        }
                        boolean A033 = r42.A05.A03(r3, A004);
                        AnonymousClass9YT r7 = new AnonymousClass9YT();
                        r7.A00 = aHp.A07;
                        r7.A05 = "message";
                        r7.A07 = r24.A01;
                        r7.A02 = r3;
                        r7.A08 = aHp.A0w;
                        if (A004 instanceof AnonymousClass2bO) {
                            r7.A06 = "8";
                        }
                        if (C20800yB.A01(C21000yV.A02, r42.A02, 5871) && aHp.BMW()) {
                            r42.A08.Boy(new C35631j0(r42, r3, A004, 42));
                        }
                        if (A005 != null) {
                            A005.A04(5);
                        }
                        if (!A033) {
                            r7.A09.put("error", new AnonymousClass1AL("error", 552));
                        }
                        C207209uj A012 = r7.A01();
                        AnonymousClass00C.A0B(A012);
                        C31051bC.A00(r42, A012);
                    }
                    AnonymousClass1DT r1 = r42.A00;
                    Integer num = aHp.A0X;
                    if (num == null) {
                        i = 0;
                    } else {
                        i = num.intValue();
                    }
                    r1.A0R(aHp, i, 1);
                    return;
                } catch (C28541Tb e) {
                    Log.e("NewsletterIncomingMessageManager/failed to parse a message", e);
                    r42.A00.A0S(aHp, (Integer) null, 5);
                    C31051bC.A00(r42, aHp.BHp("491"));
                    r42.A01.A0r(aHp.BE4(), 491, aHp.A18);
                    return;
                }
            case 7:
                ((AnonymousClass1Z8) this.A01).A02((C64683Pa) this.A02, this.A00);
                return;
            default:
                C219712j.A05((C219712j) this.A01, (Jid) this.A02, this.A00);
                return;
        }
    }
}
