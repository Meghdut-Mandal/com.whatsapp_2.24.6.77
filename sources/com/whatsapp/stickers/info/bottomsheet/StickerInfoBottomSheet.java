package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass190;
import X.AnonymousClass1RJ;
import X.AnonymousClass31M;
import X.AnonymousClass3NG;
import X.AnonymousClass3QU;
import X.AnonymousClass3TE;
import X.AnonymousClass4E6;
import X.AnonymousClass4E7;
import X.AnonymousClass4E8;
import X.AnonymousClass4E9;
import X.AnonymousClass4HI;
import X.AnonymousClass4HJ;
import X.AnonymousClass4LM;
import X.AnonymousClass4LN;
import X.AnonymousClass4LO;
import X.AnonymousClass6O1;
import X.AnonymousClass6WF;
import X.C000800j;
import X.C001400p;
import X.C012005e;
import X.C019308f;
import X.C023509x;
import X.C05420Pq;
import X.C109325Xd;
import X.C135066c4;
import X.C19580wB;
import X.C20810yC;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C50772lY;
import X.C52482pV;
import X.C65963Ud;
import X.C67103Yn;
import X.C70803fk;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class StickerInfoBottomSheet extends Hilt_StickerInfoBottomSheet {
    public ViewGroup A00;
    public CircularProgressBar A01;
    public AnonymousClass6O1 A02;
    public C20810yC A03;
    public AnonymousClass190 A04;
    public AnonymousClass11F A05;
    public AnonymousClass6WF A06;
    public C135066c4 A07;
    public AnonymousClass3QU A08;
    public C52482pV A09;
    public AnonymousClass1RJ A0A;
    public AnonymousClass1RJ A0B;
    public AnonymousClass005 A0C;
    public AnonymousClass005 A0D;
    public AnonymousClass005 A0E;
    public AnonymousClass005 A0F;
    public AnonymousClass005 A0G;
    public AnonymousClass005 A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnonymousClass00T A0K;
    public final AnonymousClass00T A0L = C36431kI.A1I(new AnonymousClass4E9(this));
    public final int A0M;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle A0b = A0b();
        this.A0I = C36331k8.A1b(AnonymousClass3TE.A03(this, "arg_from_me", false));
        int i = A0b.getInt("arg_launcher_origin");
        for (C52482pV r1 : C52482pV.A00) {
            if (r1.value == i) {
                this.A09 = r1;
                C135066c4 r0 = (C135066c4) C05420Pq.A00(A0b, C135066c4.class, "arg_sticker");
                if (r0 != null) {
                    this.A07 = r0;
                    this.A05 = AnonymousClass11F.A00.A02(A0b.getString("arc_raw_chat_jid"));
                    this.A0J = C36331k8.A1b(AnonymousClass3TE.A03(this, "arg_search_flow", false));
                    this.A01 = (CircularProgressBar) C012005e.A02(view, R.id.progress_bar);
                    this.A00 = C36411kG.A0O(view, R.id.button_container_view);
                    this.A0B = C36341k9.A0X(view, R.id.sticker_view_stub);
                    this.A0A = C36341k9.A0X(view, R.id.sticker_pack_info_view_stub);
                    View A022 = C012005e.A02(view, R.id.close_button);
                    C67103Yn.A00(A022, this, 17);
                    C36421kH.A0z(A022, this, R.string.f12nameremoved);
                    AnonymousClass00T r3 = this.A0K;
                    C65963Ud.A01(this, ((StickerInfoViewModel) r3.getValue()).A0B, new AnonymousClass4LM(this), 28);
                    C65963Ud.A01(this, ((StickerInfoViewModel) r3.getValue()).A0A, new AnonymousClass4LN(this), 29);
                    C65963Ud.A01(this, ((StickerInfoViewModel) r3.getValue()).A09, new AnonymousClass4LO(this), 27);
                    StickerInfoViewModel stickerInfoViewModel = (StickerInfoViewModel) r3.getValue();
                    AnonymousClass11F r4 = this.A05;
                    C135066c4 r32 = this.A07;
                    if (r32 == null) {
                        throw C36331k8.A0d("sticker");
                    }
                    C36331k8.A1T(new StickerInfoViewModel$processSticker$1(r4, r32, stickerInfoViewModel, (C023509x) null), C109325Xd.A00(stickerInfoViewModel));
                    return;
                }
                throw AnonymousClass001.A08("Sticker must not be null");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.A00.A04 = C50772lY.A00;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        A03(this);
        super.onCancel(dialogInterface);
    }

    public static final void A03(StickerInfoBottomSheet stickerInfoBottomSheet) {
        C52482pV r0 = stickerInfoBottomSheet.A09;
        if (r0 == null) {
            throw C36331k8.A0d("origin");
        }
        int ordinal = r0.ordinal();
        int i = 9;
        if (ordinal != 4) {
            if (ordinal == 3 || ordinal == 1 || ordinal == 2) {
                i = 10;
            } else {
                return;
            }
        }
        int intValue = Integer.valueOf(i).intValue();
        AnonymousClass6O1 r1 = stickerInfoBottomSheet.A02;
        if (r1 != null) {
            r1.A02(C36381kD.A0n(), 1, intValue);
            return;
        }
        throw C36331k8.A0d("expressionUserJourneyLogger");
    }

    public static final void A05(StickerInfoBottomSheet stickerInfoBottomSheet) {
        BaseExpressionsBottomSheet baseExpressionsBottomSheet;
        if (stickerInfoBottomSheet.A0J) {
            AnonymousClass005 r0 = stickerInfoBottomSheet.A0H;
            if (r0 != null) {
                Iterator A0s = C36361kB.A0s((C19580wB) r0.get());
                while (A0s.hasNext()) {
                    C70803fk r1 = ((AnonymousClass31M) A0s.next()).A00;
                    if (C70803fk.A1e(r1) && (baseExpressionsBottomSheet = r1.A3j) != null) {
                        baseExpressionsBottomSheet.A1b();
                        C70803fk.A0e(r1);
                    }
                }
                return;
            }
            throw C36331k8.A0d("stickerPickerOpenObservers");
        }
    }

    public StickerInfoBottomSheet() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass4E7(new AnonymousClass4E6(this)));
        C019308f A1A = C36441kJ.A1A(StickerInfoViewModel.class);
        this.A0K = C36441kJ.A0a(new AnonymousClass4E8(A002), new AnonymousClass4HJ(this, A002), new AnonymousClass4HI(A002), A1A);
        this.A0M = R.layout.f9nameremoved;
    }

    public int A1i() {
        return this.A0M;
    }
}
