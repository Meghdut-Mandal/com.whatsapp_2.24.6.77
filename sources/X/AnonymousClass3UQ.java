package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.community.CommunityExitDialogFragment;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import java.util.List;

/* renamed from: X.3UQ  reason: invalid class name */
public class AnonymousClass3UQ implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass3UQ(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A01 = obj4;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void BTH(Object obj) {
        DialogFragment A032;
        AnonymousClass3P9 r2;
        int i;
        switch (this.A04) {
            case 0:
                RadioGroup radioGroup = (RadioGroup) this.A00;
                int[] iArr = (int[]) this.A01;
                List list = (List) this.A02;
                RadioGroup.OnCheckedChangeListener onCheckedChangeListener = (RadioGroup.OnCheckedChangeListener) this.A03;
                int A0I = AnonymousClass000.A0I(C012005e.A02(radioGroup, radioGroup.getCheckedRadioButtonId()).getTag());
                int intValue = ((Number) obj).intValue();
                if (intValue != A0I) {
                    radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
                    int i2 = 0;
                    do {
                        if (iArr[i2] == intValue) {
                            ((CompoundButton) list.get(i2)).setChecked(true);
                        }
                        i2++;
                    } while (i2 < 4);
                    radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
                    return;
                }
                return;
            case 1:
                AnonymousClass1LV r5 = (AnonymousClass1LV) this.A00;
                C87804Qf r22 = (C87804Qf) this.A01;
                Context context = (Context) this.A02;
                Object obj2 = this.A03;
                Number number = (Number) obj;
                if (number != null) {
                    int intValue2 = number.intValue();
                    if (intValue2 != 1) {
                        if (intValue2 != 2) {
                            if (intValue2 == 3) {
                                String string = context.getString(R.string.f12nameremoved);
                                r2 = new AnonymousClass3P9();
                                r2.A08 = string;
                                i = 21;
                            } else if (intValue2 == 4) {
                                String string2 = context.getString(R.string.f12nameremoved);
                                r2 = new AnonymousClass3P9();
                                r2.A08 = string2;
                                i = 18;
                            } else {
                                return;
                            }
                            AnonymousClass4XN r1 = new AnonymousClass4XN(obj2, i);
                            r2.A03 = R.string.f12nameremoved;
                            r2.A06 = r1;
                        } else {
                            String string3 = context.getString(R.string.f12nameremoved);
                            r2 = new AnonymousClass3P9();
                            r2.A08 = string3;
                            AnonymousClass4XN r12 = new AnonymousClass4XN(obj2, 19);
                            r2.A03 = R.string.f12nameremoved;
                            r2.A06 = r12;
                            AnonymousClass4XN r13 = new AnonymousClass4XN(obj2, 20);
                            r2.A04 = R.string.f12nameremoved;
                            r2.A07 = r13;
                        }
                        A032 = r2.A02();
                    } else {
                        A032 = CommunityExitDialogFragment.A03(r22.B82(), r5.A04(r22.B82()));
                    }
                    ((C225314u) C24801Dv.A00(context)).Btl(A032, number.toString());
                    return;
                }
                return;
            case 2:
                GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this.A02;
                TextView textView = (TextView) this.A03;
                Number number2 = (Number) obj;
                C36381kD.A1B((View) this.A00, (View) this.A01);
                groupMembershipApprovalRequestsFragment.A10(false);
                C32681e1 r4 = groupMembershipApprovalRequestsFragment.A08;
                if (r4 != null) {
                    textView.setText(r4.A02(textView.getContext(), new C80253v6(groupMembershipApprovalRequestsFragment, 3), groupMembershipApprovalRequestsFragment.A0n(C36411kG.A07(number2)), ""));
                    return;
                }
                throw C36331k8.A0d("linkifer");
            default:
                NewsletterLinkLauncher newsletterLinkLauncher = (NewsletterLinkLauncher) this.A00;
                AnonymousClass351 r52 = (AnonymousClass351) this.A01;
                C225314u r42 = (C225314u) this.A02;
                Object obj3 = this.A03;
                r42.A30(new AnonymousClass3WC(r42, r52, newsletterLinkLauncher), 0, R.string.f12nameremoved);
                ((C19770wU) newsletterLinkLauncher.A0M.getValue()).Boy(new C35631j0(newsletterLinkLauncher, r52, obj3, 39));
                return;
        }
    }
}
