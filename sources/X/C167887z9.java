package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7z9  reason: invalid class name and case insensitive filesystem */
public final class C167887z9 extends Preference {
    public long A00;

    public C167887z9(Context context, List list, long j) {
        super(context, (AttributeSet) null);
        this.A01 = R.layout.f9nameremoved;
        A09(R.drawable.ic_arrow_down_24dp);
        Context context2 = this.A05;
        A0I(context2.getString(R.string.f12nameremoved));
        if (999 != this.A02) {
            this.A02 = 999;
            A06();
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.A0F;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                A0I.add(preference);
            }
            if (A0I.contains(preference.A0D)) {
                if (z) {
                    A0I.add(preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    Object[] A0M = AnonymousClass001.A0M();
                    C36331k8.A1N(charSequence, charSequence2, A0M);
                    charSequence = context2.getString(R.string.f12nameremoved, A0M);
                }
            }
        }
        A0H(charSequence);
        this.A00 = j + SearchActionVerificationClientService.MS_TO_NS;
    }

    public void A0G(AnonymousClass80G r2) {
        super.A0G(r2);
        r2.A00 = false;
    }
}
