package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Y7  reason: invalid class name */
public class AnonymousClass8Y7 extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final AnonymousClass1CR A01;
    public final C20810yC A02;

    public C201669k5 A0A(C202599mH r13, String str, boolean z) {
        AnonymousClass8SS r2;
        AnonymousClass00C.A0D(r13, 2);
        String[] strArr = r13.A06;
        AnonymousClass00C.A07(strArr);
        if (strArr.length != 2 || !"userStatusMute".equals(C165617ti.A0a(strArr)) || (r2 = r13.A03) == null || !AnonymousClass00C.A0J(C199769fw.A03, r13.A01) || !C165577te.A1W(r2.bitField0_) || (r2.bitField0_ & 8388608) == 0) {
            return null;
        }
        AnonymousClass8OT r0 = r2.userStatusMuteAction_;
        AnonymousClass8OT r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8OT.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r1 == null && (r1 = AnonymousClass8OT.DEFAULT_INSTANCE) == null) {
            return null;
        }
        boolean z2 = r1.muted_;
        UserJid A022 = UserJid.Companion.A02(strArr[1]);
        if (A022 == null) {
            return null;
        }
        return new C176008bQ(r13.A02, A022, str, r2.timestamp_, z2, z);
    }

    public String A0B() {
        return "regular_high";
    }

    public String A0C() {
        return "userStatusMute";
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r4) {
        C176008bQ r42 = (C176008bQ) r4;
        boolean z = r42.A01;
        AnonymousClass1CR r1 = this.A01;
        UserJid userJid = r42.A00;
        if (z) {
            r1.A0o(userJid);
        } else {
            r1.A0n(userJid);
        }
        A05(r42);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r4) {
        C176008bQ r42 = (C176008bQ) r4;
        boolean z = r42.A01;
        AnonymousClass1CR r1 = this.A01;
        UserJid userJid = r42.A00;
        if (z) {
            r1.A0o(userJid);
        } else {
            r1.A0n(userJid);
        }
        A06(r42);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C176008bQ r62 = (C176008bQ) r6;
        C176008bQ r72 = (C176008bQ) r7;
        if (r72 == null || !r72.A00.equals(r62.A00) || r72.A04 < r62.A04) {
            boolean z = r62.A01;
            AnonymousClass1CR r1 = this.A01;
            UserJid userJid = r62.A00;
            if (z) {
                r1.A0o(userJid);
            } else {
                r1.A0n(userJid);
            }
            A09(r62, r72);
            return;
        }
        A07(r62);
    }

    public boolean A0H() {
        return this.A02.A0E(2070);
    }

    public AnonymousClass8Y7(C19970wo r1, AnonymousClass1AC r2, C20810yC r3, AnonymousClass1CR r4) {
        super(r2);
        this.A01 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public List A0D(boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1CR r2 = this.A01;
        AnonymousClass1M0 A03 = r2.A0P().get();
        try {
            C224114e r7 = A03.A02;
            String[] strArr = new String[1];
            C36431kI.A1O(strArr, 1, 0);
            Cursor A09 = r7.A09("SELECT jid FROM settings WHERE status_muted = ?", "GET_USER_JIDS_WITH_MUTED_STATUSES", strArr);
            try {
                ArrayList A0I2 = AnonymousClass001.A0I();
                if (A09 != null) {
                    int columnIndex = A09.getColumnIndex("jid");
                    while (A09.moveToNext()) {
                        String string = A09.getString(columnIndex);
                        C222513o r0 = Jid.Companion;
                        Jid A002 = C222513o.A00(string);
                        if (A002 instanceof UserJid) {
                            A0I2.add(A002);
                        }
                    }
                }
                if (A09 != null) {
                    A09.close();
                }
                A03.close();
                Iterator it = A0I2.iterator();
                while (it.hasNext()) {
                    UserJid userJid = (UserJid) it.next();
                    C222713q r02 = AnonymousClass11F.A00;
                    if (r2.A0l(C222713q.A00(userJid))) {
                        long A003 = C19970wo.A00(this.A00);
                        AnonymousClass00C.A0D(userJid, 1);
                        A0I.add(new C176008bQ((C201539jo) null, userJid, (String) null, A003, true, false));
                    }
                }
                return A0I;
            } catch (C19740wR e) {
                Log.e("ChatSettingsStore#getAllMutedStatusJids. Failed to map jid", e);
            } catch (Throwable th) {
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A03.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
