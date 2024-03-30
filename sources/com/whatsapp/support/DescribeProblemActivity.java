package com.whatsapp.support;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass147;
import X.AnonymousClass1CF;
import X.AnonymousClass1EU;
import X.AnonymousClass1GX;
import X.AnonymousClass1M4;
import X.AnonymousClass1X5;
import X.AnonymousClass26V;
import X.AnonymousClass2OI;
import X.AnonymousClass3DY;
import X.AnonymousClass3E6;
import X.AnonymousClass3FE;
import X.AnonymousClass3GU;
import X.AnonymousClass3UJ;
import X.AnonymousClass3XH;
import X.AnonymousClass4S7;
import X.AnonymousClass4TG;
import X.C03570Gk;
import X.C176658cT;
import X.C1906499t;
import X.C20050ww;
import X.C20380xT;
import X.C20830yE;
import X.C21010yW;
import X.C23075B3f;
import X.C24341Cb;
import X.C31211bS;
import X.C33761ft;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C50092kC;
import X.C50132kG;
import X.C61063Ak;
import X.C63533Kk;
import X.C64223Nd;
import X.C81203wd;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.LabeledIntent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DescribeProblemActivity extends AnonymousClass26V implements AnonymousClass4TG, AnonymousClass4S7 {
    public int A00;
    public Uri A01;
    public EditText A02;
    public AppCompatCheckBox A03;
    public AnonymousClass3DY A04;
    public C20050ww A05;
    public C24341Cb A06;
    public C20830yE A07;
    public C21010yW A08;
    public AnonymousClass1CF A09;
    public C33761ft A0A;
    public AnonymousClass3E6 A0B;
    public C50132kG A0C;
    public WhatsAppLibLoader A0D;
    public AnonymousClass1EU A0E;
    public C63533Kk A0F;
    public AnonymousClass3FE A0G;
    public C20380xT A0H;
    public C31211bS A0I;
    public AnonymousClass1M4 A0J;
    public AnonymousClass1GX A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public AnonymousClass3GU A0P;
    public final Uri[] A0Q = new Uri[3];

    public static void A0J(DescribeProblemActivity describeProblemActivity) {
        ArrayList arrayList;
        boolean z;
        AppCompatCheckBox appCompatCheckBox;
        DescribeProblemActivity describeProblemActivity2 = describeProblemActivity;
        describeProblemActivity.A0F(3);
        AnonymousClass3FE r4 = describeProblemActivity.A0G;
        String str = describeProblemActivity.A0M;
        String str2 = describeProblemActivity.A0L;
        String str3 = describeProblemActivity.A0N;
        String A012 = A01(describeProblemActivity);
        Uri[] uriArr = describeProblemActivity.A0Q;
        C63533Kk r0 = describeProblemActivity.A0F;
        if (r0 != null) {
            arrayList = r0.A00();
        } else {
            arrayList = null;
        }
        if (!describeProblemActivity.A0L() || ((appCompatCheckBox = describeProblemActivity.A03) != null && appCompatCheckBox.isChecked())) {
            z = true;
        } else {
            z = false;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (Uri uri : uriArr) {
            if (uri != null) {
                A0I2.add(uri);
            }
        }
        r4.A00(describeProblemActivity2, (AnonymousClass3XH) null, (AnonymousClass147) null, str, A012, str2, str3, A0I2, arrayList, z);
    }

    public static boolean A0M(String str, boolean z) {
        int length;
        int i;
        if (!z) {
            length = str.getBytes().length;
            i = 10;
        } else if (!str.contains("\n\n")) {
            return false;
        } else {
            length = str.substring(str.indexOf("\n\n", 0) + "\n\n".getBytes().length).getBytes().length;
            i = 45;
        }
        return length < i;
    }

    public void BWQ() {
        this.A0C = null;
        A0I(this);
    }

    public void onBackPressed() {
        A0F(1);
        super.onBackPressed();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 2) {
            return super.onCreateDialog(i);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        C36331k8.A0p(progressDialog, getString(R.string.f12nameremoved));
        return progressDialog;
    }

    private void A07(int i) {
        if (this.A0E.A05() != null && this.A0E.A05().BBn() != null) {
            C23075B3f BBn = this.A0E.A05().BBn();
            C176658cT B4W = BBn.B4W();
            B4W.A08 = Integer.valueOf(i);
            B4W.A0b = "payments_in_app_support_view";
            BBn.BOl(B4W);
        }
    }

    private void A0F(int i) {
        AnonymousClass2OI r1 = new AnonymousClass2OI();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = this.A00.A06();
        this.A08.Blw(r1);
    }

    private void A0H(Uri uri, int i) {
        int i2;
        Uri uri2 = uri;
        this.A0Q[i] = uri;
        AddScreenshotImageView addScreenshotImageView = (AddScreenshotImageView) ((ViewGroup) C03570Gk.A0B(this, R.id.screenshots)).getChildAt(i);
        if (uri != null) {
            Point point = new Point();
            C36321k7.A0K(this, point);
            int i3 = point.x / 3;
            try {
                addScreenshotImageView.setScreenshot(this.A0K.A0f(uri2, i3 / 2, i3, this.A0D.A04(), false));
                C36331k8.A0q(this, addScreenshotImageView, R.string.f12nameremoved);
            } catch (IOException e) {
                C36321k7.A1M(uri, "descprob/screenshot/io-exception ", AnonymousClass000.A0u(), e);
                i2 = R.string.f12nameremoved;
                BO5(i2);
                C36331k8.A0q(this, addScreenshotImageView, R.string.f12nameremoved);
            } catch (AnonymousClass1X5 e2) {
                C36321k7.A1M(uri, "descprob/screenshot/not-an-image ", AnonymousClass000.A0u(), e2);
                i2 = R.string.f12nameremoved;
                BO5(i2);
                C36331k8.A0q(this, addScreenshotImageView, R.string.f12nameremoved);
            }
        } else {
            Bitmap bitmap = addScreenshotImageView.A02;
            if (bitmap != null) {
                bitmap.recycle();
                addScreenshotImageView.A02 = null;
            }
            AddScreenshotImageView.A02(addScreenshotImageView);
            C36331k8.A0q(this, addScreenshotImageView, R.string.f12nameremoved);
        }
    }

    public static void A0K(DescribeProblemActivity describeProblemActivity, int i) {
        Intent labeledIntent;
        if (describeProblemActivity.A07.A0D()) {
            ArrayList A14 = C36441kJ.A14(2);
            A14.add(new C64223Nd(new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI).setType("image/*")));
            if (describeProblemActivity.A0Q[i] != null) {
                Intent A0D2 = C36431kI.A0D();
                A0D2.setClassName(describeProblemActivity.getPackageName(), "com.whatsapp.support.Remove");
                A14.add(new C64223Nd(A0D2, describeProblemActivity.getString(R.string.f12nameremoved)));
            }
            int size = A14.size();
            ArrayList A142 = C36441kJ.A14(size);
            Intent intent = ((C64223Nd) C36441kJ.A12(A14)).A01;
            A0G(intent);
            A142.add(intent);
            for (int i2 = 1; i2 < size; i2++) {
                C64223Nd r9 = (C64223Nd) A14.get(i2);
                String str = r9.A02;
                if (str == null) {
                    labeledIntent = r9.A01;
                } else {
                    Intent intent2 = r9.A01;
                    labeledIntent = new LabeledIntent(C36431kI.A0D().setComponent(intent2.resolveActivity(describeProblemActivity.getPackageManager())).setData(intent2.getData()).putExtras(intent2), describeProblemActivity.getPackageName(), str, r9.A00);
                }
                A0G(labeledIntent);
                A142.add(labeledIntent);
            }
            describeProblemActivity.startActivityForResult(AnonymousClass3UJ.A01((IntentSender) null, (CharSequence) null, A142), i | 16);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = R.string.f12nameremoved;
        if (i3 < 30) {
            i4 = R.string.f12nameremoved;
        }
        RequestPermissionActivity.A0F(describeProblemActivity, R.string.f12nameremoved, i4, i | 48);
    }

    private boolean A0L() {
        if (!C1906499t.A00(this.A0M) || !this.A0D.A0E(2237) || !this.A0E.A05().getName().equals("UPI")) {
            return false;
        }
        return true;
    }

    public void Bfz(C61063Ak r14) {
        String str = this.A0M;
        String str2 = r14.A02;
        ArrayList arrayList = r14.A05;
        String str3 = this.A0N;
        int i = r14.A00;
        ArrayList arrayList2 = r14.A06;
        ArrayList arrayList3 = r14.A03;
        ArrayList arrayList4 = r14.A07;
        ArrayList arrayList5 = r14.A04;
        List list = r14.A08;
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(getPackageName(), "com.whatsapp.support.faq.SearchFAQ");
        A0D2.putExtra("com.whatsapp.support.faq.SearchFAQ.from", str);
        A0D2.putExtra("com.whatsapp.support.faq.SearchFAQ.problem", str2);
        A0D2.putExtra("com.whatsapp.support.faq.SearchFAQ.status", str3);
        A0D2.putExtra("com.whatsapp.support.faq.SearchFAQ.count", i);
        A0D2.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles", arrayList2);
        A0D2.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions", arrayList3);
        A0D2.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls", arrayList4);
        A0D2.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids", arrayList5);
        A0D2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        if (list != null) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Pair pair = (Pair) list.get(i2);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append((String) pair.first);
                A0u.append(":");
                strArr[i2] = AnonymousClass000.A0q((String) pair.second, A0u);
            }
            A0D2.putExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails", strArr);
        }
        BuO(A0D2, 32);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int i3;
        if ((i & 16) == 16) {
            if (i2 == -1 && intent != null) {
                if (intent.getBooleanExtra("is_removed", false)) {
                    i3 = i - 16;
                    data = null;
                } else {
                    data = intent.getData();
                    if (data != null) {
                        try {
                            grantUriPermission("com.whatsapp", data, 1);
                        } catch (SecurityException e) {
                            Log.w("descprob/permission", e);
                        }
                        i3 = i - 16;
                    } else {
                        BO5(R.string.f12nameremoved);
                        return;
                    }
                }
                A0H(data, i3);
            }
        } else if (i == 32) {
            if (i2 == -1) {
                finish();
            }
        } else if ((i & 48) != 48) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0K(this, i - 48);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01df, code lost:
        if (r1 == 3) goto L_0x01e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r2 = r18
            r9 = r19
            super.onCreate(r9)
            r0 = 2131888766(0x7f120a7e, float:1.9412177E38)
            r2.setTitle(r0)
            X.07B r4 = X.C36381kD.A0O(r2)
            r3 = 1
            r4.A0U(r3)
            r4.A0V(r3)
            r0 = 2131624789(0x7f0e0355, float:1.8876768E38)
            r2.setContentView((int) r0)
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            android.view.View r17 = r2.findViewById(r0)
            r0 = 2131429496(0x7f0b0878, float:1.8480666E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r2.A02 = r0
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            r2.A03 = r0
            r0.setChecked(r3)
            r0 = 2131433851(0x7f0b197b, float:1.84895E38)
            r8 = 2131433851(0x7f0b197b, float:1.84895E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 32
            X.C67103Yn.A00(r1, r2, r0)
            r0 = 2131429497(0x7f0b0879, float:1.8480668E38)
            android.view.View r7 = r2.findViewById(r0)
            r0 = 2131432071(0x7f0b1287, float:1.848589E38)
            android.view.View r6 = r2.findViewById(r0)
            android.widget.EditText r0 = r2.A02
            java.lang.String r0 = X.C36361kB.A0n(r0)
            int r0 = r0.length()
            r5 = 0
            boolean r0 = X.C36371kC.A1T(r0, r3)
            r6.setEnabled(r0)
            android.widget.EditText r3 = r2.A02
            r1 = 6
            X.4WK r0 = new X.4WK
            r0.<init>(r2, r6, r1)
            r3.addTextChangedListener(r0)
            boolean r0 = r2.A0L()
            if (r0 == 0) goto L_0x008a
            r2.A07(r5)
            android.view.View r0 = r2.findViewById(r8)
            if (r0 == 0) goto L_0x008a
            r0.setVisibility(r5)
        L_0x008a:
            r0 = 31
            X.AnonymousClass3YC.A00(r6, r2, r7, r0)
            android.content.Intent r10 = r2.getIntent()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            java.lang.String r0 = r10.getStringExtra(r0)
            r2.A0M = r0
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.serverstatus"
            java.lang.String r0 = r10.getStringExtra(r0)
            r2.A0N = r0
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.emailAddress"
            java.lang.String r0 = r10.getStringExtra(r0)
            r2.A0L = r0
            X.1ft r0 = r2.A0A
            android.util.Pair r5 = r0.A00()
            X.0xT r3 = r2.A0H
            r1 = 0
            java.lang.String r0 = "general"
            android.net.Uri r0 = X.C20380xT.A00(r5, r3, r0, r1, r1)
            r2.A01 = r0
            java.lang.String r0 = r2.A0M
            boolean r0 = X.C1906499t.A00(r0)
            if (r0 == 0) goto L_0x00e8
            X.0yf r1 = r2.A06
            X.0yj r0 = X.C21100yf.A24
            java.lang.String r1 = r1.A07(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d4
            r2.A0L = r1
        L_0x00d4:
            X.0yf r1 = r2.A06
            X.0yj r0 = X.C21100yf.A25
            java.lang.String r1 = r1.A07(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00e8
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r2.A01 = r0
        L_0x00e8:
            r0 = 2131433558(0x7f0b1856, float:1.8488905E38)
            android.view.View r8 = X.C03570Gk.A0B(r2, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.removeAllViews()
            java.lang.String r0 = r2.A0M
            boolean r0 = X.C1906499t.A00(r0)
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs"
            java.util.ArrayList r16 = r10.getStringArrayListExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles"
            java.util.ArrayList r7 = r10.getStringArrayListExtra(r0)
            X.1EU r0 = r2.A0E
            X.B66 r0 = r0.A05()
            X.3Kk r0 = r0.BFU()
            r2.A0F = r0
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankPhone"
            java.lang.String r13 = r10.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentMethod"
            android.os.Parcelable r12 = r10.getParcelableExtra(r0)
            X.9un r12 = (X.C207249un) r12
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            java.lang.String r14 = r10.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId"
            java.lang.String r11 = r10.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentErrorCode"
            java.lang.String r6 = r10.getStringExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentStatus"
            java.lang.String r5 = r10.getStringExtra(r0)
            r0 = 2131432449(0x7f0b1401, float:1.8486656E38)
            android.view.ViewGroup r3 = X.C36421kH.A0E(r2, r0)
            X.3Kk r1 = r2.A0F
            if (r1 == 0) goto L_0x0166
            java.lang.String r15 = r2.A0M
            java.lang.String r0 = "payments:account-details"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0166
            r1.A02 = r14
            r1.A00 = r11
            r1.A01 = r6
            r1.A03 = r5
            r0 = r16
            r1.A04 = r0
            android.view.View r0 = r1.buildPaymentHelpSupportSection(r2, r12, r13)
            r3.addView(r0)
            r0 = 0
            r3.setVisibility(r0)
        L_0x0166:
            r0 = 2131432228(0x7f0b1324, float:1.8486208E38)
            android.widget.TextView r6 = X.C36391kE.A0Q(r2, r0)
            r3 = 8
            if (r7 == 0) goto L_0x01a9
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01a9
            r0 = 0
            java.lang.String r0 = X.C36421kH.A0e(r7, r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r5 = 1
        L_0x0182:
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x01ad
            r1 = 1
            if (r5 != r1) goto L_0x0190
            java.lang.String r0 = " ("
            r11.append(r0)
        L_0x0190:
            java.lang.String r0 = X.C36421kH.A0e(r7, r5)
            r11.append(r0)
            int r0 = r7.size()
            int r0 = r0 - r1
            if (r5 != r0) goto L_0x01a6
            java.lang.String r0 = ")"
        L_0x01a0:
            r11.append(r0)
            int r5 = r5 + 1
            goto L_0x0182
        L_0x01a6:
            java.lang.String r0 = ", "
            goto L_0x01a0
        L_0x01a9:
            r6.setVisibility(r3)
            goto L_0x01b8
        L_0x01ad:
            java.lang.String r0 = r11.toString()
            r6.setText(r0)
            r0 = 0
            r6.setVisibility(r0)
        L_0x01b8:
            r0 = 2131427605(0x7f0b0115, float:1.847683E38)
            android.view.View r1 = r2.findViewById(r0)
            X.3Kk r0 = r2.A0F
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r0 instanceof X.AnonymousClass2ZV
            if (r0 == 0) goto L_0x01cd
            r1.setVisibility(r3)
            r8.setVisibility(r3)
        L_0x01cd:
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.type"
            int r1 = X.C36431kI.A02(r10, r0)
            r2.A00 = r1
            r11 = 3
            r5 = 2
            r3 = 1
            if (r1 == r3) goto L_0x01e1
            if (r1 == r5) goto L_0x01e1
            r0 = 2131888766(0x7f120a7e, float:1.9412177E38)
            if (r1 != r11) goto L_0x01e4
        L_0x01e1:
            r0 = 2131888767(0x7f120a7f, float:1.9412179E38)
        L_0x01e4:
            r4.A0I(r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.description"
            java.lang.String r1 = r10.getStringExtra(r0)
            if (r1 == 0) goto L_0x01fc
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x01fc
            android.widget.EditText r0 = r2.A02
            r0.setText(r1)
            r2.A0O = r3
        L_0x01fc:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167393(0x7f0708a1, float:1.7949058E38)
            int r7 = r1.getDimensionPixelSize(r0)
            r6 = 0
        L_0x0208:
            com.whatsapp.inappsupport.ui.AddScreenshotImageView r4 = new com.whatsapp.inappsupport.ui.AddScreenshotImageView
            r4.<init>(r2)
            r0 = 27
            X.C67143Yr.A00(r4, r2, r6, r0)
            r12 = -2
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r3, r12, r1)
            r0.bottomMargin = r7
            r0.rightMargin = r7
            r0.topMargin = r7
            r0.leftMargin = r7
            r8.addView(r4, r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.uri"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r6 != 0) goto L_0x023e
            if (r0 == 0) goto L_0x023e
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.net.Uri[] r0 = r2.A0Q
            r0[r3] = r1
            X.C36411kG.A1D(r4)
            r4.setImageURI(r1)
        L_0x023e:
            int r6 = r6 + 1
            if (r6 < r11) goto L_0x0208
            if (r19 == 0) goto L_0x025b
            java.lang.String r0 = "screenshots"
            android.os.Parcelable[] r1 = r9.getParcelableArray(r0)
        L_0x024a:
            int r0 = r1.length
            if (r3 >= r0) goto L_0x025b
            r0 = r1[r3]
            if (r0 == 0) goto L_0x0258
            r0 = r1[r3]
            android.net.Uri r0 = (android.net.Uri) r0
            r2.A0H(r0, r3)
        L_0x0258:
            int r3 = r3 + 1
            goto L_0x024a
        L_0x025b:
            int r0 = r2.A00
            if (r0 != r5) goto L_0x0262
            A0I(r2)
        L_0x0262:
            r0 = 2131428151(0x7f0b0337, float:1.8477938E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = r17
            X.3GU r0 = X.AnonymousClass3GU.A00(r2, r0, r1)
            r2.A0P = r0
            r0.A01()
            boolean r0 = r2.A0L()
            if (r0 == 0) goto L_0x028a
            android.view.View r1 = r2.A00
            r0 = 2131429500(0x7f0b087c, float:1.8480674E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r1, r0)
            r0 = 2131888361(0x7f1208e9, float:1.9411355E38)
            r1.setText(r0)
            return
        L_0x028a:
            X.3GU r3 = r2.A0P
            r0 = 2131429500(0x7f0b087c, float:1.8480674E38)
            android.widget.TextView r6 = X.C36391kE.A0Q(r2, r0)
            r0 = 2131888771(0x7f120a83, float:1.9412187E38)
            java.lang.String r7 = r2.getString(r0)
            r1 = 4
            X.4VU r0 = new X.4VU
            r0.<init>(r2, r1)
            r8 = 2132083163(0x7f1501db, float:1.980646E38)
            r4 = r2
            r5 = r0
            r3.A02(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.support.DescribeProblemActivity.onCreate(android.os.Bundle):void");
    }

    public static String A01(DescribeProblemActivity describeProblemActivity) {
        ArrayList<String> stringArrayListExtra;
        if (!describeProblemActivity.getIntent().hasExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles") || (stringArrayListExtra = describeProblemActivity.getIntent().getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles")) == null || stringArrayListExtra.isEmpty()) {
            return C36331k8.A0f(describeProblemActivity.A02);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A14(describeProblemActivity, A0u, R.string.f12nameremoved);
        StringBuilder sb = new StringBuilder(AnonymousClass000.A0q(" ", A0u));
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            sb.append(C36421kH.A0e(stringArrayListExtra, i));
            if (i < stringArrayListExtra.size() - 1) {
                sb.append(", ");
            }
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("\n\n");
        A0u2.append(C36331k8.A0f(describeProblemActivity.A02));
        C36351kA.A1K(A0u2, sb);
        return sb.toString();
    }

    public static void A0G(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("com.whatsapp");
            if (action.startsWith(AnonymousClass000.A0q(".intent.action.", A0u)) && !"gigaset".equalsIgnoreCase(Build.MANUFACTURER)) {
                intent.setPackage("com.whatsapp");
            }
        }
    }

    public static void A0I(DescribeProblemActivity describeProblemActivity) {
        if (describeProblemActivity.A0L()) {
            describeProblemActivity.A07(1);
            describeProblemActivity.Bu2(0, R.string.f12nameremoved);
            describeProblemActivity.A04.Boy(new C81203wd(describeProblemActivity, describeProblemActivity, 33));
            return;
        }
        A0J(describeProblemActivity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0P.A01();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!A0L()) {
            return false;
        }
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.f12nameremoved)).setShowAsAction(0);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        C50132kG r1 = this.A0C;
        if (r1 != null) {
            r1.A0D(false);
        }
        C50092kC r12 = this.A0G.A00;
        if (r12 != null) {
            r12.A0D(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A0F(1);
            finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            TextView A0Q2 = C36391kE.A0Q(this, R.id.describe_problem_error);
            String A012 = A01(this);
            int length = A012.getBytes().length;
            boolean A002 = C1906499t.A00(this.A0M);
            if (this.A0O || !A0M(A012, A002)) {
                C36371kC.A13(this, this.A02, R.drawable.description_field_background_state_list);
                A0Q2.setVisibility(8);
                A0J(this);
                return true;
            }
            C36371kC.A13(this, this.A02, R.drawable.describe_problem_edittext_bg_error);
            int i = R.string.f12nameremoved;
            if (length == 0) {
                i = R.string.f12nameremoved;
            }
            A0Q2.setText(i);
            A0Q2.setVisibility(0);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A02.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("screenshots", this.A0Q);
    }

    public void Beo(boolean z) {
        finish();
    }
}
