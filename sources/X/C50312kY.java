package X;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2kY  reason: invalid class name and case insensitive filesystem */
public class C50312kY extends C132446Tt {
    public final int A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass16K A02;
    public final WeakReference A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06 = true;
    public final AnonymousClass1NG A07;

    public C50312kY(AnonymousClass1NG r2, AnonymousClass16D r3, AnonymousClass16K r4, C33341fA r5, int i, boolean z, boolean z2) {
        this.A07 = r2;
        this.A00 = i;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = r3;
        this.A03 = AnonymousClass001.A0F(r5);
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        Cursor A032;
        C91494c6 r2 = this.A02;
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        if (this.A06) {
            AnonymousClass16D r0 = this.A01;
            boolean z = this.A05;
            C21050ya A0O = r0.A05.A04.A0O();
            if (A0O == null) {
                Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
            } else {
                if (z) {
                    str = "times_contacted!=0";
                } else {
                    str = null;
                }
                try {
                    A032 = A0O.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"raw_contact_id"}, str, (String[]) null, "times_contacted DESC LIMIT 100");
                    if (A032 != null) {
                        int columnIndexOrThrow = A032.getColumnIndexOrThrow("raw_contact_id");
                        HashSet A16 = C36441kJ.A16();
                        while (A032.moveToNext()) {
                            Long A0k = C36361kB.A0k(A032, columnIndexOrThrow);
                            if (A16.add(A0k)) {
                                A0I.add(A0k);
                            }
                        }
                        A032.close();
                    }
                } catch (Exception e) {
                    Log.e("contact-mgr-db/unable to query the phone book for frequent contacts sorted by TIMES_CONTACTED", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (this.A05) {
            this.A01.A05.A0W(A0I2);
        }
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        this.A01.A0i(A0I3);
        Iterator it = A0I3.iterator();
        while (it.hasNext()) {
            if (AnonymousClass143.A0I(C36341k9.A0W(it))) {
                it.remove();
            }
        }
        A00(A0I3);
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A0I4 = AnonymousClass001.A0I();
        int i = 0;
        if (A0I.isEmpty() && A0I2.isEmpty()) {
            Iterator it2 = A0I3.iterator();
            while (it2.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it2);
                if (i >= this.A00) {
                    break;
                } else if (!this.A04 || this.A02.A07(A0f)) {
                    A0I4.add(A0f);
                    i++;
                }
            }
        } else {
            C000700i r22 = new C000700i();
            Iterator it3 = A0I3.iterator();
            while (it3.hasNext()) {
                AnonymousClass141 A0f2 = C36391kE.A0f(it3);
                r22.A0A(C36391kE.A0C(A0f2), A0f2);
            }
            HashSet A162 = C36441kJ.A16();
            Iterator it4 = A0I.iterator();
            while (it4.hasNext()) {
                Number number = (Number) it4.next();
                if (i >= this.A00) {
                    break;
                }
                AnonymousClass141 r1 = (AnonymousClass141) r22.A05(number.longValue());
                if (r1 != null && (!this.A04 || this.A02.A07(r1))) {
                    r1.A0m = true;
                    A0I4.add(r1);
                    A162.add(r1);
                    i++;
                }
            }
            Iterator it5 = A0I2.iterator();
            while (it5.hasNext()) {
                Number number2 = (Number) it5.next();
                if (i >= this.A00) {
                    break;
                }
                AnonymousClass141 r12 = (AnonymousClass141) r22.A05(number2.longValue());
                if (r12 != null && (!this.A04 || this.A02.A07(r12))) {
                    r12.A0l = true;
                    A0I4.add(r12);
                    A162.add(r12);
                    i++;
                }
            }
            Iterator it6 = A0I3.iterator();
            while (it6.hasNext()) {
                AnonymousClass141 A0f3 = C36391kE.A0f(it6);
                if (i >= this.A00) {
                    break;
                } else if ((!this.A04 || this.A02.A07(A0f3)) && A162.add(A0f3)) {
                    A0I4.add(A0f3);
                    i++;
                }
            }
        }
        Iterator it7 = A0I4.iterator();
        while (it7.hasNext()) {
            if (AnonymousClass143.A0I(C36341k9.A0W(it7))) {
                it7.remove();
            }
        }
        A00(A0I4);
        return C36441kJ.A0W(A0I4, A0I3);
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList arrayList;
        ArrayList A0I;
        AnonymousClass00I r6 = (AnonymousClass00I) obj;
        C33341fA r4 = (C33341fA) this.A03.get();
        if (r4 != null) {
            r4.A00 = null;
            ConversationsFragment conversationsFragment = r4.A06;
            View view = conversationsFragment.A0F;
            AnonymousClass01I A0h = conversationsFragment.A0h();
            if (view == null || A0h == null || A0h.isFinishing() || r6 == null) {
                Log.w("conversations/updateNuxView: NUX view cannot be updated");
                return;
            }
            ViewGroup A0P = C36411kG.A0P(view, R.id.conversations_empty_nux);
            Object obj2 = r6.A00;
            if (obj2 == null) {
                arrayList = AnonymousClass001.A0I();
            } else {
                arrayList = (ArrayList) obj2;
            }
            Object obj3 = r6.A01;
            if (obj3 != null) {
                A0I = (ArrayList) obj3;
            } else {
                A0I = AnonymousClass001.A0I();
            }
            r4.A05(A0P, A0h, arrayList, A0I);
            r4.A01 = true;
        }
    }

    private void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid A0l = C36351kA.A0l(C36391kE.A0f(it));
            if (A0l != null && this.A07.A0O(A0l)) {
                it.remove();
            }
        }
    }
}
