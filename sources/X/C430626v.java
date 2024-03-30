package X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.profile.AboutStatusPrivacyActivity;
import com.whatsapp.profile.ProfilePhotoPrivacyActivity;

/* renamed from: X.26v  reason: invalid class name and case insensitive filesystem */
public abstract class C430626v extends AnonymousClass155 implements AnonymousClass4P2 {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public C27341Nv A05;
    public final AnonymousClass3GS A06 = new AnonymousClass3GS();

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    private void A01(RadioButton radioButton, int i) {
        if (radioButton != null) {
            radioButton.setVisibility(C36351kA.A00(AnonymousClass3TL.A03(A3i(), i) ? 1 : 0));
        }
    }

    private void A07(RadioButton radioButton, int i, int i2, boolean z) {
        if (i != i2 || !z) {
            radioButton.setChecked(AnonymousClass000.A1S(i, i2));
        } else {
            this.A06.A01(radioButton);
        }
    }

    public String A3i() {
        if (this instanceof ProfilePhotoPrivacyActivity) {
            return "profile";
        }
        if (this instanceof AboutStatusPrivacyActivity) {
            return "status";
        }
        if (this instanceof GroupAddPrivacyActivity) {
            return "groupadd";
        }
        return "stickers";
    }

    public void A3j() {
        String A3i = A3i();
        int A002 = this.A05.A00(A3i);
        boolean z = true;
        if (this.A05.A02.get(A3i) == null) {
            z = false;
            this.A06.A00();
        }
        A07(this.A01, A002, 1, z);
        A07(this.A00, A002, 0, z);
        A07(this.A03, A002, 2, z);
        A07(this.A02, A002, 3, z);
        RadioButton radioButton = this.A04;
        if (radioButton != null) {
            A07(radioButton, A002, 6, z);
        }
    }

    public void BgP() {
        A3j();
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        super.onCreate(bundle);
        boolean z = this instanceof ProfilePhotoPrivacyActivity;
        if (z) {
            i = R.layout.f9nameremoved;
        } else {
            i = R.layout.f9nameremoved;
        }
        setContentView(i);
        AnonymousClass07B A0N = C36341k9.A0N(this);
        if (z) {
            i2 = R.string.f12nameremoved;
        } else if (this instanceof AboutStatusPrivacyActivity) {
            i2 = R.string.f12nameremoved;
        } else if (this instanceof GroupAddPrivacyActivity) {
            i2 = R.string.f12nameremoved;
        } else {
            i2 = R.string.f12nameremoved;
        }
        A0N.A0I(i2);
        this.A01 = (RadioButton) findViewById(R.id.my_contacts_button);
        this.A00 = (RadioButton) findViewById(R.id.everyone_btn);
        this.A02 = (RadioButton) findViewById(R.id.my_contacts_except_button);
        this.A03 = (RadioButton) findViewById(R.id.nobody_btn);
        this.A04 = (RadioButton) findViewById(R.id.selected_contacts_button);
        TextView A0Q = C36391kE.A0Q(this, R.id.header);
        if (z) {
            i3 = R.string.f12nameremoved;
        } else if (this instanceof AboutStatusPrivacyActivity) {
            i3 = R.string.f12nameremoved;
        } else if (this instanceof GroupAddPrivacyActivity) {
            i3 = R.string.f12nameremoved;
        } else {
            i3 = R.string.f12nameremoved;
        }
        A0Q.setText(i3);
        if (z || (this instanceof AboutStatusPrivacyActivity)) {
            C36331k8.A11(this, R.id.footer);
        } else {
            if (this instanceof GroupAddPrivacyActivity) {
                i4 = R.string.f12nameremoved;
            } else {
                i4 = R.string.f12nameremoved;
            }
            C36391kE.A0Q(this, R.id.footer).setText(i4);
        }
        this.A01.setText(R.string.f12nameremoved);
        this.A00.setText(R.string.f12nameremoved);
        this.A02.setText(R.string.f12nameremoved);
        this.A03.setText(R.string.f12nameremoved);
        RadioButton radioButton = this.A04;
        if (radioButton != null) {
            radioButton.setText(R.string.f12nameremoved);
        }
        AnonymousClass3Y5.A00(this.A01, this, 9);
        AnonymousClass3Y5.A00(this.A00, this, 10);
        AnonymousClass3Y5.A00(this.A02, this, 11);
        AnonymousClass3Y5.A00(this.A03, this, 12);
        RadioButton radioButton2 = this.A04;
        if (radioButton2 != null) {
            AnonymousClass3Y5.A00(radioButton2, this, 13);
        }
        A01(this.A01, 1);
        A01(this.A00, 0);
        A01(this.A03, 2);
        A01(this.A02, 3);
        A01(this.A04, 6);
    }

    public void onPause() {
        super.onPause();
        this.A05.A03.remove(this);
    }

    public void onResume() {
        super.onResume();
        this.A05.A03.add(this);
        A3j();
    }
}
