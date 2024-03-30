package X;

import android.app.ProgressDialog;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.4KD  reason: invalid class name */
public final class AnonymousClass4KD extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KD(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ProgressDialog progressDialog;
        ProgressDialog progressDialog2;
        ProgressDialog progressDialog3;
        C54562t9 r8 = (C54562t9) obj;
        if (r8 instanceof AnonymousClass2W4) {
            InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
            if (inAppBugReportingActivity.A00 == null) {
                ProgressDialog progressDialog4 = new ProgressDialog(inAppBugReportingActivity);
                inAppBugReportingActivity.A00 = progressDialog4;
                progressDialog4.setCancelable(false);
                ProgressDialog progressDialog5 = inAppBugReportingActivity.A00;
                if (progressDialog5 != null) {
                    progressDialog5.setIndeterminate(true);
                }
                ProgressDialog progressDialog6 = inAppBugReportingActivity.A00;
                if (progressDialog6 != null) {
                    C36391kE.A17(progressDialog6, inAppBugReportingActivity, R.string.f12nameremoved);
                }
            }
            ProgressDialog progressDialog7 = inAppBugReportingActivity.A00;
            if (!(progressDialog7 == null || progressDialog7.isShowing() || (progressDialog3 = inAppBugReportingActivity.A00) == null)) {
                progressDialog3.show();
            }
        } else if (r8 instanceof AnonymousClass2W3) {
            InAppBugReportingActivity inAppBugReportingActivity2 = this.this$0;
            ProgressDialog progressDialog8 = inAppBugReportingActivity2.A00;
            if (!(progressDialog8 == null || !progressDialog8.isShowing() || (progressDialog2 = inAppBugReportingActivity2.A00) == null)) {
                progressDialog2.cancel();
            }
            InAppBugReportingActivity inAppBugReportingActivity3 = this.this$0;
            String str = ((AnonymousClass2W3) r8).A00;
            ConstraintLayout constraintLayout = (ConstraintLayout) C36361kB.A0H(inAppBugReportingActivity3, R.id.bug_report_form);
            inAppBugReportingActivity3.A05 = constraintLayout;
            if (constraintLayout == null) {
                throw C36331k8.A0d("bugReportForm");
            }
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) C36361kB.A0H(inAppBugReportingActivity3, R.id.bug_reporting_bottom_bar);
            inAppBugReportingActivity3.A04 = constraintLayout2;
            if (constraintLayout2 == null) {
                throw C36331k8.A0d("bugReportBottomBar");
            }
            constraintLayout2.setVisibility(8);
            ViewStub viewStub = (ViewStub) C36361kB.A0H(inAppBugReportingActivity3, R.id.bug_submitted_confirmation);
            inAppBugReportingActivity3.A01 = viewStub;
            if (viewStub == null) {
                throw C36331k8.A0d("bugSubmittedConfirmation");
            }
            viewStub.inflate();
            inAppBugReportingActivity3.A03 = (TextView) C36361kB.A0H(inAppBugReportingActivity3, R.id.task_creation_message);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append('T');
            String A0q = AnonymousClass000.A0q(str, A0u);
            String A0A = C36321k7.A0A(inAppBugReportingActivity3, A0q, R.string.f12nameremoved);
            AnonymousClass00C.A08(A0A);
            SpannableString A0O = C36441kJ.A0O(A0A);
            C37261m5 r3 = new C37261m5(inAppBugReportingActivity3, AnonymousClass000.A0p("https://www.internalfb.com/tasks/?t=", str, AnonymousClass000.A0u()));
            int A0C = AnonymousClass099.A0C(A0A, A0q, 0, false);
            A0O.setSpan(r3, A0C, C36441kJ.A09(A0q, A0C), 33);
            TextView textView = inAppBugReportingActivity3.A03;
            if (textView == null) {
                throw C36331k8.A0d("taskCreationMessage");
            }
            textView.setText(A0O);
            TextView textView2 = inAppBugReportingActivity3.A03;
            if (textView2 == null) {
                throw C36331k8.A0d("taskCreationMessage");
            }
            textView2.setMovementMethod(new C37211m0());
            this.this$0.A3i().A00(7, (String) null);
        } else if (r8 instanceof AnonymousClass2W2) {
            InAppBugReportingActivity inAppBugReportingActivity4 = this.this$0;
            ProgressDialog progressDialog9 = inAppBugReportingActivity4.A00;
            if (!(progressDialog9 == null || !progressDialog9.isShowing() || (progressDialog = inAppBugReportingActivity4.A00) == null)) {
                progressDialog.cancel();
            }
            InAppBugReportingActivity inAppBugReportingActivity5 = this.this$0;
            View A0D = C36421kH.A0D(inAppBugReportingActivity5, R.layout.f9nameremoved);
            View A0G = C36361kB.A0G(A0D, R.id.button_try_again);
            View A0G2 = C36361kB.A0G(A0D, R.id.button_submit_via_email);
            View A0G3 = C36361kB.A0G(A0D, R.id.button_cancel);
            C39001qm A00 = AnonymousClass3LW.A00(inAppBugReportingActivity5);
            A00.A0j(A0D);
            A00.A0r(false);
            AnonymousClass0FM A0O2 = C36371kC.A0O(A00);
            AnonymousClass3YG.A00(A0G, A0O2, inAppBugReportingActivity5, 33);
            AnonymousClass3YG.A00(A0G2, A0O2, inAppBugReportingActivity5, 34);
            AnonymousClass3YG.A00(A0G3, A0O2, inAppBugReportingActivity5, 35);
            A0O2.show();
            this.this$0.A3i().A00(8, ((AnonymousClass2W2) r8).A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
