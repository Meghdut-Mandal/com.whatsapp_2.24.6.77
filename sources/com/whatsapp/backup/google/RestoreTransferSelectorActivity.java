package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass4IW;
import X.C18800tq;
import X.C18830tt;
import X.C21520zN;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C39561sf;
import X.C55492ui;
import X.C65983Uf;
import X.C89314Wb;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import java.util.List;

public final class RestoreTransferSelectorActivity extends AnonymousClass155 {
    public C39561sf A00;
    public C21520zN A01;
    public boolean A02;
    public final List A03;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36401kF.A0Y(A0B);
        }
    }

    public RestoreTransferSelectorActivity(int i) {
        this.A02 = false;
        C89314Wb.A00(this, 21);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String string;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C21520zN r0 = this.A01;
        if (r0 != null) {
            C65983Uf.A0O(this, r0, R.id.title);
            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) C36361kB.A0D(this, R.id.restore_option);
            Bundle A0H = C36371kC.A0H(this);
            if (A0H != null) {
                str = A0H.getString("backup_time");
            } else {
                str = null;
            }
            if (str != null) {
                string = C36351kA.A0w(this, str, 1, R.string.f12nameremoved);
            } else {
                string = getString(R.string.f12nameremoved);
            }
            AnonymousClass00C.A0B(string);
            String A0m = C36361kB.A0m(this, R.string.f12nameremoved);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(string);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(A0m);
            listItemWithLeftIcon.A06(spannableStringBuilder, false);
            ((ListItemWithLeftIcon) C36361kB.A0D(this, R.id.transfer_option)).A06(Html.fromHtml(getString(R.string.f12nameremoved)), false);
            Integer[] numArr = new Integer[2];
            if (str != null) {
                AnonymousClass000.A1L(numArr, 1, 0);
                i = 0;
            } else {
                AnonymousClass000.A1L(numArr, 2, 0);
                i = 1;
            }
            List A0m2 = C36341k9.A0m(i, numArr, 1);
            List list = this.A03;
            list.add(listItemWithLeftIcon);
            list.add(C36361kB.A0D(this, R.id.transfer_option));
            C36421kH.A10(C36361kB.A0D(this, R.id.continue_button), this, 13);
            C36421kH.A10(C36361kB.A0D(this, R.id.skip_button), this, 12);
            C39561sf r02 = (C39561sf) C36441kJ.A0b(this).A00(C39561sf.class);
            this.A00 = r02;
            if (r02 != null) {
                C55492ui.A01(this, r02.A02, new AnonymousClass4IW(this), 14);
            }
            C39561sf r4 = this.A00;
            if (r4 != null && !r4.A01) {
                int i2 = 0;
                int size = A0m2.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (C36351kA.A06(A0m2, i2) == 1) {
                        r4.A00 = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                r4.A02.A0C(A0m2);
                r4.A01 = true;
                return;
            }
            return;
        }
        throw C36331k8.A0d("abPreChatdProps");
    }

    public RestoreTransferSelectorActivity() {
        this(0);
        this.A03 = AnonymousClass001.A0I();
    }
}
