package X;

import android.content.ContentValues;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.settings.Settings;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4WP  reason: invalid class name */
public class AnonymousClass4WP extends C132446Tt {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WP(AnonymousClass012 r2, AnonymousClass3QZ r3) {
        super(r2, true);
        this.A01 = 3;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass141 A08;
        C1495671s B1k;
        switch (this.A01) {
            case 0:
                return AccountSwitchingBottomSheet.A03((AccountSwitchingBottomSheet) this.A00);
            case 1:
                return ((AnonymousClass1NG) this.A00).A05.A00();
            case 2:
                AnonymousClass2I3 r0 = (AnonymousClass2I3) this.A00;
                r0.getIntegratorManager();
                UserJid A012 = C37541mm.A01(r0);
                AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                AnonymousClass00C.A0D(A012, 0);
                return null;
            case 3:
                QuickContactActivity quickContactActivity = ((AnonymousClass3QZ) this.A00).A00;
                AnonymousClass147 A02 = quickContactActivity.A0F.A02((AnonymousClass147) quickContactActivity.A0U.A0H);
                if (A02 == null || (A08 = quickContactActivity.A0I.A08(A02)) == null) {
                    return quickContactActivity.A0U;
                }
                return A08;
            case 4:
                return Boolean.valueOf(((AnonymousClass1RU) ((Settings) this.A00).A0v.get()).A0C());
            case 5:
                Log.i("settings-data-usage-activity/load storage data/load cache in background");
                return ((SettingsDataUsageActivity) this.A00).A0Q.A02().A04;
            default:
                AnonymousClass1CR r3 = ((SettingsNotifications) this.A00).A0F;
                ContentValues contentValues = new ContentValues(8);
                contentValues.put("use_custom_notifications", false);
                contentValues.put("message_tone", (String) null);
                contentValues.put("message_vibrate", (String) null);
                contentValues.put("message_popup", (String) null);
                contentValues.put("message_light", (String) null);
                contentValues.put("call_tone", (String) null);
                contentValues.put("call_vibrate", (String) null);
                contentValues.put("low_pri_notifications", false);
                AnonymousClass1M0 A04 = r3.A0P().A04();
                try {
                    B1k = A04.B1k();
                    C224114e r8 = A04.A02;
                    r8.A01(contentValues, "settings", (String) null, "resetNotificationSettings/UPDATE_CHAT_SETTINGS", (String[]) null);
                    String[] A1R = C36441kJ.A1R();
                    C36401kF.A1T(A1R, 0, System.currentTimeMillis());
                    int A03 = r8.A03("settings", "(mute_end < ? or mute_end is NULL) and (status_muted is NULL or status_muted = 0) and (media_visibility = 0)", "resetNotificationSettings/DELETE_CHAT_SETTINGS", A1R);
                    B1k.A00();
                    C36321k7.A1T("chat-settings-store/deleted-count", AnonymousClass000.A0u(), A03);
                    B1k.close();
                    A04.close();
                    AnonymousClass1M0 A032 = r3.A0P().get();
                    try {
                        r3.A0I.clear();
                        if (C24501Cr.A00) {
                            r3.A00.A08();
                            r3.A00.A0E(A032);
                        }
                        A032.close();
                        return null;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    A04.close();
                    throw th;
                }
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        boolean z;
        View inflate;
        switch (this.A01) {
            case 0:
                List list = (List) obj;
                AnonymousClass00C.A0D(list, 0);
                AccountSwitchingBottomSheet accountSwitchingBottomSheet = (AccountSwitchingBottomSheet) this.A00;
                if (accountSwitchingBottomSheet.A0i) {
                    Log.i("AccountSwitchingBottomSheet/onViewCreated/onPostExecute/isRemoving");
                    return;
                } else if (list.isEmpty()) {
                    AnonymousClass17Y r1 = accountSwitchingBottomSheet.A05;
                    if (r1 != null) {
                        r1.A06(R.string.f12nameremoved, 0);
                        C19700wN r3 = accountSwitchingBottomSheet.A04;
                        if (r3 != null) {
                            r3.A0E("AccountSwitchingBottomSheet/accounts is empty", (String) null, true);
                            accountSwitchingBottomSheet.A1c();
                            return;
                        }
                        throw C36331k8.A0d("crashLogs");
                    }
                    throw C36321k7.A06();
                } else {
                    View view = accountSwitchingBottomSheet.A01;
                    if (view != null) {
                        if (C36401kF.A1a(list) && list.size() < 2) {
                            ViewStub A0S = C36441kJ.A0S(view, R.id.account_switching_add_account);
                            accountSwitchingBottomSheet.A02 = A0S;
                            if (!(A0S == null || (inflate = A0S.inflate()) == null)) {
                                C66923Xv.A01(inflate, accountSwitchingBottomSheet, 27);
                            }
                        }
                        View view2 = accountSwitchingBottomSheet.A01;
                        if (view2 != null) {
                            Context A0a = accountSwitchingBottomSheet.A0a();
                            accountSwitchingBottomSheet.A03 = (BottomSheetListView) C012005e.A02(view2, R.id.account_switching_listView);
                            C19700wN r12 = accountSwitchingBottomSheet.A04;
                            if (r12 != null) {
                                C18820ts r0 = accountSwitchingBottomSheet.A0D;
                                if (r0 != null) {
                                    C37801nE r32 = new C37801nE(A0a, r12, r0, list);
                                    BottomSheetListView bottomSheetListView = accountSwitchingBottomSheet.A03;
                                    if (bottomSheetListView != null) {
                                        bottomSheetListView.setAdapter(r32);
                                    }
                                    BottomSheetListView bottomSheetListView2 = accountSwitchingBottomSheet.A03;
                                    if (bottomSheetListView2 != null) {
                                        bottomSheetListView2.setOnItemClickListener(new AnonymousClass4YC(accountSwitchingBottomSheet, list, 0));
                                    }
                                    AnonymousClass28X r13 = new AnonymousClass28X(r32, accountSwitchingBottomSheet);
                                    accountSwitchingBottomSheet.A0A = r13;
                                    AnonymousClass1Q6 r02 = accountSwitchingBottomSheet.A0B;
                                    if (r02 != null) {
                                        r02.registerObserver(r13);
                                        return;
                                    }
                                    return;
                                }
                                throw C36321k7.A09();
                            }
                            throw C36331k8.A0d("crashLogs");
                        }
                        throw AnonymousClass001.A09("Required value was null.");
                    }
                    throw AnonymousClass001.A09("Required value was null.");
                }
            case 1:
                Collection collection = (Collection) obj;
                AnonymousClass00C.A0D(collection, 0);
                AnonymousClass1NG r33 = (AnonymousClass1NG) this.A00;
                synchronized (r33) {
                    z = false;
                    r33.A0L.set(false);
                    if (r33.A0M.compareAndSet(false, true)) {
                        r33.A0K.addAll(collection);
                        z = true;
                    }
                }
                if (z) {
                    AnonymousClass1NG.A06(r33, r33.A09());
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                if (str2 == null || str2.length() == 0) {
                    str = "ConversationRowFX/updateInteropContactPhotoBadge no icon url";
                    break;
                } else {
                    AnonymousClass2I3 r34 = (AnonymousClass2I3) this.A00;
                    r34.getInteropImageLoader().A01(new C90164Zi(r34, 2), str2);
                    return;
                }
            case 3:
                AnonymousClass3QZ.A00((AnonymousClass141) obj, (AnonymousClass3QZ) this.A00);
                return;
            case 4:
                if (AnonymousClass000.A1X(obj)) {
                    Settings settings = (Settings) this.A00;
                    if (settings.A0r == null) {
                        str = "Settings/executeShouldShowBadgeTask/accountSwitcherBadge == null";
                        break;
                    } else {
                        Log.i("Settings/executeShouldShowBadgeTask/shouldShowBadge");
                        settings.A0v.get();
                        AnonymousClass1RJ r14 = settings.A0r;
                        AnonymousClass00C.A0D(r14, 0);
                        r14.A03(0);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                Number number = (Number) obj;
                if (number != null) {
                    SettingsDataUsageActivity settingsDataUsageActivity = (SettingsDataUsageActivity) this.A00;
                    if (settingsDataUsageActivity.A03 == -1) {
                        Log.i("settings-data-usage-activity/load storage data/cache data fetched");
                        long longValue = number.longValue();
                        settingsDataUsageActivity.A03 = longValue;
                        AnonymousClass3TF.A05(settingsDataUsageActivity.A0D, settingsDataUsageActivity.A00, longValue);
                        return;
                    }
                    return;
                }
                return;
            default:
                SettingsNotifications.A07((SettingsNotifications) this.A00);
                return;
        }
        Log.w(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WP(AnonymousClass012 r2, SettingsDataUsageActivity settingsDataUsageActivity) {
        super(r2, true);
        this.A01 = 5;
        this.A00 = settingsDataUsageActivity;
    }

    public AnonymousClass4WP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
