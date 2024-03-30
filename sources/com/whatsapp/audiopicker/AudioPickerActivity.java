package com.whatsapp.audiopicker;

import X.AnonymousClass005;
import X.AnonymousClass07B;
import X.AnonymousClass0V4;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16L;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1V9;
import X.AnonymousClass1X7;
import X.AnonymousClass27q;
import X.AnonymousClass3HF;
import X.AnonymousClass3K8;
import X.AnonymousClass3LE;
import X.AnonymousClass3MR;
import X.AnonymousClass3MU;
import X.AnonymousClass3UR;
import X.C011504z;
import X.C012005e;
import X.C07540Ye;
import X.C148826zU;
import X.C17210qu;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C27731Pn;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C38041nc;
import X.C40171v4;
import X.C53842ry;
import X.C64813Pn;
import X.C64953Qc;
import X.C66923Xv;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AudioPickerActivity extends AnonymousClass27q implements C17210qu {
    public View A00;
    public ImageButton A01;
    public RelativeLayout A02;
    public C38041nc A03;
    public AnonymousClass16L A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public AnonymousClass1RY A07;
    public C27731Pn A08;
    public C64953Qc A09;
    public AnonymousClass3HF A0A;
    public AnonymousClass1V6 A0B;
    public AnonymousClass141 A0C;
    public AnonymousClass3K8 A0D;
    public AnonymousClass3LE A0E;
    public AnonymousClass1X7 A0F;
    public C64813Pn A0G;
    public AnonymousClass005 A0H;
    public AnonymousClass005 A0I;
    public String A0J;
    public ArrayList A0K;
    public LinkedHashMap A0L;
    public AudioManager A0M;
    public Menu A0N;
    public ListView A0O;
    public RelativeLayout A0P;
    public TextView A0Q;
    public BottomSheetBehavior A0R;
    public boolean A0S;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A002 = AnonymousClass3MR.A00(this.A0D);
        this.A0S = A002;
        int i = R.layout.f9nameremoved;
        if (A002) {
            i = R.layout.f9nameremoved;
        }
        setContentView(i);
        this.A0L = C36431kI.A1G();
        this.A0D = new AnonymousClass3K8(new Handler(), this.A04, this.A08, "audio-picker");
        Toolbar A0R2 = C36411kG.A0R(this);
        setSupportActionBar(A0R2);
        this.A0E = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C53842ry(this, 0), A0R2, this.A00);
        this.A0C = C36441kJ.A0i(this.A05, C36331k8.A0F(this));
        AnonymousClass07B supportActionBar = getSupportActionBar();
        C18740tg.A07(supportActionBar, "supportActionBar is null");
        supportActionBar.A0U(true);
        Object[] objArr = new Object[1];
        C36361kB.A1F(this.A06, this.A0C, objArr, 0);
        supportActionBar.A0Q(getString(R.string.f12nameremoved, objArr));
        this.A0P = (RelativeLayout) findViewById(R.id.no_audio_layout);
        this.A02 = (RelativeLayout) findViewById(R.id.loading_audio_layout);
        this.A0Q = C36391kE.A0Q(this, R.id.empty);
        ListView listView = getListView();
        this.A0O = listView;
        C011504z.A04((Drawable) null, listView);
        ImageButton imageButton = (ImageButton) findViewById(R.id.fab);
        this.A01 = imageButton;
        AnonymousClass3MU.A01(imageButton, false, false);
        C66923Xv.A01(this.A01, this, 32);
        C36331k8.A0q(this, this.A01, R.string.f12nameremoved);
        C38041nc r0 = new C38041nc(this, this);
        this.A03 = r0;
        A3i(r0);
        this.A0M = this.A08.A0D();
        if (this.A0S) {
            View A022 = C012005e.A02(this.A00, R.id.audio_picker_layout);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A0R = bottomSheetBehavior;
            this.A0G.A02(A022, bottomSheetBehavior, this, this.A0C);
            C64813Pn.A00(this, supportActionBar);
        }
    }

    public AnonymousClass0V4 BUt(Bundle bundle, int i) {
        return new C40171v4(this, this.A08.A0O(), this.A0K);
    }

    public /* bridge */ /* synthetic */ void Ba0(AnonymousClass0V4 r2, Object obj) {
        this.A03.swapCursor((Cursor) obj);
        A0u();
    }

    public void Ba7(AnonymousClass0V4 r3) {
        this.A03.swapCursor((Cursor) null);
        A0u();
    }

    public void onBackPressed() {
        this.A0H.get();
        if (this.A0E.A07()) {
            if (!this.A0L.isEmpty()) {
                AnonymousClass3MU.A01(this.A01, true, true);
            }
            this.A0E.A05(true);
            return;
        }
        super.onBackPressed();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = this.A0M;
        if (audioManager != null) {
            if (i == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        boolean z = C36431kI.A0o(this.A0H).A03;
        View view = this.A00;
        if (z) {
            C20810yC r15 = this.A0D;
            AnonymousClass17Y r13 = this.A05;
            C19730wQ r12 = this.A02;
            C19770wU r11 = this.A04;
            C27731Pn r10 = this.A08;
            AnonymousClass16D r9 = this.A05;
            AnonymousClass171 r8 = this.A06;
            C18820ts r7 = this.A00;
            AnonymousClass3HF r6 = this.A0A;
            AnonymousClass1V6 r5 = this.A0B;
            AnonymousClass005 r4 = this.A0H;
            AnonymousClass005 r3 = this.A0I;
            View view2 = this.A00;
            AnonymousClass1RY r1 = this.A07;
            C19420v0 r25 = this.A09;
            AnonymousClass1V6 r24 = r5;
            AnonymousClass3HF r23 = r6;
            C27731Pn r22 = r10;
            AnonymousClass1RY r21 = r1;
            AnonymousClass171 r20 = r8;
            AnonymousClass16D r19 = r9;
            C19730wQ r18 = r12;
            AnonymousClass17Y r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass3UR.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "audio-picker-activity");
            this.A00 = (View) A002.first;
            this.A07 = (AnonymousClass1RY) A002.second;
        } else if (AnonymousClass1V9.A00(view)) {
            AnonymousClass3UR.A04(this.A00, this.A0B, this.A0H);
        }
        C36421kH.A1I(this.A0H);
    }

    public boolean onSearchRequested() {
        AnonymousClass3MU.A01(this.A01, false, true);
        this.A0E.A06(this.A0S);
        C66923Xv.A01(findViewById(R.id.search_back), this, 33);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0u() {
        /*
            r10 = this;
            X.07B r9 = r10.getSupportActionBar()
            java.lang.String r0 = "supportActionBar is null"
            X.C18740tg.A07(r9, r0)
            java.util.LinkedHashMap r0 = r10.A0L
            java.util.Iterator r2 = X.C36391kE.A10(r0)
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r2.next()
            X.3Ac r0 = (X.C60983Ac) r0
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x002a
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000f
        L_0x002a:
            r2.remove()
            goto L_0x000f
        L_0x002e:
            X.1nc r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            java.lang.String r4 = ""
            r7 = 1
            r2 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0087
            android.widget.ListView r0 = r10.A0O
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A0P
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A02
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A0Q
            r0.setVisibility(r2)
            X.1V6 r0 = r10.A0B
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x005d
            X.1V6 r0 = r10.A0B
            r0.A06()
        L_0x005d:
            r9.A0P(r4)
        L_0x0060:
            android.view.Menu r1 = r10.A0N
            if (r1 == 0) goto L_0x0084
            r0 = 2131431681(0x7f0b1101, float:1.8485098E38)
            android.view.MenuItem r1 = r1.findItem(r0)
            if (r1 == 0) goto L_0x0084
            X.1nc r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x0085
            X.1nc r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0085
        L_0x0081:
            r1.setVisible(r7)
        L_0x0084:
            return
        L_0x0085:
            r7 = 0
            goto L_0x0081
        L_0x0087:
            android.widget.RelativeLayout r0 = r10.A02
            r0.setVisibility(r2)
            X.1nc r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            int r1 = r0.getCount()
            android.widget.ListView r0 = r10.A0O
            if (r1 != 0) goto L_0x00d1
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r10.A01
            X.AnonymousClass3MU.A01(r0, r6, r6)
            X.3LE r0 = r10.A0E
            boolean r1 = r0.A07()
            android.widget.RelativeLayout r0 = r10.A0P
            if (r1 == 0) goto L_0x00c3
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A0Q
            r0.setVisibility(r6)
            android.widget.TextView r3 = r10.A0Q
            r2 = 2131886561(0x7f1201e1, float:1.9407704E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r10.A0J
            r1[r6] = r0
            X.C36341k9.A0s(r10, r3, r1, r2)
            goto L_0x005d
        L_0x00c3:
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A0Q
            r0.setVisibility(r2)
            java.util.LinkedHashMap r0 = r10.A0L
            r0.clear()
            goto L_0x005d
        L_0x00d1:
            r0.setVisibility(r6)
            android.widget.RelativeLayout r0 = r10.A0P
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A0Q
            r0.setVisibility(r2)
            java.util.LinkedHashMap r8 = r10.A0L
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00fb
            r0 = 2131894891(0x7f12226b, float:1.94246E38)
            r9.A0H(r0)
        L_0x00ec:
            java.util.LinkedHashMap r0 = r10.A0L
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            android.widget.ImageButton r0 = r10.A01
            X.AnonymousClass3MU.A01(r0, r1, r6)
            goto L_0x0060
        L_0x00fb:
            X.0ts r5 = r10.A00
            r4 = 2131755223(0x7f1000d7, float:1.914132E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r8.size()
            X.AnonymousClass000.A1L(r1, r0, r6)
            java.lang.String r0 = r5.A0L(r1, r4, r2)
            r9.A0P(r0)
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.audiopicker.AudioPickerActivity.A0u():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_search);
        if (this.A0S) {
            icon.setIcon(R.drawable.ic_search_normal);
        }
        icon.setShowAsAction(10);
        this.A0N = menu;
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        if (findItem != null) {
            if (this.A0O.getCount() > 0) {
                z = true;
            }
            findItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0D.A00();
        this.A0D = null;
        AnonymousClass3UR.A02(this.A00, this.A0B);
        AnonymousClass1RY r0 = this.A07;
        if (r0 != null) {
            r0.A02();
            this.A07 = null;
        }
        this.A09.A02(7);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        AnonymousClass3UR.A07(this.A0B);
        C36431kI.A0o(this.A0H).A01(this.A00);
    }

    public void onStart() {
        A0u();
        C07540Ye.A00(this).A02((Bundle) null, this);
        super.onStart();
        if (this.A0S) {
            this.A0G.A03(this.A0R, this);
        }
    }

    public void onStop() {
        C148826zU A002;
        super.onStop();
        if (!this.A0B.A0C() && (A002 = this.A0B.A00()) != null) {
            A002.A0H(true, false);
            this.A0B.A08((C148826zU) null);
        }
    }
}
