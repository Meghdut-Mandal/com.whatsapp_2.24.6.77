package com.whatsapp.inappsupport.ui;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass1CF;
import X.AnonymousClass3DY;
import X.AnonymousClass3UF;
import X.AnonymousClass3XH;
import X.AnonymousClass3Y3;
import X.C15770nx;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36431kI;
import X.C430324p;
import X.C53092ql;
import X.C66733Xc;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SupportTopicsActivity extends C430324p implements C15770nx {
    public int A00;
    public int A01;
    public MenuItem A02;
    public AnonymousClass3DY A03;
    public AnonymousClass1CF A04;
    public List A05;

    public void A3i(C66733Xc r14) {
        int i = this.A00;
        if (i == 1 || i == 2) {
            setResult(-1, C53092ql.A00(getIntent()));
            finish();
            return;
        }
        ArrayList A0r = C36361kB.A0r(this.A05);
        ArrayList A0r2 = C36361kB.A0r(this.A05);
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            if (((SupportTopicsFragment) this.A05.get(i2)).A00 != null) {
                C66733Xc r1 = ((SupportTopicsFragment) this.A05.get(i2)).A00;
                A0r.add(r1.A03);
                A0r2.add(r1.A02);
            }
        }
        if (r14 != null) {
            A0r.add(r14.A03);
            A0r2.add(r14.A02);
        }
        Bundle bundleExtra = getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle");
        Objects.requireNonNull(bundleExtra);
        String string = bundleExtra.getString("com.whatsapp.support.DescribeProblemActivity.from");
        AnonymousClass3DY r3 = this.A03;
        boolean A002 = this.A04.A00();
        if (string == null) {
            string = "support_topics";
        }
        Bundle bundleExtra2 = getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle");
        Objects.requireNonNull(bundleExtra2);
        startActivity(r3.A01(this, bundleExtra2, (AnonymousClass3XH) null, (Integer) null, string, (String) null, A0r2, A0r, A002));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15 && i2 == -1) {
            setResult(-1, C53092ql.A00(getIntent()));
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z;
        if (!this.A05.isEmpty()) {
            List list = this.A05;
            list.remove(C36431kI.A07(list));
            if (!this.A05.isEmpty()) {
                SupportTopicsFragment supportTopicsFragment = (SupportTopicsFragment) C36401kF.A0n(this.A05);
                MenuItem menuItem = this.A02;
                if (menuItem != null) {
                    C66733Xc r0 = supportTopicsFragment.A00;
                    if (r0 != null) {
                        z = r0.A06;
                    } else {
                        z = false;
                    }
                    menuItem.setVisible(z);
                }
            }
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 != 1) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.support_topic_skip);
        this.A02 = findItem;
        findItem.setVisible(false);
        return true;
    }

    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        this.A01 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        this.A00 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (this.A01 == 2) {
            String string = getString(R.string.f12nameremoved);
            setTheme(R.style.f13nameremoved);
            super.onCreate(bundle);
            setTitle(string);
            setContentView((int) R.layout.f9nameremoved);
            findViewById(R.id.toolbar_layout).setVisibility(0);
            Toolbar A0N = C36361kB.A0N(this);
            AnonymousClass3UF.A0C(this, A0N, this.A00);
            A0N.setTitle((CharSequence) string);
            A0N.setNavigationOnClickListener(new AnonymousClass3Y3(this, 26));
            setSupportActionBar(A0N);
            View findViewById = findViewById(R.id.contact_us_button);
            findViewById.setVisibility(0);
            AnonymousClass3Y3.A00(findViewById, this, 27);
        } else {
            super.onCreate(bundle);
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass07B supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0Q(getString(R.string.f12nameremoved));
                supportActionBar.A0U(true);
            }
        }
        this.A05 = AnonymousClass001.A0I();
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        ArrayList arrayList = supportFragmentManager.A0D;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0I();
            supportFragmentManager.A0D = arrayList;
        }
        arrayList.add(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics");
        Objects.requireNonNull(parcelableArrayListExtra);
        SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("parent_topic", (Parcelable) null);
        A07.putParcelableArrayList("topics", parcelableArrayListExtra);
        supportTopicsFragment.A17(A07);
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0A(supportTopicsFragment, R.id.support_topics_container);
        A0O.A01();
        this.A05.add(supportTopicsFragment);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && !this.A05.isEmpty()) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.support_topic_skip) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A3i((C66733Xc) null);
            return true;
        }
    }
}
