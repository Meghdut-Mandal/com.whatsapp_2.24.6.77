package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.FunStickersNoticeBottomSheet;
import com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1;
import com.whatsapp.util.Log;

/* renamed from: X.6Ma  reason: invalid class name and case insensitive filesystem */
public final class C130686Ma {
    public final C63563Kn A00;
    public final C130236Kg A01;

    public final void A00(AnonymousClass01I r11, AnonymousClass3XM r12, int i) {
        DialogFragment searchFunStickersBottomSheet;
        String str;
        int i2;
        C108125Sg r1;
        C225314u r5;
        AnonymousClass01I r52 = r11;
        AnonymousClass00C.A0D(r11, 0);
        AnonymousClass01z supportFragmentManager = r11.getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        C63563Kn r2 = this.A00;
        if ((C36341k9.A0E(r2.A01).getBoolean("fun_stickers_notice_started_clicked", false) || !r2.A00() || !r2.A04.A0E(5082)) && !r2.A02()) {
            C20810yC r13 = r2.A04;
            if (r13.A0E(4837) || r13.A0E(5082)) {
                searchFunStickersBottomSheet = new SearchFunStickersBottomSheet();
                Bundle A07 = AnonymousClass001.A07();
                A07.putInt("stickerOrigin", i);
                if (r12 != null) {
                    A07.putParcelable("funStickerData", r12);
                }
                searchFunStickersBottomSheet.A17(A07);
                str = "search_fun_stickers_bottom_sheet";
            } else {
                C130236Kg r6 = this.A01;
                C153427Oh r22 = new C153427Oh(supportFragmentManager, this, r12, i);
                String A09 = r6.A00.A09(5206);
                if (A09 != null) {
                    i2 = Integer.parseInt(A09);
                } else {
                    i2 = 20900727;
                }
                AnonymousClass7VC r8 = new AnonymousClass7VC(r11, r6, r22, i2);
                try {
                    if (r6.A01.A06(i2)) {
                        r1 = C108125Sg.TRUE;
                    } else {
                        r1 = C108125Sg.FALSE;
                    }
                } catch (IllegalArgumentException unused) {
                    Log.i("GenAiPrivacyLauncher/isAccepted, Error getting disclosure state");
                    r1 = C108125Sg.ERROR;
                }
                if (r1 != C108125Sg.ERROR) {
                    r8.invoke(r1);
                    return;
                } else if ((r11 instanceof C225314u) && (r5 = (C225314u) r52) != null) {
                    C36381kD.A1R(r6.A02, new GenAiPrivacyLauncher$attemptDownloadDisclosure$1(r5, r6, (C023509x) null, r8, i2), C33311f5.A00(r5));
                    return;
                } else {
                    return;
                }
            }
        } else {
            searchFunStickersBottomSheet = new FunStickersNoticeBottomSheet();
            Bundle A072 = AnonymousClass001.A07();
            A072.putInt("stickerOrigin", i);
            if (r12 != null) {
                A072.putParcelable("funStickerData", r12);
            }
            searchFunStickersBottomSheet.A17(A072);
            str = "fun_stickers_notice_dialog";
        }
        C65443Sb.A04(searchFunStickersBottomSheet, supportFragmentManager, str);
    }

    public C130686Ma(C63563Kn r1, C130236Kg r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
