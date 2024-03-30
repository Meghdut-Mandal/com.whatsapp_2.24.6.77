package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YC  reason: invalid class name */
public class AnonymousClass8YC extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final C220412q A01;
    public final AnonymousClass1CR A02;

    public String A0B() {
        return "regular_high";
    }

    public String A0C() {
        return "mute";
    }

    public boolean A0H() {
        return true;
    }

    private void A00(C176098bZ r7) {
        if (r7.A02) {
            long j = r7.A00;
            if (j != -1) {
                j = this.A00.A08(j);
            }
            this.A02.A0m(r7.A01, j);
            return;
        }
        AnonymousClass1CR r2 = this.A02;
        AnonymousClass11F r1 = r7.A01;
        if (r2.A0j(r1)) {
            r2.A0i(r1);
        }
    }

    public C201669k5 A0A(C202599mH r19, String str, boolean z) {
        C202599mH r6 = r19;
        String[] strArr = r6.A06;
        C199769fw r3 = r6.A01;
        AnonymousClass8SS r5 = r6.A03;
        if (strArr.length == 2 && "mute".equals(C165617ti.A0a(strArr))) {
            AnonymousClass11F A0N = C36421kH.A0N(strArr[1]);
            if (A0N == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("mute-chat-mutation/from-key-value unable to create chat jid from ");
                C36321k7.A1Z(A0u, strArr[1]);
            } else if (C199769fw.A03.equals(r3) && r5 != null && C165577te.A1W(r5.bitField0_) && (r5.bitField0_ & 8) != 0) {
                AnonymousClass8QH r0 = r5.muteAction_;
                AnonymousClass8QH r7 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8QH.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    long j = 0;
                    AnonymousClass8QH r02 = r7;
                    if (r7 == null) {
                        r02 = AnonymousClass8QH.DEFAULT_INSTANCE;
                    }
                    if (r02.muted_) {
                        AnonymousClass8QH r03 = r7;
                        if (r7 == null) {
                            r03 = AnonymousClass8QH.DEFAULT_INSTANCE;
                        }
                        if ((r03.bitField0_ & 2) != 0) {
                            AnonymousClass8QH r04 = r7;
                            if (r7 == null) {
                                r04 = AnonymousClass8QH.DEFAULT_INSTANCE;
                            }
                            long j2 = r04.muteEndTimestamp_;
                            if (j2 >= 0 || j2 == -1) {
                                AnonymousClass8QH r05 = r7;
                                if (r7 == null) {
                                    r05 = AnonymousClass8QH.DEFAULT_INSTANCE;
                                }
                                j = r05.muteEndTimestamp_;
                            }
                        }
                    }
                    if (r7 == null) {
                        r7 = AnonymousClass8QH.DEFAULT_INSTANCE;
                    }
                    return new C176098bZ(r6.A02, A0N, str, j, r5.timestamp_, r7.muted_, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r3) {
        C176098bZ r32 = (C176098bZ) r3;
        if (this.A01.A0M(r32.A01)) {
            A00(r32);
            A05(r32);
        }
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C176098bZ r32 = (C176098bZ) r3;
        if (this.A01.A0M(r32.A01)) {
            A00(r32);
            A06(r32);
            return;
        }
        A04(r32);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C176098bZ r62 = (C176098bZ) r6;
        if (r7 != null && r7.A04 >= r62.A04) {
            A07(r62);
        } else if (this.A01.A0M(r62.A01)) {
            A00(r62);
            A09(r62, r7);
        } else {
            A08(r62);
        }
    }

    public AnonymousClass8YC(C19970wo r1, C220412q r2, AnonymousClass1AC r3, AnonymousClass1CR r4) {
        super(r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r4;
    }

    public List A0D(boolean z) {
        Cursor A09;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1CR r0 = this.A02;
        HashSet A16 = C36441kJ.A16();
        AnonymousClass1M0 A03 = r0.A0P().get();
        try {
            A09 = A03.A02.A09("SELECT jid, mute_end FROM settings WHERE mute_end IS NOT NULL", "GET_MUTED_CHAT_JID_WITH_END_TIME", (String[]) null);
            int columnIndex = A09.getColumnIndex("jid");
            int columnIndex2 = A09.getColumnIndex("mute_end");
            while (A09.moveToNext()) {
                AnonymousClass11F A0N = C36421kH.A0N(A09.getString(columnIndex));
                if (A0N != null) {
                    A16.add(C36441kJ.A0Q(A0N, Long.valueOf(A09.getLong(columnIndex2))));
                }
            }
            A09.close();
            A03.close();
            Iterator it = A16.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                AnonymousClass11F r9 = (AnonymousClass11F) pair.first;
                long A092 = C36431kI.A09(pair.second);
                C19970wo r5 = this.A00;
                if (A092 > System.currentTimeMillis() || A092 == -1) {
                    A0I.add(new C176098bZ((C201539jo) null, r9, (String) null, A092, C19970wo.A00(r5), true, false));
                }
            }
            return A0I;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
