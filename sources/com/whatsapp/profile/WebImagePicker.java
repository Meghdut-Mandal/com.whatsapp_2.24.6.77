package com.whatsapp.profile;

import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass06T;
import X.AnonymousClass07B;
import X.AnonymousClass0WX;
import X.AnonymousClass13E;
import X.AnonymousClass22g;
import X.AnonymousClass3TB;
import X.AnonymousClass3Y5;
import X.AnonymousClass658;
import X.AnonymousClass6CW;
import X.AnonymousClass6UC;
import X.AnonymousClass76B;
import X.C011504z;
import X.C106905Lu;
import X.C107105Mo;
import X.C111155bp;
import X.C136216dx;
import X.C163037pY;
import X.C18800tq;
import X.C18830tt;
import X.C194039Nw;
import X.C19630wG;
import X.C20020wt;
import X.C20050ww;
import X.C226515g;
import X.C24341Cb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C53192qv;
import X.C62503Gk;
import X.C65123Qv;
import X.C90464aC;
import X.C90494aF;
import X.C90504aG;
import X.C92684eN;
import X.C93234gC;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class WebImagePicker extends AnonymousClass22g {
    public int A00;
    public int A01;
    public Uri A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public ProgressBar A06;
    public C20050ww A07;
    public C24341Cb A08;
    public C19630wG A09;
    public AnonymousClass13E A0A;
    public C107105Mo A0B;
    public C194039Nw A0C;
    public AnonymousClass6CW A0D;
    public C20020wt A0E;
    public File A0F;
    public SearchView A0G;
    public C92684eN A0H;
    public boolean A0I;
    public final ArrayList A0J;
    public final C226515g A0K;

    public static void A0v(WebImagePicker webImagePicker) {
        String A0n = C36361kB.A0n(webImagePicker.A0G.A0d);
        if (TextUtils.isEmpty(A0n)) {
            webImagePicker.A05.A06(R.string.f12nameremoved, 0);
            return;
        }
        webImagePicker.A0C.A01(webImagePicker.A0G);
        webImagePicker.A06.setVisibility(0);
        C36391kE.A1K((TextView) webImagePicker.getListView().getEmptyView());
        C92684eN r3 = webImagePicker.A0H;
        if (A0n != null) {
            C106905Lu r0 = r3.A00;
            if (r0 != null) {
                r0.A0D(false);
            }
            r3.A01 = true;
            WebImagePicker webImagePicker2 = r3.A02;
            webImagePicker2.A0C = new C194039Nw(webImagePicker2.A07, webImagePicker2.A09, webImagePicker2.A0A, A0n);
            webImagePicker2.A0J.clear();
            webImagePicker2.A0D.A02.A02(false);
            AnonymousClass658 r5 = new AnonymousClass658(webImagePicker2.A05, webImagePicker2.A07, webImagePicker2.A0A, webImagePicker2.A0F, "web-image-picker-adapter");
            r5.A00 = webImagePicker2.A01;
            r5.A01 = 4194304;
            r5.A03 = AnonymousClass00E.A00(webImagePicker2, R.drawable.gray_rectangle);
            r5.A02 = AnonymousClass00E.A00(webImagePicker2, R.drawable.ic_missing_thumbnail_picture);
            webImagePicker2.A0D = r5.A01();
        }
        C106905Lu r1 = new C106905Lu(r3);
        r3.A00 = r1;
        C36391kE.A1Q(r1, r3.A02.A04);
        if (A0n != null) {
            r3.notifyDataSetChanged();
        }
    }

    public void A2F() {
        if (!this.A0I) {
            this.A0I = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C90464aC.A0y(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            C53192qv.A00(this, new C62503Gk());
            this.A0E = C90504aG.A0X(A0B2);
            this.A09 = C36351kA.A0W(A0B2);
            this.A07 = C36381kD.A0U(A0B2);
            this.A0A = C90494aF.A0L(A0B2);
            this.A08 = C36431kI.A0a(A0B2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0v(this);
        } else {
            finish();
        }
    }

    public WebImagePicker(int i) {
        this.A0I = false;
        C163037pY.A00(this, 2);
    }

    private void A0u() {
        int A002 = (int) (C36341k9.A00(this) * 3.3333333f);
        this.A01 = C65123Qv.A01(this) + (((int) (C36341k9.A00(this) * 1.3333334f)) * 2) + A002;
        Point point = new Point();
        C36321k7.A0K(this, point);
        int i = point.x;
        int i2 = i / this.A01;
        this.A00 = i2;
        this.A01 = (i / i2) - A002;
        AnonymousClass6CW r0 = this.A0D;
        if (r0 != null) {
            r0.A02.A02(false);
        }
        AnonymousClass658 r2 = new AnonymousClass658(this.A05, this.A07, this.A0A, this.A0F, "web-image-picker");
        r2.A00 = this.A01;
        r2.A01 = 4194304;
        r2.A03 = AnonymousClass00E.A00(this, R.drawable.picture_loading);
        r2.A02 = AnonymousClass00E.A00(this, R.drawable.ic_missing_thumbnail_picture);
        this.A0D = r2.A01();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0u();
        this.A0H.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        this.A0F = C36441kJ.A0w(getCacheDir(), "Thumbs");
        AnonymousClass07B A0O = C36381kD.A0O(this);
        A0O.A0U(true);
        A0O.A0X(false);
        A0O.A0V(true);
        this.A0F.mkdirs();
        C194039Nw r0 = new C194039Nw(this.A07, this.A09, this.A0A, "");
        this.A0C = r0;
        File[] listFiles = r0.A06.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, AnonymousClass76B.A00);
            int i = 0;
            while (true) {
                int length = listFiles.length;
                if (i >= length) {
                    break;
                }
                File file = listFiles[i];
                if (i <= length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                    file.delete();
                }
                i++;
            }
        }
        setContentView((int) R.layout.f9nameremoved);
        this.A06 = (ProgressBar) findViewById(R.id.indefiniteProgressBar);
        String stringExtra = getIntent().getStringExtra("query");
        if (stringExtra != null) {
            stringExtra = AnonymousClass3TB.A03(stringExtra);
        }
        AnonymousClass0WX r02 = SearchView.A0o;
        C93234gC r7 = new C93234gC(A0O.A0A(), this);
        this.A0G = r7;
        TextView A0P = C36391kE.A0P(r7, R.id.search_src_text);
        int A012 = C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        A0P.setTextColor(A012);
        A0P.setHintTextColor(AnonymousClass00F.A00(this, R.color.f6nameremoved));
        ImageView A0N = C36391kE.A0N(r7, R.id.search_close_btn);
        AnonymousClass06T.A01(PorterDuff.Mode.SRC_IN, A0N);
        AnonymousClass06T.A00(ColorStateList.valueOf(A012), A0N);
        this.A0G.setQueryHint(getString(R.string.f12nameremoved));
        this.A0G.A0E();
        SearchView searchView = this.A0G;
        searchView.A05 = C136216dx.A00;
        searchView.A0I(stringExtra);
        SearchView searchView2 = this.A0G;
        searchView2.A03 = new AnonymousClass3Y5(this, 40);
        searchView2.A06 = new AnonymousClass6UC(this, 3);
        A0O.A0N(searchView2);
        Bundle A0H2 = C36371kC.A0H(this);
        if (A0H2 != null) {
            this.A02 = (Uri) A0H2.getParcelable("output");
        }
        ListView listView = getListView();
        listView.requestFocus();
        listView.setClickable(false);
        C011504z.A04((Drawable) null, listView);
        listView.setDividerHeight(0);
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, listView, false);
        listView.addFooterView(inflate, (Object) null, false);
        listView.setFooterDividersEnabled(false);
        this.A05 = inflate.findViewById(R.id.progress);
        this.A04 = inflate.findViewById(R.id.attribution);
        C92684eN r03 = new C92684eN(this);
        this.A0H = r03;
        A3i(r03);
        this.A03 = new AnonymousClass3Y5(this, 41);
        A0u();
        this.A08.A03(this.A0K);
        this.A0G.requestFocus();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.clear();
        this.A0D.A02.A02(true);
        C107105Mo r0 = this.A0B;
        if (r0 != null) {
            r0.A0D(true);
            Log.i("webimagesearch/cancel_image_download_task");
            if (this.A0B.A00 != null) {
                Log.i("webimagesearch/cancel_dialog");
                this.A0B.A00.dismiss();
                this.A0B.A00 = null;
            }
            this.A0B = null;
        }
        C106905Lu r1 = this.A0H.A00;
        if (r1 != null) {
            r1.A0D(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public WebImagePicker() {
        this(0);
        this.A0J = AnonymousClass001.A0I();
        this.A00 = 4;
        this.A0K = new C111155bp(this, 1);
    }
}
