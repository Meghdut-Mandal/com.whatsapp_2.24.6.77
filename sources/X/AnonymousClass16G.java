package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.16G  reason: invalid class name */
public final class AnonymousClass16G {
    public final C20810yC A00;
    public final C21010yW A01;
    public final C19890wg A02;
    public final AnonymousClass00T A03 = new AnonymousClass00U(new AnonymousClass16H(this));

    public AnonymousClass16G(C20810yC r3, C21010yW r4, C19890wg r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r3;
    }

    public void A01(Set set, Set set2, int i, int i2) {
        SharedPreferences.Editor edit;
        AnonymousClass00C.A0D(set, 1);
        AnonymousClass00C.A0D(set2, 3);
        AnonymousClass00T r9 = this.A03;
        SharedPreferences sharedPreferences = (SharedPreferences) r9.getValue();
        int i3 = 0;
        if (sharedPreferences != null) {
            i3 = sharedPreferences.getInt("num_statuses_received_key", 0);
        }
        Set A002 = A00("contacts_with_statuses_key");
        A002.addAll(set);
        SharedPreferences sharedPreferences2 = (SharedPreferences) r9.getValue();
        int i4 = 0;
        if (sharedPreferences2 != null) {
            i4 = sharedPreferences2.getInt("num_statuses_viewed_key", 0);
        }
        Set A003 = A00("contacts_with_statuses_viewed_key");
        A003.addAll(set2);
        SharedPreferences sharedPreferences3 = (SharedPreferences) r9.getValue();
        if (sharedPreferences3 != null && (edit = sharedPreferences3.edit()) != null) {
            edit.putInt("num_statuses_received_key", i3 + i);
            edit.putStringSet("contacts_with_statuses_key", A002);
            edit.putInt("num_statuses_viewed_key", i4 + i2);
            edit.putStringSet("contacts_with_statuses_viewed_key", A003);
            edit.apply();
        }
    }

    public final Set A00(String str) {
        Set<String> stringSet;
        SharedPreferences sharedPreferences = (SharedPreferences) this.A03.getValue();
        if (sharedPreferences == null || (stringSet = sharedPreferences.getStringSet(str, new HashSet())) == null) {
            return new HashSet();
        }
        return C007103b.A0e(stringSet);
    }
}
