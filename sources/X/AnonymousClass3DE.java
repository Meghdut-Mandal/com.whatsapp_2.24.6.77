package X;

import org.json.JSONException;

/* renamed from: X.3DE  reason: invalid class name */
public final class AnonymousClass3DE {
    public final C19700wN A00;
    public final C20810yC A01;

    public final int A00(String str, int i) {
        String A19 = C36431kI.A19(this.A01, 3982);
        try {
            return C36441kJ.A1C(A19).optInt(str, i);
        } catch (JSONException unused) {
            this.A00.A0E("WABISurveyFeatureConfigParse", A19, false);
            return i;
        }
    }

    public AnonymousClass3DE(C19700wN r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
