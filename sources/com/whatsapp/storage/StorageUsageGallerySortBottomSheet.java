package com.whatsapp.storage;

import X.AnonymousClass001;
import X.AnonymousClass338;
import X.C16550pQ;
import X.C18740tg;
import X.C36381kD;
import X.C38611pO;
import X.C56002vY;
import X.C67143Yr;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;

public class StorageUsageGallerySortBottomSheet extends Hilt_StorageUsageGallerySortBottomSheet implements C16550pQ {
    public AnonymousClass338 A00;
    public C38611pO A01;
    public C38611pO A02;
    public C38611pO A03;
    public C38611pO A04;

    public static StorageUsageGallerySortBottomSheet A03(int i, boolean z) {
        StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = new StorageUsageGallerySortBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", i);
        A07.putBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", z);
        storageUsageGallerySortBottomSheet.A17(A07);
        return storageUsageGallerySortBottomSheet;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C38611pO r0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        C38611pO r1 = new C38611pO(A1D());
        this.A01 = r1;
        r1.setText(R.string.f12nameremoved);
        C67143Yr.A00(this.A01, this, 0, 26);
        viewGroup2.addView(this.A01);
        C38611pO r12 = new C38611pO(A1D());
        this.A02 = r12;
        r12.setText(R.string.f12nameremoved);
        C67143Yr.A00(this.A02, this, 1, 26);
        viewGroup2.addView(this.A02);
        C38611pO r13 = new C38611pO(A1D());
        this.A03 = r13;
        r13.setText(R.string.f12nameremoved);
        C67143Yr.A00(this.A03, this, 2, 26);
        viewGroup2.addView(this.A03);
        Bundle A0b = A0b();
        if (A0b.getBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", false)) {
            C38611pO r14 = new C38611pO(A1D());
            this.A04 = r14;
            r14.setText(R.string.f12nameremoved);
            C67143Yr.A00(this.A04, this, 3, 26);
            viewGroup2.addView(this.A04);
        }
        int i = A0b.getInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", 0);
        this.A01.setChecked(false);
        this.A02.setChecked(false);
        this.A03.setChecked(false);
        if (i == 0) {
            r0 = this.A01;
        } else if (i == 1) {
            r0 = this.A02;
        } else if (i != 2) {
            if (i == 3) {
                r0 = this.A04;
                C18740tg.A04(r0);
            }
            Dialog dialog = this.A02;
            C18740tg.A06(dialog);
            Window window = dialog.getWindow();
            C18740tg.A06(window);
            window.setAttributes(C36381kD.A0M(window));
            dialog.setOnShowListener(new C56002vY(this, 4));
            return viewGroup2;
        } else {
            r0 = this.A03;
        }
        r0.setChecked(true);
        Dialog dialog2 = this.A02;
        C18740tg.A06(dialog2);
        Window window2 = dialog2.getWindow();
        C18740tg.A06(window2);
        window2.setAttributes(C36381kD.A0M(window2));
        dialog2.setOnShowListener(new C56002vY(this, 4));
        return viewGroup2;
    }

    public void A1J() {
        super.A1J();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
    }
}
