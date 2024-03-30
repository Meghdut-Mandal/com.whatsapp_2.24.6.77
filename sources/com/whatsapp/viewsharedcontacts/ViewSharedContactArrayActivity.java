package com.whatsapp.viewsharedcontacts;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1A1;
import X.AnonymousClass1N4;
import X.AnonymousClass1ND;
import X.AnonymousClass1RY;
import X.AnonymousClass1X4;
import X.AnonymousClass1YI;
import X.AnonymousClass3QX;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C20310xM;
import X.C27731Pn;
import X.C32661dz;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C42411ym;
import X.C50002k2;
import X.C598935r;
import X.C606438u;
import X.C64933Qa;
import X.C64953Qc;
import X.C65643Sx;
import X.C66013Ui;
import X.C89374Wh;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ViewSharedContactArrayActivity extends AnonymousClass155 {
    public AnonymousClass1N4 A00;
    public AnonymousClass1X4 A01;
    public AnonymousClass1ND A02;
    public AnonymousClass16D A03;
    public AnonymousClass3QX A04;
    public AnonymousClass171 A05;
    public AnonymousClass1RY A06;
    public C27731Pn A07;
    public C64953Qc A08;
    public C19630wG A09;
    public C18820ts A0A;
    public C20310xM A0B;
    public AnonymousClass11F A0C;
    public AnonymousClass1A1 A0D;
    public C32661dz A0E;
    public AnonymousClass13J A0F;
    public AnonymousClass1YI A0G;
    public List A0H;
    public Pattern A0I;
    public C65643Sx A0J;
    public boolean A0K;
    public boolean A0L;
    public final ArrayList A0M;
    public final ArrayList A0N;
    public final ArrayList A0O;
    public final List A0P;

    public static String A07(ViewSharedContactArrayActivity viewSharedContactArrayActivity, Class cls, int i) {
        try {
            Method method = cls.getMethod("getTypeLabelResource", new Class[]{Integer.TYPE});
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, i, 0);
            return C36401kF.A0o(viewSharedContactArrayActivity.A0A.A00, ((Integer) method.invoke((Object) null, objArr)).intValue());
        } catch (Exception e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public static void A0G(C42411ym r4, ViewSharedContactArrayActivity viewSharedContactArrayActivity, String str, String str2, int i, int i2, boolean z) {
        TextView textView = r4.A04;
        if (i2 > 1) {
            textView.setMaxLines(i2);
            textView.setSingleLine(false);
        } else {
            textView.setSingleLine(true);
        }
        textView.setTextDirection(3);
        if (!str.equalsIgnoreCase("null")) {
            textView.setText(str);
        }
        if (str2 == null || str2.equalsIgnoreCase("null")) {
            r4.A03.setText(R.string.f12nameremoved);
        } else {
            r4.A03.setText(str2);
        }
        r4.A02.setImageResource(i);
        if (viewSharedContactArrayActivity.A0K) {
            CheckBox checkBox = r4.A01;
            checkBox.setChecked(z);
            checkBox.setClickable(false);
            checkBox.setVisibility(0);
            C36351kA.A1E(r4.A00, viewSharedContactArrayActivity, 8);
        }
    }

    public static void A0F(C42411ym r3) {
        r3.A05.setClickable(false);
        ImageView imageView = r3.A06;
        imageView.setVisibility(8);
        imageView.setClickable(false);
        ImageView imageView2 = r3.A07;
        imageView2.setVisibility(8);
        imageView2.setClickable(false);
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A09 = C36351kA.A0W(A0B2);
            this.A01 = C36361kB.A0T(A0B2);
            this.A0G = (AnonymousClass1YI) A0B2.A8s.get();
            this.A02 = C36391kE.A0Y(A0B2);
            this.A07 = C36351kA.A0T(A0B2);
            this.A03 = C36341k9.A0R(A0B2);
            this.A05 = C36341k9.A0S(A0B2);
            this.A0A = C36341k9.A0T(A0B2);
            this.A0F = C36351kA.A0q(A0B2);
            this.A0B = C36371kC.A0Z(A0B2);
            this.A0D = C36351kA.A0n(A0B2);
            this.A00 = C36351kA.A0K(A0B2);
            this.A04 = (AnonymousClass3QX) r1.ACH.get();
            this.A0E = C36371kC.A0k(A0B2);
            this.A08 = (C64953Qc) r1.A6G.get();
        }
    }

    public ViewSharedContactArrayActivity(int i) {
        this.A0L = false;
        C89374Wh.A00(this, 21);
    }

    public static C598935r A01(SparseArray sparseArray, int i) {
        C598935r r0 = (C598935r) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        C598935r r02 = new C598935r();
        sparseArray.put(i, r02);
        return r02;
    }

    public void A2x(int i) {
        if (i == R.string.f12nameremoved) {
            finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1 && this.A0J != null) {
                String str = null;
                if (!(intent == null || intent.getData() == null)) {
                    str = intent.getData().getLastPathSegment();
                }
                this.A04.A02(this.A0J.A03(), str, this.A0O, this.A0P);
            }
            this.A0E.A01();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A1W = C36381kD.A1W(this);
        Intent A0F2 = C36431kI.A0F(this, R.layout.f9nameremoved);
        String stringExtra = A0F2.getStringExtra("vcard");
        C64933Qa A0A2 = C66013Ui.A0A(A0F2.getBundleExtra("vcard_message"));
        List stringArrayListExtra = A0F2.getStringArrayListExtra("vcard_array");
        Uri uri = (Uri) A0F2.getParcelableExtra("vcard_uri");
        ArrayList parcelableArrayListExtra = A0F2.getParcelableArrayListExtra("vcard_sender_infos");
        if (stringExtra != null) {
            stringArrayListExtra = Collections.singletonList(stringExtra);
        }
        C606438u r8 = new C606438u(uri, A0A2, stringArrayListExtra, parcelableArrayListExtra);
        this.A06 = this.A07.A05(this, "view-shared-contact-array");
        this.A0K = getIntent().getBooleanExtra("edit_mode", A1W);
        this.A0C = C36331k8.A0F(this);
        this.A0H = r8.A02;
        C36331k8.A1F(new C50002k2(this.A03, this.A08, this.A09, this.A0A, this.A0D, this.A0G, r8, this), this.A04);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A02();
    }

    public ViewSharedContactArrayActivity() {
        this(0);
        this.A0M = AnonymousClass001.A0I();
        this.A0N = AnonymousClass001.A0I();
        this.A0P = AnonymousClass001.A0I();
        this.A0O = AnonymousClass001.A0I();
    }
}
