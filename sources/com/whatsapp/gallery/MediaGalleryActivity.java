package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass00I;
import X.AnonymousClass012;
import X.AnonymousClass026;
import X.AnonymousClass02E;
import X.AnonymousClass04F;
import X.AnonymousClass0Ey;
import X.AnonymousClass0UE;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17V;
import X.AnonymousClass17X;
import X.AnonymousClass185;
import X.AnonymousClass1A1;
import X.AnonymousClass1AW;
import X.AnonymousClass1CF;
import X.AnonymousClass1DW;
import X.AnonymousClass1EL;
import X.AnonymousClass1EO;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1JL;
import X.AnonymousClass1MP;
import X.AnonymousClass1N6;
import X.AnonymousClass1RC;
import X.AnonymousClass1S3;
import X.AnonymousClass1X4;
import X.AnonymousClass1X7;
import X.AnonymousClass1XY;
import X.AnonymousClass26l;
import X.AnonymousClass2JS;
import X.AnonymousClass3C3;
import X.AnonymousClass3HC;
import X.AnonymousClass3O0;
import X.AnonymousClass3PH;
import X.AnonymousClass3T1;
import X.AnonymousClass3T4;
import X.AnonymousClass3UF;
import X.AnonymousClass3UJ;
import X.AnonymousClass3XT;
import X.AnonymousClass4Q4;
import X.AnonymousClass4TA;
import X.AnonymousClass4W7;
import X.AnonymousClass4Z3;
import X.C001600r;
import X.C021809f;
import X.C17690rq;
import X.C177528dw;
import X.C18740tg;
import X.C18820ts;
import X.C19460v5;
import X.C19550w8;
import X.C19770wU;
import X.C20380xT;
import X.C20650xu;
import X.C20830yE;
import X.C21010yW;
import X.C21060yb;
import X.C21710zg;
import X.C220412q;
import X.C224514j;
import X.C235618y;
import X.C27111My;
import X.C33521fV;
import X.C33751fs;
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
import X.C36441kJ;
import X.C39371sA;
import X.C43692Jl;
import X.C53722rm;
import X.C53842ry;
import X.C57642ya;
import X.C62473Gh;
import X.C64613Or;
import X.C64883Pu;
import X.C64933Qa;
import X.C68383bo;
import X.C80243v5;
import X.C81703xR;
import X.C89004Uw;
import X.C89014Ux;
import X.C89144Vk;
import X.C89854Yd;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MediaGalleryActivity extends AnonymousClass26l implements C89004Uw {
    public int A00;
    public int A01 = 1;
    public int A02 = 2;
    public int A03 = 0;
    public MenuItem A04;
    public AnonymousClass0V9 A05;
    public C19460v5 A06;
    public C19460v5 A07;
    public C57642ya A08;
    public AnonymousClass1XY A09;
    public AnonymousClass1X4 A0A;
    public AnonymousClass16D A0B;
    public AnonymousClass185 A0C;
    public AnonymousClass171 A0D;
    public C235618y A0E;
    public C33751fs A0F;
    public AnonymousClass3HC A0G;
    public C62473Gh A0H;
    public AnonymousClass1MP A0I;
    public C20830yE A0J;
    public C220412q A0K;
    public C20650xu A0L;
    public AnonymousClass17X A0M;
    public C64613Or A0N;
    public AnonymousClass16J A0O;
    public AnonymousClass1DW A0P;
    public C21010yW A0Q;
    public AnonymousClass17V A0R;
    public C43692Jl A0S;
    public AnonymousClass1EL A0T;
    public AnonymousClass1JL A0U;
    public AnonymousClass1CF A0V;
    public AnonymousClass3O0 A0W;
    public AnonymousClass1AW A0X;
    public AnonymousClass1EO A0Y;
    public AnonymousClass1S3 A0Z = new AnonymousClass1S3(this.A00);
    public C64883Pu A0a;
    public AnonymousClass1HA A0b;
    public AnonymousClass1A1 A0c;
    public C20380xT A0d;
    public AnonymousClass1N6 A0e;
    public AnonymousClass1X7 A0f;
    public String A0g = "";
    public ArrayList A0h;
    public boolean A0i;
    public C021809f A0j;
    public AnonymousClass11F A0k;
    public final AnonymousClass0UE A0l = new C89144Vk(this, 2);
    public final AnonymousClass026 A0m = new C89854Yd(this, 8);
    public final AnonymousClass4Q4 A0n = new AnonymousClass3T4(this, 3);

    public int A2I() {
        return 78318969;
    }

    public boolean A2g() {
        return true;
    }

    public void B0z(Drawable drawable, View view) {
    }

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void B7f(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bdt() {
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r1, boolean z) {
    }

    public /* synthetic */ void BpV(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BrT(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r1) {
    }

    public void Bu3(View view, AnonymousClass3T1 r2, int i, boolean z) {
    }

    public /* synthetic */ void Bwy(AnonymousClass3T1 r1) {
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19460v5 r1 = this.A06;
                if (r1.A05()) {
                    r1.A02();
                    this.A0H.A03.values();
                    throw AnonymousClass001.A0A("handleAdvertiseForwardClick");
                }
                B7Q();
                return;
            }
            if (this.A0H != null) {
                ArrayList A0k2 = C36341k9.A0k(intent);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                AnonymousClass3XT r6 = null;
                if (AnonymousClass143.A0N(A0k2)) {
                    C18740tg.A06(intent);
                    r6 = this.A0a.A01(intent.getExtras());
                }
                AnonymousClass1X4 r4 = this.A0A;
                AnonymousClass1XY r5 = this.A09;
                ArrayList A15 = C36441kJ.A15(this.A0H.A03.values());
                Collections.sort(A15, C81703xR.A00);
                r4.A0H(r5, r6, stringExtra, A15, A0k2, booleanExtra);
                if (A0k2.size() != 1 || (A0k2.get(0) instanceof C177528dw)) {
                    Bvu(A0k2);
                } else {
                    C36391kE.A1A(this, this.A01, C36371kC.A0a(this.A0B, A0k2, 0), C36441kJ.A0j());
                }
            } else {
                Log.w("mediagallery/forward/failed");
                this.A05.A06(R.string.f12nameremoved, 0);
            }
            AnonymousClass0V9 r0 = this.A05;
            if (r0 != null) {
                r0.A05();
            }
        }
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1) {
    }

    public static AnonymousClass4TA A01(MediaGalleryActivity mediaGalleryActivity) {
        int i = mediaGalleryActivity.A00;
        for (AnonymousClass02E r1 : mediaGalleryActivity.A2m()) {
            if ((i == mediaGalleryActivity.A03 && (r1 instanceof MediaGalleryFragment)) || ((i == mediaGalleryActivity.A01 && (r1 instanceof DocumentsGalleryFragment)) || (i == mediaGalleryActivity.A02 && (r1 instanceof LinksGalleryFragment)))) {
                return (AnonymousClass4TA) r1;
            }
        }
        return null;
    }

    public static void A07(MediaGalleryActivity mediaGalleryActivity) {
        C62473Gh r1;
        AnonymousClass0V9 r2 = mediaGalleryActivity.A05;
        if (r2 != null && (r1 = mediaGalleryActivity.A0H) != null) {
            if (r1.A03.isEmpty()) {
                r2.A05();
                return;
            }
            C21060yb r8 = mediaGalleryActivity.A08;
            C18820ts r7 = mediaGalleryActivity.A00;
            HashMap hashMap = r1.A03;
            long size = (long) hashMap.size();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L2, hashMap.size(), 0);
            C33521fV.A00(mediaGalleryActivity, r8, r7.A0L(A0L2, R.plurals.f10nameremoved, size));
            mediaGalleryActivity.A05.A06();
        }
    }

    public void A2X() {
        this.A0e.A03((AnonymousClass11F) null, 13);
    }

    public void B7Q() {
        AnonymousClass0V9 r0 = this.A05;
        if (r0 != null) {
            r0.A05();
        }
    }

    public Object BAB(Class cls) {
        if (cls == AnonymousClass4Q4.class) {
            return this.A0n;
        }
        return null;
    }

    public boolean BK6() {
        return AnonymousClass000.A1V(this.A0H);
    }

    public boolean BMT(AnonymousClass3T1 r3) {
        C62473Gh r0 = this.A0H;
        if (r0 != null) {
            if (!r0.A03.containsKey(r3.A1J)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BsB(List list, boolean z) {
        if (this.A0H != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A0l2 = C36391kE.A0l(it);
                C62473Gh r0 = this.A0H;
                C64933Qa r1 = A0l2.A1J;
                HashMap hashMap = r0.A03;
                if (z) {
                    hashMap.put(r1, A0l2);
                } else {
                    hashMap.remove(r1);
                }
            }
            A07(this);
        }
    }

    public void Bur(AnonymousClass3T1 r10) {
        C62473Gh A002 = C62473Gh.A00(this.A05, this.A0H, this.A0O, this, 1);
        this.A0H = A002;
        A002.A03.put(r10.A1J, r10);
        this.A05 = But(this.A0j);
        C21060yb r7 = this.A08;
        C18820ts r6 = this.A00;
        C62473Gh r4 = this.A0H;
        long size = (long) r4.A03.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1J(objArr, r4.A03.size());
        C33521fV.A00(this, r7, r6.A0L(objArr, R.plurals.f10nameremoved, size));
    }

    public boolean Bvv(AnonymousClass3T1 r4) {
        C62473Gh r0 = this.A0H;
        if (r0 == null) {
            return false;
        }
        C64933Qa r2 = r4.A1J;
        boolean containsKey = r0.A03.containsKey(r2);
        HashMap hashMap = this.A0H.A03;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r4);
        }
        A07(this);
        return !containsKey;
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A0G.A09;
    }

    public void onCreate(Bundle bundle) {
        String A0u;
        ArrayList A052;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass1H2 r7 = this.A0C;
        AnonymousClass16D r6 = this.A0B;
        AnonymousClass171 r4 = this.A0D;
        C18820ts r3 = this.A00;
        C57642ya r2 = this.A08;
        AnonymousClass16D r19 = r6;
        AnonymousClass171 r20 = r4;
        this.A0j = new AnonymousClass4W7(this, r19, r20, new AnonymousClass3PH(), new AnonymousClass2JS((AnonymousClass3C3) r2.A00.A00.A1Y.get(), this, C27111My.A2A(r2.A00.A00)), this.A0S, r3, r7, this, 4);
        C19770wU r22 = this.A04;
        AnonymousClass1MP r1 = this.A0I;
        Objects.requireNonNull(r1);
        C80243v5.A01(r22, r1, 24);
        setTitle(R.string.f12nameremoved);
        Toolbar A0O2 = C36361kB.A0O(this, R.layout.f9nameremoved);
        setSupportActionBar(A0O2);
        int A1X = C36341k9.A1X(this);
        int A092 = C36391kE.A09(this, R.id.separator);
        C36401kF.A1C(this);
        C36331k8.A0n(this);
        AnonymousClass11F A0F2 = C36331k8.A0F(this);
        C18740tg.A06(A0F2);
        this.A0k = A0F2;
        if (!C36431kI.A1V(this, A0F2) || !C36391kE.A1X(this.A0D)) {
            A0u = C36381kD.A0u(this.A0B, this.A0D, this.A0k);
        } else {
            A0u = C53722rm.A00(this, this.A0D, this.A00, this.A0B.A0D(this.A0k));
        }
        if (A0u == null) {
            A0u = "";
        }
        A3F(A0u);
        if (getIntent().getBooleanExtra("alert", false)) {
            this.A0f.A03(this);
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        this.A02 = -1;
        C39371sA r11 = new C39371sA(getSupportFragmentManager());
        ArrayList A0I2 = AnonymousClass001.A0I();
        C36341k9.A1H(Integer.valueOf(R.string.f12nameremoved), new MediaGalleryFragment(), A0I2);
        C36341k9.A1H(Integer.valueOf(R.string.f12nameremoved), new DocumentsGalleryFragment(), A0I2);
        C36341k9.A1H(Integer.valueOf(R.string.f12nameremoved), new LinksGalleryFragment(), A0I2);
        if (C36401kF.A1X(this.A00)) {
            Collections.reverse(A0I2);
        }
        for (int i = 0; i < A0I2.size(); i++) {
            AnonymousClass00I r0 = (AnonymousClass00I) A0I2.get(i);
            Number number = (Number) r0.A00;
            Object obj = r0.A01;
            int intValue = number.intValue();
            String string = getString(intValue);
            r11.A01.add(obj);
            r11.A00.add(string);
            if (intValue == R.string.f12nameremoved) {
                this.A03 = i;
            } else if (number.intValue() == R.string.f12nameremoved) {
                this.A01 = i;
            } else if (number.intValue() == R.string.f12nameremoved) {
                this.A02 = i;
            }
        }
        viewPager.setAdapter(r11);
        List list = r11.A01;
        viewPager.setOffscreenPageLimit(list.size());
        viewPager.A0J(this.A03, false);
        this.A00 = this.A03;
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        AnonymousClass04F.A05(tabLayout, 0);
        if (list.size() > A1X) {
            tabLayout.setTabTextColors(TabLayout.A02(AnonymousClass00F.A00(this, R.color.f6nameremoved), C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)));
            tabLayout.setupWithViewPager(viewPager);
            tabLayout.setOnTabSelectedListener((C17690rq) new C68383bo(viewPager, this));
        } else {
            ((AnonymousClass0Ey) A0O2.getLayoutParams()).A00 = 0;
            tabLayout.setVisibility(A092);
        }
        if (bundle != null && (A052 = AnonymousClass3UJ.A05(bundle2)) != null) {
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                C64933Qa r62 = (C64933Qa) it.next();
                AnonymousClass3T1 A032 = this.A0c.A03(r62);
                if (A032 != null) {
                    C62473Gh r02 = this.A0H;
                    if (r02 == null) {
                        r02 = C62473Gh.A00(this.A05, (C62473Gh) null, this.A0O, this, 1);
                        this.A0H = r02;
                    }
                    r02.A03.put(r62, A032);
                }
            }
            if (this.A0H != null) {
                this.A05 = But(this.A0j);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r48) {
        /*
            r47 = this;
            r0 = 13
            r10 = r47
            r6 = r48
            if (r6 == r0) goto L_0x0054
            r0 = 19
            if (r6 == r0) goto L_0x002d
            switch(r48) {
                case 23: goto L_0x0014;
                case 24: goto L_0x0020;
                case 25: goto L_0x0039;
                default: goto L_0x000f;
            }
        L_0x000f:
            android.app.Dialog r0 = super.onCreateDialog(r6)
            return r0
        L_0x0014:
            X.1Dv r7 = r10.A01
            X.0xT r5 = r10.A0d
            X.1fs r4 = r10.A0F
            X.11F r3 = r10.A0k
            X.0v0 r2 = r10.A09
            r13 = 1
            goto L_0x002b
        L_0x0020:
            X.1Dv r7 = r10.A01
            X.0xT r5 = r10.A0d
            X.1fs r4 = r10.A0F
            X.11F r3 = r10.A0k
            X.0v0 r2 = r10.A09
            r13 = 0
        L_0x002b:
            r1 = 0
            goto L_0x0045
        L_0x002d:
            X.1Dv r7 = r10.A01
            X.0xT r5 = r10.A0d
            X.1fs r4 = r10.A0F
            X.11F r3 = r10.A0k
            X.0v0 r2 = r10.A09
            r13 = 0
            goto L_0x0044
        L_0x0039:
            X.1Dv r7 = r10.A01
            X.0xT r5 = r10.A0d
            X.1fs r4 = r10.A0F
            X.11F r3 = r10.A0k
            X.0v0 r2 = r10.A09
            r13 = 1
        L_0x0044:
            r1 = 1
        L_0x0045:
            X.4Wq r0 = new X.4Wq
            r0.<init>(r10, r2, r6, r1)
            r8 = r10
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r5
            X.0FM r0 = X.C53132qp.A00(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0054:
            X.3Gh r2 = r10.A0H
            if (r2 == 0) goto L_0x0114
            java.util.HashMap r0 = r2.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0114
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "mediagallery/dialog/delete/"
            r1.append(r0)
            java.util.HashMap r0 = r2.A03
            int r0 = r0.size()
            X.C36321k7.A1Y(r1, r0)
            X.3Gh r0 = r10.A0H
            java.util.HashMap r0 = r0.A03
            java.util.Collection r0 = r0.values()
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r0)
            X.0wo r0 = r10.A07
            r46 = r0
            X.0yC r0 = r10.A0D
            r28 = r0
            X.17Y r0 = r10.A05
            r27 = r0
            X.0wU r0 = r10.A04
            r25 = r0
            X.0yW r0 = r10.A0Q
            r24 = r0
            X.1H2 r0 = r10.A0C
            r23 = r0
            X.1X4 r0 = r10.A0A
            r22 = r0
            X.16D r11 = r10.A0B
            X.1DW r0 = r10.A0P
            r21 = r0
            X.171 r9 = r10.A0D
            X.0ts r0 = r10.A00
            r20 = r0
            X.18y r0 = r10.A0E
            r26 = r0
            X.1EL r0 = r10.A0T
            r18 = r0
            X.1CF r0 = r10.A0V
            r17 = r0
            X.17V r0 = r10.A0R
            r16 = r0
            X.185 r15 = r10.A0C
            X.0v0 r14 = r10.A09
            X.0v5 r8 = r10.A07
            X.17X r7 = r10.A0M
            X.3O0 r6 = r10.A0W
            X.11F r13 = r10.A0k
            r0 = 3
            X.4Yn r5 = new X.4Yn
            r5.<init>(r10, r0)
            r19 = 0
            X.1AW r4 = r10.A0X
            X.1EO r3 = r10.A0Y
            X.12q r2 = r10.A0K
            r45 = 1
            r1 = 0
            X.4Wo r0 = new X.4Wo
            r0.<init>(r10, r1)
            java.lang.String r43 = X.AnonymousClass3SH.A01(r10, r11, r9, r13, r12)
            r29 = r20
            r30 = r2
            r31 = r7
            r32 = r21
            r33 = r23
            r34 = r28
            r35 = r24
            r36 = r16
            r37 = r18
            r38 = r17
            r39 = r6
            r40 = r4
            r41 = r3
            r42 = r25
            r44 = r12
            r16 = r10
            r17 = r8
            r18 = r0
            r20 = r5
            r21 = r27
            r23 = r11
            r24 = r15
            r25 = r9
            r27 = r46
            r28 = r14
            X.0FM r0 = X.AnonymousClass3SH.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r0
        L_0x0114:
            java.lang.String r0 = "mediagallery/dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.app.Dialog r0 = super.onCreateDialog(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryActivity.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A0Z = this.A0L.A0D(this.A0k);
        if (this.A0L.A0N()) {
            SearchView searchView = new SearchView(this);
            searchView.setMaxWidth(Integer.MAX_VALUE);
            C36321k7.A0M(this, C36391kE.A0P(searchView, R.id.search_src_text), R.attr.f4nameremoved, R.color.f6nameremoved);
            searchView.setQueryHint(getString(R.string.f12nameremoved));
            searchView.A06 = new C53842ry(this, 5);
            boolean z = false;
            MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.f12nameremoved).setIcon(AnonymousClass3UF.A02(this, R.drawable.ic_action_search_teal, R.color.f6nameremoved));
            this.A04 = icon;
            icon.setActionView(searchView);
            this.A04.setShowAsAction(10);
            this.A04.setOnActionExpandListener(new AnonymousClass4Z3(this, 3));
            MenuItem menuItem = this.A04;
            if (this.A00 != this.A03) {
                z = true;
            }
            menuItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public /* synthetic */ boolean BMS() {
        return false;
    }

    public /* synthetic */ boolean BMm() {
        return false;
    }

    public /* synthetic */ boolean BPt() {
        return true;
    }

    public void Bih(AnonymousClass0V9 r3) {
        super.Bih(r3);
        if (C19550w8.A01()) {
            C36331k8.A0n(this);
        } else {
            AnonymousClass1RC.A04(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
        }
    }

    public void Bii(AnonymousClass0V9 r3) {
        super.Bii(r3);
        AnonymousClass1RC.A09(getWindow(), false);
        C36341k9.A0n(this);
    }

    public /* synthetic */ boolean BtT() {
        return false;
    }

    public /* synthetic */ boolean Btp() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public /* synthetic */ C001600r getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C001600r getLastMessageLiveData() {
        return null;
    }

    public ArrayList getSearchTerms() {
        return this.A0h;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0G.A01(this);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1HA r0 = this.A0b;
        if (r0 != null) {
            r0.A06();
        }
        C62473Gh r02 = this.A0H;
        if (r02 != null) {
            r02.A02();
            this.A0H = null;
        }
        C19770wU r2 = this.A04;
        AnonymousClass1MP r1 = this.A0I;
        Objects.requireNonNull(r1);
        C80243v5.A01(r2, r1, 24);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C62473Gh r0 = this.A0H;
        if (r0 != null) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator A10 = C36391kE.A10(r0.A03);
            while (A10.hasNext()) {
                AnonymousClass3T1.A0A(A0I2, A10);
            }
            AnonymousClass3UJ.A0A(bundle, A0I2);
        }
    }

    public void onStart() {
        super.onStart();
        this.A0U.A05(this, this.A0m);
    }

    public void onStop() {
        super.onStop();
        this.A0U.A06(this.A0m);
    }

    public /* synthetic */ int BF0(AnonymousClass3T1 r2) {
        return 1;
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        return false;
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        this.A0G.A01(this);
    }
}
