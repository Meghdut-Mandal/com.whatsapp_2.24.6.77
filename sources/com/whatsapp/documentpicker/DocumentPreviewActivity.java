package com.whatsapp.documentpicker;

import X.AnonymousClass001;
import X.AnonymousClass14B;
import X.AnonymousClass1Ax;
import X.AnonymousClass1GX;
import X.AnonymousClass1UM;
import X.AnonymousClass1XY;
import X.AnonymousClass3MS;
import X.AnonymousClass3TF;
import X.AnonymousClass5ME;
import X.AnonymousClass6YY;
import X.C012005e;
import X.C100794vk;
import X.C157337cn;
import X.C163027pX;
import X.C18800tq;
import X.C18830tt;
import X.C25561Gu;
import X.C25571Gv;
import X.C25591Gx;
import X.C27111My;
import X.C28781Ua;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C60963Aa;
import X.C64883Pu;
import X.C90464aC;
import X.C90474aD;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;

public class DocumentPreviewActivity extends C100794vk implements C157337cn {
    public AnonymousClass1XY A00;
    public C25561Gu A01;
    public boolean A02;

    public void BaW(File file, String str) {
        File file2 = file;
        String str2 = str;
        super.BaW(file, str);
        if (isFinishing()) {
            return;
        }
        if (this.A01.A03(str)) {
            this.A04.Bp0(new AnonymousClass5ME(this, this, this.A01, file2, str2), new Void[0]);
            return;
        }
        this.A00.setVisibility(8);
        this.A02.setVisibility(8);
        A0F(this, file, str);
    }

    public static void A0F(DocumentPreviewActivity documentPreviewActivity, File file, String str) {
        View inflate = ((ViewStub) C012005e.A02(documentPreviewActivity.A0Q, R.id.view_stub_for_document_info)).inflate();
        C36401kF.A0G(inflate, R.id.document_icon).setImageDrawable(AnonymousClass3MS.A01(documentPreviewActivity, str, (String) null, true));
        TextView A0O = C36391kE.A0O(inflate, R.id.document_file_name);
        String A0D = AnonymousClass14B.A0D(documentPreviewActivity.A01(), 150);
        A0O.setText(A0D);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.document_info_text);
        String upperCase = AnonymousClass1Ax.A02(str).toUpperCase(Locale.US);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(A0D)) {
            upperCase = AnonymousClass6YY.A07(A0D).toUpperCase(Locale.US);
        }
        int i = 0;
        if (file != null) {
            C36391kE.A0O(inflate, R.id.document_size).setText(AnonymousClass3TF.A02(documentPreviewActivity.A00, file.length()));
            try {
                i = C25561Gu.A04.A07(file, str);
            } catch (C25591Gx e) {
                Log.e("DocumentPreviewActivity/addStaticDocInfoView/ could not get page count", e);
            }
        }
        String A03 = C25571Gv.A03(documentPreviewActivity.A00, str, i);
        if (!TextUtils.isEmpty(A03)) {
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(A03, upperCase, A0M);
            upperCase = documentPreviewActivity.getString(R.string.f12nameremoved, A0M);
        }
        A0O2.setText(upperCase);
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C90464aC.A11(r1, this);
            C18830tt r2 = r1.A00;
            C90464aC.A0y(r1, r2, this, C36321k7.A05(r1, r2, this));
            C100794vk.A07(r1, this, C36351kA.A0a(r1));
            this.A09 = C36371kC.A0b(r2);
            this.A0K = (C28781Ua) r1.A9d.get();
            this.A03 = C36341k9.A0R(r1);
            this.A04 = C36341k9.A0S(r1);
            this.A0J = (AnonymousClass1UM) r1.A3S.get();
            this.A0I = (AnonymousClass1GX) r1.A4k.get();
            this.A0C = C36351kA.A0f(r2);
            this.A0E = C36351kA.A0m(r1);
            this.A0F = (C64883Pu) r2.ACT.get();
            this.A0A = C36351kA.A0c(r2);
            this.A0D = C27111My.A2d(A0L);
            this.A05 = C90474aD.A0R(r2);
            this.A00 = (AnonymousClass1XY) r1.A7c.get();
            this.A01 = (C25561Gu) r1.AG8.get();
        }
    }

    public DocumentPreviewActivity(int i) {
        this.A02 = false;
        C163027pX.A00(this, 26);
    }

    private String A01() {
        if (getIntent().getParcelableExtra("uri") == null) {
            return getString(R.string.f12nameremoved);
        }
        return C25571Gv.A02((Uri) getIntent().getParcelableExtra("uri"), this.A08);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(A01());
    }

    public void onDestroy() {
        super.onDestroy();
        C60963Aa r2 = this.A0H;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A05.A0F();
            r2.A03.dismiss();
            this.A0H = null;
        }
    }

    public DocumentPreviewActivity() {
        this(0);
    }
}
