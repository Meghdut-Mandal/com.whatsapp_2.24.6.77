package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity;
import com.whatsapp.conversationslist.LockedConversationsActivity;
import com.whatsapp.events.EventCreateOrEditFragment;
import com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ta  reason: invalid class name and case insensitive filesystem */
public class C65673Ta implements C009604b {
    public Object A00;
    public final int A01;

    public C65673Ta(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BQj(Object obj) {
        int i;
        String str;
        Bundle bundleExtra;
        Activity activity;
        Context context;
        Intent A0F;
        Iterable iterable;
        Intent intent;
        WaTextView waTextView;
        String str2;
        Intent intent2;
        Bundle extras;
        Intent intent3;
        Object obj2 = obj;
        switch (this.A01) {
            case 0:
                RegisterAsCompanionEnterNumberActivity registerAsCompanionEnterNumberActivity = (RegisterAsCompanionEnterNumberActivity) this.A00;
                C009804d r4 = (C009804d) obj2;
                AnonymousClass00C.A0D(r4, 1);
                if (r4.A00 == -1 && (intent3 = r4.A01) != null) {
                    String stringExtra = intent3.getStringExtra("cc");
                    String stringExtra2 = intent3.getStringExtra("iso");
                    String stringExtra3 = intent3.getStringExtra("country_name");
                    AnonymousClass3AK r0 = registerAsCompanionEnterNumberActivity.A03;
                    if (r0 == null) {
                        throw C36331k8.A0d("phoneNumberEntryViewHolder");
                    }
                    r0.A02.setText(stringExtra);
                    AnonymousClass3AK r02 = registerAsCompanionEnterNumberActivity.A03;
                    if (r02 == null) {
                        throw C36331k8.A0d("phoneNumberEntryViewHolder");
                    }
                    r02.A04.setText(stringExtra3);
                    if (stringExtra2 != null) {
                        AnonymousClass3AK r03 = registerAsCompanionEnterNumberActivity.A03;
                        if (r03 == null) {
                            throw C36331k8.A0d("phoneNumberEntryViewHolder");
                        }
                        r03.A05.A03(stringExtra2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass01L r3 = (AnonymousClass01L) this.A00;
                C009804d r42 = (C009804d) obj2;
                boolean A1V = C36371kC.A1V(r42);
                if (r42.A00 == -1 && (intent = r42.A01) != null && intent.getBooleanExtra("extra_rate_limited", A1V)) {
                    r3.findViewById(R.id.next_btn).setEnabled(A1V);
                    return;
                }
                return;
            case 2:
                LockedConversationsActivity lockedConversationsActivity = (LockedConversationsActivity) this.A00;
                C009804d r43 = (C009804d) obj2;
                Integer num = lockedConversationsActivity.A05;
                boolean z = false;
                if (r43 == null || !((i = r43.A00) == -1 || i == 2)) {
                    LockedConversationsActivity.A07(lockedConversationsActivity);
                } else {
                    lockedConversationsActivity.A3i().A03 = AnonymousClass000.A1S(i, -1);
                    C235718z A3i = lockedConversationsActivity.A3i();
                    if (i == -1) {
                        z = true;
                    }
                    A3i.A01 = z;
                    C222713q r7 = AnonymousClass11F.A00;
                    AnonymousClass11F A02 = r7.A02(lockedConversationsActivity.getIntent().getStringExtra("jid"));
                    Intent intent4 = lockedConversationsActivity.A00;
                    if (intent4 != null) {
                        str = intent4.getStringExtra("jid");
                    } else {
                        str = null;
                    }
                    AnonymousClass11F A022 = r7.A02(str);
                    if (lockedConversationsActivity.A00 != null && A022 != null) {
                        lockedConversationsActivity.A00 = null;
                        A02 = A022;
                    } else if (A02 == null) {
                        LockedConversationsActivity.A01(lockedConversationsActivity);
                        if (num != null) {
                            AnonymousClass3L5 r1 = lockedConversationsActivity.A03;
                            if (r1 != null) {
                                r1.A01(num.intValue(), 1);
                            } else {
                                throw C36331k8.A0d("chatLockLogger");
                            }
                        }
                    }
                    if (i == -1) {
                        LockedConversationsActivity.A01(lockedConversationsActivity);
                    }
                    AnonymousClass3L5 r12 = lockedConversationsActivity.A03;
                    if (r12 != null) {
                        r12.A01(1, 0);
                        Intent A1Z = C36441kJ.A0j().A1Z(lockedConversationsActivity, A02, 2);
                        AnonymousClass00C.A08(A1Z);
                        A1Z.putExtra("fromNotification", true);
                        lockedConversationsActivity.startActivity(A1Z);
                        if (i == 2) {
                            lockedConversationsActivity.finish();
                        }
                    } else {
                        throw C36331k8.A0d("chatLockLogger");
                    }
                }
                lockedConversationsActivity.A05 = null;
                lockedConversationsActivity.A3i().A00 = false;
                return;
            case 3:
                EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A00;
                C009804d r44 = (C009804d) obj2;
                if (r44.A00 == -1 && (intent2 = r44.A01) != null && (extras = intent2.getExtras()) != null) {
                    C40071us r13 = eventCreateOrEditFragment.A0H;
                    if (r13 == null) {
                        throw C36331k8.A0d("eventCreateOrEditViewModel");
                    }
                    r13.A0T(new PlaceInfo(extras.getString("locations_string"), extras.getString("vicinity"), (String) null, (String) null, (String) null, extras.getString("address"), (String) null, (String) null, extras.getDouble("latitude"), extras.getDouble("longitude"), 0.0d, 0));
                    return;
                }
                return;
            case 4:
                AnonymousClass3OK r32 = (AnonymousClass3OK) this.A00;
                C009804d r45 = (C009804d) obj2;
                AnonymousClass00C.A0D(r45, 0);
                if (r45.A00 == -1) {
                    Class<UserJid> cls = UserJid.class;
                    Intent intent5 = r45.A01;
                    if (intent5 == null || (iterable = intent5.getStringArrayListExtra("contacts")) == null) {
                        iterable = C023409w.A00;
                    }
                    AnonymousClass3OK.A00(r32, AnonymousClass143.A06(cls, iterable));
                    return;
                }
                return;
            case 5:
                C609539z r33 = (C609539z) this.A00;
                C009804d r46 = (C009804d) obj2;
                AnonymousClass00C.A0D(r46, 0);
                if (r46.A00 == -1) {
                    Intent intent6 = r46.A01;
                    if (intent6 != null) {
                        C65533Sl r14 = AnonymousClass147.A01;
                        AnonymousClass147 A04 = C65533Sl.A04(intent6.getStringExtra("group_jid"));
                        AnonymousClass147 A06 = r14.A06(intent6.getStringExtra("parent_group_jid_to_link"));
                        int intExtra = intent6.getIntExtra("entry_point", -1);
                        Bundle bundleExtra2 = intent6.getBundleExtra("new_group_result_bundle");
                        C36321k7.A1K(A04, "CreateGroupResultHandler/group created ", AnonymousClass000.A0u());
                        if (r33.A05.A0M(A04)) {
                            C36321k7.A1K(A04, "CreateGroupResultHandler/opening conversation", AnonymousClass000.A0u());
                            if (A06 == null || intExtra == 10) {
                                AnonymousClass190 A0j = C36441kJ.A0j();
                                context = r33.A02;
                                A0F = C36391kE.A0F(context, A0j, A04);
                            } else {
                                new AnonymousClass190();
                                context = r33.A02;
                                A0F = C36361kB.A08(context, A04, 0);
                            }
                            AnonymousClass00C.A0B(A0F);
                            if (bundleExtra2 != null) {
                                A0F.putExtra("new_group_result_bundle", bundleExtra2);
                            }
                            r33.A04.A07(context, A0F);
                        } else {
                            return;
                        }
                    } else {
                        Context context2 = r33.A02;
                        context2.startActivity(AnonymousClass190.A03(context2));
                    }
                    activity = r33.A01;
                    break;
                } else {
                    return;
                }
            case 6:
                AnonymousClass3B1 r34 = (AnonymousClass3B1) this.A00;
                C009804d r47 = (C009804d) obj2;
                AnonymousClass00C.A0D(r47, 0);
                int i2 = r47.A00;
                if (i2 == -1) {
                    Intent intent7 = r47.A01;
                    if (intent7 == null) {
                        Context context3 = r34.A02;
                        context3.startActivity(AnonymousClass190.A03(context3));
                        activity = r34.A01;
                        break;
                    } else {
                        Bundle bundleExtra3 = intent7.getBundleExtra("group_suggested");
                        if (bundleExtra3 != null) {
                            String string = bundleExtra3.getString("extra_group_name");
                            AnonymousClass147 A062 = AnonymousClass147.A01.A06(bundleExtra3.getString("extra_parent_group_jid"));
                            if (A062 == null || string == null) {
                                Log.e("SuggestGroupResultHandler/onResult/unexpected parent group or subject null");
                                return;
                            }
                            String string2 = bundleExtra3.getString("extra_group_description");
                            C36331k8.A1T(new SuggestGroupResultHandler$onResult$1$1$1(bundleExtra3.getBundle("extra_group_settings_bundle"), r34, A062, string, string2, (C023509x) null), r34.A0A);
                            return;
                        }
                        return;
                    }
                } else if (i2 == 0) {
                    Log.i("SuggestGroupResultHandler/Suggest group result canceled!");
                    return;
                } else {
                    return;
                }
            case 7:
                NewGroup newGroup = (NewGroup) this.A00;
                C009804d r48 = (C009804d) obj2;
                if (r48.A00 == -1 && (bundleExtra = r48.A01.getBundleExtra("setting_values")) != null) {
                    newGroup.A03 = bundleExtra;
                    return;
                }
                return;
            case 8:
                StatusPrivacyActivity statusPrivacyActivity = (StatusPrivacyActivity) this.A00;
                C009804d r49 = (C009804d) obj2;
                AnonymousClass00C.A0D(r49, 1);
                if (r49.A00 == -1) {
                    C132686Uv.A01((C33541fX) null, (C132686Uv) statusPrivacyActivity.A3i().A0A.get(), "status_privacy_activity", R.string.f12nameremoved, 0, true);
                    C35011i0 A3i2 = statusPrivacyActivity.A3i();
                    View view = statusPrivacyActivity.A00;
                    AnonymousClass00C.A08(view);
                    C159817jy r8 = statusPrivacyActivity.A0H;
                    if (r8 == null) {
                        throw C36331k8.A0d("crosspostAccountLinkingResultListener");
                    }
                    C009904e r5 = statusPrivacyActivity.A03;
                    if (r5 == null) {
                        throw C36331k8.A0d("crosspostAccountUnlinkingActivityResultLauncher");
                    }
                    A3i2.A05(view, r5, statusPrivacyActivity, (C134876bk) null, r8);
                    return;
                }
                return;
            case 9:
                StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment = (StatusAudienceSelectorShareSheetFragment) this.A00;
                C009804d r410 = (C009804d) obj2;
                C36321k7.A0w(statusAudienceSelectorShareSheetFragment, r410);
                if (r410.A00 == -1) {
                    Intent intent8 = r410.A01;
                    C18740tg.A06(intent8);
                    C64883Pu r15 = statusAudienceSelectorShareSheetFragment.A07;
                    if (r15 != null) {
                        Bundle extras2 = intent8.getExtras();
                        if (extras2 != null) {
                            AnonymousClass3XT A012 = r15.A01(extras2);
                            C18740tg.A06(A012);
                            AnonymousClass00C.A0B(A012);
                            statusAudienceSelectorShareSheetFragment.A06 = A012;
                            if (A012 == null) {
                                throw C36331k8.A0d("statusDistributionInfo");
                            }
                            int i3 = A012.A00;
                            if (i3 == 2) {
                                waTextView = statusAudienceSelectorShareSheetFragment.A04;
                                if (waTextView != null) {
                                    C64493Of r2 = statusAudienceSelectorShareSheetFragment.A08;
                                    if (r2 == null) {
                                        throw C36331k8.A0d("shareSheetUtil");
                                    }
                                    str2 = r2.A01(statusAudienceSelectorShareSheetFragment.A0a(), A012.A02);
                                }
                                StatusAudienceSelectorShareSheetFragment.A05(statusAudienceSelectorShareSheetFragment, i3);
                                return;
                            }
                            if (i3 == 1 && (waTextView = statusAudienceSelectorShareSheetFragment.A05) != null) {
                                C64493Of r35 = statusAudienceSelectorShareSheetFragment.A08;
                                if (r35 == null) {
                                    throw C36331k8.A0d("shareSheetUtil");
                                }
                                Context A0a = statusAudienceSelectorShareSheetFragment.A0a();
                                List list = A012.A01;
                                if (list.isEmpty()) {
                                    str2 = A0a.getResources().getString(R.string.f12nameremoved);
                                    AnonymousClass00C.A0B(str2);
                                } else {
                                    str2 = C64493Of.A00(r35, list);
                                }
                            }
                            StatusAudienceSelectorShareSheetFragment.A05(statusAudienceSelectorShareSheetFragment, i3);
                            return;
                            waTextView.setText(str2);
                            StatusAudienceSelectorShareSheetFragment.A05(statusAudienceSelectorShareSheetFragment, i3);
                            return;
                        }
                        throw C36381kD.A0k();
                    }
                    throw C36331k8.A0d("statusAudienceRepository");
                }
                return;
            case 10:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) this.A00;
                AnonymousClass16E r04 = statusPrivacyBottomSheetDialogFragment.A04;
                if (r04 != null) {
                    int A05 = r04.A05();
                    AnonymousClass16E r05 = statusPrivacyBottomSheetDialogFragment.A04;
                    if (r05 != null) {
                        ArrayList A0A = r05.A0A();
                        AnonymousClass16E r06 = statusPrivacyBottomSheetDialogFragment.A04;
                        if (r06 != null) {
                            AnonymousClass3XT r52 = new AnonymousClass3XT(A0A, r06.A0B(), A05, false, false);
                            statusPrivacyBottomSheetDialogFragment.A03 = r52;
                            AnonymousClass3G8 r22 = statusPrivacyBottomSheetDialogFragment.A09;
                            if (r22 == null) {
                                throw C36331k8.A0d("statusPrivacyBottomSheetController");
                            }
                            r22.A00(r52.A00);
                            AnonymousClass3G8 r23 = statusPrivacyBottomSheetDialogFragment.A09;
                            if (r23 == null) {
                                throw C36331k8.A0d("statusPrivacyBottomSheetController");
                            }
                            AnonymousClass3XT r07 = statusPrivacyBottomSheetDialogFragment.A03;
                            if (r07 == null) {
                                throw C36331k8.A0d("statusDistributionInfo");
                            }
                            int size = r07.A01.size();
                            AnonymousClass3XT r08 = statusPrivacyBottomSheetDialogFragment.A03;
                            if (r08 == null) {
                                throw C36331k8.A0d("statusDistributionInfo");
                            }
                            r23.A01(size, r08.A02.size());
                            return;
                        }
                        throw C36331k8.A0d("statusStore");
                    }
                    throw C36331k8.A0d("statusStore");
                }
                throw C36331k8.A0d("statusStore");
            default:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment2 = (StatusPrivacyBottomSheetDialogFragment) this.A00;
                C009804d r411 = (C009804d) obj2;
                AnonymousClass00C.A0D(r411, 1);
                if (r411.A00 == -1) {
                    Intent intent9 = r411.A01;
                    C18740tg.A06(intent9);
                    C64883Pu r16 = statusPrivacyBottomSheetDialogFragment2.A06;
                    if (r16 != null) {
                        Bundle extras3 = intent9.getExtras();
                        if (extras3 != null) {
                            AnonymousClass3XT A013 = r16.A01(extras3);
                            C18740tg.A06(A013);
                            AnonymousClass00C.A0B(A013);
                            if (!statusPrivacyBottomSheetDialogFragment2.A0G) {
                                AnonymousClass3XT r09 = statusPrivacyBottomSheetDialogFragment2.A03;
                                if (r09 == null) {
                                    throw C36331k8.A0d("statusDistributionInfo");
                                } else if (!AnonymousClass00C.A0J(A013, r09)) {
                                    statusPrivacyBottomSheetDialogFragment2.A0G = true;
                                }
                            }
                            statusPrivacyBottomSheetDialogFragment2.A03 = A013;
                            AnonymousClass3G8 r24 = statusPrivacyBottomSheetDialogFragment2.A09;
                            if (r24 == null) {
                                throw C36331k8.A0d("statusPrivacyBottomSheetController");
                            } else if (A013 == null) {
                                throw C36331k8.A0d("statusDistributionInfo");
                            } else {
                                int size2 = A013.A01.size();
                                AnonymousClass3XT r010 = statusPrivacyBottomSheetDialogFragment2.A03;
                                if (r010 == null) {
                                    throw C36331k8.A0d("statusDistributionInfo");
                                }
                                r24.A01(size2, r010.A02.size());
                            }
                        } else {
                            throw C36381kD.A0k();
                        }
                    } else {
                        throw C36331k8.A0d("statusAudienceRepository");
                    }
                }
                AnonymousClass3G8 r17 = statusPrivacyBottomSheetDialogFragment2.A09;
                if (r17 == null) {
                    throw C36331k8.A0d("statusPrivacyBottomSheetController");
                }
                AnonymousClass3XT r011 = statusPrivacyBottomSheetDialogFragment2.A03;
                if (r011 == null) {
                    throw C36331k8.A0d("statusDistributionInfo");
                }
                r17.A00(r011.A00);
                return;
        }
        activity.finish();
    }
}
