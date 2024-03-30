package X;

import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Wg  reason: invalid class name and case insensitive filesystem */
public class C29341Wg {
    public final C19700wN A00;
    public final C20810yC A01;
    public final C29351Wh A02;
    public final C29361Wi A03;
    public final AnonymousClass12U A04;
    public final C19970wo A05;
    public final AnonymousClass17Z A06;
    public final C21570zS A07;

    public static C131506Pi A00(C128646Db r2, int i) {
        AnonymousClass5HO r0;
        if (!(i == 0 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    r0 = r2.A04;
                } else if (i == 4) {
                    r0 = r2.A03;
                } else if (i != 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected value: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                AnonymousClass5HN r02 = r2.A02;
                if (r02 != null) {
                    return r02.A00;
                }
            }
        }
        return null;
    }

    public AnonymousClass5HN A07() {
        C29361Wi r8 = this.A03;
        C65613Su A012 = r8.A01();
        if (A012 == null || A012.A00 != 2) {
            return null;
        }
        int i = A012.A01;
        C20810yC r5 = this.A01;
        if (AnonymousClass3RI.A00(r5, i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeManager/getBanner/green alert disabled, notice: ");
            sb.append(i);
            Log.i(sb.toString());
            return null;
        }
        C128646Db A062 = this.A02.A06(A012);
        if (A062 == null) {
            return null;
        }
        AnonymousClass5HN r3 = A062.A02;
        if (r3 == null) {
            Log.e("UserNoticeManager/getBanner/no content for stage 2");
            this.A00.A0E("UserNoticeManager/getBanner/noContent", (String) null, true);
            return null;
        }
        if (AnonymousClass3RI.A01(r5, A012)) {
            C19970wo r9 = this.A05;
            long j = C29361Wi.A00(r8).getLong("current_user_notice_banner_dismiss_timestamp", 0);
            long A002 = C19970wo.A00(r9);
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            if (A002 < j + 86400000) {
                Log.i("UserNoticeManager/getBanner/dismissed banner not shown as per timing");
                return null;
            }
            Log.i("UserNoticeManager/getBanner/eligible to show dismissible banner");
            C29361Wi.A00(r8).edit().putLong("current_user_notice_banner_dismiss_timestamp", 0).apply();
        }
        C131506Pi r1 = r3.A00;
        if (!A06(r1, this)) {
            Log.i("UserNoticeManager/getBanner/banner not shown as per timing");
            return null;
        }
        A02(r1, this, AnonymousClass3RI.A01(r5, A012));
        Log.i("UserNoticeManager/getBanner/banner shown");
        return r3;
    }

    public void A0B() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/updateUserNoticeStage/expected current stage: ");
        sb.append(2);
        Log.i(sb.toString());
        C65613Su A012 = this.A03.A01();
        C18740tg.A06(A012);
        int i = A012.A00;
        if (2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UserNoticeManager/updateUserNoticeStage/already moved forward, stored current stage: ");
            sb2.append(i);
            Log.i(sb2.toString());
            return;
        }
        C128646Db A062 = this.A02.A06(A012);
        C18740tg.A06(A062);
        int i2 = 3;
        if (A062.A04 == null) {
            i2 = 4;
            if (A062.A03 == null) {
                i2 = 5;
            }
        }
        A05(A012, i2);
    }

