package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3Ki  reason: invalid class name and case insensitive filesystem */
public final class C63513Ki {
    public JSONArray A00;
    public final C19420v0 A01;
    public final C21010yW A02;
    public final AnonymousClass3GT A03;

    public final void A02(int i) {
        AnonymousClass005 r4;
        synchronized (this) {
            C19420v0 r3 = this.A01;
            synchronized (r3.A01) {
                r4 = r3.A00;
                C36341k9.A0v(C19420v0.A00(r3), "sticker_suggestion_triggered_count", C36371kC.A01(C36391kE.A0H(r4), "sticker_suggestion_triggered_count") + 1);
            }
            JSONArray jSONArray = this.A00;
            if (jSONArray == null) {
                String string = C36391kE.A0H(r4).getString("sticker_suggestion_num_suggestions_array", "[]");
                AnonymousClass00C.A08(string);
                try {
                    jSONArray = new JSONArray(string);
                } catch (JSONException e) {
                    Log.e("StickerSuggestionLogger/getNumStickerSuggestionsJsonArray Error getting JSONArray", e);
                    jSONArray = new JSONArray();
                }
                this.A00 = jSONArray;
            }
            jSONArray.put(i);
            C36341k9.A0x(C19420v0.A00(r3), "sticker_suggestion_num_suggestions_array", String.valueOf(this.A00));
        }
    }

    public final void A00() {
        C19420v0 r1 = this.A01;
        synchronized (r1.A01) {
            C36341k9.A0v(C19420v0.A00(r1), "sticker_suggestion_icon_clicked_count", C36371kC.A01(C36341k9.A0E(r1), "sticker_suggestion_icon_clicked_count") + 1);
        }
    }

    public final void A01() {
        C19420v0 r1 = this.A01;
        synchronized (r1.A01) {
            C36341k9.A0v(C19420v0.A00(r1), "sticker_suggestion_sticker_sent_count", C36371kC.A01(C36341k9.A0E(r1), "sticker_suggestion_sticker_sent_count") + 1);
        }
    }

    public final void A03(Integer num, int i, int i2) {
        C45052Pw r1 = new C45052Pw();
        r1.A00 = num;
        r1.A01 = C36441kJ.A0y(i);
        r1.A02 = C36441kJ.A0y(i2);
        this.A02.Bly(r1);
    }

    public C63513Ki(C19420v0 r1, C21010yW r2, AnonymousClass3GT r3) {
        C36321k7.A11(r2, r1, r3);
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
