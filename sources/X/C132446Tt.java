package X;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Pair;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.mediacomposer.VideoTimelineView;
import com.whatsapp.profile.WebImagePicker;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.WaAsyncTask$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Tt  reason: invalid class name and case insensitive filesystem */
public abstract class C132446Tt {
    public AnonymousClass01Y A00;
    public AnonymousClass012 A01;
    public final C91494c6 A02;

    public void A0C(Object obj) {
    }

    public static Pair A05(Object obj, Collection collection) {
        return new Pair(obj, new ArrayList(collection));
    }

    public final int A06() {
        AsyncTask.Status status = this.A02.getStatus();
        if (status == AsyncTask.Status.PENDING) {
            return 0;
        }
        if (status == AsyncTask.Status.RUNNING) {
            return 1;
        }
        return 2;
    }

    public AnonymousClass012 A07(Class cls) {
        if (AnonymousClass012.class.equals(cls)) {
            return this.A01;
        }
        return (AnonymousClass012) cls.cast(this.A01);
    }

    public void A09() {
        if (this instanceof C162927pN) {
            C162927pN r2 = (C162927pN) this;
            if (r2.A03 == 0) {
                AnonymousClass683 r22 = (AnonymousClass683) r2.A02;
                ((AnonymousClass610) r2.A00).A00(r22.A00);
                r22.A06.Br6(r22.A00);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("dictionaryloader/prepare/onCancelled/dictionaryAvailable=");
                C36331k8.A1S(A0u, r22.A00);
            }
        } else if (this instanceof C107205My) {
            C107205My r1 = (C107205My) this;
            C90464aC.A18(C107205My.A00(r1.A04.A00, r1));
        } else if (this instanceof C107115Mp) {
            ((C107115Mp) this).A01.Be0();
        }
    }

    public void A0A() {
        if (this instanceof C107105Mo) {
            C107105Mo r4 = (C107105Mo) this;
            WebImagePicker webImagePicker = r4.A02;
            ProgressDialog progressDialog = new ProgressDialog(webImagePicker);
            r4.A00 = progressDialog;
            progressDialog.setProgressStyle(1);
            C36391kE.A17(r4.A00, webImagePicker, R.string.f12nameremoved);
            r4.A00.setCancelable(true);
            r4.A00.setOnCancelListener(new C163317q0(r4, 6));
            r4.A00.show();
        } else if (this instanceof C106565Kj) {
            ((C106565Kj) this).A00.A0D(new C119825qW((List) null));
        } else if (this instanceof C107125Mq) {
            C107125Mq r2 = (C107125Mq) this;
            Iterator A0s = C36361kB.A0s(r2.A07);
            while (A0s.hasNext()) {
                ((C160417ky) A0s.next()).BS6();
            }
            r2.A0A.A01("db_backup", true);
        } else if (this instanceof C107115Mp) {
            ((C107115Mp) this).A01.Bip();
        } else if (this instanceof C107075Ml) {
            C225314u r22 = (C225314u) ((C107075Ml) this).A00.get();
            if (r22 != null && !r22.BLh()) {
                r22.Bu2(0, R.string.f12nameremoved);
            }
        } else if (this instanceof C107095Mn) {
            C107095Mn r0 = (C107095Mn) this;
            r0.A0A.schedule(new AnonymousClass79A(r0), AnonymousClass6X5.A0L);
        } else if (this instanceof C107005Me) {
            AnonymousClass3SJ.A01(((C107005Me) this).A00, 104);
        }
    }

    public void A0B(Object obj) {
        AnonymousClass011 r5;
        File file;
        if (this instanceof C107185Mw) {
            C107185Mw r3 = (C107185Mw) this;
            C111615cZ r52 = (C111615cZ) obj;
            AnonymousClass1BA r2 = r3.A02;
            String str = r3.A06;
            r2.A01.remove(str);
            r2.A00.remove(str);
            if (r52 == null) {
                r52 = new AnonymousClass5KX("received null result");
            }
            C107185Mw.A00(r52, r3);
        } else if ((this instanceof C107025Mg) && (r5 = (AnonymousClass011) obj) != null && (file = (File) r5.first) != null) {
            Log.i("onCancelled/cancelled with non-null file, deleting file");
            AnonymousClass6YY.A0P(file);
        }
    }

    public final void A0D(boolean z) {
        this.A02.cancel(z);
    }