    public static void A01(C128646Db r10, C29341Wg r11, C65613Su r12) {
        String str;
        String str2;
        int i;
        C1276168z r0;
        C1276168z r02;
        C1276168z r03;
        int i2 = r12.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/transitionUserNoticeStageIfNecessary/noticeId: ");
        sb.append(r12.A01);
        sb.append(" currentStage: ");
        sb.append(i2);
        Log.i(sb.toString());
        if (i2 == 0) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 0, no timing transition needed");
            r11.A05(r12, 1);
            return;
        }
        if (i2 == 5) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 5, no timing transition needed";
        } else if (r10 == null) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/no content";
        } else {
            long A002 = C19970wo.A00(r11.A05);
            ArrayList arrayList = new ArrayList();
            C131506Pi A003 = A00(r10, i2);
            if (!(A003 == null || (r03 = A003.A01) == null)) {
                arrayList.add(new AnonymousClass3JK(i2, r03.A00, 1));
            }
            int i3 = 2;
            if (i2 >= 2 || r10.A02 == null) {
                i3 = 3;
                if (i2 >= 3 || r10.A04 == null) {
                    i3 = 4;
                    if (i2 >= 4 || r10.A03 == null) {
                        i3 = 5;
                    }
                }
            }
            int i4 = i3;
            while (i3 < 5) {
                C131506Pi A004 = A00(r10, i3);
                if (!(A004 == null || (r02 = A004.A02) == null)) {
                    arrayList.add(new AnonymousClass3JK(i3, r02.A00, 0));
                }
                C131506Pi A005 = A00(r10, i3);
                if (!(A005 == null || (r0 = A005.A01) == null)) {
                    arrayList.add(new AnonymousClass3JK(i3, r0.A00, 1));
                }
                i3++;
            }
            Iterator it = arrayList.iterator();
            AnonymousClass3JK r5 = null;
            while (it.hasNext()) {
                AnonymousClass3JK r6 = (AnonymousClass3JK) it.next();
                if (r6.A02 > A002) {
                    break;
                }
                r5 = r6;
            }
            if (r5 != null) {
                if (r5.A01 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("UserNoticeManager/handleEligibleFutureStartEndTiming/passed start timing: ");
                    sb2.append(r5.A02);
                    sb2.append(" of stage:");
                    i = r5.A00;
                    sb2.append(i);
                    Log.i(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("UserNoticeManager/handleEligibleFutureStartEndTiming/passed end timing: ");
                    sb3.append(r5.A02);
                    sb3.append(" of stage: ");
                    int i5 = r5.A00;
                    sb3.append(i5);
                    Log.i(sb3.toString());
                    if (i5 == 0) {
                        i = 1;
                    } else {
                        i = 2;
                        if (i5 >= 2 || r10.A02 == null) {
                            i = 3;
                            if (i5 >= 3 || r10.A04 == null) {
                                i = 4;
                                if (i5 >= 4 || r10.A03 == null) {
                                    i = 5;
                                }
                            }
                        }
                    }
                }
                r11.A05(r12, i);
                str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/handleEligibleFutureStartEndTiming";
            } else {
                C131506Pi A006 = A00(r10, i2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("UserNoticeManager/transitionUserNoticeStageIfNecessary/currentStage = ");
                sb4.append(i2);
                sb4.append("  next stage: ");
                sb4.append(i4);
                Log.i(sb4.toString());
                C131506Pi A007 = A00(r10, i4);
                if (A007 != null && A007.A02 != null) {
                    str2 = "UserNoticeManager/handleNextStageStartTime/next stage start time exists";
                } else if (A006 == null) {
                    return;
                } else {
                    if (A006.A01 != null) {
                        str2 = "UserNoticeManager/handleCurrentStageEndTiming/current stage end time exists";
                    } else {
                        AnonymousClass6AX r3 = A006.A00;
                        if (r3 != null) {
                            Log.i("UserNoticeManager/handleCurrentStageDuration/current stage duration exists");
                            long j = r3.A00;
                            if (j != -1) {
                                long j2 = r12.A04;
                                Log.i("UserNoticeManager/handleCurrentStageStaticDuration/static duration exists");
                                if (A002 >= j2 + j) {
                                    str = "UserNoticeManager/handleCurrentStageStaticDuration/current stage static duration expired";
                                } else {
                                    return;
                                }
                            } else {
                                long[] jArr = r3.A01;
                                if (jArr != null) {
                                    Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/repeat duration exists");
                                    if (C29361Wi.A00(r11.A03).getInt("current_user_notice_duration_repeat_index", 0) > jArr.length) {
                                        str = "UserNoticeManager/handleCurrentStageRepeatDuration/current stage repeat duration complete";
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            Log.i(str);
                            r11.A05(r12, i4);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str2);
    }

    public static void A02(C131506Pi r4, C29341Wg r5, boolean z) {
        AnonymousClass6AX r0 = r4.A00;
        if (r0 == null || r0.A01 == null) {
            Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/no repeat duration");
            return;
        }
        Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/set repeat values");
        int i = 1;
        if (!z) {
            i = 1 + C29361Wi.A00(r5.A03).getInt("current_user_notice_duration_repeat_index", 0);
        }
        C29361Wi r42 = r5.A03;
        C29361Wi.A00(r42).edit().putInt("current_user_notice_duration_repeat_index", i).apply();
        C29361Wi.A00(r42).edit().putLong("current_user_notice_duration_repeat_timestamp", C19970wo.A00(r5.A05)).apply();
    }

    public static void A03(C29341Wg r2) {
        Log.i("UserNoticeManager/cleanupAfterDelete");
        ((AnonymousClass6VR) r2.A07.get()).A0A("tag.whatsapp.usernotice.getStage()update");
        C29351Wh r1 = r2.A02;
        Log.i("UserNoticeContentManager/cancelWork");
        C21570zS r22 = r1.A06;
        ((AnonymousClass6VR) r22.get()).A0A("tag.whatsapp.usernotice.content.fetch");
        ((AnonymousClass6VR) r22.get()).A0A("tag.whatsapp.usernotice.icon.fetch");
    }

    public static void A04(C29341Wg r6, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/enqueueStageUpdateWork/notice id: ");
        sb.append(i);
        sb.append(" stage: ");
        sb.append(i2);
        sb.append(" version: ");
        sb.append(i3);
        Log.i(sb.toString());
        AnonymousClass6EH r1 = new AnonymousClass6EH();
        r1.A01("notice_id", i);
        r1.A01("stage", i2);
        r1.A01("version", i3);
        AnonymousClass6X2 A002 = r1.A00();
        C1271667f r12 = new C1271667f();
        r12.A00 = C023109s.A01;
        C132316Tb A003 = r12.A00();
        C97384pE r4 = new C97384pE(UserNoticeStageUpdateWorker.class);
        r4.A06("tag.whatsapp.usernotice.getStage()update");
        r4.A03(A003);
        Integer num = C023109s.A00;
        r4.A05(num, TimeUnit.HOURS, 1);
        r4.A00.A0A = A002;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("tag.whatsapp.usernotice.getStage()update.");
        sb2.append(i);
        sb2.append(".");
        sb2.append(i2);
        String obj = sb2.toString();
        ((AnonymousClass6VR) r6.A07.get()).A07((C97404pG) r4.A00(), num, obj);
    }

    private void A05(C65613Su r9, int i) {
        int i2 = r9.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/updateUserNoticeStage/updating to new stage: ");
        sb.append(i);
        sb.append(" noticeId: ");
        sb.append(i2);
        Log.i(sb.toString());
        long A002 = C19970wo.A00(this.A05);
        int i3 = r9.A03;
        C65613Su r1 = new C65613Su(i2, i, i3, A002, 0);
        C29361Wi r0 = this.A03;
        r0.A04(r1);
        C29361Wi.A00(r0).edit().remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_duration_static_timestamp_start").apply();
        A04(this, i2, i, i3);
    }

    public static boolean A06(C131506Pi r9, C29341Wg r10) {
        String obj;
        AnonymousClass6AX r5 = r9.A00;
        boolean z = true;
        if (r5 == null) {
            obj = "UserNoticeManager/shouldShowStage/no duration";
        } else {
            long A002 = C19970wo.A00(r10.A05);
            long j = r5.A00;
            if (j != -1) {
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/has static duration");
                C29361Wi r102 = r10.A03;
                long j2 = C29361Wi.A00(r102).getLong("current_user_notice_duration_static_timestamp_start", 0);
                if (j2 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("UserNoticeManager/shouldShowStageForStaticDuration/static duration start: ");
                    sb.append(A002);
                    Log.i(sb.toString());
                    C29361Wi.A00(r102).edit().putLong("current_user_notice_duration_static_timestamp_start", A002).apply();
                    j2 = A002;
                }
                if (A002 >= j2 + j) {
                    Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration expired");
                    return false;
                }
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration valid");
                return true;
            }
            long[] jArr = r5.A01;
            if (jArr == null) {
                obj = "UserNoticeManager/shouldShowStage/no repeat duration";
            } else {
                C29361Wi r52 = r10.A03;
                int i = C29361Wi.A00(r52).getInt("current_user_notice_duration_repeat_index", 0);
                if (i == 0) {
                    obj = "UserNoticeManager/shouldShowStage/allow first repeat";
                } else if (i > jArr.length) {
                    Log.i("UserNoticeManager/shouldShowStage/no more repeats");
                    return false;
                } else {
                    if (A002 - C29361Wi.A00(r52).getLong("current_user_notice_duration_repeat_timestamp", 0) < jArr[i - 1]) {
                        z = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("UserNoticeManager/shouldShowStage/repeatTimeElapse: ");
                    sb2.append(z);
                    obj = sb2.toString();
                }
            }
        }
        Log.i(obj);
        return z;
    }

    public void A08() {
        C65613Su A012 = this.A03.A01();
        if (A012 == null) {
            Log.e("UserNoticeManager/agreeUserNotice/no current notice to agree");
            this.A00.A0E("UserNoticeManager/agreeUserNotice/noContent", (String) null, true);
            return;
        }
        Log.i("UserNoticeManager/agreeUserNotice");
        A05(A012, 5);
    }

    public void A09() {
        Log.i("UserNoticeManager/deleteAllUserNoticesWithoutCleanup");
        C29351Wh r4 = this.A02;
        Log.i("UserNoticeContentManager/deleteAllUserNoticeData");
        File A022 = C29351Wh.A02(r4.A02.A00.getFilesDir(), "user_notice");
        if (A022 != null) {
            r4.A05.Boy(new C35731jA((Object) A022, 10));
        }
        r4.A00 = null;
        C29361Wi r2 = this.A03;
        C29361Wi.A00(r2).edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").remove("user_notices").apply();
        r2.A01.clear();
    }

    public void A0A() {
        C29361Wi r1 = this.A03;
        C29361Wi.A00(r1).edit().putLong("current_user_notice_banner_dismiss_timestamp", C19970wo.A00(this.A05)).apply();
    }

    public C29341Wg(C19700wN r1, C19970wo r2, AnonymousClass17Z r3, C20810yC r4, C29351Wh r5, C29361Wi r6, AnonymousClass12U r7, C21570zS r8) {
        this.A05 = r2;
        this.A01 = r4;
        this.A00 = r1;
        this.A07 = r8;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r3;
    }
}
