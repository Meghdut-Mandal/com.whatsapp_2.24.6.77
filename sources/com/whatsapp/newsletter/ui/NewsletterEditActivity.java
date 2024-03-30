package com.whatsapp.newsletter.ui;

import X.AnonymousClass141;
import X.AnonymousClass1N6;
import X.AnonymousClass1RY;
import X.B7Y;
import X.C03570Gk;
import X.C165567td;
import X.C165577te;
import X.C173848Tj;
import X.C178248fc;
import X.C187968yp;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C44072La;
import X.C90504aG;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import java.io.File;

public final class NewsletterEditActivity extends C178248fc {
    public AnonymousClass1RY A00;
    public C27731Pn A01;
    public C187968yp A02;
    public AnonymousClass1N6 A03;
    public boolean A04;

    public boolean A2g() {
        return true;
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A08 = C36351kA.A0a(r2);
            C173848Tj.A01(A0L, r2, this);
            this.A01 = C165577te.A0Q(r2);
            this.A03 = C90504aG.A0V(r2);
        }
    }

    public void A2X() {
        AnonymousClass1N6 r2 = this.A03;
        if (r2 != null) {
            r2.A03(this.A0B, 32);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public File A3m() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 2) {
            return super.A3m();
        }
        if (ordinal == 1) {
            return null;
        }
        throw C36441kJ.A18();
    }

    public boolean A3v() {
        String str;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            C44072La A3k = A3k();
            if (A3k == null || (str = A3k.A0M) == null || str.length() == 0) {
                return false;
            }
            return true;
        } else if (ordinal == 2) {
            return super.A3v();
        } else {
            if (ordinal == 1) {
                return false;
            }
            throw C36441kJ.A18();
        }
    }

    public NewsletterEditActivity(int i) {
        this.A04 = false;
        B7Y.A00(this, 20);
    }

    public void A3p() {
        super.A3p();
        this.A02 = C187968yp.UPDATED;
    }

    public void A3q() {
        super.A3q();
        this.A02 = C187968yp.UPDATED;
    }

    public void A3r() {
        super.A3r();
        this.A02 = C187968yp.DELETED;
    }

    public void A3s() {
        super.A3s();
        ((TextView) C03570Gk.A0B(this, R.id.newsletter_save_button)).setText(R.string.f12nameremoved);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String A0y;
        super.onCreate(bundle);
        C27731Pn r1 = this.A01;
        if (r1 != null) {
            this.A00 = r1.A03(this, this, "newsletter-edit");
            if (this.A0B == null) {
                finish();
            } else {
                C44072La A3k = A3k();
                if (A3k != null) {
                    WaEditText A3j = A3j();
                    String str3 = A3k.A0K;
                    String str4 = "";
                    if (str3 == null || (str = C36371kC.A0y(str3)) == null) {
                        str = str4;
                    }
                    A3j.setText(str);
                    WaEditText A3i = A3i();
                    String str5 = A3k.A0H;
                    if (!(str5 == null || (A0y = C36371kC.A0y(str5)) == null)) {
                        str4 = A0y;
                    }
                    A3i.setText(str4);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    AnonymousClass1RY r2 = this.A00;
                    if (r2 == null) {
                        throw C36331k8.A0d("contactPhotoLoader");
                    }
                    AnonymousClass141 r12 = new AnonymousClass141(this.A0B);
                    C44072La A3k2 = A3k();
                    if (!(A3k2 == null || (str2 = A3k2.A0K) == null)) {
                        r12.A0P = str2;
                    }
                    ImageView imageView = this.A00;
                    if (imageView != null) {
                        r2.A09(imageView, r12, dimensionPixelSize);
                    } else {
                        throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                    }
                }
            }
            if (bundle != null) {
                this.A02 = C187968yp.values()[bundle.getInt("photo_state", 0)];
                return;
            }
            return;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        C36321k7.A0w(bundle, persistableBundle);
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putInt("photo_state", this.A02.ordinal());
    }

    public NewsletterEditActivity() {
        this(0);
        this.A02 = C187968yp.UNCHANGED;
    }
}
