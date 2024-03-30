package com.whatsapp.support.faq;

import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass1CF;
import X.AnonymousClass1N6;
import X.AnonymousClass27t;
import X.AnonymousClass2OI;
import X.AnonymousClass3DY;
import X.AnonymousClass3FE;
import X.AnonymousClass3GU;
import X.AnonymousClass3XR;
import X.AnonymousClass4S7;
import X.AnonymousClass4VV;
import X.AnonymousClass737;
import X.C18740tg;
import X.C1906499t;
import X.C21010yW;
import X.C21060yb;
import X.C21100yf;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C37771nB;
import X.C606238o;
import X.C67103Yn;
import X.C81203wd;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SearchFAQ extends AnonymousClass27t implements AnonymousClass4S7 {
    public int A00;
    public AnonymousClass3DY A01;
    public C21010yW A02;
    public AnonymousClass1CF A03;
    public AnonymousClass3FE A04;
    public AnonymousClass1N6 A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public HashMap A0A;
    public HashSet A0B;
    public List A0C;
    public AnonymousClass3GU A0D;

    public void Beo(boolean z) {
        A0u(3);
        if (z) {
            C36331k8.A0m(this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            long longExtra = intent.getLongExtra("total_time_spent", 0);
            long longExtra2 = intent.getLongExtra("article_id", -1);
            HashMap hashMap = this.A0A;
            Long valueOf = Long.valueOf(longExtra2);
            if (hashMap.containsKey(valueOf)) {
                longExtra += C36431kI.A09(this.A0A.get(valueOf));
            }
            C36421kH.A1K(valueOf, this.A0A, longExtra);
            TextUtils.join(", ", this.A0A.entrySet());
            Iterator A10 = C36391kE.A10(this.A0A);
            while (A10.hasNext()) {
                A10.next();
            }
        }
    }

    public void onBackPressed() {
        A0u(2);
        super.onBackPressed();
    }

    private void A0u(int i) {
        AnonymousClass2OI r2 = new AnonymousClass2OI();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = this.A00.A06();
        C81203wd.A02(this.A04, this, r2, 35);
    }

    public static void A0v(C606238o r5, SearchFAQ searchFAQ) {
        HashSet hashSet = searchFAQ.A0B;
        String str = r5.A03;
        hashSet.add(str);
        String str2 = r5.A02;
        String str3 = r5.A01;
        long j = r5.A00;
        Intent A0E = C36381kD.A0E(searchFAQ, str2, str3, str);
        A0E.putExtra("article_id", j);
        searchFAQ.startActivityForResult(A0E, 1);
        searchFAQ.overridePendingTransition(R.anim.f1nameremoved, R.anim.f1nameremoved);
    }

    public void A2W() {
        this.A05.A03((AnonymousClass11F) null, 79);
    }

    public boolean A2f() {
        if ("payments:settings".equals(this.A06)) {
            return this.A0D.A0E(7019);
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        int i = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow", false);
        setTitle(R.string.f12nameremoved);
        getSupportActionBar().A0U(true);
        setContentView((int) R.layout.f9nameremoved);
        this.A0B = C36441kJ.A16();
        if (bundle != null) {
            String[] stringArray = bundle2.getStringArray("FaqItemsReadTitles");
            if (stringArray != null) {
                Collections.addAll(this.A0B, stringArray);
            }
            if (bundle2.containsKey("timeSpentPerArticle")) {
                HashMap hashMap = (HashMap) bundle2.getSerializable("timeSpentPerArticle");
                this.A0A = hashMap;
                hashMap.size();
            }
        }
        Intent intent = getIntent();
        this.A06 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.from");
        ArrayList A0I = AnonymousClass001.A0I();
        if (this.A0A == null) {
            this.A0A = AnonymousClass001.A0J();
        }
        int intExtra = intent.getIntExtra("com.whatsapp.support.faq.SearchFAQ.count", 0);
        this.A00 = intExtra;
        if (booleanExtra) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("payments_support_faqs");
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("payments_support_topics");
            Bundle bundleExtra = intent.getBundleExtra("describe_problem_bundle");
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                AnonymousClass3XR r1 = (AnonymousClass3XR) it.next();
                A0I.add(new C606238o(Long.parseLong(r1.A01), r1.A02, r1.A00, r1.A03));
            }
            obj = new AnonymousClass737(this, parcelableArrayListExtra2, bundleExtra, 12);
        } else {
            this.A07 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.problem");
            this.A08 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.status");
            this.A09 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails");
            if (stringArrayExtra != null) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (String split : stringArrayExtra) {
                    String[] split2 = split.split(":");
                    if (split2.length == 2) {
                        C36361kB.A1O(split2[0], split2[1], A0I2);
                    }
                }
                this.A0C = A0I2;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls");
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids");
            if (!(stringArrayListExtra == null || stringArrayListExtra2 == null || stringArrayListExtra3 == null || stringArrayListExtra4 == null)) {
                if (stringArrayListExtra.size() < intExtra) {
                    intExtra = stringArrayListExtra.size();
                }
                if (stringArrayListExtra2.size() < intExtra) {
                    intExtra = stringArrayListExtra2.size();
                }
                if (stringArrayListExtra3.size() < intExtra) {
                    intExtra = stringArrayListExtra3.size();
                }
                if (stringArrayListExtra4.size() < intExtra) {
                    intExtra = stringArrayListExtra4.size();
                }
                for (int i2 = 0; i2 < intExtra; i2++) {
                    long parseLong = Long.parseLong(C36421kH.A0e(stringArrayListExtra4, i2));
                    stringArrayListExtra.get(i2);
                    stringArrayListExtra3.get(i2);
                    A0I.add(new C606238o(parseLong, C36421kH.A0e(stringArrayListExtra, i2), C36421kH.A0e(stringArrayListExtra2, i2), C36421kH.A0e(stringArrayListExtra3, i2)));
                }
            }
            obj = new C81203wd(this, intent, 34);
        }
        C37771nB r8 = new C37771nB(this, this, A0I);
        ListView listView = getListView();
        LayoutInflater layoutInflater = (LayoutInflater) C21060yb.A02(this, "layout_inflater");
        C18740tg.A06(layoutInflater);
        listView.addHeaderView(layoutInflater.inflate(R.layout.f9nameremoved, (ViewGroup) null), (Object) null, false);
        A3i(r8);
        registerForContextMenu(listView);
        if (A0I.size() == 1) {
            A0v((C606238o) A0I.get(0), this);
        }
        View findViewById = findViewById(R.id.bottom_button_container);
        AnonymousClass3GU A002 = AnonymousClass3GU.A00(this, listView, findViewById);
        this.A0D = A002;
        A002.A01();
        this.A0D.A02(this, new AnonymousClass4VV(this, obj, 4), C36391kE.A0Q(this, R.id.does_not_match_button), getString(R.string.f12nameremoved), R.style.f13nameremoved);
        C67103Yn.A00(this.A0D.A01, obj, 34);
        if (C1906499t.A00(this.A06) && this.A06.A09(C21100yf.A0d)) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            HashSet hashSet = this.A0B;
            if (hashSet != null && hashSet.size() > 0) {
                bundle.putStringArray("FaqItemsReadTitles", C36371kC.A1b(this.A0B, 0));
            }
            HashMap hashMap = this.A0A;
            if (hashMap != null && hashMap.size() > 0) {
                bundle.putSerializable("timeSpentPerArticle", hashMap);
            }
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0D.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A0u(2);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
