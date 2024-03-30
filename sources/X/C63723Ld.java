package X;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.3Ld  reason: invalid class name and case insensitive filesystem */
public abstract class C63723Ld {
    public static Integer A00(C21060yb r2, C20830yE r3) {
        Integer num = null;
        if (r3.A02("android.permission.READ_CONTACTS") != 0) {
            Log.i("phonebook/getCount/permission_denied");
        } else {
            Cursor A00 = C65583Sq.A00(r2, "phonebook/get_count/");
            if (A00 != null) {
                try {
                    num = Integer.valueOf(A00.getCount());
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
            if (A00 != null) {
                A00.close();
                return num;
            }
        }
        return num;
    }

    public static HashSet A01(C21060yb r15, C20830yE r16, C19420v0 r17, long j) {
        Cursor A00;
        C65583Sq r10;
        HashSet A16 = C36441kJ.A16();
        if (r16.A02("android.permission.READ_CONTACTS") != 0) {
            Log.i("phonebook/getPhones/permission_denied");
        } else {
            try {
                A00 = C65583Sq.A00(r15, "phonebook/get_phones/");
                boolean z = false;
                C19420v0 r1 = r17;
                if (A00 == null) {
                    Log.e("phonebook/Cursor is null");
                    int i = C36341k9.A0E(r1).getInt("phonebook_null_cursor_count", 0);
                    if (j < 0) {
                        z = true;
                    }
                    if (i < 10 && !z) {
                        C36321k7.A0q(r1, "phonebook_null_cursor_count", i + 1);
                        return null;
                    }
                } else {
                    while (A00.moveToNext()) {
                        String stripSeparators = PhoneNumberUtils.stripSeparators(A00.getString(2));
                        if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                            r10 = null;
                        } else {
                            long j2 = A00.getLong(0);
                            r10 = new C65583Sq(A00.getString(1), stripSeparators, A00.getString(4), A00.getString(5), A00.getString(6), A00.getInt(3), j2, AnonymousClass000.A1S(A00.getInt(7), 1));
                        }
                        if (r10 != null) {
                            A16.add(r10);
                        }
                    }
                    A00.close();
                    C36341k9.A0v(C19420v0.A00(r1), "phonebook_null_cursor_count", 0);
                    return A16;
                }
            } catch (Exception e) {
                Log.e("phonebook/error in retrieving phone numbers", e);
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return A16;
        throw th;
    }
}
