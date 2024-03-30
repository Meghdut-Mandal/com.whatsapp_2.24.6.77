package X;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.privacy.usernotice.UserNoticeContentWorker;
import com.whatsapp.privacy.usernotice.UserNoticeIconWorker;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Wh  reason: invalid class name and case insensitive filesystem */
public class C29351Wh {
    public C128646Db A00;
    public final C19730wQ A01;
    public final C19630wG A02;
    public final C18820ts A03;
    public final C20810yC A04;
    public final C19770wU A05;
    public final C21570zS A06;
    public final AnonymousClass17Z A07;
    public final C24691Dk A08;
    public final C29371Wj A09;
    public final C29391Wl A0A;

    public boolean A09(InputStream inputStream, String str, int i) {
        FileOutputStream fileOutputStream;
        try {
            File A012 = A01(this.A02.A00, i);
            if (A012 == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeContentWorker/storeUserNoticeContent/storing user notice for ");
            sb.append(i);
            Log.i(sb.toString());
            fileOutputStream = new FileOutputStream(new File(A012, str));
            AnonymousClass6YY.A0J(inputStream, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            Log.e("UserNoticeContentWorker/storeUserNoticeContent/failed to store", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static AnonymousClass5HO A00(C20810yC r9, boolean z) {
        AnonymousClass6AX r4;
        int i = 358;
        if (z) {
            i = 357;
        }
        C21000yV r1 = C21000yV.A02;
        int A002 = C20800yB.A00(r1, r9, i);
        if (A002 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("GreenAlertUtils/buildModal/dismissible: ");
            sb.append(z);
            sb.append(", no start time received");
            Log.i(sb.toString());
            return null;
        }
        if (!z) {
            A002 += C20800yB.A00(r1, r9, 365);
        }
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        if (z) {
            r4 = new AnonymousClass6AX(new long[]{86400000}, -1);
        } else {
            r4 = null;
        }
        AnonymousClass65B r12 = new AnonymousClass65B(new C131506Pi(r4, new C1276168z(((long) A002) * 1000), (C1276168z) null, "onDemand"), "", "", "", "", "");
        if (z) {
            r12.A03 = "";
        }
        return r12.A00();
    }

    public static File A02(File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/getDir/could not make directory ");
        sb.append(file2.getAbsolutePath());
        Log.e(sb.toString());
        return null;
    }

    private void A03(C128646Db r4, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/populateIconFiles/notice id: ");
        sb.append(i);
        Log.i(sb.toString());
        A04(r4.A02, "banner_icon_light.png", "banner_icon_dark.png", i);
        A04(r4.A04, "modal_icon_light.png", "modal_icon_dark.png", i);
        A04(r4.A03, "blocking_modal_icon_light.png", "blocking_modal_icon_dark.png", i);
    }

    private void A04(AnonymousClass647 r3, String str, String str2, int i) {
        if (r3 != null) {
            if (A05(this, new String[]{str, str2}, i)) {
                File A012 = A01(this.A02.A00, i);
                r3.A01 = new File(A012, str);
                r3.A00 = new File(A012, str2);
            }
        }
    }

    public static boolean A05(C29351Wh r5, String[] strArr, int i) {
        File[] listFiles;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArr);
        File A012 = A01(r5.A02.A00, i);
        if (!(A012 == null || (listFiles = A012.listFiles()) == null)) {
            for (File name : listFiles) {
                hashSet.remove(name.getName());
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/userNoticeFilesExist/notice id ");
        sb.append(i);
        sb.append(" files exists: ");
        sb.append(isEmpty);
        Log.i(sb.toString());
        return isEmpty;
    }

    public C128646Db A06(C65613Su r16) {
        FileInputStream fileInputStream;
        String str;
        AnonymousClass5HM r8;
        C65613Su r1 = r16;
        int i = r1.A01;
        C20810yC r6 = this.A04;
        if (AnonymousClass3RI.A00(r6, i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeContentManager/getUserNoticeContentFromLocal/green alert disabled, notice id: ");
            sb.append(i);
            str = sb.toString();
        } else if (AnonymousClass3RI.A01(r6, r1)) {
            C19630wG r3 = this.A02;
            int A002 = C20800yB.A00(C21000yV.A02, r6, 356);
            if (A002 == 0) {
                Log.i("GreenAlertUtils/buildBanner/no duration received");
                r8 = null;
            } else {
                r8 = new AnonymousClass5HM(new C131506Pi(new AnonymousClass6AX((long[]) null, ((long) A002) * 3600000), new C1276168z(1609459200000L), (C1276168z) null, "onDemand"), r3.A00.getString(R.string.f12nameremoved));
            }
            AnonymousClass5HO A003 = A00(r6, true);
            AnonymousClass5HO A004 = A00(r6, false);
            if (r8 == null || A003 == null || A004 == null) {
                return null;
            }
            return new C128646Db(r8, A003, A004, (AnonymousClass6CS) null, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, 1, 1);
        } else {
            int i2 = r1.A03;
            int i3 = r1.A00;
            int i4 = 0;
            if (i3 != 0) {
                i4 = 1;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        i4 = 3;
                        if (i3 != 3) {
                            i4 = 4;
                            if (i3 != 4) {
                                i4 = 5;
                                if (i3 != 5) {
                                    i4 = -1;
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UserNoticeContentManager/getUserNoticeContentFromLocal/notice id: ");
            sb2.append(i);
            sb2.append(" version: ");
            sb2.append(i2);
            sb2.append(" stage: ");
            sb2.append(i4);
            Log.i(sb2.toString());
            if (i4 == 5) {
                str = "UserNoticeContentManager/getUserNoticeContentFromLocal/end stage, skip local content";
            } else {
                C128646Db r12 = this.A00;
                if (r12 != null && r12.A00 == i && r12.A01 == i2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("UserNoticeContentManager/getUserNoticeContentFromLocal/has content for notice id: ");
                    sb3.append(i);
                    sb3.append(" version: ");
                    sb3.append(i2);
                    Log.i(sb3.toString());
                    A03(this.A00, i);
                    return this.A00;
                }
                if (A05(this, new String[]{"content.json"}, i)) {
                    try {
                        fileInputStream = new FileInputStream(new File(A01(this.A02.A00, i), "content.json"));
                        C128646Db A032 = this.A08.A03(fileInputStream, i);
                        this.A00 = A032;
                        if (A032 != null) {
                            A03(A032, i);
                            C128646Db r7 = this.A00;
                            fileInputStream.close();
                            return r7;
                        }
                        Log.e("UserNoticeContentManager/getUserNoticeContentFromLocal/error parsing");
                        A07(i);
                        C29371Wj.A02(this.A09, 3);
                        fileInputStream.close();
                        return null;
                    } catch (IOException e) {
                        Log.e("UserNoticeContentManager/getUserNoticeContentFromLocal/exception", e);
                        return null;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                return null;
            }
        }
        Log.i(str);
        return null;
        throw th;
    }

    public void A07(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/deleteUserNoticeData/notice id: ");
        sb.append(i);
        Log.i(sb.toString());
        File A012 = A01(this.A02.A00, i);
        if (A012 != null) {
            this.A05.Boy(new C35731jA((Object) A012, 10));
        }
        this.A00 = null;
    }

    public void A08(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentManager/fetchAndStoreUserNoticeContent/notice id ");
        sb.append(i);
        Log.i(sb.toString());
        AnonymousClass6EH r8 = new AnonymousClass6EH();
        r8.A01("notice_id", i);
        C19730wQ r0 = this.A01;
        r0.A0G();
        Me me = r0.A00;
        if (me == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UserNoticeContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notice id ");
            sb2.append(i);
            Log.e(sb2.toString());
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v1").appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(i));
        C18820ts r3 = this.A03;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("lg", r3.A06()).appendQueryParameter("lc", r3.A05()).appendQueryParameter("cc", AnonymousClass1M4.A00(me.cc)).appendQueryParameter("platform", "android");
        if (this.A02.A00.getResources().getDisplayMetrics().densityDpi <= 240) {
            str = "hdpi";
        } else {
            str = "xxhdpi";
        }
        Uri build = appendQueryParameter2.appendQueryParameter("img-size", str).build();
        build.toString();
        r8.A00.put("url", build.toString());
        AnonymousClass6X2 A002 = r8.A00();
        C1271667f r1 = new C1271667f();
        r1.A00 = C023109s.A01;
        C132316Tb A003 = r1.A00();
        C97384pE r2 = new C97384pE(UserNoticeContentWorker.class);
        r2.A06("tag.whatsapp.usernotice.content.fetch");
        r2.A03(A003);
        Integer num = C023109s.A00;
        TimeUnit timeUnit = TimeUnit.HOURS;
        r2.A05(num, timeUnit, 1);
        r2.A00.A0A = A002;
        C97384pE r22 = new C97384pE(UserNoticeIconWorker.class);
        r22.A06("tag.whatsapp.usernotice.icon.fetch");
        r22.A03(A003);
        r22.A05(num, timeUnit, 1);
        r22.A00.A0A = r8.A00();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("tag.whatsapp.usernotice.content.fetch.");
        sb3.append(i);
        String obj = sb3.toString();
        ((AnonymousClass6VR) this.A06.get()).A03((C97404pG) r2.A00(), num, obj).A03((C97404pG) r22.A00()).A02();
    }

    public C29351Wh(C19730wQ r1, C19630wG r2, AnonymousClass17Z r3, C18820ts r4, C20810yC r5, C24691Dk r6, C29371Wj r7, C29391Wl r8, C19770wU r9, C21570zS r10) {
        this.A04 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = r9;
        this.A03 = r4;
        this.A06 = r10;
        this.A09 = r7;
        this.A07 = r3;
        this.A0A = r8;
        this.A08 = r6;
    }

    public static File A01(Context context, int i) {
        File A022 = A02(context.getFilesDir(), "user_notice");
        if (A022 == null) {
            return null;
        }
        return A02(A022, String.valueOf(i));
    }
}
