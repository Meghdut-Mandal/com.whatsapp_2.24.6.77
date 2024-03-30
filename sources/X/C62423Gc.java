package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.3Gc  reason: invalid class name and case insensitive filesystem */
public class C62423Gc {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final C25071Ew A02;
    public final AnonymousClass1A1 A03;

    /* JADX INFO: finally extract failed */
    public ArrayList A00(UserJid userJid) {
        Throwable th;
        boolean z;
        UserJid A0L;
        if (userJid == null) {
            return AnonymousClass001.A0I();
        }
        C25071Ew r1 = this.A02;
        TreeSet treeSet = new TreeSet(Collections.reverseOrder());
        long A07 = r1.A05.A07(userJid);
        AnonymousClass1M0 A04 = r1.A07.get();
        try {
            C224114e r6 = A04.A02;
            String l = Long.toString(A07);
            Cursor A09 = r6.A09("SELECT message_row_id FROM message_vcard WHERE _id IN (SELECT vcard_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?)", "GET_VCARDS_BY_JID_SQL", new String[]{l});
            try {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("message_row_id");
                while (A09.moveToNext()) {
                    C36351kA.A17(A09, treeSet, columnIndexOrThrow);
                }
                A09.close();
                Cursor A092 = r6.A09("SELECT message_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?", "GET_VCARD_MESSAGE_ROW_ID_BY_JID_ROW_ID", new String[]{l});
                try {
                    int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("message_row_id");
                    while (A092.moveToNext()) {
                        long j = A092.getLong(columnIndexOrThrow2);
                        if (j != 0) {
                            C36391kE.A1W(treeSet, j);
                        }
                    }
                    A092.close();
                    A04.close();
                    ArrayList A15 = C36441kJ.A15(treeSet);
                    ArrayList A0I = AnonymousClass001.A0I();
                    Iterator it = A15.iterator();
                    while (it.hasNext()) {
                        long A0D = C36391kE.A0D(it);
                        AnonymousClass3T1 A0R = C36421kH.A0R(this.A03, A0D);
                        AnonymousClass3XB r4 = null;
                        if (!(A0R == null || (A0L = A0R.A0L()) == null)) {
                            r4 = new AnonymousClass3XB(A0D, userJid.getRawString(), A0L.getRawString());
                        }
                        if (r4 != null) {
                            A0I.add(r4);
                        }
                    }
                    if (A0I.isEmpty()) {
                        return A0I;
                    }
                    ArrayList A0v = C36401kF.A0v(A0I);
                    HashMap A0J = AnonymousClass001.A0J();
                    Iterator it2 = A0I.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3XB r3 = (AnonymousClass3XB) it2.next();
                        UserJid A0l = C36431kI.A0l(r3.A02);
                        if (A0l != null) {
                            if (A0J.containsKey(A0l)) {
                                Object obj = A0J.get(A0l);
                                C18740tg.A06(obj);
                                z = AnonymousClass000.A1X(obj);
                            } else {
                                AnonymousClass141 A08 = this.A01.A08(A0l);
                                if (A08 == null || (!C36361kB.A1X(this.A00, A08) && A08.A0F == null)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                A0J.put(A0l, Boolean.valueOf(z));
                            }
                            if (z) {
                                A0v.add(r3);
                            }
                        }
                    }
                    return A0v;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (Throwable th3) {
                th = th3;
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            try {
                A04.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public C62423Gc(C19730wQ r1, AnonymousClass16D r2, C25071Ew r3, AnonymousClass1A1 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
