package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0C4;
import X.AnonymousClass11F;
import X.AnonymousClass12P;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass199;
import X.AnonymousClass1A1;
import X.AnonymousClass1DF;
import X.AnonymousClass1DG;
import X.AnonymousClass1GQ;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass1SV;
import X.AnonymousClass1V2;
import X.AnonymousClass37V;
import X.AnonymousClass3LE;
import X.AnonymousClass3PI;
import X.AnonymousClass737;
import X.C02680Bk;
import X.C02760Bu;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19930wk;
import X.C20310xM;
import X.C21010yW;
import X.C220412q;
import X.C27111My;
import X.C27731Pn;
import X.C28201Rs;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36441kJ;
import X.C41071wZ;
import X.C52352pI;
import X.C53542rU;
import X.C57872yx;
import X.C62153Ez;
import X.C65343Rr;
import X.C65503Si;
import X.C65883Tv;
import X.C67103Yn;
import X.C80193v0;
import X.C81183wb;
import X.C81203wd;
import X.C87344Ok;
import X.C88764Ty;
import X.C89374Wh;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StorageUsageActivity extends AnonymousClass155 implements C87344Ok {
    public static final long A0Z = TimeUnit.MINUTES.toMillis(1);
    public int A00;
    public C81203wd A01;
    public C57872yx A02;
    public AnonymousClass1LI A03;
    public AnonymousClass16D A04;
    public AnonymousClass171 A05;
    public C27731Pn A06;
    public C220412q A07;
    public C20310xM A08;
    public AnonymousClass1DG A09;
    public AnonymousClass1DF A0A;
    public AnonymousClass12P A0B;
    public C65503Si A0C;
    public C21010yW A0D;
    public AnonymousClass1GQ A0E;
    public AnonymousClass3PI A0F;
    public C52352pI A0G;
    public C41071wZ A0H;
    public C65343Rr A0I;
    public C62153Ez A0J;
    public AnonymousClass1A1 A0K;
    public AnonymousClass1SV A0L;
    public C19930wk A0M;
    public AnonymousClass199 A0N;
    public String A0O;
    public String A0P;
    public ArrayList A0Q;
    public List A0R;
    public RecyclerView A0S;
    public AnonymousClass1RY A0T;
    public AnonymousClass3LE A0U;
    public boolean A0V;
    public final C88764Ty A0W;
    public final C28201Rs A0X;
    public final Set A0Y;

    public static synchronized void A0H(StorageUsageActivity storageUsageActivity, List list, List list2, boolean z) {
        C65883Tv r3;
        AnonymousClass3LE r0;
        synchronized (storageUsageActivity) {
            char c = 2;
            if (storageUsageActivity.A0P != null && list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c = 1;
                        break;
                    }
                    AnonymousClass11F A012 = ((C80193v0) list.get(((Integer) it.next()).intValue())).A01();
                    AnonymousClass16D r02 = storageUsageActivity.A04;
                    C18740tg.A06(A012);
                    AnonymousClass141 A082 = r02.A08(A012);
                    if (A082 != null && storageUsageActivity.A05.A0h(A082, storageUsageActivity.A0R, true)) {
                        break;
                    }
                }
            } else if (!z) {
                c = 0;
            }
            if (list2 == null || ((r0 = storageUsageActivity.A0U) != null && r0.A07() && c == 2)) {
                if (list == null) {
                    list = AnonymousClass001.A0I();
                } else if (!TextUtils.isEmpty(storageUsageActivity.A0P) || storageUsageActivity.A0G != C52352pI.ALL) {
                    if (TextUtils.isEmpty(storageUsageActivity.A0P)) {
                        r3 = new C65883Tv(storageUsageActivity, 2);
                    } else {
                        r3 = new C65883Tv(storageUsageActivity, 1);
                    }
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (int i = 0; i < list.size(); i++) {
                        if (r3.BvZ(((C80193v0) list.get(i)).A01())) {
                            A0I2.add(list.get(i));
                        }
                    }
                    list = A0I2;
                }
            }
            if (c != 1) {
                storageUsageActivity.A05.A0H(new AnonymousClass737(storageUsageActivity, list, list2, 10));
            }
        }
    }

    public class WrappedLinearLayoutManager extends LinearLayoutManager {
        public WrappedLinearLayoutManager() {
            super(1);
        }

        public void A1D(C02760Bu r3, AnonymousClass0C4 r4) {
            try {
                super.A1D(r3, r4);
            } catch (IndexOutOfBoundsException e) {
                Log.e("WrappedLinearLayoutManager", e);
            }
        }
    }

    private void A01(int i) {
        this.A0Y.add(Integer.valueOf(i));
        C41071wZ r0 = this.A0H;
        AnonymousClass17Y r3 = r0.A0C;
        Runnable runnable = r0.A0F;
        r3.A0G(runnable);
        r3.A0I(runnable, 1000);
    }

    public static void A07(StorageUsageActivity storageUsageActivity) {
        Log.i("storage-usage-activity/fetch media size");
        C81203wd.A00(storageUsageActivity.A05, storageUsageActivity, new C81203wd(storageUsageActivity, new AnonymousClass37V(AnonymousClass1V2.A00(storageUsageActivity.A04, storageUsageActivity.A0I), storageUsageActivity.A08.A01(), storageUsageActivity.A08.A03()), 28), 25);
    }

    public static void A0F(StorageUsageActivity storageUsageActivity) {
        if (storageUsageActivity.A0J != null) {
            Log.i("storage-usage-activity/fetch forwarded files");
            C81203wd.A00(storageUsageActivity.A05, storageUsageActivity, new C81203wd(storageUsageActivity, storageUsageActivity.A0J.A00(new C02680Bk(), storageUsageActivity.A00, 1), 26), 25);
        }
        if (storageUsageActivity.A0J != null) {
            Log.i("storage-usage-activity/fetch large files");
            C81203wd.A00(storageUsageActivity.A05, storageUsageActivity, new C81203wd(storageUsageActivity, storageUsageActivity.A0J.A00(new C02680Bk(), storageUsageActivity.A00, 2), 27), 25);
        }
    }

    public static void A0G(StorageUsageActivity storageUsageActivity, int i) {
        Set set = storageUsageActivity.A0Y;
        set.remove(Integer.valueOf(i));
        C41071wZ r4 = storageUsageActivity.A0H;
        boolean A1P = AnonymousClass000.A1P(set.size());
        AnonymousClass17Y r3 = r4.A0C;
        Runnable runnable = r4.A0F;
        r3.A0G(runnable);
        if (A1P) {
            r3.A0I(runnable, 1000);
        } else {
            C41071wZ.A04(r4, 2, false);
        }
    }

    public void A2F() {
        if (!this.A0V) {
            this.A0V = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A07 = C36351kA.A0a(r1);
            this.A0D = C36351kA.A0g(r1);
            this.A06 = C36351kA.A0T(r1);
            this.A0N = (AnonymousClass199) r1.AQD.get();
            this.A04 = C36341k9.A0R(r1);
            this.A05 = C36341k9.A0S(r1);
            this.A0E = C36371kC.A0f(r1);
            this.A08 = C36371kC.A0Z(r1);
            this.A0K = C36351kA.A0n(r1);
            this.A0A = (AnonymousClass1DF) r1.A4m.get();
            this.A0L = C36401kF.A0g(r1);
            this.A0B = (AnonymousClass12P) r1.A5G.get();
            this.A0C = (C65503Si) r3.A44.get();
            this.A09 = (AnonymousClass1DG) r1.AQr.get();
            this.A0F = C27111My.A3F(A0L2);
            this.A02 = (C57872yx) A0L2.A3R.get();
            this.A03 = C36361kB.A0S(r1);
        }
    }

    public void onBackPressed() {
        AnonymousClass3LE r0 = this.A0U;
        if (r0 == null || !r0.A07()) {
            super.onBackPressed();
            return;
        }
        this.A0P = null;
        this.A0R = null;
        this.A0U.A05(true);
        C41071wZ r6 = this.A0H;
        r6.A09 = false;
        int A012 = C41071wZ.A01(r6);
        C41071wZ.A04(r6, 1, true);
        C41071wZ.A03(r6);
        C41071wZ.A04(r6, 4, true);
        if (r6.A08) {
            C41071wZ.A04(r6, 10, true);
        }
        C41071wZ.A04(r6, 8, true);
        r6.A0A(r6.A0J() - A012, A012);
        this.A0S.A0h(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0175, code lost:
        if (r2.getBoolean("LIST_IS_NOT_FULL", false) != false) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            super.onCreate(r2)
            java.lang.String r0 = "storage-usage-activity/create"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r4 = r1.A04
            r0 = 0
            X.0wk r3 = new X.0wk
            r3.<init>(r4, r0)
            r1.A0M = r3
            X.0wo r5 = r1.A07
            X.199 r4 = r1.A0N
            X.3Rr r3 = new X.3Rr
            r3.<init>(r5, r4)
            r1.A0I = r3
            r3 = 2131890878(0x7f1212be, float:1.941646E38)
            r1.setTitle(r3)
            r3 = 2131624075(0x7f0e008b, float:1.887532E38)
            androidx.appcompat.widget.Toolbar r6 = X.C36361kB.A0O(r1, r3)
            r1.setSupportActionBar(r6)
            r3 = 0
            r1.A0P = r3
            r1.A0R = r3
            X.0ts r5 = r1.A00
            r3 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r9 = r1.findViewById(r3)
            r4 = 13
            X.2ry r3 = new X.2ry
            r3.<init>(r1, r4)
            X.3LE r7 = new X.3LE
            r10 = r3
            r11 = r6
            r12 = r5
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r1.A0U = r7
            X.C36321k7.A0O(r1)
            X.1Rs r12 = r1.A0X
            r3 = 30
            X.C65963Ud.A00(r1, r12, r3)
            X.1Pn r4 = r1.A06
            java.lang.String r3 = "storage-usage-activity"
            X.1RY r3 = r4.A05(r1, r3)
            r1.A0T = r3
            java.lang.String r24 = X.C36391kE.A0u(r1)
            X.C18740tg.A06(r24)
            android.content.Intent r5 = r1.getIntent()
            java.lang.String r4 = "entry_point"
            r3 = -1
            int r26 = r5.getIntExtra(r4, r3)
            r3 = 2131429211(0x7f0b075b, float:1.8480088E38)
            android.view.View r3 = r1.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r1.A0S = r3
            com.whatsapp.storage.StorageUsageActivity$WrappedLinearLayoutManager r11 = new com.whatsapp.storage.StorageUsageActivity$WrappedLinearLayoutManager
            r11.<init>()
            java.lang.String r10 = X.C36381kD.A0q(r1)
            r1.A0O = r10
            X.17Y r3 = r1.A05
            r29 = r3
            X.0wN r3 = r1.A03
            r28 = r3
            X.0yW r15 = r1.A0D
            X.0yf r14 = r1.A06
            X.16D r9 = r1.A04
            X.171 r8 = r1.A05
            X.0ts r7 = r1.A00
            X.2yx r6 = r1.A02
            X.1LI r5 = r1.A03
            X.1RY r4 = r1.A0T
            X.1GQ r3 = r1.A0E
            X.0yC r13 = r3.A00
            r3 = 7761(0x1e51, float:1.0875E-41)
            boolean r27 = r13.A0E(r3)
            X.1wZ r3 = new X.1wZ
            r25 = r10
            r21 = r15
            r22 = r1
            r23 = r12
            r18 = r8
            r19 = r4
            r20 = r7
            r15 = r14
            r16 = r5
            r17 = r9
            r12 = r28
            r13 = r6
            r14 = r29
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A0H = r3
            androidx.recyclerview.widget.RecyclerView r3 = r1.A0S
            r3.setLayoutManager(r11)
            androidx.recyclerview.widget.RecyclerView r5 = r1.A0S
            X.0By r4 = r5.A0H
            boolean r3 = r4 instanceof X.C02810Bz
            if (r3 == 0) goto L_0x00e0
            X.0Bz r4 = (X.C02810Bz) r4
            r4.A00 = r0
        L_0x00e0:
            X.1wZ r3 = r1.A0H
            r5.setAdapter(r3)
            android.util.DisplayMetrics r3 = X.AnonymousClass000.A0X(r1)
            int r4 = r3.widthPixels
            android.util.DisplayMetrics r3 = X.AnonymousClass000.A0X(r1)
            int r3 = r3.heightPixels
            int r5 = java.lang.Math.max(r4, r3)
            android.content.res.Resources r4 = r1.getResources()
            r3 = 2131168519(0x7f070d07, float:1.7951342E38)
            int r4 = r4.getDimensionPixelSize(r3)
            int r3 = r4 / 2
            int r5 = r5 + r3
            int r5 = r5 / r4
            r4 = 1
            int r3 = java.lang.Math.max(r4, r5)
            r1.A00 = r3
            X.12q r6 = r1.A07
            X.1A1 r11 = r1.A0K
            X.1DF r8 = r1.A0A
            X.1SV r12 = r1.A0L
            X.12P r9 = r1.A0B
            X.1DG r7 = r1.A09
            X.3Rr r10 = r1.A0I
            X.3Ez r5 = new X.3Ez
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.A0J = r5
            r3 = 7
            X.3wb r5 = X.C81183wb.A00(r1, r3)
            X.0wk r3 = r1.A0M
            if (r3 == 0) goto L_0x012c
            r3.execute(r5)
        L_0x012c:
            r1.A01(r0)
            r3 = 2
            r1.A01(r3)
            r1.A01(r4)
            if (r31 == 0) goto L_0x0177
            java.lang.String r8 = "LIST_OF_CONTACTS"
            java.util.ArrayList r3 = r2.getParcelableArrayList(r8)
            if (r3 == 0) goto L_0x0177
            java.lang.String r3 = "SAVED_AT_TIMESTAMP"
            long r3 = r2.getLong(r3)
            long r6 = X.C36441kJ.A0A(r3)
            long r4 = A0Z
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0177
            java.util.ArrayList r7 = r2.getParcelableArrayList(r8)
            X.C18740tg.A06(r7)
            r1.A0Q = r7
            X.1wZ r6 = r1.A0H
            java.lang.String r5 = r1.A0P
            java.util.List r4 = r1.A0R
            X.2pI r3 = r1.A0G
            r6.A05 = r7
            r6.A04 = r5
            r6.A06 = r4
            r6.A00 = r3
            r3 = 1
            r6.A07 = r3
            r6.A06()
            java.lang.String r3 = "LIST_IS_NOT_FULL"
            boolean r0 = r2.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x0193
        L_0x0177:
            X.3wd r0 = r1.A01
            if (r0 == 0) goto L_0x0183
            java.lang.Object r2 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            r0 = 1
            r2.set(r0)
        L_0x0183:
            X.3wd r2 = new X.3wd
            r2.<init>(r1)
            r1.A01 = r2
            X.0wU r0 = r1.A04
            r0.Boy(r2)
            r0 = 3
            r1.A01(r0)
        L_0x0193:
            X.3Si r0 = r1.A0C
            X.4Ty r2 = r1.A0W
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A07
            r0.add(r2)
            X.0wo r6 = r1.A07
            X.0wU r5 = r1.A04
            X.0y0 r4 = r1.A04
            X.0yW r3 = r1.A0D
            X.199 r2 = r1.A0N
            X.3vs r0 = new X.3vs
            r14 = 0
            r7 = r0
            r8 = r4
            r9 = r6
            r10 = r2
            r11 = r3
            r12 = r24
            r13 = r26
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r5.Boy(r0)
            X.3PI r4 = r1.A0F
            android.view.View r3 = r1.A00
            java.lang.String r2 = r1.A0O
            java.lang.String r0 = "manage_storage"
            boolean r0 = r4.A02(r3, r0, r2)
            if (r0 == 0) goto L_0x01c9
            r0 = 0
            r1.A0O = r0
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.StorageUsageActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onSearchRequested() {
        AnonymousClass3LE r1 = this.A0U;
        if (r1 != null) {
            r1.A06(false);
            C41071wZ r7 = this.A0H;
            r7.A09 = true;
            int A012 = C41071wZ.A01(r7);
            C41071wZ.A04(r7, 1, false);
            C41071wZ.A04(r7, 3, false);
            C41071wZ.A04(r7, 4, false);
            if (r7.A08) {
                C41071wZ.A04(r7, 10, false);
            }
            C41071wZ.A04(r7, 8, false);
            r7.A0A(r7.A0J() - 1, A012 + 1);
            C67103Yn.A00(this.A0U.A04.findViewById(R.id.search_back), this, 28);
        }
        this.A04.Bp1(C81183wb.A00(this, 9));
        this.A0H.A0D.A0L(C52352pI.ALL);
        return false;
    }

    public StorageUsageActivity(int i) {
        this.A0V = false;
        C89374Wh.A00(this, 5);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null && i2 == 1) {
            AnonymousClass11F A0Z2 = C36401kF.A0Z(intent, "jid");
            int intExtra = intent.getIntExtra("gallery_type", -1);
            long longExtra = intent.getLongExtra("memory_size", -1);
            long longExtra2 = intent.getLongExtra("deleted_size", -1);
            if (longExtra >= 0) {
                if (longExtra2 > 0) {
                    C81183wb A002 = C81183wb.A00(this, 8);
                    C19930wk r0 = this.A0M;
                    if (r0 != null) {
                        r0.execute(A002);
                    }
                }
                if (intExtra == 0 && A0Z2 != null) {
                    C41071wZ r5 = this.A0H;
                    for (C80193v0 r3 : r5.A05) {
                        if (r3.A01().equals(A0Z2)) {
                            r3.A00.A0I = longExtra;
                            Collections.sort(r5.A05);
                            r5.A06();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C19930wk r1 = this.A0M;
        if (r1 != null) {
            r1.A02();
            this.A0M = null;
        }
        this.A0S = null;
        this.A0T.A02();
        C65503Si r0 = this.A0C;
        r0.A07.remove(this.A0W);
        this.A0Y.clear();
        C81203wd r02 = this.A01;
        if (r02 != null) {
            ((AtomicBoolean) r02.A00).set(true);
        }
        C41071wZ r2 = this.A0H;
        r2.A0C.A0G(r2.A0F);
        C41071wZ.A04(r2, 2, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        onSearchRequested();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.A0Q.isEmpty()) {
            bundle.putLong("SAVED_AT_TIMESTAMP", System.currentTimeMillis());
            ArrayList arrayList = this.A0Q;
            if (arrayList.size() > 200) {
                bundle.putParcelableArrayList("LIST_OF_CONTACTS", C36441kJ.A15(arrayList.subList(0, 200)));
                bundle.putBoolean("LIST_IS_NOT_FULL", true);
                return;
            }
            bundle.putParcelableArrayList("LIST_OF_CONTACTS", arrayList);
        }
    }

    public StorageUsageActivity() {
        this(0);
        this.A0X = C36441kJ.A0t();
        this.A0Y = C36441kJ.A16();
        this.A0G = C52352pI.ALL;
        this.A0Q = AnonymousClass001.A0I();
        this.A0O = null;
        this.A0W = new C53542rU(this, 0);
    }
}
