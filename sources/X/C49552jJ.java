package X;

import com.whatsapp.R;
import com.whatsapp.settings.SettingsPrivacy;
import java.util.Map;

/* renamed from: X.2jJ  reason: invalid class name and case insensitive filesystem */
public class C49552jJ extends C132446Tt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6FH A01;
    public final /* synthetic */ SettingsPrivacy A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49552jJ(AnonymousClass012 r2, AnonymousClass6FH r3, SettingsPrivacy settingsPrivacy, String str, Map map, int i) {
        super(r2, true);
        this.A02 = settingsPrivacy;
        this.A01 = r3;
        this.A00 = i;
        this.A04 = map;
        this.A03 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Integer.valueOf(this.A01.A04().size());
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C18820ts r4;
        int i;
        String A0L;
        int i2;
        Number number = (Number) obj;
        int i3 = this.A00;
        int intValue = number.intValue();
        SettingsPrivacy settingsPrivacy = this.A02;
        if (i3 == 3) {
            if (intValue == 0) {
                i2 = R.string.f12nameremoved;
            } else {
                r4 = settingsPrivacy.A00;
                i = R.plurals.f10nameremoved;
                long j = (long) intValue;
                A0L = r4.A0L(new Object[]{number}, i, j);
                Map map = this.A04;
                String str = this.A03;
                map.put(str, A0L);
                SettingsPrivacy.A0J(settingsPrivacy, str, A0L);
            }
        } else if (intValue == 0) {
            i2 = R.string.f12nameremoved;
        } else {
            r4 = settingsPrivacy.A00;
            i = R.plurals.f10nameremoved;
            long j2 = (long) intValue;
            A0L = r4.A0L(new Object[]{number}, i, j2);
            Map map2 = this.A04;
            String str2 = this.A03;
            map2.put(str2, A0L);
            SettingsPrivacy.A0J(settingsPrivacy, str2, A0L);
        }
        A0L = settingsPrivacy.getString(i2);
        Map map22 = this.A04;
        String str22 = this.A03;
        map22.put(str22, A0L);
        SettingsPrivacy.A0J(settingsPrivacy, str22, A0L);
    }
}
