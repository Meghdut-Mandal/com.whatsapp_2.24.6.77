package com.whatsapp.inappbugreporting;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass098;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass1Ax;
import X.AnonymousClass1RJ;
import X.AnonymousClass1X5;
import X.AnonymousClass2W3;
import X.AnonymousClass2W5;
import X.AnonymousClass2W6;
import X.AnonymousClass2W7;
import X.AnonymousClass2W8;
import X.AnonymousClass2WB;
import X.AnonymousClass3A0;
import X.AnonymousClass3DY;
import X.AnonymousClass3FE;
import X.AnonymousClass3XH;
import X.AnonymousClass3Y3;
import X.AnonymousClass4C3;
import X.AnonymousClass4KC;
import X.AnonymousClass4KD;
import X.AnonymousClass4KE;
import X.AnonymousClass4KF;
import X.AnonymousClass4KG;
import X.AnonymousClass4KH;
import X.AnonymousClass4KI;
import X.AnonymousClass4WJ;
import X.AnonymousClass74O;
import X.C135006by;
import X.C18800tq;
import X.C18830tt;
import X.C20830yE;
import X.C21010yW;
import X.C224514j;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C38941qW;
import X.C54572tA;
import X.C61513Cf;
import X.C66023Uj;
import X.C67143Yr;
import X.C75333n3;
import X.C75343n4;
import X.C80253v6;
import X.C89334Wd;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class InAppBugReportingActivity extends AnonymousClass155 {
    public ProgressDialog A00;
    public ViewStub A01;
    public LinearLayout A02;
    public TextView A03;
    public ConstraintLayout A04;
    public ConstraintLayout A05;
    public AnonymousClass3DY A06;
    public TextEmojiLabel A07;
    public WaEditText A08;
    public WaEditText A09;
    public WaTextView A0A;
    public C33751fs A0B;
    public C20830yE A0C;
    public C21010yW A0D;
    public C61513Cf A0E;
    public AnonymousClass1Ax A0F;
    public WhatsAppLibLoader A0G;
    public AnonymousClass3FE A0H;
    public C32681e1 A0I;
    public AnonymousClass1RJ A0J;
    public WDSButton A0K;
    public String A0L;
    public Uri[] A0M;
    public View A0N;
    public WaTextView A0O;
    public boolean A0P;
    public final AnonymousClass00T A0Q;

    private final void A07(Uri uri, int i) {
        int i2;
        LinearLayout linearLayout = this.A02;
        if (linearLayout == null) {
            throw C36331k8.A0d("screenshotsGroup");
        }
        int i3 = i;
        View childAt = linearLayout.getChildAt(i);
        AnonymousClass00C.A0E(childAt, "null cannot be cast to non-null type com.whatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        C38941qW r2 = (C38941qW) childAt;
        Uri uri2 = uri;
        if (uri != null) {
            Point point = new Point();
            C36321k7.A0K(this, point);
            try {
                this.A04.Boy(new AnonymousClass74O(r2, this, uri2, i3, point.x / 3, 2));
            } catch (IOException e) {
                C36321k7.A1M(uri, "InAppBugReporting/screenshot/io-exception ", AnonymousClass000.A0u(), e);
                i2 = R.string.f12nameremoved;
                BO5(i2);
            } catch (AnonymousClass1X5 e2) {
                C36321k7.A1M(uri, "InAppBugReporting/screenshot/not-an-image ", AnonymousClass000.A0u(), e2);
                i2 = R.string.f12nameremoved;
                BO5(i2);
            }
        } else {
            AddScreenshotImageView addScreenshotImageView = r2.getAddScreenshotImageView();
            Bitmap bitmap = addScreenshotImageView.A02;
            if (bitmap != null) {
                bitmap.recycle();
                addScreenshotImageView.A02 = null;
            }
            AddScreenshotImageView.A02(addScreenshotImageView);
            r2.setRemoveButtonVisibility(false);
        }
    }

    public static final void A0F(InAppBugReportingActivity inAppBugReportingActivity) {
        InAppBugReportingActivity inAppBugReportingActivity2 = inAppBugReportingActivity;
        if (inAppBugReportingActivity.A06 != null) {
            AnonymousClass3FE r4 = inAppBugReportingActivity.A0H;
            if (r4 != null) {
                String A012 = A01(inAppBugReportingActivity);
                Uri[] uriArr = inAppBugReportingActivity.A0M;
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (Uri uri : uriArr) {
                    if (uri != null) {
                        A0I2.add(uri);
                    }
                }
                r4.A00(inAppBugReportingActivity2, (AnonymousClass3XH) null, (AnonymousClass147) null, "InAppBugReporting", A012, (String) null, (String) null, A0I2, (List) null, true);
                inAppBugReportingActivity2.finish();
                return;
            }
            throw C36331k8.A0d("contactSupportManager");
        }
        throw C36331k8.A0d("sendFeedback");
    }

    public void Bln(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (str.equals("confirm_cancel_reporting_dialog")) {
            A3i().A00(3, (String) null);
            finish();
        }
    }

    public void onBackPressed() {
        if (!(C36411kG.A0g(this).A09.A04() instanceof AnonymousClass2W3)) {
            WaEditText waEditText = this.A08;
            if (waEditText == null) {
                throw C36331k8.A0d("describeBugField");
            } else if (C36371kC.A0y(C36421kH.A0Z(waEditText)).length() > 0) {
                Btr((Integer) null, Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved), (Integer) null, "confirm_cancel_reporting_dialog", (String) null, (List) null);
                return;
            }
        }
        super.onBackPressed();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onRestoreInstanceState(bundle);
        Parcelable[] parcelableArray = bundle.getParcelableArray("save_state_screenshots");
        if (parcelableArray != null) {
            int length = parcelableArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Parcelable parcelable = parcelableArray[i];
                int i3 = i2 + 1;
                if (parcelable != null) {
                    A07((Uri) parcelable, i2);
                }
                i++;
                i2 = i3;
            }
        }
        String string = bundle.getString("save_state_bug_category");
        if (string != null) {
            WaTextView waTextView = this.A0O;
            if (waTextView == null) {
                throw C36331k8.A0d("categoryTextView");
            }
            waTextView.setText(string);
            this.A0L = string;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("save_state_screenshots", this.A0M);
        bundle.putString("save_state_bug_category", this.A0L);
    }

    public static final String A01(InAppBugReportingActivity inAppBugReportingActivity) {
        WaEditText waEditText = inAppBugReportingActivity.A08;
        if (waEditText == null) {
            throw C36331k8.A0d("describeBugField");
        }
        String A0Z = C36421kH.A0Z(waEditText);
        String stringExtra = inAppBugReportingActivity.getIntent().getStringExtra("extra_message_id");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        boolean z = true;
        if (!AnonymousClass098.A06(stringExtra)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MessageID: ");
            A0u.append(stringExtra);
            A0Z = AnonymousClass000.A0p(";\n", A0Z, A0u);
        }
        String stringExtra2 = inAppBugReportingActivity.getIntent().getStringExtra("extra_custom_bloks_use_case");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        if (stringExtra2.equals("contextual_help") || stringExtra2.equals("help_article")) {
            try {
                String optString = C36441kJ.A1C(inAppBugReportingActivity.getIntent().getStringExtra("extra_custom_bloks_param")).optString("cms_id");
                if (optString != null) {
                    str = optString;
                }
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder A0v = AnonymousClass000.A0v(A0Z);
                    A0v.append("\n\n\n\nCMS_ID: ");
                    A0v.append(str);
                    A0v.append("\n#wa-dogfooding-pretriaged\n#Oncall_wasce\n");
                    return A0v.toString();
                }
            } catch (JSONException e) {
                Log.w("InAppBugReporting/Custom Params: Could not parse Bloks params", e);
            }
        }
        return A0Z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r9.A0A.A03() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(com.whatsapp.inappbugreporting.InAppBugReportingActivity r9, int r10) {
        /*
            r2 = r10 | 32
            X.0yE r0 = r9.A0C
            if (r0 == 0) goto L_0x0078
            X.2nw r1 = r0.A04()
            X.2nw r0 = X.C51512nw.DENIED
            if (r1 == r0) goto L_0x0072
            com.whatsapp.Me r0 = X.C36401kF.A0M(r9)
            if (r0 == 0) goto L_0x001d
            X.12U r0 = r9.A0A
            boolean r0 = r0.A03()
            r8 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r8 = 0
        L_0x001e:
            X.0yC r1 = r9.A0D
            r0 = 7951(0x1f0f, float:1.1142E-41)
            boolean r0 = r1.A0E(r0)
            r7 = 5
            r5 = 1
            r6 = 40
            r4 = 0
            r3 = 21
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r9.getPackageName()
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity"
        L_0x0039:
            r2.setClassName(r1, r0)
            java.lang.String r0 = "include_media"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "max_items"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "preview"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "origin"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "send"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "should_hide_caption_view"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "skip_max_items_new_limit"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "should_set_gallery_result"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "media_sharing_user_journey_origin"
            r2.putExtra(r0, r3)
            r0 = r10 | 16
            r9.startActivityForResult(r2, r0)
            return
        L_0x006f:
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPicker"
            goto L_0x0039
        L_0x0072:
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            r0.A0D(r9, r2)
            return
        L_0x0078:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0G(com.whatsapp.inappbugreporting.InAppBugReportingActivity, int):void");
    }

    public static final void A0H(InAppBugReportingActivity inAppBugReportingActivity, C54572tA r5, C38941qW r6, int i) {
        WDSButton wDSButton;
        WaEditText waEditText;
        boolean z = false;
        if (r5 instanceof AnonymousClass2W8) {
            r6.setUploadProgressBarVisibility(true);
            r6.setEnabled(false);
            r6.setRemoveButtonVisibility(true);
            wDSButton = inAppBugReportingActivity.A3j();
        } else {
            if (r5 instanceof AnonymousClass2W7) {
                r6.setUploadProgressBarVisibility(false);
                r6.setEnabled(true);
                r6.setRemoveButtonVisibility(true);
                wDSButton = inAppBugReportingActivity.A3j();
                waEditText = inAppBugReportingActivity.A08;
                if (waEditText == null) {
                    throw C36331k8.A0d("describeBugField");
                }
            } else if (r5 instanceof AnonymousClass2W5) {
                r6.setUploadProgressBarVisibility(false);
                r6.setEnabled(true);
                r6.setRetryLayoutVisibility(true);
                r6.setRemoveButtonVisibility(true);
                r6.A04 = new C75343n4(inAppBugReportingActivity, i);
                wDSButton = inAppBugReportingActivity.A3j();
                waEditText = inAppBugReportingActivity.A08;
                if (waEditText == null) {
                    throw C36331k8.A0d("describeBugField");
                }
            } else if (AnonymousClass00C.A0J(r5, AnonymousClass2W6.A00)) {
                r6.setUploadProgressBarVisibility(false);
                r6.setEnabled(true);
                if (inAppBugReportingActivity.A0M[i] != null) {
                    r6.setRemoveButtonVisibility(true);
                } else {
                    r6.setRemoveButtonVisibility(false);
                }
                wDSButton = inAppBugReportingActivity.A3j();
                waEditText = inAppBugReportingActivity.A08;
                if (waEditText == null) {
                    throw C36331k8.A0d("describeBugField");
                }
            } else {
                return;
            }
            Editable text = waEditText.getText();
            if (text != null && text.length() > 0 && !C36411kG.A0g(inAppBugReportingActivity).A0U()) {
                z = true;
            }
        }
        wDSButton.setEnabled(z);
    }

    public static final void A0I(InAppBugReportingActivity inAppBugReportingActivity, boolean z) {
        int i;
        AnonymousClass1RJ r1 = inAppBugReportingActivity.A0J;
        if (z) {
            if (r1 == null) {
                throw C36331k8.A0d("mediaUploadErrorMessageViewStubHolder");
            }
            i = 0;
        } else if (r1 == null) {
            throw C36331k8.A0d("mediaUploadErrorMessageViewStubHolder");
        } else {
            i = 8;
        }
        r1.A03(i);
    }

    public void A2F() {
        if (!this.A0P) {
            this.A0P = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0G = (WhatsAppLibLoader) A0B2.A9W.get();
            this.A0F = (AnonymousClass1Ax) A0B2.A4p.get();
            this.A0C = C36351kA.A0X(A0B2);
            this.A0D = C36351kA.A0g(A0B2);
            this.A0I = C36351kA.A0p(r1);
            this.A0B = C36361kB.A0X(r1);
            this.A06 = C36361kB.A0Q(A0B2);
            this.A0H = (AnonymousClass3FE) r1.A6C.get();
            this.A0E = (C61513Cf) r1.A92.get();
        }
    }

    public final C61513Cf A3i() {
        C61513Cf r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("supportLogger");
    }

    public final WDSButton A3j() {
        WDSButton wDSButton = this.A0K;
        if (wDSButton != null) {
            return wDSButton;
        }
        throw C36331k8.A0d("submitButton");
    }

    public InAppBugReportingActivity(int i) {
        this.A0P = false;
        C89334Wd.A00(this, 45);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        String str = null;
        if ((i & 16) == 16) {
            if (i2 == -1 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() <= 0 || (uri = (Uri) C36441kJ.A12(parcelableArrayListExtra)) == null) {
                    BO5(R.string.f12nameremoved);
                    return;
                }
                try {
                    grantUriPermission("com.whatsapp", uri, 1);
                } catch (SecurityException e) {
                    Log.w("InAppBugReporting/permission", e);
                }
                int i3 = i - 16;
                A07(uri, i3);
                if (C36401kF.A0M(this) != null && this.A0A.A03()) {
                    C36411kG.A0g(this).A0S(uri, i3);
                }
            }
        } else if ((i & 32) == 32) {
            if (i2 == -1) {
                A0G(this, i - 32);
            }
        } else if (i == 3 && i2 == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("bug_category_title");
                if (stringExtra != null) {
                    WaTextView waTextView = this.A0O;
                    if (waTextView == null) {
                        throw C36331k8.A0d("categoryTextView");
                    }
                    waTextView.setText(stringExtra);
                }
                str = intent.getStringExtra("bug_category_type");
            }
            this.A0L = str;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A3i().A00(2, (String) null);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0Q(getString(R.string.f12nameremoved));
        }
        this.A02 = (LinearLayout) C36361kB.A0D(this, R.id.screenshots_group);
        this.A0J = C36351kA.A0r(this, R.id.media_upload_error_message_stub);
        LinearLayout linearLayout = this.A02;
        if (linearLayout == null) {
            throw C36331k8.A0d("screenshotsGroup");
        }
        linearLayout.removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = 0;
        do {
            C38941qW r2 = new C38941qW(this);
            LinearLayout.LayoutParams A0N2 = C36371kC.A0N();
            int i2 = dimensionPixelSize;
            if (i == 0) {
                i2 = 0;
            }
            A0N2.leftMargin = i2;
            A0N2.rightMargin = dimensionPixelSize;
            A0N2.topMargin = dimensionPixelSize;
            A0N2.bottomMargin = dimensionPixelSize;
            LinearLayout linearLayout2 = this.A02;
            if (linearLayout2 == null) {
                throw C36331k8.A0d("screenshotsGroup");
            }
            linearLayout2.addView(r2, A0N2);
            C67143Yr.A00(r2, this, i, 16);
            r2.A03 = new C75333n3(this, i);
            i++;
        } while (i < 3);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C36361kB.A0D(this, R.id.submit_bug_info_text);
        this.A07 = textEmojiLabel;
        C32681e1 r4 = this.A0I;
        if (r4 == null) {
            throw C36331k8.A0b();
        } else if (textEmojiLabel == null) {
            throw C36331k8.A0d("submitBugInfoTextView");
        } else {
            Context context = textEmojiLabel.getContext();
            TextEmojiLabel textEmojiLabel2 = this.A07;
            if (textEmojiLabel2 == null) {
                throw C36331k8.A0d("submitBugInfoTextView");
            }
            String A18 = C36431kI.A18(textEmojiLabel2);
            TextEmojiLabel textEmojiLabel3 = this.A07;
            if (textEmojiLabel3 == null) {
                throw C36331k8.A0d("submitBugInfoTextView");
            }
            SpannableStringBuilder A032 = r4.A03(context, new C80253v6(this, 26), A18, "learn-more", C224514j.A00(textEmojiLabel3.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            TextEmojiLabel textEmojiLabel4 = this.A07;
            if (textEmojiLabel4 == null) {
                throw C36331k8.A0d("submitBugInfoTextView");
            }
            C36331k8.A1A(this.A0D, textEmojiLabel4);
            TextEmojiLabel textEmojiLabel5 = this.A07;
            if (textEmojiLabel5 == null) {
                throw C36331k8.A0d("submitBugInfoTextView");
            }
            textEmojiLabel5.setText(A032);
            this.A08 = (WaEditText) C36361kB.A0D(this, R.id.describe_problem_field);
            this.A0A = (WaTextView) C36361kB.A0D(this, R.id.describe_problem_field_error);
            WaEditText waEditText = this.A08;
            if (waEditText == null) {
                throw C36331k8.A0d("describeBugField");
            }
            AnonymousClass4WJ.A00(waEditText, this, 12);
            WDSButton wDSButton = (WDSButton) C36361kB.A0D(this, R.id.submit_btn);
            AnonymousClass00C.A0D(wDSButton, 0);
            this.A0K = wDSButton;
            WDSButton A3j = A3j();
            WaEditText waEditText2 = this.A08;
            if (waEditText2 == null) {
                throw C36331k8.A0d("describeBugField");
            }
            Editable text = waEditText2.getText();
            boolean z = true;
            if (text == null || text.length() <= 0 || C36411kG.A0g(this).A0U()) {
                z = false;
            }
            A3j.setEnabled(z);
            AnonymousClass3Y3.A00(A3j(), this, 9);
            AnonymousClass00T r42 = this.A0Q;
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A08, new AnonymousClass4KC(this), 17);
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A09, new AnonymousClass4KD(this), 18);
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A02, new AnonymousClass4KE(this), 16);
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A00, new AnonymousClass4KF(this), 21);
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A01, new AnonymousClass4KG(this), 22);
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A07, new AnonymousClass4KH(this), 14);
            C66023Uj.A01(this, ((InAppBugReportingViewModel) r42.getValue()).A0G, new AnonymousClass4KI(this), 15);
            this.A09 = (WaEditText) C36361kB.A0D(this, R.id.title_edit_text);
            WaTextView waTextView = (WaTextView) C36361kB.A0D(this, R.id.category_text_view);
            AnonymousClass3Y3.A00(waTextView, this, 10);
            this.A0O = waTextView;
            this.A0N = C36361kB.A0D(this, R.id.category_underline);
            String stringExtra = getIntent().getStringExtra("extra_screenshot_uri");
            if (stringExtra != null) {
                A07(Uri.parse(stringExtra), 0);
                if (C36401kF.A0M(this) != null && this.A0A.A03()) {
                    Uri parse = Uri.parse(stringExtra);
                    AnonymousClass00C.A08(parse);
                    ((InAppBugReportingViewModel) r42.getValue()).A0S(parse, 0);
                }
            }
            if (C36421kH.A1T(getIntent(), "extra_is_calling_bug")) {
                C135006by r22 = (C135006by) getIntent().getParcelableExtra("extra_call_log_key");
                AnonymousClass3A0 r1 = ((InAppBugReportingViewModel) r42.getValue()).A0A.A07;
                if (r22 != null) {
                    r1.A01 = r22;
                } else {
                    r1.A00 = r1.A02.B9F();
                }
                WaTextView waTextView2 = this.A0O;
                if (waTextView2 == null) {
                    throw C36331k8.A0d("categoryTextView");
                }
                AnonymousClass2WB r12 = AnonymousClass2WB.A00;
                waTextView2.setText(r12.A02);
                this.A0L = r12.A00;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public InAppBugReportingActivity() {
        this(0);
        this.A0M = new Uri[3];
        this.A0Q = C36431kI.A1I(new AnonymousClass4C3(this));
    }
}
