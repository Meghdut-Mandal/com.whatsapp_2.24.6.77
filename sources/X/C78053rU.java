package X;

import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.3rU  reason: invalid class name and case insensitive filesystem */
public final class C78053rU implements C88234Rx, C87794Qe {
    public AnonymousClass2M8 A00;
    public C87794Qe A01;
    public AnonymousClass15D A02;
    public PickerSearchDialogFragment A03;
    public C88234Rx A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public AnonymousClass11F A08;
    public final C133356Xz A09;

    public final void A02(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C133356Xz r0;
        AnonymousClass00C.A0D(pickerSearchDialogFragment, 0);
        this.A06 = true;
        this.A03 = pickerSearchDialogFragment;
        pickerSearchDialogFragment.A00 = this;
        if ((pickerSearchDialogFragment instanceof StickerSearchDialogFragment) && (r0 = this.A09) != null) {
            r0.A00 = this;
        }
    }

    public void BYd(AnonymousClass3XU r2) {
        AnonymousClass00C.A0D(r2, 0);
        C87794Qe r0 = this.A01;
        if (r0 != null) {
            r0.BYd(r2);
        }
    }

    public final void A00() {
        AnonymousClass2M8 r1 = this.A00;
        if (r1 != null) {
            r1.A03 = null;
        }
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public void A03(List list) {
        this.A05 = list;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            AnonymousClass00C.A0E(pickerSearchDialogFragment, "null cannot be cast to non-null type com.whatsapp.picker.search.StickerSearchDialogFragment");
            ((StickerSearchDialogFragment) pickerSearchDialogFragment).A1k().A01.A0D(list);
        }
    }

    public final void A04(boolean z) {
        this.A07 = z;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment != null) {
            pickerSearchDialogFragment.A1b();
        }
    }

    public void Bhl(AnonymousClass11F r3, C135066c4 r4, Integer num, int i) {
        C88234Rx r1 = this.A04;
        if (r1 != null) {
            AnonymousClass11F r0 = this.A08;
            if (r0 != null) {
                r3 = r0;
            }
            r1.Bhl(r3, r4, num, i);
        }
    }

    public C78053rU(C133356Xz r1) {
        this.A09 = r1;
    }

    public final void A01(AnonymousClass2M8 r1, AnonymousClass11F r2, AnonymousClass15D r3) {
        C36321k7.A0w(r3, r1);
        this.A08 = r2;
        this.A02 = r3;
        this.A00 = r1;
        r1.A03 = this;
    }
}
