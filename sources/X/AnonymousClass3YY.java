package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.spamreport.ReportSpamDialogFragment;
import com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3YY  reason: invalid class name */
public class AnonymousClass3YY implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass3YY(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public final void onClick(View view) {
        int i;
        View A0Y;
        int i2;
        switch (this.A05) {
            case 0:
                EphemeralMessagesInfoView ephemeralMessagesInfoView = (EphemeralMessagesInfoView) this.A01;
                AnonymousClass147 r6 = (AnonymousClass147) this.A02;
                AnonymousClass141 r5 = (AnonymousClass141) this.A03;
                Context context = (Context) this.A04;
                AnonymousClass00C.A0D(context, 4);
                ((C45632Sc) this.A00).A04 = true;
                boolean A0n = ephemeralMessagesInfoView.getGroupChatManager$app_productinfra_conversation_ui_ui_non_modified().A0n(r5, r6);
                Context context2 = ephemeralMessagesInfoView.getContext();
                if (A0n) {
                    context.startActivity(AnonymousClass190.A0Y(context2, r6, r5.A02, 1));
                    return;
                } else {
                    Toast.makeText(context2, R.string.f12nameremoved, 0).show();
                    return;
                }
            case 1:
                C64993Qh r4 = (C64993Qh) this.A00;
                Context context3 = (Context) this.A01;
                AnonymousClass3P8 r8 = (AnonymousClass3P8) this.A02;
                AnonymousClass2IR r62 = (AnonymousClass2IR) this.A03;
                DialogFragment dialogFragment = (DialogFragment) this.A04;
                AnonymousClass3T1 fMessage = r62.getFMessage();
                int i3 = r8.A06;
                if (i3 == 1) {
                    Log.e("ClickToActionButtonUtils/fillButton/the button is in wrong type.");
                } else if (i3 == 2) {
                    String str = r8.A09;
                    UserJid A0L = fMessage.A0L();
                    if (r4.A04(fMessage)) {
                        r4.A02(context3, r62, fMessage, r8, str, false);
                        if (A0L != null) {
                            r4.A08.A01(A0L);
                        }
                    } else {
                        if (A0L != null && r4.A09.A04(A0L) && str != null && !str.isEmpty()) {
                            r8.A01 = str;
                            r4.A08.A01(A0L);
                        }
                        C64993Qh.A00(context3, r4, r62, fMessage, r8);
                    }
                } else if (i3 == 3) {
                    r4.A0B.A00(fMessage, "cta-call", String.valueOf(r8.A05));
                    r4.A0D.Boy(new C1502474n(r4, fMessage, r8, 48));
                    C24801Dv r3 = r4.A00;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("tel:");
                    r3.Bp7(context3, Uri.parse(AnonymousClass000.A0q(r8.A01, A0u)), (AnonymousClass3T1) null);
                }
                if (dialogFragment != null) {
                    dialogFragment.A1b();
                    return;
                }
                return;
            case 2:
                AnonymousClass00S r63 = (AnonymousClass00S) this.A01;
                AnonymousClass3XM r52 = (AnonymousClass3XM) this.A02;
                AnonymousClass01z r42 = (AnonymousClass01z) this.A03;
                Number number = (Number) this.A04;
                AnonymousClass00C.A0D(r63, 1);
                C36331k8.A0w(C19420v0.A00(((C65203Rd) this.A00).A00), "fun_stickers_notice_started_clicked", true);
                r63.invoke();
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 10;
                }
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = new SearchFunStickersBottomSheet();
                Bundle A07 = AnonymousClass001.A07();
                A07.putInt("stickerOrigin", i);
                if (r52 != null) {
                    A07.putParcelable("funStickerData", r52);
                }
                searchFunStickersBottomSheet.A17(A07);
                C65443Sb.A04(searchFunStickersBottomSheet, r42, "search_fun_stickers_bottom_sheet");
                return;
            case 3:
                C202629mK r11 = (C202629mK) this.A00;
                TextView textView = (TextView) this.A01;
                C22956Az8 az8 = (C22956Az8) this.A02;
                C202319lY r9 = (C202319lY) this.A03;
                UserJid userJid = (UserJid) this.A04;
                if (r11.A00.A0M()) {
                    C202629mK.A01(textView, r9, r11, true);
                    C29121Vk r64 = r11.A05;
                    String str2 = r9.A0K;
                    AnonymousClass644 r7 = new AnonymousClass644(textView, r9, userJid, r11, az8);
                    AnonymousClass1AL[] r2 = new AnonymousClass1AL[2];
                    C36381kD.A1N("action", "cancel-payment-request", r2);
                    C36341k9.A1L("request-id", str2, r2, 1);
                    r64.A0H(new C162887pJ(r64.A03.A00, r64.A08, r64.A00, r7, r64, 0), new C203399nx("account", r2), "set", AnonymousClass6X5.A0L);
                    return;
                }
                return;
            case 4:
                AnonymousClass3XC r0 = (AnonymousClass3XC) this.A00;
                C18820ts r1 = (C18820ts) this.A01;
                C24801Dv r53 = (C24801Dv) this.A02;
                Context context4 = (Context) this.A03;
                AnonymousClass17Y r32 = (AnonymousClass17Y) this.A04;
                if (r0 != null) {
                    String str3 = r0.A02;
                    if (!TextUtils.isEmpty(str3)) {
                        r53.A06(context4, C36331k8.A04(str3.replace("%@", r1.A06())));
                        return;
                    }
                }
                r32.A06(R.string.f12nameremoved, 0);
                return;
            case 5:
                ReportSpamDialogFragment reportSpamDialogFragment = (ReportSpamDialogFragment) this.A00;
                AnonymousClass141 r33 = (AnonymousClass141) this.A01;
                AnonymousClass141 r54 = (AnonymousClass141) this.A02;
                AnonymousClass141 r43 = (AnonymousClass141) this.A03;
                AnonymousClass3T1 r65 = (AnonymousClass3T1) this.A04;
                WeakReference weakReference = reportSpamDialogFragment.A0M;
                if (weakReference == null || (A0Y = AnonymousClass000.A0Y(weakReference)) == null) {
                    throw C36381kD.A0k();
                }
                boolean isChecked = ((CompoundButton) A0Y.findViewById(R.id.block_checkbox)).isChecked();
                boolean z = true;
                reportSpamDialogFragment.A0P = true;
                if (AnonymousClass00C.A0J(reportSpamDialogFragment.A0R.getValue(), "status_post_report")) {
                    C44502Nt r12 = new C44502Nt();
                    if (isChecked) {
                        i2 = C36371kC.A0n();
                    } else {
                        i2 = 1;
                    }
                    r12.A00 = i2;
                    C21010yW r02 = reportSpamDialogFragment.A0E;
                    if (r02 != null) {
                        r02.Bly(r12);
                    } else {
                        throw C36331k8.A0d("wamRuntime");
                    }
                }
                C63633Ku r13 = reportSpamDialogFragment.A07;
                if (r13 == null) {
                    throw C36331k8.A0d("spamReportManager");
                } else if (r13.A02(reportSpamDialogFragment.A1D())) {
                    ReportSpamDialogFragment.A07(reportSpamDialogFragment, true);
                    if ((isChecked && r43.A0C()) || !C36331k8.A1b(reportSpamDialogFragment.A0X) || !ReportSpamDialogFragment.A08(r33, reportSpamDialogFragment)) {
                        z = false;
                    }
                    reportSpamDialogFragment.A0O = z;
                    C36331k8.A1T(new ReportSpamDialogFragment$reportAsSpam$1(r33, r43, r54, r65, reportSpamDialogFragment, (C023509x) null, isChecked), C33311f5.A00(reportSpamDialogFragment));
                    return;
                } else {
                    return;
                }
            default:
                C225314u r66 = (C225314u) this.A00;
                ViewGroup viewGroup = (ViewGroup) this.A01;
                View view2 = (View) this.A02;
                View view3 = (View) this.A03;
                Object obj = this.A04;
                view2.performHapticFeedback(1, 2);
                if (C36331k8.A06(r66).getInt("status_reactions_nux_shown_count", 0) <= 2) {
                    C19420v0 r14 = r66.A09;
                    C36341k9.A0v(C19420v0.A00(r14), "status_reactions_nux_shown_count", C36341k9.A0E(r14).getInt("status_reactions_nux_shown_count", 0) + 1);
                }
                AnimatorSet A0J = MessageReplyActivity.A0J(view2, view3, viewGroup);
                A0J.addListener(new C89404Wk(A0J, r66, obj, 0));
                A0J.start();
                return;
        }
    }
}
