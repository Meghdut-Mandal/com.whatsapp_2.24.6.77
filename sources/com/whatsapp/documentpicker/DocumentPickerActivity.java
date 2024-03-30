package com.whatsapp.documentpicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass0V4;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass1H2;
import X.AnonymousClass1RC;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1V9;
import X.AnonymousClass27s;
import X.AnonymousClass3GY;
import X.AnonymousClass3HF;
import X.AnonymousClass3LW;
import X.AnonymousClass3MR;
import X.AnonymousClass3TF;
import X.AnonymousClass3UG;
import X.AnonymousClass3UR;
import X.AnonymousClass3Y0;
import X.AnonymousClass4SF;
import X.AnonymousClass4XI;
import X.AnonymousClass4XS;
import X.C012005e;
import X.C021809f;
import X.C07540Ye;
import X.C14960mT;
import X.C17210qu;
import X.C177618e5;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C19550w8;
import X.C19600wD;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C20830yE;
import X.C21060yb;
import X.C222013h;
import X.C24341Cb;
import X.C25561Gu;
import X.C25571Gv;
import X.C27731Pn;
import X.C33521fV;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C38001nY;
import X.C39001qm;
import X.C39591sn;
import X.C40151v2;
import X.C54352so;
import X.C64813Pn;
import X.C64953Qc;
import X.C66033Uk;
import X.C67463Zx;
import X.C74143l8;
import X.C88354Sj;
import X.C89594Xd;
import X.C89764Xu;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DocumentPickerActivity extends AnonymousClass27s implements C17210qu, C88354Sj, AnonymousClass4SF {
    public int A00 = 0;
    public MenuItem A01;
    public View A02;
    public AnonymousClass0V9 A03;
    public AnonymousClass16D A04;
    public AnonymousClass185 A05;
    public AnonymousClass171 A06;
    public AnonymousClass1RY A07;
    public C27731Pn A08;
    public C64953Qc A09;
    public AnonymousClass3HF A0A;
    public AnonymousClass1V6 A0B;
    public C24341Cb A0C;
    public C20830yE A0D;
    public C18820ts A0E;
    public C38001nY A0F;
    public C74143l8 A0G;
    public C54352so A0H;
    public AnonymousClass11F A0I;
    public C64813Pn A0J;
    public C39591sn A0K;
    public AnonymousClass005 A0L;
    public AnonymousClass005 A0M;
    public String A0N;
    public ArrayList A0O;
    public List A0P;
    public List A0Q;
    public boolean A0R;
    public ViewGroup A0S;
    public AnonymousClass07B A0T;
    public BottomSheetBehavior A0U;
    public WaTextView A0V;
    public boolean A0W;
    public final C021809f A0X = new C67463Zx(this);
    public final List A0Y = AnonymousClass001.A0I();

    public class SendDocumentsConfirmationDialogFragment extends Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment {
        public C19600wD A00;
        public AnonymousClass16D A01;
        public AnonymousClass185 A02;
        public AnonymousClass171 A03;
        public C64953Qc A04;
        public C21060yb A05;
        public AnonymousClass1H2 A06;

        public static SendDocumentsConfirmationDialogFragment A03(AnonymousClass11F r3, ArrayList arrayList, int i, boolean z) {
            SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
            Bundle A07 = C36331k8.A07(r3);
            A07.putParcelableArrayList("uri_list", arrayList);
            A07.putInt("dialog_type", i);
            A07.putBoolean("finish_on_cancel", z);
            sendDocumentsConfirmationDialogFragment.A17(A07);
            return sendDocumentsConfirmationDialogFragment;
        }

        public Dialog A1a(Bundle bundle) {
            String quantityString;
            AnonymousClass11F A0i = C36351kA.A0i(A0b(), "jid");
            C18740tg.A06(A0i);
            String A0H = this.A03.A0H(this.A01.A0D(A0i));
            ArrayList parcelableArrayList = A0b().getParcelableArrayList("uri_list");
            C18740tg.A06(parcelableArrayList);
            int i = A0b().getInt("dialog_type");
            boolean z = A0b().getBoolean("finish_on_cancel");
            C18740tg.A06(Boolean.valueOf(z));
            String A022 = C25571Gv.A02((Uri) parcelableArrayList.get(0), this.A05);
            int size = parcelableArrayList.size();
            if (i == 0) {
                quantityString = A0n(R.string.f12nameremoved);
            } else {
                int i2 = R.string.f12nameremoved;
                int i3 = R.plurals.f10nameremoved;
                if (i == 2) {
                    i2 = R.string.f12nameremoved;
                    i3 = R.plurals.f10nameremoved;
                }
                if (size != 1 || TextUtils.isEmpty(A022)) {
                    Resources A0G = C36341k9.A0G(this);
                    Object[] objArr = new Object[2];
                    AnonymousClass000.A1L(objArr, size, 0);
                    objArr[1] = A0H;
                    quantityString = A0G.getQuantityString(i3, size, objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = A022;
                    quantityString = C36401kF.A0q(this, A0H, objArr2, 1, i2);
                }
            }
            C39001qm A032 = AnonymousClass3LW.A03(this);
            int i4 = R.string.f12nameremoved;
            CharSequence A052 = AnonymousClass3UG.A05(A1D(), this.A06, quantityString);
            if (i == 0) {
                A032.setTitle(A052);
                String A023 = AnonymousClass3TF.A02(this.A01, C25561Gu.A00(this.A05, parcelableArrayList));
                int size2 = parcelableArrayList.size();
                int i5 = R.string.f12nameremoved;
                if (size2 == 1) {
                    i5 = R.string.f12nameremoved;
                }
                A032.A0Z(C36401kF.A0q(this, A023, new Object[1], 0, i5));
                i4 = R.string.f12nameremoved;
            } else {
                A032.A0Z(A052);
            }
            A032.setPositiveButton(i4, new AnonymousClass4XI(A0i, parcelableArrayList, this, 10));
            return C36431kI.A0R(new AnonymousClass4XS(3, this, z), A032, R.string.f12nameremoved);
        }
    }

    public static void A0v(Uri uri, DocumentPickerActivity documentPickerActivity) {
        documentPickerActivity.startActivityForResult(AnonymousClass190.A0R(documentPickerActivity, uri, documentPickerActivity.A0I, documentPickerActivity.getIntent().getStringExtra("caption"), documentPickerActivity.getIntent().getStringExtra("mentions"), C36421kH.A1T(documentPickerActivity.getIntent(), "send")), 36);
    }

    public static void A0x(DocumentPickerActivity documentPickerActivity) {
        DocumentPickerActivity documentPickerActivity2 = documentPickerActivity;
        int A072 = documentPickerActivity.A0D.A07(2614);
        AnonymousClass11F r3 = documentPickerActivity.A0I;
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass00C.A0D(r3, 1);
        documentPickerActivity2.startActivityForResult(AnonymousClass190.A0Z(documentPickerActivity2, r3, (AnonymousClass147) null, "", A0I2, A072, 39, 36, 0, false, false, true), 22);
    }

    public void Ba7(AnonymousClass0V4 r1) {
    }

    private int A0u(AnonymousClass11F r8, List list) {
        boolean A1U = C36381kD.A1U(this.A07.A03(false), 1);
        long A002 = C25561Gu.A00(this.A08, list) / SearchActionVerificationClientService.MS_TO_NS;
        if (A1U && A002 > 100) {
            return 0;
        }
        AnonymousClass141 A0D2 = this.A04.A0D(r8);
        if ((A0D2.A0H instanceof C177618e5) || A0D2.A0G()) {
            return 2;
        }
        return 1;
    }

    public static void A0w(AnonymousClass3GY r8, DocumentPickerActivity documentPickerActivity) {
        List list = documentPickerActivity.A0Y;
        if (list.contains(r8)) {
            list.remove(r8);
            if (list.isEmpty()) {
                documentPickerActivity.A03.A05();
            }
            documentPickerActivity.A03.A06();
        } else {
            int A072 = documentPickerActivity.A0D.A07(2614);
            if (list.size() >= A072) {
                A072 = documentPickerActivity.A0D.A07(2693);
            }
            if (list.size() >= A072) {
                AnonymousClass17Y r2 = documentPickerActivity.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, A072, 0);
                r2.A0E(documentPickerActivity.getString(R.string.f12nameremoved, objArr), 0);
            } else {
                list.add(r8);
                documentPickerActivity.A03.A06();
            }
        }
        if (!list.isEmpty()) {
            C21060yb r82 = documentPickerActivity.A08;
            Resources resources = documentPickerActivity.getResources();
            int size = list.size();
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1L(objArr2, list.size(), 0);
            C33521fV.A00(documentPickerActivity, r82, resources.getQuantityString(R.plurals.f10nameremoved, size, objArr2));
        }
        documentPickerActivity.A0F.notifyDataSetChanged();
    }

    public static void A0z(DocumentPickerActivity documentPickerActivity) {
        if (documentPickerActivity.A0F.getCount() == 0) {
            if (documentPickerActivity.A0P == null) {
                C36341k9.A13(documentPickerActivity, R.id.search_no_matches, 8);
                C36341k9.A13(documentPickerActivity, R.id.progress, 0);
            } else {
                ArrayList arrayList = documentPickerActivity.A0O;
                if (arrayList == null || arrayList.isEmpty()) {
                    TextView A0Q2 = C36391kE.A0Q(documentPickerActivity, R.id.search_no_matches);
                    A0Q2.setVisibility(0);
                    A0Q2.setText(R.string.f12nameremoved);
                } else {
                    TextView A0Q3 = C36391kE.A0Q(documentPickerActivity, R.id.search_no_matches);
                    A0Q3.setVisibility(0);
                    Object[] A0L2 = AnonymousClass001.A0L();
                    A0L2[0] = documentPickerActivity.A0N;
                    C36341k9.A0s(documentPickerActivity, A0Q3, A0L2, R.string.f12nameremoved);
                }
                C36341k9.A13(documentPickerActivity, R.id.progress, 8);
            }
            C36341k9.A13(documentPickerActivity, 16908292, 0);
            WaTextView waTextView = documentPickerActivity.A0V;
            if (waTextView != null) {
                waTextView.setVisibility(8);
                return;
            }
            return;
        }
        C36341k9.A13(documentPickerActivity, 16908292, 8);
        WaTextView waTextView2 = documentPickerActivity.A0V;
        if (waTextView2 != null) {
            waTextView2.setVisibility(0);
        }
    }

    public AnonymousClass0V4 BUt(Bundle bundle, int i) {
        return new C40151v2(this, this.A04, this.A0E, this.A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r5.isEmpty() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Ba0(X.AnonymousClass0V4 r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.util.List r5 = (java.util.List) r5
            r3.A0P = r5
            android.view.MenuItem r2 = r3.A01
            if (r2 == 0) goto L_0x0015
            if (r5 == 0) goto L_0x0011
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.setVisible(r0)
        L_0x0015:
            java.lang.String r1 = r3.A0N
            X.1nY r0 = r3.A0F
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.Ba0(X.0V4, java.lang.Object):void");
    }

    public void onBackPressed() {
        this.A0L.get();
        if (A12(this)) {
            A0y(this);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        double A002;
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.f12nameremoved);
        AnonymousClass11F A0F2 = C36331k8.A0F(this);
        C18740tg.A07(A0F2, "rawJid is not a valid chat jid string");
        this.A0I = A0F2;
        this.A00 = C36341k9.A0E(this.A09).getInt("document_picker_sort", this.A00);
        boolean A003 = AnonymousClass3MR.A00(this.A0D);
        this.A0R = A003;
        int i = R.layout.f9nameremoved;
        if (A003) {
            i = R.layout.f9nameremoved;
        }
        setContentView(i);
        this.A0S = C36421kH.A0E(this, R.id.search_fragment_holder);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        this.A0T = supportActionBar;
        boolean z = true;
        supportActionBar.A0U(true);
        this.A0T.A0W(true);
        this.A0F = new C38001nY(this);
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        WaTextView A0Z = C36411kG.A0Z(inflate, R.id.recentsHeader);
        this.A0V = A0Z;
        A0Z.setText(R.string.f12nameremoved);
        if (this.A0F.getCount() == 0) {
            this.A0V.setVisibility(8);
        }
        TextView A0P2 = C36391kE.A0P(inflate, R.id.subtitle);
        Object[] objArr = new Object[1];
        int i2 = this.A0G.A00;
        float f = ((float) i2) / 1024.0f;
        boolean z2 = false;
        if (f < 1.0f) {
            A002 = (double) i2;
            str = "MB";
        } else {
            A002 = ((double) C14960mT.A00(((double) f) * 10.0d)) / 10.0d;
            str = "GB";
        }
        int i3 = (int) A002;
        if (A002 == ((double) i3) * 1.0d) {
            z2 = true;
        }
        boolean z3 = !z2;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (z3) {
            A0u.append(A002);
        } else {
            A0u.append(i3);
        }
        String A0p = AnonymousClass000.A0p(" ", str, A0u);
        AnonymousClass00C.A08(A0p);
        objArr[0] = A0p;
        C36341k9.A0s(this, A0P2, objArr, R.string.f12nameremoved);
        AnonymousClass3Y0.A01(inflate.findViewById(R.id.browseOtherDocs), this, 21);
        View findViewById = inflate.findViewById(R.id.chooseFromGallery);
        findViewById.setVisibility(0);
        AnonymousClass3Y0.A01(findViewById, this, 22);
        getListView().addHeaderView(inflate);
        C36421kH.A11(inflate, this, 10);
        A3i(this.A0F);
        C89594Xd.A00(getListView(), this, 6);
        getListView().setOnItemLongClickListener(new C89764Xu(this, 1));
        if (bundle == null || !bundle2.getBoolean("system_picker_auto_started")) {
            z = false;
        }
        this.A0W = z;
        C07540Ye.A00(this).A03(this);
        if (this.A0R) {
            View A022 = C012005e.A02(this.A00, R.id.document_picker_activity);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A0U = bottomSheetBehavior;
            this.A0J.A02(A022, bottomSheetBehavior, this, this.A0C);
        }
    }

    public void onResume() {
        super.onResume();
        boolean z = C36431kI.A0o(this.A0L).A03;
        View view = this.A00;
        if (z) {
            C20810yC r15 = this.A0D;
            AnonymousClass17Y r13 = this.A05;
            C19730wQ r12 = this.A02;
            C19770wU r11 = this.A04;
            C27731Pn r10 = this.A08;
            AnonymousClass16D r9 = this.A04;
            AnonymousClass171 r8 = this.A06;
            C18820ts r7 = this.A0E;
            AnonymousClass3HF r6 = this.A0A;
            AnonymousClass1V6 r5 = this.A0B;
            AnonymousClass005 r4 = this.A0L;
            AnonymousClass005 r3 = this.A0M;
            View view2 = this.A02;
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
            Pair A002 = AnonymousClass3UR.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "document-picker-activity");
            this.A02 = (View) A002.first;
            this.A07 = (AnonymousClass1RY) A002.second;
        } else if (AnonymousClass1V9.A00(view)) {
            AnonymousClass3UR.A04(this.A00, this.A0B, this.A0L);
        }
        C36421kH.A1I(this.A0L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0y(com.whatsapp.documentpicker.DocumentPickerActivity r3) {
        /*
            X.01z r1 = r3.getSupportFragmentManager()
            boolean r0 = r1.A0r()
            if (r0 != 0) goto L_0x0045
            java.lang.String r2 = "search_fragment"
            X.02E r0 = r1.A0N(r2)
            com.whatsapp.base.WDSSearchViewFragment r0 = (com.whatsapp.base.WDSSearchViewFragment) r0
            if (r0 == 0) goto L_0x0017
            r0.A1Z()
        L_0x0017:
            X.01z r1 = r3.getSupportFragmentManager()
            r0 = 1
            r1.A0n(r2, r0)
            android.view.ViewGroup r0 = r3.A0S
            X.C36341k9.A0y(r0)
            X.07B r0 = r3.A0T
            if (r0 == 0) goto L_0x002b
            r0.A0E()
        L_0x002b:
            r0 = 0
            r3.A0O = r0
            A0z(r3)
            boolean r0 = X.C19550w8.A01()
            if (r0 != 0) goto L_0x003e
            boolean r1 = X.C222013h.A05
            r0 = 2131102715(0x7f060bfb, float:1.7817876E38)
            if (r1 != 0) goto L_0x0042
        L_0x003e:
            int r0 = X.C36441kJ.A04(r3)
        L_0x0042:
            X.AnonymousClass1RC.A04(r3, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.A0y(com.whatsapp.documentpicker.DocumentPickerActivity):void");
    }

    public static void A10(DocumentPickerActivity documentPickerActivity, Collection collection) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0I2.add(Uri.fromFile(((AnonymousClass3GY) it.next()).A00));
        }
        int A0u = documentPickerActivity.A0u(documentPickerActivity.A0I, A0I2);
        if (A0u != 0) {
            if (C25571Gv.A04(documentPickerActivity.A05, documentPickerActivity.A0I, A0I2.size())) {
                A0v((Uri) A0I2.get(0), documentPickerActivity);
                return;
            }
        }
        C36331k8.A12(SendDocumentsConfirmationDialogFragment.A03(documentPickerActivity.A0I, A0I2, A0u, false), documentPickerActivity);
    }

    private void A11(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                grantUriPermission("com.whatsapp", (Uri) it.next(), 1);
            } catch (SecurityException e) {
                Log.w("docpicker/permission ", e);
            }
        }
    }

    public static boolean A12(DocumentPickerActivity documentPickerActivity) {
        AnonymousClass02E A0N2;
        AnonymousClass01z supportFragmentManager = documentPickerActivity.getSupportFragmentManager();
        if (supportFragmentManager.A0I() != 1 || (A0N2 = supportFragmentManager.A0N("search_fragment")) == null || !A0N2.A15()) {
            return false;
        }
        return true;
    }

    public C39591sn BH4() {
        return this.A0K;
    }

    public void Bih(AnonymousClass0V9 r3) {
        int A042;
        super.Bih(r3);
        if (!C19550w8.A01() && C222013h.A05) {
            A042 = R.color.f6nameremoved;
        } else if (A12(this)) {
            AnonymousClass1RC.A04(this, R.color.f6nameremoved);
            AnonymousClass1RC.A09(getWindow(), true);
            return;
        } else {
            A042 = C36441kJ.A04(this);
        }
        AnonymousClass1RC.A04(this, A042);
    }

    public void Bii(AnonymousClass0V9 r3) {
        super.Bii(r3);
        if (A12(this)) {
            AnonymousClass1RC.A09(getWindow(), false);
        }
        C36341k9.A0n(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bps(java.util.ArrayList r5) {
        /*
            r4 = this;
            r4.A11(r5)
            X.11F r0 = r4.A0I
            int r3 = r4.A0u(r0, r5)
            X.11F r2 = r4.A0I
            java.util.List r0 = r4.A0P
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            com.whatsapp.documentpicker.DocumentPickerActivity$SendDocumentsConfirmationDialogFragment r0 = com.whatsapp.documentpicker.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.A03(r2, r5, r3, r0)
            X.C36331k8.A12(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.Bps(java.util.ArrayList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r8 == -1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 1
            r1 = -1
            if (r7 == r0) goto L_0x004a
            r0 = 2
            if (r7 == r0) goto L_0x0034
            r0 = 22
            if (r7 == r0) goto L_0x0017
            r0 = 36
            if (r7 == r0) goto L_0x002d
            r0 = 90
            if (r7 == r0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            if (r8 != r1) goto L_0x00a8
            if (r9 == 0) goto L_0x0016
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r1 = r9.getParcelableArrayListExtra(r0)
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002f
            r6.Bps(r1)
            return
        L_0x002d:
            if (r8 != r1) goto L_0x0017
        L_0x002f:
            r6.setResult(r8, r9)
            goto L_0x00b4
        L_0x0034:
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x0016
            if (r8 != 0) goto L_0x0016
            X.0yE r0 = r6.A0D
            X.2nw r1 = r0.A04()
            X.2nw r0 = X.C51512nw.PARTIAL
            if (r1 != r0) goto L_0x0016
            A0x(r6)
            return
        L_0x004a:
            if (r8 != r1) goto L_0x00a8
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            android.content.ClipData r2 = r9.getClipData()
            r4 = 0
            if (r2 == 0) goto L_0x0070
            r1 = 0
        L_0x0058:
            int r0 = r2.getItemCount()
            if (r1 >= r0) goto L_0x0070
            android.content.ClipData$Item r0 = r2.getItemAt(r1)
            if (r0 == 0) goto L_0x006d
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L_0x006d
            r5.add(r0)
        L_0x006d:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0070:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x007f
            android.net.Uri r0 = r9.getData()
            if (r0 == 0) goto L_0x007f
            r5.add(r0)
        L_0x007f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0016
            r6.A11(r5)
            X.11F r0 = r6.A0I
            int r3 = r6.A0u(r0, r5)
            if (r3 == 0) goto L_0x00b8
            X.185 r2 = r6.A05
            int r1 = r5.size()
            X.11F r0 = r6.A0I
            boolean r0 = X.C25571Gv.A04(r2, r0, r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r5.get(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            A0v(r0, r6)
            return
        L_0x00a8:
            if (r8 != 0) goto L_0x0016
            java.util.List r0 = r6.A0P
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0016
        L_0x00b4:
            r6.finish()
            return
        L_0x00b8:
            X.11F r1 = r6.A0I
            java.util.List r0 = r6.A0P
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            com.whatsapp.documentpicker.DocumentPickerActivity$SendDocumentsConfirmationDialogFragment r0 = com.whatsapp.documentpicker.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.A03(r1, r5, r3, r4)
            X.C36331k8.A12(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131820558(0x7f11000e, float:1.9273834E38)
            r1.inflate(r0, r4)
            r0 = 2131431681(0x7f0b1101, float:1.8485098E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            r3.A01 = r2
            java.util.List r0 = r3.A0P
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r2.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3UR.A02(this.A02, this.A0B);
        AnonymousClass1RY r0 = this.A07;
        if (r0 != null) {
            r0.A02();
            this.A07 = null;
        }
        this.A09.A02(2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putInt;
        if (menuItem.getItemId() == R.id.menuitem_sort_by_name) {
            this.A00 = 0;
            putInt = C36421kH.A0A(this).putInt("document_picker_sort", 0);
        } else if (menuItem.getItemId() == R.id.menuitem_sort_by_date) {
            this.A00 = 1;
            putInt = C36421kH.A0A(this).putInt("document_picker_sort", 1);
        } else if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else {
            if (menuItem.getItemId() == R.id.menuitem_search) {
                AnonymousClass07B r0 = this.A0T;
                if (r0 != null) {
                    r0.A0D();
                }
                if (this.A0K == null) {
                    C39591sn r2 = (C39591sn) C36441kJ.A0b(this).A00(C39591sn.class);
                    this.A0K = r2;
                    r2.A00.A08(this, new C66033Uk(this, 40));
                    C39591sn r22 = this.A0K;
                    r22.A01.A08(this, new C66033Uk(this, 41));
                }
                ViewGroup viewGroup = this.A0S;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
                WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) supportFragmentManager.A0N("search_fragment");
                if (wDSSearchViewFragment == null) {
                    wDSSearchViewFragment = new WDSSearchViewFragment();
                    AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
                    r1.A0G = true;
                    r1.A0F(wDSSearchViewFragment, "search_fragment", R.id.search_fragment_holder);
                    r1.A0J("search_fragment");
                    r1.A01();
                    supportFragmentManager.A0T();
                }
                WDSConversationSearchView wDSConversationSearchView = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A02();
                    return true;
                }
            }
            return true;
        }
        putInt.apply();
        invalidateOptionsMenu();
        this.A0F.getFilter().filter(this.A0N);
        return true;
    }

    public void onPause() {
        super.onPause();
        AnonymousClass3UR.A07(this.A0B);
        C36431kI.A0o(this.A0L).A01(this.A00);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_sort_by_name);
        MenuItem findItem2 = menu.findItem(R.id.menuitem_sort_by_date);
        if (this.A00 == 0) {
            findItem.setChecked(true);
            return true;
        }
        findItem2.setChecked(true);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("system_picker_auto_started", this.A0W);
    }

    public void onStart() {
        super.onStart();
        if (this.A0R) {
            this.A0J.A03(this.A0U, this);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("docpicker/pick-from-doc-provider ", e);
            this.A05.A06(R.string.f12nameremoved, 0);
        }
    }
}
