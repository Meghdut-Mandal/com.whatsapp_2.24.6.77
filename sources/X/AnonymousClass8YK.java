package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8YK  reason: invalid class name */
public class AnonymousClass8YK extends AnonymousClass1LZ {
    public final AnonymousClass1AB A00;
    public final C19970wo A01;
    public final C77583qj A02;
    public final AnonymousClass12P A03;
    public final C26171Jd A04;
    public final AnonymousClass1A1 A05;
    public final C21158AAs A06;
    public final AnonymousClass163 A07;
    public final AnonymousClass1NO A08;

    public String A0B() {
        return "regular_high";
    }

    public String A0C() {
        return "star";
    }

    public boolean A0H() {
        return true;
    }

    private void A01(C176128bc r3, AnonymousClass3T1 r4) {
        boolean z = r3.A02;
        boolean z2 = r4.A15;
        if (z) {
            if (!z2) {
                this.A08.A02(Collections.singleton(r4));
            }
        } else if (z2) {
            this.A08.A04(Collections.singleton(r4));
        }
    }

    public C201669k5 A0A(C202599mH r20, String str, boolean z) {
        StringBuilder A0u;
        String str2;
        C202599mH r2 = r20;
        String[] strArr = r2.A06;
        C199769fw r9 = r2.A01;
        AnonymousClass8SS r3 = r2.A03;
        if (strArr.length == 5 && "star".equals(C165617ti.A0a(strArr))) {
            String str3 = strArr[1];
            C222713q r4 = AnonymousClass11F.A00;
            AnonymousClass11F A022 = r4.A02(str3);
            if (A022 == null) {
                A0u = AnonymousClass000.A0u();
                A0u.append("star-message-mutation/from-key-value unable to create chat jid from ");
                str2 = strArr[1];
            } else {
                String str4 = strArr[3];
                Boolean A002 = C201839kV.A00(str4);
                if (A002 == null) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("star-message-mutation/from-key-value value=");
                    A0u.append(str4);
                    A0u.append(" at index=");
                    A0u.append(3);
                    str2 = " is not one of the valid strings";
                } else if (C199769fw.A03.equals(r9) && r3 != null && C165577te.A1W(r3.bitField0_) && (r3.bitField0_ & 2) != 0) {
                    AnonymousClass8OP r0 = r3.starAction_;
                    if (r0 == null) {
                        r0 = AnonymousClass8OP.DEFAULT_INSTANCE;
                    }
                    if ((r0.bitField0_ & 1) != 0) {
                        C64933Qa A0R = C165617ti.A0R(A022, strArr[2], A002.booleanValue());
                        AnonymousClass11F A023 = r4.A02(strArr[4]);
                        AnonymousClass8OP r02 = r3.starAction_;
                        if (r02 == null) {
                            r02 = AnonymousClass8OP.DEFAULT_INSTANCE;
                        }
                        boolean z2 = r02.starred_;
                        return new C176128bc(r2.A02, A023, A0R, str, r3.timestamp_, z2, z);
                    }
                }
            }
            C36321k7.A1Z(A0u, str2);
        }
        return null;
    }

    public List A0D(boolean z) {
        Cursor BE9;
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            BE9 = this.A02.BE9((C02680Bk) null, (AnonymousClass11F) null, (AnonymousClass1S3) null);
            ArrayList A002 = A00(BE9, this, true);
            BE9.close();
            A042.close();
            return A002;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r3) {
        C176128bc r32 = (C176128bc) r3;
        AnonymousClass3T1 A032 = this.A05.A03(r32.A01);
        if (A032 != null) {
            A01(r32, A032);
            A05(r32);
        }
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C176128bc r32 = (C176128bc) r3;
        AnonymousClass3T1 A032 = this.A05.A03(r32.A01);
        if (A032 != null) {
            A01(r32, A032);
            A06(r32);
            return;
        }
        A04(r32);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r7, C201669k5 r8) {
        C176128bc r72 = (C176128bc) r7;
        C64933Qa r5 = r72.A01;
        String A002 = C201669k5.A00(C201839kV.A01(r72.A00, r5, new String[]{"deleteMessageForMe"}));
        AnonymousClass1AC r1 = this.A00;
        if (r1.A0A(A002) != null || r1.A0B(A002) != null) {
            this.A00.A01.A06("cross_index_conflict_counter", 1);
        } else if (r8 == null || r8.A04 < r72.A04) {
            AnonymousClass3T1 A032 = this.A05.A03(r5);
            if (A032 == null && (A032 = this.A04.A08(r5)) == null) {
                A08(r72);
                return;
            }
            A01(r72, A032);
        } else {
            A07(r72);
            return;
        }
        A09(r72, r8);
    }

    public AnonymousClass8YK(C21158AAs aAs, AnonymousClass1AB r2, C19970wo r3, AnonymousClass163 r4, C77583qj r5, AnonymousClass12P r6, AnonymousClass1NO r7, C26171Jd r8, AnonymousClass1AC r9, AnonymousClass1A1 r10) {
        super(r9);
        this.A01 = r3;
        this.A07 = r4;
        this.A05 = r10;
        this.A06 = aAs;
        this.A00 = r2;
        this.A04 = r8;
        this.A03 = r6;
        this.A08 = r7;
        this.A02 = r5;
    }

    public static ArrayList A00(Cursor cursor, AnonymousClass8YK r15, boolean z) {
        C196099Xq A022;
        ArrayList A0I = AnonymousClass001.A0I();
        long A002 = C19970wo.A00(r15.A01);
        while (cursor.moveToNext()) {
            AnonymousClass11F A0A = r15.A07.A0A(C36351kA.A07(cursor, "chat_row_id"));
            if (!(A0A == null || (A022 = r15.A06.A02(cursor, A0A)) == null)) {
                A0I.add(new C176128bc((C201539jo) null, A022.A02, C165617ti.A0R(A022.A01, A022.A03, A022.A04), (String) null, A002, z, false));
            }
        }
        return A0I;
    }
}