    public void A0E(Object... objArr) {
        int A06;
        TextView textView;
        int i;
        C160517l8 r2;
        if (this instanceof C162927pN) {
            C162927pN r1 = (C162927pN) this;
            if (r1.A03 == 0) {
                Boolean[] boolArr = (Boolean[]) objArr;
                AnonymousClass00C.A0D(boolArr, 0);
                Boolean bool = boolArr[0];
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    ((AnonymousClass683) r1.A02).A06.Br6(booleanValue);
                    ((AnonymousClass610) r1.A00).A00(booleanValue);
                    C36321k7.A1X("dictionaryloader/prepare/onProgressUpdate/hasDictionary=", AnonymousClass000.A0u(), booleanValue);
                }
            }
        } else if (this instanceof C107185Mw) {
            C107185Mw r4 = (C107185Mw) this;
            Number number = objArr[1];
            int intValue = number.intValue();
            AnonymousClass1BA r0 = r4.A02;
            String str = r4.A06;
            r0.A01.put(str, number);
            Iterator A0s = C36361kB.A0s(r4.A01);
            while (A0s.hasNext()) {
                C129156Fn r02 = (C129156Fn) A0s.next();
                r02.toString();
                r02.A0A(str, intValue);
            }
        } else if (this instanceof C107175Mv) {
            C107175Mv r12 = (C107175Mv) this;
            if (!C36431kI.A1Y(r12) && (r2 = r12.A00) != null) {
                C1512378t r13 = objArr[0];
                if (r13 instanceof C1512378t) {
                    r2.Bc6(r13);
                } else if (r13 instanceof AnonymousClass68B) {
                    r2.Bc5((AnonymousClass68B) r13);
                } else if (r13 instanceof String) {
                    r2.Bc8((String) r13);
                }
            }
        } else if (this instanceof C107045Mi) {
            ((C107045Mi) this).A01.BZo(((Bitmap[]) objArr)[0]);
        } else if (this instanceof C107065Mk) {
            Integer num = ((Integer[]) objArr)[0];
            AnonymousClass7d5 r14 = ((C107065Mk) this).A01;
            if (r14 != null && num != null) {
                int intValue2 = num.intValue();
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r14;
                stickerStorePackPreviewActivity.A0L.A0L();
                stickerStorePackPreviewActivity.A0L.A0M(intValue2, true);
            }
        } else if (this instanceof C107105Mo) {
            Integer[] numArr = (Integer[]) objArr;
            ProgressDialog progressDialog = ((C107105Mo) this).A00;
            if (progressDialog != null) {
                progressDialog.setProgress(C90524aI.A06(numArr, 0));
            }
        } else if (this instanceof C107085Mm) {
            C107085Mm r7 = (C107085Mm) this;
            VideoTimelineView videoTimelineView = (VideoTimelineView) r7.A05.get();
            if (videoTimelineView != null) {
                ArrayList arrayList = videoTimelineView.A0J;
                if (arrayList != null) {
                    Collections.addAll(arrayList, objArr);
                }
                if (System.currentTimeMillis() > r7.A00 + 500) {
                    r7.A00 = System.currentTimeMillis();
                    videoTimelineView.invalidate();
                }
            }
        } else if (this instanceof C107125Mq) {
            C107125Mq r03 = (C107125Mq) this;
            Integer[] numArr2 = (Integer[]) objArr;
            if (numArr2 != null) {
                AnonymousClass5FU r15 = r03.A07;
                int A062 = C90524aI.A06(numArr2, 0);
                Iterator A0s2 = C36361kB.A0s(r15);
                while (A0s2.hasNext()) {
                    ((C160417ky) A0s2.next()).Bdj(A062);
                }
            }
        } else if (this instanceof C107015Mf) {
            C107015Mf r22 = (C107015Mf) this;
            List[] listArr = (List[]) objArr;
            if (listArr == null || listArr.length < 1) {
                Log.i("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/onProgressUpdate values empty");
            } else {
                C34621hN.A00(r22.A00, listArr[0]);
            }
        } else if (this instanceof AnonymousClass5JU) {
            AnonymousClass5JU r23 = (AnonymousClass5JU) this;
            Integer[] numArr3 = (Integer[]) objArr;
            AnonymousClass00C.A0D(numArr3, 0);
            Integer num2 = numArr3[0];
            if (num2 != null) {
                AnonymousClass5JW r04 = r23.A00;
                r04.A02.A00(num2.intValue(), 100);
            }
        } else if (this instanceof AnonymousClass5JV) {
            Integer[] numArr4 = (Integer[]) objArr;
            AnonymousClass5JX r05 = ((AnonymousClass5JV) this).A01;
            int A063 = C90524aI.A06(numArr4, 0);
            C100804vn r10 = r05.A03.A00;
            if (r10 instanceof RestoreFromBackupActivity) {
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r10;
                if (A063 - restoreFromBackupActivity.A00 > 0) {
                    restoreFromBackupActivity.A00 = A063;
                    if (A063 % 10 == 0) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("restore>RestoreFromBackupActivity/msgstore-restore-progress:");
                        A0u.append(A063);
                        C36321k7.A1a(A0u, "%");
                    }
                    if (A063 <= 100) {
                        if (A063 < 80) {
                            textView = restoreFromBackupActivity.A04;
                            i = R.string.f12nameremoved;
                        } else if (A063 < 90) {
                            textView = restoreFromBackupActivity.A04;
                            i = R.string.f12nameremoved;
                        } else {
                            if (A063 < 100) {
                                textView = restoreFromBackupActivity.A04;
                                i = R.string.f12nameremoved;
                            }
                            restoreFromBackupActivity.A02.setIndeterminate(true);
                        }
                        C36341k9.A0s(restoreFromBackupActivity, textView, new Object[]{restoreFromBackupActivity.A00.A0N().format(((double) A063) / 100.0d)}, i);
                        restoreFromBackupActivity.A02.setIndeterminate(true);
                    }
                }
            }
            C36571kW r06 = AnonymousClass5JX.A0G;
            if (r06 != null && r06.getProgress() != (A06 = C90524aI.A06(numArr4, 0))) {
                AnonymousClass5JX.A0G.setProgress(A06);
            }
        }
    }

    public final void A0F(Object... objArr) {
        this.A02.A01(objArr);
    }

    public C132446Tt(AnonymousClass012 r3, boolean z) {
        this();
        C18740tg.A01();
        C18740tg.A0C(C36371kC.A1W(((AnonymousClass01N) r3.getLifecycle()).A02, AnonymousClass01P.DESTROYED));
        this.A01 = r3;
        this.A00 = new WaAsyncTask$$ExternalSyntheticLambda0(this, z);
        r3.getLifecycle().A04(this.A00);
    }

    /* JADX WARNING: type inference failed for: r3v146, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v57 */
    /* JADX WARNING: type inference failed for: r6v58, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v61 */
    /* JADX WARNING: type inference failed for: r6v62 */
    /* JADX WARNING: type inference failed for: r6v63 */
    /* JADX WARNING: type inference failed for: r6v64 */
    /* JADX WARNING: type inference failed for: r6v65 */
    /* JADX WARNING: type inference failed for: r6v66 */
    /* JADX WARNING: type inference failed for: r6v67 */
    /* JADX WARNING: type inference failed for: r6v68 */
    /* JADX WARNING: type inference failed for: r6v69 */
    /* JADX WARNING: type inference failed for: r6v70, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v72 */
    /* JADX WARNING: type inference failed for: r6v73 */
    /* JADX WARNING: type inference failed for: r6v74 */
    /* JADX WARNING: type inference failed for: r6v87 */
    /* JADX WARNING: type inference failed for: r6v93 */
    /* JADX WARNING: type inference failed for: r6v94 */
    /* JADX WARNING: type inference failed for: r6v95 */
    /* JADX WARNING: type inference failed for: r6v96 */
    /* JADX WARNING: type inference failed for: r6v97 */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0283, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0284, code lost:
        X.C05600Qi.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0287, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1319:0x1a34, code lost:
        if (r2 == false) goto L_0x1a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0297, code lost:
        if (r6.A0R == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1348:0x1aad, code lost:
        if (r10 != null) goto L_0x1ab6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x029a, code lost:
        if (r6 != null) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029c, code lost:
        r3.A0M.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a1, code lost:
        X.C36321k7.A1Q("StickerRepository/uninstallStickerPackSync/sticker pack id: ", r5, X.AnonymousClass000.A0u());
        r10 = r3.A0J;
        X.AnonymousClass00C.A0D(r6, 0);
        X.C18740tg.A00();
        r0 = r10.A05;
        r9 = r6.A0F;
        X.AnonymousClass00C.A08(r9);
        r0 = r0.A02(r9);
        r0.size();
        r8 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1389:0x1bbe, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c8, code lost:
        if (r8.hasNext() == false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1390:0x1bc0, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1393:0x1bc4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1394:0x1bc5, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1396:?, code lost:
        com.whatsapp.util.Log.e(X.C36331k8.A0i("BloksStorePictureTask/ Error accessing file: ", X.AnonymousClass000.A0u(), r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1397:0x1bd3, code lost:
        if (r4 != null) goto L_0x1bd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1399:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ca, code lost:
        r7 = X.C90504aG.A0U(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1400:0x1bd9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1401:0x1bda, code lost:
        com.whatsapp.util.Log.e(X.C36331k8.A0i("BloksStorePictureTask/ Error closing file: ", X.AnonymousClass000.A0u(), r1), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1402:0x1be5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1403:0x1be6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1404:0x1be7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1405:0x1be8, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1407:?, code lost:
        com.whatsapp.util.Log.e(X.C36331k8.A0i("BloksStorePictureTask/ File not found: ", X.AnonymousClass000.A0u(), r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1408:0x1bf6, code lost:
        if (r4 != null) goto L_0x1bf8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d0, code lost:
        if (r7.A0A == null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1410:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1411:0x1bfc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1412:0x1bfd, code lost:
        com.whatsapp.util.Log.e(X.C36331k8.A0i("BloksStorePictureTask/ Error closing file: ", X.AnonymousClass000.A0u(), r1), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1413:0x1c08, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1414:0x1c09, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1415:0x1c0a, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1416:0x1c0b, code lost:
        if (r4 == null) goto L_0x1c20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d2, code lost:
        r3.A04.A07(r7.A0E, r7.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02dc, code lost:
        r7 = true;
        r2 = X.AnonymousClass1B5.A00(r6, r10, false);
        r0 = X.AnonymousClass1AP.A00(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e5, code lost:
        if (r0 == null) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ec, code lost:
        if (X.AnonymousClass6YY.A0P(r0) == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ee, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ef, code lost:
        if (r11 == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f1, code lost:
        r0 = X.AnonymousClass1AP.A00(r3, "meta-avatar-tab-icon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f7, code lost:
        if (r0 == null) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02fd, code lost:
        if (X.AnonymousClass6YY.A0P(r0) != false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ff, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0300, code lost:
        if (r1 == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0302, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0303, code lost:
        if (r7 != false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0305, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0306, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0308, code lost:
        r3.A0B.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030d, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x030f, code lost:
        r2 = new X.C45042Pv();
        r2.A00 = java.lang.Boolean.valueOf(r11);
        r2.A02 = r3.A0A.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0328, code lost:
        if (r3.A08.A0E(6787) == false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x032c, code lost:
        if (r6.A0T != false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0330, code lost:
        if (r6.A0Q == false) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1666:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1667:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0332, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0333, code lost:
        r2.A01 = java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0339, code lost:
        r3.A09.Bly(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x033e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0646, code lost:
        if (r6 != 0) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0722, code lost:
        if (r1 != null) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0727, code lost:
        if (r3 < 400) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x09bf, code lost:
        if (r5 == null) goto L_0x09c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x1018, code lost:
        return java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:931:0x1225, code lost:
        if (r2 == null) goto L_0x122a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1014:0x135c A[Catch:{ all -> 0x181d }] */
    /* JADX WARNING: Removed duplicated region for block: B:1316:0x1a30  */
    /* JADX WARNING: Removed duplicated region for block: B:1318:0x1a33  */
    /* JADX WARNING: Removed duplicated region for block: B:1322:0x1a39  */
    /* JADX WARNING: Removed duplicated region for block: B:1326:0x1a41  */
    /* JADX WARNING: Removed duplicated region for block: B:1389:0x1bbe A[ExcHandler: IOException (e java.io.IOException), PHI: r4 
      PHI: (r4v18 java.io.FileOutputStream) = (r4v16 java.io.FileOutputStream), (r4v19 java.io.FileOutputStream) binds: [B:1363:0x1ae8, B:1378:0x1b86] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1363:0x1ae8] */
    /* JADX WARNING: Removed duplicated region for block: B:1390:0x1bc0 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), PHI: r4 
      PHI: (r4v17 java.io.FileOutputStream) = (r4v16 java.io.FileOutputStream), (r4v19 java.io.FileOutputStream) binds: [B:1363:0x1ae8, B:1378:0x1b86] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1363:0x1ae8] */
    /* JADX WARNING: Removed duplicated region for block: B:1398:0x1bd5 A[SYNTHETIC, Splitter:B:1398:0x1bd5] */
    /* JADX WARNING: Removed duplicated region for block: B:1409:0x1bf8 A[SYNTHETIC, Splitter:B:1409:0x1bf8] */
    /* JADX WARNING: Removed duplicated region for block: B:1593:0x0dee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1596:0x100f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1609:0x131d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1613:0x1326 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0619 A[Catch:{ all -> 0x0652 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0624 A[Catch:{ all -> 0x0652 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x063a A[Catch:{ all -> 0x0652 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x063f A[Catch:{ all -> 0x0652 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:675:0x0deb A[SYNTHETIC, Splitter:B:675:0x0deb] */
    /* JADX WARNING: Removed duplicated region for block: B:813:0x1019  */
    /* JADX WARNING: Removed duplicated region for block: B:939:0x1234  */
    /* JADX WARNING: Removed duplicated region for block: B:991:0x12e5 A[ADDED_TO_REGION, Catch:{ all -> 0x181d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:1395:0x1bc6=Splitter:B:1395:0x1bc6, B:1406:0x1be9=Splitter:B:1406:0x1be9} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:301:0x0613=Splitter:B:301:0x0613, B:310:0x0628=Splitter:B:310:0x0628} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A08(java.lang.Object... r23) {
        /*
            r22 = this;
            r5 = r23
            r0 = r22
            boolean r1 = r0 instanceof X.AnonymousClass5MH
            if (r1 == 0) goto L_0x0051
            X.5MH r0 = (X.AnonymousClass5MH) r0
            java.lang.String r1 = "PAY: ShareQrCodeUtil start share QR code background job"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "android.intent.action.SEND"
            android.content.Intent r6 = X.C36441kJ.A0I(r1)
            java.lang.String r1 = "image/*"
            r6.setType(r1)
            X.0y0 r2 = r0.A01
            java.lang.String r1 = "qrcode.jpg"
            java.io.File r2 = r2.A0X(r1)
            java.lang.ref.WeakReference r1 = r0.A03
            android.content.Context r1 = X.C36441kJ.A0G(r1)
            android.net.Uri r5 = X.AnonymousClass6YY.A01(r1, r2)
            r3 = 0
            java.io.FileOutputStream r4 = X.C90524aI.A0W(r2)     // Catch:{ IOException -> 0x0143 }
            android.view.View r0 = r0.A00     // Catch:{ all -> 0x0047 }
            android.graphics.Bitmap r0 = r0.getDrawingCache()     // Catch:{ all -> 0x0047 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0)     // Catch:{ all -> 0x0047 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0047 }
            r0 = 100
            r2.compress(r1, r0, r4)     // Catch:{ all -> 0x0047 }
            r4.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x19b0
        L_0x0047:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0143 }
        L_0x0050:
            throw r1     // Catch:{ IOException -> 0x0143 }
        L_0x0051:
            boolean r1 = r0 instanceof X.C162957pQ
            if (r1 == 0) goto L_0x00e7
            X.7pQ r0 = (X.C162957pQ) r0
            int r1 = r0.A03
            if (r1 == 0) goto L_0x009c
            r7 = 2
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r1 = "key"
            r6 = 0
            r2[r6] = r1
            java.lang.String r1 = X.AnonymousClass6JD.A0X
            r5 = 1
            r2[r5] = r1
            java.lang.String r1 = "https://wa.tenor.co/v1/trending"
            java.lang.String r4 = X.C54392ss.A00(r1, r2)
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x0084
            int r1 = r3.length()
            if (r1 == 0) goto L_0x0084
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r1 = "pos"
            r2[r6] = r1
            r2[r5] = r3
            java.lang.String r4 = X.C54392ss.A00(r4, r2)
        L_0x0084:
            java.lang.Object r2 = r0.A00
            X.59l r2 = (X.C1043859l) r2
            X.58R r1 = new X.58R
            r1.<init>()
            java.lang.String r0 = "Tenor"
            r1.A08 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A00 = r0
            X.00I r0 = X.C1043859l.A01(r1, r2, r4)
            return r0
        L_0x009c:
            r1 = 4
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r1 = "api_key"
            r7 = 0
            r3[r7] = r1
            java.lang.String r1 = X.AnonymousClass6JD.A0I
            r6 = 1
            r3[r6] = r1
            java.lang.String r1 = "rating"
            r5 = 2
            r3[r5] = r1
            r2 = 3
            java.lang.String r1 = "pg-13"
            r3[r2] = r1
            java.lang.String r1 = "https://api.giphy.com/v1/gifs/trending"
            java.lang.String r4 = X.C54392ss.A00(r1, r3)
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x00cf
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00cf
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r1 = "offset"
            r2[r7] = r1
            r2[r6] = r3
            java.lang.String r4 = X.C54392ss.A00(r4, r2)
        L_0x00cf:
            java.lang.Object r2 = r0.A00
            X.59k r2 = (X.C1043759k) r2
            X.58R r1 = new X.58R
            r1.<init>()
            java.lang.String r0 = "Giphy"
            r1.A08 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.A00 = r0
            X.00I r0 = X.C1043759k.A00(r1, r2, r4)
            return r0
        L_0x00e7:
            boolean r1 = r0 instanceof X.C162947pP
            if (r1 == 0) goto L_0x0117
            X.7pP r0 = (X.C162947pP) r0
            int r1 = r0.A02
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r0 = r0.A00
            X.1Yo r0 = (X.C29931Yo) r0
            X.1Yt r0 = r0.A08
            java.util.Set r0 = r0.A00()
            return r0
        L_0x00fc:
            java.lang.Object r0 = r0.A01
            X.1Z2 r0 = (X.AnonymousClass1Z2) r0
            X.1Z0 r2 = r0.A02
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r2)
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0115
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0115
            X.3KU r0 = r2.A03(r1)
            return r0
        L_0x0115:
            r0 = 0
            return r0
        L_0x0117:
            boolean r1 = r0 instanceof X.C162937pO
            if (r1 == 0) goto L_0x0157
            X.7pO r0 = (X.C162937pO) r0
            int r1 = r0.A01
            if (r1 == 0) goto L_0x014a
            r3 = 0
            java.lang.Object r4 = r0.A00     // Catch:{ OutOfMemoryError -> 0x013f }
            X.6WR r4 = (X.AnonymousClass6WR) r4     // Catch:{ OutOfMemoryError -> 0x013f }
            android.graphics.Bitmap r2 = r4.A04     // Catch:{ OutOfMemoryError -> 0x013f }
            int r1 = r4.A0I     // Catch:{ OutOfMemoryError -> 0x013f }
            int r0 = r4.A0H     // Catch:{ OutOfMemoryError -> 0x013f }
            android.graphics.Bitmap r0 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x013f }
            if (r0 == 0) goto L_0x19b9
            r4.A02 = r0
            X.4me r0 = r4.A08
            if (r0 == 0) goto L_0x19b9
            boolean[] r1 = r0.A03
            r0 = 1
            java.util.Arrays.fill(r1, r0)
            return r3
        L_0x013f:
            r1 = move-exception
            java.lang.String r0 = "FilterThumbnailAdapter/updateBaseThumbnail/OutOfMemoryError"
            goto L_0x0146
        L_0x0143:
            r1 = move-exception
            java.lang.String r0 = "PAY: ShareQrCodeUtil cannot process qr code for sharing"
        L_0x0146:
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        L_0x014a:
            java.lang.Object r0 = r0.A00
            X.6Kd r0 = (X.C130206Kd) r0
            int r0 = X.C130206Kd.A00(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0157:
            boolean r1 = r0 instanceof X.C106915Lv
            if (r1 == 0) goto L_0x017e
            X.5rC[] r5 = (X.C120245rC[]) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            r1 = r5[r0]
            if (r1 == 0) goto L_0x017b
            java.io.File r0 = r1.A01
            if (r0 == 0) goto L_0x017b
            int r1 = r1.A00
            java.util.ArrayList r2 = X.AnonymousClass6Qz.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x017a
            java.util.ArrayList r0 = X.C36441kJ.A14(r1)
            X.C54032sI.A00(r2, r0, r1)
            return r0
        L_0x017a:
            return r2
        L_0x017b:
            X.09w r2 = X.C023409w.A00
            return r2
        L_0x017e:
            boolean r1 = r0 instanceof X.AnonymousClass5M3
            if (r1 == 0) goto L_0x01cc
            X.5M3 r0 = (X.AnonymousClass5M3) r0
            X.68B[] r5 = (X.AnonymousClass68B[]) r5
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            X.C18740tg.A06(r5)
            int r1 = r5.length
            boolean r1 = X.AnonymousClass000.A1O(r1)
            X.C18740tg.A0B(r1)
            r7 = r5[r2]
            java.util.List r1 = r7.A05
            X.AnonymousClass00C.A08(r1)
            X.1AP r6 = r0.A00
            X.6CW r5 = r6.A04()
            java.util.ArrayList r4 = X.C36321k7.A0J(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x01aa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c1
            X.6c4 r2 = X.C90504aG.A0U(r3)
            boolean r1 = r6.A0G(r2)
            X.6CV r0 = new X.6CV
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x01aa
        L_0x01c1:
            X.6Ac r1 = new X.6Ac
            r1.<init>(r7, r4)
            X.6Ad r0 = new X.6Ad
            r0.<init>(r1, r5)
            return r0
        L_0x01cc:
            boolean r1 = r0 instanceof X.AnonymousClass5MC
            if (r1 == 0) goto L_0x0341
            X.5MC r0 = (X.AnonymousClass5MC) r0
            java.lang.String[] r5 = (java.lang.String[]) r5
            r1 = 0
            r5 = r5[r1]
            X.C18740tg.A06(r5)
            X.1AP r3 = r0.A02
            java.lang.String r0 = " "
            boolean r0 = r5.contains(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0288
            android.util.Pair r0 = X.AnonymousClass1BM.A00(r5)
            if (r0 == 0) goto L_0x033f
            java.lang.Object r11 = r0.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.second
            java.lang.String r10 = (java.lang.String) r10
            X.1BI r0 = r3.A0L     // Catch:{ Exception -> 0x01f9 }
            r0.A00(r11, r10)     // Catch:{ Exception -> 0x01f9 }
            goto L_0x01ff
        L_0x01f9:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/uninstallThirdPartyPack/fetch pack failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01ff:
            X.1BI r7 = r3.A0L
            X.C36331k8.A1I(r11, r10)
            X.1BO r1 = r7.A05
            java.lang.String r0 = X.AnonymousClass1BM.A01(r11, r10)
            X.AnonymousClass00C.A08(r0)
            r1.A02(r0)
            X.1BJ r6 = r7.A03
            monitor-enter(r6)
            java.io.File r2 = X.AnonymousClass1BJ.A00(r6, r11, r10)     // Catch:{ all -> 0x0aba }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0aba }
            if (r0 == 0) goto L_0x0237
            java.io.File r1 = r2.getParentFile()     // Catch:{ all -> 0x0aba }
            r0 = 0
            X.AnonymousClass6YY.A0H(r2, r0)     // Catch:{ all -> 0x0aba }
            if (r1 == 0) goto L_0x0237
            boolean r0 = r1.isDirectory()     // Catch:{ all -> 0x0aba }
            if (r0 == 0) goto L_0x0237
            java.io.File[] r0 = r1.listFiles()     // Catch:{ all -> 0x0aba }
            int r0 = r0.length     // Catch:{ all -> 0x0aba }
            if (r0 != 0) goto L_0x0237
            X.AnonymousClass6YY.A0P(r1)     // Catch:{ all -> 0x0aba }
        L_0x0237:
            monitor-exit(r6)
            X.1BQ r1 = r7.A04
            r0 = 1
            java.lang.String r9 = "authority = ? AND sticker_pack_id = ?"
            java.lang.String[] r6 = X.C36441kJ.A1S()
            r6[r4] = r11
            r6[r0] = r10
            X.005 r0 = r1.A00
            X.1M0 r8 = X.C90494aF.A0K(r0)
            X.14e r2 = r8.A02     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "third_party_sticker_emoji_mapping"
            java.lang.String r0 = "deleteMappingForWholePack/DELETE_MAPPING_FOR_WHOLE_PACK"
            r2.A03(r1, r9, r0, r6)     // Catch:{ all -> 0x0281 }
            r8.close()
            X.1BP r0 = r7.A06
            r1 = 1
            X.005 r0 = r0.A00
            X.1M0 r8 = X.C90494aF.A0K(r0)
            java.lang.String[] r7 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0281 }
            r6 = 0
            r7[r4] = r11     // Catch:{ all -> 0x0281 }
            r7[r1] = r10     // Catch:{ all -> 0x0281 }
            X.14e r2 = r8.A02     // Catch:{ all -> 0x0281 }
            java.lang.String r1 = "third_party_whitelist_packs"
            java.lang.String r0 = "deleteWhitelistedPack/DELETE_THIRD_PARTY_WHITELIST_PACKS"
            int r0 = r2.A03(r1, r9, r0, r7)     // Catch:{ all -> 0x0281 }
            if (r0 <= 0) goto L_0x0276
            r6 = 1
        L_0x0276:
            r8.close()
            if (r6 == 0) goto L_0x033f
            X.1Au r0 = r3.A0B
            r0.A00()
            return r5
        L_0x0281:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r2 = move-exception
            X.C05600Qi.A00(r8, r0)
            throw r2
        L_0x0288:
            X.1BG r0 = r3.A0G
            r0.A09()
            r0 = 0
            X.68B r6 = r3.A03(r0, r5, r1)
            if (r6 == 0) goto L_0x0299
            boolean r0 = r6.A0R
            r11 = 1
            if (r0 != 0) goto L_0x029c
        L_0x0299:
            r11 = 0
            if (r6 == 0) goto L_0x02a1
        L_0x029c:
            X.1BH r0 = r3.A0M
            r0.A01(r6)
        L_0x02a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StickerRepository/uninstallStickerPackSync/sticker pack id: "
            X.C36321k7.A1Q(r0, r5, r1)
            X.1B5 r10 = r3.A0J
            X.AnonymousClass00C.A0D(r6, r4)
            X.C18740tg.A00()
            X.1Aq r0 = r10.A05
            java.lang.String r9 = r6.A0F
            X.AnonymousClass00C.A08(r9)
            java.util.ArrayList r0 = r0.A02(r9)
            r0.size()
            java.util.Iterator r8 = r0.iterator()
        L_0x02c4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02dc
            X.6c4 r7 = X.C90504aG.A0U(r8)
            java.lang.String r0 = r7.A0A
            if (r0 == 0) goto L_0x02c4
            X.1Av r2 = r3.A04
            java.lang.String r1 = r7.A0E
            java.lang.String r0 = r7.A0D
            r2.A07(r1, r0)
            goto L_0x02c4
        L_0x02dc:
            r7 = 1
            boolean r2 = X.AnonymousClass1B5.A00(r6, r10, r4)
            java.io.File r0 = X.AnonymousClass1AP.A00(r3, r9)
            if (r0 == 0) goto L_0x02ee
            boolean r0 = X.AnonymousClass6YY.A0P(r0)
            r1 = 0
            if (r0 == 0) goto L_0x02ef
        L_0x02ee:
            r1 = 1
        L_0x02ef:
            if (r11 == 0) goto L_0x0306
            java.lang.String r0 = "meta-avatar-tab-icon"
            java.io.File r0 = X.AnonymousClass1AP.A00(r3, r0)
            if (r0 == 0) goto L_0x0300
            boolean r0 = X.AnonymousClass6YY.A0P(r0)
            if (r0 != 0) goto L_0x0300
            r7 = 0
        L_0x0300:
            if (r1 == 0) goto L_0x0305
            r1 = 1
            if (r7 != 0) goto L_0x0306
        L_0x0305:
            r1 = 0
        L_0x0306:
            if (r2 == 0) goto L_0x033f
            X.1Au r0 = r3.A0B
            r0.A00()
            if (r1 == 0) goto L_0x033f
            X.2Pv r2 = new X.2Pv
            r2.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r2.A00 = r0
            X.1Ae r0 = r3.A0A
            java.lang.String r0 = r0.A02
            r2.A02 = r0
            X.0yC r1 = r3.A08
            r0 = 6787(0x1a83, float:9.51E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0339
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x0332
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x0333
        L_0x0332:
            r4 = 1
        L_0x0333:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A01 = r0
        L_0x0339:
            X.0yW r0 = r3.A09
            r0.Bly(r2)
            return r5
        L_0x033f:
            r5 = 0
            return r5
        L_0x0341:
            boolean r1 = r0 instanceof X.C107045Mi
            if (r1 == 0) goto L_0x038e
            X.5Mi r0 = (X.C107045Mi) r0
            X.68B[] r5 = (X.AnonymousClass68B[]) r5
            X.C18740tg.A06(r5)
            X.1AP r4 = r0.A00
            r0 = 0
            r1 = r5[r0]
            X.C18740tg.A00()
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0383
            java.lang.String r3 = r1.A0F
            X.C18740tg.A00()
            java.io.File r1 = X.AnonymousClass1AP.A00(r4, r3)
        L_0x0361:
            if (r1 == 0) goto L_0x038c
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x038c
            java.lang.String r0 = r1.getAbsolutePath()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
            X.0yC r1 = r4.A08
            r0 = 575(0x23f, float:8.06E-43)
            boolean r0 = r1.A0E(r0)
            if (r2 == 0) goto L_0x0382
            if (r0 == 0) goto L_0x0382
            X.1BC r0 = r4.A0F
            r0.A00(r2, r3)
        L_0x0382:
            return r2
        L_0x0383:
            X.1BI r0 = r4.A0L
            java.lang.String r3 = r1.A0F
            java.io.File r1 = r0.A01(r3)
            goto L_0x0361
        L_0x038c:
            r2 = 0
            return r2
        L_0x038e:
            boolean r1 = r0 instanceof X.AnonymousClass5MB
            if (r1 == 0) goto L_0x039d
            X.5MB r0 = (X.AnonymousClass5MB) r0
            X.1AP r1 = r0.A02
            int r0 = r0.A00
            java.util.ArrayList r0 = r1.A08(r0)
            return r0
        L_0x039d:
            boolean r1 = r0 instanceof X.AnonymousClass5MA
            if (r1 == 0) goto L_0x03c3
            X.5MA r0 = (X.AnonymousClass5MA) r0
            android.util.Pair[] r5 = (android.util.Pair[]) r5
            X.C18740tg.A06(r5)
            r1 = 0
            r1 = r5[r1]
            X.C18740tg.A06(r1)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            X.1AP r2 = r0.A02
            boolean r1 = r1.booleanValue()
            X.7jl r0 = r0.A01
            X.68B r0 = r2.A03(r0, r3, r1)
            return r0
        L_0x03c3:
            boolean r1 = r0 instanceof X.C107035Mh
            if (r1 == 0) goto L_0x0407
            X.5Mh r0 = (X.C107035Mh) r0
            X.1AP r7 = r0.A01
            java.util.List r6 = r7.A0A()
            java.util.ArrayList r5 = r7.A07()
            X.75V r4 = new X.75V
            r4.<init>()
            int r2 = r6.size()
            int r1 = r5.size()
            int r2 = r2 + r1
            java.util.ArrayList r3 = X.C36441kJ.A14(r2)
            r3.addAll(r6)
            r3.addAll(r5)
            java.util.Collections.sort(r3, r4)
            r1 = 1
            java.util.List[] r2 = new java.util.List[r1]
            r1 = 0
            r2[r1] = r3
            r0.A0F(r2)
            r0 = 0
            java.util.ArrayList r1 = r7.A09(r0)
            java.util.ArrayList r0 = X.C36441kJ.A15(r6)
            r0.addAll(r1)
            java.util.Collections.sort(r0, r4)
            return r0
        L_0x0407:
            boolean r1 = r0 instanceof X.C107065Mk
            if (r1 == 0) goto L_0x0479
            X.5Mk r0 = (X.C107065Mk) r0
            android.util.Pair[] r5 = (android.util.Pair[]) r5
            X.C18740tg.A06(r5)
            int r1 = r5.length
            r6 = 1
            r4 = 0
            boolean r1 = X.AnonymousClass000.A1S(r1, r6)
            X.C18740tg.A0B(r1)
            r2 = r5[r4]
            java.lang.Object r5 = r2.first
            X.6c4 r5 = (X.C135066c4) r5
            X.C18740tg.A06(r5)
            java.lang.String r1 = r5.A0G
            X.C18740tg.A06(r1)
            java.lang.String r1 = r5.A0E
            X.C18740tg.A06(r1)
            java.lang.Object r3 = r2.second
            java.lang.Integer[] r1 = new java.lang.Integer[r6]
            r1[r4] = r3
            r0.A0F(r1)
            X.1Av r7 = r0.A00
            java.lang.String r2 = r5.A0E
            java.lang.String r1 = r5.A0D
            java.io.File r2 = r7.A04(r2, r1)
            boolean r1 = r5.A03()
            if (r1 != 0) goto L_0x046a
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x046a
            java.lang.String r2 = r5.A0E
            java.lang.String r1 = r5.A0D
            java.io.File r2 = r7.A04(r2, r1)
            X.C18740tg.A06(r2)
            X.1AP r1 = r0.A02
            java.io.File r1 = r1.A06(r5, r2)
            if (r1 != 0) goto L_0x046b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x0465:
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r3)
            return r0
        L_0x046a:
            r4 = 1
        L_0x046b:
            X.1AP r1 = r0.A02
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r1.A0F(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            goto L_0x0465
        L_0x0479:
            boolean r1 = r0 instanceof X.C107145Ms
            if (r1 == 0) goto L_0x04c0
            X.5Ms r0 = (X.C107145Ms) r0
            long r4 = java.lang.System.currentTimeMillis()
            X.6Ni r3 = r0.A0G()
            r1 = 1
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r1 = 100
            X.AnonymousClass000.A1J(r2, r1)
            r0.A0F(r2)
            long r4 = X.C36441kJ.A0A(r4)
            r1 = 3000(0xbb8, double:1.482E-320)
            long r1 = r1 - r4
            r0.A0J(r1)
            boolean r1 = r3.A00()
            if (r1 == 0) goto L_0x19b9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = r0.A0H()
            r2.append(r1)
            java.lang.String r1 = "result: "
            X.C36321k7.A1K(r3, r1, r2)
            r0.A0K(r3)
            X.6Ej r1 = r0.A03
            X.3HJ r1 = r1.A04
            r1.A00()
            r0.A0I()
            return r3
        L_0x04c0:
            boolean r1 = r0 instanceof X.C107105Mo
            if (r1 == 0) goto L_0x0664
            X.5Mo r0 = (X.C107105Mo) r0
            r6 = 0
            r5 = 1
            X.67w r11 = r0.A01     // Catch:{ IOException -> 0x0625, Exception -> 0x0610, all -> 0x060c }
            java.lang.String r3 = r11.A05     // Catch:{ IOException -> 0x0625, Exception -> 0x0610, all -> 0x060c }
            java.lang.String r2 = " "
            java.lang.String r1 = "%20"
            java.lang.String r1 = r3.replace(r2, r1)     // Catch:{ IOException -> 0x0625, Exception -> 0x0610, all -> 0x060c }
            java.net.URL r4 = X.C90524aI.A0j(r1)     // Catch:{ IOException -> 0x0625, Exception -> 0x0610, all -> 0x060c }
            java.lang.String r9 = ""
            r10 = 0
            r13 = r6
            r8 = 0
        L_0x04dd:
            r1 = 20
            if (r8 >= r1) goto L_0x0589
            java.net.URLConnection r3 = r4.openConnection()     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            r1 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            r1 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.String r2 = "User-Agent"
            com.whatsapp.profile.WebImagePicker r1 = r0.A02     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            X.0wt r1 = r1.A0E     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.String r1 = r1.A02()     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            r3.setRequestProperty(r2, r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            if (r1 != 0) goto L_0x0509
            java.lang.String r1 = "Cookie"
            r3.setRequestProperty(r1, r9)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
        L_0x0509:
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            r1 = 300(0x12c, float:4.2E-43)
            if (r2 == r1) goto L_0x0512
            goto L_0x055b
        L_0x0512:
            java.lang.String r1 = "Location"
            java.lang.String r1 = r3.getHeaderField(r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            if (r1 == 0) goto L_0x056f
            java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            r7.<init>(r4, r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.String r1 = "webimage/download/bg redirected from "
            r2.append(r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            r2.append(r4)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.String r1 = " to "
            X.C36321k7.A1K(r7, r1, r2)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.String r1 = "Set-Cookie"
            java.lang.String r4 = r3.getHeaderField(r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            if (r4 == 0) goto L_0x0557
            java.lang.String r1 = ";"
            java.lang.String[] r2 = r4.split(r1)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            int r1 = r2.length     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            if (r1 <= 0) goto L_0x0543
            r4 = r2[r10]     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
        L_0x0543:
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            if (r1 != 0) goto L_0x0553
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r9)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            java.lang.String r1 = "; "
            java.lang.String r9 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
        L_0x0553:
            java.lang.String r9 = X.C36321k7.A0D(r9, r4)     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
        L_0x0557:
            r3.disconnect()     // Catch:{ IOException -> 0x0583, Exception -> 0x057d, all -> 0x0577 }
            goto L_0x0571
        L_0x055b:
            r1 = 301(0x12d, float:4.22E-43)
            if (r2 == r1) goto L_0x0512
            r1 = 302(0x12e, float:4.23E-43)
            if (r2 == r1) goto L_0x0512
            r1 = 303(0x12f, float:4.25E-43)
            if (r2 == r1) goto L_0x0512
            r1 = 307(0x133, float:4.3E-43)
            if (r2 == r1) goto L_0x0512
            r1 = 308(0x134, float:4.32E-43)
            if (r2 == r1) goto L_0x0512
        L_0x056f:
            r13 = r3
            goto L_0x0589
        L_0x0571:
            int r8 = r8 + 1
            r13 = r3
            r4 = r7
            goto L_0x04dd
        L_0x0577:
            r0 = move-exception
            r4 = r6
            r2 = r6
            r6 = r3
            goto L_0x0658
        L_0x057d:
            r1 = move-exception
            r2 = r6
            r4 = r6
            r6 = r3
            goto L_0x0613
        L_0x0583:
            r1 = move-exception
            r2 = r6
            r4 = r6
            r6 = r3
            goto L_0x0628
        L_0x0589:
            com.whatsapp.profile.WebImagePicker r7 = r0.A02     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            X.0ww r3 = r7.A07     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            java.lang.Integer r2 = X.C36431kI.A14()     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            java.io.InputStream r1 = r13.getInputStream()     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            X.5RE r4 = new X.5RE     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            r4.<init>(r3, r1, r6, r2)     // Catch:{ IOException -> 0x0607, Exception -> 0x0602, all -> 0x0654 }
            X.0yb r1 = r7.A08     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            X.0ya r2 = r1.A0O()     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            if (r2 != 0) goto L_0x05a8
            java.lang.String r1 = "webimage/download/bg cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            goto L_0x05ae
        L_0x05a8:
            android.net.Uri r1 = r7.A02     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            java.io.OutputStream r6 = r2.A07(r1)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
        L_0x05ae:
            if (r6 != 0) goto L_0x05bb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            r13.disconnect()
            X.AnonymousClass14X.A02(r4)
            return r0
        L_0x05bb:
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r9]     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            r12 = 0
            r7 = 0
        L_0x05c1:
            X.4c6 r3 = r0.A02     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            boolean r1 = r3.isCancelled()     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            if (r1 != 0) goto L_0x05e8
            int r2 = r4.read(r8, r10, r9)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            r1 = -1
            if (r2 == r1) goto L_0x05e8
            r6.write(r8, r10, r2)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            int r12 = r12 + r2
            int r1 = r11.A02     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            r2 = 0
            if (r1 == 0) goto L_0x05dc
            int r2 = r12 * 100
            int r2 = r2 / r1
        L_0x05dc:
            if (r2 == r7) goto L_0x05c1
            java.lang.Integer[] r1 = new java.lang.Integer[r5]     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            X.AnonymousClass000.A1L(r1, r2, r10)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            r0.A0F(r1)     // Catch:{ IOException -> 0x05ff, Exception -> 0x05fc, all -> 0x05fa }
            r7 = r2
            goto L_0x05c1
        L_0x05e8:
            r13.disconnect()
            X.AnonymousClass14X.A02(r4)
            X.AnonymousClass14X.A02(r6)
            boolean r0 = r3.isCancelled()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x05fa:
            r0 = move-exception
            goto L_0x0656
        L_0x05fc:
            r1 = move-exception
            r2 = r6
            goto L_0x0605
        L_0x05ff:
            r1 = move-exception
            r2 = r6
            goto L_0x060a
        L_0x0602:
            r1 = move-exception
            r2 = r6
            r4 = r6
        L_0x0605:
            r6 = r13
            goto L_0x0613
        L_0x0607:
            r1 = move-exception
            r2 = r6
            r4 = r6
        L_0x060a:
            r6 = r13
            goto L_0x0628
        L_0x060c:
            r0 = move-exception
            r4 = r6
            r2 = r6
            goto L_0x0658
        L_0x0610:
            r1 = move-exception
            r2 = r6
            r4 = r6
        L_0x0613:
            boolean r0 = X.C36431kI.A1Y(r0)     // Catch:{ all -> 0x0652 }
            if (r0 != 0) goto L_0x061e
            java.lang.String r0 = "webimage/download/bg/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0652 }
        L_0x061e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0652 }
            if (r6 == 0) goto L_0x064b
            goto L_0x0648
        L_0x0625:
            r1 = move-exception
            r2 = r6
            r4 = r6
        L_0x0628:
            boolean r0 = X.C36431kI.A1Y(r0)     // Catch:{ all -> 0x0652 }
            if (r0 != 0) goto L_0x063f
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x063f
            boolean r0 = X.C90504aG.A1Y(r1)     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x063f
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x0652 }
            goto L_0x0646
        L_0x063f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0652 }
            if (r6 == 0) goto L_0x064b
            goto L_0x0648
        L_0x0646:
            if (r6 == 0) goto L_0x064b
        L_0x0648:
            r6.disconnect()
        L_0x064b:
            X.AnonymousClass14X.A02(r4)
            X.AnonymousClass14X.A02(r2)
            return r0
        L_0x0652:
            r0 = move-exception
            goto L_0x0658
        L_0x0654:
            r0 = move-exception
            r4 = r6
        L_0x0656:
            r2 = r6
            r6 = r13
        L_0x0658:
            if (r6 == 0) goto L_0x065d
            r6.disconnect()
        L_0x065d:
            X.AnonymousClass14X.A02(r4)
            X.AnonymousClass14X.A02(r2)
            throw r0
        L_0x0664:
            boolean r1 = r0 instanceof X.AnonymousClass5M9
            if (r1 == 0) goto L_0x0696
            X.5M9 r0 = (X.AnonymousClass5M9) r0
            java.io.File[] r5 = (java.io.File[]) r5
            r3 = 0
            if (r5 == 0) goto L_0x19b9
            int r1 = r5.length
            if (r1 == 0) goto L_0x19b9
            r1 = 0
            r4 = r5[r1]
            if (r4 == 0) goto L_0x19b9
            java.lang.ref.WeakReference r1 = r0.A02
            android.view.View r2 = X.AnonymousClass000.A0Y(r1)
            if (r2 == 0) goto L_0x19b9
            int r1 = r0.A00
            X.6Kx r0 = new X.6Kx
            r0.<init>(r1, r1)
            X.5sn r0 = X.AnonymousClass6Y8.A09(r0, r4)
            android.content.res.Resources r1 = r2.getResources()
            android.graphics.Bitmap r0 = r0.A02
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r1, r0)
            return r3
        L_0x0696:
            boolean r1 = r0 instanceof X.AnonymousClass5M8
            if (r1 == 0) goto L_0x0790
            X.5M8 r0 = (X.AnonymousClass5M8) r0
            java.lang.Integer r1 = r0.A00
            r5 = 0
            if (r1 == 0) goto L_0x06b3
            int r7 = r1.intValue()
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r0.A02     // Catch:{ Exception -> 0x0738 }
            X.1Dj r2 = r6.A04     // Catch:{ Exception -> 0x0738 }
            X.1Dl r2 = r2.A06     // Catch:{ Exception -> 0x0738 }
            int r3 = r2.A03(r7)     // Catch:{ Exception -> 0x0738 }
            r2 = 1
            if (r3 < r2) goto L_0x074d
            goto L_0x0725
        L_0x06b3:
            java.lang.String r9 = r0.A01
            if (r9 == 0) goto L_0x0788
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0788
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r0.A02
            X.1Dj r0 = r6.A04
            X.C24681Dj.A00(r0)
            X.1Dl r0 = r0.A06
            X.C24701Dl.A02(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            java.util.Iterator r12 = X.C36371kC.A10(r0)
            r3 = -2
            r10 = r5
            r8 = r5
        L_0x06d3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0712
            java.util.Map$Entry r11 = X.AnonymousClass000.A11(r12)
            java.lang.Object r7 = r11.getValue()
            X.1gr r7 = (X.C34331gr) r7
            java.lang.String r2 = r7.A07
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "surf="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r9, r1)
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L_0x06d3
            int r0 = r7.A01
            java.util.List r1 = X.C34391gx.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x06d3
            long r1 = r7.A05
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x06d3
            java.lang.Object r10 = r11.getKey()
            java.lang.String r8 = r7.A06
            long r3 = r7.A05
            goto L_0x06d3
        L_0x0712:
            if (r10 == 0) goto L_0x0788
            if (r8 == 0) goto L_0x0788
            android.util.Pair r0 = X.C36441kJ.A0Q(r10, r8)
            java.lang.Object r1 = r0.first
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0788
            goto L_0x072f
        L_0x0725:
            r2 = 400(0x190, float:5.6E-43)
            if (r3 >= r2) goto L_0x074d
        L_0x0729:
            X.1Dj r0 = r6.A04
            java.lang.String r0 = r0.A01(r7)
        L_0x072f:
            if (r0 == 0) goto L_0x0788
            int r4 = r1.intValue()
            java.lang.String r3 = "PrivacyDisclosureContainerViewModel: loadAndParseDisclosure: id="
            goto L_0x075c
        L_0x0738:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "PrivacyDisclosureContainerViewModel: try to access to disclosureId="
            r3.append(r2)
            r3.append(r7)
            r2 = 32
            r3.append(r2)
            X.C36351kA.A1L(r4, r3)
        L_0x074d:
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r0.A02
            X.00s r3 = r6.A03
            X.5SN r2 = X.AnonymousClass5SN.LOADING
            X.6Ba r0 = new X.6Ba
            r0.<init>(r2, r5, r5)
            r3.A0C(r0)
            goto L_0x0729
        L_0x075c:
            X.6Ny r1 = r6.A05     // Catch:{ 5US -> 0x0776, JSONException -> 0x076e }
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ 5US -> 0x0776, JSONException -> 0x076e }
            X.6AW r1 = r1.A00(r0, r4)     // Catch:{ 5US -> 0x0776, JSONException -> 0x076e }
            X.5SN r0 = X.AnonymousClass5SN.SUCCESS     // Catch:{ 5US -> 0x0776, JSONException -> 0x076e }
            X.6Ba r6 = new X.6Ba     // Catch:{ 5US -> 0x0776, JSONException -> 0x076e }
            r6.<init>(r0, r5, r1)     // Catch:{ 5US -> 0x0776, JSONException -> 0x076e }
            return r6
        L_0x076e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r4, r3)
            java.lang.String r0 = ", JSONException"
            goto L_0x077d
        L_0x0776:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r4, r3)
            java.lang.String r0 = ", PrivacyDisclosureDataException"
        L_0x077d:
            X.C36351kA.A1Q(r0, r1, r2)
            X.5SN r0 = X.AnonymousClass5SN.ERROR
            X.6Ba r6 = new X.6Ba
            r6.<init>(r0, r2, r5)
            return r6
        L_0x0788:
            X.5SN r0 = X.AnonymousClass5SN.SUCCESS
            X.6Ba r6 = new X.6Ba
            r6.<init>(r0, r5, r5)
            return r6
        L_0x0790:
            boolean r1 = r0 instanceof X.AnonymousClass5M2
            if (r1 == 0) goto L_0x07a8
            X.5M2 r0 = (X.AnonymousClass5M2) r0
            X.1Ed r4 = r0.A01
            r3 = 0
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            r0 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 300(0x12c, float:4.2E-43)
            X.AnonymousClass000.A1L(r1, r0, r3)
            java.util.List r0 = r4.A0U(r2, r1, r3)
            return r0
        L_0x07a8:
            boolean r1 = r0 instanceof X.AnonymousClass5M1
            if (r1 == 0) goto L_0x07c9
            X.5M1 r0 = (X.AnonymousClass5M1) r0
            java.lang.String r0 = r0.A00
            r3 = 0
            byte[] r2 = android.util.Base64.decode(r0, r3)
            X.AnonymousClass00C.A08(r2)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            int r0 = r2.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r0)
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x07c9:
            boolean r1 = r0 instanceof X.AnonymousClass5MN
            if (r1 == 0) goto L_0x07e8
            X.5MN r0 = (X.AnonymousClass5MN) r0
            int r2 = r0.A01
            int r1 = r0.A00
            int r2 = java.lang.Math.max(r2, r1)
            X.1GX r1 = r0.A03     // Catch:{ 1X5 | IOException -> 0x07e0 }
            android.net.Uri r0 = r0.A02     // Catch:{ 1X5 | IOException -> 0x07e0 }
            android.graphics.Bitmap r0 = r1.A0e(r0, r2, r2)     // Catch:{ 1X5 | IOException -> 0x07e0 }
            return r0
        L_0x07e0:
            r1 = move-exception
            java.lang.String r0 = "IndiaUpiQrTabActivity/loadImageRunnable Failed to load image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x07e8:
            boolean r1 = r0 instanceof X.AnonymousClass5MR
            if (r1 == 0) goto L_0x0809
            X.5MR r0 = (X.AnonymousClass5MR) r0
            X.1Ys r1 = r0.A04
            X.1HB r4 = r1.A01
            java.lang.String r3 = r0.A05
            X.6c9 r2 = r0.A03
            X.0y0 r1 = r1.A00
            java.io.File r1 = r1.A0F()
            java.io.File r2 = r2.A02(r1)
            int r1 = r0.A01
            int r0 = r0.A00
            android.graphics.Bitmap r0 = r4.A06(r2, r3, r1, r0)
            return r0
        L_0x0809:
            boolean r1 = r0 instanceof X.AnonymousClass5M0
            if (r1 == 0) goto L_0x081b
            X.5M0 r0 = (X.AnonymousClass5M0) r0
            monitor-enter(r0)
            X.0xM r2 = r0.A00     // Catch:{ all -> 0x1c1e }
            r1 = 0
            r2.A0b(r1, r1)     // Catch:{ all -> 0x1c1e }
            r2.A0W()     // Catch:{ all -> 0x1c1e }
            monitor-exit(r0)
            return r1
        L_0x081b:
            boolean r1 = r0 instanceof X.AnonymousClass5MM
            if (r1 == 0) goto L_0x09c9
            X.5MM r0 = (X.AnonymousClass5MM) r0
            X.9ky r4 = new X.9ky
            r4.<init>()
            X.0wD r1 = r0.A00
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x083a
            r2 = 0
            r1 = 6
            X.9ky r0 = new X.9ky
            r0.<init>((int) r1)
            X.00I r0 = X.C36441kJ.A0W(r2, r0)
            return r0
        L_0x083a:
            java.util.List r3 = r0.A0G()
            X.1Db r1 = r0.A01
            android.content.SharedPreferences r2 = r1.A03()
            java.lang.String r1 = "payments_sandbox"
            boolean r1 = X.C36371kC.A1U(r2, r1)
            if (r1 == 0) goto L_0x0857
            java.lang.String r2 = "payment_dev_cycle"
            java.lang.String r1 = "dev"
            X.00I r1 = X.C36441kJ.A0W(r2, r1)
            r3.add(r1)
        L_0x0857:
            X.1Vk r6 = r0.A02
            java.lang.StringBuilder r5 = X.C36421kH.A0f(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0861:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0895
            java.lang.Object r1 = r3.next()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x088c }
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.String r0 = "="
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.Object r1 = r1.A01     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x088c }
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x088c }
            java.lang.String r0 = "&"
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x088c }
            goto L_0x0861
        L_0x088c:
            r2 = move-exception
            X.1Dc r1 = r6.A0F
            java.lang.String r0 = "httpRequestFBToken threw while encoding query: "
            r1.A0A(r0, r2)
            goto L_0x0861
        L_0x0895:
            java.lang.String r2 = r5.toString()
            r3 = 0
            java.lang.String r0 = "https://secure.facebook.com/payments/generate_token"
            java.net.URL r0 = X.C90524aI.A0j(r0)     // Catch:{ MalformedURLException -> 0x09ad }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            boolean r0 = r5 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            if (r0 == 0) goto L_0x0981
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ IOException -> 0x097f }
            X.0yd r0 = r6.A0J     // Catch:{ IOException -> 0x097f }
            X.8qS r0 = r0.A00()     // Catch:{ IOException -> 0x097f }
            r5.setSSLSocketFactory(r0)     // Catch:{ IOException -> 0x097f }
            X.C90464aC.A1S(r5)     // Catch:{ IOException -> 0x097f }
            java.lang.String r1 = "Content-Length"
            int r0 = r2.length()     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x097f }
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x097f }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x097f }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = "curl/7.49.1"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x097f }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x097f }
            r0 = 1
            r5.setDoInput(r0)     // Catch:{ IOException -> 0x097f }
            r5.setDoOutput(r0)     // Catch:{ IOException -> 0x097f }
            r5.connect()     // Catch:{ IOException -> 0x097f }
            X.0ww r10 = r6.A01     // Catch:{ IOException -> 0x097f }
            java.lang.Integer r9 = X.C36401kF.A0k()     // Catch:{ IOException -> 0x097f }
            X.5RL r1 = X.C132776Vf.A01(r10, r3, r9, r5)     // Catch:{ IOException -> 0x097f }
            java.lang.String r7 = X.C19430v1.A0B     // Catch:{ IOException -> 0x097f }
            byte[] r0 = r2.getBytes(r7)     // Catch:{ IOException -> 0x097f }
            r1.write(r0)     // Catch:{ IOException -> 0x097f }
            r1.flush()     // Catch:{ IOException -> 0x097f }
            X.1Dc r2 = r6.A0F     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = "httpRequestFBToken connecting to URL: https://secure.facebook.com/payments/generate_token"
            r2.A06(r0)     // Catch:{ IOException -> 0x097f }
            int r8 = r5.getResponseCode()     // Catch:{ IOException -> 0x097f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 != r0) goto L_0x0962
            X.5RE r1 = X.C132776Vf.A00(r10, r3, r9, r5)     // Catch:{ IOException -> 0x097f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x097f }
            r0.<init>(r1, r7)     // Catch:{ IOException -> 0x097f }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x097f }
            r7.<init>(r0)     // Catch:{ IOException -> 0x097f }
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = r7.readLine()     // Catch:{ IOException -> 0x097f }
        L_0x0924:
            if (r0 == 0) goto L_0x092e
            r1.append(r0)     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = r7.readLine()     // Catch:{ IOException -> 0x097f }
            goto L_0x0924
        L_0x092e:
            java.lang.String r7 = r1.toString()     // Catch:{ IOException -> 0x097f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = "httpRequestFBToken got response code: "
            r1.append(r0)     // Catch:{ IOException -> 0x097f }
            r1.append(r8)     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = " response: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)     // Catch:{ IOException -> 0x097f }
            r2.A04(r0)     // Catch:{ IOException -> 0x097f }
            org.json.JSONObject r1 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x0952 }
            java.lang.String r0 = "token"
            java.lang.String r3 = r1.optString(r0, r3)     // Catch:{ JSONException -> 0x0952 }
            goto L_0x09c1
        L_0x0952:
            r1 = move-exception
            java.lang.String r0 = "httpRequestFBToken threw json exception in response: "
            r2.A0A(r0, r1)     // Catch:{ IOException -> 0x097f }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x097f }
            r0 = 2
            r4.A00 = r0     // Catch:{ IOException -> 0x097f }
            r4.A07 = r1     // Catch:{ IOException -> 0x097f }
            goto L_0x09c1
        L_0x0962:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = "httpRequestFBToken got unsuccessful http response code while getting token: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r8)     // Catch:{ IOException -> 0x097f }
            r2.A06(r0)     // Catch:{ IOException -> 0x097f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x097f }
            java.lang.String r0 = "Unsuccessful HTTP response code"
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r8)     // Catch:{ IOException -> 0x097f }
            r0 = 2
            r4.A00 = r0     // Catch:{ IOException -> 0x097f }
            r4.A07 = r1     // Catch:{ IOException -> 0x097f }
            goto L_0x09c1
        L_0x097f:
            r2 = move-exception
            goto L_0x0992
        L_0x0981:
            X.1Dc r1 = r6.A0F     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            java.lang.String r0 = "httpRequestFBToken failed to connect with a https connection: https://secure.facebook.com/payments/generate_token"
            r1.A06(r0)     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            java.lang.String r1 = ""
            r0 = 4
            r4.A00 = r0     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            r4.A07 = r1     // Catch:{ IOException -> 0x0990, all -> 0x09a6 }
            goto L_0x09c4
        L_0x0990:
            r2 = move-exception
            r5 = r3
        L_0x0992:
            X.1Dc r1 = r6.A0F     // Catch:{ all -> 0x09a3 }
            java.lang.String r0 = "httpRequestFBToken connection response threw: "
            r1.A0A(r0, r2)     // Catch:{ all -> 0x09a3 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x09a3 }
            r0 = 2
            r4.A00 = r0     // Catch:{ all -> 0x09a3 }
            r4.A07 = r1     // Catch:{ all -> 0x09a3 }
            goto L_0x09bf
        L_0x09a3:
            r2 = move-exception
            r3 = r5
            goto L_0x09a7
        L_0x09a6:
            r2 = move-exception
        L_0x09a7:
            if (r3 == 0) goto L_0x1c20
            r3.disconnect()
            throw r2
        L_0x09ad:
            r2 = move-exception
            X.1Dc r1 = r6.A0F
            java.lang.String r0 = "httpRequestFBToken threw while building url "
            r1.A0A(r0, r2)
            java.lang.String r1 = r2.toString()
            r0 = 3
            r4.A00 = r0
            r4.A07 = r1
            goto L_0x09c4
        L_0x09bf:
            if (r5 == 0) goto L_0x09c4
        L_0x09c1:
            r5.disconnect()
        L_0x09c4:
            X.00I r0 = X.C36441kJ.A0W(r3, r4)
            return r0
        L_0x09c9:
            boolean r1 = r0 instanceof X.AnonymousClass5MT
            if (r1 == 0) goto L_0x09e5
            X.5MT r0 = (X.AnonymousClass5MT) r0
            X.1EU r1 = r0.A04
            X.AnonymousClass1EU.A00(r1)
            X.1Ed r1 = r1.A05
            java.lang.String r2 = r0.A06
            int r3 = r0.A01
            long r5 = r0.A02
            long r7 = r0.A03
            int r4 = r0.A00
            r1.A0Y(r2, r3, r4, r5, r7)
            r0 = 0
            return r0
        L_0x09e5:
            boolean r1 = r0 instanceof X.C106865Lq
            if (r1 == 0) goto L_0x0ac7
            X.5Lq r0 = (X.C106865Lq) r0
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            com.whatsapp.jid.UserJid r1 = r0.A01
            if (r1 == 0) goto L_0x09f6
            r8.add(r1)
        L_0x09f6:
            X.0xY r9 = r0.A00
            X.5Tu r4 = X.C108515Tu.A0B
            X.6NS r3 = X.AnonymousClass6NS.A0L
            r7 = 1
            r6 = 0
            X.0wD r1 = r9.A03
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x0a67
            java.lang.String r1 = "contactsyncmethods/network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.6Pu r1 = X.C131626Pu.A04
        L_0x0a0d:
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0ac2
            java.util.Iterator r8 = r8.iterator()
        L_0x0a17:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0abd
            com.whatsapp.jid.UserJid r3 = X.C36441kJ.A0o(r8)
            X.1EU r1 = r0.A02
            X.AnonymousClass1EU.A00(r1)
            X.16S r6 = r1.A06
            monitor-enter(r6)
            com.whatsapp.payments.PaymentConfiguration r1 = r6.A01     // Catch:{ all -> 0x0aba }
            if (r1 == 0) goto L_0x0a65
            java.lang.String r1 = X.AnonymousClass3U8.A07(r3)     // Catch:{ all -> 0x0aba }
            java.lang.String r1 = X.AnonymousClass3SI.A02(r1)     // Catch:{ all -> 0x0aba }
            X.9l8 r1 = X.C202159l8.A01(r1)     // Catch:{ all -> 0x0aba }
            java.lang.String r2 = r1.A03     // Catch:{ all -> 0x0aba }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0aba }
            if (r1 != 0) goto L_0x0a65
            java.lang.String r1 = "UNSET"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0aba }
            if (r1 != 0) goto L_0x0a65
            X.8ax r5 = r6.A05(r3)     // Catch:{ all -> 0x0aba }
            if (r5 == 0) goto L_0x0a65
            com.whatsapp.jid.UserJid r1 = r5.A04     // Catch:{ all -> 0x0aba }
            if (r1 == 0) goto L_0x0a65
            X.0wo r1 = r6.A03     // Catch:{ all -> 0x0aba }
            long r3 = X.C19970wo.A00(r1)     // Catch:{ all -> 0x0aba }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0aba }
            long r1 = X.C90484aE.A0K(r1)     // Catch:{ all -> 0x0aba }
            long r3 = r3 + r1
            r5.A01 = r3     // Catch:{ all -> 0x0aba }
            r6.A0H(r5)     // Catch:{ all -> 0x0aba }
        L_0x0a65:
            monitor-exit(r6)
            goto L_0x0a17
        L_0x0a67:
            boolean r1 = r3.A00()
            X.C18740tg.A0B(r1)
            X.5SE r2 = r4.scope
            X.5SE r1 = X.AnonymousClass5SE.MULTI_PROTOCOLS_QUERY
            boolean r1 = X.C36361kB.A1a(r2, r1)
            X.C18740tg.A0B(r1)
            r8.size()
            X.6Pz r5 = new X.6Pz
            r5.<init>(r4)
            r5.A02 = r7
            r5.A00 = r3
            java.util.Iterator r4 = r8.iterator()
        L_0x0a89:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0aa6
            com.whatsapp.jid.UserJid r3 = X.C36441kJ.A0o(r4)
            X.0yC r2 = r9.A08
            r1 = 3311(0xcef, float:4.64E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 != 0) goto L_0x0aa2
            X.16D r1 = r9.A04
            r1.A0D(r3)
        L_0x0aa2:
            r5.A04(r3)
            goto L_0x0a89
        L_0x0aa6:
            X.6Pq r1 = r5.A01()
            X.5Lg r1 = X.C20430xY.A00(r9, r1, r6)
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0ab6 }
            X.6Pu r1 = (X.C131626Pu) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0ab6 }
            goto L_0x0a0d
        L_0x0ab6:
            X.6Pu r1 = X.C131626Pu.A03
            goto L_0x0a0d
        L_0x0aba:
            r2 = move-exception
            monitor-exit(r6)
            throw r2
        L_0x0abd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x0ac2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L_0x0ac7:
            boolean r1 = r0 instanceof X.AnonymousClass5MV
            if (r1 == 0) goto L_0x0afe
            X.5MV r0 = (X.AnonymousClass5MV) r0
            X.1A1 r7 = r0.A06
            X.11F r6 = r0.A04
            boolean r5 = r0.A07
            r4 = 0
            X.1DF r3 = r0.A02
            long r1 = r0.A01
            if (r5 == 0) goto L_0x0af0
            android.database.Cursor r3 = r3.A04(r6, r4, r1)
        L_0x0ade:
            X.0yC r1 = r0.A03
            X.1l9 r2 = new X.1l9
            r2.<init>(r3, r1, r6, r7)
            boolean r1 = X.C36431kI.A1Y(r0)
            if (r1 == 0) goto L_0x0af5
            r2.close()
            r2 = 0
            return r2
        L_0x0af0:
            android.database.Cursor r3 = r3.A05(r6, r4, r1)
            goto L_0x0ade
        L_0x0af5:
            r2.getCount()
            int r0 = r0.A00
            r2.moveToPosition(r0)
            return r2
        L_0x0afe:
            boolean r1 = r0 instanceof X.AnonymousClass5MZ
            if (r1 == 0) goto L_0x0bea
            X.5MZ r0 = (X.AnonymousClass5MZ) r0
            java.lang.String r1 = "mediaview/task/getmsgs"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1A1 r6 = r0.A09
            X.11F r5 = r0.A06
            X.1DF r7 = r0.A04
            X.2bU r8 = r0.A08
            long r1 = r8.A1N
            r10 = 512(0x200, float:7.175E-43)
            android.database.Cursor r2 = r7.A04(r5, r10, r1)
            X.0yC r4 = r0.A05
            X.1l9 r1 = new X.1l9
            r1.<init>(r2, r4, r5, r6)
            r0.A00 = r1
            X.4c6 r11 = r0.A02
            boolean r1 = r11.isCancelled()
            java.lang.Integer r3 = X.C90494aF.A0U()
            java.lang.String r9 = "GetMediaMessagesTask cancelled"
            if (r1 == 0) goto L_0x0b39
            X.1l9 r0 = r0.A00
        L_0x0b32:
            r0.close()
            com.whatsapp.util.Log.i((java.lang.String) r9)
            return r3
        L_0x0b39:
            long r1 = r8.A1N
            android.database.Cursor r2 = r7.A05(r5, r10, r1)
            X.1l9 r1 = new X.1l9
            r1.<init>(r2, r4, r5, r6)
            r0.A01 = r1
            boolean r2 = r11.isCancelled()
            X.1l9 r1 = r0.A00
            if (r2 == 0) goto L_0x0b54
            r1.close()
            X.1l9 r0 = r0.A01
            goto L_0x0b32
        L_0x0b54:
            int r1 = r1.getCount()
            r9 = 1
            r3 = 0
            boolean r1 = X.AnonymousClass000.A1T(r1, r10)
            r0.A02 = r1
            X.1l9 r1 = r0.A00
            r1.moveToPosition(r3)
            X.1l9 r1 = r0.A00
            int r1 = r1.getCount()
            if (r1 != 0) goto L_0x0b96
            X.1l9 r1 = r0.A00
            r1.close()
            long r1 = r8.A1N
            android.database.Cursor r2 = r7.A04(r5, r3, r1)
            X.1l9 r1 = new X.1l9
            r1.<init>(r2, r4, r5, r6)
            r0.A00 = r1
            r1.moveToPosition(r3)
            r0.A02 = r9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "mediaview/navigator/getmsgs head-upgraded:"
            r2.append(r1)
            X.1l9 r1 = r0.A00
            int r1 = r1.getCount()
            X.C36321k7.A1Y(r2, r1)
        L_0x0b96:
            X.1l9 r1 = r0.A01
            int r1 = r1.getCount()
            boolean r1 = X.AnonymousClass000.A1T(r1, r10)
            r0.A03 = r1
            X.1l9 r1 = r0.A01
            r1.moveToPosition(r3)
            X.1l9 r1 = r0.A01
            int r1 = r1.getCount()
            if (r1 != 0) goto L_0x0bd8
            X.1l9 r1 = r0.A01
            r1.close()
            long r1 = r8.A1N
            android.database.Cursor r2 = r7.A05(r5, r3, r1)
            X.1l9 r1 = new X.1l9
            r1.<init>(r2, r4, r5, r6)
            r0.A01 = r1
            r1.moveToPosition(r3)
            r0.A03 = r9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "mediaview/navigator/getmsgs tail-upgraded:"
            r2.append(r1)
            X.1l9 r1 = r0.A01
            int r1 = r1.getCount()
            X.C36321k7.A1Y(r2, r1)
        L_0x0bd8:
            X.1l9 r1 = r0.A00
            int r1 = r1.getCount()
            X.1l9 r0 = r0.A01
            int r0 = r0.getCount()
            int r1 = r1 + r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            return r3
        L_0x0bea:
            boolean r1 = r0 instanceof X.AnonymousClass5MX
            if (r1 == 0) goto L_0x0c37
            X.5MX r0 = (X.AnonymousClass5MX) r0
            int r7 = r0.A00
            int r6 = r7 + -1
            if (r7 != 0) goto L_0x0bfb
            X.6WR r0 = r0.A01
            android.graphics.Bitmap r2 = r0.A02
            return r2
        L_0x0bfb:
            android.graphics.Bitmap[] r1 = r0.A05
            r5 = r1[r6]
            r4 = 1
            if (r5 == 0) goto L_0x0c1a
            boolean[] r3 = r0.A07
            boolean r1 = r3[r6]
            if (r1 == 0) goto L_0x0c15
            X.6WR r1 = r0.A01
            android.graphics.Bitmap r2 = r1.A02
            X.54s r1 = r0.A08
            boolean r1 = com.whatsapp.filter.FilterUtils.A02(r2, r5, r1, r7)
            r4 = r4 ^ r1
            r3[r6] = r4
        L_0x0c15:
            android.graphics.Bitmap[] r0 = r0.A05
            r2 = r0[r6]
            return r2
        L_0x0c1a:
            X.6WR r1 = r0.A01
            android.graphics.Bitmap r2 = r1.A02
            X.54s r1 = r0.A08
            android.graphics.Bitmap r2 = com.whatsapp.filter.FilterUtils.A00(r2, r1, r7, r4)
            if (r2 == 0) goto L_0x0c30
            android.graphics.Bitmap[] r1 = r0.A05
            r1[r6] = r2
            boolean[] r1 = r0.A07
            r0 = 0
            r1[r6] = r0
            return r2
        L_0x0c30:
            java.lang.String r0 = "FilterThumbnailAdapter/onBindViewHolder/onPostExecute/failed to create thumbnail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
            return r2
        L_0x0c37:
            boolean r1 = r0 instanceof X.C106855Lp
            if (r1 == 0) goto L_0x0c53
            X.5Lp r0 = (X.C106855Lp) r0
            r4 = 0
        L_0x0c3e:
            android.graphics.Bitmap[] r3 = r0.A00
            int r1 = r3.length
            r2 = 0
            if (r4 >= r1) goto L_0x0c52
            r1 = r3[r4]
            if (r1 == 0) goto L_0x0c4f
            r1 = r3[r4]
            r1.recycle()
            r3[r4] = r2
        L_0x0c4f:
            int r4 = r4 + 1
            goto L_0x0c3e
        L_0x0c52:
            return r2
        L_0x0c53:
            boolean r1 = r0 instanceof X.AnonymousClass5ML
            if (r1 == 0) goto L_0x0c98
            X.5ML r0 = (X.AnonymousClass5ML) r0
            X.6WR r4 = r0.A02
            android.graphics.Bitmap r1 = r4.A04
            r3 = 0
            if (r1 == 0) goto L_0x0c97
            android.graphics.Bitmap r5 = r0.A01
            if (r5 == 0) goto L_0x0c8b
            if (r5 == r1) goto L_0x0c8b
            int r2 = r5.getHeight()
            android.graphics.Bitmap r1 = r4.A04
            int r1 = r1.getHeight()
            if (r2 != r1) goto L_0x0c8b
            int r2 = r5.getWidth()
            android.graphics.Bitmap r1 = r4.A04
            int r1 = r1.getWidth()
            if (r2 != r1) goto L_0x0c8b
            android.graphics.Bitmap r2 = r4.A04
            int r1 = r0.A00
            X.54s r0 = r4.A0S
            boolean r0 = com.whatsapp.filter.FilterUtils.A02(r2, r5, r0, r1)
            if (r0 == 0) goto L_0x0c97
            return r5
        L_0x0c8b:
            android.graphics.Bitmap r3 = r4.A04
            int r2 = r0.A00
            r1 = 1
            X.54s r0 = r4.A0S
            android.graphics.Bitmap r5 = com.whatsapp.filter.FilterUtils.A00(r3, r0, r2, r1)
            return r5
        L_0x0c97:
            return r3
        L_0x0c98:
            boolean r1 = r0 instanceof X.C106955Lz
            if (r1 == 0) goto L_0x0cb3
            X.5Lz r0 = (X.C106955Lz) r0
            X.7mX[] r5 = (X.C161307mX[]) r5
            X.C18740tg.A06(r5)
            int r4 = r5.length
            r3 = 0
        L_0x0ca5:
            if (r3 >= r4) goto L_0x0cb1
            r2 = r5[r3]
            X.5Aq r1 = r0.A00
            r1.A0C(r2)
            int r3 = r3 + 1
            goto L_0x0ca5
        L_0x0cb1:
            r0 = 0
            return r0
        L_0x0cb3:
            boolean r1 = r0 instanceof X.C107175Mv
            if (r1 == 0) goto L_0x0cda
            X.5Mv r0 = (X.C107175Mv) r0
            boolean r1 = r0 instanceof X.C106575Kk
            if (r1 == 0) goto L_0x0cc6
            X.5Kk r0 = (X.C106575Kk) r0
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            java.lang.Void r0 = r0.A0G(r5)
            return r0
        L_0x0cc6:
            boolean r1 = r0 instanceof X.C106565Kj
            if (r1 == 0) goto L_0x0cd3
            X.5Kj r0 = (X.C106565Kj) r0
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            java.lang.Void r0 = r0.A0G(r5)
            return r0
        L_0x0cd3:
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            java.lang.Void r0 = r0.A0G(r5)
            return r0
        L_0x0cda:
            boolean r1 = r0 instanceof X.AnonymousClass5M7
            if (r1 == 0) goto L_0x0d04
            X.5M7 r0 = (X.AnonymousClass5M7) r0
            X.7mX[] r5 = (X.C161307mX[]) r5
            X.C18740tg.A06(r5)
            int r2 = r5.length
            r1 = 1
            r3 = 0
            if (r2 == r1) goto L_0x0ceb
            r1 = 0
        L_0x0ceb:
            X.C18740tg.A0B(r1)
            r2 = r5[r3]
            X.C18740tg.A06(r2)
            java.lang.ref.WeakReference r1 = r0.A01
            android.content.Context r1 = X.C36441kJ.A0G(r1)
            if (r1 != 0) goto L_0x0cfd
            r0 = 0
            return r0
        L_0x0cfd:
            X.0ts r0 = r0.A00
            X.6Ft r0 = r2.B4v(r1, r0, r3)
            return r0
        L_0x0d04:
            boolean r1 = r0 instanceof X.AnonymousClass5MF
            if (r1 == 0) goto L_0x0d57
            X.5MF r0 = (X.AnonymousClass5MF) r0
            android.graphics.Bitmap[] r5 = (android.graphics.Bitmap[]) r5
            X.C18740tg.A06(r5)
            int r2 = r5.length
            r1 = 1
            r8 = 0
            if (r2 == r1) goto L_0x0d15
            r1 = 0
        L_0x0d15:
            X.C18740tg.A0B(r1)
            r7 = r5[r8]
            r6 = 0
            android.graphics.Rect r1 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0d50 }
            int r2 = r1.width()     // Catch:{ OutOfMemoryError -> 0x0d50 }
            int r1 = r1.height()     // Catch:{ OutOfMemoryError -> 0x0d50 }
            android.graphics.Bitmap r3 = X.C90524aI.A09(r2, r1)     // Catch:{ OutOfMemoryError -> 0x0d50 }
            android.graphics.Canvas r5 = X.C90524aI.A0A(r3)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.drawColor(r1)
            android.graphics.Matrix r1 = r0.A00
            r5.setMatrix(r1)
            int r4 = r7.getWidth()
            int r2 = r7.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r4, r2)
            android.graphics.Rect r0 = r0.A01
            r5.drawBitmap(r7, r1, r0, r6)
            r1 = 75
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r3, r1, r0)
            return r3
        L_0x0d50:
            r1 = move-exception
            java.lang.String r0 = "BlurBitmapAsyncTask/doInBackground creating output bitmap"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        L_0x0d57:
            boolean r1 = r0 instanceof X.C107085Mm
            if (r1 == 0) goto L_0x0e0c
            X.5Mm r0 = (X.C107085Mm) r0
            X.1le r12 = new X.1le
            r12.<init>()
            java.io.File r1 = r0.A04     // Catch:{ Exception -> 0x0e07 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0e07 }
            r12.setDataSource(r1)     // Catch:{ Exception -> 0x0e07 }
            r1 = 9
            java.lang.String r1 = r12.extractMetadata(r1)     // Catch:{ Exception -> 0x0e07 }
            long r16 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0e07 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0dfd }
            r0.A00 = r1     // Catch:{ all -> 0x0dfd }
            float r13 = r0.A02     // Catch:{ all -> 0x0dfd }
            float r11 = r0.A01     // Catch:{ all -> 0x0dfd }
            r1 = 0
            android.graphics.RectF r10 = new android.graphics.RectF     // Catch:{ all -> 0x0dfd }
            r10.<init>(r1, r1, r13, r11)     // Catch:{ all -> 0x0dfd }
            android.graphics.Rect r9 = X.AnonymousClass001.A06()     // Catch:{ all -> 0x0dfd }
            r8 = 1
            android.graphics.Paint r7 = X.C36441kJ.A0L(r8)     // Catch:{ all -> 0x0dfd }
            r6 = 0
            r5 = 0
        L_0x0d90:
            int r14 = r0.A03     // Catch:{ all -> 0x0dfd }
            if (r5 >= r14) goto L_0x0df8
            boolean r1 = X.C36431kI.A1Y(r0)     // Catch:{ all -> 0x0dfd }
            if (r1 != 0) goto L_0x0df8
            r3 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r16
            long r1 = (long) r5     // Catch:{ all -> 0x0dfd }
            long r3 = r3 * r1
            long r1 = (long) r14     // Catch:{ all -> 0x0dfd }
            long r3 = r3 / r1
            android.graphics.Bitmap r3 = r12.getFrameAtTime(r3)     // Catch:{ Exception | NoSuchMethodError -> 0x0de7 }
            if (r3 == 0) goto L_0x0de8
            int r14 = r3.getWidth()     // Catch:{ all -> 0x0dfd }
            int r4 = r3.getHeight()     // Catch:{ all -> 0x0dfd }
            float r1 = (float) r14     // Catch:{ all -> 0x0dfd }
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0de8
            float r1 = (float) r4     // Catch:{ all -> 0x0dfd }
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0de8
            int r15 = (int) r13     // Catch:{ all -> 0x0dfd }
            int r2 = (int) r11     // Catch:{ all -> 0x0dfd }
            android.graphics.Bitmap$Config r1 = r3.getConfig()     // Catch:{ all -> 0x0dfd }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r15, r2, r1)     // Catch:{ all -> 0x0dfd }
            if (r14 <= r4) goto L_0x0dda
            r9.top = r6     // Catch:{ all -> 0x0dfd }
            r9.bottom = r4     // Catch:{ all -> 0x0dfd }
            int r14 = r14 - r4
            int r1 = r14 / 2
            r9.left = r1     // Catch:{ all -> 0x0dfd }
            int r1 = r1 + r4
            r9.right = r1     // Catch:{ all -> 0x0dfd }
        L_0x0dd2:
            android.graphics.Canvas r1 = X.C90524aI.A0A(r2)     // Catch:{ all -> 0x0dfd }
            r1.drawBitmap(r3, r9, r10, r7)     // Catch:{ all -> 0x0dfd }
            goto L_0x0de9
        L_0x0dda:
            r9.left = r6     // Catch:{ all -> 0x0dfd }
            r9.right = r14     // Catch:{ all -> 0x0dfd }
            int r4 = r4 - r14
            int r1 = r4 / 2
            r9.top = r1     // Catch:{ all -> 0x0dfd }
            int r1 = r1 + r14
            r9.bottom = r1     // Catch:{ all -> 0x0dfd }
            goto L_0x0dd2
        L_0x0de7:
            r3 = 0
        L_0x0de8:
            r2 = r3
        L_0x0de9:
            if (r2 == r3) goto L_0x0dee
            r3.recycle()     // Catch:{ all -> 0x0dfd }
        L_0x0dee:
            android.graphics.Bitmap[] r1 = new android.graphics.Bitmap[r8]     // Catch:{ all -> 0x0dfd }
            r1[r6] = r2     // Catch:{ all -> 0x0dfd }
            r0.A0F(r1)     // Catch:{ all -> 0x0dfd }
            int r5 = r5 + 1
            goto L_0x0d90
        L_0x0df8:
            r12.close()
            r0 = 0
            return r0
        L_0x0dfd:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0e02 }
            throw r1
        L_0x0e02:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0e07:
            r12.close()
            r0 = 0
            return r0
        L_0x0e0c:
            boolean r1 = r0 instanceof X.AnonymousClass5MK
            if (r1 == 0) goto L_0x0e35
            X.5MK r0 = (X.AnonymousClass5MK) r0
            java.lang.String[] r5 = (java.lang.String[]) r5
            r4 = 0
            X.AnonymousClass00C.A0D(r5, r4)
            int r2 = r5.length
            r1 = 1
            X.1XI r3 = r0.A02
            if (r2 != r1) goto L_0x0e2c
            r2 = r5[r4]
            int r1 = r0.A00
            boolean r0 = r0.A03
            java.util.Collection r0 = r3.B7G(r2, r1, r0, r4)
        L_0x0e28:
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x0e2c:
            int r1 = r0.A00
            boolean r0 = r0.A03
            java.util.Collection r0 = r3.B7H(r5, r1, r0, r4)
            goto L_0x0e28
        L_0x0e35:
            boolean r1 = r0 instanceof X.C106945Ly
            if (r1 == 0) goto L_0x0f31
            X.5Ly r0 = (X.C106945Ly) r0
            java.lang.String r2 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON: "
            r1 = 37
            X.3v5 r4 = new X.3v5
            r4.<init>(r0, r1)
            java.lang.String r3 = "MAIN_CHECK"
            X.0wm r1 = new X.0wm
            r1.<init>(r4, r3)
            r0.A00 = r1
            r1.start()
            X.5v1 r3 = new X.5v1
            r3.<init>()
            r5 = 1
            r4 = 0
            X.6VU r11 = r0.A01     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            X.64l r10 = r11.A04     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            boolean r1 = r11 instanceof X.C1043959n     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            if (r1 == 0) goto L_0x0e62
            r16 = 20
            goto L_0x0e64
        L_0x0e62:
            r16 = 19
        L_0x0e64:
            org.json.JSONObject r15 = r11.A0A()     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r12 = r11.A08()     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r13 = X.AnonymousClass6JD.A0M     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            if (r1 == 0) goto L_0x0e73
            java.lang.String r14 = X.AnonymousClass6JD.A07     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            goto L_0x0e75
        L_0x0e73:
            java.lang.String r14 = X.AnonymousClass6JD.A09     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
        L_0x0e75:
            if (r1 == 0) goto L_0x0e7a
            r17 = 33
            goto L_0x0e7c
        L_0x0e7a:
            r17 = 19
        L_0x0e7c:
            X.6KG r10 = r10.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            X.6Tm r9 = r11.A05     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            if (r9 == 0) goto L_0x0e8d
            java.lang.Integer r1 = r9.A00     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r8 = "graphapi_request_end"
            if (r1 == 0) goto L_0x0e97
            X.C132406Tm.A01(r9, r1, r8)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
        L_0x0e8d:
            int r1 = r10.A01     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            r11.A0D(r3, r10)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            goto L_0x0ea7
        L_0x0e97:
            X.0zE r7 = r9.A03     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            int r6 = r9.A02     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r1 = r9.A02()     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r1 = X.C132406Tm.A00(r8, r1)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            r7.markerPoint(r6, r1)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            goto L_0x0e8d
        L_0x0ea7:
            if (r9 == 0) goto L_0x0eb2
            java.lang.Integer r1 = r9.A00     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r8 = "graphapi_response_parsing_success"
            if (r1 == 0) goto L_0x0ec0
            X.C132406Tm.A01(r9, r1, r8)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
        L_0x0eb2:
            java.lang.Thread r1 = r0.A00     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            boolean r1 = r1.isAlive()     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            if (r1 == 0) goto L_0x19b9
            java.lang.Thread r1 = r0.A00     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            r1.interrupt()     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            goto L_0x0ed0
        L_0x0ec0:
            X.0zE r7 = r9.A03     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            int r6 = r9.A02     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r1 = r9.A02()     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            java.lang.String r1 = X.C132406Tm.A00(r8, r1)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            r7.markerPoint(r6, r1)     // Catch:{ JSONException -> 0x0eee, IOException -> 0x0f10, Exception -> 0x0ed1 }
            goto L_0x0eb2
        L_0x0ed0:
            return r3
        L_0x0ed1:
            r6 = move-exception
            X.6VU r0 = r0.A01
            java.lang.String r7 = X.C90484aE.A0k(r6)
            r0.A0E(r7)
            X.0wN r1 = r0.A02
            java.lang.String r0 = r6.getMessage()
            r1.A0E(r2, r0, r5)
            java.lang.String r0 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: generic error - "
            com.whatsapp.util.Log.e(r0, r6)
            r0 = 3
            r3.A00 = r0
            r0 = 6
            goto L_0x0f0a
        L_0x0eee:
            r6 = move-exception
            X.6VU r0 = r0.A01
            java.lang.String r7 = X.C90484aE.A0k(r6)
            r0.A0E(r7)
            X.0wN r1 = r0.A02
            java.lang.String r0 = r6.getMessage()
            r1.A0E(r2, r0, r5)
            java.lang.String r0 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON"
            com.whatsapp.util.Log.e(r0, r6)
            r0 = 2
            r3.A00 = r0
            r0 = 7
        L_0x0f0a:
            X.62u r2 = new X.62u
            r2.<init>(r4, r7, r0)
            goto L_0x0f2e
        L_0x0f10:
            r6 = move-exception
            X.6VU r2 = r0.A01
            java.lang.String r1 = X.C90484aE.A0k(r6)
            r2.A0E(r1)
            boolean r0 = X.C36431kI.A1Y(r0)
            if (r0 != 0) goto L_0x19b9
            java.lang.String r0 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground failed"
            com.whatsapp.util.Log.e(r0, r6)
            r3.A00 = r5
            r0 = 8
            X.62u r2 = new X.62u
            r2.<init>(r4, r1, r0)
        L_0x0f2e:
            r3.A01 = r2
            return r3
        L_0x0f31:
            boolean r1 = r0 instanceof X.C107135Mr
            if (r1 == 0) goto L_0x0f3c
            X.5Mr r0 = (X.C107135Mr) r0
            X.63X r0 = r0.A0G()
            return r0
        L_0x0f3c:
            boolean r1 = r0 instanceof X.C106985Mc
            if (r1 == 0) goto L_0x1038
            X.5Mc r0 = (X.C106985Mc) r0
            java.lang.String r10 = r0.A09
            X.1Bd r9 = r0.A06
            r9.A02()
            X.1Ki r8 = r0.A03
            r7 = 0
            java.lang.String r2 = r8.A05(r7)
            boolean r1 = r8.A0D(r7)
            if (r1 == 0) goto L_0x0f57
            r7 = r2
        L_0x0f57:
            r6 = 0
            r5 = 1
            r11 = 1
        L_0x0f5a:
            int r1 = r8.A00
            if (r6 >= r1) goto L_0x1006
            r11 = 0
            java.lang.String r4 = "FetchAssetAsyncTask: "
            r1 = 14
            android.net.TrafficStats.setThreadStatsTag(r1)
            X.13E r2 = r0.A04     // Catch:{ Exception -> 0x0ff7 }
            X.0yd r1 = r0.A05     // Catch:{ Exception -> 0x0ff7 }
            X.6v1 r3 = r2.A02(r1, r10, r7)     // Catch:{ Exception -> 0x0ff7 }
            java.net.HttpURLConnection r12 = r3.A01     // Catch:{ all -> 0x0fed }
            int r2 = r12.getResponseCode()     // Catch:{ all -> 0x0fed }
            r1 = 304(0x130, float:4.26E-43)
            if (r2 != r1) goto L_0x0f7c
            r8.A08()     // Catch:{ all -> 0x0fed }
            goto L_0x0fd3
        L_0x0f7c:
            int r2 = r12.getResponseCode()     // Catch:{ all -> 0x0fed }
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 == r1) goto L_0x0f8b
            r12.getResponseCode()     // Catch:{ all -> 0x0fed }
            r3.close()     // Catch:{ Exception -> 0x0ff7 }
            goto L_0x1001
        L_0x0f8b:
            X.0ww r2 = r0.A01     // Catch:{ all -> 0x0fed }
            java.lang.Integer r1 = r0.A07     // Catch:{ all -> 0x0fed }
            X.5RE r14 = r3.B8D(r2, r11, r1)     // Catch:{ all -> 0x0fed }
            java.lang.String r1 = "signature"
            java.lang.String r1 = r12.getHeaderField(r1)     // Catch:{ all -> 0x0fe3 }
            byte[] r2 = X.AnonymousClass14X.A04(r14)     // Catch:{ all -> 0x0fe3 }
            java.util.Map r13 = r0.A0A     // Catch:{ all -> 0x0fe3 }
            boolean r1 = r8.A0E(r1, r13, r2)     // Catch:{ all -> 0x0fe3 }
            if (r1 != 0) goto L_0x0fa7
            r11 = 2
            goto L_0x0fdc
        L_0x0fa7:
            java.lang.String r1 = "Is-Encrypted"
            r12.getHeaderField(r1)     // Catch:{ all -> 0x0fe3 }
            java.io.ByteArrayInputStream r2 = X.C90524aI.A0P(r2)     // Catch:{ all -> 0x0fe3 }
            java.lang.Object r1 = r0.A08     // Catch:{ all -> 0x0fe3 }
            boolean r1 = r8.A0C(r2, r1, r13)     // Catch:{ all -> 0x0fe3 }
            if (r1 == 0) goto L_0x0fdb
            boolean r1 = r8.A0B()     // Catch:{ all -> 0x0fe3 }
            if (r1 == 0) goto L_0x0fd0
            r8.A08()     // Catch:{ all -> 0x0fe3 }
            java.lang.String r1 = "etag"
            java.lang.String r2 = r12.getHeaderField(r1)     // Catch:{ all -> 0x0fe3 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0fe3 }
            if (r1 != 0) goto L_0x0fd0
            r8.A0A(r11, r2)     // Catch:{ all -> 0x0fe3 }
        L_0x0fd0:
            r14.close()     // Catch:{ all -> 0x0fed }
        L_0x0fd3:
            r3.close()     // Catch:{ Exception -> 0x0ff7 }
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 0
            goto L_0x100d
        L_0x0fdb:
            r11 = 4
        L_0x0fdc:
            r14.close()     // Catch:{ all -> 0x0fed }
            r3.close()     // Catch:{ Exception -> 0x0ff7 }
            goto L_0x100a
        L_0x0fe3:
            r2 = move-exception
            r14.close()     // Catch:{ all -> 0x0fe8 }
            goto L_0x0fec
        L_0x0fe8:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0fed }
        L_0x0fec:
            throw r2     // Catch:{ all -> 0x0fed }
        L_0x0fed:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x0ff2 }
            goto L_0x0ff6
        L_0x0ff2:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ Exception -> 0x0ff7 }
        L_0x0ff6:
            throw r2     // Catch:{ Exception -> 0x0ff7 }
        L_0x0ff7:
            r3 = move-exception
            java.lang.String r2 = " Exception: "
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r4, r10)     // Catch:{ all -> 0x1033 }
            X.C36321k7.A1J(r3, r2, r1)     // Catch:{ all -> 0x1033 }
        L_0x1001:
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 1
            goto L_0x100d
        L_0x1006:
            r8.A06()
            goto L_0x1014
        L_0x100a:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x100d:
            if (r11 != 0) goto L_0x1019
            r8.A09(r6)
            r8.A08 = r5
        L_0x1014:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        L_0x1019:
            int r1 = r8.A01
            if (r6 != r1) goto L_0x1020
            r0.A00 = r5
            goto L_0x1014
        L_0x1020:
            int r1 = r8.A00
            int r1 = r1 - r5
            if (r6 >= r1) goto L_0x102f
            long r3 = r9.A01()     // Catch:{ InterruptedException -> 0x102f }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x102f }
        L_0x102f:
            int r6 = r6 + 1
            goto L_0x0f5a
        L_0x1033:
            r2 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r2
        L_0x1038:
            boolean r1 = r0 instanceof X.AnonymousClass5ME
            if (r1 == 0) goto L_0x1081
            X.5ME r0 = (X.AnonymousClass5ME) r0
            X.1Gu r5 = r0.A00
            java.lang.String r4 = r0.A02
            java.io.File r3 = r0.A01
            boolean r1 = X.C25571Gv.A05(r4)
            if (r1 != 0) goto L_0x1077
            boolean r1 = X.AnonymousClass1GX.A0c(r4)
            if (r1 != 0) goto L_0x1077
            X.0wG r1 = r5.A00
            android.content.res.Resources r2 = X.C36421kH.A0B(r1)
            r1 = 2131166352(0x7f070490, float:1.7946947E38)
        L_0x1059:
            float r2 = r2.getDimension(r1)
            r1 = 0
            byte[] r2 = r5.A04(r3, r4, r2, r1)
            r1 = 0
            if (r2 == 0) goto L_0x1076
            boolean r0 = X.C36431kI.A1Y(r0)
            if (r0 != 0) goto L_0x1076
            r1 = 2000(0x7d0, float:2.803E-42)
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap r1 = X.C111745cm.A00(r0, r2, r1)
        L_0x1076:
            return r1
        L_0x1077:
            X.0wG r1 = r5.A00
            android.content.res.Resources r2 = X.C36421kH.A0B(r1)
            r1 = 2131166348(0x7f07048c, float:1.7946939E38)
            goto L_0x1059
        L_0x1081:
            boolean r1 = r0 instanceof X.C107115Mp
            if (r1 == 0) goto L_0x1089
            X.5Mp r0 = (X.C107115Mp) r0
            goto L_0x1132
        L_0x1089:
            boolean r1 = r0 instanceof X.C107075Ml
            if (r1 == 0) goto L_0x10a2
            X.5Ml r0 = (X.C107075Ml) r0
            java.lang.String r8 = "\r\n"
            java.lang.String r7 = "*****"
            java.io.File r6 = r0.A05
            boolean r1 = r6.exists()
            r3 = 0
            if (r1 != 0) goto L_0x1146
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/doInBackground invalid file to search"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x10a2:
            boolean r1 = r0 instanceof X.AnonymousClass5MU
            if (r1 == 0) goto L_0x10dd
            X.5MU r0 = (X.AnonymousClass5MU) r0
            X.1D5 r9 = r0.A02
            java.util.List r0 = r0.A06
            java.util.Iterator r10 = r0.iterator()
            r7 = 0
        L_0x10b2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x123b
            X.2bU r0 = X.C36441kJ.A0r(r10)
            X.3Qj r1 = X.AnonymousClass2bU.A00(r0)
            long r5 = r0.A00
            boolean r0 = r1.A0c
            if (r0 == 0) goto L_0x10cb
            r3 = 0
        L_0x10c8:
            long r5 = r5 - r3
            long r7 = r7 + r5
            goto L_0x10b2
        L_0x10cb:
            java.lang.String r2 = r1.A0L
            r3 = 0
            if (r2 == 0) goto L_0x10c8
            X.1DE r1 = r9.A0H
            r0 = 1
            X.5z2 r0 = r1.A03(r2, r0)
            if (r0 == 0) goto L_0x10c8
            long r3 = r0.A0A
            goto L_0x10c8
        L_0x10dd:
            boolean r1 = r0 instanceof X.AnonymousClass5MJ
            if (r1 == 0) goto L_0x10e6
            X.5MJ r0 = (X.AnonymousClass5MJ) r0
            r3 = 0
            goto L_0x1240
        L_0x10e6:
            boolean r1 = r0 instanceof X.C106935Lx
            if (r1 == 0) goto L_0x1103
            X.5Lx r0 = (X.C106935Lx) r0
            android.net.Uri[] r5 = (android.net.Uri[]) r5
            int r1 = r5.length
            if (r1 <= 0) goto L_0x1279
            r1 = 0
            r1 = r5[r1]
            if (r1 == 0) goto L_0x1279
            java.lang.ref.WeakReference r0 = r0.A00
            android.content.Context r0 = X.C36441kJ.A0G(r0)
            if (r0 == 0) goto L_0x1279
            android.media.Ringtone r0 = android.media.RingtoneManager.getRingtone(r0, r1)
            return r0
        L_0x1103:
            boolean r1 = r0 instanceof X.AnonymousClass5M6
            if (r1 == 0) goto L_0x127b
            X.5M6 r0 = (X.AnonymousClass5M6) r0
            java.lang.String[] r5 = (java.lang.String[]) r5
            X.1hO r2 = r0.A00
            r1 = 0
            r1 = r5[r1]
            r3 = -1
            if (r1 == 0) goto L_0x1124
            X.1HO r2 = r2.A02
            java.lang.String r1 = X.C34681hT.A09(r1)
            X.5Ng r1 = r2.A04(r1)
            if (r1 == 0) goto L_0x1124
            long r3 = r1.A02()
        L_0x1124:
            X.1HJ r1 = r0.A01
            X.5Nh r1 = r1.A06(r3)
            boolean r0 = X.C36431kI.A1Y(r0)
            if (r0 == 0) goto L_0x1076
            r1 = 0
            return r1
        L_0x1132:
            X.19A r3 = r0.A03     // Catch:{ 1ej -> 0x1144 }
            r1 = 32000(0x7d00, double:1.581E-319)
            r3.A0B(r1)     // Catch:{ 1ej -> 0x1144 }
            X.AAt r2 = r0.A00
            X.5Tu r1 = X.C108515Tu.A0C
            com.whatsapp.jid.UserJid r0 = r0.A02
            X.6Pu r0 = r2.A04(r1, r0)
            return r0
        L_0x1144:
            r0 = 0
            return r0
        L_0x1146:
            X.6Ea r4 = r0.A04
            r4.A02()
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r7)     // Catch:{ IOException | URISyntaxException -> 0x121e, all -> 0x1231 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | URISyntaxException -> 0x121e, all -> 0x1231 }
            r5.append(r1)     // Catch:{ IOException | URISyntaxException -> 0x121e, all -> 0x1231 }
            java.lang.String r7 = X.AnonymousClass000.A0q(r7, r5)     // Catch:{ IOException | URISyntaxException -> 0x121e, all -> 0x1231 }
            java.lang.String r1 = "https://images.google.com/searchbyimage/upload"
            java.net.URLConnection r2 = X.C90504aG.A0r(r1)     // Catch:{ IOException | URISyntaxException -> 0x121e, all -> 0x1231 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException | URISyntaxException -> 0x121e, all -> 0x1231 }
            r10 = 1
            r2.setDoInput(r10)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            r1 = 0
            r2.setDoOutput(r1)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            r2.setUseCaches(r1)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            X.C90464aC.A1S(r2)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.String r1 = "POST"
            r2.setRequestMethod(r1)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.String r5 = "Connection"
            java.lang.String r1 = "Keep-Alive"
            r2.setRequestProperty(r5, r1)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.String r5 = "Cache-Control"
            java.lang.String r1 = "no-cache"
            r2.setRequestProperty(r5, r1)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.String r9 = "Content-Type"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.String r1 = "multipart/form-data; boundary="
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r7, r5)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            r2.setRequestProperty(r9, r1)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            X.0ww r1 = r0.A02     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            X.5RL r0 = X.C132776Vf.A01(r1, r3, r0, r2)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            r5.<init>(r0)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1210 }
            java.lang.String r0 = "--"
            X.AnonymousClass000.A1D(r0, r7, r8, r1)     // Catch:{ all -> 0x1210 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1210 }
            r5.writeBytes(r0)     // Catch:{ all -> 0x1210 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"encoded_image\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x1210 }
            java.lang.String r0 = "Content-Type: image/jpeg\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x1210 }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x1210 }
            r5.writeBytes(r8)     // Catch:{ all -> 0x1210 }
            java.io.FileInputStream r6 = X.C90524aI.A0U(r6)     // Catch:{ all -> 0x1210 }
            X.AnonymousClass6YY.A0J(r6, r5)     // Catch:{ all -> 0x1206 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1206 }
            java.lang.String r0 = "\r\n--"
            r1.append(r0)     // Catch:{ all -> 0x1206 }
            r1.append(r7)     // Catch:{ all -> 0x1206 }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x1206 }
            r5.writeBytes(r0)     // Catch:{ all -> 0x1206 }
            r6.close()     // Catch:{ all -> 0x1210 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x1210 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x1202
            java.net.URL r0 = r2.getURL()     // Catch:{ all -> 0x1210 }
            java.net.URI r0 = r0.toURI()     // Catch:{ all -> 0x1210 }
            if (r0 == 0) goto L_0x1202
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x1210 }
            r5.close()     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            r2.disconnect()
            r4.A00()
            return r0
        L_0x1202:
            r5.close()     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
            goto L_0x1227
        L_0x1206:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x120b }
            goto L_0x120f
        L_0x120b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1210 }
        L_0x120f:
            throw r1     // Catch:{ all -> 0x1210 }
        L_0x1210:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x1215 }
            goto L_0x1219
        L_0x1215:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
        L_0x1219:
            throw r1     // Catch:{ IOException -> 0x121c, URISyntaxException -> 0x121a }
        L_0x121a:
            r1 = move-exception
            goto L_0x1220
        L_0x121c:
            r1 = move-exception
            goto L_0x1220
        L_0x121e:
            r1 = move-exception
            r2 = r3
        L_0x1220:
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/searchImage/malformedUrl "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x122e }
            if (r2 == 0) goto L_0x122a
        L_0x1227:
            r2.disconnect()
        L_0x122a:
            r4.A00()
            return r3
        L_0x122e:
            r0 = move-exception
            r3 = r2
            goto L_0x1232
        L_0x1231:
            r0 = move-exception
        L_0x1232:
            if (r3 == 0) goto L_0x1237
            r3.disconnect()
        L_0x1237:
            r4.A00()
            throw r0
        L_0x123b:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            return r0
        L_0x1240:
            java.io.File r4 = r0.A02     // Catch:{ FileNotFoundException -> 0x126a, IOException -> 0x1262 }
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r4)     // Catch:{ FileNotFoundException -> 0x126a, IOException -> 0x1262 }
            byte[] r1 = r0.A04     // Catch:{ all -> 0x1258 }
            r2.write(r1)     // Catch:{ all -> 0x1258 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x126a, IOException -> 0x1262 }
            boolean r1 = r0.A03
            int r0 = r0.A00
            X.5tD r3 = new X.5tD
            r3.<init>(r4, r0, r1)
            return r3
        L_0x1258:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x125d }
            goto L_0x1261
        L_0x125d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x126a, IOException -> 0x1262 }
        L_0x1261:
            throw r1     // Catch:{ FileNotFoundException -> 0x126a, IOException -> 0x1262 }
        L_0x1262:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "cameraui/ Error accessing file: "
            goto L_0x1271
        L_0x126a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "cameraui/ File not found: "
        L_0x1271:
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        L_0x1279:
            r0 = 0
            return r0
        L_0x127b:
            boolean r1 = r0 instanceof X.AnonymousClass5MP
            if (r1 == 0) goto L_0x1381
            X.5MP r0 = (X.AnonymousClass5MP) r0
            java.lang.ref.WeakReference r1 = r0.A01
            java.lang.Object r7 = r1.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r7 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r7
            if (r7 != 0) goto L_0x129e
            java.lang.String r1 = "ProcessUpdatedContactsTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.LinkedHashMap r2 = r0.A04
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.A02
            android.util.Pair r0 = A05(r1, r0)
            return r0
        L_0x129e:
            java.util.concurrent.locks.Lock r1 = r0.A05
            r1.lock()
            java.util.Collection r2 = r0.A03     // Catch:{ all -> 0x181d }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x181d }
        L_0x12a9:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x1370
            X.141 r6 = X.C36391kE.A0f(r11)     // Catch:{ all -> 0x181d }
            r8 = 0
            r5 = 0
        L_0x12b5:
            java.util.ArrayList r4 = r0.A02     // Catch:{ all -> 0x181d }
            int r2 = r4.size()     // Catch:{ all -> 0x181d }
            if (r5 >= r2) goto L_0x1320
            java.lang.Object r9 = r4.get(r5)     // Catch:{ all -> 0x181d }
            X.6rO r9 = (X.C143956rO) r9     // Catch:{ all -> 0x181d }
            X.141 r15 = r9.A02     // Catch:{ all -> 0x181d }
            X.9Uj r3 = r9.A01     // Catch:{ all -> 0x181d }
            boolean r2 = r3.A0D     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x12d3
            X.141 r2 = r9.A02     // Catch:{ all -> 0x181d }
            boolean r2 = X.C1901797e.A00(r2, r6)     // Catch:{ all -> 0x181d }
            if (r2 != 0) goto L_0x12e2
        L_0x12d3:
            boolean r2 = r3.A0D     // Catch:{ all -> 0x181d }
            if (r2 != 0) goto L_0x12e0
            java.util.List r2 = r3.A0A     // Catch:{ all -> 0x181d }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x12e0
            goto L_0x12e2
        L_0x12e0:
            r2 = 0
            goto L_0x12e3
        L_0x12e2:
            r2 = 1
        L_0x12e3:
            if (r2 == 0) goto L_0x131d
            if (r15 == 0) goto L_0x12ee
            boolean r2 = r15.equals(r6)     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x12ee
            r15 = r6
        L_0x12ee:
            X.72P r13 = r9.A00     // Catch:{ all -> 0x181d }
            java.util.ArrayList r2 = r13.A03     // Catch:{ all -> 0x181d }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x181d }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x181d }
            X.5Nh r2 = (X.C107265Nh) r2     // Catch:{ all -> 0x181d }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x181d }
            java.lang.String r3 = r9.A03     // Catch:{ all -> 0x181d }
            X.9Uj r9 = r9.A01     // Catch:{ all -> 0x181d }
            java.util.ArrayList r2 = r2.A0C()     // Catch:{ all -> 0x181d }
            int r2 = r2.size()     // Catch:{ all -> 0x181d }
            X.9Uj r14 = r7.A0U(r9, r15, r3, r2)     // Catch:{ all -> 0x181d }
            r17 = 0
            r18 = -1
            X.6rO r12 = new X.6rO     // Catch:{ all -> 0x181d }
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x181d }
            r4.set(r5, r12)     // Catch:{ all -> 0x181d }
        L_0x131d:
            int r5 = r5 + 1
            goto L_0x12b5
        L_0x1320:
            java.util.LinkedHashMap r9 = r0.A04     // Catch:{ all -> 0x181d }
            java.util.Iterator r10 = X.C90484aE.A0s(r9)     // Catch:{ all -> 0x181d }
        L_0x1326:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x12a9
            java.lang.String r8 = X.AnonymousClass001.A0C(r10)     // Catch:{ all -> 0x181d }
            java.lang.Object r4 = r9.get(r8)     // Catch:{ all -> 0x181d }
            X.1hj r4 = (X.C34841hj) r4     // Catch:{ all -> 0x181d }
            boolean r2 = r4 instanceof X.C143946rN     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x1326
            X.6rN r4 = (X.C143946rN) r4     // Catch:{ all -> 0x181d }
            X.689 r3 = r4.A02     // Catch:{ all -> 0x181d }
            boolean r2 = r3.A0H     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x134a
            java.util.List r2 = r3.A0E     // Catch:{ all -> 0x181d }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x181d }
            if (r2 != 0) goto L_0x1359
        L_0x134a:
            boolean r2 = r3.A0H     // Catch:{ all -> 0x181d }
            if (r2 != 0) goto L_0x1357
            X.141 r2 = r3.A0A     // Catch:{ all -> 0x181d }
            boolean r2 = X.C1901797e.A00(r2, r6)     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x1357
            goto L_0x1359
        L_0x1357:
            r2 = 0
            goto L_0x135a
        L_0x1359:
            r2 = 1
        L_0x135a:
            if (r2 == 0) goto L_0x1326
            X.72P r5 = r4.A01     // Catch:{ all -> 0x181d }
            X.141 r4 = r4.A03     // Catch:{ all -> 0x181d }
            if (r4 == 0) goto L_0x1363
            r4 = r6
        L_0x1363:
            X.689 r3 = r7.A0S(r5, r4)     // Catch:{ all -> 0x181d }
            X.6rN r2 = new X.6rN     // Catch:{ all -> 0x181d }
            r2.<init>(r5, r3, r4)     // Catch:{ all -> 0x181d }
            r9.put(r8, r2)     // Catch:{ all -> 0x181d }
            goto L_0x1326
        L_0x1370:
            java.util.LinkedHashMap r3 = r0.A04     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x181d }
            r2.<init>(r3)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r0 = r0.A02     // Catch:{ all -> 0x181d }
            android.util.Pair r0 = A05(r2, r0)     // Catch:{ all -> 0x181d }
            r1.unlock()
            return r0
        L_0x1381:
            boolean r1 = r0 instanceof X.C106975Mb
            if (r1 == 0) goto L_0x14a5
            X.5Mb r0 = (X.C106975Mb) r0
            java.lang.ref.WeakReference r1 = r0.A05
            java.lang.Object r5 = r1.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r5 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r5
            if (r5 != 0) goto L_0x13a4
            java.lang.String r1 = "ProcessUpdatedCallLogTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.LinkedHashMap r2 = r0.A08
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.A06
            android.util.Pair r0 = A05(r1, r0)
            return r0
        L_0x13a4:
            java.util.concurrent.locks.Lock r8 = r0.A09
            r8.lock()
            java.util.LinkedHashMap r4 = r0.A08     // Catch:{ all -> 0x14a0 }
            r4.clear()     // Catch:{ all -> 0x14a0 }
            java.util.ArrayList r3 = r0.A06     // Catch:{ all -> 0x14a0 }
            r3.clear()     // Catch:{ all -> 0x14a0 }
            java.util.ArrayList r1 = r0.A07     // Catch:{ all -> 0x14a0 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x14a0 }
        L_0x13b9:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x14a0 }
            if (r1 == 0) goto L_0x13cc
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x14a0 }
            X.72P r1 = (X.AnonymousClass72P) r1     // Catch:{ all -> 0x14a0 }
            if (r1 != 0) goto L_0x13d7
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground original call group is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x14a0 }
        L_0x13cc:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x14a0 }
            r0.<init>(r4)     // Catch:{ all -> 0x14a0 }
            android.util.Pair r0 = A05(r0, r3)     // Catch:{ all -> 0x14a0 }
            goto L_0x149c
        L_0x13d7:
            java.lang.Object r13 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x1495 }
            X.72P r13 = (X.AnonymousClass72P) r13     // Catch:{ CloneNotSupportedException -> 0x1495 }
            java.util.ArrayList r6 = r13.A03     // Catch:{ all -> 0x14a0 }
            int r1 = r6.size()     // Catch:{ all -> 0x14a0 }
            if (r1 != 0) goto L_0x13eb
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground no call logs registered to group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x14a0 }
            goto L_0x13cc
        L_0x13eb:
            java.util.List r1 = java.util.Collections.unmodifiableList(r6)     // Catch:{ all -> 0x14a0 }
            java.lang.Object r7 = X.C36391kE.A0t(r1)     // Catch:{ all -> 0x14a0 }
            X.5Nh r7 = (X.C107265Nh) r7     // Catch:{ all -> 0x14a0 }
            if (r7 != 0) goto L_0x13fd
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground call log null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x14a0 }
            goto L_0x13cc
        L_0x13fd:
            boolean r1 = r6.isEmpty()     // Catch:{ all -> 0x14a0 }
            r2 = 0
            if (r1 != 0) goto L_0x140f
            java.lang.Object r1 = r6.get(r2)     // Catch:{ all -> 0x14a0 }
            X.5Nh r1 = (X.C107265Nh) r1     // Catch:{ all -> 0x14a0 }
            X.5Ng r1 = r1.A0F     // Catch:{ all -> 0x14a0 }
            if (r1 == 0) goto L_0x140f
            r2 = 1
        L_0x140f:
            if (r2 == 0) goto L_0x1434
            X.16D r6 = r0.A01     // Catch:{ all -> 0x14a0 }
            X.1C6 r2 = r0.A04     // Catch:{ all -> 0x14a0 }
            X.0xQ r1 = r0.A03     // Catch:{ all -> 0x14a0 }
            X.141 r15 = X.C65473Sf.A00(r6, r1, r2, r7)     // Catch:{ all -> 0x14a0 }
            X.1Jh r1 = r0.A02     // Catch:{ all -> 0x14a0 }
            java.lang.String r1 = r1.A03(r7)     // Catch:{ all -> 0x14a0 }
            X.9Uj r14 = r5.A0T(r13, r15, r1)     // Catch:{ all -> 0x14a0 }
            r17 = 0
            r18 = -1
            X.6rO r12 = new X.6rO     // Catch:{ all -> 0x14a0 }
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x14a0 }
            r3.add(r12)     // Catch:{ all -> 0x14a0 }
            goto L_0x13b9
        L_0x1434:
            X.661 r1 = r7.A0G     // Catch:{ all -> 0x14a0 }
            if (r1 == 0) goto L_0x1470
            com.whatsapp.jid.GroupJid r1 = r7.A0D     // Catch:{ all -> 0x14a0 }
            if (r1 == 0) goto L_0x1470
            X.661 r1 = r7.A0G     // Catch:{ all -> 0x14a0 }
            X.1Jh r6 = r0.A02     // Catch:{ all -> 0x14a0 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x14a0 }
            com.whatsapp.jid.GroupJid r1 = r7.A0D     // Catch:{ all -> 0x14a0 }
            X.3KV r10 = r6.A02(r1, r2)     // Catch:{ all -> 0x14a0 }
            if (r10 == 0) goto L_0x1470
            int r1 = r7.A07     // Catch:{ all -> 0x14a0 }
            r6 = 2
            if (r1 == r6) goto L_0x1450
            r6 = 3
        L_0x1450:
            long r1 = r13.A01()     // Catch:{ all -> 0x14a0 }
            X.681 r14 = r5.A0V(r10, r6, r1)     // Catch:{ all -> 0x14a0 }
            java.lang.String r9 = r13.A03()     // Catch:{ all -> 0x14a0 }
            long r6 = r10.A03     // Catch:{ all -> 0x14a0 }
            long r1 = r10.A02     // Catch:{ all -> 0x14a0 }
            X.11F r15 = r10.A04     // Catch:{ all -> 0x14a0 }
            X.6rM r12 = new X.6rM     // Catch:{ all -> 0x14a0 }
            r16 = r6
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r18)     // Catch:{ all -> 0x14a0 }
            r4.put(r9, r12)     // Catch:{ all -> 0x14a0 }
            goto L_0x13b9
        L_0x1470:
            int r2 = r7.A08     // Catch:{ all -> 0x14a0 }
            r1 = 2
            boolean r9 = X.AnonymousClass000.A1S(r2, r1)
            com.whatsapp.jid.GroupJid r7 = r7.A0D     // Catch:{ all -> 0x14a0 }
            X.16D r6 = r0.A01     // Catch:{ all -> 0x14a0 }
            X.1C6 r2 = r0.A04     // Catch:{ all -> 0x14a0 }
            X.0xQ r1 = r0.A03     // Catch:{ all -> 0x14a0 }
            X.141 r6 = X.AnonymousClass3UL.A01(r6, r1, r7, r2, r9)     // Catch:{ all -> 0x14a0 }
            X.689 r1 = r5.A0S(r13, r6)     // Catch:{ all -> 0x14a0 }
            X.6rN r2 = new X.6rN     // Catch:{ all -> 0x14a0 }
            r2.<init>(r13, r1, r6)     // Catch:{ all -> 0x14a0 }
            java.lang.String r1 = r13.A03()     // Catch:{ all -> 0x14a0 }
            r4.put(r1, r2)     // Catch:{ all -> 0x14a0 }
            goto L_0x13b9
        L_0x1495:
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground failed to clone call group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x14a0 }
            goto L_0x13cc
        L_0x149c:
            r8.unlock()
            return r0
        L_0x14a0:
            r2 = move-exception
            r8.unlock()
            throw r2
        L_0x14a5:
            boolean r1 = r0 instanceof X.C107165Mu
            if (r1 == 0) goto L_0x153c
            X.5Mu r0 = (X.C107165Mu) r0
            java.lang.ref.WeakReference r1 = r0.A02
            java.lang.Object r6 = r1.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r6 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r6
            if (r6 != 0) goto L_0x14c8
            java.lang.String r1 = "ProcessUpdatedOngoingJoinableCallTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.LinkedHashMap r2 = r0.A05
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.A03
            android.util.Pair r0 = A05(r1, r0)
            return r0
        L_0x14c8:
            java.util.concurrent.locks.Lock r3 = r0.A06
            r3.lock()
            r9 = 0
            java.util.ArrayList r5 = r0.A03     // Catch:{ all -> 0x1537 }
            java.util.Iterator r8 = r5.iterator()     // Catch:{ all -> 0x1537 }
        L_0x14d4:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x1537 }
            if (r1 == 0) goto L_0x1515
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x1537 }
            X.6rO r7 = (X.C143956rO) r7     // Catch:{ all -> 0x1537 }
            X.72P r1 = r7.A00     // Catch:{ all -> 0x1537 }
            java.util.ArrayList r1 = r1.A03     // Catch:{ all -> 0x1537 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x1537 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x1537 }
        L_0x14ec:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x1537 }
            if (r1 == 0) goto L_0x150c
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x1537 }
            X.5Nh r1 = (X.C107265Nh) r1     // Catch:{ all -> 0x1537 }
            X.6by r1 = r1.A04     // Catch:{ all -> 0x1537 }
            java.lang.String r2 = r1.A02     // Catch:{ all -> 0x1537 }
            X.5Nh r1 = r0.A01     // Catch:{ all -> 0x1537 }
            X.6by r1 = r1.A04     // Catch:{ all -> 0x1537 }
            java.lang.String r1 = r1.A02     // Catch:{ all -> 0x1537 }
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)     // Catch:{ all -> 0x1537 }
            if (r1 == 0) goto L_0x14ec
            X.6rO r9 = X.C107165Mu.A00(r6, r0)     // Catch:{ all -> 0x1537 }
        L_0x150c:
            java.util.ArrayList r1 = r0.A04     // Catch:{ all -> 0x1537 }
            if (r9 == 0) goto L_0x1511
            r7 = r9
        L_0x1511:
            r1.add(r7)     // Catch:{ all -> 0x1537 }
            goto L_0x14d4
        L_0x1515:
            if (r9 != 0) goto L_0x1520
            java.util.ArrayList r2 = r0.A04     // Catch:{ all -> 0x1537 }
            X.6rO r1 = X.C107165Mu.A00(r6, r0)     // Catch:{ all -> 0x1537 }
            r2.add(r1)     // Catch:{ all -> 0x1537 }
        L_0x1520:
            r5.clear()     // Catch:{ all -> 0x1537 }
            java.util.ArrayList r2 = r0.A04     // Catch:{ all -> 0x1537 }
            r5.addAll(r2)     // Catch:{ all -> 0x1537 }
            java.util.LinkedHashMap r1 = r0.A05     // Catch:{ all -> 0x1537 }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x1537 }
            r0.<init>(r1)     // Catch:{ all -> 0x1537 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r2)     // Catch:{ all -> 0x1537 }
            r3.unlock()
            return r0
        L_0x1537:
            r2 = move-exception
            r3.unlock()
            throw r2
        L_0x153c:
            boolean r1 = r0 instanceof X.AnonymousClass5MS
            if (r1 == 0) goto L_0x1615
            X.5MS r0 = (X.AnonymousClass5MS) r0
            java.lang.ref.WeakReference r1 = r0.A03
            java.lang.Object r7 = r1.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r7 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r7
            r3 = 0
            if (r7 != 0) goto L_0x1553
            java.lang.String r0 = "ProcessOnProfilePhotoChangedTask/doInBackground view model reference null"
        L_0x154f:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x1553:
            X.16D r2 = r0.A01
            X.11F r1 = r0.A02
            X.141 r6 = r2.A08(r1)
            if (r6 != 0) goto L_0x1560
            java.lang.String r0 = "ProcessOnProfilePhotoChangedTask/doInBackground failed to convert"
            goto L_0x154f
        L_0x1560:
            java.util.concurrent.locks.Lock r5 = r0.A06
            r5.lock()
            r3 = 0
        L_0x1566:
            java.util.ArrayList r4 = r0.A04     // Catch:{ all -> 0x1610 }
            int r1 = r4.size()     // Catch:{ all -> 0x1610 }
            if (r3 >= r1) goto L_0x15b7
            java.lang.Object r2 = r4.get(r3)     // Catch:{ all -> 0x1610 }
            X.6rO r2 = (X.C143956rO) r2     // Catch:{ all -> 0x1610 }
            X.141 r11 = r2.A02     // Catch:{ all -> 0x1610 }
            X.9Uj r8 = r2.A01     // Catch:{ all -> 0x1610 }
            boolean r1 = r8.A0D     // Catch:{ all -> 0x1610 }
            if (r1 == 0) goto L_0x1584
            X.141 r1 = r2.A02     // Catch:{ all -> 0x1610 }
            boolean r1 = X.C1901797e.A00(r1, r6)     // Catch:{ all -> 0x1610 }
            if (r1 != 0) goto L_0x1590
        L_0x1584:
            boolean r1 = r8.A0D     // Catch:{ all -> 0x1610 }
            if (r1 != 0) goto L_0x1592
            java.util.List r1 = r8.A0A     // Catch:{ all -> 0x1610 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x1610 }
            if (r1 == 0) goto L_0x1592
        L_0x1590:
            r1 = 1
            goto L_0x1593
        L_0x1592:
            r1 = 0
        L_0x1593:
            if (r1 == 0) goto L_0x15b4
            X.72P r9 = r2.A00     // Catch:{ all -> 0x1610 }
            java.lang.String r12 = r2.A03     // Catch:{ all -> 0x1610 }
            X.9Uj r1 = r2.A01     // Catch:{ all -> 0x1610 }
            X.9ef r2 = new X.9ef     // Catch:{ all -> 0x1610 }
            r2.<init>(r1)     // Catch:{ all -> 0x1610 }
            java.lang.String r1 = com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A02(r11)     // Catch:{ all -> 0x1610 }
            r2.A09 = r1     // Catch:{ all -> 0x1610 }
            X.9Uj r10 = r2.A00()     // Catch:{ all -> 0x1610 }
            r13 = 0
            r14 = -1
            X.6rO r8 = new X.6rO     // Catch:{ all -> 0x1610 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x1610 }
            r4.set(r3, r8)     // Catch:{ all -> 0x1610 }
        L_0x15b4:
            int r3 = r3 + 1
            goto L_0x1566
        L_0x15b7:
            java.util.LinkedHashMap r8 = r0.A05     // Catch:{ all -> 0x1610 }
            java.util.Iterator r10 = X.C90484aE.A0s(r8)     // Catch:{ all -> 0x1610 }
        L_0x15bd:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x1610 }
            if (r0 == 0) goto L_0x1603
            java.lang.String r9 = X.AnonymousClass001.A0C(r10)     // Catch:{ all -> 0x1610 }
            java.lang.Object r2 = r8.get(r9)     // Catch:{ all -> 0x1610 }
            X.1hj r2 = (X.C34841hj) r2     // Catch:{ all -> 0x1610 }
            boolean r0 = r2 instanceof X.C143946rN     // Catch:{ all -> 0x1610 }
            if (r0 == 0) goto L_0x15bd
            X.6rN r2 = (X.C143946rN) r2     // Catch:{ all -> 0x1610 }
            X.689 r1 = r2.A02     // Catch:{ all -> 0x1610 }
            boolean r0 = r1.A0H     // Catch:{ all -> 0x1610 }
            if (r0 == 0) goto L_0x15e1
            java.util.List r0 = r1.A0E     // Catch:{ all -> 0x1610 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x1610 }
            if (r0 != 0) goto L_0x15ed
        L_0x15e1:
            boolean r0 = r1.A0H     // Catch:{ all -> 0x1610 }
            if (r0 != 0) goto L_0x15ef
            X.141 r0 = r1.A0A     // Catch:{ all -> 0x1610 }
            boolean r0 = X.C1901797e.A00(r0, r6)     // Catch:{ all -> 0x1610 }
            if (r0 == 0) goto L_0x15ef
        L_0x15ed:
            r0 = 1
            goto L_0x15f0
        L_0x15ef:
            r0 = 0
        L_0x15f0:
            if (r0 == 0) goto L_0x15bd
            X.141 r3 = r2.A03     // Catch:{ all -> 0x1610 }
            X.72P r2 = r2.A01     // Catch:{ all -> 0x1610 }
            X.689 r1 = r7.A0S(r2, r3)     // Catch:{ all -> 0x1610 }
            X.6rN r0 = new X.6rN     // Catch:{ all -> 0x1610 }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x1610 }
            r8.put(r9, r0)     // Catch:{ all -> 0x1610 }
            goto L_0x15bd
        L_0x1603:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x1610 }
            r0.<init>(r8)     // Catch:{ all -> 0x1610 }
            android.util.Pair r3 = A05(r0, r4)     // Catch:{ all -> 0x1610 }
            r5.unlock()
            return r3
        L_0x1610:
            r2 = move-exception
            r5.unlock()
            throw r2
        L_0x1615:
            boolean r1 = r0 instanceof X.C106995Md
            if (r1 == 0) goto L_0x16f1
            X.5Md r0 = (X.C106995Md) r0
            java.lang.ref.WeakReference r1 = r0.A08
            java.lang.Object r9 = r1.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r9 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r9
            if (r9 != 0) goto L_0x1638
            java.lang.String r1 = "ProcessOnCallEndedCallLogTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.LinkedHashMap r2 = r0.A0A
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.A09
            android.util.Pair r0 = A05(r1, r0)
            return r0
        L_0x1638:
            java.util.concurrent.locks.Lock r1 = r0.A0B
            r1.lock()
            java.util.LinkedHashMap r6 = r0.A0A     // Catch:{ all -> 0x181d }
            int r2 = r6.size()     // Catch:{ all -> 0x181d }
            if (r2 <= 0) goto L_0x169e
            java.util.Iterator r2 = X.C90484aE.A0s(r6)     // Catch:{ all -> 0x181d }
            java.lang.String r8 = X.AnonymousClass001.A0C(r2)     // Catch:{ all -> 0x181d }
            java.lang.Object r7 = r6.get(r8)     // Catch:{ all -> 0x181d }
            X.1hj r7 = (X.C34841hj) r7     // Catch:{ all -> 0x181d }
            boolean r2 = r7 instanceof X.C143946rN     // Catch:{ all -> 0x181d }
            if (r2 == 0) goto L_0x169e
            X.6rN r7 = (X.C143946rN) r7     // Catch:{ all -> 0x181d }
            X.72P r5 = r7.A01     // Catch:{ all -> 0x181d }
            X.5Nh r4 = r0.A07     // Catch:{ all -> 0x181d }
            r2 = 0
            boolean r2 = r5.A09(r4, r2)     // Catch:{ all -> 0x181d }
            r3 = 1
            if (r2 == 0) goto L_0x166b
            java.util.ArrayList r2 = r5.A03     // Catch:{ all -> 0x181d }
            r2.add(r4)     // Catch:{ all -> 0x181d }
            goto L_0x166c
        L_0x166b:
            r3 = 0
        L_0x166c:
            if (r3 == 0) goto L_0x169e
            X.141 r3 = r7.A03     // Catch:{ all -> 0x181d }
            X.689 r2 = r9.A0S(r5, r3)     // Catch:{ all -> 0x181d }
            X.6rN r4 = new X.6rN     // Catch:{ all -> 0x181d }
            r4.<init>(r5, r2, r3)     // Catch:{ all -> 0x181d }
            r6.remove(r8)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()     // Catch:{ all -> 0x181d }
            X.72P r2 = r4.A01     // Catch:{ all -> 0x181d }
            java.lang.String r2 = r2.A03()     // Catch:{ all -> 0x181d }
            r3.put(r2, r4)     // Catch:{ all -> 0x181d }
            r3.putAll(r6)     // Catch:{ all -> 0x181d }
            r6.clear()     // Catch:{ all -> 0x181d }
            r6.putAll(r3)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x181d }
            r2.<init>(r6)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r0 = r0.A09     // Catch:{ all -> 0x181d }
            android.util.Pair r0 = A05(r2, r0)     // Catch:{ all -> 0x181d }
            goto L_0x16ed
        L_0x169e:
            X.0wo r5 = r0.A03     // Catch:{ all -> 0x181d }
            X.0yC r3 = r0.A04     // Catch:{ all -> 0x181d }
            X.16D r8 = r0.A01     // Catch:{ all -> 0x181d }
            X.171 r2 = r0.A02     // Catch:{ all -> 0x181d }
            X.5Nh r4 = r0.A07     // Catch:{ all -> 0x181d }
            X.72P r7 = new X.72P     // Catch:{ all -> 0x181d }
            r7.<init>(r8, r2, r5, r3)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r2 = r7.A03     // Catch:{ all -> 0x181d }
            r2.add(r4)     // Catch:{ all -> 0x181d }
            int r3 = r4.A08     // Catch:{ all -> 0x181d }
            r2 = 2
            boolean r5 = X.AnonymousClass000.A1S(r3, r2)
            com.whatsapp.jid.GroupJid r4 = r4.A0D     // Catch:{ all -> 0x181d }
            X.1C6 r3 = r0.A06     // Catch:{ all -> 0x181d }
            X.0xQ r2 = r0.A05     // Catch:{ all -> 0x181d }
            X.141 r3 = X.AnonymousClass3UL.A01(r8, r2, r4, r3, r5)     // Catch:{ all -> 0x181d }
            X.689 r2 = r9.A0S(r7, r3)     // Catch:{ all -> 0x181d }
            X.6rN r4 = new X.6rN     // Catch:{ all -> 0x181d }
            r4.<init>(r7, r2, r3)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()     // Catch:{ all -> 0x181d }
            X.72P r2 = r4.A01     // Catch:{ all -> 0x181d }
            java.lang.String r2 = r2.A03()     // Catch:{ all -> 0x181d }
            r3.put(r2, r4)     // Catch:{ all -> 0x181d }
            r3.putAll(r6)     // Catch:{ all -> 0x181d }
            r6.clear()     // Catch:{ all -> 0x181d }
            r6.putAll(r3)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x181d }
            r2.<init>(r6)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r0 = r0.A09     // Catch:{ all -> 0x181d }
            android.util.Pair r0 = A05(r2, r0)     // Catch:{ all -> 0x181d }
        L_0x16ed:
            r1.unlock()
            return r0
        L_0x16f1:
            boolean r1 = r0 instanceof X.C106965Ma
            if (r1 == 0) goto L_0x1822
            X.5Ma r0 = (X.C106965Ma) r0
            java.lang.ref.WeakReference r1 = r0.A05
            java.lang.Object r2 = r1.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r2 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r2
            if (r2 != 0) goto L_0x1714
            java.lang.String r1 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.LinkedHashMap r2 = r0.A08
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.A07
            android.util.Pair r0 = A05(r1, r0)
            return r0
        L_0x1714:
            java.util.concurrent.locks.Lock r1 = r0.A09
            r1.lock()
            java.util.ArrayList r3 = r0.A06     // Catch:{ all -> 0x181d }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x181d }
        L_0x171f:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x181d }
            if (r3 == 0) goto L_0x180c
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x181d }
            X.72P r10 = (X.AnonymousClass72P) r10     // Catch:{ all -> 0x181d }
            java.util.ArrayList r7 = r10.A03     // Catch:{ all -> 0x181d }
            java.util.List r3 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x181d }
            int r3 = r3.size()     // Catch:{ all -> 0x181d }
            if (r3 != 0) goto L_0x174b
            java.lang.String r2 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground no call logs registered to group"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r3 = r0.A08     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x181d }
            r2.<init>(r3)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r0 = r0.A07     // Catch:{ all -> 0x181d }
            android.util.Pair r0 = A05(r2, r0)     // Catch:{ all -> 0x181d }
            goto L_0x1819
        L_0x174b:
            java.util.List r3 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x181d }
            r5 = 0
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x181d }
            if (r3 != 0) goto L_0x176a
            java.lang.String r2 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground call log null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r3 = r0.A08     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x181d }
            r2.<init>(r3)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r0 = r0.A07     // Catch:{ all -> 0x181d }
            android.util.Pair r0 = A05(r2, r0)     // Catch:{ all -> 0x181d }
            goto L_0x1819
        L_0x176a:
            java.util.List r3 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x181d }
            java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x181d }
            X.5Nh r6 = (X.C107265Nh) r6     // Catch:{ all -> 0x181d }
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x181d }
            r4 = 0
            if (r3 != 0) goto L_0x1786
            java.lang.Object r3 = r7.get(r5)     // Catch:{ all -> 0x181d }
            X.5Nh r3 = (X.C107265Nh) r3     // Catch:{ all -> 0x181d }
            X.5Ng r3 = r3.A0F     // Catch:{ all -> 0x181d }
            if (r3 == 0) goto L_0x1786
            r4 = 1
        L_0x1786:
            if (r4 == 0) goto L_0x17aa
            X.16D r5 = r0.A01     // Catch:{ all -> 0x181d }
            X.1C6 r4 = r0.A04     // Catch:{ all -> 0x181d }
            X.0xQ r3 = r0.A03     // Catch:{ all -> 0x181d }
            X.141 r12 = X.C65473Sf.A00(r5, r3, r4, r6)     // Catch:{ all -> 0x181d }
            X.1Jh r3 = r0.A02     // Catch:{ all -> 0x181d }
            java.lang.String r13 = r3.A03(r6)     // Catch:{ all -> 0x181d }
            X.9Uj r11 = r2.A0T(r10, r12, r13)     // Catch:{ all -> 0x181d }
            r14 = 0
            r15 = -1
            X.6rO r9 = new X.6rO     // Catch:{ all -> 0x181d }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r3 = r0.A07     // Catch:{ all -> 0x181d }
            r3.add(r9)     // Catch:{ all -> 0x181d }
            goto L_0x171f
        L_0x17aa:
            X.661 r3 = r6.A0G     // Catch:{ all -> 0x181d }
            if (r3 == 0) goto L_0x17e5
            com.whatsapp.jid.GroupJid r3 = r6.A0D     // Catch:{ all -> 0x181d }
            if (r3 == 0) goto L_0x17e5
            X.661 r3 = r6.A0G     // Catch:{ all -> 0x181d }
            X.1Jh r5 = r0.A02     // Catch:{ all -> 0x181d }
            java.lang.String r4 = r3.A00     // Catch:{ all -> 0x181d }
            com.whatsapp.jid.GroupJid r3 = r6.A0D     // Catch:{ all -> 0x181d }
            X.3KV r7 = r5.A02(r3, r4)     // Catch:{ all -> 0x181d }
            if (r7 == 0) goto L_0x17e5
            int r3 = r6.A07     // Catch:{ all -> 0x181d }
            r5 = 2
            if (r3 == r5) goto L_0x17c6
            r5 = 3
        L_0x17c6:
            long r3 = r10.A01()     // Catch:{ all -> 0x181d }
            X.681 r11 = r2.A0V(r7, r5, r3)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r6 = r0.A08     // Catch:{ all -> 0x181d }
            java.lang.String r5 = r10.A03()     // Catch:{ all -> 0x181d }
            long r13 = r7.A03     // Catch:{ all -> 0x181d }
            long r3 = r7.A02     // Catch:{ all -> 0x181d }
            X.11F r12 = r7.A04     // Catch:{ all -> 0x181d }
            X.6rM r9 = new X.6rM     // Catch:{ all -> 0x181d }
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x181d }
            r6.put(r5, r9)     // Catch:{ all -> 0x181d }
            goto L_0x171f
        L_0x17e5:
            int r4 = r6.A08     // Catch:{ all -> 0x181d }
            r3 = 2
            boolean r7 = X.AnonymousClass000.A1S(r4, r3)
            com.whatsapp.jid.GroupJid r6 = r6.A0D     // Catch:{ all -> 0x181d }
            X.16D r5 = r0.A01     // Catch:{ all -> 0x181d }
            X.1C6 r4 = r0.A04     // Catch:{ all -> 0x181d }
            X.0xQ r3 = r0.A03     // Catch:{ all -> 0x181d }
            X.141 r4 = X.AnonymousClass3UL.A01(r5, r3, r6, r4, r7)     // Catch:{ all -> 0x181d }
            X.689 r3 = r2.A0S(r10, r4)     // Catch:{ all -> 0x181d }
            X.6rN r5 = new X.6rN     // Catch:{ all -> 0x181d }
            r5.<init>(r10, r3, r4)     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r4 = r0.A08     // Catch:{ all -> 0x181d }
            java.lang.String r3 = r10.A03()     // Catch:{ all -> 0x181d }
            r4.put(r3, r5)     // Catch:{ all -> 0x181d }
            goto L_0x171f
        L_0x180c:
            java.util.LinkedHashMap r3 = r0.A08     // Catch:{ all -> 0x181d }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x181d }
            r2.<init>(r3)     // Catch:{ all -> 0x181d }
            java.util.ArrayList r0 = r0.A07     // Catch:{ all -> 0x181d }
            android.util.Pair r0 = A05(r2, r0)     // Catch:{ all -> 0x181d }
        L_0x1819:
            r1.unlock()
            return r0
        L_0x181d:
            r2 = move-exception
            r1.unlock()
            throw r2
        L_0x1822:
            boolean r1 = r0 instanceof X.C107015Mf
            if (r1 == 0) goto L_0x1925
            X.5Mf r0 = (X.C107015Mf) r0
            X.1hN r2 = r0.A00
            X.1hO r9 = r2.A0C
            java.lang.String r1 = "JoinableCallsMigrationManager/handleJoinableCallsDbMigration "
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1Pa r8 = r9.A00
            java.util.ArrayList r3 = r8.A03()
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x1893
            java.lang.String r1 = "JoinableCallsMigrationManager/migrateJoinableCallsFromSharedPrefsToDb "
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.Iterator r10 = r3.iterator()
        L_0x1846:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x1893
            java.lang.String r7 = X.AnonymousClass001.A0C(r10)
            android.content.SharedPreferences r4 = X.C27631Pa.A00(r8)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "joinable_"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r7, r3)
            long r3 = X.C36371kC.A08(r4, r1)
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x188f
            X.1HJ r6 = r9.A01
            X.5Nh r5 = r6.A06(r3)
            if (r5 == 0) goto L_0x188f
            X.5Ng r1 = r5.A0F
            if (r1 == 0) goto L_0x188f
            java.lang.String r13 = X.C34681hT.A09(r7)
            long r14 = r5.A02()
            boolean r4 = r5.A0K
            com.whatsapp.jid.GroupJid r3 = r5.A0D
            X.5Ng r1 = new X.5Ng
            r16 = r4
            r11 = r1
            r12 = r3
            r11.<init>(r12, r13, r14, r16)
            r5.A0L(r1)
            r6.A09(r5)
        L_0x188f:
            r8.A06(r7)
            goto L_0x1846
        L_0x1893:
            r8 = 1
            X.5at r7 = new X.5at
            r7.<init>(r0, r8)
            X.1HJ r6 = r2.A0I
            r5 = 0
            r4 = 100
            java.util.ArrayList r10 = r6.A08(r7, r5, r4)
            X.4c6 r1 = r0.A02
            r21 = r1
            boolean r1 = r21.isCancelled()
            r11 = 0
            if (r1 != 0) goto L_0x1924
            java.lang.String r1 = "CallsHistoryDataSource/RefreshCallsHistoryItemsTask/doInBackground"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1aM r1 = r2.A0B     // Catch:{ UnsatisfiedLinkError -> 0x18b9 }
            X.6by r3 = X.C34681hT.A04(r1)     // Catch:{ UnsatisfiedLinkError -> 0x18b9 }
            goto L_0x18be
        L_0x18b9:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            r3 = r11
        L_0x18be:
            X.0yC r1 = r2.A0L
            r17 = r1
            X.16D r1 = r2.A0D
            r16 = r1
            X.0xQ r15 = r2.A0M
            X.1C6 r14 = r2.A0R
            X.0wo r13 = r2.A0H
            X.171 r12 = r2.A0G
            X.0wQ r11 = r2.A0A
            X.6TP r1 = new X.6TP
            r18 = r17
            r19 = r15
            r20 = r14
            r15 = r16
            r16 = r12
            r17 = r13
            r12 = r1
            r13 = r11
            r14 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r2.A06 = r1
            r1.A02(r3, r10)
            X.6TP r1 = r2.A06
            java.util.List r1 = r1.A08
            monitor-enter(r1)
            java.util.ArrayList r11 = X.C36441kJ.A15(r1)     // Catch:{ all -> 0x1921 }
            monitor-exit(r1)     // Catch:{ all -> 0x1921 }
            int r1 = r10.size()
            if (r1 < r4) goto L_0x1924
            java.util.List[] r1 = new java.util.List[r8]
            r1[r5] = r11
            r0.A0F(r1)
            int r0 = r2.A01
            java.util.ArrayList r1 = r6.A08(r7, r4, r0)
            boolean r0 = r21.isCancelled()
            if (r0 == 0) goto L_0x190e
            r11 = 0
            return r11
        L_0x190e:
            X.6TP r0 = r2.A06
            r0.A02(r3, r1)
            X.6TP r0 = r2.A06
            java.util.List r0 = r0.A08
            monitor-enter(r0)
            java.util.ArrayList r11 = X.C36441kJ.A15(r0)     // Catch:{ all -> 0x191e }
            monitor-exit(r0)     // Catch:{ all -> 0x191e }
            return r11
        L_0x191e:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x191e }
            throw r2
        L_0x1921:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1921 }
            throw r2
        L_0x1924:
            return r11
        L_0x1925:
            boolean r1 = r0 instanceof X.C106895Lt
            if (r1 == 0) goto L_0x19ba
            X.5Lt r0 = (X.C106895Lt) r0
            X.1hN r1 = r0.A00
            X.6TP r2 = r1.A06
            if (r2 != 0) goto L_0x1948
            X.0yC r8 = r1.A0L
            X.16D r5 = r1.A0D
            X.0xQ r9 = r1.A0M
            X.1hO r4 = r1.A0C
            X.1C6 r10 = r1.A0R
            X.0wo r7 = r1.A0H
            X.171 r6 = r1.A0G
            X.0wQ r3 = r1.A0A
            X.6TP r2 = new X.6TP
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.A06 = r2
        L_0x1948:
            r2 = 0
            X.5at r5 = new X.5at
            r5.<init>(r0, r2)
            X.1HJ r4 = r1.A0I
            int r3 = r1.A01
            int r2 = r1.A00
            int r2 = r2 + r3
            java.util.ArrayList r6 = r4.A08(r5, r3, r2)
            boolean r2 = X.C36431kI.A1Y(r0)
            r3 = 0
            if (r2 != 0) goto L_0x19b9
            X.17Y r5 = r1.A09
            r4 = 46
            X.74h r2 = new X.74h
            r2.<init>(r0, r6, r4)
            r5.A0H(r2)
            java.lang.String r0 = "CallsHistoryDataSource/LoadAdditionalCallLogRecordsTask/doInBackground"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1aM r0 = r1.A0B     // Catch:{ UnsatisfiedLinkError -> 0x1978 }
            X.6by r3 = X.C34681hT.A04(r0)     // Catch:{ UnsatisfiedLinkError -> 0x1978 }
            goto L_0x197c
        L_0x1978:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x197c:
            X.6TP r0 = r1.A06
            java.util.List r0 = r0.A08
            int r2 = r0.size()
            X.6TP r0 = r1.A06
            r0.A02(r3, r6)
            X.6TP r0 = r1.A06
            java.util.List r0 = r0.A08
            monitor-enter(r0)
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)     // Catch:{ all -> 0x19ad }
            monitor-exit(r0)     // Catch:{ all -> 0x19ad }
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x19a8
            int r0 = r1.size()
            if (r0 == r2) goto L_0x19a8
            int r0 = r1.size()
            java.util.List r3 = r1.subList(r2, r0)
            return r3
        L_0x19a8:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            return r3
        L_0x19ad:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x19ad }
            throw r2
        L_0x19b0:
            java.lang.String r0 = "android.intent.extra.STREAM"
            r6.putExtra(r0, r5)
            android.content.Intent r3 = android.content.Intent.createChooser(r6, r3)
        L_0x19b9:
            return r3
        L_0x19ba:
            boolean r1 = r0 instanceof X.C107055Mj
            if (r1 == 0) goto L_0x19dd
            android.graphics.Bitmap[] r5 = (android.graphics.Bitmap[]) r5
            int r4 = r5.length
            r3 = 0
            boolean r2 = X.AnonymousClass000.A1O(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "OnCameraClosedBlurTask requires only 1 bitmap but received "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " bitmaps"
            X.C90464aC.A1N(r0, r1, r2)
            r0 = r5[r3]
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r0)
            return r0
        L_0x19dd:
            boolean r1 = r0 instanceof X.C106885Ls
            if (r1 == 0) goto L_0x1acc
            X.5Ls r0 = (X.C106885Ls) r0
            X.6EE[][] r5 = (X.AnonymousClass6EE[][]) r5
            r1 = 0
            r9 = r5[r1]
            int r8 = r9.length
            r7 = 0
            r12 = 0
        L_0x19eb:
            if (r7 >= r8) goto L_0x1ac7
            r11 = r9[r7]
            boolean r1 = X.C36431kI.A1Y(r0)
            if (r1 != 0) goto L_0x1ac7
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r0.A00
            X.5wA r6 = r2.A0R
            com.whatsapp.jid.UserJid r5 = r11.A08
            r1 = 0
            X.AnonymousClass00C.A0D(r5, r1)
            X.00T r4 = r6.A03
            java.lang.Object r1 = X.C36381kD.A0p(r4)
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x1a3e
            X.5Fb r2 = r2.A0Q
            boolean r1 = r11.A0J
            if (r1 == 0) goto L_0x1a7c
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r2.A0B
            X.5xS r3 = r1.getLastCachedFrame()
            if (r3 != 0) goto L_0x1a5a
            java.lang.String r1 = "voip/CallDatasource/getSelfLastFrameBitmap no cached frame"
        L_0x1a1d:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r3 = 0
        L_0x1a21:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r3)
            java.lang.Object r1 = X.C36381kD.A0p(r4)
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L_0x1a41
            r2 = 0
        L_0x1a31:
            if (r3 == 0) goto L_0x1a36
            r1 = 1
            if (r2 != 0) goto L_0x1a37
        L_0x1a36:
            r1 = 0
        L_0x1a37:
            if (r1 != 0) goto L_0x1a3d
            r1 = r12
            r12 = 0
            if (r1 == 0) goto L_0x1a3e
        L_0x1a3d:
            r12 = 1
        L_0x1a3e:
            int r7 = r7 + 1
            goto L_0x19eb
        L_0x1a41:
            if (r3 == 0) goto L_0x1a4f
            java.util.Map r1 = r6.A01
            r1.put(r5, r3)
            java.util.Set r1 = r6.A02
            r1.remove(r5)
        L_0x1a4d:
            r2 = 1
            goto L_0x1a31
        L_0x1a4f:
            java.util.Set r1 = r6.A02
            r1.add(r5)
            java.util.Map r1 = r6.A01
            r1.remove(r5)
            goto L_0x1a4d
        L_0x1a5a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "voip/CallDatasource/getSelfLastFrameBitmap start. size: "
            r2.append(r1)
            int r1 = r3.A03
            X.C90494aF.A1L(r2, r1)
            int r1 = r3.A01
            r2.append(r1)
            java.lang.String r1 = " format = "
            r2.append(r1)
            int r1 = r3.A00
            X.C36321k7.A1Y(r2, r1)
            android.graphics.Bitmap r3 = X.C105545Fb.A01(r3)
            goto L_0x1a21
        L_0x1a7c:
            int r2 = r11.A07
            if (r2 == 0) goto L_0x1ac3
            int r1 = r11.A04
            if (r1 == 0) goto L_0x1ac3
            r3 = 0
            android.graphics.Bitmap r10 = X.C90524aI.A09(r2, r1)     // Catch:{ OutOfMemoryError -> 0x1abb }
            if (r10 == 0) goto L_0x1aa8
            boolean r1 = com.whatsapp.voipcalling.Voip.dumpLastVideoFrame(r5, r10)
            if (r1 == 0) goto L_0x1aa8
            android.graphics.Matrix r2 = X.C90524aI.A0B()
            int r1 = r11.A05
            int r1 = r1 * 90
            int r1 = -r1
            float r1 = (float) r1
            r2.preRotate(r1)
            android.graphics.Bitmap r1 = X.C90484aE.A0L(r10, r2)     // Catch:{ OutOfMemoryError -> 0x1ab0 }
            if (r1 == r10) goto L_0x1aa5
            r3 = r10
        L_0x1aa5:
            r10 = r3
            r3 = r1
            goto L_0x1aad
        L_0x1aa8:
            java.lang.String r1 = "voip/CallDatasource/getPeerLastFrameBitmap dumpLastVideoFrame failed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x1aad:
            if (r10 == 0) goto L_0x1a21
            goto L_0x1ab6
        L_0x1ab0:
            r2 = move-exception
            java.lang.String r1 = "voip/CallDatasource/getPeerLastFrameBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r1, r2)
        L_0x1ab6:
            r10.recycle()
            goto L_0x1a21
        L_0x1abb:
            r2 = move-exception
            java.lang.String r1 = "voip/CallDatasource/getPeerLastFrameBitmap OOM when creating raw bitmap"
            com.whatsapp.util.Log.i(r1, r2)
            goto L_0x1a21
        L_0x1ac3:
            java.lang.String r1 = "voip/CallDatasource/getLastFrameBitmap cancelled due to bad participant info or video size"
            goto L_0x1a1d
        L_0x1ac7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        L_0x1acc:
            boolean r1 = r0 instanceof X.AnonymousClass5MW
            if (r1 == 0) goto L_0x1c2e
            X.5MW r0 = (X.AnonymousClass5MW) r0
            java.lang.String r3 = "BloksStorePictureTask/ Error closing file: "
            java.lang.String r1 = "BloksStorePictureTask/doInBackground start"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0pu r1 = r0.A02
            java.lang.Object r1 = r1.get()
            r14 = 0
            if (r1 == 0) goto L_0x1c2d
            java.io.File r12 = r0.A04     // Catch:{ FileNotFoundException -> 0x1be7, IOException -> 0x1bc4, all -> 0x1bc2 }
            java.io.FileOutputStream r4 = X.C90524aI.A0W(r12)     // Catch:{ FileNotFoundException -> 0x1be7, IOException -> 0x1bc4, all -> 0x1bc2 }
            byte[] r7 = r0.A08     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r4.write(r7)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r4.close()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            boolean r1 = X.C203859oz.A0P     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            java.lang.String r2 = r12.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            X.9oz r1 = new X.9oz     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r1.<init>((java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r6 = 0
            int r2 = r1.A0Y(r6)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r1 = 3
            if (r2 == r1) goto L_0x1b11
            r1 = 6
            if (r2 == r1) goto L_0x1b0e
            r1 = 8
            r5 = 270(0x10e, float:3.78E-43)
            if (r2 == r1) goto L_0x1b13
            r5 = 0
            goto L_0x1b13
        L_0x1b0e:
            r5 = 90
            goto L_0x1b13
        L_0x1b11:
            r5 = 180(0xb4, float:2.52E-43)
        L_0x1b13:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r1)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            android.graphics.Matrix r2 = X.C90524aI.A0B()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            float r1 = (float) r5     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r2.postRotate(r1)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            android.graphics.Bitmap r10 = X.C90484aE.A0L(r11, r2)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            boolean r1 = r0.A07     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            if (r1 == 0) goto L_0x1b84
            android.graphics.Matrix r9 = X.C90524aI.A0B()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r10.getWidth()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r1 / 2
            float r8 = (float) r1     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r10.getHeight()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r1 / 2
            float r5 = (float) r1     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.postScale(r2, r1, r8, r5)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            android.graphics.Bitmap r9 = X.C90484aE.A0L(r10, r9)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
        L_0x1b48:
            int r2 = r0.A01     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r0.A00     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r9, r2, r1, r6)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            java.lang.ref.WeakReference r1 = r0.A06     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            java.lang.Object r13 = r1.get()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            com.whatsapp.bloks.BloksCameraOverlay r13 = (com.whatsapp.bloks.BloksCameraOverlay) r13     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r6 = r13.A03     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r13.A02     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r6 = r6 - r1
            int r5 = r13.A00     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r13.A04     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r5 = r5 - r1
            r8.getWidth()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r8.getHeight()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r2 = r13.A02     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            int r1 = r13.A04     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r8, r2, r1, r6, r5)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r8.recycle()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r9.recycle()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r8.recycle()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            r11.recycle()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            java.io.FileOutputStream r4 = X.C90524aI.A0W(r12)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe }
            goto L_0x1b86
        L_0x1b84:
            r9 = r10
            goto L_0x1b48
        L_0x1b86:
            java.io.ByteArrayOutputStream r5 = X.C90524aI.A0Q()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            java.lang.String r0 = r0.A05     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            java.lang.String r1 = X.C90514aH.A0y(r0)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            if (r0 != 0) goto L_0x1ba2
            java.lang.String r0 = ".jpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            if (r0 == 0) goto L_0x1ba4
        L_0x1ba2:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
        L_0x1ba4:
            r0 = 75
            r6.compress(r2, r0, r5)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            byte[] r0 = r5.toByteArray()     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            r4.write(r0)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            r4.write(r7)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            java.lang.String r0 = "BloksStorePictureTask/doInBackground end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x1bc0, IOException -> 0x1bbe, all -> 0x1bbc }
            r4.close()     // Catch:{ IOException -> 0x1c21 }
            return r14
        L_0x1bbc:
            r2 = move-exception
            goto L_0x1c0d
        L_0x1bbe:
            r2 = move-exception
            goto L_0x1bc6
        L_0x1bc0:
            r2 = move-exception
            goto L_0x1be9
        L_0x1bc2:
            r2 = move-exception
            throw r2
        L_0x1bc4:
            r2 = move-exception
            r4 = r14
        L_0x1bc6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1c0a }
            java.lang.String r0 = "BloksStorePictureTask/ Error accessing file: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ all -> 0x1c0a }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x1c0a }
            if (r4 == 0) goto L_0x1c2d
            r4.close()     // Catch:{ IOException -> 0x1bd9 }
            goto L_0x1be6
        L_0x1bd9:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r3, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r14
        L_0x1be6:
            return r14
        L_0x1be7:
            r2 = move-exception
            r4 = r14
        L_0x1be9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1c0a }
            java.lang.String r0 = "BloksStorePictureTask/ File not found: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ all -> 0x1c0a }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x1c0a }
            if (r4 == 0) goto L_0x1c2d
            r4.close()     // Catch:{ IOException -> 0x1bfc }
            goto L_0x1c09
        L_0x1bfc:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r3, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r14
        L_0x1c09:
            return r14
        L_0x1c0a:
            r2 = move-exception
            if (r4 == 0) goto L_0x1c20
        L_0x1c0d:
            r4.close()     // Catch:{ IOException -> 0x1c11 }
            throw r2
        L_0x1c11:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r3, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            throw r2
        L_0x1c1e:
            r2 = move-exception
            monitor-exit(r0)
        L_0x1c20:
            throw r2
        L_0x1c21:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r3, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x1c2d:
            return r14
        L_0x1c2e:
            boolean r1 = r0 instanceof X.AnonymousClass5MD
            if (r1 == 0) goto L_0x1c62
            X.5MD r0 = (X.AnonymousClass5MD) r0
            X.0wG r1 = r0.A02
            java.io.File r2 = X.C90514aH.A0j(r1)
            java.lang.String r1 = X.AnonymousClass6KT.A03
            java.io.File r2 = X.C36441kJ.A0w(r2, r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x1c53
            boolean r1 = r2.mkdirs()
            if (r1 != 0) goto L_0x1c53
            java.lang.String r0 = "BloksImageManager/getBitmap/unable to get images directory"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x1c53:
            java.lang.String r0 = r0.A03
            java.io.File r0 = X.C36441kJ.A0w(r2, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            return r0
        L_0x1c62:
            boolean r1 = r0 instanceof X.AnonymousClass5M5
            if (r1 == 0) goto L_0x1c83
            X.5M5 r0 = (X.AnonymousClass5M5) r0
            java.lang.ref.WeakReference r1 = r0.A02
            android.view.View r1 = X.AnonymousClass000.A0Y(r1)
            if (r1 == 0) goto L_0x1c81
            X.1Ps r2 = r0.A00
            android.content.Context r3 = r1.getContext()
            X.141 r4 = r0.A01
            r6 = 640(0x280, float:8.97E-43)
            r5 = 0
            r7 = 1
            android.graphics.Bitmap r0 = r2.A07(r3, r4, r5, r6, r7)
            return r0
        L_0x1c81:
            r0 = 0
            return r0
        L_0x1c83:
            boolean r1 = r0 instanceof X.AnonymousClass5M4
            if (r1 == 0) goto L_0x1c92
            X.5M4 r0 = (X.AnonymousClass5M4) r0
            X.1KK r1 = r0.A02
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.9uZ r0 = r1.A07(r0)
            return r0
        L_0x1c92:
            boolean r1 = r0 instanceof X.AnonymousClass5MO
            if (r1 == 0) goto L_0x1cec
            X.5MO r0 = (X.AnonymousClass5MO) r0
            android.content.Context r1 = r0.A00
            boolean r1 = X.C34191gb.A08(r1)
            if (r1 == 0) goto L_0x1cea
            java.lang.String r1 = "deleteacctconfirm/delete-account-cleanup waiting for googleDriveService object to be received."
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0xD r6 = r0.A03
            long r2 = java.lang.System.currentTimeMillis()
            android.os.ConditionVariable r1 = r0.A02
            r4 = 60000(0xea60, double:2.9644E-319)
            boolean r1 = r1.block(r4)
            if (r1 == 0) goto L_0x1cd7
            long r1 = X.C36441kJ.A0A(r2)
            long r4 = r4 - r1
            java.lang.String r1 = "deleteacctconfirm/delete-account-cleanup waiting for Google Drive cleanup to finish."
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x1cd4
            android.os.ConditionVariable r1 = r0.A01
            boolean r1 = r1.block(r4)
            if (r1 == 0) goto L_0x1cd4
            java.lang.String r1 = "deleteacctconfirm/delete-account-cleanup Google Drive deletion is finished."
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x1cdc
        L_0x1cd4:
            java.lang.String r1 = "deleteacctconfirm/delete-account-cleanup Google Drive account deletion timed out."
            goto L_0x1cd9
        L_0x1cd7:
            java.lang.String r1 = "deleteacctconfirm/delete-account-cleanup unable to get Google Drive service object."
        L_0x1cd9:
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x1cdc:
            X.1eq r1 = r6.A03     // Catch:{ IllegalStateException -> 0x1ce4 }
            X.1eo r0 = r0.A04     // Catch:{ IllegalStateException -> 0x1ce4 }
            r1.A02(r0)     // Catch:{ IllegalStateException -> 0x1ce4 }
            goto L_0x1cea
        L_0x1ce4:
            r1 = move-exception
            java.lang.String r0 = "deleteacctconfirm/delete-account-cleanup"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x1cea:
            r0 = 0
            return r0
        L_0x1cec:
            boolean r1 = r0 instanceof X.C107005Me
            if (r1 == 0) goto L_0x1d36
            X.5Me r0 = (X.C107005Me) r0
            com.whatsapp.accountsync.ProfileActivity r3 = r0.A00
            X.0xQ r0 = r3.A06
            X.0xR r0 = r0.A0d
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x1d15
            r5 = 90000(0x15f90, double:4.4466E-319)
        L_0x1cff:
            r4 = 0
        L_0x1d00:
            X.0xQ r0 = r3.A06
            X.0xR r0 = r0.A0d
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x1d19
            long r1 = (long) r4
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x1d19
            int r4 = r4 + 200
            r0 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r0)
            goto L_0x1d00
        L_0x1d15:
            r5 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x1cff
        L_0x1d19:
            long r1 = (long) r4
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x1d34
            X.0xQ r0 = r3.A06
            X.0xR r0 = r0.A0d
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x1d34
            X.0xQ r0 = r3.A06
            X.0xR r0 = r0.A0d
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x1d34
            X.0xQ r1 = r3.A06
            r0 = 3
            r1.A0S(r0)
        L_0x1d34:
            r0 = 0
            return r0
        L_0x1d36:
            boolean r1 = r0 instanceof X.C106925Lw
            if (r1 == 0) goto L_0x1d78
            X.5Lw r0 = (X.C106925Lw) r0
            r1 = 2000(0x7d0, double:9.88E-321)
            android.os.SystemClock.sleep(r1)
            com.whatsapp.accountsync.LoginActivity r4 = r0.A01
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = "com.whatsapp"
            android.accounts.Account r3 = new android.accounts.Account
            r3.<init>(r1, r0)
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r4)
            r0 = 0
            boolean r0 = r1.addAccountExplicitly(r3, r0, r0)
            if (r0 == 0) goto L_0x1d76
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r3.name
            java.lang.String r0 = "authAccount"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.type
            java.lang.String r0 = "accountType"
            r2.putString(r0, r1)
            r4.A00 = r2
            r0 = 1
        L_0x1d71:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x1d76:
            r0 = 0
            goto L_0x1d71
        L_0x1d78:
            boolean r1 = r0 instanceof X.AnonymousClass5MI
            if (r1 == 0) goto L_0x1e17
            X.5MI r0 = (X.AnonymousClass5MI) r0
            java.lang.String r1 = r0.A04     // Catch:{ IOException -> 0x1e0f }
            java.net.URL r2 = X.C90524aI.A0j(r1)     // Catch:{ IOException -> 0x1e0f }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ IOException -> 0x1e0f }
            r1.connect()     // Catch:{ IOException -> 0x1e0f }
            java.io.InputStream r1 = r2.openStream()     // Catch:{ IOException -> 0x1e0f }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x1e0f }
            r5.<init>(r1)     // Catch:{ IOException -> 0x1e0f }
            X.0y0 r4 = r0.A01     // Catch:{ all -> 0x1e05 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1e05 }
            java.lang.String r1 = X.AnonymousClass1GW.A0K()     // Catch:{ all -> 0x1e05 }
            r2.append(r1)     // Catch:{ all -> 0x1e05 }
            java.lang.String r3 = r0.A03     // Catch:{ all -> 0x1e05 }
            java.lang.String r1 = "image/gif"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x1e05 }
            if (r1 != 0) goto L_0x1dc7
            java.lang.String r1 = "video/mp4"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x1e05 }
            if (r1 == 0) goto L_0x1df2
            java.lang.String r1 = ".mp4"
        L_0x1db5:
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ all -> 0x1e05 }
            java.io.File r6 = r4.A0X(r1)     // Catch:{ all -> 0x1e05 }
            java.lang.String r1 = r6.getAbsolutePath()     // Catch:{ all -> 0x1e05 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x1e05 }
            r4.<init>(r1)     // Catch:{ all -> 0x1e05 }
            goto L_0x1dca
        L_0x1dc7:
            java.lang.String r1 = ".gif"
            goto L_0x1db5
        L_0x1dca:
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x1de8 }
            int r2 = r5.read(r3)     // Catch:{ all -> 0x1de8 }
        L_0x1dd2:
            r1 = -1
            if (r2 == r1) goto L_0x1dde
            r1 = 0
            r4.write(r3, r1, r2)     // Catch:{ all -> 0x1de8 }
            int r2 = r5.read(r3)     // Catch:{ all -> 0x1de8 }
            goto L_0x1dd2
        L_0x1dde:
            r4.flush()     // Catch:{ all -> 0x1de8 }
            r4.close()     // Catch:{ all -> 0x1e05 }
            r5.close()     // Catch:{ IOException -> 0x1e0f }
            return r6
        L_0x1de8:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x1ded }
            goto L_0x1df1
        L_0x1ded:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x1e05 }
        L_0x1df1:
            throw r2     // Catch:{ all -> 0x1e05 }
        L_0x1df2:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x1e05 }
            java.lang.String r1 = "Unexpected info type ("
            r2.append(r1)     // Catch:{ all -> 0x1e05 }
            r2.append(r3)     // Catch:{ all -> 0x1e05 }
            java.lang.String r1 = ")"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0g(r1, r2)     // Catch:{ all -> 0x1e05 }
            throw r1     // Catch:{ all -> 0x1e05 }
        L_0x1e05:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x1e0a }
            goto L_0x1e0e
        L_0x1e0a:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x1e0f }
        L_0x1e0e:
            throw r2     // Catch:{ IOException -> 0x1e0f }
        L_0x1e0f:
            r1 = move-exception
            r0.A00 = r1
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            r6 = 0
            return r6
        L_0x1e17:
            X.5Mg r0 = (X.C107025Mg) r0
            android.net.Uri[] r5 = (android.net.Uri[]) r5
            r4 = 0
            X.AnonymousClass00C.A0D(r5, r4)
            int r2 = r5.length
            r3 = 0
            r1 = 1
            if (r2 == r1) goto L_0x1e2f
            java.lang.String r0 = "LoadMediaFileAsyncTask/doInBackground expected exactly 1 uri"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.011 r0 = new X.011
            r0.<init>(r3, r3)
            return r0
        L_0x1e2f:
            r2 = r5[r4]     // Catch:{ IOException -> 0x1e51 }
            if (r2 != 0) goto L_0x1e39
            X.011 r0 = new X.011     // Catch:{ IOException -> 0x1e51 }
            r0.<init>(r3, r3)     // Catch:{ IOException -> 0x1e51 }
            return r0
        L_0x1e39:
            X.1GX r0 = r0.A00     // Catch:{ IOException -> 0x1e51 }
            java.io.File r1 = r0.A0h(r2)     // Catch:{ IOException -> 0x1e51 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IOException -> 0x1e51 }
            X.0yb r0 = r0.A01     // Catch:{ IOException -> 0x1e51 }
            X.0ya r0 = r0.A0O()     // Catch:{ IOException -> 0x1e51 }
            java.lang.String r0 = X.AnonymousClass1GW.A0M(r2, r0)     // Catch:{ IOException -> 0x1e51 }
            X.011 r0 = X.C36441kJ.A19(r1, r0)     // Catch:{ IOException -> 0x1e51 }
            return r0
        L_0x1e51:
            r1 = move-exception
            java.lang.String r0 = "LoadMediaFileAsyncTask/doInBackground failed to get file from uri"
            com.whatsapp.util.Log.e(r0, r1)
            X.011 r0 = new X.011
            r0.<init>(r3, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132446Tt.A08(java.lang.Object[]):java.lang.Object");
    }

    public C132446Tt() {
        this.A02 = new C91494c6(this);
    }
}
