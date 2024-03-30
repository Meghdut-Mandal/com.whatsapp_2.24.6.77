package X;

import android.content.SharedPreferences;

/* renamed from: X.6zP  reason: invalid class name and case insensitive filesystem */
public class C148776zP implements C158537hf {
    public final C19900wh A00;

    public void BRD() {
        SharedPreferences sharedPreferences = this.A00.A01;
        C36331k8.A0w(sharedPreferences.edit(), "force_db_check", true);
        C36331k8.A0w(sharedPreferences.edit(), "force_wadb_check", true);
    }

    public C148776zP(C19900wh r1) {
        this.A00 = r1;
    }
}
