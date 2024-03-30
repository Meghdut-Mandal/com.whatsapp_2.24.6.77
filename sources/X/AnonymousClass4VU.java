package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.text.SeeMoreTextView;

/* renamed from: X.4VU  reason: invalid class name */
public class AnonymousClass4VU extends ClickableSpan {
    public Object A00;
    public final int A01;

    public AnonymousClass4VU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                Intent A0I = C36441kJ.A0I("android.settings.DATE_SETTINGS");
                AnonymousClass225 r0 = (AnonymousClass225) this.A00;
                r0.A05.A06(r0.A00, A0I);
                return;
            case 1:
                RegisterAsCompanionLinkCodeActivity registerAsCompanionLinkCodeActivity = (RegisterAsCompanionLinkCodeActivity) this.A00;
                C25951Ih r02 = registerAsCompanionLinkCodeActivity.A02;
                if (r02 != null) {
                    C25951Ih.A00(r02).A04();
                    registerAsCompanionLinkCodeActivity.finish();
                    return;
                }
                throw C36331k8.A0d("companionRegistrationManager");
            case 2:
                ExportMigrationActivity exportMigrationActivity = (ExportMigrationActivity) this.A00;
                exportMigrationActivity.A0G.A00(exportMigrationActivity.A0J, 2);
                exportMigrationActivity.A01.A06(exportMigrationActivity, AnonymousClass190.A01(exportMigrationActivity));
                return;
            case 3:
                AnonymousClass00C.A0D(view, 0);
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                dialogFragment.startActivityForResult(AnonymousClass190.A0E(C36371kC.A0B(view)), 0);
                dialogFragment.A1b();
                return;
            case 4:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A00;
                describeProblemActivity.startActivity(C36391kE.A0G(describeProblemActivity.A01));
                return;
            default:
                SeeMoreTextView seeMoreTextView = (SeeMoreTextView) this.A00;
                if (!seeMoreTextView.A03) {
                    seeMoreTextView.A03 = true;
                    seeMoreTextView.setText(seeMoreTextView.A01);
                    return;
                }
                return;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        switch (this.A01) {
            case 1:
                AnonymousClass00C.A0D(textPaint, 0);
                C36381kD.A16((Context) this.A00, textPaint, R.color.f6nameremoved);
                textPaint.setUnderlineText(false);
                return;
            case 2:
                textPaint.setUnderlineText(false);
                Context context = (Context) this.A00;
                i = AnonymousClass00F.A00(context, C36341k9.A05(context));
                break;
            case 3:
                AnonymousClass00C.A0D(textPaint, 0);
                AnonymousClass02E r0 = (AnonymousClass02E) this.A00;
                i = C36351kA.A02(r0.A1D(), r0.A0a(), R.attr.f4nameremoved, R.color.f6nameremoved);
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setColor(i);
    }
}
