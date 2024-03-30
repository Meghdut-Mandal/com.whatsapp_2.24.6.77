package X;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;

/* renamed from: X.3Oi  reason: invalid class name and case insensitive filesystem */
public final class C64523Oi {
    public final C21060yb A00;
    public final C229216m A01;
    public final C20830yE A02;

    public static final ContentProviderOperation.Builder A00(Long l, String str, boolean z) {
        ContentProviderOperation.Builder withValue;
        if (l == null || z) {
            withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", str);
        } else {
            long longValue = l.longValue();
            ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
            String[] A1S = C36441kJ.A1S();
            C36331k8.A1N(String.valueOf(longValue), str, A1S);
            withValue = newUpdate.withSelection("raw_contact_id = ? AND mimetype = ?", A1S);
        }
        AnonymousClass00C.A08(withValue);
        return withValue;
    }

    public final boolean A01() {
        if (this.A02.A02("android.permission.GET_ACCOUNTS") != 0 || !this.A01.A00()) {
            return false;
        }
        return true;
    }

    public C64523Oi(C229216m r1, C21060yb r2, C20830yE r3) {
        C36321k7.A11(r2, r1, r3);
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
