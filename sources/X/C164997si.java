package X;

import android.app.job.JobParameters;
import android.net.Uri;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.media.download.service.MediaDownloadJobService;
import com.whatsapp.spamreport.ReportSpamDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7si  reason: invalid class name and case insensitive filesystem */
public class C164997si implements C25711Hj {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164997si(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A02) {
            case 0:
                C001600r r3 = (C001600r) this.A00;
                C132326Tc r2 = (C132326Tc) this.A01;
                if (r2.A08 == null) {
                    C132326Tc.A00(r2, false);
                }
                r3.A0C(r2.A08);
                return;
            case 1:
                FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = (FcsExtensionsWebViewFragment) this.A00;
                Object obj2 = this.A01;
                boolean A1X = AnonymousClass000.A1X(obj);
                AnonymousClass01I A0h = fcsExtensionsWebViewFragment.A0h();
                AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.DialogInterface");
                if (!((C225014r) A0h).BLh()) {
                    C19770wU r22 = fcsExtensionsWebViewFragment.A09;
                    if (r22 != null) {
                        r22.Boy(new AnonymousClass752(fcsExtensionsWebViewFragment, obj2, 21, A1X));
                        return;
                    }
                    throw C36321k7.A08();
                }
                return;
            case 2:
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this.A00;
                UserJid userJid = (UserJid) this.A01;
                boolean A1X2 = AnonymousClass000.A1X(obj);
                AnonymousClass01I A0h2 = flowsWebBottomSheetContainer.A0h();
                AnonymousClass00C.A0E(A0h2, "null cannot be cast to non-null type com.whatsapp.DialogInterface");
                if (!((C225014r) A0h2).BLh()) {
                    C20810yC r1 = flowsWebBottomSheetContainer.A0H;
                    if (r1 != null) {
                        C64743Pg r23 = new C64743Pg(r1, userJid, "extension_menu_report", A1X2);
                        r23.A05 = false;
                        r23.A01 = userJid;
                        WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0G;
                        C64933Qa r12 = null;
                        if (waFlowsViewModel == null) {
                            throw C36331k8.A0d("waFlowsViewModel");
                        }
                        AnonymousClass3T1 r0 = waFlowsViewModel.A0D.A01;
                        if (r0 != null) {
                            r12 = r0.A1J;
                        }
                        r23.A02 = r12;
                        r23.A03 = new C148456yt(flowsWebBottomSheetContainer);
                        ReportSpamDialogFragment A012 = r23.A01();
                        AnonymousClass01I A0h3 = flowsWebBottomSheetContainer.A0h();
                        AnonymousClass00C.A0E(A0h3, "null cannot be cast to non-null type com.whatsapp.DialogInterface");
                        ((C225014r) A0h3).Btm(A012);
                        return;
                    }
                    throw C36321k7.A07();
                }
                return;
            case 3:
                AnonymousClass1D0 r4 = (AnonymousClass1D0) this.A00;
                C146506vi r32 = (C146506vi) this.A01;
                Number number = (Number) obj;
                if (r32.A08()) {
                    int intValue = number.intValue();
                    if (intValue != 14) {
                        r4.A0A.A01(r4.A0A(r32, intValue, 1));
                    }
                    r32.A05();
                    return;
                }
                return;
            case 4:
                AnonymousClass1Y4 r13 = (AnonymousClass1Y4) this.A00;
                C146506vi r42 = (C146506vi) this.A01;
                Number number2 = (Number) obj;
                if (!r13.A0R.containsValue(r42)) {
                    r13.A0H.A01(r13.A0C.A0A(r42, number2.intValue(), r42.A01));
                    r42.A05();
                    return;
                }
                return;
            case 5:
                MediaDownloadJobService.A04((JobParameters) this.A01, (MediaDownloadJobService) this.A00, (ArrayList) obj);
                return;
            default:
                C107195Mx r43 = (C107195Mx) this.A00;
                Uri uri = (Uri) this.A01;
                Iterator A13 = C90514aH.A13(obj);
                while (A13.hasNext()) {
                    r43.A0F.BmH(uri, C36391kE.A0l(A13));
                }
                return;
        }
    }
}
