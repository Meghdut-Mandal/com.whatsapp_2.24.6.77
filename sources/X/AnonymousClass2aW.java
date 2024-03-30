package X;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.privacy.checkup.PrivacyCheckupAudienceFragment;
import com.whatsapp.privacy.checkup.PrivacyCheckupContactFragment;
import com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity;
import com.whatsapp.privacy.checkup.PrivacyCheckupHomeFragment;
import com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment;
import com.whatsapp.privacy.checkup.PrivacyCheckupMoreSecurityFragment;

/* renamed from: X.2aW  reason: invalid class name */
public abstract class AnonymousClass2aW extends AnonymousClass24X {
    public C27341Nv A00;
    public AnonymousClass1YV A01;

    public void onCreate(Bundle bundle) {
        AnonymousClass02E r4;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        boolean z = this instanceof PrivacyCheckupHomeActivity;
        int intExtra = getIntent().getIntExtra("ENTRY_POINT", -1);
        if (z) {
            r4 = new PrivacyCheckupHomeFragment();
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("extra_entry_point", intExtra);
            r4.A17(A07);
        } else {
            int A02 = C36431kI.A02(getIntent(), "DETAIL_CATEGORY");
            if (A02 == 1) {
                r4 = new PrivacyCheckupContactFragment();
            } else if (A02 == 2) {
                r4 = new PrivacyCheckupAudienceFragment();
            } else if (A02 == 3) {
                r4 = new PrivacyCheckupMorePrivacyFragment();
            } else if (A02 != 4) {
                finish();
                return;
            } else {
                r4 = new PrivacyCheckupMoreSecurityFragment();
            }
            Bundle A072 = AnonymousClass001.A07();
            A072.putInt("extra_entry_point", intExtra);
            r4.A17(A072);
        }
        Toolbar A0R = C36411kG.A0R(this);
        if (A0R != null) {
            A0R.setTitle((CharSequence) getString(R.string.f12nameremoved));
            C36331k8.A0s(getApplicationContext(), A0R, this.A00, R.drawable.ic_back);
            setSupportActionBar(A0R);
        }
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        if (z) {
            str = "PrivacyCheckupHomeFragment";
        } else {
            int A022 = C36431kI.A02(getIntent(), "DETAIL_CATEGORY");
            if (A022 == 1) {
                str = "PrivacyCheckupContactFragment";
            } else if (A022 == 2) {
                str = "PrivacyCheckupAudienceFragment";
            } else if (A022 == 3) {
                str = "PrivacyCheckupMorePrivacyFragment";
            } else if (A022 != 4) {
                str = "";
            } else {
                str = "PrivacyCheckupMoreSecurityFragment";
            }
        }
        A0O.A0F(r4, str, R.id.privacy_checkup_fragment_container);
        A0O.A01();
    }
}
