package X;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.MenuItem;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jM  reason: invalid class name and case insensitive filesystem */
public class C49582jM extends C132446Tt {
    public final AnonymousClass16D A00;
    public final C21060yb A01;
    public final C20830yE A02;
    public final C20810yC A03;
    public final WeakReference A04;
    public final C19630wG A05;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass34C r14 = (AnonymousClass34C) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A04.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.BLh()) {
            phoneContactsSelector.A0K = null;
            List<C62583Gs> list = phoneContactsSelector.A0i;
            list.removeAll(r14.A00);
            phoneContactsSelector.A0f.A06();
            ArrayList arrayList = phoneContactsSelector.A0h;
            arrayList.clear();
            arrayList.addAll(r14.A01);
            for (C62583Gs r11 : list) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C62583Gs r9 = (C62583Gs) it.next();
                    if (r9.A04 == r11.A04) {
                        r9.A03 = true;
                    }
                }
            }
            if (list.isEmpty()) {
                PhoneContactsSelector.A0w(phoneContactsSelector);
            }
            PhoneContactsSelector.A0x(phoneContactsSelector, list.size());
            MenuItem menuItem = phoneContactsSelector.A00;
            if (menuItem != null) {
                menuItem.setVisible(C36411kG.A1a(arrayList));
            }
            if (phoneContactsSelector.A0T.A01.A0E(3789)) {
                C48982iN r0 = phoneContactsSelector.A0H;
                if (r0 != null) {
                    r0.A0D(true);
                    phoneContactsSelector.A0H = null;
                }
                C48982iN r1 = new C48982iN(C36341k9.A0R(phoneContactsSelector.A06.A00.A01), phoneContactsSelector, list, arrayList);
                phoneContactsSelector.A0H = r1;
                C36331k8.A1F(r1, phoneContactsSelector.A04);
                return;
            }
            phoneContactsSelector.A3j();
        }
    }

    public C49582jM(AnonymousClass16D r2, PhoneContactsSelector phoneContactsSelector, C21060yb r4, C19630wG r5, C20830yE r6, C20810yC r7) {
        this.A05 = r5;
        this.A01 = r4;
        this.A02 = r6;
        this.A04 = AnonymousClass001.A0F(phoneContactsSelector);
        this.A00 = r2;
        this.A03 = r7;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A032;
        Cursor A033;
        Cursor A034;
        C18740tg.A00();
        C21060yb r1 = this.A01;
        C20830yE r3 = this.A02;
        HashMap A0J = AnonymousClass001.A0J();
        if (r3.A02("android.permission.READ_CONTACTS") != 0) {
            Log.w("returning empty name map because contact permissions are denied");
        } else {
            Cursor A035 = r1.A0O().A03(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "mimetype", "data2"}, "mimetype IN (?)", new String[]{"vnd.android.cursor.item/name"}, (String) null);
            if (A035 == null) {
                try {
                    Log.e("null cursor returned from structured name query");
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                int columnIndex = A035.getColumnIndex("contact_id");
                if (columnIndex == -1) {
                    Log.e("invalid column index for the raw contact id");
                } else {
                    int columnIndex2 = A035.getColumnIndex("mimetype");
                    if (columnIndex2 == -1) {
                        Log.e("invalid column index for the mimetype");
                    } else {
                        int columnIndex3 = A035.getColumnIndex("data2");
                        if (columnIndex3 == -1) {
                            Log.e("invalid column index for the given name");
                        } else {
                            while (A035.moveToNext()) {
                                if (A035.isNull(columnIndex)) {
                                    Log.e("null raw contact id for record; skipping");
                                } else if (A035.isNull(columnIndex2)) {
                                    Log.e("null mimetype for record; skipping");
                                } else {
                                    Long A0k = C36361kB.A0k(A035, columnIndex);
                                    if (((String) A0J.get(A0k)) == null) {
                                        String string = A035.getString(columnIndex2);
                                        if (string == null) {
                                            Log.e("mimetype was returned as null even though cursor said it wasn't null; skipping");
                                        } else if (string.hashCode() != -1079224304 || !string.equals("vnd.android.cursor.item/name")) {
                                            C36321k7.A1P("unrecognized mimetype; skipping; mimetype=", string, AnonymousClass000.A0u());
                                        } else {
                                            A0J.put(A0k, A035.getString(columnIndex3));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                A035.close();
            }
        }
        HashSet A16 = C36441kJ.A16();
        String[] strArr = {"_id", "display_name"};
        C21050ya A0O = r1.A0O();
        if (A0O == null) {
            Log.w("phone-contacts-selector/contact cr=null");
            A16 = null;
        } else {
            try {
                A032 = A0O.A03(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", String.valueOf(0)).build(), strArr, (String) null, (String[]) null, (String) null);
                if (A032 == null) {
                    Log.e("phone-contacts-selector/contact cursor was null");
                    A16 = null;
                } else {
                    while (A032.moveToNext()) {
                        long j = A032.getLong(0);
                        String string2 = A032.getString(1);
                        String str = (String) A0J.get(Long.valueOf(j));
                        if (!TextUtils.isEmpty(string2)) {
                            A16.add(new C62583Gs(string2, j, str));
                        }
                    }
                    A032.close();
                }
            } catch (Exception e) {
                Log.e("phone-contacts-selector/contact exception", e);
                A16 = null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        if (C36401kF.A1Y(this.A03)) {
            C229516p r7 = this.A00.A05;
            C224214g A0g = C36361kB.A0g();
            ArrayList A0I = AnonymousClass001.A0I();
            int i = 0;
            try {
                AnonymousClass1M0 A036 = r7.A00.get();
                try {
                    A034 = C229416o.A03(A036, AnonymousClass2x7.A0A, "NATIVE_CONTACTS_NOT_SYNC_WITH_DEVICE", (String[]) null);
                    A034.getCount();
                    i = A034.getCount();
                    while (A034.moveToNext()) {
                        A0I.add(C53712rl.A00(A034));
                    }
                    A034.close();
                    A036.close();
                    C229516p.A0F(r7, A0I);
                    A0I.size();
                    A0g.A00();
                    HashSet A162 = C36441kJ.A16();
                    Iterator it = A0I.iterator();
                    while (it.hasNext()) {
                        AnonymousClass141 A0f = C36391kE.A0f(it);
                        C62583Gs r0 = new C62583Gs(A0f.A0J(), A0f.A0I(), A0f.A0J());
                        r0.A01 = A0f;
                        A162.add(r0);
                    }
                    A16.addAll(A162);
                } catch (Throwable th3) {
                    A036.close();
                    throw th3;
                }
            } catch (IllegalStateException e2) {
                C229516p.A0L(e2, "contactmanagerdb/getWaOnlyNativeContacts/", i, A0I.size());
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
        } else if (A16 == null) {
            A16 = C36441kJ.A16();
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        String[] strArr2 = {"contact_id"};
        C21050ya A0O2 = r1.A0O();
        if (A0O2 == null) {
            Log.w("phone-contacts-selector/contact cr=null");
        } else {
            try {
                A033 = A0O2.A03(ContactsContract.DeletedContacts.CONTENT_URI, strArr2, (String) null, (String[]) null, (String) null);
                if (A033 != null) {
                    int columnIndex4 = A033.getColumnIndex("contact_id");
                    while (A033.moveToNext()) {
                        A0I2.add(new C62583Gs((String) null, (long) A033.getInt(columnIndex4), (String) null));
                    }
                    A033.close();
                    return new AnonymousClass34C(A0I2, A16);
                }
                Log.e("phone-contacts-selector/search deleted contact cursor was null");
            } catch (Exception e3) {
                Log.e("phone-contacts-selector/query deleted contact exception", e3);
            } catch (Throwable th5) {
                th.addSuppressed(th5);
            }
        }
        A0I2 = AnonymousClass001.A0I();
        return new AnonymousClass34C(A0I2, A16);
        throw th;
        throw th;
        throw th;
    }
}
