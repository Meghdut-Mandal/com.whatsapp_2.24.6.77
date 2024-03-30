package X;

import android.content.Context;
import android.view.View;
import android.webkit.URLUtil;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.util.DocumentWarningDialogFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.3YK  reason: invalid class name */
public class AnonymousClass3YK implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public AnonymousClass3YK(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = z;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        DialogFragment A002;
        int i;
        AnonymousClass2bU r11;
        switch (this.A03) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                boolean z = this.A02;
                AnonymousClass11F r2 = (AnonymousClass11F) this.A01;
                C51612o6 r1 = C51612o6.INFO;
                if (z) {
                    A002 = C54172sW.A00((AnonymousClass11F) null, r1, (Boolean) null);
                } else {
                    A002 = C54182sX.A00(r2, contactInfoActivity.A1I, r1);
                }
                contactInfoActivity.Btl(A002, (String) null);
                return;
            case 1:
                boolean z2 = this.A02;
                C180268lU r12 = new C180268lU(103);
                r12.A05 = (C202319lY) this.A01;
                r12.A0I = z2;
                ((C167797yq) this.A00).A08.A0D(r12);
                return;
            case 2:
                boolean z3 = this.A02;
                C93094ff r22 = (C93094ff) this.A00;
                C134636bM r5 = (C134636bM) this.A01;
                if (z3) {
                    AnonymousClass1Z5 privacyDisclosureLogger = r22.getPrivacyDisclosureLogger();
                    int i2 = r22.A00;
                    switch (r22.A01) {
                        case 0:
                            i = 1014;
                            break;
                        case 1:
                            i = 1015;
                            break;
                        case 2:
                            i = 1016;
                            break;
                        case 3:
                            i = 1017;
                            break;
                        case 4:
                            i = 1018;
                            break;
                        case 5:
                            i = 1019;
                            break;
                        case 6:
                            i = 1020;
                            break;
                        case 7:
                            i = 1021;
                            break;
                        case 8:
                            i = 1022;
                            break;
                        case 9:
                            i = 1023;
                            break;
                    }
                    AnonymousClass1Z5.A00(AnonymousClass3NX.A06, privacyDisclosureLogger, i2, Integer.valueOf(i).intValue());
                }
                Context context = r22.getContext();
                if (context != null) {
                    List list = C131156Ny.A02;
                    String str = r5.A00;
                    if (list.contains(str)) {
                        C52002oj r13 = C52002oj.RESULT_OK;
                        switch (str.hashCode()) {
                            case -1956801605:
                                if (str.equals("OPTOUT")) {
                                    r13 = C52002oj.RESULT_OPT_OUT;
                                    break;
                                }
                                break;
                            case -1905312150:
                                if (str.equals("DISMISS")) {
                                    r13 = C52002oj.RESULT_BACK;
                                    break;
                                }
                                break;
                            case 2094604:
                                if (str.equals("DENY")) {
                                    r13 = C52002oj.RESULT_DENY;
                                    break;
                                }
                                break;
                            case 75424504:
                                if (str.equals("OPTIN")) {
                                    r13 = C52002oj.RESULT_OPT_IN;
                                    break;
                                }
                                break;
                            case 1924835592:
                                if (str.equals("ACCEPT")) {
                                    r13 = C52002oj.RESULT_ACCEPT;
                                    break;
                                }
                                break;
                        }
                        C55062u0.A00(r22.A0D, r13);
                        return;
                    } else if (URLUtil.isHttpsUrl(str)) {
                        C36331k8.A0t(context, r22.getLinkLauncher(), str);
                        return;
                    } else {
                        C55062u0.A00(r22.A0D, C52002oj.RESULT_OK);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                C80143uv r52 = (C80143uv) this.A01;
                boolean z4 = this.A02;
                C39871u3 r4 = ((C41021wU) this.A00).A08;
                if (z4) {
                    boolean A003 = r4.A03.A00(r52);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Reaction=");
                    A0u.append(r52);
                    C18740tg.A0D(A003, AnonymousClass000.A0q(" was not removed from allTab!", A0u));
                    for (C61923Ea r3 : C36401kF.A0w(r4.A06)) {
                        if (C36401kF.A0w(r3.A02).contains(r52)) {
                            boolean A004 = r3.A00(r52);
                            StringBuilder A0v = AnonymousClass000.A0v("Reaction=");
                            A0v.append(r52);
                            C18740tg.A0D(A004, AnonymousClass000.A0l(r3, " was not removed from emojiTab=", A0v));
                            AnonymousClass3T1 A0R = C36421kH.A0R(r4.A04, r52.A00);
                            if (A0R != null) {
                                r4.A01.A0e(A0R, "", true);
                                return;
                            }
                            return;
                        }
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Could not find emoji tab for reaction=");
                    A0u2.append(r52);
                    C18740tg.A0D(false, AnonymousClass000.A0q(". That should not happen.", A0u2));
                    return;
                }
                r4.A08.A0D(r52.A04);
                return;
            default:
                boolean z5 = this.A02;
                DocumentWarningDialogFragment documentWarningDialogFragment = (DocumentWarningDialogFragment) this.A00;
                if (z5) {
                    AnonymousClass3T1 A1k = documentWarningDialogFragment.A1k(documentWarningDialogFragment.A0b().getLong("message_id"));
                    if (!(A1k instanceof C46972by) || (r11 = (AnonymousClass2bU) A1k) == null) {
                        AnonymousClass17Y r23 = documentWarningDialogFragment.A03;
                        if (r23 != null) {
                            r23.A07(R.string.f12nameremoved, 0);
                        } else {
                            throw C36321k7.A06();
                        }
                    } else {
                        C65013Qj r53 = r11.A01;
                        if (r53 != null) {
                            AnonymousClass17Y r10 = documentWarningDialogFragment.A03;
                            if (r10 != null) {
                                C19700wN r7 = documentWarningDialogFragment.A02;
                                if (r7 != null) {
                                    C19770wU r6 = documentWarningDialogFragment.A09;
                                    if (r6 != null) {
                                        AnonymousClass1TA r42 = documentWarningDialogFragment.A06;
                                        if (r42 != null) {
                                            Context A0a = documentWarningDialogFragment.A0a();
                                            C24801Dv r9 = documentWarningDialogFragment.A01;
                                            if (r9 != null) {
                                                WeakReference A0F = AnonymousClass001.A0F(A0a);
                                                r10.A05(0, R.string.f12nameremoved);
                                                C66363Vr r8 = new C66363Vr(r9, r10, r11, A0F, 1);
                                                AnonymousClass28n r14 = new AnonymousClass28n(r7, r42, r11);
                                                r14.A0B(r8, r10.A04);
                                                r6.Boy(r14);
                                                r53.A09 = 2;
                                                C20310xM r0 = documentWarningDialogFragment.A05;
                                                if (r0 != null) {
                                                    r0.A0k(A1k);
                                                } else {
                                                    throw C36331k8.A0d("coreMessageStore");
                                                }
                                            } else {
                                                throw C36331k8.A0d("activityUtils");
                                            }
                                        } else {
                                            throw C36331k8.A0d("sharedMediaIdsStore");
                                        }
                                    } else {
                                        throw C36321k7.A08();
                                    }
                                } else {
                                    throw C36331k8.A0d("crashLogs");
                                }
                            } else {
                                throw C36321k7.A06();
                            }
                        }
                        C19770wU r15 = documentWarningDialogFragment.A09;
                        if (r15 != null) {
                            C81333wq.A00(r15, A1k, documentWarningDialogFragment, 1, 38);
                        } else {
                            throw C36321k7.A08();
                        }
                    }
                }
                AnonymousClass0FM r02 = documentWarningDialogFragment.A00;
                if (r02 != null) {
                    r02.dismiss();
                }
                documentWarningDialogFragment.A00 = null;
                return;
        }
    }
}
