package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel;
import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$onSearchQueryTextChanged$1$1;
import com.whatsapp.storage.StorageUsageActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.2ry  reason: invalid class name and case insensitive filesystem */
public class C53842ry implements C17020qa {
    public Object A00;
    public final int A01;

    public C53842ry(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean Be1(String str) {
        Filter filter;
        switch (this.A01) {
            case 0:
                AudioPickerActivity audioPickerActivity = (AudioPickerActivity) this.A00;
                audioPickerActivity.A0J = str;
                audioPickerActivity.A0K = C202859mm.A03(audioPickerActivity.A00, str);
                C07540Ye.A00(audioPickerActivity).A02((Bundle) null, audioPickerActivity);
                return false;
            case 1:
                ((GroupCallParticipantPicker) this.A00).A41(str);
                return false;
            case 2:
                C70013eS r2 = ((CommunityHomeActivity) this.A00).A0S.A02;
                List list = r2.A05;
                list.clear();
                ArrayList A03 = C202859mm.A03(r2.A02, str);
                AnonymousClass00C.A08(A03);
                list.addAll(A03);
                r2.A04.run();
                return true;
            case 3:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00;
                phoneContactsSelector.A0X = str;
                ArrayList A032 = C202859mm.A03(phoneContactsSelector.A0Q, str);
                phoneContactsSelector.A0Y = A032;
                if (A032.isEmpty()) {
                    phoneContactsSelector.A0Y = null;
                }
                phoneContactsSelector.A3j();
                return false;
            case 4:
                AnonymousClass2JG r22 = (AnonymousClass2JG) this.A00;
                r22.A0H = str;
                r22.A0I = C202859mm.A03(r22.A00, str);
                Bundle A07 = AnonymousClass001.A07();
                A07.putString("query", str);
                C07540Ye.A00(r22).A02(A07, r22);
                return false;
            case 5:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                if (TextUtils.equals(mediaGalleryActivity.A0g, str)) {
                    return false;
                }
                mediaGalleryActivity.A0g = str;
                mediaGalleryActivity.A0h = C202859mm.A03(mediaGalleryActivity.A00, str);
                AnonymousClass4TA A012 = MediaGalleryActivity.A01(mediaGalleryActivity);
                if (A012 == null) {
                    return false;
                }
                AnonymousClass1S3 r1 = mediaGalleryActivity.A0Z;
                r1.A05(mediaGalleryActivity.A0h);
                r1.A04(str);
                A012.Bfy(r1);
                return false;
            case 6:
                GroupAdminPickerActivity.A0G((GroupAdminPickerActivity) this.A00, str);
                return false;
            case 7:
                GroupChangedParticipantsBottomSheet.A05((GroupChangedParticipantsBottomSheet) this.A00, str);
                return false;
            case 8:
                C38031nb r12 = ((GroupParticipantsSearchFragment) this.A00).A05;
                r12.A00 = str;
                if (!TextUtils.isEmpty(str)) {
                    filter = r12.getFilter();
                    break;
                } else {
                    C38031nb.A00(r12, r12.A01);
                    return false;
                }
            case 9:
                C001700s r0 = ((InteropComposeSelectIntegratorViewModel) ((InteropComposeSelectIntegratorActivity) this.A00).A06.getValue()).A02;
                if (str == null) {
                    str = "";
                }
                r0.A0D(str);
                return false;
            case 10:
                AnonymousClass00C.A0D(str, 0);
                NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = (NewsletterInfoMembersSearchFragment) this.A00;
                NewsletterInfoMembersSearchFragment.A00(newsletterInfoMembersSearchFragment, str);
                C38021na r13 = newsletterInfoMembersSearchFragment.A07;
                if (r13 != null) {
                    r13.A01 = str;
                    if (str.length() != 0) {
                        filter = r13.getFilter();
                        break;
                    } else {
                        C38021na.A00(r13, r13.A0C);
                        return false;
                    }
                } else {
                    throw C36331k8.A0Y();
                }
            case 11:
                AnonymousClass00C.A0D(str, 0);
                C46512Yd r4 = (C46512Yd) this.A00;
                String A0y = C36371kC.A0y(str);
                if (AnonymousClass00C.A0J(r4.A0D, A0y)) {
                    return true;
                }
                r4.A0D = A0y;
                Runnable runnable = r4.A0B;
                if (runnable != null) {
                    r4.A0E.removeCallbacks(runnable);
                }
                C1503274v r3 = new C1503274v(5, A0y, r4);
                r4.A0E.postDelayed(r3, 300);
                r4.A0B = r3;
                return true;
            case 12:
                AnonymousClass00C.A0D(str, 0);
                StatusSeeAllViewModel statusSeeAllViewModel = ((StatusSeeAllActivity) this.A00).A09;
                if (statusSeeAllViewModel == null) {
                    throw C36331k8.A0a();
                }
                boolean z = !AnonymousClass000.A1P(AnonymousClass098.A06(str) ? 1 : 0);
                statusSeeAllViewModel.A04 = z;
                if (!z) {
                    C007403e r02 = statusSeeAllViewModel.A03;
                    if (r02 != null) {
                        r02.B2S((CancellationException) null);
                    }
                    StatusSeeAllViewModel.A02(statusSeeAllViewModel.A02, statusSeeAllViewModel);
                    return true;
                }
                AnonymousClass3P0 r42 = (AnonymousClass3P0) statusSeeAllViewModel.A07.A05.A04();
                if (r42 == null) {
                    return true;
                }
                C007403e r03 = statusSeeAllViewModel.A03;
                if (r03 != null) {
                    r03.B2S((CancellationException) null);
                }
                statusSeeAllViewModel.A03 = AnonymousClass0A2.A02(C023109s.A00, statusSeeAllViewModel.A09, new StatusSeeAllViewModel$onSearchQueryTextChanged$1$1(r42, statusSeeAllViewModel, str, (C023509x) null), C109325Xd.A00(statusSeeAllViewModel));
                return true;
            default:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0P = str;
                storageUsageActivity.A0R = C202859mm.A03(storageUsageActivity.A00, str);
                StorageUsageActivity.A0H(storageUsageActivity, storageUsageActivity.A0Q, (List) null, false);
                return false;
        }
        filter.filter(str);
        return false;
    }

    public boolean Be2(String str) {
        switch (this.A01) {
            case 11:
                SearchView searchView = ((C46512Yd) this.A00).A3m().A00;
                if (searchView == null) {
                    return true;
                }
                searchView.clearFocus();
                return true;
            case 12:
                return true;
            case 13:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0P = str;
                storageUsageActivity.A0R = C202859mm.A03(storageUsageActivity.A00, str);
                StorageUsageActivity.A0H(storageUsageActivity, storageUsageActivity.A0Q, (List) null, false);
                return false;
            default:
                return false;
        }
    }
}
