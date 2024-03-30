package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.conversationslist.ArchiveHeaderViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment;

/* renamed from: X.1fX  reason: invalid class name and case insensitive filesystem */
public abstract class C33541fX implements View.OnClickListener {
    public long A00;

    public void A02(View view) {
        Integer num;
        String str;
        if (this instanceof C35121iB) {
            C35121iB r1 = (C35121iB) this;
            switch (r1.A01) {
                case 0:
                    CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) r1.A00;
                    AnonymousClass3UJ.A06(callsHistoryFragmentV2.A0h());
                    callsHistoryFragmentV2.A0o = true;
                    return;
                case 1:
                    C33351fB r2 = (C33351fB) r1.A00;
                    r2.A06.A1g();
                    r2.A07.Bly(r2.A09((AnonymousClass141) null, (Long) null, 5));
                    return;
                case 2:
                    AnonymousClass02E r5 = (AnonymousClass02E) r1.A00;
                    if (r5.A1D() != null) {
                        r5.startActivityForResult(AnonymousClass3US.A02(r5.A0a(), R.string.f12nameremoved, R.string.f12nameremoved, false), 14);
                        return;
                    }
                    return;
                case 3:
                    ConversationsFragment conversationsFragment = (ConversationsFragment) r1.A00;
                    C24801Dv r4 = conversationsFragment.A0X;
                    Context A1D = conversationsFragment.A1D();
                    Context A1D2 = conversationsFragment.A1D();
                    Intent intent = new Intent();
                    intent.setClassName(A1D2.getPackageName(), "com.whatsapp.conversationslist.ArchivedConversationsActivity");
                    r4.A06(A1D, intent);
                    C21010yW r3 = conversationsFragment.A23;
                    AnonymousClass2PL r12 = new AnonymousClass2PL();
                    r12.A02 = "Archive";
                    r12.A00 = null;
                    r3.Bly(r12);
                    return;
                case 4:
                    ConversationsFragment conversationsFragment2 = (ConversationsFragment) r1.A00;
                    C24801Dv r42 = conversationsFragment2.A0X;
                    Context A1D3 = conversationsFragment2.A1D();
                    Context A1D4 = conversationsFragment2.A1D();
                    Intent intent2 = new Intent();
                    intent2.setClassName(A1D4.getPackageName(), "com.whatsapp.conversationslist.ArchivedConversationsActivity");
                    r42.A06(A1D3, intent2);
                    ArchiveHeaderViewModel archiveHeaderViewModel = conversationsFragment2.A1M;
                    if (archiveHeaderViewModel != null) {
                        C21010yW r43 = conversationsFragment2.A23;
                        Object A04 = archiveHeaderViewModel.A01.A04();
                        boolean z = false;
                        if (A04 == null) {
                            num = 0;
                        } else if ("@".equals(A04)) {
                            z = true;
                            num = null;
                        } else {
                            num = Integer.valueOf(archiveHeaderViewModel.A00);
                        }
                        Boolean valueOf = Boolean.valueOf(z);
                        AnonymousClass2PL r22 = new AnonymousClass2PL();
                        if (num != null) {
                            r22.A01 = Long.valueOf((long) num.intValue());
                        }
                        r22.A02 = "Archive";
                        r22.A00 = valueOf;
                        r43.Bly(r22);
                        return;
                    }
                    return;
                case 5:
                    Intent intent3 = new Intent();
                    AnonymousClass02E r23 = (AnonymousClass02E) r1.A00;
                    intent3.setClassName(r23.A1D().getPackageName(), "com.whatsapp.conversationslist.InteropConversationsActivity");
                    r23.A1D().startActivity(intent3);
                    return;
                default:
                    AnonymousClass00C.A0D(view, 0);
                    Context context = view.getContext();
                    AnonymousClass00C.A0B(context);
                    boolean A002 = C55962vT.A00(context);
                    C24801Dv r13 = ((C35011i0) r1.A00).A00;
                    if (A002) {
                        str = "fb://feed/";
                    } else {
                        str = "https://m.facebook.com";
                    }
                    r13.Bp7(context, Uri.parse(str), (AnonymousClass3T1) null);
                    return;
            }
        } else if (this instanceof C35111iA) {
            C35111iA r44 = (C35111iA) this;
            if (r44.A03 != 0) {
                ((AnonymousClass1UZ) ((C35011i0) r44.A02).A0G.get()).A06("status_privacy_activity", "SEE_LINKING_NUX", 927604110);
                CrosspostingLinkingDisclosureBottomSheetDialogFragment crosspostingLinkingDisclosureBottomSheetDialogFragment = new CrosspostingLinkingDisclosureBottomSheetDialogFragment();
                crosspostingLinkingDisclosureBottomSheetDialogFragment.A02 = (C159817jy) r44.A01;
                ((C225314u) r44.A00).Btm(crosspostingLinkingDisclosureBottomSheetDialogFragment);
                return;
            }
            ((AnonymousClass1X4) r44.A02).A0M((AnonymousClass11F) r44.A00, (Integer) r44.A01, false);
        } else {
            C35101i9 r32 = (C35101i9) this;
            switch (r32.A02) {
                case 0:
                    ((AnonymousClass1RK) r32.A01).BaQ(35, 9);
                    return;
                case 1:
                    ((AnonymousClass1RK) r32.A01).Bg1();
                    return;
                case 2:
                    ((AnonymousClass1R8) r32.A00).A05((AnonymousClass1RK) r32.A01, true);
                    return;
                case 3:
                    ((C34941ht) r32.A01).A00.A00((Context) r32.A00, (C52092os) null);
                    return;
                default:
                    ((C009904e) r32.A01).A02(r32.A00);
                    return;
            }
        }
    }

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A02(view);
        }
    }
}
