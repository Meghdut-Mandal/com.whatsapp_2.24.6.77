package X;

import android.net.Uri;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3cW  reason: invalid class name and case insensitive filesystem */
public class C68823cW implements AnonymousClass4UL {
    public boolean A00 = false;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final ArrayList A02 = AnonymousClass001.A0I();
    public final /* synthetic */ ContactPickerFragment A03;
    public final /* synthetic */ List A04;

    public boolean B2N() {
        return false;
    }

    public void BXH() {
        this.A00 = true;
    }

    public C68823cW(ContactPickerFragment contactPickerFragment, List list) {
        this.A03 = contactPickerFragment;
        this.A04 = list;
    }

    private void A00() {
        ArrayList arrayList = this.A02;
        int size = arrayList.size() + this.A01.size();
        ContactPickerFragment contactPickerFragment = this.A03;
        if (size == contactPickerFragment.A2j.size()) {
            if (!arrayList.isEmpty() && !this.A00) {
                C68733cN r0 = contactPickerFragment.A0w;
                r0.A00.Bvu(this.A04);
            }
            C68733cN.A01(contactPickerFragment);
        }
    }

    public void Bk0(Uri uri) {
        this.A01.add(uri);
        A00();
    }

    public void Bk1(Uri uri) {
        this.A02.add(uri);
        A00();
    }
}
