package X;

import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4KC  reason: invalid class name */
public final class AnonymousClass4KC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KC(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        if (obj.equals(AnonymousClass2W0.A00)) {
            InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
            WaEditText waEditText = inAppBugReportingActivity.A08;
            if (waEditText == null) {
                throw C36331k8.A0d("describeBugField");
            }
            waEditText.setBackgroundDrawable(AnonymousClass00E.A00(inAppBugReportingActivity, R.drawable.describe_problem_edittext_bg_error));
            WDSButton A3j = inAppBugReportingActivity.A3j();
            WaEditText waEditText2 = inAppBugReportingActivity.A08;
            if (waEditText2 == null) {
                throw C36331k8.A0d("describeBugField");
            }
            Editable text = waEditText2.getText();
            boolean z = true;
            if (text == null || text.length() <= 0 || C36411kG.A0g(inAppBugReportingActivity).A0U()) {
                z = false;
            }
            A3j.setEnabled(z);
            WaTextView waTextView = inAppBugReportingActivity.A0A;
            if (waTextView == null) {
                throw C36331k8.A0d("describeBugFieldError");
            }
            waTextView.setText(R.string.f12nameremoved);
            waTextView.setVisibility(0);
        } else if (obj.equals(AnonymousClass2W1.A00)) {
            InAppBugReportingActivity inAppBugReportingActivity2 = this.this$0;
            WaEditText waEditText3 = inAppBugReportingActivity2.A08;
            if (waEditText3 == null) {
                throw C36331k8.A0d("describeBugField");
            }
            waEditText3.setBackgroundDrawable(AnonymousClass00E.A00(inAppBugReportingActivity2, R.drawable.description_field_background_state_list));
            WaTextView waTextView2 = inAppBugReportingActivity2.A0A;
            if (waTextView2 == null) {
                throw C36331k8.A0d("describeBugFieldError");
            }
            waTextView2.setVisibility(8);
            inAppBugReportingActivity2.A3j().setEnabled(!C36411kG.A0g(inAppBugReportingActivity2).A0U());
        }
        return AnonymousClass0AJ.A00;
    }
}
