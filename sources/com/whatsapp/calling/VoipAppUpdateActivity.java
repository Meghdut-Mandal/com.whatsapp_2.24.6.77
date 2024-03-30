package com.whatsapp.calling;

import X.AnonymousClass4PP;
import X.AnonymousClass4ZB;
import X.C03570Gk;
import X.C18740tg;
import X.C18800tq;
import X.C224914p;
import X.C33771fu;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C48892iE;
import X.C585730f;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Locale;

public class VoipAppUpdateActivity extends C224914p {
    public C33771fu A00;
    public C585730f A01;
    public boolean A02;
    public final AnonymousClass4PP A03;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B);
            this.A00 = C36351kA.A0P(A0B);
            this.A01 = (C585730f) A0B.A00.A5s.get();
        }
    }

    public VoipAppUpdateActivity(int i) {
        this.A02 = false;
        C89314Wb.A00(this, 32);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getIntent().hasExtra("feature") || getIntent().hasExtra("feature_type")) {
            C36341k9.A0r(this, getWindow(), R.color.f6nameremoved);
            getWindow().addFlags(2621440);
            setContentView((int) R.layout.f9nameremoved);
            C48892iE.A00(C03570Gk.A0B(this, R.id.cancel), this, 16);
            C48892iE.A00(C03570Gk.A0B(this, R.id.upgrade), this, 17);
            C585730f r0 = this.A01;
            r0.A00.add(this.A03);
            boolean hasExtra = getIntent().hasExtra("feature_type");
            Intent intent = getIntent();
            if (hasExtra) {
                i = intent.getIntExtra("feature_type", 0);
            } else {
                String upperCase = intent.getStringExtra("feature").toUpperCase(Locale.ROOT);
                if (!upperCase.equals("AUDIO_CHAT_RECEIVER")) {
                    i = 1;
                    if (!upperCase.equals("SCREEN_SHARING_RECEIVER")) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
            }
            TextView A0H = C36401kF.A0H(this, R.id.voip_app_update_dialog_title);
            int i2 = R.string.f12nameremoved;
            if (i != 2) {
                i2 = R.string.f12nameremoved;
            }
            A0H.setText(getString(i2));
            TextView A0H2 = C36401kF.A0H(this, R.id.voip_app_update_dialog_content);
            int i3 = R.string.f12nameremoved;
            if (i != 2) {
                i3 = R.string.f12nameremoved;
            }
            A0H2.setText(getString(i3));
            return;
        }
        C18740tg.A0D(false, "VoipAppUpdateActivity/onCreate no feature extra");
    }

    public void onDestroy() {
        super.onDestroy();
        C585730f r0 = this.A01;
        r0.A00.remove(this.A03);
    }

    public VoipAppUpdateActivity() {
        this(0);
        this.A03 = new AnonymousClass4ZB(this, 0);
    }
}
