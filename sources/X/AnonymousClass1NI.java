package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1NI  reason: invalid class name */
public class AnonymousClass1NI extends C229416o {
    public boolean A02(UserJid userJid, boolean z) {
        AnonymousClass1M0 A04;
        try {
            A04 = this.A00.A04();
            if (z) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("jid", userJid.getRawString());
                C229416o.A05(contentValues, A04, "wa_block_list");
            } else {
                C229416o.A02(A04, "wa_block_list", "jid = ?", new String[]{userJid.getRawString()});
            }
            A04.close();
            return true;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update blocked state  ");
            sb.append(userJid);
            sb.append(", ");
            sb.append(z);
            C18740tg.A08(sb.toString(), e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public HashSet A00() {
        Cursor A03;
        HashSet hashSet = new HashSet();
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A03 = C229416o.A03(A032, "SELECT jid FROM wa_block_list", "CONTACT_BLOCK_LIST", (String[]) null);
            int columnIndexOrThrow = A03.getColumnIndexOrThrow("jid");
            while (A03.moveToNext()) {
                UserJid A02 = UserJid.Companion.A02(A03.getString(columnIndexOrThrow));
                if (A02 != null) {
                    hashSet.add(A02);
                }
            }
            A03.close();
            A032.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(Set set) {
        C1495671s B1k;
        C224214g r6 = new C224214g(true);
        r6.A03();
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            C229416o.A02(A04, "wa_block_list", (String) null, (String[]) null);
            ContentValues contentValues = new ContentValues(1);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                contentValues.put("jid", ((UserJid) it.next()).getRawString());
                C229416o.A00(contentValues, A04, "wa_block_list");
            }
            B1k.A00();
            B1k.close();
            A04.close();
            r6.A00();
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
        throw th;
    }

    public AnonymousClass1NI(C229716r r1) {
        super(r1);
    }
}
